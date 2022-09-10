package defpackage;

import com.google.android.apps.gmm.offline.appindex.OfflineAppIndexingReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fvk  reason: default package */
/* loaded from: classes6.dex */
public final class fvk implements dxir {
    final /* synthetic */ fyu a;

    public fvk(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        OfflineAppIndexingReceiver offlineAppIndexingReceiver = (OfflineAppIndexingReceiver) obj;
        return new fvl(this.a);
    }
}
