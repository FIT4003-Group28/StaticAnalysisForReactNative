package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akf  reason: default package */
/* loaded from: classes2.dex */
public final class akf extends JobServiceEngine {
    final akh a;
    final Object b;
    JobParameters c;

    public akf(akh akhVar) {
        super(akhVar);
        this.b = new Object();
        this.a = akhVar;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.c = jobParameters;
        this.a.b(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        aka akaVar = this.a.b;
        if (akaVar != null) {
            akaVar.cancel(false);
        }
        synchronized (this.b) {
            this.c = null;
        }
        return true;
    }
}
