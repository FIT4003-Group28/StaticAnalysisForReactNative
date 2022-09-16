package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobService;
/* compiled from: PG */
/* renamed from: bmsw  reason: default package */
/* loaded from: classes3.dex */
public final class bmsw implements degu<bmsj> {
    final /* synthetic */ bmsd a;
    final /* synthetic */ eapd b;
    final /* synthetic */ JobParameters c;
    final /* synthetic */ JobService d;
    final /* synthetic */ bmsx e;

    public bmsw(bmsx bmsxVar, bmsd bmsdVar, eapd eapdVar, JobParameters jobParameters, JobService jobService) {
        this.e = bmsxVar;
        this.a = bmsdVar;
        this.b = eapdVar;
        this.c = jobParameters;
        this.d = jobService;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.e.a(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(bmsj bmsjVar) {
        dbsg<bmsm> b = bmsjVar.b();
        if (!b.a()) {
            this.e.a(this.a, this.b, this.c, this.d);
        } else {
            deha.q(b.b().b(), new bmsv(this), dege.a);
        }
    }
}
