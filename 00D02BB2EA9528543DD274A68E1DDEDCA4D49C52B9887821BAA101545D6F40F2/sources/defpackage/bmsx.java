package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: bmsx  reason: default package */
/* loaded from: classes3.dex */
public final class bmsx {
    static final eaow a = eaow.a(1);
    public final ckcw b;
    public final bmso c;
    public final cqat d;
    private final btvo e;

    public bmsx(btvo btvoVar, ckcw ckcwVar, bmso bmsoVar, cqat cqatVar) {
        this.e = btvoVar;
        this.b = ckcwVar;
        this.c = bmsoVar;
        this.d = cqatVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(bmsd bmsdVar, eapd eapdVar, JobParameters jobParameters, JobService jobService) {
        if (bmsdVar.a().isEmpty()) {
            throw new NoSuchElementException("empty");
        }
        bmsd c = bmsd.c(bmsdVar.a().subList(1, bmsdVar.a().size()));
        bmrx bmrxVar = (bmrx) c;
        if (!bmrxVar.a.isEmpty()) {
            JobInfo.Builder a2 = bmsh.a(new ComponentName(jobService, jobService.getClass()));
            a2.setExtras(bmsh.b(c));
            a2.setOverrideDeadline(bmsh.f(bmsh.d(this.e), c.e().b(), eapdVar).b);
            if (bmsh.e((JobScheduler) jobService.getSystemService("jobscheduler"), a2.build()) != 1) {
                ckco ckcoVar = (ckco) this.b.a(ckgo.x);
                for (int i = 0; i != bmrxVar.a.size(); i++) {
                    ckcoVar.a(ckgk.a(8));
                }
            }
        }
        jobService.jobFinished(jobParameters, false);
    }

    public final void b(bmsd bmsdVar, eapd eapdVar, JobParameters jobParameters, JobService jobService) {
        if (!eapdVar.w(bmsdVar.e().b().e(bmsh.d(this.e)).e(a))) {
            jobService.jobFinished(jobParameters, true);
        } else {
            a(bmsdVar, eapdVar, jobParameters, jobService);
        }
    }
}
