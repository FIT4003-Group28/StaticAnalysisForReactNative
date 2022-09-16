package defpackage;
/* compiled from: PG */
/* renamed from: asxc  reason: default package */
/* loaded from: classes2.dex */
final class asxc implements asma {
    final /* synthetic */ asxe a;

    public asxc(asxe asxeVar) {
        this.a = asxeVar;
    }

    @Override // defpackage.asma
    public final void a(boolean z) {
        if (!this.a.f.a()) {
            if (this.a.f == asld.FREE_MOVEMENT) {
                return;
            }
            this.a.b.y();
        } else if (z) {
            this.a.c.n();
        } else {
            this.a.b.y();
        }
    }

    @Override // defpackage.asma
    public final void b(float f) {
        asxe asxeVar = this.a;
        if (asxeVar.h == null) {
            return;
        }
        asxw asxwVar = asxeVar.b;
        Float valueOf = Float.valueOf(f);
        asxm asxmVar = (asxm) asxwVar;
        Float a = ((aszl) asxmVar.a).c.a();
        if (a == null || !a.equals(valueOf)) {
            aszl aszlVar = (aszl) asxmVar.a;
            asle<?> b = aszlVar.c.b();
            b.b = valueOf;
            aszlVar.c = b.a();
            asxmVar.c = ((aszl) asxmVar.a).a();
        }
        asxe asxeVar2 = this.a;
        asxeVar2.c.o = valueOf;
        asld asldVar = asxeVar2.h.c.a;
        if (asldVar.b() || asldVar == asld.FREE_MOVEMENT) {
            return;
        }
        this.a.b.y();
    }

    @Override // defpackage.asma
    public final void c(alco alcoVar) {
    }

    @Override // defpackage.asma
    public final void d(alie alieVar) {
    }

    @Override // defpackage.asma
    public final void e(alhk alhkVar) {
        if (!this.a.g()) {
            return;
        }
        amvg P = amvh.P();
        P.c = akqi.a;
        P.k = false;
        P.d(alhkVar.a);
        P.b = alhkVar.a.T();
        amvh a = P.a();
        this.a.d.i(cjtd.a(dtyi.ci));
        this.a.a.b(new crhz(a, null, false, null));
    }

    @Override // defpackage.asma
    public final void f(crhk crhkVar) {
        crhl crhlVar = crhkVar.a;
        if (crhlVar instanceof crho) {
            asxe asxeVar = this.a;
            if (asxeVar.g == null) {
                return;
            }
            asxeVar.h(((crho) crhlVar).a);
        }
    }

    @Override // defpackage.asma
    public final void g(alho alhoVar) {
        asxe asxeVar = this.a;
        if (asxeVar.g != null && asxeVar.g()) {
            alaq alaqVar = alhoVar.a;
            if (alaqVar instanceof alav) {
                this.a.a.b(new cric(((alav) alaqVar).a));
            } else if (!(alaqVar instanceof alap)) {
            } else {
                alap alapVar = (alap) alaqVar;
                amvh amvhVar = null;
                if (akqi.d(alapVar.g) && !alapVar.g.equals(akqi.a)) {
                    amvg P = amvh.P();
                    P.j = alapVar.q;
                    P.d(alapVar.r);
                    P.c = alapVar.g;
                    amvhVar = P.a();
                }
                if (amvhVar == null || !this.a.e.a().a()) {
                    return;
                }
                this.a.d.i(cjtd.a(dtyi.cu));
                this.a.a.b(new crhz(amvhVar));
            }
        }
    }

    @Override // defpackage.asma
    public final void h(aryn arynVar) {
        if (arynVar instanceof aryr) {
            cjqy cjqyVar = this.a.d;
            cjta c = cjtd.c(((aryr) arynVar).i);
            c.d = dtxw.cd;
            cjqyVar.i(c.a());
            this.a.h(arynVar);
        }
    }

    @Override // defpackage.asma
    public final boolean i() {
        return false;
    }
}
