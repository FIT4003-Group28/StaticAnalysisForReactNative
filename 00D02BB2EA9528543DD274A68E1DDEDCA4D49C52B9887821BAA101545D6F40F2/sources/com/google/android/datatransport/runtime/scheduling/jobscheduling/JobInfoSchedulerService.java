package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        clex.a(getApplicationContext());
        clev d = clew.d();
        d.b(string);
        d.c(clil.a(i));
        if (string2 != null) {
            ((clem) d).a = Base64.decode(string2, 0);
        }
        clex.b().a.a(d.a(), i2, new Runnable(this, jobParameters) { // from class: clfz
            private final JobInfoSchedulerService a;
            private final JobParameters b;

            {
                this.a = this;
                this.b = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.jobFinished(this.b, false);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
