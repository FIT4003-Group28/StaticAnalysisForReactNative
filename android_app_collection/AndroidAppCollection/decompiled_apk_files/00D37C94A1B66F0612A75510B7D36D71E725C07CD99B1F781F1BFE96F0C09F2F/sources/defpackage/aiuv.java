package defpackage;
/* compiled from: PG */
/* renamed from: aiuv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aiuv implements ylv {
    private final /* synthetic */ int i;
    public static final /* synthetic */ aiuv h = new aiuv(8);
    public static final /* synthetic */ aiuv g = new aiuv(6);
    public static final /* synthetic */ aiuv f = new aiuv(5);
    public static final /* synthetic */ aiuv e = new aiuv(4);
    public static final /* synthetic */ aiuv d = new aiuv(3);
    public static final /* synthetic */ aiuv c = new aiuv(2);
    public static final /* synthetic */ aiuv b = new aiuv(1);
    public static final /* synthetic */ aiuv a = new aiuv();

    private /* synthetic */ aiuv() {
    }

    public /* synthetic */ aiuv(int i) {
        this.i = i;
    }

    @Override // defpackage.ylv
    public final void b(Throwable th) {
        switch (this.i) {
            case 0:
                aiuy.d(th);
                return;
            case 1:
                zep.d("Failed to save playability adult timestamp.", th);
                return;
            case 2:
                zep.d("Failed to set caption preferences", th);
                return;
            case 3:
                zep.d("Failed to set caption preferences", th);
                return;
            case 4:
                zep.d("Failed to store impression records.", th);
                return;
            case 5:
                zep.d("PermissionManager: failed to record permissions", th);
                return;
            case 6:
            case 7:
                return;
            default:
                akwn.a(th);
                return;
        }
    }

    @Override // defpackage.zdt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.i) {
            case 0:
                aiuy.d((Throwable) obj);
                return;
            case 1:
                zep.d("Failed to save playability adult timestamp.", (Throwable) obj);
                return;
            case 2:
                zep.d("Failed to set caption preferences", (Throwable) obj);
                return;
            case 3:
                zep.d("Failed to set caption preferences", (Throwable) obj);
                return;
            case 4:
                zep.d("Failed to store impression records.", (Throwable) obj);
                return;
            case 5:
                zep.d("PermissionManager: failed to record permissions", (Throwable) obj);
                return;
            case 6:
                Throwable th = (Throwable) obj;
                return;
            case 7:
                Throwable th2 = (Throwable) obj;
                return;
            default:
                akwn.a((Throwable) obj);
                return;
        }
    }
}
