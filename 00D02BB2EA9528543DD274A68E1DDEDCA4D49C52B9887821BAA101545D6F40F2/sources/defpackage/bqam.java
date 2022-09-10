package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bqam  reason: default package */
/* loaded from: classes4.dex */
public final class bqam extends ges implements bqad, egq, akzy {
    public cqkj a;
    public jkf ad;
    public cpv ae;
    public gek af;
    public araj ag;
    public bpsq ah;
    public bqca ai;
    public View aj;
    public bqaf ak;
    private bqgw al;
    @dzsi
    private akqq am;
    private dnqe an;
    private cqkf<jbk> ao;
    private cqkf<bqin> ap;
    private cqkf<bqij> aq;
    private final Runnable ar = new bqak(this);
    public efg b;
    public dxio<akpm> c;
    public akzh d;
    public akpq e;
    public bqag f;
    public bqcb g;

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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ges
    public final void Oo(View view) {
        Context H;
        if (!this.aD || (H = H()) == null) {
            return;
        }
        this.ae.f(view, H.getString(R.string.MISSING_ROAD_DETAILS_TITLE));
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        this.ai.j.d();
    }

    @Override // defpackage.akzy
    public final void a(alad aladVar) {
        akqs a = alao.a(this.c.a());
        if (a != null) {
            bqba bqbaVar = this.ai.j;
            if ((bnuq.b() ? bqbaVar.a : bqbaVar.a.b()).k() < 15.0d || !bqbaVar.c.a() || !bqbaVar.b.a) {
                return;
            }
            bqbaVar.c.b().a(dcdc.f(a));
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.ao = this.a.e(new hxj());
        this.ap = this.a.e(new bqgh());
        this.aq = this.a.e(new bqfm());
        this.aF = this.ap.c();
        return null;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        return this.ai.u();
    }

    @Override // defpackage.bqad
    public final void i(boolean z) {
        if (this.aD) {
            this.ai.s(z);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        Bundle bundle2 = bundle;
        super.l(bundle);
        Bundle bundle3 = this.o;
        if (bundle2 != null) {
            this.ah.d(bundle2);
        } else {
            bundle2 = bundle3;
        }
        bqhl bqhlVar = (bqhl) bvrs.f(bundle2, "state", (dssr) bqhl.d.cu(7));
        dbsk.s(bqhlVar);
        bqhv bqhvVar = bqhlVar.b;
        if (bqhvVar == null) {
            bqhvVar = bqhv.i;
        }
        this.al = bqgw.a(bqhvVar);
        if ((bqhlVar.a & 2) == 0) {
            this.am = this.d.p().i;
        } else {
            dpum dpumVar = bqhlVar.c;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            this.am = akqq.f(dpumVar);
        }
        this.an = (dnqe) bvrs.g(this.o, "CLIENT_STATE_PROTO_KEY", (dssr) dnqe.i.cu(7), dnqe.i);
        bqhg f = bqhg.f((bqif) bvrs.g(bundle2, "MULTI_POLYLINE_STATE_KEY", (dssr) bqif.f.cu(7), bqif.f));
        bqcb bqcbVar = this.g;
        dnqe dnqeVar = this.an;
        bqcb.a(f, 1);
        bqcb.a(dnqeVar, 2);
        gga a = bqcbVar.a.a();
        bqcb.a(a, 3);
        eeu a2 = bqcbVar.b.a();
        bqcb.a(a2, 4);
        jmx a3 = bqcbVar.c.a();
        bqcb.a(a3, 5);
        bnyd a4 = bqcbVar.d.a();
        bqcb.a(a4, 6);
        Executor a5 = bqcbVar.e.a();
        bqcb.a(a5, 7);
        jkf a6 = bqcbVar.f.a();
        bqcb.a(a6, 8);
        cqhn a7 = bqcbVar.g.a();
        bqcb.a(a7, 9);
        jlp a8 = bqcbVar.h.a();
        bqcb.a(a8, 10);
        bqbb a9 = bqcbVar.i.a();
        bqcb.a(a9, 11);
        zzn a10 = bqcbVar.j.a();
        bqcb.a(a10, 12);
        afwr a11 = bqcbVar.k.a();
        bqcb.a(a11, 13);
        bpzq a12 = bqcbVar.l.a();
        bqcb.a(a12, 14);
        bqau a13 = bqcbVar.m.a();
        bqcb.a(a13, 15);
        gdc a14 = bqcbVar.n.a();
        bqcb.a(a14, 16);
        cpv a15 = bqcbVar.o.a();
        bqcb.a(a15, 17);
        this.ai = new bqca(f, dnqeVar, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15);
        this.ak = this.f.a(this);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.cw;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        bpsq bpsqVar = this.ah;
        bpso c = bpsp.c();
        c.b(true);
        boolean a = bpsqVar.a(c.a());
        this.ag.m().e();
        this.ag.m().h(amwd.OFF);
        if (a) {
            this.ak.b();
        } else {
            akqq akqqVar = this.am;
            dbsk.s(akqqVar);
            this.c.a().q(akyt.i(akqqVar, Math.max(this.d.k(), 18.0f)), new bqal(this));
        }
        this.c.a().ab(this);
        this.ao.e(new iyl(this.ai.t()));
        this.ap.e(this.ai);
        this.aq.e(this.ai.p());
        if (this.af.c == jjn.FULLY_EXPANDED) {
            this.ai.p().i();
        }
        this.aj = this.aq.c();
        efg efgVar = this.b;
        egj egjVar = new egj(this);
        egjVar.F(this.ao.c());
        egjVar.w(null);
        egjVar.az(this.aj, new Callable(this) { // from class: bqaj
            private final bqam a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(this.a.aj.findViewById(bqfm.a).getMeasuredHeight() - 10);
            }
        });
        egjVar.ai(this.af.a(jjn.HIDDEN));
        egjVar.f(false);
        egjVar.aa();
        egjVar.ab(this.ai.c());
        egjVar.k(false);
        egjVar.M(this.ap.c());
        egjVar.I(2);
        egjVar.a.ar = false;
        egjVar.ak(jkc.l, jkc.l);
        egjVar.t(this.ai.q());
        egjVar.J(this);
        egjVar.e(this);
        egf a2 = egf.a();
        a2.x = false;
        a2.l(false);
        a2.l = new afwn[]{afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.TRANSIT, false)};
        a2.h = ardz.NONE;
        egjVar.A(a2);
        efgVar.a(egjVar.a());
        this.e.a(this.ar);
        this.e.b(this.ar);
        this.ai.a();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.ah.c(bundle);
        bvrs.k(bundle, "MULTI_POLYLINE_STATE_KEY", this.ai.r());
        g(bundle, this.al, this.am);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ak.c();
        this.ai.b();
        this.ao.e(null);
        this.ap.e(null);
        this.aq.e(null);
        this.e.c(this.ar);
        this.c.a().ac(this);
        this.ah.b();
        this.af.c = this.ad.l().L();
        super.u();
    }
}
