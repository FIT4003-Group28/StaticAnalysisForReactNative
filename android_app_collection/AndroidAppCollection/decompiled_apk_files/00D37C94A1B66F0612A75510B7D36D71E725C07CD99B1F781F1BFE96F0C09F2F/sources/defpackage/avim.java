package defpackage;
/* compiled from: PG */
/* renamed from: avim  reason: default package */
/* loaded from: classes2.dex */
public final class avim extends aopi implements aoqv {
    public static final avim a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        avim avimVar = new avim();
        a = avimVar;
        aopi.registerDefaultInstance(avim.class, avimVar);
    }

    private avim() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"b", avio.class});
            case 3:
                return new avim();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (avim.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
