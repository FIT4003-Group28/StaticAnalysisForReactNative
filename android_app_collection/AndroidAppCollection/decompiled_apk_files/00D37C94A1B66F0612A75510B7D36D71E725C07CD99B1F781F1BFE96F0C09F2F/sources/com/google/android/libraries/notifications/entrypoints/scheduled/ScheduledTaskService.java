package com.google.android.libraries.notifications.entrypoints.scheduled;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ScheduledTaskService extends JobService {
    private final uem a() {
        try {
            return uel.a(getApplicationContext());
        } catch (IllegalStateException e) {
            uev.f("ScheduledTaskService", e, "Failed to get ChimeComponent for ScheduledTaskService", new Object[0]);
            return null;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final ujj ujjVar;
        uid.a(getApplicationContext());
        uem a = a();
        if (a == null) {
            return false;
        }
        a.jt();
        uds aB = a.aB();
        final int jobId = jobParameters.getJobId();
        if (axqb.a.get().e()) {
            aB.c.b(aojs.SCHEDULED_JOB).i();
        }
        final PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            uev.b("ScheduledTaskServiceHandler", "Job scheduled with NO extras. Job ID: '%d'", Integer.valueOf(jobId));
            return false;
        }
        try {
            final String string = extras.getString("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER");
            if (!TextUtils.isEmpty(string)) {
                for (ujj ujjVar2 : aB.a) {
                    if (string.equals(ujjVar2.f())) {
                        ujjVar = ujjVar2;
                        break;
                    }
                }
            }
            ujjVar = null;
            if (ujjVar == null) {
                uev.b("ScheduledTaskServiceHandler", "ChimeTask NOT found. Job ID: '%d', key: '%s'", Integer.valueOf(jobId), string);
                return false;
            }
            extras.putInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", extras.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", -1) + 1);
            uev.e("ScheduledTaskServiceHandler", "Starting job execution. Job ID: '%d', key: '%s'", Integer.valueOf(jobId), string);
            aB.b.b(new Runnable() { // from class: udr
                @Override // java.lang.Runnable
                public final void run() {
                    ujj ujjVar3 = ujj.this;
                    PersistableBundle persistableBundle = extras;
                    int i = jobId;
                    String str = string;
                    JobService jobService = this;
                    JobParameters jobParameters2 = jobParameters;
                    boolean z = false;
                    try {
                        uby e = ujjVar3.e(new Bundle(persistableBundle));
                        int i2 = e.c;
                        int i3 = i2 - 1;
                        if (i2 == 0) {
                            throw null;
                        }
                        if (i3 == 1) {
                            uev.c("ScheduledTaskServiceHandler", e.b, "Job finished with TRANSIENT_FAILURE. Job ID: '%d', key: '%s'", Integer.valueOf(i), aoec.a(str));
                            z = true;
                        } else if (i3 == 2) {
                            uev.c("ScheduledTaskServiceHandler", e.b, "Job finished with PERMANENT_FAILURE. Job ID: '%d', key: '%s'", Integer.valueOf(i), aoec.a(str));
                        } else {
                            uev.e("ScheduledTaskServiceHandler", "Job finished with SUCCESS code. Job ID: '%d', key: '%s'", Integer.valueOf(i), str);
                        }
                    } finally {
                        jobService.jobFinished(jobParameters2, false);
                    }
                }
            });
            return true;
        } catch (IllegalArgumentException e) {
            e = e;
            uev.c("ScheduledTaskServiceHandler", e, "Error retrieving handler key for Job. Job ID: '%d'", Integer.valueOf(jobId));
            return false;
        } catch (NullPointerException e2) {
            e = e2;
            uev.c("ScheduledTaskServiceHandler", e, "Error retrieving handler key for Job. Job ID: '%d'", Integer.valueOf(jobId));
            return false;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        uem a = a();
        if (a == null) {
            return false;
        }
        a.aB();
        return true;
    }
}
