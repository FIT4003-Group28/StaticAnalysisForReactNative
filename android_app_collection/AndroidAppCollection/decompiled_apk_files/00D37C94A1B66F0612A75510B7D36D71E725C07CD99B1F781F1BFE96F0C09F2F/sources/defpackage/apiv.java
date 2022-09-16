package defpackage;
/* compiled from: PG */
/* renamed from: apiv  reason: default package */
/* loaded from: classes.dex */
public final class apiv implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new apiv(20);
    static final aopo t = new apiv(19);
    static final aopo s = new apiv(18);
    static final aopo r = new apiv(17);
    static final aopo q = new apiv(16);
    static final aopo p = new apiv(15);
    static final aopo o = new apiv(14);
    static final aopo n = new apiv(13);
    static final aopo m = new apiv(12);
    static final aopo l = new apiv(11);
    static final aopo k = new apiv(10);
    static final aopo j = new apiv(9);
    static final aopo i = new apiv(8);
    static final aopo h = new apiv(7);
    static final aopo g = new apiv(6);
    static final aopo f = new apiv(5);
    static final aopo e = new apiv(4);
    static final aopo d = new apiv(3);
    static final aopo c = new apiv(2);
    static final aopo b = new apiv(1);
    public static final aopo a = new apiv();

    private apiv() {
    }

    private apiv(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (akpq.r(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return akpq.s(i2) != 0;
            case 2:
                return akpq.q(i2) != 0;
            case 3:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 4:
                return akpq.p(i2) != 0;
            case 5:
                return apjr.b(i2) != null;
            case 6:
                return apkc.b(i2) != null;
            case 7:
                return akpq.o(i2) != 0;
            case 8:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 9:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 10:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 11:
                return akpq.n(i2) != 0;
            case 12:
                return akzj.s(i2) != 0;
            case 13:
                return apnb.b(i2) != null;
            case 14:
                return apnc.b(i2) != null;
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 16:
                return akzj.r(i2) != 0;
            case 17:
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
                        return true;
                    default:
                        return false;
                }
            case 18:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 19:
                return i2 == 0 || i2 == 1 || i2 == 2;
            default:
                if (akzj.q(i2) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
