package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import com.google.android.apps.gmm.traffic.notification.service.DismissTrafficToPlaceNotificationReceiver;
/* compiled from: PG */
/* renamed from: byru  reason: default package */
/* loaded from: classes4.dex */
public final class byru implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ BroadcastReceiver.PendingResult b;
    final /* synthetic */ DismissTrafficToPlaceNotificationReceiver c;

    public byru(DismissTrafficToPlaceNotificationReceiver dismissTrafficToPlaceNotificationReceiver, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.c = dismissTrafficToPlaceNotificationReceiver;
        this.a = intent;
        this.b = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        btlu btluVar = null;
        String stringExtra = this.a.hasExtra("ObfuscatedGaia") ? this.a.getStringExtra("ObfuscatedGaia") : null;
        if (!dbsj.d(stringExtra)) {
            btluVar = this.c.b.n(stringExtra);
        }
        qjj a = qjj.a(this.a.getIntExtra("CommuteNotificationType", qjj.TRAFFIC_TO_PLACE.e));
        if (a == null) {
            a = qjj.TRAFFIC_TO_PLACE;
        }
        this.c.a.i(a, this.a.getStringExtra("NotificationTag"), btluVar);
        this.b.finish();
    }
}
