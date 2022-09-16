package defpackage;

import com.google.android.apps.gmm.offline.update.OfflineManualDownloadService;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: awlh  reason: default package */
/* loaded from: classes3.dex */
public final class awlh implements avii {
    final WeakReference<OfflineManualDownloadService> a;

    public awlh(OfflineManualDownloadService offlineManualDownloadService) {
        this.a = new WeakReference<>(offlineManualDownloadService);
    }

    @Override // defpackage.avii
    public final void a(avih avihVar) {
        OfflineManualDownloadService offlineManualDownloadService = this.a.get();
        if (offlineManualDownloadService != null) {
            offlineManualDownloadService.a(dbpy.a, false);
        }
    }

    @Override // defpackage.avii
    public final void b() {
        OfflineManualDownloadService offlineManualDownloadService = this.a.get();
        if (offlineManualDownloadService != null) {
            offlineManualDownloadService.a(dbpy.a, true);
        }
    }

    @Override // defpackage.avii
    public final void c() {
        OfflineManualDownloadService offlineManualDownloadService = this.a.get();
        if (offlineManualDownloadService != null) {
            offlineManualDownloadService.a(dbpy.a, true);
        }
    }
}
