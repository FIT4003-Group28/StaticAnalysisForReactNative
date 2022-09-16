package defpackage;
/* compiled from: PG */
/* renamed from: auwh  reason: default package */
/* loaded from: classes2.dex */
public final class auwh implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new auwh(20);
    static final aopo t = new auwh(19);
    static final aopo s = new auwh(18);
    static final aopo r = new auwh(17);
    static final aopo q = new auwh(16);
    static final aopo p = new auwh(15);
    public static final aopo o = new auwh(14);
    static final aopo n = new auwh(13);
    static final aopo m = new auwh(12);
    static final aopo l = new auwh(11);
    static final aopo k = new auwh(10);
    static final aopo j = new auwh(9);
    static final aopo i = new auwh(8);
    static final aopo h = new auwh(7);
    static final aopo g = new auwh(6);
    static final aopo f = new auwh(5);
    static final aopo e = new auwh(4);
    static final aopo d = new auwh(3);
    static final aopo c = new auwh(2);
    static final aopo b = new auwh(1);
    static final aopo a = new auwh();

    private auwh() {
    }

    private auwh(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (awwc.aX(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return awwc.aY(i2) != 0;
            case 2:
                return awwc.aW(i2) != 0;
            case 3:
                return awwc.aV(i2) != 0;
            case 4:
                return awwc.aU(i2) != 0;
            case 5:
                return awwc.aT(i2) != 0;
            case 6:
                return awwc.aS(i2) != 0;
            case 7:
                return awwc.aR(i2) != 0;
            case 8:
                return auzb.b(i2) != null;
            case 9:
                return awwc.aQ(i2) != 0;
            case 10:
                return awwc.aP(i2) != 0;
            case 11:
                return awwc.aO(i2) != 0;
            case 12:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 13:
                return awwc.aN(i2) != 0;
            case 14:
                return awwc.aM(i2) != 0;
            case 15:
                return awwc.aL(i2) != 0;
            case 16:
                return awwc.aK(i2) != 0;
            case 17:
                return awwc.aJ(i2) != 0;
            case 18:
                return awwc.aI(i2) != 0;
            case 19:
                return avbg.b(i2) != null;
            default:
                if (avcc.b(i2) != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
