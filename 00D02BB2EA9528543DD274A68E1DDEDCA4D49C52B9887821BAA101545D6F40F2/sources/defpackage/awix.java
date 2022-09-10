package defpackage;

import android.app.job.JobParameters;
import com.google.android.apps.gmm.offline.update.OfflineAutoUpdateJobService;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: awix  reason: default package */
/* loaded from: classes3.dex */
public final class awix implements degu<avjg> {
    private final WeakReference<OfflineAutoUpdateJobService> a;
    private final JobParameters b;
    private final ckcw c;

    public awix(OfflineAutoUpdateJobService offlineAutoUpdateJobService, JobParameters jobParameters) {
        this.a = new WeakReference<>(offlineAutoUpdateJobService);
        this.c = offlineAutoUpdateJobService.b;
        this.b = jobParameters;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        dbue.b(th);
        throw new RuntimeException(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(avjg avjgVar) {
        avjg avjgVar2 = avjgVar;
        OfflineAutoUpdateJobService offlineAutoUpdateJobService = this.a.get();
        if (offlineAutoUpdateJobService != null) {
            avjo a = offlineAutoUpdateJobService.d.a();
            awiy remove = offlineAutoUpdateJobService.i.remove(Integer.valueOf(this.b.getJobId()));
            if (remove != null) {
                int h = a.h(remove.b, avjgVar2);
                boolean z = true;
                if (h != 1) {
                    z = false;
                }
                offlineAutoUpdateJobService.jobFinished(this.b, z);
            }
        }
        this.c.f(ckhc.OFFLINE_SERVICE);
        this.c.g(ckhc.OFFLINE_SERVICE);
    }
}
