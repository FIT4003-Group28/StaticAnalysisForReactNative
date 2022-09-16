package defpackage;
/* compiled from: PG */
/* renamed from: atqy  reason: default package */
/* loaded from: classes2.dex */
public final class atqy implements aopo {
    private final /* synthetic */ int v;
    public static final aopo u = new atqy(20);
    static final aopo t = new atqy(19);
    static final aopo s = new atqy(18);
    static final aopo r = new atqy(17);
    static final aopo q = new atqy(16);
    static final aopo p = new atqy(15);
    static final aopo o = new atqy(14);
    static final aopo n = new atqy(13);
    static final aopo m = new atqy(12);
    public static final aopo l = new atqy(11);
    public static final aopo k = new atqy(10);
    static final aopo j = new atqy(9);
    static final aopo i = new atqy(8);
    static final aopo h = new atqy(7);
    static final aopo g = new atqy(6);
    static final aopo f = new atqy(5);
    static final aopo e = new atqy(4);
    static final aopo d = new atqy(3);
    static final aopo c = new atqy(2);
    static final aopo b = new atqy(1);
    static final aopo a = new atqy();

    private atqy() {
    }

    private atqy(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 1:
                return akel.as(i2) != 0;
            case 2:
                return akel.ar(i2) != 0;
            case 3:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 5:
                return atra.b(i2) != null;
            case 6:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 7:
                return akel.aq(i2) != 0;
            case 8:
                return akel.ap(i2) != 0;
            case 9:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 10:
                return akel.ao(i2) != 0;
            case 11:
                return akel.an(i2) != 0;
            case 12:
                return atru.b(i2) != null;
            case 13:
                return akel.am(i2) != 0;
            case 14:
                return akel.al(i2) != 0;
            case 15:
                return akel.ak(i2) != 0;
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
                        return true;
                    default:
                        return false;
                }
            case 17:
                return atsg.b(i2) != null;
            case 18:
                return akel.aj(i2) != 0;
            case 19:
                return akel.ai(i2) != 0;
            default:
                return akel.ag(i2) != 0;
        }
    }
}
