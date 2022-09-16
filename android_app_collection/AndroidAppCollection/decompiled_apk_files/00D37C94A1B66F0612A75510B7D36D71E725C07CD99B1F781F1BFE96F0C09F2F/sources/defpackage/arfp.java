package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arfp  reason: default package */
/* loaded from: classes2.dex */
public final class arfp implements aopo {
    private final /* synthetic */ int v;
    static final aopo u = new arfp(20);
    static final aopo t = new arfp(19);
    static final aopo s = new arfp(18);
    static final aopo r = new arfp(17);
    static final aopo q = new arfp(16);
    static final aopo p = new arfp(15);
    static final aopo o = new arfp(14);
    static final aopo n = new arfp(13);
    static final aopo m = new arfp(12);
    static final aopo l = new arfp(11);
    static final aopo k = new arfp(10);
    static final aopo j = new arfp(9);
    static final aopo i = new arfp(8);
    static final aopo h = new arfp(7);
    static final aopo g = new arfp(6);
    static final aopo f = new arfp(5);
    static final aopo e = new arfp(4);
    static final aopo d = new arfp(3);
    static final aopo c = new arfp(2);
    static final aopo b = new arfp(1);
    static final aopo a = new arfp();

    private arfp() {
    }

    private arfp(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aopo
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 1:
                return arey.a(i2) != 0;
            case 2:
                return i2 == 0 || i2 == 1 || i2 == 5 || i2 == 6 || i2 == 7;
            case 3:
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
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 6:
                return i2 == 0 || i2 == 1;
            case 7:
                return akel.ac(i2) != 0;
            case 8:
                return akel.ab(i2) != 0;
            case 9:
                return akel.aa(i2) != 0;
            case 10:
                return akel.Z(i2) != 0;
            case 11:
                return akel.Y(i2) != 0;
            case 12:
                return akel.X(i2) != 0;
            case 13:
                return akel.W(i2) != 0;
            case 14:
                return arhr.b(i2) != null;
            case 15:
                return akel.V(i2) != 0;
            case 16:
                return akel.U(i2) != 0;
            case 17:
                return arjm.b(i2) != null;
            case 18:
                return akel.T(i2) != 0;
            case 19:
                return arjo.b(i2) != null;
            default:
                return arjy.b(i2) != null;
        }
    }
}
