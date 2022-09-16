package defpackage;
/* compiled from: PG */
/* renamed from: auii  reason: default package */
/* loaded from: classes2.dex */
public final class auii implements aopo {
    private final /* synthetic */ int v;
    public static final aopo u = new auii(20);
    public static final aopo t = new auii(19);
    static final aopo s = new auii(18);
    static final aopo r = new auii(17);
    static final aopo q = new auii(16);
    static final aopo p = new auii(15);
    static final aopo o = new auii(14);
    static final aopo n = new auii(13);
    public static final aopo m = new auii(12);
    public static final aopo l = new auii(11);
    static final aopo k = new auii(10);
    static final aopo j = new auii(9);
    static final aopo i = new auii(8);
    static final aopo h = new auii(7);
    static final aopo g = new auii(6);
    static final aopo f = new auii(5);
    static final aopo e = new auii(4);
    static final aopo d = new auii(3);
    static final aopo c = new auii(2);
    static final aopo b = new auii(1);
    static final aopo a = new auii();

    private auii() {
    }

    private auii(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (awwc.bV(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return auid.b(i2) != null;
            case 2:
                return awwc.bU(i2) != 0;
            case 3:
                return awwc.bT(i2) != 0;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 5:
                return awwc.bS(i2) != 0;
            case 6:
                return auju.b(i2) != null;
            case 7:
                return awwc.bR(i2) != 0;
            case 8:
                return awwc.bQ(i2) != 0;
            case 9:
                return aukf.b(i2) != null;
            case 10:
                return aukg.b(i2) != null;
            case 11:
                return awwc.bP(i2) != 0;
            case 12:
                return awwc.bO(i2) != 0;
            case 13:
                return awwc.bN(i2) != 0;
            case 14:
                return awwc.bM(i2) != 0;
            case 15:
                return awwc.bL(i2) != 0;
            case 16:
                return awwc.bK(i2) != 0;
            case 17:
                return aulb.b(i2) != null;
            case 18:
                return awwc.bJ(i2) != 0;
            case 19:
                return awwc.bI(i2) != 0;
            default:
                if (awwc.bH(i2) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
