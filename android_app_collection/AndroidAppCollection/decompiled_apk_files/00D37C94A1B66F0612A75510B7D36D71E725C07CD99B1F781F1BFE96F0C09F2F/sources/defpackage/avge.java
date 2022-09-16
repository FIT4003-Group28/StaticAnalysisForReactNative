package defpackage;
/* compiled from: PG */
/* renamed from: avge  reason: default package */
/* loaded from: classes2.dex */
public final class avge implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new avge(20);
    static final aopo t = new avge(19);
    static final aopo s = new avge(18);
    static final aopo r = new avge(17);
    public static final aopo q = new avge(16);
    static final aopo p = new avge(15);
    static final aopo o = new avge(14);
    static final aopo n = new avge(13);
    public static final aopo m = new avge(12);
    static final aopo l = new avge(11);
    static final aopo k = new avge(10);
    static final aopo j = new avge(9);
    static final aopo i = new avge(8);
    public static final aopo h = new avge(7);
    static final aopo g = new avge(6);
    static final aopo f = new avge(5);
    static final aopo e = new avge(4);
    static final aopo d = new avge(3);
    static final aopo c = new avge(2);
    static final aopo b = new avge(1);
    static final aopo a = new avge();

    private avge() {
    }

    private avge(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return i2 == 0 || i2 == 1;
            case 1:
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
            case 2:
                return avgg.b(i2) != null;
            case 3:
                return awwc.av(i2) != 0;
            case 4:
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
            case 5:
                return awwc.au(i2) != 0;
            case 6:
                return awwc.at(i2) != 0;
            case 7:
                return awwc.as(i2) != 0;
            case 8:
                return i2 == 0 || i2 == 1;
            case 9:
                return awwc.ar(i2) != 0;
            case 10:
                return awwc.aq(i2) != 0;
            case 11:
                return awwc.ap(i2) != 0;
            case 12:
                return awwc.ao(i2) != 0;
            case 13:
                return avkb.b(i2) != null;
            case 14:
                return avkl.b(i2) != null;
            case 15:
                return avkm.b(i2) != null;
            case 16:
                return awwc.an(i2) != 0;
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
                        return true;
                    default:
                        return false;
                }
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
            case 19:
                return i2 == 0 || i2 == 1 || i2 == 2;
            default:
                return avuf.b(i2) != null;
        }
    }
}
