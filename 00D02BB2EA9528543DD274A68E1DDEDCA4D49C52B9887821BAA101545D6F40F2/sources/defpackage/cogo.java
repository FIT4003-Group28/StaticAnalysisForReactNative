package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteDatabase;
import android.os.BatteryManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cogo  reason: default package */
/* loaded from: classes5.dex */
public abstract class cogo extends JobService {
    private static final long a = TimeUnit.DAYS.toMillis(1);

    public static boolean b(Context context, Class<? extends cogo> cls) {
        JobInfo jobInfo;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            return false;
        }
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                jobInfo = null;
                break;
            }
            jobInfo = it.next();
            if (jobInfo.getId() == 216934020) {
                break;
            }
        }
        JobInfo.Builder requiresCharging = new JobInfo.Builder(216934020, new ComponentName(context, cls)).setPersisted(true).setRequiresCharging(true);
        long j = a;
        JobInfo build = requiresCharging.setPeriodic(j).build();
        return (jobInfo != null && jobInfo.isRequireCharging() == build.isRequireCharging() && jobInfo.getIntervalMillis() == j) || jobScheduler.schedule(build) == 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract cogy a(Context context);

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Context applicationContext = getApplicationContext();
        Intent registerReceiver = applicationContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver.getIntExtra("status", 0);
        registerReceiver.getIntExtra("plugged", 0);
        int intExtra2 = registerReceiver.getIntExtra("level", -1);
        int intExtra3 = registerReceiver.getIntExtra("scale", -1);
        float f = -1.0f;
        if (intExtra2 != -1 && intExtra3 != -1 && intExtra3 > 0) {
            f = intExtra2 / intExtra3;
        }
        BatteryManager batteryManager = (BatteryManager) applicationContext.getSystemService("batterymanager");
        if (batteryManager != null) {
            batteryManager.getLongProperty(5);
        }
        if (intExtra == 3 || f < 0.25f) {
            jobFinished(jobParameters, true);
            return false;
        }
        cogy a2 = a(this);
        final long millis = TimeUnit.DAYS.toMillis(30L);
        deha.q(a2.b.a(new dbrn(millis) { // from class: cogw
            private final long a;

            {
                this.a = millis;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                long j = this.a;
                cohc cohcVar = (cohc) obj;
                cqat cqatVar = cohcVar.b;
                long currentTimeMillis = System.currentTimeMillis() - j;
                SQLiteDatabase sQLiteDatabase = cohcVar.a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("time< ");
                sb.append(currentTimeMillis);
                sQLiteDatabase.delete("collections", sb.toString(), new String[0]);
                SimpleDateFormat.getDateTimeInstance().format(new Date(currentTimeMillis));
                int i = cohd.e;
                return null;
            }
        }), new cogn(this, jobParameters), dege.a);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
