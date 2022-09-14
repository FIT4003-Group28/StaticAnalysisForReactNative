package com.teslamotors.plugins.calendar;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.CalendarContract;
import android.util.Log;
import com.baidu.mapapi.UIMsg;
/* loaded from: classes.dex */
public class CalendarJobService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5263a = "CalendarJobService";

    /* renamed from: b  reason: collision with root package name */
    private a f5264b = null;

    public static void a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(UIMsg.f_FUN.FUN_ID_MAP_ACTION, new ComponentName(context, CalendarJobService.class));
        builder.setRequiredNetworkType(1);
        builder.addTriggerContentUri(new JobInfo.TriggerContentUri(CalendarContract.CONTENT_URI, 1));
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Log.i(f5263a, String.format("Scheduling calendar sync with %d pending jobs", Integer.valueOf(jobScheduler.getAllPendingJobs().size())));
        jobScheduler.schedule(builder.build());
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        Intent a2 = CalendarSyncService.a(getApplicationContext(), new Intent());
        if (a2 != null) {
            Log.i(f5263a, "Starting calendar sync");
            this.f5264b = new a(a2, jobParameters);
            this.f5264b.execute(new Object[0]);
            return true;
        }
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f5264b == null || this.f5264b.getStatus().equals(AsyncTask.Status.FINISHED)) {
            return false;
        }
        this.f5264b.cancel(true);
        return true;
    }

    /* loaded from: classes.dex */
    class a extends AsyncTask {

        /* renamed from: b  reason: collision with root package name */
        private final Intent f5266b;

        /* renamed from: c  reason: collision with root package name */
        private volatile Object f5267c = null;

        /* renamed from: d  reason: collision with root package name */
        private final JobParameters f5268d;

        public a(Intent intent, JobParameters jobParameters) {
            this.f5266b = intent;
            this.f5268d = jobParameters;
        }

        @Override // android.os.AsyncTask
        protected Object doInBackground(Object[] objArr) {
            String b2 = CalendarSyncService.b(this.f5266b.getLongExtra("vid", -1L), this.f5266b.getStringExtra("reason"), CalendarJobService.this.getApplicationContext(), Boolean.valueOf(this.f5266b.getBooleanExtra("force_sync", false)), Boolean.valueOf(this.f5266b.getBooleanExtra("sync_enabled", false)));
            Log.i(CalendarJobService.f5263a, String.format("Calendar sync finished with result: %s", b2));
            return b2;
        }

        @Override // android.os.AsyncTask
        protected void onPostExecute(Object obj) {
            String str = (String) obj;
            if ("CALENDAR_SYNC_NO_ERROR".equalsIgnoreCase(str)) {
                CalendarJobService.a(CalendarJobService.this.getApplicationContext());
            }
            CalendarJobService.this.jobFinished(this.f5268d, "CALENDAR_SYNC_FAILED_TO_SEND".equalsIgnoreCase(str));
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            CalendarJobService.a(CalendarJobService.this.getApplicationContext());
            Log.i(CalendarJobService.f5263a, String.format("Calendar sync cancelled", new Object[0]));
        }
    }
}
