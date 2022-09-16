package defpackage;
/* compiled from: PG */
/* renamed from: aupm  reason: default package */
/* loaded from: classes2.dex */
public final class aupm implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new aupm(20);
    public static final aopo t = new aupm(19);
    public static final aopo s = new aupm(18);
    static final aopo r = new aupm(17);
    static final aopo q = new aupm(16);
    static final aopo p = new aupm(15);
    static final aopo o = new aupm(14);
    static final aopo n = new aupm(13);
    static final aopo m = new aupm(12);
    static final aopo l = new aupm(11);
    static final aopo k = new aupm(10);
    static final aopo j = new aupm(9);
    public static final aopo i = new aupm(8);
    public static final aopo h = new aupm(7);
    static final aopo g = new aupm(6);
    static final aopo f = new aupm(5);
    static final aopo e = new aupm(4);
    static final aopo d = new aupm(3);
    static final aopo c = new aupm(2);
    static final aopo b = new aupm(1);
    static final aopo a = new aupm();

    private aupm() {
    }

    private aupm(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (awwc.bo(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return awwc.bp(i2) != 0;
            case 2:
                return awwc.bn(i2) != 0;
            case 3:
                return awwc.bm(i2) != 0;
            case 4:
                return awwc.bl(i2) != 0;
            case 5:
                return awwc.bk(i2) != 0;
            case 6:
                return auqn.b(i2) != null;
            case 7:
                return awwc.bj(i2) != 0;
            case 8:
                return awwc.bi(i2) != 0;
            case 9:
                return ausi.b(i2) != null;
            case 10:
                return awwc.bh(i2) != 0;
            case 11:
                return awwc.bg(i2) != 0;
            case 12:
                return awwc.bf(i2) != 0;
            case 13:
                return ausr.b(i2) != null;
            case 14:
                return awwc.be(i2) != 0;
            case 15:
                return awwc.bd(i2) != 0;
            case 16:
                return awwc.bc(i2) != 0;
            case 17:
                return awwc.bb(i2) != 0;
            case 18:
                return awwc.ba(i2) != 0;
            case 19:
                return awwc.aZ(i2) != 0;
            default:
                if (auuv.b(i2) != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
