package defpackage;
/* compiled from: PG */
/* renamed from: axce  reason: default package */
/* loaded from: classes2.dex */
public final class axce implements aopo {
    private final /* synthetic */ int v;
    public static final aopo u = new axce(20);
    public static final aopo t = new axce(19);
    public static final aopo s = new axce(18);
    public static final aopo r = new axce(17);
    public static final aopo q = new axce(16);
    public static final aopo p = new axce(15);
    public static final aopo o = new axce(14);
    public static final aopo n = new axce(13);
    public static final aopo m = new axce(12);
    public static final aopo l = new axce(11);
    public static final aopo k = new axce(10);
    public static final aopo j = new axce(9);
    public static final aopo i = new axce(8);
    public static final aopo h = new axce(7);
    public static final aopo g = new axce(6);
    public static final aopo f = new axce(5);
    static final aopo e = new axce(4);
    static final aopo d = new axce(3);
    static final aopo c = new axce(2);
    static final aopo b = new axce(1);
    static final aopo a = new axce();

    private axce() {
    }

    private axce(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return axcf.b(i2) != null;
            case 1:
                return axbs.b(i2) != null;
            case 2:
                return i2 == 1 || i2 == 2 || i2 == 3;
            case 3:
                return i2 == 1;
            case 4:
                return i2 == 1;
            case 5:
                return axgp.b(i2) != null;
            case 6:
                return axgq.b(i2) != null;
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
                        return true;
                    default:
                        return false;
                }
            case 8:
                return babq.c(i2) != 0;
            case 9:
                return azyz.b(i2) != null;
            case 10:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 11:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 12:
                return azzs.b(i2) != null;
            case 13:
                return azzu.b(i2) != null;
            case 14:
                return azzx.b(i2) != null;
            case 15:
                return azsr.c(i2) != 0;
            case 16:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 17:
                return azzy.b(i2) != null;
            case 18:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 19:
                return azsr.b(i2) != 0;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
        }
    }
}
