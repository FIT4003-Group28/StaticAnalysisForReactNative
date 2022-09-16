package defpackage;
/* compiled from: PG */
/* renamed from: agix  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agix implements ampg {
    private final /* synthetic */ int v;
    public static final /* synthetic */ agix u = new agix(20);
    public static final /* synthetic */ agix t = new agix(19);
    public static final /* synthetic */ agix s = new agix(18);
    public static final /* synthetic */ agix r = new agix(17);
    public static final /* synthetic */ agix q = new agix(16);
    public static final /* synthetic */ agix p = new agix(15);
    public static final /* synthetic */ agix o = new agix(14);
    public static final /* synthetic */ agix n = new agix(13);
    public static final /* synthetic */ agix m = new agix(12);
    public static final /* synthetic */ agix l = new agix(11);
    public static final /* synthetic */ agix k = new agix(10);
    public static final /* synthetic */ agix j = new agix(9);
    public static final /* synthetic */ agix i = new agix(8);
    public static final /* synthetic */ agix h = new agix(7);
    public static final /* synthetic */ agix g = new agix(6);
    public static final /* synthetic */ agix f = new agix(5);
    public static final /* synthetic */ agix e = new agix(4);
    public static final /* synthetic */ agix d = new agix(3);
    public static final /* synthetic */ agix c = new agix(2);
    public static final /* synthetic */ agix b = new agix(1);
    public static final /* synthetic */ agix a = new agix();

    private /* synthetic */ agix() {
    }

    private /* synthetic */ agix(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return ((agqa) obj).a;
            case 1:
                return new Exception((Throwable) obj);
            case 2:
                agot agotVar = (agot) obj;
                int i2 = agjz.r;
                return amuk.q();
            case 3:
                agot agotVar2 = (agot) obj;
                return amon.a;
            case 4:
                agot agotVar3 = (agot) obj;
                int i3 = agjz.r;
                return amuk.q();
            case 5:
                ampq ampqVar = (ampq) obj;
                if (!ampqVar.h()) {
                    return null;
                }
                aqqv aqqvVar = (aqqv) ampqVar.c();
                if ((aqqvVar.b.c & 16) == 0) {
                    return null;
                }
                return aqqvVar.getError();
            case 6:
                return ((ajff) obj).y();
            case 7:
                return ((agti) obj).a;
            case 8:
                return ((ajff) obj).O();
            case 9:
                return ((ahdk) obj).toString();
            case 10:
                return ((ajff) obj).r();
            case 11:
                return ((ajff) obj).A();
            case 12:
                return ((ajff) obj).H();
            case 13:
                return ((ajff) obj).K();
            case 14:
                return ((ajff) obj).t();
            case 15:
                return ((ajff) obj).I();
            case 16:
                return ((ajff) obj).L();
            case 17:
                return ((ajff) obj).U();
            case 18:
                return ((ajff) obj).B();
            case 19:
                return ((ajff) obj).D();
            default:
                return ((ajff) obj).E();
        }
    }
}
