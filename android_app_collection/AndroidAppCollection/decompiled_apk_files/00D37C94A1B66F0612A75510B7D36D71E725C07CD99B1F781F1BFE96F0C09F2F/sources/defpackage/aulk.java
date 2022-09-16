package defpackage;
/* compiled from: PG */
/* renamed from: aulk  reason: default package */
/* loaded from: classes2.dex */
public final class aulk implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new aulk(20);
    static final aopo t = new aulk(19);
    static final aopo s = new aulk(18);
    static final aopo r = new aulk(17);
    static final aopo q = new aulk(16);
    static final aopo p = new aulk(15);
    static final aopo o = new aulk(14);
    static final aopo n = new aulk(13);
    public static final aopo m = new aulk(12);
    static final aopo l = new aulk(11);
    public static final aopo k = new aulk(10);
    public static final aopo j = new aulk(9);
    static final aopo i = new aulk(8);
    static final aopo h = new aulk(7);
    static final aopo g = new aulk(6);
    static final aopo f = new aulk(5);
    static final aopo e = new aulk(4);
    static final aopo d = new aulk(3);
    static final aopo c = new aulk(2);
    public static final aopo b = new aulk(1);
    static final aopo a = new aulk();

    private aulk() {
    }

    private aulk(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 1:
                return awwc.bG(i2) != 0;
            case 2:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 3:
                return awwc.bF(i2) != 0;
            case 4:
                return awwc.bE(i2) != 0;
            case 5:
                return awwc.bD(i2) != 0;
            case 6:
                return awwc.bC(i2) != 0;
            case 7:
                return awwc.bB(i2) != 0;
            case 8:
                return awwc.bA(i2) != 0;
            case 9:
                return awwc.bz(i2) != 0;
            case 10:
                return awwc.by(i2) != 0;
            case 11:
                return awwc.bx(i2) != 0;
            case 12:
                return awwc.bw(i2) != 0;
            case 13:
                return awwc.bv(i2) != 0;
            case 14:
                return awwc.bu(i2) != 0;
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 16:
                return awwc.bs(i2) != 0;
            case 17:
                return awwc.br(i2) != 0;
            case 18:
                return awwc.bq(i2) != 0;
            case 19:
                return auon.b(i2) != null;
            default:
                return auoo.b(i2) != null;
        }
    }
}
