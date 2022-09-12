package defpackage;

import android.app.job.JobParameters;
/* compiled from: PG */
/* renamed from: cogn  reason: default package */
/* loaded from: classes5.dex */
final class cogn implements degu<Void> {
    final /* synthetic */ JobParameters a;
    final /* synthetic */ cogo b;

    public cogn(cogo cogoVar, JobParameters jobParameters) {
        this.b = cogoVar;
        this.a = jobParameters;
    }

    @Override // defpackage.degu
    public final void a(final Throwable th) {
        cogo cogoVar = this.b;
        cogoVar.a(cogoVar.getApplicationContext()).c.execute(new Runnable(th) { // from class: cogm
            private final Throwable a;

            {
                this.a = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                throw new deiw(this.a);
            }
        });
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r3) {
        this.b.jobFinished(this.a, false);
    }
}
