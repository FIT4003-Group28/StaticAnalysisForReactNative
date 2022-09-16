package defpackage;

import com.google.android.libraries.youtube.mdx.notification.LivingRoomNotificationRequestManager;
/* compiled from: PG */
/* renamed from: acsn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acsn implements ylv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ acsn u = new acsn(20);
    public static final /* synthetic */ acsn t = new acsn(19);
    public static final /* synthetic */ acsn s = new acsn(18);
    public static final /* synthetic */ acsn r = new acsn(17);
    public static final /* synthetic */ acsn q = new acsn(16);
    public static final /* synthetic */ acsn p = new acsn(15);
    public static final /* synthetic */ acsn o = new acsn(14);
    public static final /* synthetic */ acsn n = new acsn(13);
    public static final /* synthetic */ acsn m = new acsn(12);
    public static final /* synthetic */ acsn l = new acsn(11);
    public static final /* synthetic */ acsn k = new acsn(10);
    public static final /* synthetic */ acsn j = new acsn(9);
    public static final /* synthetic */ acsn i = new acsn(8);
    public static final /* synthetic */ acsn h = new acsn(7);
    public static final /* synthetic */ acsn g = new acsn(6);
    public static final /* synthetic */ acsn f = new acsn(5);
    public static final /* synthetic */ acsn e = new acsn(4);
    public static final /* synthetic */ acsn d = new acsn(3);
    public static final /* synthetic */ acsn c = new acsn(2);
    public static final /* synthetic */ acsn b = new acsn(1);
    public static final /* synthetic */ acsn a = new acsn();

    private /* synthetic */ acsn() {
    }

    private /* synthetic */ acsn(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ylv
    public final void b(Throwable th) {
        switch (this.v) {
            case 0:
                afus.c(2, 12, "Failed to reset heartbeat.", th);
                return;
            case 1:
                afus.c(2, 12, "Failed to reset heartbeat.", th);
                return;
            case 2:
                zep.d("Failed to updated the client side ve counter", th);
                return;
            case 3:
                zep.c("MDX.FeatureFlags", "Error with retrieving isEduChild value.");
                return;
            case 4:
                zep.c("MDX.FeatureFlags", "Error with retrieving isAccountSupex value.");
                return;
            case 5:
                acxa.a(th);
                return;
            case 6:
                acya.c(th);
                return;
            case 7:
                zep.d("Failed to read scan config", th);
                return;
            case 8:
                zep.d("Failed to read scan config", th);
                return;
            case 9:
                zep.f(adao.k, "Error saving devices to storage.", th);
                return;
            case 10:
                zep.f(adao.k, "Error saving devices to storage.", th);
                return;
            case 11:
                zep.f(adao.k, "Error saving sessions to storage.", th);
                return;
            case 12:
                zep.d("Failed to get the descriptor.", th);
                return;
            case 13:
                adfy.a(th);
                return;
            case 14:
                zep.f(adix.a, "Error while attempting to store the remoteId.", th);
                return;
            case 15:
                zep.f(adix.a, "Error while attempting to store the remoteId.", th);
                return;
            case 16:
                LivingRoomNotificationRequestManager.i(th);
                return;
            case 17:
                LivingRoomNotificationRequestManager.j(th);
                return;
            case 18:
                zep.d("Failed to store disable by user flag", th);
                return;
            case 19:
                zep.d("Failed to store notification hidden.", th);
                return;
            default:
                zep.d("Failed to record notification hidden.", th);
                return;
        }
    }

    @Override // defpackage.zdt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.v) {
            case 0:
                afus.c(2, 12, "Failed to reset heartbeat.", (Throwable) obj);
                return;
            case 1:
                afus.c(2, 12, "Failed to reset heartbeat.", (Throwable) obj);
                return;
            case 2:
                zep.d("Failed to updated the client side ve counter", (Throwable) obj);
                return;
            case 3:
                Throwable th = (Throwable) obj;
                zep.c("MDX.FeatureFlags", "Error with retrieving isEduChild value.");
                return;
            case 4:
                Throwable th2 = (Throwable) obj;
                zep.c("MDX.FeatureFlags", "Error with retrieving isAccountSupex value.");
                return;
            case 5:
                acxa.a((Throwable) obj);
                return;
            case 6:
                acya.c((Throwable) obj);
                return;
            case 7:
                zep.d("Failed to read scan config", (Throwable) obj);
                return;
            case 8:
                zep.d("Failed to read scan config", (Throwable) obj);
                return;
            case 9:
                zep.f(adao.k, "Error saving devices to storage.", (Throwable) obj);
                return;
            case 10:
                zep.f(adao.k, "Error saving devices to storage.", (Throwable) obj);
                return;
            case 11:
                zep.f(adao.k, "Error saving sessions to storage.", (Throwable) obj);
                return;
            case 12:
                zep.d("Failed to get the descriptor.", (Throwable) obj);
                return;
            case 13:
                adfy.a((Throwable) obj);
                return;
            case 14:
                zep.f(adix.a, "Error while attempting to store the remoteId.", (Throwable) obj);
                return;
            case 15:
                zep.f(adix.a, "Error while attempting to store the remoteId.", (Throwable) obj);
                return;
            case 16:
                LivingRoomNotificationRequestManager.i((Throwable) obj);
                return;
            case 17:
                LivingRoomNotificationRequestManager.j((Throwable) obj);
                return;
            case 18:
                zep.d("Failed to store disable by user flag", (Throwable) obj);
                return;
            case 19:
                zep.d("Failed to store notification hidden.", (Throwable) obj);
                return;
            default:
                zep.d("Failed to record notification hidden.", (Throwable) obj);
                return;
        }
    }
}
