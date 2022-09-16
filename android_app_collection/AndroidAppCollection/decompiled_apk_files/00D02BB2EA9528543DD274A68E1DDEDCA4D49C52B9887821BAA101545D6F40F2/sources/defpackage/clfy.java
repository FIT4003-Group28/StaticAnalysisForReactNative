package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
/* compiled from: PG */
/* renamed from: clfy  reason: default package */
/* loaded from: classes5.dex */
public final class clfy implements clgq {
    private final Context a;
    private final clgu b;
    private final clge c;

    public clfy(Context context, clgu clguVar, clge clgeVar) {
        this.a = context;
        this.b = clguVar;
        this.c = clgeVar;
    }

    @Override // defpackage.clgq
    public final void a(clew clewVar, int i) {
        ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(clewVar.a().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(clil.b(clewVar.c())).array());
        if (clewVar.b() != null) {
            adler32.update(clewVar.b());
        }
        int value = (int) adler32.getValue();
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i2 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == value) {
                if (i2 >= i) {
                    clfp.b("JobInfoScheduler");
                    return;
                }
            }
        }
        long c = this.b.c(clewVar);
        clge clgeVar = this.c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        clcv c2 = clewVar.c();
        builder.setMinimumLatency(clgeVar.c(c2, c, i));
        Set<clgd> c3 = clgeVar.b().get(c2).c();
        if (c3.contains(clgd.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (c3.contains(clgd.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (c3.contains(clgd.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", clewVar.a());
        persistableBundle.putInt("priority", clil.b(clewVar.c()));
        if (clewVar.b() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(clewVar.b(), 0));
        }
        builder.setExtras(persistableBundle);
        this.c.c(clewVar.c(), c, i);
        clfp.b("JobInfoScheduler");
        jobScheduler.schedule(builder.build());
    }
}
