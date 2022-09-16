package defpackage;
/* compiled from: PG */
/* renamed from: axbt */
/* loaded from: classes2.dex */
public final class axbt extends aopi implements aoqv {
    private static final axbt a;
    private static volatile aorb b;
    private int c;
    private long d;
    private axct e;
    private long f;
    private axcu g;
    private int h;

    static {
        axbt axbtVar = new axbt();
        a = axbtVar;
        aopi.registerDefaultInstance(axbt.class, axbtVar);
    }

    private axbt() {
    }

    public static axbr b() {
        return (axbr) a.createBuilder();
    }

    public static axbt e() {
        return a;
    }

    public static /* synthetic */ void f(axbt axbtVar, long j) {
        axbtVar.k(j);
    }

    public static /* synthetic */ void g(axbt axbtVar, axct axctVar) {
        axbtVar.m(axctVar);
    }

    public static /* synthetic */ void h(axbt axbtVar, long j) {
        axbtVar.n(j);
    }

    public static /* synthetic */ void i(axbt axbtVar, axcu axcuVar) {
        axbtVar.o(axcuVar);
    }

    public static /* synthetic */ void j(axbt axbtVar, axbs axbsVar) {
        axbtVar.l(axbsVar);
    }

    public void k(long j) {
        this.c |= 1;
        this.d = j;
    }

    public void l(axbs axbsVar) {
        this.h = axbsVar.d;
        this.c |= 16;
    }

    public void m(axct axctVar) {
        axctVar.getClass();
        this.e = axctVar;
        this.c |= 2;
    }

    public void n(long j) {
        this.c |= 4;
        this.f = j;
    }

    public void o(axcu axcuVar) {
        axcuVar.getClass();
        this.g = axcuVar;
        this.c |= 8;
    }

    public long a() {
        return this.f;
    }

    public axbs c() {
        axbs b2 = axbs.b(this.h);
        return b2 == null ? axbs.KEYFRAME_LABEL_UNSPECIFIED : b2;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0005ဌ\u0004", new Object[]{"c", "d", "e", "f", "g", "h", axbs.a()});
            case 3:
                return new axbt();
            case 4:
                return new axbr();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (axbt.class) {
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
