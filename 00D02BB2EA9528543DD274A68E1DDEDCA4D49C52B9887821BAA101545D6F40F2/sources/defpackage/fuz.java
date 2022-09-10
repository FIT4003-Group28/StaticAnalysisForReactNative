package defpackage;

import com.google.android.apps.gmm.notification.log.NotificationBlockStateReceiver;
/* compiled from: PG */
/* renamed from: fuz  reason: default package */
/* loaded from: classes6.dex */
final class fuz implements dxis {
    final /* synthetic */ fyu a;

    public fuz(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        NotificationBlockStateReceiver notificationBlockStateReceiver = (NotificationBlockStateReceiver) obj;
        cjqy tr = this.a.a.tr();
        dxjg.e(tr);
        notificationBlockStateReceiver.a = tr;
        ckcw rU = this.a.a.rU();
        dxjg.e(rU);
        notificationBlockStateReceiver.b = rU;
        notificationBlockStateReceiver.c = this.a.qc();
        bvrv e = this.a.a.e();
        dxjg.e(e);
        notificationBlockStateReceiver.d = e;
        dxjc.c(this.a.V());
        btrm rz = this.a.a.rz();
        dxjg.e(rz);
        notificationBlockStateReceiver.e = rz;
    }
}
