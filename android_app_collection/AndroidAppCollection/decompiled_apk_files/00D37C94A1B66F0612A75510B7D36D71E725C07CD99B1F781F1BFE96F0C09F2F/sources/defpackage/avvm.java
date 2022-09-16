package defpackage;
/* compiled from: PG */
/* renamed from: avvm  reason: default package */
/* loaded from: classes2.dex */
public final class avvm extends aopi implements aoqv {
    public static final avvm a;
    private static volatile aorb d;
    public aopu b = emptyProtobufList();
    public String c = "";
    private int e;

    static {
        avvm avvmVar = new avvm();
        a = avvmVar;
        aopi.registerDefaultInstance(avvm.class, avvmVar);
    }

    private avvm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"e", "b", avvn.class, "c"});
            case 3:
                return new avvm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avvm.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
