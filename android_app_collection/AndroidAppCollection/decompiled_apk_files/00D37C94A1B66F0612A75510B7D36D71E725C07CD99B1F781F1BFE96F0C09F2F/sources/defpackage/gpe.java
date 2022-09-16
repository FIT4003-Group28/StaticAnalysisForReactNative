package defpackage;
/* compiled from: PG */
/* renamed from: gpe  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gpe implements ylv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ gpe u = new gpe(20);
    public static final /* synthetic */ gpe t = new gpe(19);
    public static final /* synthetic */ gpe s = new gpe(18);
    public static final /* synthetic */ gpe r = new gpe(17);
    public static final /* synthetic */ gpe q = new gpe(16);
    public static final /* synthetic */ gpe p = new gpe(15);
    public static final /* synthetic */ gpe o = new gpe(14);
    public static final /* synthetic */ gpe n = new gpe(13);
    public static final /* synthetic */ gpe m = new gpe(12);
    public static final /* synthetic */ gpe l = new gpe(11);
    public static final /* synthetic */ gpe k = new gpe(10);
    public static final /* synthetic */ gpe j = new gpe(9);
    public static final /* synthetic */ gpe i = new gpe(8);
    public static final /* synthetic */ gpe h = new gpe(7);
    public static final /* synthetic */ gpe g = new gpe(6);
    public static final /* synthetic */ gpe f = new gpe(5);
    public static final /* synthetic */ gpe e = new gpe(4);
    public static final /* synthetic */ gpe d = new gpe(3);
    public static final /* synthetic */ gpe c = new gpe(2);
    public static final /* synthetic */ gpe b = new gpe(1);
    public static final /* synthetic */ gpe a = new gpe();

    private /* synthetic */ gpe() {
    }

    private /* synthetic */ gpe(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ylv
    public final void b(Throwable th) {
        switch (this.v) {
            case 0:
                zep.d("Unable to save UriFlow state", th);
                return;
            case 1:
                zep.b(th.getMessage());
                return;
            case 2:
                zep.b("Error saving most recent preset effect ID for Short");
                return;
            case 3:
                zep.d("Failed to get shorts creation info", th);
                return;
            case 4:
                zep.b("Error saving most recent preset effect ID for Stories");
                return;
            case 5:
                zep.b("Error saving recent stickers to PDS");
                return;
            case 6:
                zep.c("videoEffects", "Mentions in text hint error.");
                return;
            case 7:
                zep.b("Error saving sticker text style");
                return;
            case 8:
                zep.d("Error occurred getting resumable uploads", th);
                return;
            case 9:
                zep.d("There was an error prefetching the BrowseResponse", th);
                return;
            case 10:
                zep.d("Failed to update offline access enabled and offline access updated at.", th);
                return;
            case 11:
                zep.d("Failed to clear offline access enabled and offline access updated at.", th);
                return;
            case 12:
                zep.d("Failed to update offline has shown 1080p option.", th);
                return;
            case 13:
                zep.d("Failed to update offline has shown 1080p tooltip.", th);
                return;
            case 14:
                zep.d("Failed to update offline stream selection dialog remember settings checked.", th);
                return;
            case 15:
                jem.a(th);
                return;
            case 16:
                zep.d("Failed to update offline last scheduled ad hoc refresh time millis.", th);
                return;
            case 17:
                zep.d("Failed to update offline stream selection dialog remember settings checked.", th);
                return;
            case 18:
                zep.d("Failed to update offline stream selection dialog remember settings checked.", th);
                return;
            case 19:
                zep.d("Failed to update offline stream selection dialog remember settings checked.", th);
                return;
            default:
                zep.d("Failed to set offline quality preference millis.", th);
                return;
        }
    }

    @Override // defpackage.zdt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.v) {
            case 0:
                zep.d("Unable to save UriFlow state", (Throwable) obj);
                return;
            case 1:
                zep.b(((Throwable) obj).getMessage());
                return;
            case 2:
                Throwable th = (Throwable) obj;
                zep.b("Error saving most recent preset effect ID for Short");
                return;
            case 3:
                zep.d("Failed to get shorts creation info", (Throwable) obj);
                return;
            case 4:
                Throwable th2 = (Throwable) obj;
                zep.b("Error saving most recent preset effect ID for Stories");
                return;
            case 5:
                Throwable th3 = (Throwable) obj;
                zep.b("Error saving recent stickers to PDS");
                return;
            case 6:
                Throwable th4 = (Throwable) obj;
                zep.c("videoEffects", "Mentions in text hint error.");
                return;
            case 7:
                Throwable th5 = (Throwable) obj;
                zep.b("Error saving sticker text style");
                return;
            case 8:
                zep.d("Error occurred getting resumable uploads", (Throwable) obj);
                return;
            case 9:
                zep.d("There was an error prefetching the BrowseResponse", (Throwable) obj);
                return;
            case 10:
                zep.d("Failed to update offline access enabled and offline access updated at.", (Throwable) obj);
                return;
            case 11:
                zep.d("Failed to clear offline access enabled and offline access updated at.", (Throwable) obj);
                return;
            case 12:
                zep.d("Failed to update offline has shown 1080p option.", (Throwable) obj);
                return;
            case 13:
                zep.d("Failed to update offline has shown 1080p tooltip.", (Throwable) obj);
                return;
            case 14:
                zep.d("Failed to update offline stream selection dialog remember settings checked.", (Throwable) obj);
                return;
            case 15:
                jem.a((Throwable) obj);
                return;
            case 16:
                zep.d("Failed to update offline last scheduled ad hoc refresh time millis.", (Throwable) obj);
                return;
            case 17:
                zep.d("Failed to update offline stream selection dialog remember settings checked.", (Throwable) obj);
                return;
            case 18:
                zep.d("Failed to update offline stream selection dialog remember settings checked.", (Throwable) obj);
                return;
            case 19:
                zep.d("Failed to update offline stream selection dialog remember settings checked.", (Throwable) obj);
                return;
            default:
                zep.d("Failed to set offline quality preference millis.", (Throwable) obj);
                return;
        }
    }
}
