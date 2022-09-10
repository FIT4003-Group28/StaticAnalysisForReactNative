package defpackage;

import com.google.android.apps.gmm.locationsharing.reporting.RestartDetectionBroadcastReceiver;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fxb  reason: default package */
/* loaded from: classes6.dex */
final class fxb implements dxis {
    final /* synthetic */ fyu a;

    public fxb(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        RestartDetectionBroadcastReceiver restartDetectionBroadcastReceiver = (RestartDetectionBroadcastReceiver) obj;
        restartDetectionBroadcastReceiver.a = this.a.hz();
        Executor sV = this.a.a.sV();
        dxjg.e(sV);
        restartDetectionBroadcastReceiver.b = sV;
    }
}
