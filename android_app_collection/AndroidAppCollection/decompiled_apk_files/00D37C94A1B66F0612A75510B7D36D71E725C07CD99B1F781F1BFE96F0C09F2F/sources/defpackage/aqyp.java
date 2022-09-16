package defpackage;
/* compiled from: PG */
/* renamed from: aqyp  reason: default package */
/* loaded from: classes2.dex */
public final class aqyp implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new aqyp(20);
    public static final aopo t = new aqyp(19);
    static final aopo s = new aqyp(18);
    static final aopo r = new aqyp(17);
    static final aopo q = new aqyp(16);
    public static final aopo p = new aqyp(15);
    static final aopo o = new aqyp(14);
    static final aopo n = new aqyp(13);
    static final aopo m = new aqyp(12);
    static final aopo l = new aqyp(11);
    static final aopo k = new aqyp(10);
    static final aopo j = new aqyp(9);
    static final aopo i = new aqyp(8);
    static final aopo h = new aqyp(7);
    static final aopo g = new aqyp(6);
    static final aopo f = new aqyp(5);
    public static final aopo e = new aqyp(4);
    static final aopo d = new aqyp(3);
    static final aopo c = new aqyp(2);
    static final aopo b = new aqyp(1);
    public static final aopo a = new aqyp();

    private aqyp() {
    }

    private aqyp(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (araa.g(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return araa.h(i2) != 0;
            case 2:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 3:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 4:
                return araa.f(i2) != 0;
            case 5:
                return aqzj.b(i2) != null;
            case 6:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 7:
                return araa.e(i2) != 0;
            case 8:
                return araa.d(i2) != 0;
            case 9:
                return araa.c(i2) != 0;
            case 10:
                return araa.b(i2) != 0;
            case 11:
                return araa.a(i2) != 0;
            case 12:
                return arey.h(i2) != 0;
            case 13:
                return arey.g(i2) != 0;
            case 14:
                return arey.f(i2) != 0;
            case 15:
                return arey.e(i2) != 0;
            case 16:
                return arey.d(i2) != 0;
            case 17:
                return arey.c(i2) != 0;
            case 18:
                return i2 == 0 || i2 == 1 || i2 == 4 || i2 == 6 || i2 == 7;
            case 19:
                return arey.b(i2) != 0;
            default:
                if (ardw.b(i2) != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
