package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.parkinglocation.ParkingLocationNotificationReceiver;
/* compiled from: PG */
/* renamed from: fwg  reason: default package */
/* loaded from: classes6.dex */
final class fwg implements dxis {
    final /* synthetic */ fyu a;

    public fwg(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ParkingLocationNotificationReceiver parkingLocationNotificationReceiver = (ParkingLocationNotificationReceiver) obj;
        parkingLocationNotificationReceiver.a = this.a.kO();
        bvrb tn = this.a.a.tn();
        dxjg.e(tn);
        parkingLocationNotificationReceiver.b = tn;
        parkingLocationNotificationReceiver.c = this.a.kQ();
        Application a = this.a.a.a();
        dxjg.e(a);
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        parkingLocationNotificationReceiver.d = new awpu(a, rR, this.a.kQ(), this.a.kP());
    }
}
