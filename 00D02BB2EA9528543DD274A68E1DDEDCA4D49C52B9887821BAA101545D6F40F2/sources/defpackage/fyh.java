package defpackage;

import com.google.android.apps.gmm.traffic.notification.service.TrafficToPlaceNotificationGeofenceReceiver;
/* compiled from: PG */
/* renamed from: fyh  reason: default package */
/* loaded from: classes6.dex */
final class fyh implements dxis {
    final /* synthetic */ fyu a;

    public fyh(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        TrafficToPlaceNotificationGeofenceReceiver trafficToPlaceNotificationGeofenceReceiver = (TrafficToPlaceNotificationGeofenceReceiver) obj;
        ckcw rU = this.a.a.rU();
        dxjg.e(rU);
        trafficToPlaceNotificationGeofenceReceiver.a = rU;
        trafficToPlaceNotificationGeofenceReceiver.b = this.a.cu();
        trafficToPlaceNotificationGeofenceReceiver.c = this.a.bM();
        trafficToPlaceNotificationGeofenceReceiver.d = dxjc.c(this.a.pq());
        akfa rK = this.a.a.rK();
        dxjg.e(rK);
        trafficToPlaceNotificationGeofenceReceiver.e = rK;
        bvrb tn = this.a.a.tn();
        dxjg.e(tn);
        trafficToPlaceNotificationGeofenceReceiver.f = tn;
    }
}
