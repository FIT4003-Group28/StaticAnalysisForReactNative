package defpackage;
/* compiled from: PG */
/* renamed from: atck  reason: default package */
/* loaded from: classes2.dex */
final class atck implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new atck(20);
    static final aopo t = new atck(19);
    static final aopo s = new atck(18);
    static final aopo r = new atck(17);
    static final aopo q = new atck(16);
    static final aopo p = new atck(15);
    static final aopo o = new atck(14);
    static final aopo n = new atck(13);
    static final aopo m = new atck(12);
    static final aopo l = new atck(11);
    static final aopo k = new atck(10);
    static final aopo j = new atck(9);
    static final aopo i = new atck(8);
    static final aopo h = new atck(7);
    static final aopo g = new atck(6);
    static final aopo f = new atck(5);
    static final aopo e = new atck(4);
    static final aopo d = new atck(3);
    static final aopo c = new atck(2);
    static final aopo b = new atck(1);
    static final aopo a = new atck();

    private atck() {
    }

    private atck(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (atcl.b(i2) != null) {
                    return true;
                }
                break;
            case 1:
                return ataz.b(i2) != null;
            case 2:
                return almu.Y(i2) != 0;
            case 3:
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
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 6:
                return atcs.b(i2) != null;
            case 7:
                return atct.b(i2) != null;
            case 8:
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
                        return true;
                    default:
                        return false;
                }
            case 9:
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
            case 10:
                return atcu.b(i2) != null;
            case 11:
                return atcv.b(i2) != null;
            case 12:
                return atcw.b(i2) != null;
            case 13:
                return almu.V(i2) != 0;
            case 14:
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
                        return true;
                    default:
                        return false;
                }
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 16:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 17:
                return almu.T(i2) != 0;
            case 18:
                return almu.S(i2) != 0;
            case 19:
                return almu.R(i2) != 0;
            default:
                if (almu.Q(i2) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
