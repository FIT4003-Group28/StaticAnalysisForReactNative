package defpackage;
/* compiled from: PG */
/* renamed from: avuh  reason: default package */
/* loaded from: classes2.dex */
public final class avuh implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new avuh(20);
    static final aopo t = new avuh(19);
    static final aopo s = new avuh(18);
    public static final aopo r = new avuh(17);
    static final aopo q = new avuh(16);
    static final aopo p = new avuh(15);
    static final aopo o = new avuh(14);
    static final aopo n = new avuh(13);
    static final aopo m = new avuh(12);
    public static final aopo l = new avuh(11);
    static final aopo k = new avuh(10);
    static final aopo j = new avuh(9);
    static final aopo i = new avuh(8);
    static final aopo h = new avuh(7);
    static final aopo g = new avuh(6);
    static final aopo f = new avuh(5);
    static final aopo e = new avuh(4);
    static final aopo d = new avuh(3);
    static final aopo c = new avuh(2);
    static final aopo b = new avuh(1);
    static final aopo a = new avuh();

    private avuh() {
    }

    private avuh(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (avui.b(i2) != null) {
                    return true;
                }
                break;
            case 1:
                return avug.b(i2) != null;
            case 2:
                return avuj.b(i2) != null;
            case 3:
                return awwc.ak(i2) != 0;
            case 4:
                return avuk.b(i2) != null;
            case 5:
                return avul.b(i2) != null;
            case 6:
                return avum.b(i2) != null;
            case 7:
                return avun.b(i2) != null;
            case 8:
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
                        return true;
                    default:
                        return false;
                }
            case 9:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 10:
                return avuo.b(i2) != null;
            case 11:
                return awwc.aj(i2) != 0;
            case 12:
                return awwc.ai(i2) != 0;
            case 13:
                return awwc.ah(i2) != 0;
            case 14:
                return i2 == 0 || i2 == 1;
            case 15:
                return avvp.b(i2) != null;
            case 16:
                return avvq.b(i2) != null;
            case 17:
                return awwc.ag(i2) != 0;
            case 18:
                return awwc.af(i2) != 0;
            case 19:
                return awwc.ae(i2) != 0;
            default:
                if (awwc.ad(i2) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
