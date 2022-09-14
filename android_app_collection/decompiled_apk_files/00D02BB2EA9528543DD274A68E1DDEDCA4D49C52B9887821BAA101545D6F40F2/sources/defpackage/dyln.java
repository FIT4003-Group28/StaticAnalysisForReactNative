package defpackage;
/* compiled from: PG */
/* renamed from: dyln  reason: default package */
/* loaded from: classes6.dex */
final class dyln implements dylu {
    public final dyew a;
    public dyjb b;
    final /* synthetic */ dylr c;

    public dyln(dylr dylrVar, dyew dyewVar) {
        this.c = dylrVar;
        dbsk.t(dyewVar, "observer");
        this.a = dyewVar;
    }

    public final void a(dyjb dyjbVar) {
        this.b = dyjbVar;
        this.c.e.e(dyjbVar);
    }

    @Override // defpackage.dylu
    public final void b(dyhw dyhwVar) {
        int i = dyzn.a;
        this.c.b.execute(new dylj(this, dyhwVar));
    }

    @Override // defpackage.dyvl
    public final void c(dyvk dyvkVar) {
        int i = dyzn.a;
        this.c.b.execute(new dylk(this, dyvkVar));
    }

    @Override // defpackage.dylu
    public final void d(dyjb dyjbVar, dyhw dyhwVar) {
        e(dyjbVar, dylt.PROCESSED, dyhwVar);
    }

    @Override // defpackage.dylu
    public final void e(dyjb dyjbVar, dylt dyltVar, dyhw dyhwVar) {
        int i = dyzn.a;
        dyfr g = this.c.g();
        if (dyjbVar.p == dyiy.CANCELLED && g != null && g.b()) {
            dypf dypfVar = new dypf();
            this.c.e.l(dypfVar);
            dyjb dyjbVar2 = dyjb.f;
            String valueOf = String.valueOf(dypfVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
            sb.append("ClientCall was cancelled at or after deadline. ");
            sb.append(valueOf);
            dyjbVar = dyjbVar2.h(sb.toString());
            dyhwVar = new dyhw();
        }
        this.c.b.execute(new dyll(this, dyjbVar, dyhwVar));
    }

    @Override // defpackage.dyvl
    public final void f() {
        if (this.c.a.a.a()) {
            return;
        }
        int i = dyzn.a;
        this.c.b.execute(new dylm(this));
    }
}
