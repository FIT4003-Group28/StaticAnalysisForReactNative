package defpackage;
/* compiled from: PG */
/* renamed from: asnz  reason: default package */
/* loaded from: classes2.dex */
final class asnz implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new asnz(20);
    static final aopo t = new asnz(19);
    static final aopo s = new asnz(18);
    static final aopo r = new asnz(17);
    static final aopo q = new asnz(16);
    static final aopo p = new asnz(15);
    static final aopo o = new asnz(14);
    static final aopo n = new asnz(13);
    static final aopo m = new asnz(12);
    static final aopo l = new asnz(11);
    static final aopo k = new asnz(10);
    static final aopo j = new asnz(9);
    static final aopo i = new asnz(8);
    static final aopo h = new asnz(7);
    static final aopo g = new asnz(6);
    static final aopo f = new asnz(5);
    static final aopo e = new asnz(4);
    static final aopo d = new asnz(3);
    static final aopo c = new asnz(2);
    static final aopo b = new asnz(1);
    static final aopo a = new asnz();

    private asnz() {
    }

    private asnz(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 1:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 2:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 3:
                return asoi.b(i2) != null;
            case 4:
                return ason.b(i2) != null;
            case 5:
                return aspb.b(i2) != null;
            case 6:
                return aspv.b(i2) != null;
            case 7:
                return aspw.b(i2) != null;
            case 8:
                return akzj.z(i2) != 0;
            case 9:
                return akzj.y(i2) != 0;
            case 10:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 11:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 12:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 13:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 14:
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
                        return true;
                    default:
                        return false;
                }
            case 15:
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
                        return true;
                    default:
                        return false;
                }
            case 16:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
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
                        return true;
                    default:
                        return false;
                }
            case 18:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 19:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            default:
                return akzj.x(i2) != 0;
        }
    }
}
