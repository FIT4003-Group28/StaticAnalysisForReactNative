package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ammj  reason: default package */
/* loaded from: classes.dex */
public final class ammj implements amcn {
    final /* synthetic */ amox a;
    final /* synthetic */ amml b;

    public ammj(amml ammlVar, amox amoxVar) {
        this.b = ammlVar;
        this.a = amoxVar;
    }

    @Override // defpackage.amcn
    public final void b(alyh alyhVar, @dzsi alyg alygVar, @dzsi alyg alygVar2) {
        amox amoxVar = this.a;
        if (alygVar == null || !amoxVar.j()) {
            return;
        }
        amoxVar.s(alyhVar, alygVar, alygVar2, null);
    }

    @Override // defpackage.amcn
    public final void c(alyh alyhVar, int i) {
        amox amoxVar = this.a;
        amog amogVar = amoxVar.e;
        if (amogVar == null) {
            return;
        }
        amqn h = amoxVar.c.h(amogVar, alyhVar, false);
        if (!(h instanceof amps)) {
            return;
        }
        boolean z = ((amps) h).f;
        if (i == -1 && !z) {
            return;
        }
        amoxVar.d.a(alyhVar, amoxVar.m);
    }

    @Override // defpackage.amcn
    public final void m() {
        this.a.p();
        if (!this.b.r) {
            this.a.l();
        }
        this.b.u();
    }
}
