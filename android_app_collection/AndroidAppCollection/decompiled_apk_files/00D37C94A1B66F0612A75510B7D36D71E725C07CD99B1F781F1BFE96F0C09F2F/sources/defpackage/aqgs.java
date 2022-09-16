package defpackage;
/* compiled from: PG */
/* renamed from: aqgs  reason: default package */
/* loaded from: classes2.dex */
public final class aqgs extends aopi implements aoqv {
    public static final aqgs a;
    private static volatile aorb c;
    public int b;
    private int d;

    static {
        aqgs aqgsVar = new aqgs();
        a = aqgsVar;
        aopi.registerDefaultInstance(aqgs.class, aqgsVar);
    }

    private aqgs() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b", aqfh.e});
            case 3:
                return new aqgs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aqgs.class) {
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
