package defpackage;
/* compiled from: PG */
/* renamed from: awkk  reason: default package */
/* loaded from: classes2.dex */
public final class awkk implements aopo {
    private final /* synthetic */ int v;
    public static final aopo u = new awkk(20);
    public static final aopo t = new awkk(19);
    public static final aopo s = new awkk(18);
    public static final aopo r = new awkk(17);
    public static final aopo q = new awkk(16);
    public static final aopo p = new awkk(15);
    public static final aopo o = new awkk(14);
    public static final aopo n = new awkk(13);
    public static final aopo m = new awkk(12);
    public static final aopo l = new awkk(11);
    public static final aopo k = new awkk(10);
    public static final aopo j = new awkk(9);
    public static final aopo i = new awkk(8);
    public static final aopo h = new awkk(7);
    public static final aopo g = new awkk(6);
    public static final aopo f = new awkk(5);
    public static final aopo e = new awkk(4);
    public static final aopo d = new awkk(3);
    static final aopo c = new awkk(2);
    static final aopo b = new awkk(1);
    static final aopo a = new awkk();

    private awkk() {
    }

    private awkk(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return awkl.b(i2) != null;
            case 1:
                return awkj.b(i2) != null;
            case 2:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 3:
                return awwc.K(i2) != 0;
            case 4:
                return awwc.J(i2) != 0;
            case 5:
                return awwc.I(i2) != 0;
            case 6:
                return awwc.H(i2) != 0;
            case 7:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        break;
                    default:
                        switch (i2) {
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                                break;
                            default:
                                return false;
                        }
                }
                return true;
            case 8:
                return awwc.F(i2) != 0;
            case 9:
                return awwc.E(i2) != 0;
            case 10:
                return i2 == 0;
            case 11:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 12:
                return i2 == 0 || i2 == 1;
            case 13:
                return i2 == 0 || i2 == 1;
            case 14:
                return awwc.D(i2) != 0;
            case 15:
                return awwc.C(i2) != 0;
            case 16:
                return awwc.B(i2) != 0;
            case 17:
                return awwc.A(i2) != 0;
            case 18:
                return awwc.z(i2) != 0;
            case 19:
                return awwc.y(i2) != 0;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
        }
    }
}
