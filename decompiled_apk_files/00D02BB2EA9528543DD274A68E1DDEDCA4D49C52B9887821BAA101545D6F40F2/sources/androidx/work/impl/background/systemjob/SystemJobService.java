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
/* loaded from: classes2.dex */
public class SystemJobService extends JobService implements bct {
    private bdn a;
    private final Map<String, JobParameters> b = new HashMap();

    static {
        bbz.f("SystemJobService");
    }

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

    @Override // defpackage.bct
    public final void a(String str, boolean z) {
        JobParameters remove;
        bbz.e().a(new Throwable[0]);
        synchronized (this.b) {
            remove = this.b.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            bdn g = bdn.g(getApplicationContext());
            this.a = g;
            g.e.d(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            bbz.e();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        bdn bdnVar = this.a;
        if (bdnVar != null) {
            bdnVar.e.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        bcr bcrVar;
        if (this.a == null) {
            bbz.e().a(new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String b = b(jobParameters);
        if (TextUtils.isEmpty(b)) {
            bbz.e().b(new Throwable[0]);
            return false;
        }
        synchronized (this.b) {
            if (!this.b.containsKey(b)) {
                bbz.e().a(new Throwable[0]);
                this.b.put(b, jobParameters);
                if (Build.VERSION.SDK_INT >= 24) {
                    bcrVar = new bcr();
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
                    bcrVar = null;
                }
                this.a.j(b, bcrVar);
                return true;
            }
            bbz.e().a(new Throwable[0]);
            return false;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.a == null) {
            bbz.e().a(new Throwable[0]);
            return true;
        }
        String b = b(jobParameters);
        if (TextUtils.isEmpty(b)) {
            bbz.e().b(new Throwable[0]);
            return false;
        }
        bbz.e().a(new Throwable[0]);
        synchronized (this.b) {
            this.b.remove(b);
        }
        this.a.k(b);
        bcw bcwVar = this.a.e;
        synchronized (bcwVar.d) {
            contains = bcwVar.c.contains(b);
        }
        return !contains;
    }
}
