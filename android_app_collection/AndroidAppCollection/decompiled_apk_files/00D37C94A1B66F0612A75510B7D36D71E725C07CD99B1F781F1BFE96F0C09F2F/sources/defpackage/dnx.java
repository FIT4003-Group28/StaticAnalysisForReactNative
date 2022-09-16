package defpackage;
/* compiled from: PG */
/* renamed from: dnx  reason: default package */
/* loaded from: classes3.dex */
public final class dnx extends aopi implements aoqv {
    public static final dnx a;
    private static volatile aorb e;
    public int b;
    public aoob c = aoob.b;
    public aoob d = aoob.b;

    static {
        dnx dnxVar = new dnx();
        a = dnxVar;
        aopi.registerDefaultInstance(dnx.class, dnxVar);
    }

    private dnx() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new dnx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (dnx.class) {
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
