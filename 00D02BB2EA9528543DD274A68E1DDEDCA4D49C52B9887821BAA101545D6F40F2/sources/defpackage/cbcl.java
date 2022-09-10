package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cbcl  reason: default package */
/* loaded from: classes4.dex */
public class cbcl extends ges implements bxeq, egq {
    public static final dcqe a = dcqe.c("cbcl");
    public cbce ad;
    public alhv ae;
    public cqkj af;
    public cbqf ag;
    public dxio<axsc> ah;
    public dxio<abal> ai;
    public Executor aj;
    @dzsi
    ilo ak;
    @dzsi
    public cryz<akoq> al;
    @dzsi
    cbcd am;
    @dzsi
    private cqkf<cbrc> an;
    @dzsi
    private cqkf<jar> ao;
    private cbcy ap;
    public bwqv b;
    public btrm c;
    public dxio<akox> d;
    public dxio<hwe> e;
    public efg f;
    public cbcz g;

    @Override // defpackage.ges, defpackage.gfv
    public final void Nw(@dzsi Object obj) {
        if (obj != null) {
            super.Nw(obj);
        }
        this.aE.z(cbei.class);
    }

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        final akqq aj;
        this.ah.a().e(false);
        ilo iloVar = this.ak;
        if (iloVar == null || (aj = iloVar.aj()) == null) {
            return;
        }
        this.al = bvqj.d(this.d.a().k, new bvqg(this, aj) { // from class: cbcg
            private final cbcl a;
            private final akqq b;

            {
                this.a = this;
                this.b = aj;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                cbcl cbclVar = this.a;
                akqq akqqVar = this.b;
                akoq akoqVar = (akoq) obj;
                if (!cbclVar.aD) {
                    return;
                }
                cbclVar.e.a().i(akpp.o(akqqVar), true);
                cbclVar.d.a().p(akyt.g(akqqVar));
                cbclVar.al = null;
            }
        }, this.aj);
    }

    @Override // defpackage.bxeq
    public final void aK() {
    }

    @Override // defpackage.bxeq
    public final void aL(String str) {
    }

    @Override // defpackage.bxeq
    public final void aM(bxmh bxmhVar, List list) {
    }

    @Override // defpackage.bxeq
    public final boolean aN() {
        return false;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<cbrc> d = this.af.d(new cbkq(), null, false);
        this.an = d;
        d.e(this.am);
        cqkf<jar> d2 = this.af.d(new cbio(), null, false);
        this.ao = d2;
        d2.e(new cbck(this.A, this.aE));
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        this.ai.a().f(false);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        cryz<akoq> cryzVar = this.al;
        if (cryzVar != null) {
            cryzVar.c();
            this.al = null;
        }
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        gga ggaVar = this.aE;
        if (ggaVar != null) {
            ggaVar.g().f();
            return true;
        }
        return true;
    }

    public final void g(ilo iloVar, boolean z) {
        if (z) {
            q(iloVar, true);
            return;
        }
        this.am.c(true);
        deha.q(this.ag.a(iloVar), new cbci(this), this.aj);
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dvzj dvzjVar = dwjjVar.g;
        if (dvzjVar == null) {
            dvzjVar = dvzj.y;
        }
        String str = dvzjVar.b;
        dwjj dwjjVar2 = bxmhVar.b;
        if (dwjjVar2 == null) {
            dwjjVar2 = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar2.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        String str2 = dxbpVar.b;
        ily ilyVar = new ily();
        ilyVar.k(str);
        ilyVar.t = str2;
        dwjj dwjjVar3 = bxmhVar.b;
        if (dwjjVar3 == null) {
            dwjjVar3 = dwjj.k;
        }
        dvzj dvzjVar2 = dwjjVar3.g;
        if (dvzjVar2 == null) {
            dvzjVar2 = dvzj.y;
        }
        dhjz dhjzVar = dvzjVar2.d;
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        ilyVar.q(new akqq(dhjzVar.c, dhjzVar.b));
        q(ilyVar.d(), false);
        deha.q(this.ag.a(ilyVar.d()), new cbcj(this, ilyVar), this.aj);
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        try {
            this.ak = (ilo) this.b.d(ilo.class, bundle, "placemark");
        } catch (IOException unused) {
            bvoo.h("Not able to create Placemark", new Object[0]);
        }
        ilo iloVar = this.ak;
        if (iloVar != null && iloVar.aj() == null) {
            ilo iloVar2 = this.ak;
            deha.q(this.ag.a(this.ak), new cbch(this, iloVar2, !cbqf.b(iloVar2)), this.aj);
        }
        cbcz cbczVar = this.g;
        cbcz.a(this, 1);
        ixq a2 = cbczVar.a.a();
        cbcz.a(a2, 2);
        gga a3 = cbczVar.b.a();
        cbcz.a(a3, 3);
        btrm a4 = cbczVar.c.a();
        cbcz.a(a4, 4);
        bwqv a5 = cbczVar.d.a();
        cbcz.a(a5, 5);
        cbcy cbcyVar = new cbcy(this, a2, a3, a4, a5);
        this.ap = cbcyVar;
        cbcyVar.ak(false);
        cbce cbceVar = this.ad;
        ilo iloVar3 = this.ak;
        cbce.a(this, 1);
        cqhn a6 = cbceVar.a.a();
        cbce.a(a6, 3);
        ff ffVar = (ff) ((dxjd) cbceVar.b).a;
        cbce.a(ffVar, 4);
        this.am = new cbcd(this, iloVar3, a6, ffVar);
    }

    public final void q(@dzsi ilo iloVar, boolean z) {
        boolean z2 = true;
        if (iloVar == null) {
            this.ak = null;
            this.e.a().h();
            this.ap.I("");
        } else {
            dbsk.s(iloVar.aj());
            this.ak = iloVar;
            this.ap.I(iloVar.q());
            this.e.a().i(akpp.o(iloVar.aj()), true);
        }
        cqkx.p(this.ap);
        cbcd cbcdVar = this.am;
        cbcdVar.a = iloVar;
        if (!z && !cbqf.b(iloVar)) {
            z2 = false;
        }
        cbcdVar.b = z2;
        this.am.c(false);
        cqkx.p(this.am);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        ilo iloVar = this.ak;
        q(iloVar, !cbqf.b(iloVar));
        this.ae.b(new alht(this) { // from class: cbcf
            private final cbcl a;

            {
                this.a = this;
            }

            @Override // defpackage.alht
            public final boolean a(alhr alhrVar) {
                cbcl cbclVar = this.a;
                if (!cbclVar.aD) {
                    return false;
                }
                ily ilyVar = new ily();
                ilyVar.q(alhrVar.a.S());
                cbclVar.g(ilyVar.d(), true);
                return true;
            }
        });
        egf a2 = egf.a();
        a2.l(false);
        a2.r();
        a2.H = true;
        egj egjVar = new egj(this);
        egjVar.ad(false);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(null);
        egjVar.aw(this.an.c(), true);
        egjVar.A(a2);
        egjVar.I(2);
        egjVar.J(this);
        egjVar.k(true);
        egjVar.G(this.ao.c(), 5);
        this.f.a(egjVar.a());
        btrm btrmVar = this.c;
        dceq a3 = dcet.a();
        a3.b(alho.class, new cbcm(0, alho.class, this, bvrj.UI_THREAD));
        a3.b(brco.class, new cbcm(brco.class, this));
        a3.b(alhk.class, new cbcm(2, alhk.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a3.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        ilo iloVar = this.ak;
        if (iloVar != null) {
            this.b.c(bundle, "placemark", iloVar);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.c.a(this);
        this.ah.a().e(true);
        this.ai.a().f(true);
        super.u();
    }
}
