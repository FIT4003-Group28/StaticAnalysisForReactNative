package defpackage;
/* compiled from: PG */
/* renamed from: dva  reason: default package */
/* loaded from: classes3.dex */
public final class dva extends aopi implements aoqv {
    public static final dva a;
    private static volatile aorb e;
    public dvb b;
    public aoob c = aoob.b;
    public aoob d = aoob.b;
    private int f;

    static {
        dva dvaVar = new dva();
        a = dvaVar;
        aopi.registerDefaultInstance(dva.class, dvaVar);
    }

    private dva() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new dva();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (dva.class) {
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
