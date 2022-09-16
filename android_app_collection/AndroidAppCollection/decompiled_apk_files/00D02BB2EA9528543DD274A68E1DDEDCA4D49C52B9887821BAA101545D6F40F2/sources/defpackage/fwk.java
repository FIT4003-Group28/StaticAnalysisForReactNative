package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.parking.payment.notification.ParkingPaymentSessionExpiringBroadcastReceiver;
/* compiled from: PG */
/* renamed from: fwk  reason: default package */
/* loaded from: classes6.dex */
final class fwk implements dxis {
    final /* synthetic */ fyu a;

    public fwk(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Application a = this.a.a.a();
        dxjg.e(a);
        dxjc.c(this.a.me());
        ((ParkingPaymentSessionExpiringBroadcastReceiver) obj).a = new awpp(a, dxjc.c(this.a.ax()), dxjc.c(this.a.cv()));
    }
}
