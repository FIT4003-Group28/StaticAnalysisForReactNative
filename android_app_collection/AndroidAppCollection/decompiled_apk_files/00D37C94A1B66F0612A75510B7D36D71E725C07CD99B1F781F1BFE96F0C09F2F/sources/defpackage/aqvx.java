package defpackage;
/* compiled from: PG */
/* renamed from: aqvx  reason: default package */
/* loaded from: classes2.dex */
public final class aqvx extends aopi implements aoqv {
    public static final aqvx a;
    private static volatile aorb d;
    public int b;
    public int c;

    static {
        aqvx aqvxVar = new aqvx();
        a = aqvxVar;
        aopi.registerDefaultInstance(aqvx.class, aqvxVar);
    }

    private aqvx() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c", aulk.q});
            case 3:
                return new aqvx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqvx.class) {
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
