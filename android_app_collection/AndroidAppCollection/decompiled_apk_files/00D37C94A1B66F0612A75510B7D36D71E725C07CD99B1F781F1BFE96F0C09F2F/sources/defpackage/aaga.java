package defpackage;
/* compiled from: PG */
/* renamed from: aaga  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aaga implements ayqb {
    private final /* synthetic */ int p;
    public static final /* synthetic */ aaga o = new aaga(20);
    public static final /* synthetic */ aaga n = new aaga(19);
    public static final /* synthetic */ aaga m = new aaga(17);
    public static final /* synthetic */ aaga l = new aaga(16);
    public static final /* synthetic */ aaga k = new aaga(15);
    public static final /* synthetic */ aaga j = new aaga(14);
    public static final /* synthetic */ aaga i = new aaga(13);
    public static final /* synthetic */ aaga h = new aaga(12);
    public static final /* synthetic */ aaga g = new aaga(11);
    public static final /* synthetic */ aaga f = new aaga(10);
    public static final /* synthetic */ aaga e = new aaga(9);
    public static final /* synthetic */ aaga d = new aaga(7);
    public static final /* synthetic */ aaga c = new aaga(6);
    public static final /* synthetic */ aaga b = new aaga(5);
    public static final /* synthetic */ aaga a = new aaga();

    private /* synthetic */ aaga() {
    }

    public /* synthetic */ aaga(int i2) {
        this.p = i2;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        switch (this.p) {
            case 0:
                return;
            case 1:
                Throwable th = (Throwable) obj;
                return;
            case 2:
                aaqd.m("ads", (Throwable) obj);
                return;
            case 3:
                aaqd.m("cold", (Throwable) obj);
                return;
            case 4:
                aaqd.m("hot", (Throwable) obj);
                return;
            case 5:
                zep.d("Error updating entity store.", (Throwable) obj);
                return;
            case 6:
                zep.d("Error updating entity store.", (Throwable) obj);
                return;
            case 7:
                zna.q((Throwable) obj);
                return;
            case 8:
                Throwable th2 = (Throwable) obj;
                return;
            case 9:
                String valueOf = String.valueOf((String) obj);
                if (valueOf.length() == 0) {
                    return;
                }
                "Loading auth'ed page from authToken = ".concat(valueOf);
                return;
            case 10:
                zep.d("An error happened when getting authToken.", (Throwable) obj);
                return;
            case 11:
                afus.c(2, 18, "FirebaseApp init crashed", (Throwable) obj);
                return;
            case 12:
                int i2 = agrs.l;
                zep.d("Problem scheduling refresh job", (Throwable) obj);
                return;
            case 13:
                zep.d("Couldn't handle staleConfigEvent", (Throwable) obj);
                return;
            case 14:
                zna.q((Throwable) obj);
                return;
            case 15:
                zna.q((Throwable) obj);
                return;
            case 16:
                zna.q((Throwable) obj);
                return;
            case 17:
                zna.q((Throwable) obj);
                return;
            case 18:
                aiak.b((ahhw) obj);
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
