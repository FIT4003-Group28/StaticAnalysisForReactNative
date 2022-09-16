package defpackage;
/* compiled from: PG */
/* renamed from: aqrx  reason: default package */
/* loaded from: classes2.dex */
public final class aqrx extends aopi implements aoqv {
    public static final aqrx a;
    private static volatile aorb g;
    public int b;
    public double c;
    public double d;
    public double e;
    public double f;

    static {
        aqrx aqrxVar = new aqrx();
        a = aqrxVar;
        aopi.registerDefaultInstance(aqrx.class, aqrxVar);
    }

    private aqrx() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aqrx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqrx.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
