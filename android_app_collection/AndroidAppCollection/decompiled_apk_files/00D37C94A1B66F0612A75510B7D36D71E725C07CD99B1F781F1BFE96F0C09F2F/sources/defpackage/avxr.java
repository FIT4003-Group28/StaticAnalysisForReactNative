package defpackage;
/* compiled from: PG */
/* renamed from: avxr  reason: default package */
/* loaded from: classes2.dex */
public final class avxr extends aopi implements aoqv {
    public static final avxr a;
    private static volatile aorb e;
    public int b;
    public aopu c = aopi.emptyProtobufList();
    public avxq d;

    static {
        avxr avxrVar = new avxr();
        a = avxrVar;
        aopi.registerDefaultInstance(avxr.class, avxrVar);
    }

    private avxr() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
            case 3:
                return new avxr();
            case 4:
                return new aopa((int[]) null, (byte[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avxr.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
