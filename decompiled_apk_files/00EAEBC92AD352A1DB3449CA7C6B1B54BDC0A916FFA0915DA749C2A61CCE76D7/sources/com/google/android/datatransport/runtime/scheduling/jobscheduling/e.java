package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
/* loaded from: classes.dex */
public class e implements s {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6728a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.a.a.i.w.j.c f6729b;

    /* renamed from: c  reason: collision with root package name */
    private final g f6730c;

    public e(Context context, c.e.a.a.i.w.j.c cVar, g gVar) {
        this.f6728a = context;
        this.f6729b = cVar;
        this.f6730c = gVar;
    }

    private boolean a(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    int a(c.e.a.a.i.m mVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f6728a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(mVar.a().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(c.e.a.a.i.z.a.a(mVar.c())).array());
        if (mVar.b() != null) {
            adler32.update(mVar.b());
        }
        return (int) adler32.getValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.s
    public void a(c.e.a.a.i.m mVar, int i) {
        ComponentName componentName = new ComponentName(this.f6728a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f6728a.getSystemService("jobscheduler");
        int a2 = a(mVar);
        if (a(jobScheduler, a2, i)) {
            c.e.a.a.i.u.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", mVar);
            return;
        }
        long b2 = this.f6729b.b(mVar);
        g gVar = this.f6730c;
        JobInfo.Builder builder = new JobInfo.Builder(a2, componentName);
        gVar.a(builder, mVar.c(), b2, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", mVar.a());
        persistableBundle.putInt("priority", c.e.a.a.i.z.a.a(mVar.c()));
        if (mVar.b() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(mVar.b(), 0));
        }
        builder.setExtras(persistableBundle);
        c.e.a.a.i.u.a.a("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", mVar, Integer.valueOf(a2), Long.valueOf(this.f6730c.a(mVar.c(), b2, i)), Long.valueOf(b2), Integer.valueOf(i));
        jobScheduler.schedule(builder.build());
    }
}
