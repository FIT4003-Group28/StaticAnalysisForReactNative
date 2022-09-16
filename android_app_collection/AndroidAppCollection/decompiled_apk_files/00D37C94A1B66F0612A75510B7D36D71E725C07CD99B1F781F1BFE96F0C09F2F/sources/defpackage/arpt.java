package defpackage;
/* compiled from: PG */
/* renamed from: arpt  reason: default package */
/* loaded from: classes2.dex */
public final class arpt implements aopo {
    private final /* synthetic */ int v;
    public static final aopo u = new arpt(20);
    public static final aopo t = new arpt(19);
    public static final aopo s = new arpt(18);
    static final aopo r = new arpt(17);
    static final aopo q = new arpt(16);
    static final aopo p = new arpt(15);
    static final aopo o = new arpt(14);
    static final aopo n = new arpt(13);
    static final aopo m = new arpt(12);
    static final aopo l = new arpt(11);
    static final aopo k = new arpt(10);
    static final aopo j = new arpt(9);
    static final aopo i = new arpt(8);
    static final aopo h = new arpt(7);
    static final aopo g = new arpt(6);
    static final aopo f = new arpt(5);
    static final aopo e = new arpt(4);
    static final aopo d = new arpt(3);
    static final aopo c = new arpt(2);
    static final aopo b = new arpt(1);
    static final aopo a = new arpt();

    private arpt() {
    }

    private arpt(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 1:
                return i2 == 0 || i2 == 1;
            case 2:
                return akpq.F(i2) != 0;
            case 3:
                return akpq.E(i2) != 0;
            case 4:
                return akpq.D(i2) != 0;
            case 5:
                return akpq.C(i2) != 0;
            case 6:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 7:
                return akpq.B(i2) != 0;
            case 8:
                return akpq.A(i2) != 0;
            case 9:
                return akpq.z(i2) != 0;
            case 10:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 11:
                return asbk.b(i2) != null;
            case 12:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 13:
                return asch.b(i2) != null;
            case 14:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 15:
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
                        return true;
                    default:
                        return false;
                }
            case 16:
                if (i2 != 18 && i2 != 22) {
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
            case 17:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 18:
                return akpq.y(i2) != 0;
            case 19:
                return akpq.x(i2) != 0;
            default:
                return akpq.w(i2) != 0;
        }
    }
}
