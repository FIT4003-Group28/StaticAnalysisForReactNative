package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: wmq  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class wmq implements ayqb {
    public final /* synthetic */ wmr a;
    private final /* synthetic */ int b;

    public /* synthetic */ wmq(wmr wmrVar, int i) {
        this.b = i;
        this.a = wmrVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                wmr wmrVar = this.a;
                ahgc ahgcVar = (ahgc) obj;
                wmrVar.e.qM(ahgcVar);
                wmrVar.h.qM(ahgcVar);
                Iterator it = wmrVar.t.iterator();
                while (it.hasNext()) {
                    ((wlk) it.next()).qM(ahgcVar);
                }
                return;
            case 1:
                wmr wmrVar2 = this.a;
                afkn afknVar = (afkn) obj;
                wmrVar2.j.qD(afknVar);
                Iterator it2 = wmrVar2.t.iterator();
                while (it2.hasNext()) {
                    ((wlk) it2.next()).qD(afknVar);
                }
                return;
            case 2:
                wmr wmrVar3 = this.a;
                String a = ((ahgl) obj).a();
                wmrVar3.a.qE(a);
                wmrVar3.i.qE(a);
                Iterator it3 = wmrVar3.t.iterator();
                while (it3.hasNext()) {
                    ((wlk) it3.next()).qE(a);
                }
                return;
            case 3:
                wmr wmrVar4 = this.a;
                ahgn ahgnVar = (ahgn) obj;
                aijs c = ahgnVar.c();
                aijs d = ahgnVar.d();
                int b = ahgnVar.b();
                int a2 = ahgnVar.a();
                boolean f = ahgnVar.f();
                boolean e = ahgnVar.e();
                wmrVar4.a.qF(c, d, b, a2, f, e);
                wmrVar4.k.qF(c, d, b, a2, f, e);
                wmrVar4.l.qF(c, d, b, a2, f, e);
                wmrVar4.m.qF(c, d, b, a2, f, e);
                wmrVar4.n.qF(c, d, b, a2, f, e);
                wmrVar4.q.qF(c, d, b, a2, f, e);
                Iterator it4 = wmrVar4.t.iterator();
                while (it4.hasNext()) {
                    ((wlk) it4.next()).qF(c, d, b, a2, f, e);
                }
                return;
            case 4:
                wmr wmrVar5 = this.a;
                ahhw ahhwVar = (ahhw) obj;
                wmrVar5.p.f(ahhwVar.c(), ahhwVar.b(), ahhwVar.d(), ahhwVar.e(), ahhwVar.k());
                wmrVar5.i.f(ahhwVar.c(), ahhwVar.b(), ahhwVar.d(), ahhwVar.e(), ahhwVar.k());
                wmrVar5.r.f(ahhwVar.c(), ahhwVar.b(), ahhwVar.d(), ahhwVar.e(), ahhwVar.k());
                wmrVar5.q.f(ahhwVar.c(), ahhwVar.b(), ahhwVar.d(), ahhwVar.e(), ahhwVar.k());
                wmrVar5.e.f(ahhwVar.c(), ahhwVar.b(), ahhwVar.d(), ahhwVar.e(), ahhwVar.k());
                wmrVar5.g.f(ahhwVar.c(), ahhwVar.b(), ahhwVar.d(), ahhwVar.e(), ahhwVar.k());
                wmrVar5.h.f(ahhwVar.c(), ahhwVar.b(), ahhwVar.d(), ahhwVar.e(), ahhwVar.k());
                wmrVar5.d.f(ahhwVar.c(), ahhwVar.b(), ahhwVar.d(), ahhwVar.e(), ahhwVar.k());
                Iterator it5 = wmrVar5.t.iterator();
                while (it5.hasNext()) {
                    ((wlk) it5.next()).f(ahhwVar.c(), ahhwVar.b(), ahhwVar.d(), ahhwVar.e(), ahhwVar.k());
                }
                return;
            case 5:
                wmr wmrVar6 = this.a;
                ahhx ahhxVar = (ahhx) obj;
                String i = ahhxVar.i();
                long e2 = ahhxVar.e();
                long a3 = ahhxVar.a();
                long f2 = ahhxVar.f();
                boolean j = ahhxVar.j();
                wmrVar6.b.qG(i, e2, a3, f2, j);
                wmrVar6.s.qG(i, e2, a3, f2, j);
                wmrVar6.a.qG(i, e2, a3, f2, j);
                wmrVar6.f.qG(i, e2, a3, f2, j);
                wmrVar6.r.qG(i, e2, a3, f2, j);
                Iterator it6 = wmrVar6.t.iterator();
                while (it6.hasNext()) {
                    ((wlk) it6.next()).qG(i, e2, a3, f2, j);
                }
                return;
            case 6:
                wmr wmrVar7 = this.a;
                ahia ahiaVar = (ahia) obj;
                if (ahiaVar.a() == 2) {
                    wmrVar7.u = ahiaVar.b();
                }
                wmrVar7.a.h(ahiaVar.a(), ahiaVar.b());
                wmrVar7.c.h(ahiaVar.a(), ahiaVar.b());
                wmrVar7.o.h(ahiaVar.a(), ahiaVar.b());
                Iterator it7 = wmrVar7.t.iterator();
                while (it7.hasNext()) {
                    ((wlk) it7.next()).h(ahiaVar.a(), ahiaVar.b());
                }
                return;
            case 7:
                wmr wmrVar8 = this.a;
                wmrVar8.v = null;
                ((wmw) wmrVar8.g).b = ((ahic) obj).a().b();
                return;
            default:
                wmr wmrVar9 = this.a;
                ahic ahicVar = (ahic) obj;
                String Z = ahicVar.a().Z();
                int a4 = ahicVar.a().a();
                wmrVar9.c.qK(Z, a4);
                wmrVar9.h.qK(Z, a4);
                ((wvl) wmrVar9.j).b = Z;
                ((wvm) wmrVar9.n).b = Z;
                Iterator it8 = wmrVar9.t.iterator();
                while (it8.hasNext()) {
                    ((wlk) it8.next()).qK(Z, a4);
                }
                return;
        }
    }
}
