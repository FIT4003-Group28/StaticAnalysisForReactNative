package defpackage;
/* compiled from: PG */
/* renamed from: dnn  reason: default package */
/* loaded from: classes3.dex */
public final class dnn implements aopo {
    private final /* synthetic */ int v;
    public static final aopo u = new dnn(20);
    public static final aopo t = new dnn(19);
    public static final aopo s = new dnn(18);
    public static final aopo r = new dnn(17);
    public static final aopo q = new dnn(16);
    public static final aopo p = new dnn(15);
    public static final aopo o = new dnn(14);
    public static final aopo n = new dnn(13);
    public static final aopo m = new dnn(12);
    public static final aopo l = new dnn(11);
    public static final aopo k = new dnn(10);
    public static final aopo j = new dnn(9);
    public static final aopo i = new dnn(8);
    public static final aopo h = new dnn(7);
    public static final aopo g = new dnn(6);
    public static final aopo f = new dnn(5);
    public static final aopo e = new dnn(4);
    public static final aopo d = new dnn(3);
    static final aopo c = new dnn(2);
    static final aopo b = new dnn(1);
    static final aopo a = new dnn();

    private dnn() {
    }

    private dnn(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (dno.a(i2) != null) {
                    return true;
                }
                break;
            case 1:
                return dnt.c(i2) != 0;
            case 2:
                return dnt.b(i2) != 0;
            case 3:
                return dnt.a(i2) != 0;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 1000;
            case 6:
                return ehi.c(i2) != 0;
            case 7:
                return dwg.a(i2) != null;
            case 8:
                return eoe.a(i2) != null;
            case 9:
                return ord.b(i2) != 0;
            case 10:
                return ord.a(i2) != 0;
            case 11:
                return orl.a(i2) != null;
            case 12:
                return orw.a(i2) != null;
            case 13:
                return osz.c(i2) != 0;
            case 14:
                return qfl.i(i2) != 0;
            case 15:
                return qzv.l(i2) != 0;
            case 16:
                return qzv.k(i2) != 0;
            case 17:
                return rpy.b(i2) != 0;
            case 18:
                return rpy.a(i2) != 0;
            case 19:
                return rqt.c(i2) != 0;
            default:
                if (smj.a(i2) != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
