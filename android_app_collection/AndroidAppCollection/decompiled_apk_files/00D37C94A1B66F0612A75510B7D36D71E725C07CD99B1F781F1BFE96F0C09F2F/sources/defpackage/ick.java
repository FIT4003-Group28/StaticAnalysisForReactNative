package defpackage;
/* compiled from: PG */
/* renamed from: ick  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ick implements ayqb {
    private final /* synthetic */ int u;
    public static final /* synthetic */ ick t = new ick(20);
    public static final /* synthetic */ ick s = new ick(19);
    public static final /* synthetic */ ick r = new ick(18);
    public static final /* synthetic */ ick q = new ick(17);
    public static final /* synthetic */ ick p = new ick(16);
    public static final /* synthetic */ ick o = new ick(15);
    public static final /* synthetic */ ick n = new ick(14);
    public static final /* synthetic */ ick m = new ick(13);
    public static final /* synthetic */ ick l = new ick(12);
    public static final /* synthetic */ ick k = new ick(11);
    public static final /* synthetic */ ick j = new ick(10);
    public static final /* synthetic */ ick i = new ick(9);
    public static final /* synthetic */ ick h = new ick(8);
    public static final /* synthetic */ ick g = new ick(6);
    public static final /* synthetic */ ick f = new ick(5);
    public static final /* synthetic */ ick e = new ick(4);
    public static final /* synthetic */ ick d = new ick(3);
    public static final /* synthetic */ ick c = new ick(2);
    public static final /* synthetic */ ick b = new ick(1);
    public static final /* synthetic */ ick a = new ick();

    private /* synthetic */ ick() {
    }

    public /* synthetic */ ick(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        switch (this.u) {
            case 0:
                zna.q((Throwable) obj);
                return;
            case 1:
                zna.q((Throwable) obj);
                return;
            case 2:
                zna.q((Throwable) obj);
                return;
            case 3:
                zep.d("Failed to get offline guide response", (Throwable) obj);
                return;
            case 4:
                zna.q((Throwable) obj);
                return;
            case 5:
                zna.q((Throwable) obj);
                return;
            case 6:
                zna.q((Throwable) obj);
                return;
            case 7:
                jbj jbjVar = (jbj) obj;
                String simpleName = jbjVar.b.getSimpleName();
                String valueOf = String.valueOf(jbjVar.a);
                String.valueOf(simpleName).length();
                String.valueOf(valueOf).length();
                ylr.b();
                jbjVar.c.run();
                return;
            case 8:
                amvn amvnVar = jcq.a;
                zep.d("Could not commit initial entities for downloads library.", (Throwable) obj);
                return;
            case 9:
                zep.d("Failed to observe DownloadRecsFlag", (Throwable) obj);
                return;
            case 10:
                zna.q((Throwable) obj);
                return;
            case 11:
                ((jhr) obj).a.length();
                return;
            case 12:
                ampr amprVar = (ampr) obj;
                ((jhr) amprVar.a).c.a(amprVar.b);
                return;
            case 13:
                zep.d("Could not transform item", (Throwable) obj);
                return;
            case 14:
                zep.d("Error observing on registerFaultObservers", (Throwable) obj);
                return;
            case 15:
                zep.d("Failed to initialize Smart Downloads opt in setting observer.", (Throwable) obj);
                return;
            case 16:
                zep.d("Error observing on offlineGenerationStatusForVideos", (Throwable) obj);
                return;
            case 17:
                zep.d("Error observing on downloaded video entity", (Throwable) obj);
                return;
            case 18:
                zna.q((Throwable) obj);
                return;
            case 19:
                zna.q((Throwable) obj);
                return;
            default:
                zna.q((Throwable) obj);
                return;
        }
    }
}
