package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import c.e.a.a.i.m;
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        c.e.a.a.i.r.a(getApplicationContext());
        m.a d2 = c.e.a.a.i.m.d();
        d2.a(string);
        d2.a(c.e.a.a.i.z.a.a(i));
        if (string2 != null) {
            d2.a(Base64.decode(string2, 0));
        }
        c.e.a.a.i.r.b().a().a(d2.a(), i2, f.a(this, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
