package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bpyx  reason: default package */
/* loaded from: classes4.dex */
public final class bpyx extends ges implements bpsr, bqad {
    public bpzk a;
    public akpq ad;
    public bqag ae;
    public cpv af;
    public bpzb ag;
    public bpzj ah;
    public cqkf<bqii> ai;
    public bqaf aj;
    private bqgw ak;
    @dzsi
    private akqq al;
    private bpza am;
    private cqkf<bqih> an;
    private bnyc ao;
    private final Runnable ap = new bpyv(this);
    public cqkj b;
    public efg c;
    public bpsq d;
    public bnyd e;
    public dxio<akpm> f;
    public akzh g;

    public static void g(Bundle bundle, bqgw bqgwVar, @dzsi akqq akqqVar) {
        bqhk bZ = bqhl.d.bZ();
        bqhm c = bqgwVar.c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bqhl bqhlVar = (bqhl) bZ.b;
        bqhv bK = c.bK();
        bK.getClass();
        bqhlVar.b = bK;
        bqhlVar.a |= 1;
        if (akqqVar != null) {
            dpum h = akqqVar.h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bqhl bqhlVar2 = (bqhl) bZ.b;
            h.getClass();
            bqhlVar2.c = h;
            bqhlVar2.a |= 2;
        }
        bvrs.k(bundle, "state", bZ.bK());
    }

    @Override // defpackage.bpsr
    public final void a() {
        if (!this.aD) {
            return;
        }
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        ggaVar.D(bpyt.g(this.ak));
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.ai = this.b.c(new bqev(), null);
        this.an = this.b.c(new bqet(), null);
        return null;
    }

    @Override // defpackage.bpsr
    public final void b() {
        e();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (!this.aD) {
            return false;
        }
        this.ao.b(!this.ak.f().isEmpty());
        return true;
    }

    @Override // defpackage.bqad
    public final void i(boolean z) {
        if (this.aD) {
            this.ah.o(z);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        Bundle bundle2;
        super.l(bundle);
        Bundle bundle3 = this.o;
        if (bundle != null) {
            this.d.d(bundle);
            bundle2 = bundle;
        } else {
            bundle2 = bundle3;
        }
        bqhl bqhlVar = (bqhl) bvrs.f(bundle2, "state", (dssr) bqhl.d.cu(7));
        dbsk.s(bqhlVar);
        bqhv bqhvVar = bqhlVar.b;
        if (bqhvVar == null) {
            bqhvVar = bqhv.i;
        }
        this.ak = bqgw.a(bqhvVar);
        if ((bqhlVar.a & 2) == 0) {
            this.al = this.g.p().i;
        } else {
            dpum dpumVar = bqhlVar.c;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            this.al = akqq.f(dpumVar);
        }
        bpza a = this.ag.a(this.ak, bpyy.LINE_AND_POINTS);
        this.am = a;
        bpzk bpzkVar = this.a;
        bqgw bqgwVar = this.ak;
        bpzk.a(bqgwVar, 1);
        bpzk.a(this, 2);
        bpzk.a(a, 3);
        ff ffVar = (ff) ((dxjd) bpzkVar.a).a;
        bpzk.a(ffVar, 4);
        zzn a2 = bpzkVar.b.a();
        bpzk.a(a2, 5);
        cqhn a3 = bpzkVar.c.a();
        bpzk.a(a3, 6);
        bvrb a4 = bpzkVar.d.a();
        bpzk.a(a4, 7);
        jlp a5 = bpzkVar.e.a();
        bpzk.a(a5, 8);
        cztz a6 = bpzkVar.f.a();
        bpzk.a(a6, 9);
        afwr a7 = bpzkVar.g.a();
        bpzk.a(a7, 10);
        this.ah = new bpzj(bqgwVar, this, a, ffVar, a2, a3, a4, a5, a6, a7);
        bnyd bnydVar = this.e;
        gn gnVar = this.A;
        dbsk.s(gnVar);
        this.ao = bnydVar.a(gnVar, dtya.cA, dtya.cB);
        this.aj = this.ae.a(this);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.cD;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        bpsq bpsqVar = this.d;
        bpso c = bpsp.c();
        c.b(true);
        if (bpsqVar.a(c.a())) {
            this.aj.b();
        } else {
            akqq akqqVar = this.al;
            dbsk.s(akqqVar);
            this.f.a().q(akyt.i(akqqVar, Math.max(this.g.k(), 18.0f)), new bpyw(this));
        }
        this.ai.e(this.ah);
        this.an.e(this.ah);
        efg efgVar = this.c;
        egj egjVar = new egj(this);
        egjVar.F(this.ai.c());
        egjVar.w(null);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.aa();
        egjVar.k(false);
        egjVar.M(this.an.c());
        egjVar.I(2);
        egf a = egf.a();
        a.x = false;
        a.l(false);
        a.l = new afwn[]{afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.TRANSIT, false)};
        a.h = ardz.NONE;
        egjVar.A(a);
        egjVar.e(new ecs(this) { // from class: bpyu
            private final bpyx a;

            {
                this.a = this;
            }

            @Override // defpackage.ecs
            public final void Qf() {
                View a2;
                bpyx bpyxVar = this.a;
                if (bpyxVar.aD && (a2 = cqhu.a(bpyxVar.ai.c(), icu.c)) != null) {
                    bpyxVar.af.c(a2, 8);
                }
            }
        });
        efgVar.a(egjVar.a());
        this.ad.a(this.ap);
        this.ad.b(this.ap);
        this.am.a();
        this.ah.a();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.d.c(bundle);
        g(bundle, this.ak, this.al);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.aj.c();
        this.ah.d();
        this.ai.e(null);
        this.an.e(null);
        this.ad.c(this.ap);
        this.am.e();
        this.d.b();
        super.u();
    }
}
