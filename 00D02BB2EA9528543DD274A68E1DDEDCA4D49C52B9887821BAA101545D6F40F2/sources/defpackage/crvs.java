package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: crvs  reason: default package */
/* loaded from: classes5.dex */
public final class crvs {
    public final crvq a;
    private final dtbh b;

    public crvs(crvt crvtVar, crxb crxbVar, dtbh dtbhVar) {
        crve crveVar = new crve();
        crveVar.a = crvtVar.a;
        crveVar.b = crvtVar.b;
        crveVar.e = crvtVar.d;
        crveVar.b(crxbVar);
        if (dtbhVar != null) {
            crveVar.d = dtbhVar;
            crveVar.c = crvtVar.c;
            this.a = crveVar;
            this.b = dtbhVar;
            return;
        }
        throw new NullPointerException("Null operation");
    }

    public final void a() {
        crvq crvqVar = this.a;
        ((crve) crvqVar).n = true;
        crvqVar.c(31);
    }

    public final void b() {
        this.a.c(35);
    }

    public final void c(@dzsi dgpm dgpmVar, @dzsi dgpw dgpwVar) {
        crvq crvqVar = this.a;
        crve crveVar = (crve) crvqVar;
        crveVar.h = dgpmVar;
        crveVar.g = dgpwVar;
        crvqVar.c(38);
    }

    public final void d(long j) {
        crvq crvqVar = this.a;
        ((crve) crvqVar).o = Long.valueOf(j);
        crvqVar.c(38);
    }

    public final void e() {
        this.a.c(36);
    }

    public final void f(@dzsi dgpw dgpwVar, @dzsi dgpm dgpmVar) {
        crvq crvqVar = this.a;
        if (dgpwVar == null) {
            dgpwVar = dgpw.PS_IMPORT_FAILURE;
        }
        crve crveVar = (crve) crvqVar;
        crveVar.g = dgpwVar;
        crveVar.h = dgpmVar;
        crvqVar.c(39);
    }

    public final void g(List<String> list) {
        crxb d = this.a.a().d();
        crvq crvqVar = this.a;
        crxa f = crxb.f();
        f.d(d.a());
        f.c(d.b());
        f.b(list);
        f.e(d.d());
        crvqVar.b(f.f());
        crvqVar.c(40);
    }

    public final void h() {
        this.a.c(45);
    }

    public final void i(dgpw dgpwVar) {
        dgpw dgpwVar2 = dgpw.OK;
        int ordinal = dgpwVar.ordinal();
        int i = ordinal != 0 ? ordinal != 31 ? this.b == dtbh.DELETE ? 46 : 3 : 38 : 41;
        crvq crvqVar = this.a;
        ((crve) crvqVar).g = dgpwVar;
        crvqVar.c(i);
    }

    public final void j() {
        this.a.c(46);
    }

    public final void k(dgpm dgpmVar) {
        int i = 1;
        if (this.b == dtbh.NEW_UPLOAD) {
            i = true != crxr.b(dgpmVar) ? 3 : 38;
        } else if (this.b == dtbh.IMPORT) {
            i = 39;
        } else if (this.b == dtbh.DELETE) {
            i = 46;
        }
        crvq crvqVar = this.a;
        ((crve) crvqVar).h = dgpmVar;
        crvqVar.c(i);
    }

    public final void l(int i) {
        crvq crvqVar = this.a;
        ((crve) crvqVar).l = Integer.valueOf(i);
        crvqVar.c(56);
    }

    public final void m(boolean z) {
        this.a.c(z ? 49 : 50);
    }

    public final void n(@dzsi crts crtsVar) {
        ((crve) this.a).f = crtsVar;
    }
}
