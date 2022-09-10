package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.parkinglocation.ParkingLocationExpireAlertReceiver;
/* compiled from: PG */
/* renamed from: fwc  reason: default package */
/* loaded from: classes6.dex */
final class fwc implements dxis {
    final /* synthetic */ fyu a;

    public fwc(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ParkingLocationExpireAlertReceiver parkingLocationExpireAlertReceiver = (ParkingLocationExpireAlertReceiver) obj;
        parkingLocationExpireAlertReceiver.a = this.a.qc();
        Application a = this.a.a.a();
        dxjg.e(a);
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        parkingLocationExpireAlertReceiver.b = new awpu(a, rR, this.a.kQ(), this.a.kP());
    }
}
