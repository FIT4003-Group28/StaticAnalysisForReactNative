package defpackage;

import com.google.android.apps.gmm.locationsharing.reporting.ActivityRecognitionBroadcastReceiver;
/* compiled from: PG */
/* renamed from: fud  reason: default package */
/* loaded from: classes6.dex */
final class fud implements dxis {
    final /* synthetic */ fyu a;

    public fud(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ActivityRecognitionBroadcastReceiver activityRecognitionBroadcastReceiver = (ActivityRecognitionBroadcastReceiver) obj;
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        activityRecognitionBroadcastReceiver.b = rR;
        activityRecognitionBroadcastReceiver.c = this.a.ey();
        activityRecognitionBroadcastReceiver.d = this.a.hz();
        bvrb tn = this.a.a.tn();
        dxjg.e(tn);
        activityRecognitionBroadcastReceiver.e = tn;
    }
}
