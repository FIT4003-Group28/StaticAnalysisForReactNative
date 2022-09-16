package defpackage;
/* compiled from: PG */
/* renamed from: ajjz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajjz implements ajkl {
    private final /* synthetic */ int l;
    public static final /* synthetic */ ajjz k = new ajjz(10);
    public static final /* synthetic */ ajjz j = new ajjz(9);
    public static final /* synthetic */ ajjz i = new ajjz(8);
    public static final /* synthetic */ ajjz h = new ajjz(7);
    public static final /* synthetic */ ajjz g = new ajjz(6);
    public static final /* synthetic */ ajjz f = new ajjz(5);
    public static final /* synthetic */ ajjz e = new ajjz(4);
    public static final /* synthetic */ ajjz d = new ajjz(3);
    public static final /* synthetic */ ajjz c = new ajjz(2);
    public static final /* synthetic */ ajjz b = new ajjz(1);
    public static final /* synthetic */ ajjz a = new ajjz();

    private /* synthetic */ ajjz() {
    }

    private /* synthetic */ ajjz(int i2) {
        this.l = i2;
    }

    @Override // defpackage.ajkl
    public final boolean a(Object obj) {
        aunf aunfVar = (aunf) obj;
        switch (this.l) {
            case 0:
                if ((aunfVar.e & 1073741824) != 0) {
                    return true;
                }
                break;
            case 1:
                return (aunfVar.f & 16) != 0;
            case 2:
                return (aunfVar.f & 2) != 0;
            case 3:
                return (aunfVar.e & 268435456) != 0;
            case 4:
                return (aunfVar.d & 4194304) != 0;
            case 5:
                return (aunfVar.d & 16777216) != 0;
            case 6:
                return (aunfVar.f & 1) != 0;
            case 7:
                return (aunfVar.e & 2) != 0;
            case 8:
                return (aunfVar.d & 1073741824) != 0;
            case 9:
                return (aunfVar.e & 8) != 0;
            default:
                if ((aunfVar.e & 1) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
