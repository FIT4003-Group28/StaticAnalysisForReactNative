package defpackage;
/* compiled from: PG */
/* renamed from: adzd  reason: default package */
/* loaded from: classes.dex */
public final class adzd implements aopo {
    private final /* synthetic */ int v;
    public static final aopo u = new adzd(20);
    public static final aopo t = new adzd(19);
    public static final aopo s = new adzd(18);
    public static final aopo r = new adzd(17);
    public static final aopo q = new adzd(16);
    public static final aopo p = new adzd(15);
    public static final aopo o = new adzd(14);
    public static final aopo n = new adzd(13);
    public static final aopo m = new adzd(12);
    public static final aopo l = new adzd(11);
    public static final aopo k = new adzd(10);
    public static final aopo j = new adzd(9);
    public static final aopo i = new adzd(8);
    public static final aopo h = new adzd(7);
    public static final aopo g = new adzd(6);
    public static final aopo f = new adzd(5);
    public static final aopo e = new adzd(4);
    public static final aopo d = new adzd(3);
    static final aopo c = new adzd(2);
    public static final aopo b = new adzd(1);
    static final aopo a = new adzd();

    private adzd() {
    }

    private adzd(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (i2 != 0) {
                    return false;
                }
                break;
            case 1:
                return uwv.b(i2) != 0;
            case 2:
                return i2 == 0 || i2 == 1;
            case 3:
                return aqxo.I(i2) != 0;
            case 4:
                return araa.A(i2) != 0;
            case 5:
                return araa.z(i2) != 0;
            case 6:
                return alcu.a(i2) != null;
            case 7:
                return alcv.a(i2) != null;
            case 8:
                return alcz.a(i2) != null;
            case 9:
                return amel.b(i2) != 0;
            case 10:
                return alze.a(i2) != null;
            case 11:
                return answ.k(i2) != 0;
            case 12:
                return ammp.a(i2) != null;
            case 13:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 14:
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
                        return true;
                    default:
                        return false;
                }
            case 16:
                return amod.a(i2) != null;
            case 17:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 18:
                return anhg.f(i2) != 0;
            case 19:
                return i2 == 0 || i2 == 1 || i2 == 2;
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
                        break;
                    default:
                        return false;
                }
        }
        return true;
    }
}
