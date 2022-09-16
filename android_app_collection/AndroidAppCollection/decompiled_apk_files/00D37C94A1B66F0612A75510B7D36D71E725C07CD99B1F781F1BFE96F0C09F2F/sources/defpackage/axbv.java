package defpackage;
/* compiled from: PG */
/* renamed from: axbv */
/* loaded from: classes2.dex */
public final class axbv extends aopi implements aoqv {
    private static final axbv a;
    private static volatile aorb b;
    private int c;
    private long d;
    private int e;

    static {
        axbv axbvVar = new axbv();
        a = axbvVar;
        aopi.registerDefaultInstance(axbv.class, axbvVar);
    }

    private axbv() {
    }

    public static axbu a() {
        return (axbu) a.createBuilder();
    }

    public static /* synthetic */ axbv b() {
        return a;
    }

    public void e(int i) {
        this.c |= 2;
        this.e = i;
    }

    public void f(long j) {
        this.c |= 1;
        this.d = j;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new axbv();
            case 4:
                return new axbu();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (axbv.class) {
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
