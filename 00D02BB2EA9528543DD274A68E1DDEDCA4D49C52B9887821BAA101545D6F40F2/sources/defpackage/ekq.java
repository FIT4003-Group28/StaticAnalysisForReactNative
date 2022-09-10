package defpackage;

import com.google.android.apps.gmm.messaging.intent.DismissMessagingNotificationBroadcastReceiver;
/* compiled from: PG */
/* renamed from: ekq  reason: default package */
/* loaded from: classes6.dex */
final class ekq implements dxis {
    final /* synthetic */ fyu a;

    public ekq(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        DismissMessagingNotificationBroadcastReceiver dismissMessagingNotificationBroadcastReceiver = (DismissMessagingNotificationBroadcastReceiver) obj;
        cjqy tr = this.a.a.tr();
        dxjg.e(tr);
        dismissMessagingNotificationBroadcastReceiver.a = tr;
        dismissMessagingNotificationBroadcastReceiver.b = this.a.qc();
    }
}
