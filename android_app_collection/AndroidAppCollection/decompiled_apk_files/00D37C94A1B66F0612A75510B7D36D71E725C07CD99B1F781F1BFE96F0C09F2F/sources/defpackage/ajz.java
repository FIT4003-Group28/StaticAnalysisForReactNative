package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajz  reason: default package */
/* loaded from: classes.dex */
public final class ajz extends JobServiceEngine {
    final akc a;
    final Object b;
    JobParameters c;

    public ajz(akc akcVar) {
        super(akcVar);
        this.b = new Object();
        this.a = akcVar;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.c = jobParameters;
        this.a.b(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        aju ajuVar = this.a.d;
        if (ajuVar != null) {
            ajuVar.cancel(false);
        }
        synchronized (this.b) {
            this.c = null;
        }
        return true;
    }
}
