package defpackage;

import com.google.android.apps.gmm.notification.channels.NotificationChannelBroadcastReceiver;
/* compiled from: PG */
/* renamed from: fvb  reason: default package */
/* loaded from: classes6.dex */
final class fvb implements dxis {
    final /* synthetic */ fyu a;

    public fvb(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        NotificationChannelBroadcastReceiver notificationChannelBroadcastReceiver = (NotificationChannelBroadcastReceiver) obj;
        notificationChannelBroadcastReceiver.a = this.a.qG();
        bttf aL = this.a.a.aL();
        dxjg.e(aL);
        notificationChannelBroadcastReceiver.b = aL;
        bvrb tn = this.a.a.tn();
        dxjg.e(tn);
        notificationChannelBroadcastReceiver.c = tn;
        dxio c = dxjc.c(this.a.aw());
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        new bycj(c, rR);
    }
}
