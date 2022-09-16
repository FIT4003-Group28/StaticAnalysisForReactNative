package defpackage;
/* compiled from: PG */
/* renamed from: apfa  reason: default package */
/* loaded from: classes.dex */
public final class apfa implements aopo {
    private final /* synthetic */ int v;
    public static final aopo u = new apfa(20);
    public static final aopo t = new apfa(19);
    static final aopo s = new apfa(18);
    static final aopo r = new apfa(17);
    static final aopo q = new apfa(16);
    static final aopo p = new apfa(15);
    static final aopo o = new apfa(14);
    static final aopo n = new apfa(13);
    static final aopo m = new apfa(12);
    static final aopo l = new apfa(11);
    public static final aopo k = new apfa(10);
    static final aopo j = new apfa(9);
    static final aopo i = new apfa(8);
    static final aopo h = new apfa(7);
    static final aopo g = new apfa(6);
    static final aopo f = new apfa(5);
    static final aopo e = new apfa(4);
    static final aopo d = new apfa(3);
    static final aopo c = new apfa(2);
    static final aopo b = new apfa(1);
    static final aopo a = new apfa();

    private apfa() {
    }

    private apfa(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return apfb.a(i2) != 0;
            case 1:
                return apfb.b(i2) != 0;
            case 2:
                return apfu.d(i2) != 0;
            case 3:
                return apfi.b(i2) != null;
            case 4:
                return apfu.c(i2) != 0;
            case 5:
                return apfu.b(i2) != 0;
            case 6:
                return apfu.a(i2) != 0;
            case 7:
                return i2 == 0 || i2 == 2;
            case 8:
                return apgb.b(i2) != null;
            case 9:
                return apgc.b(i2) != null;
            case 10:
                return aphq.d(i2) != 0;
            case 11:
                return aphq.c(i2) != 0;
            case 12:
                return apgd.b(i2) != null;
            case 13:
                return apgo.b(i2) != null;
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
                        return true;
                    default:
                        return false;
                }
            case 15:
                return aphq.b(i2) != 0;
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
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return true;
                    default:
                        return false;
                }
            case 17:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 18:
                return akpq.u(i2) != 0;
            case 19:
                return akpq.t(i2) != 0;
            default:
                return i2 == 0 || i2 == 5 || i2 == 10 || i2 == 20 || i2 == 30;
        }
    }
}
