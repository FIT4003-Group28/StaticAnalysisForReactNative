package defpackage;

import com.google.android.apps.gmm.wearable.GmmWearableListenerService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fty  reason: default package */
/* loaded from: classes6.dex */
public final class fty implements dxir {
    final /* synthetic */ fyu a;

    public fty(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        GmmWearableListenerService gmmWearableListenerService = (GmmWearableListenerService) obj;
        return new ftz(this.a);
    }
}
