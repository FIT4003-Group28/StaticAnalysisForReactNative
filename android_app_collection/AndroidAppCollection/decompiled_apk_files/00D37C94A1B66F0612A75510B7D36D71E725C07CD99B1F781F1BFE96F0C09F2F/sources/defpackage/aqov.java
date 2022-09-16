package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqov  reason: default package */
/* loaded from: classes2.dex */
public final class aqov implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new aqov(20);
    static final aopo t = new aqov(19);
    static final aopo s = new aqov(18);
    static final aopo r = new aqov(17);
    static final aopo q = new aqov(16);
    static final aopo p = new aqov(15);
    static final aopo o = new aqov(14);
    static final aopo n = new aqov(13);
    static final aopo m = new aqov(12);
    static final aopo l = new aqov(11);
    static final aopo k = new aqov(10);
    static final aopo j = new aqov(9);
    static final aopo i = new aqov(8);
    static final aopo h = new aqov(7);
    static final aopo g = new aqov(6);
    static final aopo f = new aqov(5);
    static final aopo e = new aqov(4);
    static final aopo d = new aqov(3);
    static final aopo c = new aqov(2);
    static final aopo b = new aqov(1);
    static final aopo a = new aqov();

    private aqov() {
    }

    private aqov(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return aqow.b(i2) != null;
            case 1:
                return aqos.b(i2) != null;
            case 2:
                return i2 == 0 || i2 == 1;
            case 3:
                return aqpa.b(i2) != null;
            case 4:
                return aqvb.f(i2) != 0;
            case 5:
                return aqvb.e(i2) != 0;
            case 6:
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
            case 7:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 8:
                return aqvb.d(i2) != 0;
            case 9:
                return aqvb.c(i2) != 0;
            case 10:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 11:
                return aqvb.b(i2) != 0;
            case 12:
                return aqtw.b(i2) != null;
            case 13:
                return aqtx.b(i2) != null;
            case 14:
                return aqvb.a(i2) != 0;
            case 15:
                return amnt.B(i2) != 0;
            case 16:
                return amnt.A(i2) != 0;
            case 17:
                return amnt.z(i2) != 0;
            case 18:
                return aqvi.b(i2) != null;
            case 19:
                return amnt.y(i2) != 0;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
        }
    }
}
