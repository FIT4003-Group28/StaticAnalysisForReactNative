package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: ake  reason: default package */
/* loaded from: classes2.dex */
final class ake implements akd {
    final JobWorkItem a;
    final /* synthetic */ akf b;

    public ake(akf akfVar, JobWorkItem jobWorkItem) {
        this.b = akfVar;
        this.a = jobWorkItem;
    }

    @Override // defpackage.akd
    public final Intent a() {
        return this.a.getIntent();
    }

    @Override // defpackage.akd
    public final void b() {
        synchronized (this.b.b) {
            JobParameters jobParameters = this.b.c;
            if (jobParameters != null) {
                jobParameters.completeWork(this.a);
            }
        }
    }
}
