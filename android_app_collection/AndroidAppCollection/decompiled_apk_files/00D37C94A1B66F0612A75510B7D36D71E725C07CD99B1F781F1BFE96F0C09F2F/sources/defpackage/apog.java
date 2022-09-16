package defpackage;
/* compiled from: PG */
/* renamed from: apog  reason: default package */
/* loaded from: classes.dex */
public final class apog implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new apog(20);
    static final aopo t = new apog(19);
    static final aopo s = new apog(18);
    static final aopo r = new apog(17);
    static final aopo q = new apog(16);
    static final aopo p = new apog(15);
    static final aopo o = new apog(14);
    static final aopo n = new apog(13);
    static final aopo m = new apog(12);
    public static final aopo l = new apog(11);
    static final aopo k = new apog(10);
    static final aopo j = new apog(9);
    static final aopo i = new apog(8);
    static final aopo h = new apog(7);
    static final aopo g = new apog(6);
    static final aopo f = new apog(5);
    static final aopo e = new apog(4);
    static final aopo d = new apog(3);
    static final aopo c = new apog(2);
    static final aopo b = new apog(1);
    static final aopo a = new apog();

    private apog() {
    }

    private apog(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (akzj.o(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return akzj.p(i2) != 0;
            case 2:
                return akzj.n(i2) != 0;
            case 3:
                return akzj.m(i2) != 0;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 5:
                return akzj.l(i2) != 0;
            case 6:
                return almu.K(i2) != 0;
            case 7:
                return apps.b(i2) != null;
            case 8:
                return almu.J(i2) != 0;
            case 9:
                return almu.I(i2) != 0;
            case 10:
                return almu.H(i2) != 0;
            case 11:
                return almu.G(i2) != 0;
            case 12:
                return almu.F(i2) != 0;
            case 13:
                return almu.E(i2) != 0;
            case 14:
                return almu.D(i2) != 0;
            case 15:
                return apwt.i(i2) != 0;
            case 16:
                return apwt.h(i2) != 0;
            case 17:
                return apsx.b(i2) != null;
            case 18:
                return apwt.g(i2) != 0;
            case 19:
                return apwt.f(i2) != 0;
            default:
                if (apvh.b(i2) != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
