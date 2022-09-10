package defpackage;

import com.google.android.apps.gmm.parkinglocation.ParkingLocationExpireWarningReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fwd  reason: default package */
/* loaded from: classes6.dex */
public final class fwd implements dxir {
    final /* synthetic */ fyu a;

    public fwd(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        ParkingLocationExpireWarningReceiver parkingLocationExpireWarningReceiver = (ParkingLocationExpireWarningReceiver) obj;
        return new fwe(this.a);
    }
}
