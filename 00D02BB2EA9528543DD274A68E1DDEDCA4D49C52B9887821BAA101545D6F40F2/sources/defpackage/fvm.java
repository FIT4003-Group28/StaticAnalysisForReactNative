package defpackage;

import com.google.android.apps.gmm.offline.update.OfflineAutoUpdateJobService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fvm  reason: default package */
/* loaded from: classes6.dex */
public final class fvm implements dxir {
    final /* synthetic */ fyu a;

    public fvm(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        OfflineAutoUpdateJobService offlineAutoUpdateJobService = (OfflineAutoUpdateJobService) obj;
        return new fvn(this.a);
    }
}
