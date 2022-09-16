package defpackage;
/* compiled from: PG */
/* renamed from: auca  reason: default package */
/* loaded from: classes2.dex */
final class auca implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new auca(20);
    static final aopo t = new auca(19);
    static final aopo s = new auca(18);
    static final aopo r = new auca(17);
    static final aopo q = new auca(16);
    static final aopo p = new auca(15);
    static final aopo o = new auca(14);
    static final aopo n = new auca(13);
    static final aopo m = new auca(12);
    static final aopo l = new auca(11);
    static final aopo k = new auca(10);
    static final aopo j = new auca(9);
    static final aopo i = new auca(8);
    static final aopo h = new auca(7);
    static final aopo g = new auca(6);
    static final aopo f = new auca(5);
    static final aopo e = new auca(4);
    static final aopo d = new auca(3);
    static final aopo c = new auca(2);
    static final aopo b = new auca(1);
    static final aopo a = new auca();

    private auca() {
    }

    private auca(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (aucb.b(i2) != null) {
                    return true;
                }
                break;
            case 1:
                return atzp.b(i2) != null;
            case 2:
                return awwc.ch(i2) != 0;
            case 3:
                return awwc.cg(i2) != 0;
            case 4:
                return awwc.cf(i2) != 0;
            case 5:
                return aucj.b(i2) != null;
            case 6:
                return awwc.ce(i2) != 0;
            case 7:
                return aufw.b(i2) != null;
            case 8:
                return awwc.cd(i2) != 0;
            case 9:
                return awwc.cc(i2) != 0;
            case 10:
                return awwc.cb(i2) != 0;
            case 11:
                return awwc.ca(i2) != 0;
            case 12:
                return awwc.bZ(i2) != 0;
            case 13:
                return augo.b(i2) != null;
            case 14:
                return awwc.bY(i2) != 0;
            case 15:
                return awwc.bX(i2) != 0;
            case 16:
                return awwc.bW(i2) != 0;
            case 17:
                return auhz.b(i2) != null;
            case 18:
                return auia.b(i2) != null;
            case 19:
                return auib.b(i2) != null;
            default:
                if (auic.b(i2) != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
