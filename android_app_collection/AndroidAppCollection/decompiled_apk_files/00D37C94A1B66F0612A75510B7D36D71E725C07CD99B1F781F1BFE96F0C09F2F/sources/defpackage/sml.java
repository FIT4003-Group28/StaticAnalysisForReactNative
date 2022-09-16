package defpackage;
/* compiled from: PG */
/* renamed from: sml  reason: default package */
/* loaded from: classes4.dex */
public final class sml implements aopo {
    private final /* synthetic */ int v;
    public static final aopo u = new sml(20);
    public static final aopo t = new sml(19);
    public static final aopo s = new sml(18);
    public static final aopo r = new sml(17);
    public static final aopo q = new sml(16);
    public static final aopo p = new sml(15);
    public static final aopo o = new sml(14);
    public static final aopo n = new sml(13);
    public static final aopo m = new sml(12);
    public static final aopo l = new sml(11);
    public static final aopo k = new sml(10);
    public static final aopo j = new sml(9);
    public static final aopo i = new sml(8);
    public static final aopo h = new sml(7);
    public static final aopo g = new sml(6);
    public static final aopo f = new sml(5);
    public static final aopo e = new sml(4);
    public static final aopo d = new sml(3);
    static final aopo c = new sml(2);
    static final aopo b = new sml(1);
    static final aopo a = new sml();

    private sml() {
    }

    private sml(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (smc.a(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 2:
                return smx.c(i2) != 0;
            case 3:
                return tjw.c(i2) != 0;
            case 4:
                return tnk.g(i2) != 0;
            case 5:
                return tqj.k(i2) != 0;
            case 6:
                return tqj.j(i2) != 0;
            case 7:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 8:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 9:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 10:
                return tqj.i(i2) != 0;
            case 11:
                return tqn.d(i2) != 0;
            case 12:
                return tqn.c(i2) != 0;
            case 13:
                return tqn.b(i2) != 0;
            case 14:
                return tqn.a(i2) != 0;
            case 15:
                return trz.c(i2) != 0;
            case 16:
                return trz.b(i2) != 0;
            case 17:
                return trz.a(i2) != 0;
            case 18:
                return tqu.a(i2) != null;
            case 19:
                return uaw.a(i2) != 0;
            default:
                if (ujr.c(i2) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
