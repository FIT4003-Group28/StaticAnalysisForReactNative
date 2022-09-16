package defpackage;
/* compiled from: PG */
/* renamed from: axat */
/* loaded from: classes2.dex */
public final class axat extends aopi implements aoqv {
    private static final axat a;
    private static volatile aorb b;
    private int c = 0;
    private Object d;

    static {
        axat axatVar = new axat();
        a = axatVar;
        aopi.registerDefaultInstance(axat.class, axatVar);
    }

    private axat() {
    }

    public void A(axbw axbwVar) {
        axbwVar.getClass();
        this.d = axbwVar;
        this.c = 3;
    }

    public void B(axcd axcdVar) {
        axcdVar.getClass();
        this.d = axcdVar;
        this.c = 1;
    }

    public void C(axbo axboVar) {
        this.d = Integer.valueOf(axboVar.d);
        this.c = 13;
    }

    public void D(axcj axcjVar) {
        axcjVar.getClass();
        this.d = axcjVar;
        this.c = 7;
    }

    public static axao a() {
        return (axao) a.createBuilder();
    }

    public static /* synthetic */ axat b() {
        return a;
    }

    public void r(awzq awzqVar) {
        awzqVar.getClass();
        this.d = awzqVar;
        this.c = 6;
    }

    public void s(axag axagVar) {
        axagVar.getClass();
        this.d = axagVar;
        this.c = 11;
    }

    public void t(axaj axajVar) {
        axajVar.getClass();
        this.d = axajVar;
        this.c = 8;
    }

    public void u(axaq axaqVar) {
        axaqVar.getClass();
        this.d = axaqVar;
        this.c = 4;
    }

    public void v(axbm axbmVar) {
        axbmVar.getClass();
        this.d = axbmVar;
        this.c = 2;
    }

    public void w(axar axarVar) {
        axarVar.getClass();
        this.d = axarVar;
        this.c = 12;
    }

    public void x(axbq axbqVar) {
        axbqVar.getClass();
        this.d = axbqVar;
        this.c = 15;
    }

    public void y(axbt axbtVar) {
        axbtVar.getClass();
        this.d = axbtVar;
        this.c = 9;
    }

    public void z(axbv axbvVar) {
        axbvVar.getClass();
        this.d = axbvVar;
        this.c = 14;
    }

    public axbt c() {
        if (this.c == 9) {
            return (axbt) this.d;
        }
        return axbt.e();
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
                return newMessageInfo(a, "\u0001\u000f\u0001\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rဿ\u0000\u000eြ\u0000\u000fြ\u0000", new Object[]{"d", "c", axcd.class, axbm.class, axbw.class, axaq.class, axas.class, awzq.class, axcj.class, axaj.class, axbt.class, awzw.class, axag.class, axar.class, axbo.a(), axbv.class, axbq.class});
            case 3:
                return new axat();
            case 4:
                return new axao();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (axat.class) {
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

    public boolean q() {
        return this.c == 9;
    }
}
