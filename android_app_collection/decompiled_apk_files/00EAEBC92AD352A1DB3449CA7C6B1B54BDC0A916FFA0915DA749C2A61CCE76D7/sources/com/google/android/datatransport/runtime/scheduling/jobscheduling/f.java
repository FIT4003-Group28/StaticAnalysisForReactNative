package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
/* loaded from: classes.dex */
final /* synthetic */ class f implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final JobInfoSchedulerService f6731b;

    /* renamed from: c  reason: collision with root package name */
    private final JobParameters f6732c;

    private f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f6731b = jobInfoSchedulerService;
        this.f6732c = jobParameters;
    }

    public static Runnable a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        return new f(jobInfoSchedulerService, jobParameters);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6731b.jobFinished(this.f6732c, false);
    }
}
