package defpackage;
/* compiled from: PG */
/* renamed from: atdq  reason: default package */
/* loaded from: classes2.dex */
public final class atdq implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new atdq(20);
    static final aopo t = new atdq(19);
    public static final aopo s = new atdq(18);
    static final aopo r = new atdq(17);
    static final aopo q = new atdq(16);
    static final aopo p = new atdq(15);
    public static final aopo o = new atdq(14);
    public static final aopo n = new atdq(13);
    public static final aopo m = new atdq(12);
    static final aopo l = new atdq(11);
    static final aopo k = new atdq(10);
    static final aopo j = new atdq(9);
    static final aopo i = new atdq(8);
    static final aopo h = new atdq(7);
    static final aopo g = new atdq(6);
    static final aopo f = new atdq(5);
    static final aopo e = new atdq(4);
    static final aopo d = new atdq(3);
    static final aopo c = new atdq(2);
    static final aopo b = new atdq(1);
    static final aopo a = new atdq();

    private atdq() {
    }

    private atdq(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (almu.O(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                return almu.P(i2) != 0;
            case 2:
                return almu.N(i2) != 0;
            case 3:
                return almu.M(i2) != 0;
            case 4:
                return almu.L(i2) != 0;
            case 5:
                return akel.aI(i2) != 0;
            case 6:
                return akel.aH(i2) != 0;
            case 7:
                return akel.aG(i2) != 0;
            case 8:
                return athb.b(i2) != null;
            case 9:
                return akel.aF(i2) != 0;
            case 10:
                return akel.aE(i2) != 0;
            case 11:
                return akel.aD(i2) != 0;
            case 12:
                return akel.aC(i2) != 0;
            case 13:
                return akel.aB(i2) != 0;
            case 14:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 15:
                return atnw.b(i2) != null;
            case 16:
                return atom.b(i2) != null;
            case 17:
                return atos.b(i2) != null;
            case 18:
                return akel.aA(i2) != 0;
            case 19:
                return akel.az(i2) != 0;
            default:
                if (akel.ay(i2) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
