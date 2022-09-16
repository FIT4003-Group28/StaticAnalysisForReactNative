package defpackage;
/* compiled from: PG */
/* renamed from: awsi  reason: default package */
/* loaded from: classes2.dex */
public final class awsi implements aopo {
    private final /* synthetic */ int v;
    public static final aopo u = new awsi(20);
    public static final aopo t = new awsi(19);
    public static final aopo s = new awsi(18);
    public static final aopo r = new awsi(17);
    public static final aopo q = new awsi(16);
    public static final aopo p = new awsi(15);
    public static final aopo o = new awsi(14);
    public static final aopo n = new awsi(13);
    public static final aopo m = new awsi(12);
    public static final aopo l = new awsi(11);
    public static final aopo k = new awsi(10);
    public static final aopo j = new awsi(9);
    public static final aopo i = new awsi(8);
    public static final aopo h = new awsi(7);
    public static final aopo g = new awsi(6);
    public static final aopo f = new awsi(5);
    public static final aopo e = new awsi(4);
    static final aopo d = new awsi(3);
    static final aopo c = new awsi(2);
    static final aopo b = new awsi(1);
    static final aopo a = new awsi();

    private awsi() {
    }

    private awsi(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (awwc.w(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return awwc.x(i2) != 0;
            case 2:
                return awwc.v(i2) != 0;
            case 3:
                return awwc.h(i2) != 0;
            case 4:
                return awwc.g(i2) != 0;
            case 5:
                return awwc.f(i2) != 0;
            case 6:
                return awwc.e(i2) != 0;
            case 7:
                return awuy.b(i2) != null;
            case 8:
                return awwc.a(i2) != 0;
            case 9:
                return awwc.b(i2) != 0;
            case 10:
                return awzo.b(i2) != null;
            case 11:
                return awzv.b(i2) != null;
            case 12:
                return awzz.b(i2) != null;
            case 13:
                return axaa.b(i2) != null;
            case 14:
                return axae.b(i2) != null;
            case 15:
                return axai.b(i2) != null;
            case 16:
                return axak.b(i2) != null;
            case 17:
                return awwd.a(i2) != 0;
            case 18:
                return axij.k(i2) != 0;
            case 19:
                return axbb.b(i2) != null;
            default:
                if (axbo.b(i2) != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
