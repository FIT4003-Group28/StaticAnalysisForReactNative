package defpackage;
/* compiled from: PG */
/* renamed from: aqfh  reason: default package */
/* loaded from: classes2.dex */
public final class aqfh implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new aqfh(20);
    static final aopo t = new aqfh(19);
    static final aopo s = new aqfh(18);
    static final aopo r = new aqfh(17);
    static final aopo q = new aqfh(16);
    static final aopo p = new aqfh(15);
    static final aopo o = new aqfh(14);
    static final aopo n = new aqfh(13);
    static final aopo m = new aqfh(12);
    static final aopo l = new aqfh(11);
    static final aopo k = new aqfh(10);
    static final aopo j = new aqfh(9);
    static final aopo i = new aqfh(8);
    static final aopo h = new aqfh(7);
    static final aopo g = new aqfh(6);
    static final aopo f = new aqfh(5);
    static final aopo e = new aqfh(4);
    static final aopo d = new aqfh(3);
    static final aopo c = new aqfh(2);
    static final aopo b = new aqfh(1);
    public static final aopo a = new aqfh();

    private aqfh() {
    }

    private aqfh(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (aqgn.b(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return aqgn.c(i2) != 0;
            case 2:
                return aqgn.a(i2) != 0;
            case 3:
                return aqmv.h(i2) != 0;
            case 4:
                return aqmv.g(i2) != 0;
            case 5:
                return aqmv.f(i2) != 0;
            case 6:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 7:
                return aqkb.b(i2) != null;
            case 8:
                return aqmv.e(i2) != 0;
            case 9:
                return aqmv.d(i2) != 0;
            case 10:
                return aqmv.c(i2) != 0;
            case 11:
                return aqll.b(i2) != null;
            case 12:
                return aqmv.b(i2) != 0;
            case 13:
                return aqlv.b(i2) != null;
            case 14:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 15:
                return aqmv.a(i2) != 0;
            case 16:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 17:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 18:
                return aqvb.h(i2) != 0;
            case 19:
                return aqob.b(i2) != null;
            default:
                if (aqvb.g(i2) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
