package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: avxs  reason: default package */
/* loaded from: classes2.dex */
public final class avxs implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new avxs(20);
    static final aopo t = new avxs(19);
    static final aopo s = new avxs(18);
    static final aopo r = new avxs(17);
    static final aopo q = new avxs(16);
    static final aopo p = new avxs(15);
    static final aopo o = new avxs(14);
    static final aopo n = new avxs(13);
    static final aopo m = new avxs(12);
    static final aopo l = new avxs(11);
    static final aopo k = new avxs(10);
    static final aopo j = new avxs(9);
    static final aopo i = new avxs(8);
    static final aopo h = new avxs(7);
    static final aopo g = new avxs(6);
    static final aopo f = new avxs(5);
    static final aopo e = new avxs(4);
    static final aopo d = new avxs(3);
    static final aopo c = new avxs(2);
    static final aopo b = new avxs(1);
    static final aopo a = new avxs();

    private avxs() {
    }

    private avxs(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return avxt.b(i2) != null;
            case 1:
                return awwc.ac(i2) != 0;
            case 2:
                return avxu.b(i2) != null;
            case 3:
                return avxv.b(i2) != null;
            case 4:
                return awwc.ab(i2) != 0;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2;
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
                        return true;
                    default:
                        return false;
                }
            case 7:
                return avxw.b(i2) != null;
            case 8:
                return avxx.b(i2) != null;
            case 9:
                return avyq.b(i2) != null;
            case 10:
                return awwc.aa(i2) != 0;
            case 11:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 12:
                return awal.b(i2) != null;
            case 13:
                return awan.b(i2) != null;
            case 14:
                return awwc.Z(i2) != 0;
            case 15:
                return awbc.b(i2) != null;
            case 16:
                return awbd.b(i2) != null;
            case 17:
                return i2 == 0 || i2 == 1;
            case 18:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 19:
                return i2 == 0 || i2 == 1 || i2 == 2;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2;
        }
    }
}
