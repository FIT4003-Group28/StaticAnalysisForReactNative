package defpackage;

import com.google.android.apps.gmm.wearable.GmmWearableListenerService;
/* compiled from: PG */
/* renamed from: ftz  reason: default package */
/* loaded from: classes6.dex */
final class ftz implements dxis {
    final /* synthetic */ fyu a;

    public ftz(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        GmmWearableListenerService gmmWearableListenerService = (GmmWearableListenerService) obj;
        gmmWearableListenerService.a = this.a.dW();
        bvrv e = this.a.a.e();
        dxjg.e(e);
        gmmWearableListenerService.b = e;
    }
}
