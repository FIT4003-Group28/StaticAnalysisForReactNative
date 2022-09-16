package defpackage;
/* compiled from: PG */
/* renamed from: bdwm  reason: default package */
/* loaded from: classes3.dex */
public final class bdwm extends itb implements begg {
    private final gga a;
    private final btvo b;
    private final bwqv c;
    private final dxio<bdvy> d;
    private final dxio<brba> e;
    private final crzb f;
    private final cvn g;
    private final bzlq h;
    private final bzlr i;
    private final bkat j;

    public bdwm(gga ggaVar, btvo btvoVar, bwqv bwqvVar, dxio<bdvy> dxioVar, dxio<brba> dxioVar2, crzb crzbVar, cvn cvnVar, bzlq bzlqVar, bzlr bzlrVar, bkat bkatVar) {
        this.a = ggaVar;
        this.b = btvoVar;
        this.c = bwqvVar;
        this.d = dxioVar;
        this.e = dxioVar2;
        this.f = crzbVar;
        this.g = cvnVar;
        this.h = bzlqVar;
        this.i = bzlrVar;
        this.j = bkatVar;
    }

    private final boolean E() {
        return this.b.getAdsParameters().c || this.b.getAdsParameters().e;
    }

    @dzsi
    private final bdyb F() {
        fd J = this.a.J(gfu.ACTIVITY_FRAGMENT);
        if (J instanceof bdyb) {
            return (bdyb) J;
        }
        return null;
    }

    @dzsi
    private final bmlh G() {
        bdyb F = F();
        if (F != null) {
            return F.aT();
        }
        return null;
    }

    @Override // defpackage.begg
    public final void B(String str) {
        bdyb F = F();
        if (F != null) {
            F.Qn(new bkgx(str));
        }
    }

    @Override // defpackage.begg
    public final void C(dwfl dwflVar) {
        bege begeVar = bege.PHOTOS;
        bmlh G = G();
        begd g = G == null ? null : G.g(begeVar);
        if (g instanceof bccn) {
            for (bclv bclvVar : ((bccn) g).al.g()) {
                bclvVar.r().j(dcdc.f(dwflVar));
            }
        }
    }

    @Override // defpackage.begg
    public final void D(bwrs<ilo> bwrsVar, @dzsi dnqh dnqhVar) {
        befu p = befv.p();
        p.j(bwrsVar);
        befp befpVar = (befp) p;
        befpVar.a = dnqhVar;
        p.l(false);
        p.k(true);
        p.f(false);
        befpVar.b = null;
        this.d.a().d(p.m());
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        this.d.a().a();
        if (E()) {
            this.g.a();
        }
    }

    @Override // defpackage.itb
    public final void Po() {
        this.d.a().b();
        if (E()) {
            this.g.b();
        }
        super.Po();
    }

    @Override // defpackage.begg
    @dzsi
    public final bwrs<ilo> e() {
        bdyb F = F();
        if (F != null) {
            return F.bP;
        }
        return null;
    }

    @Override // defpackage.begg
    public final boolean f() {
        bmlh G = G();
        return G != null && ((bmll) G).p();
    }

    @Override // defpackage.begg
    public final boolean i(bege begeVar) {
        bmlh G = G();
        if (G != null) {
            return G.d(begeVar);
        }
        return false;
    }

    @Override // defpackage.begg
    @dzsi
    public final bege j() {
        bmlh G = G();
        if (G != null) {
            return G.f();
        }
        return null;
    }

    @Override // defpackage.begg
    public final void k(bege begeVar) {
        l(begeVar, null);
    }

    @Override // defpackage.begg
    public final void l(bege begeVar, @dzsi begd begdVar) {
        bmlh G = G();
        if (G != null) {
            G.i(begeVar, begdVar);
        }
    }

    @Override // defpackage.begg
    public final void m(jjn jjnVar) {
        bdyb F = F();
        if (F != null) {
            F.aR(jjnVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.begg
    public final void n(begj begjVar, boolean z, @dzsi gfw gfwVar) {
        begl a = begjVar.a();
        ilo iloVar = (ilo) bwrs.b(a.i);
        if (iloVar == null || !this.i.a(iloVar, a.a(), z)) {
            bwrs<? extends iqw> bwrsVar = a.g;
            bwrs<? extends iqw> bwrsVar2 = (bwrsVar == null || !(bwrsVar.c() instanceof brlu)) ? null : a.g;
            if (iloVar != null && this.h.a(iloVar, a.j, bwrsVar2, a.a(), z)) {
                return;
            }
            o(begjVar, z, gfwVar);
        }
    }

    @Override // defpackage.begg
    public final void o(begj begjVar, boolean z, @dzsi gfw gfwVar) {
        ilo c;
        begl a = begjVar.a();
        ilo iloVar = (ilo) bwrs.b(a.i);
        begi begiVar = a.a;
        if (begiVar == null) {
            begiVar = begi.DISTINCT;
            if (iloVar != null) {
                if (iloVar.l) {
                    begiVar = begi.BASE_MAP_POI;
                } else if (iloVar.i) {
                    begiVar = begi.DROPPED_PIN;
                }
            }
        }
        begjVar.a = begiVar;
        boolean z2 = true;
        if (iloVar != null && iloVar.j()) {
            begjVar.J = true;
            begjVar.p = true;
        }
        begl a2 = begjVar.a();
        bwrs<ilo> bwrsVar = a2.i;
        ilo iloVar2 = (ilo) bwrs.b(bwrsVar);
        this.j.a();
        bdyb F = F();
        if (F != null) {
            bwrs<ilo> e = e();
            ilo iloVar3 = (ilo) bwrs.b(e);
            if (iloVar3 != null && iloVar2 != null && iloVar3.cr(iloVar2) && iloVar3.m == iloVar2.m) {
                if (e != null && !e.equals(bwrsVar) && iloVar2.f) {
                    e.d(iloVar2);
                }
                boolean z3 = a2.H;
                begl beglVar = F.bH;
                if (z3 != beglVar.H) {
                    begj b = beglVar.b();
                    b.F = z3;
                    F.bH = b.a();
                    F.bC(false);
                }
                F.bF(a2.b);
                bege begeVar = a2.c;
                if (begeVar != null) {
                    k(begeVar);
                }
                F.Nz(gfwVar);
                return;
            } else if (bwrsVar != null && (c = bwrsVar.c()) != null) {
                iqw bu = F.bu();
                begi begiVar2 = F.bH.a;
                begi begiVar3 = a2.a;
                boolean z4 = (begiVar2 == null || begiVar3 == null || begiVar2 == begi.DISTINCT || begiVar2 != begiVar3) ? false : true;
                if (!F.bH.v || bu == null || bu.n(c) < 0) {
                    z2 = false;
                }
                if (z4 || z2) {
                    ilo bo = F.bo();
                    if (z4) {
                        F.aS(bwrsVar, a2.n);
                        if (F.bH.p) {
                            F.bn(c);
                        }
                    } else {
                        dbsk.s(bu);
                        F.aS(bu.y(c), a2.n);
                    }
                    F.ai.b(pfp.b(bo));
                    F.Nz(gfwVar);
                    return;
                }
            }
        }
        if (a2.j == null && a2.g == null) {
            brlk G = this.e.a().G();
            bwrs<brlu> bwrsVar2 = null;
            begjVar.j = G == null ? null : G.a();
            brlk G2 = this.e.a().G();
            if (G2 != null) {
                bwrsVar2 = G2.b();
            }
            begjVar.g = bwrsVar2;
        }
        if (this.b.getPlaceSheetParameters().G() && iloVar2 != null && !iloVar2.i) {
            r(s(a2));
        }
        bdyb g = bdyb.g(this.c, begjVar);
        g.Nz(gfwVar);
        if (!this.f.c()) {
            bvoo.j(new IllegalStateException("PlacePageVeneer method called from wrong thread."));
        }
        if (this.a.isFinishing() || this.a.isDestroyed() || this.a.g().J() || !this.a.g.a.a(j.STARTED)) {
            return;
        }
        if (z) {
            this.a.E(g);
        } else {
            this.a.D(g);
        }
    }

    @Override // defpackage.begg
    @dzsi
    public final bttu p(ilo iloVar, @dzsi dnqh dnqhVar, begr begrVar) {
        befu p = befv.p();
        p.j(bwrs.a(iloVar));
        ((befp) p).a = dnqhVar;
        p.f(iloVar.j());
        p.h(true);
        return this.d.a().f(begrVar, p.m());
    }

    @Override // defpackage.begg
    public final void q(bwrs<ilo> bwrsVar, boolean z) {
        befu p = befv.p();
        p.j(bwrsVar);
        p.g(z);
        this.d.a().d(p.m());
    }

    @Override // defpackage.begg
    public final boolean r(befv befvVar) {
        return this.d.a().d(befvVar);
    }

    @Override // defpackage.begg
    public final befv s(begl beglVar) {
        jjn jjnVar;
        boolean z = false;
        if (this.b.getPlaceSheetParameters().J() && (jjnVar = beglVar.b) != null && jjnVar.b()) {
            z = true;
        }
        befu p = befv.p();
        bwrs<ilo> bwrsVar = beglVar.i;
        dbsk.s(bwrsVar);
        p.j(bwrsVar);
        befp befpVar = (befp) p;
        befpVar.a = beglVar.a();
        p.l(beglVar.L);
        p.k(true);
        p.f(beglVar.q);
        befpVar.g = beglVar.a;
        befpVar.b = bdyb.bM(this.b);
        p.g(beglVar.s);
        p.e(z);
        return p.m();
    }

    @Override // defpackage.begg
    @Deprecated
    public final void t() {
        bdyb F = F();
        if (F != null) {
            F.Qn(new bkgm(F.bo()));
        }
    }
}
