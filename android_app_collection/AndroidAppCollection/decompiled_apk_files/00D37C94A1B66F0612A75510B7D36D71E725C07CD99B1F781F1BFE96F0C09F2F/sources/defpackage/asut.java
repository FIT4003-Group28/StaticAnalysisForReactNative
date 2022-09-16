package defpackage;
/* compiled from: PG */
/* renamed from: asut  reason: default package */
/* loaded from: classes2.dex */
public final class asut implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new asut(20);
    static final aopo t = new asut(19);
    static final aopo s = new asut(18);
    static final aopo r = new asut(17);
    static final aopo q = new asut(16);
    static final aopo p = new asut(15);
    static final aopo o = new asut(14);
    static final aopo n = new asut(13);
    static final aopo m = new asut(12);
    static final aopo l = new asut(11);
    static final aopo k = new asut(10);
    static final aopo j = new asut(9);
    static final aopo i = new asut(8);
    static final aopo h = new asut(7);
    public static final aopo g = new asut(6);
    static final aopo f = new asut(5);
    public static final aopo e = new asut(4);
    static final aopo d = new asut(3);
    static final aopo c = new asut(2);
    static final aopo b = new asut(1);
    static final aopo a = new asut();

    private asut() {
    }

    private asut(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (akzj.w(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return asuk.b(i2) != null;
            case 2:
                return akzj.v(i2) != 0;
            case 3:
                return asux.b(i2) != null;
            case 4:
                return akzj.u(i2) != 0;
            case 5:
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
                        return true;
                    default:
                        return false;
                }
            case 6:
                return akzj.t(i2) != 0;
            case 7:
                return aswa.b(i2) != null;
            case 8:
                return aswe.b(i2) != null;
            case 9:
                return almu.ad(i2) != 0;
            case 10:
                return almu.ac(i2) != 0;
            case 11:
                return asxh.b(i2) != null;
            case 12:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 13:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 14:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 7;
            case 15:
                return almu.ab(i2) != 0;
            case 16:
                return almu.aa(i2) != 0;
            case 17:
                return almu.Z(i2) != 0;
            case 18:
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
                        return true;
                    default:
                        return false;
                }
            case 19:
                return asyf.b(i2) != null;
            default:
                if (atag.b(i2) != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
