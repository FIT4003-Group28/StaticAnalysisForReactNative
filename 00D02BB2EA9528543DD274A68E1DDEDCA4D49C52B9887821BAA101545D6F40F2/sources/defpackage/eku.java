package defpackage;

import com.google.android.apps.gmm.traffic.notification.service.DismissTrafficToPlaceNotificationReceiver;
/* compiled from: PG */
/* renamed from: eku  reason: default package */
/* loaded from: classes6.dex */
final class eku implements dxis {
    final /* synthetic */ fyu a;

    public eku(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        DismissTrafficToPlaceNotificationReceiver dismissTrafficToPlaceNotificationReceiver = (DismissTrafficToPlaceNotificationReceiver) obj;
        dismissTrafficToPlaceNotificationReceiver.a = this.a.bM();
        akfa rK = this.a.a.rK();
        dxjg.e(rK);
        dismissTrafficToPlaceNotificationReceiver.b = rK;
        bvrb tn = this.a.a.tn();
        dxjg.e(tn);
        dismissTrafficToPlaceNotificationReceiver.c = tn;
    }
}
