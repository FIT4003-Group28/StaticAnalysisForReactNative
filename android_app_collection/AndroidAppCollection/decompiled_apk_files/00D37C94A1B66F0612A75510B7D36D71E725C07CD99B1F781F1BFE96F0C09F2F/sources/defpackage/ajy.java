package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
/* compiled from: PG */
/* renamed from: ajy  reason: default package */
/* loaded from: classes.dex */
final class ajy implements ajx {
    final JobWorkItem a;
    final /* synthetic */ ajz b;

    public ajy(ajz ajzVar, JobWorkItem jobWorkItem) {
        this.b = ajzVar;
        this.a = jobWorkItem;
    }

    @Override // defpackage.ajx
    public final void a() {
        synchronized (this.b.b) {
            JobParameters jobParameters = this.b.c;
            if (jobParameters != null) {
                jobParameters.completeWork(this.a);
            }
        }
    }

    @Override // defpackage.ajx
    public final void b() {
        this.a.getIntent();
    }
}
