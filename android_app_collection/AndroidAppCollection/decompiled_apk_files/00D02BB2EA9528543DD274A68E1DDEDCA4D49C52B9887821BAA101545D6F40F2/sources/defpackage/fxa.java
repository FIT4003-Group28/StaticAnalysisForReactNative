package defpackage;

import com.google.android.apps.gmm.locationsharing.reporting.RestartDetectionBroadcastReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fxa  reason: default package */
/* loaded from: classes6.dex */
public final class fxa implements dxir {
    final /* synthetic */ fyu a;

    public fxa(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        RestartDetectionBroadcastReceiver restartDetectionBroadcastReceiver = (RestartDetectionBroadcastReceiver) obj;
        return new fxb(this.a);
    }
}
