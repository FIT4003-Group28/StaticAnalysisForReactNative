package defpackage;
/* compiled from: PG */
/* renamed from: atti  reason: default package */
/* loaded from: classes2.dex */
final class atti implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new atti(20);
    static final aopo t = new atti(19);
    static final aopo s = new atti(18);
    static final aopo r = new atti(17);
    static final aopo q = new atti(16);
    static final aopo p = new atti(15);
    static final aopo o = new atti(14);
    static final aopo n = new atti(13);
    static final aopo m = new atti(12);
    static final aopo l = new atti(11);
    static final aopo k = new atti(10);
    static final aopo j = new atti(9);
    static final aopo i = new atti(8);
    static final aopo h = new atti(7);
    static final aopo g = new atti(6);
    static final aopo f = new atti(5);
    static final aopo e = new atti(4);
    static final aopo d = new atti(3);
    static final aopo c = new atti(2);
    static final aopo b = new atti(1);
    static final aopo a = new atti();

    private atti() {
    }

    private atti(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return attj.b(i2) != null;
            case 1:
                return atsp.b(i2) != null;
            case 2:
                return attl.b(i2) != null;
            case 3:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 4:
                return atvd.b(i2) != null;
            case 5:
                return akel.af(i2) != 0;
            case 6:
                return atvo.b(i2) != null;
            case 7:
                return akel.ae(i2) != 0;
            case 8:
                return atxd.b(i2) != null;
            case 9:
                return awwc.ck(i2) != 0;
            case 10:
                return atxl.b(i2) != null;
            case 11:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 12:
                return awwc.cj(i2) != 0;
            case 13:
                return atyc.b(i2) != null;
            case 14:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 15:
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
            case 16:
                return atyx.b(i2) != null;
            case 17:
                return atyy.b(i2) != null;
            case 18:
                return awwc.ci(i2) != 0;
            case 19:
                return i2 == 0 || i2 == 1 || i2 == 2;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
        }
    }
}
