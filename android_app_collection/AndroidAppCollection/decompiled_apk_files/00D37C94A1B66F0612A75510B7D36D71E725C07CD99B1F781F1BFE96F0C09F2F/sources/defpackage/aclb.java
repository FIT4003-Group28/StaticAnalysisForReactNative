package defpackage;

import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInControllerImpl;
import com.google.android.libraries.youtube.offline.ui.DownloadNetworkSelectionDialogPreference;
import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: aclb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aclb implements zdt {
    private final /* synthetic */ int s;
    public static final /* synthetic */ aclb r = new aclb(17);
    public static final /* synthetic */ aclb q = new aclb(16);
    public static final /* synthetic */ aclb p = new aclb(15);
    public static final /* synthetic */ aclb o = new aclb(14);
    public static final /* synthetic */ aclb n = new aclb(13);
    public static final /* synthetic */ aclb m = new aclb(12);
    public static final /* synthetic */ aclb l = new aclb(11);
    public static final /* synthetic */ aclb k = new aclb(10);
    public static final /* synthetic */ aclb j = new aclb(9);
    public static final /* synthetic */ aclb i = new aclb(8);
    public static final /* synthetic */ aclb h = new aclb(7);
    public static final /* synthetic */ aclb g = new aclb(6);
    public static final /* synthetic */ aclb f = new aclb(5);
    public static final /* synthetic */ aclb e = new aclb(4);
    public static final /* synthetic */ aclb d = new aclb(3);
    public static final /* synthetic */ aclb c = new aclb(2);
    public static final /* synthetic */ aclb b = new aclb(1);
    public static final /* synthetic */ aclb a = new aclb();

    private /* synthetic */ aclb() {
    }

    private /* synthetic */ aclb(int i2) {
        this.s = i2;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        switch (this.s) {
            case 0:
                long j2 = acll.a;
                zep.d("Failed update hasSeenScreencastTooltip.", (Throwable) obj);
                return;
            case 1:
                long j3 = acll.a;
                zep.d("Error getting game title", (Throwable) obj);
                return;
            case 2:
                long j4 = acll.a;
                zep.d("Failed update isFirstStream.", (Throwable) obj);
                return;
            case 3:
                Throwable th = (Throwable) obj;
                int i2 = adsg.E;
                return;
            case 4:
                Throwable th2 = (Throwable) obj;
                int i3 = adsg.E;
                return;
            case 5:
                int i4 = adsg.E;
                zep.d("Failed to store smart remote disconnect tip shown flag", (Throwable) obj);
                return;
            case 6:
                int i5 = adsg.E;
                zep.d("Failed to store privacy dialog shown flag.", (Throwable) obj);
                return;
            case 7:
                String valueOf = String.valueOf(((Throwable) obj).getMessage());
                zep.c("MDX.tvsignin.ExpressTvSignInDrawerController", valueOf.length() != 0 ? "Error fetching the last Passive seen time: ".concat(valueOf) : new String("Error fetching the last Passive seen time: "));
                return;
            case 8:
                zep.f(TvSignInControllerImpl.a, "Failed to retrieve TV sign in data.", (Throwable) obj);
                return;
            case 9:
                agxf agxfVar = (agxf) obj;
                CountDownLatch countDownLatch = agzh.a;
                agxfVar.getClass();
                agxfVar.g();
                return;
            case 10:
                agxf agxfVar2 = (agxf) obj;
                CountDownLatch countDownLatch2 = agzh.a;
                agxfVar2.getClass();
                agxfVar2.c();
                return;
            case 11:
                int i6 = DownloadNetworkSelectionDialogPreference.f;
                zep.d("Failed to update OfflineModuleSettingsSchema", (Throwable) obj);
                return;
            case 12:
                zep.d("Error updating vr mode first time use in store", (Throwable) obj);
                return;
            case 13:
                aapd aapdVar = (aapd) obj;
                return;
            case 14:
                aapd aapdVar2 = (aapd) obj;
                return;
            case 15:
                aapd aapdVar3 = (aapd) obj;
                return;
            case 16:
                aapd aapdVar4 = (aapd) obj;
                return;
            default:
                aapd aapdVar5 = (aapd) obj;
                return;
        }
    }
}
