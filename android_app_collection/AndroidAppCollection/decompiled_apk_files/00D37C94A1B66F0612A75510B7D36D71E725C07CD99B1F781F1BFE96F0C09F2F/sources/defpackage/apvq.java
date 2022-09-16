package defpackage;
/* compiled from: PG */
/* renamed from: apvq  reason: default package */
/* loaded from: classes2.dex */
public final class apvq implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new apvq(20);
    public static final aopo t = new apvq(19);
    static final aopo s = new apvq(18);
    static final aopo r = new apvq(17);
    static final aopo q = new apvq(16);
    static final aopo p = new apvq(15);
    static final aopo o = new apvq(14);
    static final aopo n = new apvq(13);
    static final aopo m = new apvq(12);
    static final aopo l = new apvq(11);
    static final aopo k = new apvq(10);
    static final aopo j = new apvq(9);
    static final aopo i = new apvq(8);
    static final aopo h = new apvq(7);
    static final aopo g = new apvq(6);
    static final aopo f = new apvq(5);
    static final aopo e = new apvq(4);
    static final aopo d = new apvq(3);
    static final aopo c = new apvq(2);
    static final aopo b = new apvq(1);
    static final aopo a = new apvq();

    private apvq() {
    }

    private apvq(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (apwt.d(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return apwt.e(i2) != 0;
            case 2:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 3:
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
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                        return true;
                    default:
                        return false;
                }
            case 4:
                return apwt.c(i2) != 0;
            case 5:
                return apwf.b(i2) != null;
            case 6:
                return apwt.b(i2) != 0;
            case 7:
                return alwb.p(i2) != 0;
            case 8:
                return alwb.o(i2) != 0;
            case 9:
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
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        return true;
                    default:
                        return false;
                }
            case 10:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 11:
                return alwb.k(i2) != 0;
            case 12:
                return aqal.b(i2) != null;
            case 13:
                return alwb.j(i2) != 0;
            case 14:
                return alwb.i(i2) != 0;
            case 15:
                return alwb.h(i2) != 0;
            case 16:
                return aqgn.h(i2) != 0;
            case 17:
                return aqgn.g(i2) != 0;
            case 18:
                return aqgn.f(i2) != 0;
            case 19:
                return aqgn.e(i2) != 0;
            default:
                if (aqgn.d(i2) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
