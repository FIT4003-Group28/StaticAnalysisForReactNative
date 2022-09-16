package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: ujm  reason: default package */
/* loaded from: classes4.dex */
final class ujm implements ankb {
    final /* synthetic */ ucp a;
    final /* synthetic */ int b;
    final /* synthetic */ ujn c;

    public ujm(ujn ujnVar, ucp ucpVar, int i) {
        this.c = ujnVar;
        this.a = ucpVar;
        this.b = i;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        Object[] objArr = new Object[3];
        objArr[0] = this.c.a.getApplicationContext().getPackageName();
        ujn ujnVar = this.c;
        ucp ucpVar = this.a;
        objArr[1] = ujnVar.e(ucpVar == null ? null : ucpVar.a, this.b);
        objArr[2] = Integer.valueOf(this.b);
        if (uev.b.b(5)) {
            Log.w("Notifications", uew.a("ChimeTaskSchedulerApiImpl", "Failed to schedule a job for package [%s] with ID: %s, type: %s", objArr));
        }
    }

    @Override // defpackage.ankb
    public final void b(Object obj) {
        Object[] objArr = new Object[3];
        objArr[0] = this.c.a.getApplicationContext().getPackageName();
        ujn ujnVar = this.c;
        ucp ucpVar = this.a;
        objArr[1] = ujnVar.e(ucpVar == null ? null : ucpVar.a, this.b);
        objArr[2] = Integer.valueOf(this.b);
        uev.a("ChimeTaskSchedulerApiImpl", "Successfully scheduled a job for package [%s], with ID: %s, type: %s", objArr);
    }
}
