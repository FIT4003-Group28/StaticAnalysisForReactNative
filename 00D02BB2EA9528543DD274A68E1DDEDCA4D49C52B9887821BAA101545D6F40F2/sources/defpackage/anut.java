package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
@Deprecated
/* renamed from: anut  reason: default package */
/* loaded from: classes2.dex */
public final class anut extends anns implements auzu, anuv, egq {
    private static final dcqe az = dcqe.c("anut");
    public acyp a;
    private cqkf<aobh> aA;
    private cqkf<anvb> aB;
    @dzsi
    private aouf aC;
    private anva aO;
    private anqp aP;
    private apke aQ;
    private anqs aR;
    private apkj aS;
    @dzsi
    private View aT;
    private View aU;
    private anur aV;
    private anhy aW;
    public aovf<aogb, aoge> ad;
    public angv ae;
    public anhg af;
    public aotx ag;
    public dxio<araj> ah;
    public apkh ai;
    public ansy aj;
    public cqkj ak;
    public cqhu al;
    public efg am;
    public bvjj an;
    public aoug ao;
    public anqq ap;
    public anvk aq;
    public aplg ar;
    public jkf as;
    public gfq at;
    gek au;
    public aobn av;
    public anvj aw;
    public View ax;
    public dbsg<eapd> ay = dbpy.a;
    public apjy b;
    public cqat c;
    public jmz d;
    public btrm e;
    public bwqv f;
    public aovf<eapy, aogo> g;

    private final void aS() {
        dccx F = dcdc.F();
        F.g(this.aS);
        F.g(new aobp(this.av));
        F.g(this.ar);
        F.g(this.aQ);
        anqp anqpVar = this.aP;
        if (anqpVar != null) {
            F.g(new anus(anqpVar));
        }
        jjn jjnVar = this.ay.a() ? jjn.FULLY_EXPANDED : jjn.EXPANDED;
        egj egjVar = new egj(this);
        egjVar.k(false);
        egjVar.r(this.ax);
        egjVar.q(aobf.d(this.av, this.ax));
        egjVar.t(new jjk(F.f()));
        egjVar.Y(true);
        egjVar.w(null);
        egjVar.J(this);
        egjVar.ar(false);
        egjVar.U();
        egjVar.d(true);
        egjVar.b(this.aU);
        egjVar.ay(this.P, R.id.header);
        egjVar.ai(this.au.a(jjnVar));
        egjVar.aj(egn.HALF_EXPANDED_MAP);
        egf h = egf.h();
        h.h = this.aR.a();
        egjVar.A(h);
        View view = this.aT;
        if (view != null) {
            egjVar.av(view);
        }
        if (this.a.c()) {
            egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        }
        this.am.a(egjVar.a());
    }

    private final void aT() {
        if (!this.aD) {
            return;
        }
        anhq j = this.aW.j();
        j.e(anhu.NO);
        this.aW = j.k();
        this.aT = null;
        this.aC = null;
        aS();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<anvb> cqkfVar = this.aB;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        cqkf<aobh> cqkfVar2 = this.aA;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
        }
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof anhd) {
            anhd anhdVar = (anhd) obj;
            final dwfl a = anhdVar.a();
            dbsg r = dcbg.b(this.aw.m().w()).r(new dbsl(a) { // from class: anup
                private final dwfl a;

                {
                    this.a = a;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj2) {
                    dwfl dwflVar = this.a;
                    dwfl dwflVar2 = ((dvan) obj2).b;
                    if (dwflVar2 == null) {
                        dwflVar2 = dwfl.w;
                    }
                    return dwflVar2.q.equals(dwflVar.q);
                }
            });
            if (!r.a()) {
                bvoo.h("Can't find receipt associated with media key: %s", a.q);
                gfq.k(this);
                this.ae.e();
                return;
            }
            anhg anhgVar = this.af;
            dqfz dqfzVar = ((dvan) r.b()).c;
            if (dqfzVar == null) {
                dqfzVar = dqfz.g;
            }
            anhgVar.t(anhdVar, dqfzVar.b, this);
        } else if (!(obj instanceof anhb)) {
        } else {
            gfq.k(this);
        }
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        if (!this.aD) {
            return;
        }
        bvmn bvmnVar = bvmo.a;
        aouf aoufVar = this.aC;
        if (aoufVar != null) {
            aoufVar.i();
        }
        this.ag.c();
        View view = this.P;
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new anuq(this, view));
        }
        this.aw.n(this.aO);
        this.g.d();
        this.ad.d();
    }

    @Override // defpackage.auzu
    public final void aJ() {
        aT();
    }

    public final dbsg<View> aR() {
        return anuz.e(this.P, this.aw.m());
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<anvb> c = this.ak.c(new anuz(true), viewGroup);
        c.e(this.aw);
        this.aB = c;
        cqkf<aobh> c2 = this.aj.g().c(new aobg(), viewGroup);
        this.aA = c2;
        c2.e(this.av);
        this.ax = this.aA.c();
        if (this.aC != null) {
            cqkf c3 = this.ak.c(new auzt(), null);
            c3.e(this.aC);
            this.aT = c3.c();
        }
        if (this.aP != null) {
            cqkf c4 = this.ak.c(new anql(), null);
            c4.e(this.aP);
            this.aU = c4.c();
        }
        return this.aB.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void aj(@dzsi Bundle bundle) {
        super.aj(bundle);
        if (this.aR == null) {
            this.aR = new anqs(this.aw, this.c);
        }
        if (this.aO == null) {
            this.aO = new anva(this.ag, this.aR, this.ah.a().m(), null);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        gn gnVar = this.A;
        dbsk.s(gnVar);
        String c = gfu.c(this);
        int j = gnVar.j();
        int i = 0;
        while (true) {
            if (i < j) {
                gf k = gnVar.k(i);
                if (k != null && c.equals(k.p())) {
                    break;
                }
                i++;
            } else {
                this.af.q();
                break;
            }
        }
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (this.av.q()) {
            return true;
        }
        this.b.a();
        return true;
    }

    @Override // defpackage.anuv
    public final void g() {
        this.aw.j();
    }

    @Override // defpackage.anuv
    public final void i() {
        this.aw.i();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        aoge aogeVar;
        super.l(bundle);
        this.aW = anhy.q((aoum) dsuv.c((bundle == null || !bundle.containsKey("params")) ? this.o : bundle, "params", aoum.k, dsqa.c()));
        if (bundle != null && bundle.containsKey("selected-day-data")) {
            try {
                aogeVar = (aoge) this.f.d(aoge.class, bundle, "selected-day-data");
            } catch (IOException unused) {
                aogeVar = null;
            }
            if (aogeVar != null) {
                this.ae.g(aogeVar);
            }
        }
        eapd e = this.aW.e();
        if (e != null) {
            this.ay = dbsg.i(e);
        }
        if (aouf.k(this.an, this.aW.c())) {
            this.aC = this.ao.a(this, this.aW.c());
        }
        this.aw = this.aq.a(this.aC, this.aW.i(), false);
        eapg g = this.aW.g();
        if (g != null) {
            this.aw.k(aogb.f(g));
        }
        this.av = this.aw.c();
        anqp a = this.ap.a();
        this.aP = a;
        a.o();
        this.aQ = new apke(this, this.ag, this.aw);
        this.aS = new apkj();
        this.au = new gek(J(), this, this.as);
    }

    @Override // defpackage.anuv
    public final void q(aogb aogbVar) {
        this.aw.k(aogbVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        apki.c(this.e, this.ai);
        anqp anqpVar = this.aP;
        if (anqpVar != null) {
            anur anurVar = new anur(anqpVar);
            this.aV = anurVar;
            btrm btrmVar = this.e;
            dceq a = dcet.a();
            a.b(alhw.class, new anuu(0, alhw.class, anurVar, bvrj.UI_THREAD));
            a.b(cjnw.class, new anuu(1, cjnw.class, anurVar, bvrj.UI_THREAD));
            btrmVar.g(anurVar, a.a());
        }
        aS();
        anqp anqpVar2 = this.aP;
        if (anqpVar2 != null) {
            anqpVar2.o();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        anhq j = this.aW.j();
        j.b(this.aw.a().m());
        dsuv.d(bundle, "params", j.k().r());
        angs<aoge> p = this.aw.p();
        if (p.e()) {
            p.f().g();
            this.f.c(bundle, "selected-day-data", p.f());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        apki.b(this.e, this.ai);
        anur anurVar = this.aV;
        if (anurVar != null) {
            this.e.a(anurVar);
        }
        this.ag.d();
        this.aw.o(this.aO);
        this.av.q();
        this.g.c();
        this.ad.c();
        anqp anqpVar = this.aP;
        if (anqpVar != null) {
            anqpVar.n();
        }
        dbsg<View> aR = aR();
        if (aR.a()) {
            this.d.a(aR.b());
        }
        super.u();
    }

    @Override // defpackage.auzu
    public final void w() {
        aT();
    }
}
