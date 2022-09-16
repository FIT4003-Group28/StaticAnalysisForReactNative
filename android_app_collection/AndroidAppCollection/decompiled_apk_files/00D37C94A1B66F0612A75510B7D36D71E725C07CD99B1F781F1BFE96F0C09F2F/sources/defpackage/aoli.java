package defpackage;
/* compiled from: PG */
/* renamed from: aoli  reason: default package */
/* loaded from: classes.dex */
public final class aoli implements aopo {
    private final /* synthetic */ int v;
    public static final aopo u = new aoli(20);
    public static final aopo t = new aoli(19);
    public static final aopo s = new aoli(18);
    public static final aopo r = new aoli(17);
    public static final aopo q = new aoli(16);
    public static final aopo p = new aoli(15);
    public static final aopo o = new aoli(14);
    public static final aopo n = new aoli(13);
    public static final aopo m = new aoli(12);
    public static final aopo l = new aoli(11);
    public static final aopo k = new aoli(10);
    public static final aopo j = new aoli(9);
    public static final aopo i = new aoli(8);
    public static final aopo h = new aoli(7);
    public static final aopo g = new aoli(6);
    public static final aopo f = new aoli(5);
    static final aopo e = new aoli(4);
    static final aopo d = new aoli(3);
    static final aopo c = new aoli(2);
    static final aopo b = new aoli(1);
    static final aopo a = new aoli();

    private aoli() {
    }

    private aoli(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 1:
                return aolu.c(i2) != 0;
            case 2:
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
            case 3:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 5:
                return aolu.b(i2) != 0;
            case 6:
                return aolu.a(i2) != 0;
            case 7:
                return akel.N(i2) != 0;
            case 8:
                return akel.M(i2) != 0;
            case 9:
                return akel.L(i2) != 0;
            case 10:
                return akel.K(i2) != 0;
            case 11:
                return aomb.a(i2) != null;
            case 12:
                return akel.J(i2) != 0;
            case 13:
                return aomi.a(i2) != null;
            case 14:
                return akel.I(i2) != 0;
            case 15:
                return akel.H(i2) != 0;
            case 16:
                return akel.G(i2) != 0;
            case 17:
                return aosz.b(i2) != null;
            case 18:
                return aotd.b(i2) != null;
            case 19:
                return apfb.f(i2) != 0;
            default:
                return apfu.f(i2) != 0;
        }
    }
}
