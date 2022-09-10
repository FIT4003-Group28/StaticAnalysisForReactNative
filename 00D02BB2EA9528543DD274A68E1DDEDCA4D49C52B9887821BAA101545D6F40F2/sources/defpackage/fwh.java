package defpackage;

import com.google.android.apps.gmm.parkinglocation.ParkingLocationUpdateNotificationReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fwh  reason: default package */
/* loaded from: classes6.dex */
public final class fwh implements dxir {
    final /* synthetic */ fyu a;

    public fwh(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        ParkingLocationUpdateNotificationReceiver parkingLocationUpdateNotificationReceiver = (ParkingLocationUpdateNotificationReceiver) obj;
        return new fwi(this.a);
    }
}
