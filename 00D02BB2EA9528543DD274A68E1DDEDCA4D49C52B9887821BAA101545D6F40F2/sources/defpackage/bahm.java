package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bahm  reason: default package */
/* loaded from: classes3.dex */
public class bahm implements baeq {
    public final bbbb a;
    public boolean b;
    private final gga d;
    private final bvjj e;
    private final akfa f;
    private final axwq g;
    private final barv h;
    private final bbbd i;
    private final ania j;
    private final bahl k;
    public dcdc<bayj> c = dcdc.e();
    @dzsi
    private baqh l = null;

    public bahm(gga ggaVar, bvjj bvjjVar, akfa akfaVar, axwq axwqVar, baho bahoVar, barv barvVar, bbbd bbbdVar, bbbb bbbbVar, ania aniaVar) {
        this.d = ggaVar;
        this.e = bvjjVar;
        this.f = akfaVar;
        this.g = axwqVar;
        this.h = barvVar;
        this.i = bbbdVar;
        this.a = bbbbVar;
        this.j = aniaVar;
        gga a = bahoVar.a.a();
        baho.a(a, 1);
        cklf a2 = bahoVar.b.a();
        baho.a(a2, 2);
        cjqy a3 = bahoVar.c.a();
        baho.a(a3, 3);
        this.k = new bahl(a, a2, a3);
    }

    private final boolean g() {
        return this.j.a() && !this.e.o(bvjk.gK, this.f.j(), false);
    }

    @Override // defpackage.baeq
    public Boolean a() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.baeq
    public baye b() {
        return this.i.a(d() == null && e().isEmpty(), this.j.a(), true ^ this.e.o(bvjk.gK, this.f.j(), false));
    }

    @Override // defpackage.baeq
    public bayn c() {
        return this.k;
    }

    @Override // defpackage.baeq
    @dzsi
    public baqh d() {
        baru baruVar = null;
        if (!g()) {
            return null;
        }
        baru a = this.h.a();
        baqh baqhVar = this.l;
        if (baqhVar != null && baqhVar.h().equals(a.h())) {
            return this.l;
        }
        if (true != a.Pd().isEmpty()) {
            baruVar = a;
        }
        this.l = baruVar;
        return baruVar;
    }

    @Override // defpackage.baeq
    public List<bayj> e() {
        return !g() ? dcdc.e() : this.c;
    }

    public void f() {
        this.b = true;
        this.g.y().c().b(this.d, new aa(this) { // from class: bahk
            private final bahm a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                bahm bahmVar = this.a;
                dcdc dcdcVar = (dcdc) obj;
                dccx F = dcdc.F();
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    drjs drjsVar = (drjs) dcdcVar.get(i);
                    if (drjsVar.e.isEmpty()) {
                        F.g(bahmVar.a.a(drjsVar));
                    }
                }
                bahmVar.c = F.f();
                bahmVar.b = false;
                cqkx.p(bahmVar);
            }
        });
    }
}
