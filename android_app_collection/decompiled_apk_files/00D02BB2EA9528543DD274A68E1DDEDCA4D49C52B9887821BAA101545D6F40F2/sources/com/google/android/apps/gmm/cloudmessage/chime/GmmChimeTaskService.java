package com.google.android.apps.gmm.cloudmessage.chime;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class GmmChimeTaskService extends JobService {
    public ckcw a;
    public gdo b;
    public bvrv c;
    @dzsi
    public pbp d;

    @Override // android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
        this.a.f(ckhc.CHIME_TASK_SERVICE);
        this.b.b();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.b.e();
        this.a.g(ckhc.CHIME_TASK_SERVICE);
        super.onDestroy();
        this.c.a();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final cvle cvleVar;
        pbp pbpVar = this.d;
        if (pbpVar != null) {
            cvlg cvlgVar = pbpVar.a;
            final int jobId = jobParameters.getJobId();
            final PersistableBundle extras = jobParameters.getExtras();
            if (extras == null) {
                cvlw.d("ScheduledTaskServiceHandler", "Job scheduled with NO extras. Job ID: '%d'", Integer.valueOf(jobId));
                return false;
            }
            try {
                final String string = extras.getString("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER");
                if (!TextUtils.isEmpty(string)) {
                    for (cvle cvleVar2 : cvlgVar.a) {
                        if (string.equals(cvleVar2.c())) {
                            cvleVar = cvleVar2;
                            break;
                        }
                    }
                }
                cvleVar = null;
                if (cvleVar == null) {
                    cvlw.d("ScheduledTaskServiceHandler", "ScheduledTaskHandler NOT found. Job ID: '%d', key: '%s'", Integer.valueOf(jobId), string);
                    return false;
                }
                cvlw.a("ScheduledTaskServiceHandler", "Starting job execution. Job ID: '%d', key: '%s'", Integer.valueOf(jobId), string);
                cvlgVar.b.a(new Runnable(cvleVar, extras, jobId, string, this, jobParameters) { // from class: cvlf
                    private final cvle a;
                    private final PersistableBundle b;
                    private final int c;
                    private final String d;
                    private final JobService e;
                    private final JobParameters f;

                    {
                        this.a = cvleVar;
                        this.b = extras;
                        this.c = jobId;
                        this.d = string;
                        this.e = this;
                        this.f = jobParameters;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cvle cvleVar3 = this.a;
                        PersistableBundle persistableBundle = this.b;
                        int i = this.c;
                        String str = this.d;
                        JobService jobService = this.e;
                        JobParameters jobParameters2 = this.f;
                        boolean z = false;
                        try {
                            cviw d = cvleVar3.d(new Bundle(persistableBundle));
                            int b = d.b();
                            int i2 = b - 1;
                            if (b == 0) {
                                throw null;
                            }
                            if (i2 == 1) {
                                d.a();
                                cvlw.e("ScheduledTaskServiceHandler", "Job finished with TRANSIENT_FAILURE. Job ID: '%d', key: '%s'", Integer.valueOf(i), dfcx.a(str));
                                z = true;
                            } else if (i2 == 2) {
                                d.a();
                                cvlw.e("ScheduledTaskServiceHandler", "Job finished with PERMANENT_FAILURE. Job ID: '%d', key: '%s'", Integer.valueOf(i), dfcx.a(str));
                            } else {
                                cvlw.a("ScheduledTaskServiceHandler", "Job finished with SUCCESS code. Job ID: '%d', key: '%s'", Integer.valueOf(i), str);
                            }
                        } finally {
                            jobService.jobFinished(jobParameters2, false);
                        }
                    }
                });
                return true;
            } catch (NullPointerException unused) {
                cvlw.e("ScheduledTaskServiceHandler", "Error retrieving handler key for Job. Job ID: '%d'", Integer.valueOf(jobId));
                return false;
            }
        }
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return this.d != null;
    }
}
