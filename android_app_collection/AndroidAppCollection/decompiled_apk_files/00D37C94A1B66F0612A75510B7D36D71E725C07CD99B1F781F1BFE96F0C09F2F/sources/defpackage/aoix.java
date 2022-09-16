package defpackage;
/* compiled from: PG */
/* renamed from: aoix  reason: default package */
/* loaded from: classes.dex */
public final class aoix implements aopo {
    private final /* synthetic */ int v;
    public static final aopo u = new aoix(20);
    public static final aopo t = new aoix(19);
    public static final aopo s = new aoix(18);
    public static final aopo r = new aoix(17);
    public static final aopo q = new aoix(16);
    static final aopo p = new aoix(15);
    static final aopo o = new aoix(14);
    static final aopo n = new aoix(13);
    static final aopo m = new aoix(12);
    static final aopo l = new aoix(11);
    static final aopo k = new aoix(10);
    static final aopo j = new aoix(9);
    static final aopo i = new aoix(8);
    static final aopo h = new aoix(7);
    static final aopo g = new aoix(6);
    static final aopo f = new aoix(5);
    static final aopo e = new aoix(4);
    static final aopo d = new aoix(3);
    static final aopo c = new aoix(2);
    static final aopo b = new aoix(1);
    static final aopo a = new aoix();

    private aoix() {
    }

    private aoix(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return aolu.h(i2) != 0;
            case 1:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 2:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 3:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 4:
                return aojh.a(i2) != null;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 6:
                return aolu.g(i2) != 0;
            case 7:
                return aojl.a(i2) != null;
            case 8:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 9:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 10:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 11:
                return aolu.f(i2) != 0;
            case 12:
                return aojs.a(i2) != null;
            case 13:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 14:
                return aolu.e(i2) != 0;
            case 15:
                return aojw.a(i2) != null;
            case 16:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 17:
                return aolu.d(i2) != 0;
            case 18:
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
                        return true;
                    default:
                        return false;
                }
            case 19:
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
            default:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
        }
    }
}
