package defpackage;
/* compiled from: PG */
/* renamed from: axbf  reason: default package */
/* loaded from: classes2.dex */
public final class axbf extends aopi implements aoqv {
    private static final axbf a;
    private static volatile aorb b;
    private int c = 0;
    private Object d;

    static {
        axbf axbfVar = new axbf();
        a = axbfVar;
        aopi.registerDefaultInstance(axbf.class, axbfVar);
    }

    private axbf() {
    }

    public axaj a() {
        if (this.c == 8) {
            return (axaj) this.d;
        }
        return axaj.b();
    }

    public axbc b() {
        if (this.c == 6) {
            return (axbc) this.d;
        }
        return axbc.c();
    }

    public axbd c() {
        if (this.c == 9) {
            return (axbd) this.d;
        }
        return axbd.c();
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
                return newMessageInfo(a, "\u0001\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{"d", "c", axbw.class, axbg.class, axbh.class, axbe.class, axbi.class, axbc.class, axbm.class, axaj.class, axbd.class});
            case 3:
                return new axbf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (axbf.class) {
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

    public axbg e() {
        if (this.c == 2) {
            return (axbg) this.d;
        }
        return axbg.b();
    }

    public axbm f() {
        if (this.c == 7) {
            return (axbm) this.d;
        }
        return axbm.l();
    }

    public axbw g() {
        if (this.c == 1) {
            return (axbw) this.d;
        }
        return axbw.c();
    }

    public boolean h() {
        return this.c == 7;
    }

    public boolean i() {
        return this.c == 6;
    }

    public boolean j() {
        return this.c == 8;
    }

    public boolean k() {
        return this.c == 9;
    }

    public boolean l() {
        return this.c == 4;
    }

    public boolean m() {
        return this.c == 2;
    }

    public boolean n() {
        return this.c == 3;
    }

    public boolean o() {
        return this.c == 1;
    }

    public boolean p() {
        return this.c == 5;
    }
}
