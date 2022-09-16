package defpackage;
/* compiled from: PG */
/* renamed from: wfr  reason: default package */
/* loaded from: classes4.dex */
final class wfr implements wfk {
    final /* synthetic */ wfv a;

    public wfr(wfv wfvVar) {
        this.a = wfvVar;
    }

    @Override // defpackage.wfk
    public final void a() {
        wfv wfvVar = this.a;
        if (!((wac) wfvVar.a.get()).t()) {
            wfvVar.f(true);
        }
        wfvVar.g(wgg.CANCELLED, null);
        wfvVar.c.f(new wgb());
        wfvVar.b.execute(new wft(wfvVar));
    }

    @Override // defpackage.wfk
    public final void b(Exception exc) {
        this.a.e(exc);
    }

    @Override // defpackage.wfk
    public final void c(aarw aarwVar) {
        this.a.m(aarwVar, null);
    }
}
