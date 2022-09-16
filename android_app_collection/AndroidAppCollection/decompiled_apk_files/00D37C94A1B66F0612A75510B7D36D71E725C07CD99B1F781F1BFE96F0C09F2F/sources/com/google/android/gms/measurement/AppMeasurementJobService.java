package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements ror {
    private ros a;

    private final ros d() {
        if (this.a == null) {
            this.a = new ros(this);
        }
        return this.a;
    }

    @Override // defpackage.ror
    public final void a(Intent intent) {
    }

    @Override // defpackage.ror
    public final boolean b(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ror
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d().b();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d().c();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d().d(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final ros d = d();
        rlx j = rlx.j(d.a);
        final rks aG = j.aG();
        String string = jobParameters.getExtras().getString("action");
        rjm rjmVar = j.f;
        aG.k.b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            d.e(new Runnable() { // from class: rop
                @Override // java.lang.Runnable
                public final void run() {
                    ros rosVar = ros.this;
                    rks rksVar = aG;
                    JobParameters jobParameters2 = jobParameters;
                    rksVar.k.a("AppMeasurementJobService processed last upload request.");
                    ((ror) rosVar.a).c(jobParameters2);
                }
            });
            return true;
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d().f(intent);
        return true;
    }
}
