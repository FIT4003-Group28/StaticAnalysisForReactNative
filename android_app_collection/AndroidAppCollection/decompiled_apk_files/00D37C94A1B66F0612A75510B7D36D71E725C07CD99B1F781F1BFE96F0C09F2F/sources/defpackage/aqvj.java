package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqvj  reason: default package */
/* loaded from: classes2.dex */
public final class aqvj implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new aqvj(20);
    static final aopo t = new aqvj(19);
    static final aopo s = new aqvj(18);
    static final aopo r = new aqvj(17);
    static final aopo q = new aqvj(16);
    static final aopo p = new aqvj(15);
    static final aopo o = new aqvj(14);
    static final aopo n = new aqvj(13);
    static final aopo m = new aqvj(12);
    static final aopo l = new aqvj(11);
    static final aopo k = new aqvj(10);
    static final aopo j = new aqvj(9);
    static final aopo i = new aqvj(8);
    static final aopo h = new aqvj(7);
    static final aopo g = new aqvj(6);
    static final aopo f = new aqvj(5);
    static final aopo e = new aqvj(4);
    static final aopo d = new aqvj(3);
    static final aopo c = new aqvj(2);
    static final aopo b = new aqvj(1);
    static final aopo a = new aqvj();

    private aqvj() {
    }

    private aqvj(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (aqvk.b(i2) != null) {
                    return true;
                }
                break;
            case 1:
                return amnt.x(i2) != 0;
            case 2:
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
                        return true;
                    default:
                        return false;
                }
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
                        return true;
                    default:
                        return false;
                }
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 5:
                return amnt.w(i2) != 0;
            case 6:
                return amnt.v(i2) != 0;
            case 7:
                return amnt.u(i2) != 0;
            case 8:
                return aqxo.h(i2) != 0;
            case 9:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 10:
                return aqxo.g(i2) != 0;
            case 11:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 12:
                return aqxo.f(i2) != 0;
            case 13:
                return aqxo.e(i2) != 0;
            case 14:
                return aqxo.d(i2) != 0;
            case 15:
                return aqws.b(i2) != null;
            case 16:
                return aqwt.b(i2) != null;
            case 17:
                return aqwv.b(i2) != null;
            case 18:
                return aqxo.c(i2) != 0;
            case 19:
                return aqxo.b(i2) != 0;
            default:
                if (aqxo.a(i2) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
