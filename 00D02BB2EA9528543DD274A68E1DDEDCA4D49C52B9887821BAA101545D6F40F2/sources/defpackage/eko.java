package defpackage;

import com.google.android.apps.gmm.majorevents.notification.dismissreceiver.DismissEventNotificationBroadcastReceiver;
/* compiled from: PG */
/* renamed from: eko  reason: default package */
/* loaded from: classes6.dex */
final class eko implements dxis {
    final /* synthetic */ fyu a;

    public eko(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        DismissEventNotificationBroadcastReceiver dismissEventNotificationBroadcastReceiver = (DismissEventNotificationBroadcastReceiver) obj;
        ckcw rU = this.a.a.rU();
        dxjg.e(rU);
        dismissEventNotificationBroadcastReceiver.a = rU;
        dismissEventNotificationBroadcastReceiver.b = this.a.qc();
        bvrv e = this.a.a.e();
        dxjg.e(e);
        dismissEventNotificationBroadcastReceiver.c = e;
    }
}
