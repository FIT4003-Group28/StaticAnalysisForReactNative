package defpackage;
/* compiled from: PG */
/* renamed from: ajjy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajjy implements ajkk {
    private final /* synthetic */ int l;
    public static final /* synthetic */ ajjy k = new ajjy(10);
    public static final /* synthetic */ ajjy j = new ajjy(9);
    public static final /* synthetic */ ajjy i = new ajjy(8);
    public static final /* synthetic */ ajjy h = new ajjy(7);
    public static final /* synthetic */ ajjy g = new ajjy(6);
    public static final /* synthetic */ ajjy f = new ajjy(5);
    public static final /* synthetic */ ajjy e = new ajjy(4);
    public static final /* synthetic */ ajjy d = new ajjy(3);
    public static final /* synthetic */ ajjy c = new ajjy(2);
    public static final /* synthetic */ ajjy b = new ajjy(1);
    public static final /* synthetic */ ajjy a = new ajjy();

    private /* synthetic */ ajjy() {
    }

    private /* synthetic */ ajjy(int i2) {
        this.l = i2;
    }

    @Override // defpackage.ajkk
    public final Object a(Object obj) {
        int i2 = 1;
        r1 = true;
        boolean z = true;
        switch (this.l) {
            case 0:
                return Boolean.valueOf(((aunf) obj).z);
            case 1:
                return Boolean.valueOf(((aunf) obj).p);
            case 2:
                return Integer.valueOf(((aunf) obj).r);
            case 3:
                return Boolean.valueOf(((aunf) obj).s);
            case 4:
                return Boolean.valueOf(((aunf) obj).t);
            case 5:
                return Integer.valueOf(((aunf) obj).P);
            case 6:
                return Float.valueOf(((aunf) obj).R);
            case 7:
                return Boolean.valueOf(((aunf) obj).O);
            case 8:
                return Boolean.valueOf(((aunf) obj).Q);
            case 9:
                amuk amukVar = ajke.a;
                if (true == ((aunf) obj).j.equals("canary")) {
                    i2 = 2;
                }
                return Integer.valueOf(i2);
            default:
                amuk amukVar2 = ajke.a;
                aunf aunfVar = (aunf) obj;
                if (!aunfVar.u && !aunfVar.v) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
