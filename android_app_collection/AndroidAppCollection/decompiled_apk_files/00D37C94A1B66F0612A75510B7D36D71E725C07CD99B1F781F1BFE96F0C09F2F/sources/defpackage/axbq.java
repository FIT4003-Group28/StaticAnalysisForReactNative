package defpackage;
/* compiled from: PG */
/* renamed from: axbq */
/* loaded from: classes2.dex */
public final class axbq extends aopi implements aoqv {
    private static final axbq a;
    private static volatile aorb b;
    private int c;
    private awzm d;

    static {
        axbq axbqVar = new axbq();
        a = axbqVar;
        aopi.registerDefaultInstance(axbq.class, axbqVar);
    }

    private axbq() {
    }

    public static axbp a() {
        return (axbp) a.createBuilder();
    }

    public static /* synthetic */ axbq b() {
        return a;
    }

    public void d(awzm awzmVar) {
        awzmVar.getClass();
        this.d = awzmVar;
        this.c |= 1;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new axbq();
            case 4:
                return new axbp();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (axbq.class) {
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
