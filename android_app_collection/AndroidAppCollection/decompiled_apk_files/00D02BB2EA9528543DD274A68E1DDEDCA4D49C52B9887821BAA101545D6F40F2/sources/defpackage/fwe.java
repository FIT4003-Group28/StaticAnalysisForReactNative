package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.parkinglocation.ParkingLocationExpireWarningReceiver;
/* compiled from: PG */
/* renamed from: fwe  reason: default package */
/* loaded from: classes6.dex */
final class fwe implements dxis {
    final /* synthetic */ fyu a;

    public fwe(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ParkingLocationExpireWarningReceiver parkingLocationExpireWarningReceiver = (ParkingLocationExpireWarningReceiver) obj;
        parkingLocationExpireWarningReceiver.a = this.a.qc();
        Application a = this.a.a.a();
        dxjg.e(a);
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        parkingLocationExpireWarningReceiver.b = new awpu(a, rR, this.a.kQ(), this.a.kP());
    }
}
