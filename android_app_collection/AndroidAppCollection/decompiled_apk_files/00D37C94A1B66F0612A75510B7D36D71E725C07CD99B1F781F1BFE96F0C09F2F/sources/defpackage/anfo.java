package defpackage;
/* compiled from: PG */
/* renamed from: anfo  reason: default package */
/* loaded from: classes.dex */
public final class anfo implements aopo {
    private final /* synthetic */ int u;
    public static final aopo t = new anfo(20);
    public static final aopo s = new anfo(19);
    public static final aopo r = new anfo(18);
    public static final aopo q = new anfo(17);
    public static final aopo p = new anfo(16);
    public static final aopo o = new anfo(15);
    public static final aopo n = new anfo(14);
    public static final aopo m = new anfo(13);
    public static final aopo l = new anfo(12);
    public static final aopo k = new anfo(11);
    public static final aopo j = new anfo(10);
    public static final aopo i = new anfo(9);
    public static final aopo h = new anfo(8);
    public static final aopo g = new anfo(7);
    public static final aopo f = new anfo(6);
    public static final aopo e = new anfo(5);
    public static final aopo d = new anfo(4);
    public static final aopo c = new anfo(3);
    public static final aopo b = new anfo(2);
    public static final aopo a = new anfo(1);
    static final aopo INSTANCE = new anfo();

    private anfo() {
    }

    private anfo(int i2) {
        this.u = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.u) {
            case 0:
                return anfp.a(i2) != null;
            case 1:
                return anfx.a(i2) != null;
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
                        return true;
                    default:
                        return false;
                }
            case 3:
                return anha.b(i2) != 0;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 5:
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
            case 6:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 7:
                return anhc.c(i2) != 0;
            case 8:
                return anhc.b(i2) != 0;
            case 9:
                return anhe.d(i2) != 0;
            case 10:
                return ancv.o(i2) != 0;
            case 11:
                return anvh.a(i2) != null;
            case 12:
                return anvp.a(i2) != null;
            case 13:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 14:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 15:
                return aoex.a(i2) != 0;
            case 16:
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
            case 17:
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
            case 18:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 19:
                return i2 == 0 || i2 == 1 || i2 == 2;
            default:
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
        }
    }
}
