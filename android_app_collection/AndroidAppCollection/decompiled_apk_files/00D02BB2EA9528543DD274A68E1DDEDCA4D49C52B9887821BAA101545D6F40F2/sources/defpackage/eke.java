package defpackage;

import com.google.android.apps.gmm.locationsharing.usr.NetworkAvailabilityChecker$ConnectivityChangedBroadcastReceiver;
/* compiled from: PG */
/* renamed from: eke  reason: default package */
/* loaded from: classes6.dex */
final class eke implements dxis {
    final /* synthetic */ fyu a;

    public eke(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        NetworkAvailabilityChecker$ConnectivityChangedBroadcastReceiver networkAvailabilityChecker$ConnectivityChangedBroadcastReceiver = (NetworkAvailabilityChecker$ConnectivityChangedBroadcastReceiver) obj;
        fyu fyuVar = this.a;
        dzsj dzsjVar = fyuVar.ed;
        if (dzsjVar == null) {
            dzsjVar = new fxy(fyuVar, 746);
            fyuVar.ed = dzsjVar;
        }
        networkAvailabilityChecker$ConnectivityChangedBroadcastReceiver.a = dxjc.c(dzsjVar);
    }
}
