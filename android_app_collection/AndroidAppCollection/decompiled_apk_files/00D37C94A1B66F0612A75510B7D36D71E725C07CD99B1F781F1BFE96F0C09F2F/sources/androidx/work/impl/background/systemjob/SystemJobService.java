package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements bqv {
    private static final String a = bqf.b("SystemJobService");
    private brq b;
    private final Map c = new HashMap();

    private static String b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.bqv
    public final void a(String str, boolean z) {
        JobParameters jobParameters;
        bqf a2 = bqf.a();
        String.format("%s executed on JobScheduler", str);
        a2.d(new Throwable[0]);
        synchronized (this.c) {
            jobParameters = (JobParameters) this.c.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            brq h = brq.h(getApplicationContext());
            this.b = h;
            h.f.b(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            bqf.a();
            bqf.g(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        brq brqVar = this.b;
        if (brqVar != null) {
            brqVar.f.c(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        aed aedVar;
        if (this.b == null) {
            bqf.a().d(new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String b = b(jobParameters);
        if (TextUtils.isEmpty(b)) {
            bqf.a();
            bqf.e(a, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.c) {
            if (!this.c.containsKey(b)) {
                bqf a2 = bqf.a();
                String.format("onStartJob for %s", b);
                a2.d(new Throwable[0]);
                this.c.put(b, jobParameters);
                if (Build.VERSION.SDK_INT >= 24) {
                    aedVar = new aed();
                    if (jobParameters.getTriggeredContentUris() != null) {
                        Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        jobParameters.getNetwork();
                    }
                } else {
                    aedVar = null;
                }
                this.b.m(b, aedVar);
                return true;
            }
            bqf a3 = bqf.a();
            String.format("Job is already being executed by SystemJobService: %s", b);
            a3.d(new Throwable[0]);
            return false;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.b == null) {
            bqf.a().d(new Throwable[0]);
            return true;
        }
        String b = b(jobParameters);
        if (TextUtils.isEmpty(b)) {
            bqf.a();
            bqf.e(a, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        bqf a2 = bqf.a();
        String.format("onStopJob for %s", b);
        a2.d(new Throwable[0]);
        synchronized (this.c) {
            this.c.remove(b);
        }
        this.b.l(b);
        bqy bqyVar = this.b.f;
        synchronized (bqyVar.g) {
            contains = bqyVar.f.contains(b);
        }
        return !contains;
    }
}
