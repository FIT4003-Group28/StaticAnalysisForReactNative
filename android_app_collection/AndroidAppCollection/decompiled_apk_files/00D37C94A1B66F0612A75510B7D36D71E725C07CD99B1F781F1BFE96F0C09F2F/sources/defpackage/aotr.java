package defpackage;
/* compiled from: PG */
/* renamed from: aotr  reason: default package */
/* loaded from: classes.dex */
public final class aotr implements aopo {
    private final /* synthetic */ int v;
    public static final aopo u = new aotr(20);
    public static final aopo t = new aotr(19);
    public static final aopo s = new aotr(18);
    public static final aopo r = new aotr(17);
    public static final aopo q = new aotr(16);
    public static final aopo p = new aotr(15);
    public static final aopo o = new aotr(14);
    public static final aopo n = new aotr(13);
    public static final aopo m = new aotr(12);
    public static final aopo l = new aotr(11);
    public static final aopo k = new aotr(10);
    public static final aopo j = new aotr(9);
    public static final aopo i = new aotr(8);
    public static final aopo h = new aotr(7);
    public static final aopo g = new aotr(6);
    public static final aopo f = new aotr(5);
    public static final aopo e = new aotr(4);
    public static final aopo d = new aotr(3);
    public static final aopo c = new aotr(2);
    static final aopo b = new aotr(1);
    static final aopo a = new aotr();

    private aotr() {
    }

    private aotr(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return aots.b(i2) != null;
            case 1:
                return aotp.b(i2) != null;
            case 2:
                return aoun.b(i2) != null;
            case 3:
                return aouo.b(i2) != null;
            case 4:
                return aoup.b(i2) != null;
            case 5:
                return aouq.b(i2) != null;
            case 6:
                return aout.b(i2) != null;
            case 7:
                return apfu.e(i2) != 0;
            case 8:
                return aouu.b(i2) != null;
            case 9:
                return aouv.b(i2) != null;
            case 10:
                return aouw.b(i2) != null;
            case 11:
                return aovh.b(i2) != null;
            case 12:
                return aphq.f(i2) != 0;
            case 13:
                return aovv.b(i2) != null;
            case 14:
                return aowm.b(i2) != null;
            case 15:
                return aown.b(i2) != null;
            case 16:
                return aowo.b(i2) != null;
            case 17:
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
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
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
                        return true;
                    default:
                        return false;
                }
            case 18:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 4 || i2 == 6 || i2 == 7;
            case 19:
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
                        return true;
                    default:
                        return false;
                }
            default:
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
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
