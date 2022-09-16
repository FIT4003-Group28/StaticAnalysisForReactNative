package defpackage;
/* compiled from: PG */
/* renamed from: afsc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afsc implements ylv {
    private final /* synthetic */ int t;
    public static final /* synthetic */ afsc s = new afsc(20);
    public static final /* synthetic */ afsc r = new afsc(19);
    public static final /* synthetic */ afsc q = new afsc(18);
    public static final /* synthetic */ afsc p = new afsc(17);
    public static final /* synthetic */ afsc o = new afsc(16);
    public static final /* synthetic */ afsc n = new afsc(15);
    public static final /* synthetic */ afsc m = new afsc(14);
    public static final /* synthetic */ afsc l = new afsc(12);
    public static final /* synthetic */ afsc k = new afsc(11);
    public static final /* synthetic */ afsc j = new afsc(10);
    public static final /* synthetic */ afsc i = new afsc(9);
    public static final /* synthetic */ afsc h = new afsc(8);
    public static final /* synthetic */ afsc g = new afsc(7);
    public static final /* synthetic */ afsc f = new afsc(6);
    public static final /* synthetic */ afsc e = new afsc(5);
    public static final /* synthetic */ afsc d = new afsc(4);
    public static final /* synthetic */ afsc c = new afsc(3);
    public static final /* synthetic */ afsc b = new afsc(2);
    public static final /* synthetic */ afsc a = new afsc();

    private /* synthetic */ afsc() {
    }

    public /* synthetic */ afsc(int i2) {
        this.t = i2;
    }

    @Override // defpackage.ylv
    public final void b(Throwable th) {
        switch (this.t) {
            case 0:
                zep.d("failed to clear device auth", th);
                return;
            case 1:
                if (th instanceof cff) {
                    cff cffVar = (cff) th;
                    return;
                } else {
                    new cff(th);
                    return;
                }
            case 2:
                afuf.d(th);
                return;
            case 3:
                afuf.e(th);
                return;
            case 4:
                afuf.f(th);
                return;
            case 5:
                afuf.g(th);
                return;
            case 6:
                zep.d("There was an error.", th);
                return;
            case 7:
                zep.d("Failed to save device context event", th);
                return;
            case 8:
                zep.d("Failed to invalidate gcm registration timestamp", th);
                return;
            case 9:
                zep.d("Failed to save enabledness changed timestamp", th);
                return;
            case 10:
                zep.b("[Offline] Error initializing offline store");
                return;
            case 11:
                agsj.a(th);
                return;
            case 12:
                zep.d("[Offline] Failed to set next auto offline time millis at.", th);
                return;
            case 13:
                agxa.d(th);
                return;
            case 14:
                agxa.b(th);
                return;
            case 15:
                agxa.c(th);
                return;
            case 16:
                afus.c(2, 28, "Some error occurred when evicting player response", th);
                return;
            case 17:
                afus.c(2, 28, "Some error occurred when putting a player response into cache", th);
                return;
            case 18:
                zep.d("Failed to update VR platform preference to store.", th);
                return;
            case 19:
                zep.d("Failed to update VR platform preference to store.", th);
                return;
            default:
                zep.d("Failed to store adult playability.", th);
                return;
        }
    }

    @Override // defpackage.zdt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.t) {
            case 0:
                zep.d("failed to clear device auth", (Throwable) obj);
                return;
            case 1:
                b((Throwable) obj);
                return;
            case 2:
                afuf.d((Throwable) obj);
                return;
            case 3:
                afuf.e((Throwable) obj);
                return;
            case 4:
                afuf.f((Throwable) obj);
                return;
            case 5:
                afuf.g((Throwable) obj);
                return;
            case 6:
                zep.d("There was an error.", (Throwable) obj);
                return;
            case 7:
                zep.d("Failed to save device context event", (Throwable) obj);
                return;
            case 8:
                zep.d("Failed to invalidate gcm registration timestamp", (Throwable) obj);
                return;
            case 9:
                zep.d("Failed to save enabledness changed timestamp", (Throwable) obj);
                return;
            case 10:
                Throwable th = (Throwable) obj;
                zep.b("[Offline] Error initializing offline store");
                return;
            case 11:
                agsj.a((Throwable) obj);
                return;
            case 12:
                zep.d("[Offline] Failed to set next auto offline time millis at.", (Throwable) obj);
                return;
            case 13:
                agxa.d((Throwable) obj);
                return;
            case 14:
                agxa.b((Throwable) obj);
                return;
            case 15:
                agxa.c((Throwable) obj);
                return;
            case 16:
                afus.c(2, 28, "Some error occurred when evicting player response", (Throwable) obj);
                return;
            case 17:
                afus.c(2, 28, "Some error occurred when putting a player response into cache", (Throwable) obj);
                return;
            case 18:
                zep.d("Failed to update VR platform preference to store.", (Throwable) obj);
                return;
            case 19:
                zep.d("Failed to update VR platform preference to store.", (Throwable) obj);
                return;
            default:
                zep.d("Failed to store adult playability.", (Throwable) obj);
                return;
        }
    }
}
