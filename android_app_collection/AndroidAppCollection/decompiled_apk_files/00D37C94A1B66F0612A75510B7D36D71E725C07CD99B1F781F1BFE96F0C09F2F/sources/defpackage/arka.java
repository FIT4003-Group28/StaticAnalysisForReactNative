package defpackage;
/* compiled from: PG */
/* renamed from: arka  reason: default package */
/* loaded from: classes2.dex */
public final class arka implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new arka(20);
    static final aopo t = new arka(19);
    static final aopo s = new arka(18);
    static final aopo r = new arka(17);
    static final aopo q = new arka(16);
    static final aopo p = new arka(15);
    static final aopo o = new arka(14);
    public static final aopo n = new arka(13);
    static final aopo m = new arka(12);
    static final aopo l = new arka(11);
    static final aopo k = new arka(10);
    static final aopo j = new arka(9);
    static final aopo i = new arka(8);
    static final aopo h = new arka(7);
    static final aopo g = new arka(6);
    static final aopo f = new arka(5);
    static final aopo e = new arka(4);
    static final aopo d = new arka(3);
    static final aopo c = new arka(2);
    static final aopo b = new arka(1);
    static final aopo a = new arka();

    private arka() {
    }

    private arka(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
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
            case 1:
                return arjz.b(i2) != null;
            case 2:
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
            case 3:
                return akel.S(i2) != 0;
            case 4:
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
                return akel.R(i2) != 0;
            case 7:
                return akel.Q(i2) != 0;
            case 8:
                return akel.P(i2) != 0;
            case 9:
                return akel.O(i2) != 0;
            case 10:
                return akpq.K(i2) != 0;
            case 11:
                return akpq.J(i2) != 0;
            case 12:
                return akpq.I(i2) != 0;
            case 13:
                return akpq.H(i2) != 0;
            case 14:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 15:
                return arot.b(i2) != null;
            case 16:
                return arou.b(i2) != null;
            case 17:
                return arov.b(i2) != null;
            case 18:
                return akpq.G(i2) != 0;
            case 19:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2;
        }
    }
}
