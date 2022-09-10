package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.notification.optout.NotificationOptOutBroadcastReceiver;
/* compiled from: PG */
/* renamed from: fvj  reason: default package */
/* loaded from: classes6.dex */
final class fvj implements dxis {
    final /* synthetic */ fyu a;

    public fvj(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        NotificationOptOutBroadcastReceiver notificationOptOutBroadcastReceiver = (NotificationOptOutBroadcastReceiver) obj;
        notificationOptOutBroadcastReceiver.a = this.a.qc();
        bvrv e = this.a.a.e();
        dxjg.e(e);
        notificationOptOutBroadcastReceiver.b = e;
        Application a = this.a.a.a();
        dxjg.e(a);
        notificationOptOutBroadcastReceiver.c = a;
        notificationOptOutBroadcastReceiver.d = this.a.cu();
        notificationOptOutBroadcastReceiver.e = this.a.bg();
    }
}
