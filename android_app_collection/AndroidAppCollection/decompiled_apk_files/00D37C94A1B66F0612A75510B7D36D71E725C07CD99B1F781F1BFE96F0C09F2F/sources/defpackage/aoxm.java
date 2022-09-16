package defpackage;
/* compiled from: PG */
/* renamed from: aoxm  reason: default package */
/* loaded from: classes.dex */
public final class aoxm implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new aoxm(20);
    static final aopo t = new aoxm(19);
    static final aopo s = new aoxm(18);
    static final aopo r = new aoxm(17);
    static final aopo q = new aoxm(16);
    static final aopo p = new aoxm(15);
    static final aopo o = new aoxm(14);
    public static final aopo n = new aoxm(13);
    static final aopo m = new aoxm(12);
    static final aopo l = new aoxm(11);
    static final aopo k = new aoxm(10);
    static final aopo j = new aoxm(9);
    static final aopo i = new aoxm(8);
    static final aopo h = new aoxm(7);
    static final aopo g = new aoxm(6);
    static final aopo f = new aoxm(5);
    static final aopo e = new aoxm(4);
    static final aopo d = new aoxm(3);
    static final aopo c = new aoxm(2);
    static final aopo b = new aoxm(1);
    static final aopo a = new aoxm();

    private aoxm() {
    }

    private aoxm(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (aoxn.b(i2) != null) {
                    return true;
                }
                break;
            case 1:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 2:
                return aphq.e(i2) != 0;
            case 3:
                return aoyt.d(i2) != 0;
            case 4:
                return aoyt.c(i2) != 0;
            case 5:
                return aoyt.b(i2) != 0;
            case 6:
                return aoyt.a(i2) != 0;
            case 7:
                return apdw.d(i2) != 0;
            case 8:
                return apdw.c(i2) != 0;
            case 9:
                return apbz.b(i2) != null;
            case 10:
                return apca.b(i2) != null;
            case 11:
                return apcb.b(i2) != null;
            case 12:
                return apcc.b(i2) != null;
            case 13:
                return apdw.b(i2) != 0;
            case 14:
                return apcd.b(i2) != null;
            case 15:
                return apce.b(i2) != null;
            case 16:
                return apcf.b(i2) != null;
            case 17:
                return apdw.a(i2) != 0;
            case 18:
                return apfb.d(i2) != 0;
            case 19:
                return apfb.c(i2) != 0;
            default:
                if (apel.b(i2) != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
