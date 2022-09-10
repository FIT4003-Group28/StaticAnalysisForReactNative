package defpackage;

import com.google.android.apps.gmm.offline.routing.OfflineReroutingController;
/* compiled from: PG */
/* renamed from: avbm  reason: default package */
/* loaded from: classes2.dex */
public final class avbm implements Runnable {
    final /* synthetic */ OfflineReroutingController a;

    public avbm(OfflineReroutingController offlineReroutingController) {
        this.a = offlineReroutingController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OfflineReroutingController offlineReroutingController = this.a;
        if (offlineReroutingController.a) {
            return;
        }
        offlineReroutingController.a = true;
        awcj.b(offlineReroutingController, offlineReroutingController.b);
    }
}
