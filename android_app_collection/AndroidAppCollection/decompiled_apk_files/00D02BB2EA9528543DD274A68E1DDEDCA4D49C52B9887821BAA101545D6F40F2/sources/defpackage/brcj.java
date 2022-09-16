package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: brcj  reason: default package */
/* loaded from: classes4.dex */
public final class brcj {
    public final brbx a;
    public final brcf b;
    public final bwrs<brln> c;
    public final bwrs<brlu> d;
    public boolean e;
    @dzsi
    public brbw f;
    public boolean g;
    public boolean h;
    @dzsi
    public brce i;
    public final brbo j = new brbo();
    private final ff k;
    private final dxio<akzh> l;
    private final dzsj<vox> m;
    private final akpm n;
    private final gll o;
    private final brba p;
    private final cjqy q;
    private final brci r;
    @dzsi
    private vox s;

    public brcj(ff ffVar, dxio<akzh> dxioVar, dzsj<vox> dzsjVar, akpm akpmVar, gll gllVar, brbx brbxVar, brcf brcfVar, brba brbaVar, cjqy cjqyVar, brlk brlkVar, brci brciVar) {
        this.k = ffVar;
        this.l = dxioVar;
        this.m = dzsjVar;
        this.n = akpmVar;
        this.o = gllVar;
        this.a = brbxVar;
        this.b = brcfVar;
        this.p = brbaVar;
        this.r = brciVar;
        this.q = cjqyVar;
        this.c = brlkVar.a();
        this.d = brlkVar.b();
    }

    @dzsi
    private final alad n() {
        return alad.c(akyx.v(m().x(), this.l.a().B(), this.l.a().z()));
    }

    private final boolean o() {
        return this.k.getResources().getConfiguration().orientation == 2;
    }

    public final void a() {
        if (this.e) {
            this.p.L(l().e.x());
        }
        vox voxVar = this.s;
        if (voxVar != null) {
            voxVar.b();
        }
        brbw brbwVar = this.f;
        if (brbwVar != null) {
            brbwVar.f();
        }
        brce brceVar = this.i;
        if (brceVar != null) {
            brceVar.e = false;
        }
    }

    public final void b(jjn jjnVar) {
        cqkf<jbk> cqkfVar;
        bsoi bsoiVar;
        egj a;
        egj a2;
        brmk brmkVar;
        bsse bsseVar;
        brci brciVar = this.r;
        boolean z = true;
        boolean z2 = !jjnVar.b();
        bqzk bqzkVar = (bqzk) brciVar;
        brlu q = bqzkVar.a.q();
        brln i = bqzkVar.a.i();
        if (!z2) {
            if (!i.m() && q.i) {
                brmc brmcVar = bqzkVar.a.bh;
                dbsk.s(brmcVar);
                brmcVar.b();
            } else if (i.m()) {
                try {
                    if (!bqzkVar.a.aX.isCancelled()) {
                        try {
                            ((bqzk) brciVar).a.aX.get();
                            bsseVar = bqzkVar.a.bs;
                        } catch (InterruptedException | ExecutionException e) {
                            bvoo.f(new IllegalStateException(e));
                            bsseVar = bqzkVar.a.bs;
                        }
                        cqkx.p(bsseVar);
                    }
                } finally {
                    cqkx.p(bqzkVar.a.bs);
                }
            }
        }
        if (q.d() > 0 && (brmkVar = bqzkVar.a.bq) != null) {
            brmkVar.i = true;
        }
        bqzm bqzmVar = bqzkVar.a;
        brac bracVar = bqzmVar.bi;
        boolean z3 = bqzmVar.be;
        if (bracVar.c != null && bracVar.b != null) {
            if (!bracVar.l.G || (btpf.d(bracVar.d.getResources().getConfiguration()).e && bracVar.d())) {
                if (jjnVar == jjn.HIDDEN) {
                    if (bracVar.e().m()) {
                        a2 = bracVar.b();
                        a2.ag(null);
                        a2.s(null);
                        a2.Q(bracVar.e);
                        a2.P(new brhz(false));
                    } else {
                        a2 = bracVar.a(z3);
                        a2.ai(jjn.HIDDEN);
                        a2.Q(bracVar.e);
                        a2.P(new brhz(false));
                    }
                    bracVar.h.b(ckmk.GMM_COMPONENT_TRANSITION_SEARCH_COLLAPSED_RESULTS_LIST);
                    a = a2;
                } else {
                    a = bracVar.a(z3);
                    a.ai(jjnVar);
                    a.av(null);
                    View view = bracVar.g;
                    if (view != null) {
                        a.aw(view, false);
                    }
                    bracVar.h.b(ckmk.GMM_COMPONENT_TRANSITION_SEARCH_CATEGORICAL_RESULTS_LIST);
                }
                a.t(bracVar.j);
            } else {
                boolean z4 = !bracVar.e().m();
                a = bracVar.b();
                bsoq bsoqVar = bracVar.l.v;
                dbsk.s(bsoqVar);
                a.s(bsoqVar);
                a.ag(null);
                a.ai(bracVar.l.J() ? jjn.HIDDEN : jjn.COLLAPSED);
                a.ak((!bracVar.k.b() || btpf.d(bracVar.d.getResources().getConfiguration()).e) ? jkc.h : jkc.g, jkc.h);
                a.av(null);
                a.Q(bracVar.e);
                a.P(new brhz(false));
                a.g(bracVar.f);
                a.J(bracVar.i);
                a.t(bracVar.m);
                bxbd bxbdVar = bracVar.n;
                a.as(null);
                egf c = bracVar.c();
                c.n = z4;
                a.A(c);
                if (bracVar.k.b()) {
                    a.O(jjn.COLLAPSED);
                }
                bracVar.h.b(ckmk.GMM_COMPONENT_TRANSITION_SEARCH_TRAVERSAL_RESULTS_LIST);
            }
            bracVar.a.a(a.a());
        }
        bqzkVar.a.aJ();
        bqzm bqzmVar2 = bqzkVar.a;
        if (!z2 && ((bsoiVar = bqzmVar2.bt) == null || !bsoiVar.G)) {
            z = false;
        }
        iwg iwgVar = bqzmVar2.ba;
        if (iwgVar != null) {
            iwgVar.i(z);
        }
        bsrp bsrpVar = bqzmVar2.bl;
        if (bsrpVar == null || (cqkfVar = bqzmVar2.aZ) == null) {
            return;
        }
        cqkfVar.e(bsrpVar);
    }

    public final void c() {
        bqzk bqzkVar = (bqzk) this.r;
        bqzm bqzmVar = bqzkVar.a;
        bsrl bsrlVar = bqzmVar.bk;
        if (bsrlVar == null) {
            return;
        }
        bsrlVar.av(bqzmVar.aR());
        cqkx.p(bqzkVar.a.bk);
    }

    public final void d() {
        brbw brbwVar;
        if (!this.h || (brbwVar = this.f) == null) {
            return;
        }
        brbwVar.e();
    }

    public final void e() {
        brbw brbwVar = this.f;
        if (brbwVar != null) {
            brbwVar.i();
        }
    }

    @dzsi
    public final View f() {
        if (this.f != null) {
            d();
            brbw brbwVar = this.f;
            dbsk.s(brbwVar);
            return brbwVar.d();
        }
        return null;
    }

    public final void g(@dzsi cjqm cjqmVar) {
        if (this.k.g().J() || this.i == null || !l().b().J.isEmpty() || l().m()) {
            return;
        }
        brce brceVar = this.i;
        dbsk.s(brceVar);
        brceVar.f(m().o.b(), m().X(), false, cjqmVar, ddda.cL);
    }

    public final void h(boolean z, boolean z2) {
        alad n;
        if (!z2 || this.e) {
            if (o() && z) {
                return;
            }
            if (k() && j(z, true)) {
                this.e = z;
                brce brceVar = this.i;
                if (brceVar != null) {
                    brceVar.d = z;
                }
                if (!l().d()) {
                    return;
                }
            }
            if (!z || o()) {
                n = n();
            } else {
                brlu m = m();
                dhjx av = m.av();
                if (av != null) {
                    n = alad.c(av);
                } else {
                    alad n2 = n();
                    n = n2 == null ? null : isx.a(this.l.a(), this.o, n2, m.G());
                }
                if (n != null) {
                    Rect f = this.o.f();
                    alaa b = alad.b(n);
                    b.f = alae.a(f.exactCenterX(), f.exactCenterY(), this.l.a().y(), this.l.a().z());
                    n = b.a();
                }
            }
            if (n == null || this.l.a().p().equals(n)) {
                return;
            }
            akyc e = akyt.e(n);
            e.b = 250;
            this.n.p(e);
            this.e = z;
            brce brceVar2 = this.i;
            if (brceVar2 == null) {
                return;
            }
            brceVar2.d = z;
        }
    }

    public final void i(jjn jjnVar, jjn jjnVar2, jkg jkgVar, @dzsi View view) {
        deaf deafVar;
        if (view == null) {
            return;
        }
        if (jkgVar == jkg.SWIPE) {
            deafVar = deaf.SWIPE;
        } else {
            deafVar = deaf.AUTOMATED;
        }
        cjte cjteVar = new cjte(deafVar);
        cjql e = cjqg.e(view);
        if (e == null) {
            return;
        }
        cjqy cjqyVar = this.q;
        cjta b = cjtd.b();
        b.d = dtyb.aN;
        b.n(cjqf.f(jjnVar, jjnVar2).b());
        cjqyVar.n(e, cjteVar, b.a());
    }

    public final boolean j(boolean z, boolean z2) {
        vow vowVar;
        amsz amszVar = l().c;
        dbsk.s(amszVar);
        vov vovVar = z ? vov.MINI_MAP : vov.SINGLE_ROUTE_WITH_ETA;
        if (!z2 || !amszVar.c() || l().d()) {
            vowVar = vow.f;
        } else {
            vowVar = vow.f(amszVar.c - 1);
        }
        if (this.s == null) {
            this.s = this.m.a();
        }
        this.s.a();
        this.s.c(amszVar.a, dcdc.t(amszVar.e), amszVar.b, vovVar, vowVar, null);
        this.g = true;
        return vowVar != vow.f;
    }

    public final boolean k() {
        return l().c();
    }

    public final brln l() {
        brln c = this.c.c();
        dbsk.s(c);
        return c;
    }

    public final brlu m() {
        brlu c = this.d.c();
        dbsk.s(c);
        return c;
    }
}
