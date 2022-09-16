package defpackage;
/* compiled from: PG */
/* renamed from: asev  reason: default package */
/* loaded from: classes2.dex */
public final class asev implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new asev(20);
    static final aopo t = new asev(19);
    static final aopo s = new asev(18);
    static final aopo r = new asev(17);
    static final aopo q = new asev(16);
    static final aopo p = new asev(15);
    static final aopo o = new asev(14);
    static final aopo n = new asev(13);
    static final aopo m = new asev(12);
    static final aopo l = new asev(11);
    static final aopo k = new asev(10);
    static final aopo j = new asev(9);
    static final aopo i = new asev(8);
    static final aopo h = new asev(7);
    static final aopo g = new asev(6);
    static final aopo f = new asev(5);
    static final aopo e = new asev(4);
    static final aopo d = new asev(3);
    static final aopo c = new asev(2);
    public static final aopo b = new asev(1);
    static final aopo a = new asev();

    private asev() {
    }

    private asev(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return akzj.I(i2) != 0;
            case 1:
                return akpq.v(i2) != 0;
            case 2:
                return akzj.H(i2) != 0;
            case 3:
                return akzj.G(i2) != 0;
            case 4:
                return akzj.F(i2) != 0;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 6:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 7:
                return akzj.E(i2) != 0;
            case 8:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 9:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 10:
                if (i2 != 0 && i2 != 1 && i2 != 2) {
                    switch (i2) {
                        case 4:
                        case 8:
                        case 16:
                        case 32:
                        case 64:
                        case 128:
                        case 256:
                        case 512:
                        case 1024:
                        case 2048:
                        case 4096:
                        case 8192:
                        case 16384:
                            break;
                        default:
                            return false;
                    }
                }
                return true;
            case 11:
                return akzj.D(i2) != 0;
            case 12:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 13:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 14:
                return akzj.C(i2) != 0;
            case 15:
                return akzj.B(i2) != 0;
            case 16:
                return akzj.A(i2) != 0;
            case 17:
                return i2 == 0 || i2 == 1;
            case 18:
                return asny.b(i2) != null;
            case 19:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
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
                        return true;
                    default:
                        return false;
                }
        }
    }
}
