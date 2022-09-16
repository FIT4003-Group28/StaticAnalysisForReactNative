package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: avcd  reason: default package */
/* loaded from: classes2.dex */
public final class avcd implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new avcd(20);
    static final aopo t = new avcd(19);
    static final aopo s = new avcd(18);
    static final aopo r = new avcd(17);
    static final aopo q = new avcd(16);
    static final aopo p = new avcd(15);
    static final aopo o = new avcd(14);
    static final aopo n = new avcd(13);
    static final aopo m = new avcd(12);
    static final aopo l = new avcd(11);
    static final aopo k = new avcd(10);
    static final aopo j = new avcd(9);
    static final aopo i = new avcd(8);
    static final aopo h = new avcd(7);
    static final aopo g = new avcd(6);
    static final aopo f = new avcd(5);
    static final aopo e = new avcd(4);
    static final aopo d = new avcd(3);
    static final aopo c = new avcd(2);
    static final aopo b = new avcd(1);
    static final aopo a = new avcd();

    private avcd() {
    }

    private avcd(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (awwc.aG(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return awwc.aH(i2) != 0;
            case 2:
                return awwc.aF(i2) != 0;
            case 3:
                return awwc.aE(i2) != 0;
            case 4:
                return awwc.aD(i2) != 0;
            case 5:
                return awwc.aC(i2) != 0;
            case 6:
                return avdb.b(i2) != null;
            case 7:
                return avdc.b(i2) != null;
            case 8:
                return awwc.aB(i2) != 0;
            case 9:
                return awwc.aA(i2) != 0;
            case 10:
                return awwc.az(i2) != 0;
            case 11:
                return awwc.ay(i2) != 0;
            case 12:
                return aved.b(i2) != null;
            case 13:
                return awwc.ax(i2) != 0;
            case 14:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 16:
                return aveo.b(i2) != null;
            case 17:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 18:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 19:
                return awwc.aw(i2) != 0;
            default:
                if (avfy.b(i2) != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
