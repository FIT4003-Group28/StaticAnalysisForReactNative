package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.parkinglocation.ParkingLocationUpdateNotificationReceiver;
/* compiled from: PG */
/* renamed from: fwi  reason: default package */
/* loaded from: classes6.dex */
final class fwi implements dxis {
    final /* synthetic */ fyu a;

    public fwi(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ParkingLocationUpdateNotificationReceiver parkingLocationUpdateNotificationReceiver = (ParkingLocationUpdateNotificationReceiver) obj;
        parkingLocationUpdateNotificationReceiver.a = this.a.qc();
        Application a = this.a.a.a();
        dxjg.e(a);
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        parkingLocationUpdateNotificationReceiver.b = new awpu(a, rR, this.a.kQ(), this.a.kP());
    }
}
