package defpackage;
/* compiled from: PG */
/* renamed from: afkj  reason: default package */
/* loaded from: classes2.dex */
final class afkj implements Runnable {
    final /* synthetic */ afkr a;
    final /* synthetic */ dbsg b;
    final /* synthetic */ duqp c;
    final /* synthetic */ durz d;
    final /* synthetic */ afkn e;

    public afkj(afkn afknVar, afkr afkrVar, dbsg dbsgVar, duqp duqpVar, durz durzVar) {
        this.e = afknVar;
        this.a = afkrVar;
        this.b = dbsgVar;
        this.c = duqpVar;
        this.d = durzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        duqi b;
        if (this.e.b.g.a.a(j.STARTED)) {
            affw.a(this.a.f, this.e.b, (Runnable) this.b.b());
            if (this.a.m() != null) {
                b = this.a.m();
            } else {
                duqk duqkVar = this.c.b;
                if (duqkVar == null) {
                    duqkVar = duqk.d;
                }
                b = duqi.b(duqkVar.b);
                if (b == null) {
                    b = duqi.ERROR;
                }
            }
            boolean booleanExtra = this.a.f.getBooleanExtra("GMM_ENABLE_ONE_BACK_TAP", this.e.a.contains(b));
            afkn afknVar = this.e;
            ((efh) afknVar.c).e = booleanExtra;
            afknVar.f.o(bvku.d(this.d, null, true));
        }
    }
}
