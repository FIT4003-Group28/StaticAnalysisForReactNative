package defpackage;
/* compiled from: PG */
/* renamed from: awbk  reason: default package */
/* loaded from: classes2.dex */
public final class awbk implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new awbk(20);
    static final aopo t = new awbk(19);
    static final aopo s = new awbk(18);
    static final aopo r = new awbk(17);
    static final aopo q = new awbk(16);
    static final aopo p = new awbk(15);
    static final aopo o = new awbk(14);
    static final aopo n = new awbk(13);
    public static final aopo m = new awbk(12);
    public static final aopo l = new awbk(11);
    static final aopo k = new awbk(10);
    static final aopo j = new awbk(9);
    static final aopo i = new awbk(8);
    static final aopo h = new awbk(7);
    static final aopo g = new awbk(6);
    static final aopo f = new awbk(5);
    static final aopo e = new awbk(4);
    static final aopo d = new awbk(3);
    static final aopo c = new awbk(2);
    static final aopo b = new awbk(1);
    static final aopo a = new awbk();

    private awbk() {
    }

    private awbk(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (awwc.X(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return awwc.Y(i2) != 0;
            case 2:
                return awwc.W(i2) != 0;
            case 3:
                return awwc.V(i2) != 0;
            case 4:
                return awwc.U(i2) != 0;
            case 5:
                return awwc.T(i2) != 0;
            case 6:
                return awwc.S(i2) != 0;
            case 7:
                return awwc.R(i2) != 0;
            case 8:
                return awwc.Q(i2) != 0;
            case 9:
                if (i2 != 31) {
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
                            break;
                        default:
                            return false;
                    }
                }
                return true;
            case 10:
                return awwc.P(i2) != 0;
            case 11:
                return awwc.O(i2) != 0;
            case 12:
                return awwc.N(i2) != 0;
            case 13:
                return awgu.b(i2) != null;
            case 14:
                return awgv.b(i2) != null;
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
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
                        return true;
                    default:
                        return false;
                }
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
                        return true;
                    default:
                        return false;
                }
            case 18:
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
            case 19:
                return awwc.M(i2) != 0;
            default:
                if (awwc.L(i2) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
