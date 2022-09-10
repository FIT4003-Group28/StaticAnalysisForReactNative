package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.List;
/* compiled from: PG */
/* renamed from: brqk  reason: default package */
/* loaded from: classes4.dex */
public final class brqk extends ges implements aueo, brae {
    private static final String al = "brqk";
    public dxio<akzh> a;
    public cqkj ad;
    public dxio<ixr> ae;
    public brqy af;
    public dxio<auen> ag;
    public brqt ah;
    public dxio<afwp> ai;
    public gll aj;
    private boolean am;
    private bwrs<brln> an;
    private bwrs<brlu> ao;
    private brqx ap;
    @dzsi
    private cqkf<brqu> aq;
    @dzsi
    private brqr ar;
    public akpm b;
    public hwe c;
    public brba d;
    public bwqv e;
    public bvrb f;
    public efg g;
    public boolean ak = false;
    private int as = -1;
    private final egq at = new egq(this) { // from class: brqh
        private final brqk a;

        {
            this.a = this;
        }

        @Override // defpackage.egq
        public final void Qs(egu eguVar) {
            brqk brqkVar = this.a;
            if (!brqkVar.ak) {
                akyc o = akyt.o(akyx.m(akyx.v(brqkVar.i().x(), brqkVar.a.a().B(), brqkVar.a.a().z())), brqkVar.aj.e());
                o.b = 250;
                brqkVar.b.p(o);
                brqkVar.ak = true;
            }
            brqkVar.g(true);
        }
    };

    private final String w() {
        String str = i().a;
        if (str != null) {
            return str;
        }
        brln c = this.an.c();
        dbsk.s(c);
        return c.j();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        if (this.am) {
            brqr brqrVar = this.ar;
            dbsk.s(brqrVar);
            brqrVar.a.a(brqrVar.b);
            cqkf<brqu> cqkfVar = this.aq;
            dbsk.s(cqkfVar);
            cqkfVar.e(null);
            this.aq = null;
        }
        super.Qe();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        if (!this.am) {
            return null;
        }
        this.ae.a().I(w());
        this.ae.a().j(this.an);
        if (this.ap == null) {
            brqy brqyVar = this.af;
            brlu i = i();
            brrm brrmVar = new brrm(this) { // from class: brqi
                private final brqk a;

                {
                    this.a = this;
                }

                @Override // defpackage.brrm
                public final void a(ilo iloVar) {
                    brqk brqkVar = this.a;
                    brlu i2 = brqkVar.i();
                    if (iloVar != null) {
                        i2.t(iloVar);
                        brba brbaVar = brqkVar.d;
                        begj begjVar = new begj();
                        begjVar.n = true;
                        begjVar.c = jjn.EXPANDED;
                        brbaVar.J(iloVar, begjVar);
                    }
                }
            };
            brqj brqjVar = new brqj(this);
            brqy.a(i, 1);
            brqy.a(brrmVar, 2);
            brqy.a(brqjVar, 3);
            Resources a = brqyVar.a.a();
            brqy.a(a, 4);
            bvsl a2 = brqyVar.b.a();
            brqy.a(a2, 5);
            ahjq a3 = brqyVar.c.a();
            brqy.a(a3, 6);
            cqg a4 = brqyVar.d.a();
            brqy.a(a4, 7);
            this.ap = new brqx(i, brrmVar, brqjVar, a, a2, a3, a4);
        }
        cqkf<brqu> c = this.ad.c(new brqs(), null);
        this.aq = c;
        c.e(this.ap);
        View c2 = this.aq.c();
        brqt brqtVar = this.ah;
        jmz a5 = brqtVar.a.a();
        brqt.a(a5, 1);
        brqt.a(brqtVar.b.a(), 2);
        brqt.a(c2, 3);
        brqr brqrVar = new brqr(a5, c2);
        this.ar = brqrVar;
        jmz jmzVar = brqrVar.a;
        brqrVar.b.getContext();
        jmzVar.b(brqrVar.b);
        return c2;
    }

    @Override // defpackage.aueo
    public final Uri bI() {
        alad p = this.a.a().p();
        float f = p.k;
        akqq akqqVar = p.i;
        double d = akqqVar.a;
        double d2 = akqqVar.b;
        afhk a = afhk.a();
        a.d(w());
        a.c(d, d2);
        a.e(f);
        return a.b();
    }

    @Override // defpackage.brae
    public final brlk bt() {
        bwrs<brln> bwrsVar = this.an;
        dbsk.s(bwrsVar);
        bwrs<brlu> bwrsVar2 = this.ao;
        dbsk.s(bwrsVar2);
        return brlk.c(bwrsVar, bwrsVar2);
    }

    public final void g(boolean z) {
        View c;
        if (!this.aD) {
            return;
        }
        brqr brqrVar = this.ar;
        dbsk.s(brqrVar);
        adz a = cqre.a(brqrVar.b);
        int i = -1;
        if (a != null && (c = a.c(brqrVar.b.l)) != null) {
            i = abs.bm(c);
        }
        if (!z && i == this.as) {
            return;
        }
        this.as = i;
        List<ilo> G = i().G();
        if (i < 0 || i >= G.size()) {
            this.c.c();
            return;
        }
        ilo iloVar = G.get(i);
        akra f = akra.f(iloVar.aj());
        if (f == null) {
            this.c.c();
        } else if (G.size() > 1) {
            this.c.a(iloVar.ai(), f);
        } else {
            this.c.c();
        }
    }

    public final brlu i() {
        brlu c = this.ao.c();
        dbsk.s(c);
        return c;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle != null) {
            this.ak = bundle.getBoolean("searchResultViewPortMoved");
        }
        try {
            bwrs<brln> e = this.e.e(brln.class, this.o, "searchRequestRef");
            dbsk.s(e);
            this.an = e;
            bwrs<brlu> e2 = this.e.e(brlu.class, this.o, "searchResultRef");
            dbsk.s(e2);
            this.ao = e2;
            i();
            this.am = true;
        } catch (IOException | NullPointerException e3) {
            this.am = false;
            bvoo.f(new RuntimeException("Corrput storage data", e3));
            gga ggaVar = this.aE;
            if (ggaVar != null) {
                cjxu.j(ggaVar, this.f, Rp(R.string.UNKNOWN_ERROR));
            }
            gn gnVar = this.A;
            dbsk.s(gnVar);
            gnVar.g(bc(), 1);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.k;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (this.am) {
            egf a = egf.a();
            a.v = dtxy.k;
            a.n = false;
            egj egjVar = new egj(this);
            egjVar.W(this.ae.a());
            egjVar.A(a);
            egjVar.J(this.at);
            cqkf<brqu> cqkfVar = this.aq;
            dbsk.s(cqkfVar);
            egjVar.ay(cqkfVar.c(), R.id.header);
            egjVar.ai(jjn.COLLAPSED);
            egjVar.e(this);
            egjVar.ak(jkc.o, jkc.o);
            egjVar.w(null);
            egjVar.k(true);
            egjVar.f(false);
            brau d = brav.d();
            d.d(i().c());
            ((brah) d).a = i().aD();
            egjVar.S(d.a());
            egjVar.c(this.ai.a().e());
            this.g.a(egjVar.a());
            this.ag.a().e(this);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putBoolean("searchResultViewPortMoved", this.ak);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        if (this.am) {
            this.ag.a().f(this);
        }
        super.u();
    }
}
