package defpackage;
/* compiled from: PG */
/* renamed from: atdl  reason: default package */
/* loaded from: classes2.dex */
final class atdl implements asma {
    final /* synthetic */ atdm a;

    public atdl(atdm atdmVar) {
        this.a = atdmVar;
    }

    @Override // defpackage.asma
    public final void b(float f) {
        atdm atdmVar = this.a;
        if (atdmVar.h == null) {
            return;
        }
        atcw atcwVar = atdmVar.b;
        Float valueOf = Float.valueOf(f);
        atcwVar.w(valueOf);
        atdmVar.a.o = valueOf;
        asld asldVar = atdmVar.h.c.a;
        if (asldVar == asld.FOLLOWING || asldVar == asld.INSPECT_POINT_ON_ROUTE || asldVar == asld.FREE_MOVEMENT) {
            return;
        }
        atdmVar.b.y();
    }

    @Override // defpackage.asma
    public final void c(alco alcoVar) {
        this.a.m(alcoVar);
    }

    @Override // defpackage.asma
    public final void d(alie alieVar) {
        akpp b;
        amvh amvhVar;
        atdm atdmVar = this.a;
        if (!atdmVar.c.r.b() && atdmVar.h.m.e() && (b = alieVar.b()) != null) {
            amvh[] amvhVarArr = atdmVar.h.m.g().a.o;
            int length = amvhVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    amvhVar = null;
                    break;
                }
                amvhVar = amvhVarArr[i];
                if (akqq.v(b.a(), amvhVar.e, 1.0d)) {
                    break;
                }
                i++;
            }
            if (amvhVar == null) {
                return;
            }
            atdmVar.f.a().k(amvhVar);
            atdmVar.e.g().d(cjtd.a(dtxw.bC));
        }
    }

    @Override // defpackage.asma
    public final void e(alhk alhkVar) {
    }

    @Override // defpackage.asma
    public final void f(crhk crhkVar) {
        this.a.i(crhkVar);
    }

    @Override // defpackage.asma
    public final void g(alho alhoVar) {
        atdm atdmVar = this.a;
        alaq alaqVar = alhoVar.a;
        if (alaqVar instanceof alav) {
            atdmVar.d.b(new cric(((alav) alaqVar).a));
        }
    }

    @Override // defpackage.asma
    public final void h(aryn arynVar) {
        this.a.h(arynVar);
    }

    @Override // defpackage.asma
    public final boolean i() {
        return this.a.f.a().l();
    }

    @Override // defpackage.asma
    public final void a(boolean z) {
        atdm atdmVar = this.a;
        atlq atlqVar = atdmVar.h;
        if (atlqVar == null) {
            return;
        }
        asld asldVar = atlqVar.c.a;
        if (!asldVar.a()) {
            if (asldVar == asld.FREE_MOVEMENT) {
                return;
            }
            atdmVar.b.y();
        } else if (!z) {
            atdmVar.b.y();
        } else {
            atdmVar.a.n();
        }
    }
}
