package defpackage;
/* compiled from: PG */
/* renamed from: aqof  reason: default package */
/* loaded from: classes2.dex */
public final class aqof extends aopi implements aoqv {
    public static final aqof a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        aqof aqofVar = new aqof();
        a = aqofVar;
        aopi.registerDefaultInstance(aqof.class, aqofVar);
    }

    private aqof() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"c", "b"});
            case 3:
                return new aqof();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqof.class) {
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
