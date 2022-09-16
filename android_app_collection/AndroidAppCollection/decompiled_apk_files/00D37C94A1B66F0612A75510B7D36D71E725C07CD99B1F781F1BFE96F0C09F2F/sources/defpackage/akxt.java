package defpackage;
/* compiled from: PG */
/* renamed from: akxt  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akxt implements ayqf {
    private final /* synthetic */ int j;
    public static final /* synthetic */ akxt i = new akxt(8);
    public static final /* synthetic */ akxt h = new akxt(7);
    public static final /* synthetic */ akxt g = new akxt(6);
    public static final /* synthetic */ akxt f = new akxt(5);
    public static final /* synthetic */ akxt e = new akxt(4);
    public static final /* synthetic */ akxt d = new akxt(3);
    public static final /* synthetic */ akxt c = new akxt(2);
    public static final /* synthetic */ akxt b = new akxt(1);
    public static final /* synthetic */ akxt a = new akxt();

    private /* synthetic */ akxt() {
    }

    public /* synthetic */ akxt(int i2) {
        this.j = i2;
    }

    @Override // defpackage.ayqf
    public final boolean a(Object obj) {
        switch (this.j) {
            case 0:
                return (((alcw) obj).b & 16) != 0;
            case 1:
                return (((alcw) obj).b & 16384) != 0;
            case 2:
                return (((alcw) obj).b & 32) != 0;
            case 3:
                return (((alcw) obj).b & 2) != 0;
            case 4:
                return (((alcw) obj).b & 128) != 0;
            case 5:
                return (((alcw) obj).d & 8) != 0;
            case 6:
                int i2 = akxz.s;
                return ((alcw) obj).R.size() > 0;
            case 7:
                alcw alcwVar = (alcw) obj;
                return !alcwVar.s || alcwVar.t;
            case 8:
                return (((alcw) obj).b & 4) != 0;
            default:
                return true;
        }
    }
}
