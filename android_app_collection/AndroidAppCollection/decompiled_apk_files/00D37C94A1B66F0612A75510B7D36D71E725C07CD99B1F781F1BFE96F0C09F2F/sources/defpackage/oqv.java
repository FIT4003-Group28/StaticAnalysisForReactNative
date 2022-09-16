package defpackage;
/* compiled from: PG */
/* renamed from: oqv  reason: default package */
/* loaded from: classes4.dex */
public final class oqv extends aopi implements aoqv {
    public static final oqv a;
    private static volatile aorb f;
    public aoob b = aoob.b;
    public aoob c = aoob.b;
    public aoob d = aoob.b;
    public int e;
    private int g;

    static {
        oqv oqvVar = new oqv();
        a = oqvVar;
        aopi.registerDefaultInstance(oqv.class, oqvVar);
    }

    private oqv() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဌ\u0003", new Object[]{"g", "b", "c", "d", "e", aqfh.a});
            case 3:
                return new oqv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (oqv.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
