package defpackage;
/* compiled from: PG */
/* renamed from: afkw  reason: default package */
/* loaded from: classes2.dex */
public final class afkw implements Runnable {
    final /* synthetic */ dhjx a;
    final /* synthetic */ duqa b;
    final /* synthetic */ afkx c;

    public afkw(afkx afkxVar, dhjx dhjxVar, duqa duqaVar) {
        this.c = afkxVar;
        this.a = dhjxVar;
        this.b = duqaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        alad c;
        dhjx dhjxVar = this.a;
        dpum dpumVar = null;
        if (dhjxVar != null && (c = alad.c(dhjxVar)) != null) {
            alao.d(this.c.b.a(), c);
            dpumVar = c.i.h();
        }
        cqf cqfVar = new cqf(dnqb.URL, this.b.a, "", null, "", "");
        if (dpumVar == null) {
            this.c.a.a().b(cqfVar, true);
        } else {
            this.c.a.a().c(cqfVar, dpumVar, false);
        }
    }
}
