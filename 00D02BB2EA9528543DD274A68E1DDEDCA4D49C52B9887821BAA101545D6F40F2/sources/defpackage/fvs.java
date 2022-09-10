package defpackage;

import com.google.android.apps.gmm.offline.update.OfflineManualDownloadService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fvs  reason: default package */
/* loaded from: classes6.dex */
public final class fvs implements dxir {
    final /* synthetic */ fyu a;

    public fvs(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        OfflineManualDownloadService offlineManualDownloadService = (OfflineManualDownloadService) obj;
        return new fvt(this.a);
    }
}
