package defpackage;

import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
/* compiled from: PG */
/* renamed from: awis  reason: default package */
/* loaded from: classes3.dex */
public final class awis implements awil {
    private final JobScheduler a;
    private final Application b;

    public awis(Application application) {
        this.a = (JobScheduler) application.getSystemService("jobscheduler");
        this.b = application;
    }

    private final ComponentName d() {
        return new ComponentName(this.b, "com.google.android.apps.gmm.offline.update.OfflineAutoUpdateJobService");
    }

    @Override // defpackage.awil
    public final void a(int i, long j, awif awifVar, avjy avjyVar) {
        int i2 = i + 2000;
        if (i2 > 2009) {
            return;
        }
        this.a.schedule(new JobInfo.Builder(i2, d()).setPersisted(true).setExtras(avjz.a(avjyVar)).setRequiredNetworkType(true != awifVar.c() ? 1 : 2).setRequiresDeviceIdle(awifVar.b()).setRequiresCharging(awifVar.a()).setMinimumLatency(j).build());
    }

    @Override // defpackage.awil
    public final void b() {
        for (JobInfo jobInfo : this.a.getAllPendingJobs()) {
            if (jobInfo.getId() >= 2000 && jobInfo.getId() <= 2009) {
                this.a.cancel(jobInfo.getId());
            }
        }
    }

    @Override // defpackage.awil
    public final void c(avjy avjyVar) {
        this.a.schedule(new JobInfo.Builder(137303608, d()).setPersisted(true).setExtras(avjz.a(avjyVar)).setMinimumLatency(eaow.d(2L).b).setOverrideDeadline(eaow.d(20L).b).build());
    }
}
