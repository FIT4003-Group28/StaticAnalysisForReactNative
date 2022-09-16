package defpackage;

import com.google.android.apps.gmm.notification.receiver.CancelNotificationBroadcastReceiver;
/* compiled from: PG */
/* renamed from: ejv  reason: default package */
/* loaded from: classes6.dex */
final class ejv implements dxis {
    final /* synthetic */ fyu a;

    public ejv(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        CancelNotificationBroadcastReceiver cancelNotificationBroadcastReceiver = (CancelNotificationBroadcastReceiver) obj;
        cancelNotificationBroadcastReceiver.a = this.a.qc();
        bvrv e = this.a.a.e();
        dxjg.e(e);
        cancelNotificationBroadcastReceiver.b = e;
        cancelNotificationBroadcastReceiver.c = this.a.cu();
    }
}
