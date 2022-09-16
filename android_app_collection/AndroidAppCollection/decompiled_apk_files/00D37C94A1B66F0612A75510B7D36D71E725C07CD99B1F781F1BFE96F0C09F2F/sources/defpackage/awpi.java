package defpackage;
/* compiled from: PG */
/* renamed from: awpi  reason: default package */
/* loaded from: classes2.dex */
public final class awpi extends aopi implements aoqv {
    public static final awpi a;
    private static volatile aorb b;
    private aoqp c = aoqp.a;

    static {
        awpi awpiVar = new awpi();
        a = awpiVar;
        aopi.registerDefaultInstance(awpi.class, awpiVar);
    }

    private awpi() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"c", awph.a});
            case 3:
                return new awpi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awpi.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
