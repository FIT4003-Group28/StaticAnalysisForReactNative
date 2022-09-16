package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: boys  reason: default package */
/* loaded from: classes3.dex */
public final class boys extends ges {
    bpwf a;
    public cjqy aA;
    public boolean aB;
    dcdc<ilo> aC;
    private cqkf<bpwh> aO;
    private cqkf<bpwh> aP;
    @dzsi
    private cqkf<jbk> aQ;
    private ioi aR;
    private final alht aS = new boyl(this);
    private final ink aT = new boym(this);
    private final bpwg aU = new boyn(this);
    private final boyw aV = new boyo(this);
    private bptd aW;
    private inp aX;
    @dzsi
    public dhjz ad;
    @dzsi
    public btzc ae;
    bpag af;
    public bpah ag;
    public bwqv ah;
    public dxio<akox> ai;
    public cqkj aj;
    public efg ak;
    public boze al;
    public bozk am;
    public boza an;
    public bpsq ao;
    public bpvf ap;
    public dbsg<cfll> aq;
    public gfq ar;
    public bnyo as;
    public ioj at;
    public inj au;
    public gll av;
    public bpte aw;
    public inq ax;
    public bomq ay;
    public alhv az;
    boyz b;
    bpwh c;
    public iny d;
    public boyt e;
    public dnqe f;
    @dzsi
    public dpsn g;

    public final void aJ() {
        btzc btzcVar = this.ae;
        if (btzcVar != null) {
            btzcVar.a();
        }
    }

    public final void aR(dcdc<ilo> dcdcVar) {
        this.aC = dcdcVar;
        this.b.i(false);
        this.b.j(dcdcVar);
        this.d.d(dcdcVar);
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            this.aR.g(dcdcVar.get(i));
        }
        if (dcdcVar.isEmpty()) {
            this.d.e(true);
            return;
        }
        inj injVar = this.au;
        View q = q();
        dbsk.s(q);
        injVar.d(q, new Runnable(this) { // from class: boyk
            private final boys a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boys boysVar = this.a;
                boysVar.d.e(true);
                boysVar.g();
            }
        });
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.aQ = this.aj.c(new hxj(), null);
        this.aP = this.aj.c(new bpoi(), null);
        this.aO = this.aj.c(new bpon(), null);
        return null;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (!this.aD) {
            return false;
        }
        return this.c.g();
    }

    public final void g() {
        View c;
        View q = q();
        if (q == null || (c = this.au.c(q)) == null) {
            return;
        }
        this.ay.a(c);
    }

    public final void i(ilo iloVar) {
        if (!this.aD) {
            return;
        }
        boyt boytVar = this.e;
        dpsn i = iloVar.ai().i();
        akqq aj = iloVar.aj();
        dbsk.s(aj);
        dhjz i2 = aj.i();
        String n = iloVar.n();
        boytVar.a = i;
        boytVar.b = i2;
        boytVar.c = n;
        boytVar.d.clear();
        this.c.i();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        dpsn dpsnVar;
        dhjz dhjzVar;
        akqs akqsVar;
        dcdc<ilo> dcdcVar;
        super.l(bundle);
        dbsk.l(this.aq.a());
        Bundle bundle2 = bundle != null ? bundle : this.o;
        bpui bpuiVar = (bpui) bvrs.g(bundle2, "PROTO_MODEL_KEY", (dssr) bpui.j.cu(7), bpui.j);
        this.f = (dnqe) bvrs.g(bundle2, "CLIENT_STATE_PROTO_MODEL_KEY", (dssr) dnqe.i.cu(7), dnqe.i);
        this.g = (dpsn) bvrs.f(bundle2, "INITIAL_FEATURE_ID_KEY", (dssr) dpsn.d.cu(7));
        this.ad = (dhjz) bvrs.f(bundle2, "INITIAL_LOCATION_KEY", (dssr) dhjz.e.cu(7));
        if ((bpuiVar.a & 1) != 0) {
            dpsn dpsnVar2 = bpuiVar.b;
            if (dpsnVar2 == null) {
                dpsnVar2 = dpsn.d;
            }
            dpsnVar = dpsnVar2;
        } else {
            dpsnVar = null;
        }
        if ((bpuiVar.a & 2) != 0) {
            dhjz dhjzVar2 = bpuiVar.c;
            if (dhjzVar2 == null) {
                dhjzVar2 = dhjz.e;
            }
            dhjzVar = dhjzVar2;
        } else {
            dhjzVar = null;
        }
        int i = bpuiVar.a;
        String str = (i & 4) != 0 ? bpuiVar.e : null;
        if ((i & 8) != 0) {
            dgrt dgrtVar = bpuiVar.f;
            if (dgrtVar == null) {
                dgrtVar = dgrt.d;
            }
            akqsVar = akqs.d(dgrtVar);
        } else {
            akqsVar = null;
        }
        bpuh b = bpuh.b(bpuiVar.g);
        if (b == null) {
            b = bpuh.UNKNOWN_MODE;
        }
        boyt boytVar = new boyt(b, dpsnVar, dhjzVar, str, bpuiVar.d, akqsVar, bpuiVar.h, dcep.K(bpuiVar.i));
        this.e = boytVar;
        bpah bpahVar = this.ag;
        cfll b2 = this.aq.b();
        bpah.a(boytVar, 1);
        bpah.a(b2, 2);
        bpah.a(bpahVar.a.a(), 3);
        bozs a = bpahVar.b.a();
        bpah.a(a, 4);
        this.af = new bpag(boytVar, b2, a);
        try {
            dcdcVar = (dcdc) this.ah.d(dcdc.class, bundle2, "CAROUSEL_STATE_KEY");
        } catch (IOException e) {
            bvoo.f(new RuntimeException(e));
            dcdcVar = null;
        }
        if (dcdcVar == null) {
            dcdcVar = dcdc.e();
        }
        this.aC = dcdcVar;
        this.ao.d(bundle);
        boze bozeVar = this.al;
        boyt boytVar2 = this.e;
        boyp boypVar = new boyp(this);
        boze.a(boytVar2, 1);
        boze.a(boypVar, 2);
        Resources a2 = bozeVar.a.a();
        boze.a(a2, 3);
        cqhn a3 = bozeVar.b.a();
        boze.a(a3, 4);
        this.a = new bozd(boytVar2, boypVar, a2, a3);
        boyq boyqVar = new boyq(this);
        boza bozaVar = this.an;
        boyg boygVar = new boyg(this);
        bvpe a4 = bozaVar.a.a();
        boza.a(a4, 1);
        huc a5 = bozaVar.b.a();
        boza.a(a5, 2);
        boza.a(boygVar, 3);
        boza.a(boyqVar, 4);
        bnjv a6 = bozaVar.c.a();
        boza.a(a6, 5);
        cqhn a7 = bozaVar.d.a();
        boza.a(a7, 6);
        Resources a8 = bozaVar.e.a();
        boza.a(a8, 7);
        this.b = new boyz(a4, a5, boygVar, boyqVar, a6, a7, a8);
        this.aR = this.at.a(this.aT, false, dtya.cd, dtya.bZ);
        bozk bozkVar = this.am;
        bpwg bpwgVar = this.aU;
        boyt boytVar3 = this.e;
        bpwf bpwfVar = this.a;
        boyz boyzVar = this.b;
        boyw boywVar = this.aV;
        bpag bpagVar = this.af;
        bpvf bpvfVar = this.ap;
        bozk.a(bpwgVar, 1);
        bozk.a(boytVar3, 2);
        cqhn a9 = bozkVar.a.a();
        bozk.a(a9, 3);
        dbsg<cfll> a10 = bozkVar.b.a();
        bozk.a(a10, 4);
        bozp a11 = bozkVar.c.a();
        bozk.a(a11, 5);
        boyc a12 = bozkVar.d.a();
        bozk.a(a12, 6);
        boyb a13 = bozkVar.e.a();
        bozk.a(a13, 7);
        Resources a14 = bozkVar.f.a();
        bozk.a(a14, 8);
        bozk.a(bpwfVar, 9);
        bozk.a(boyzVar, 10);
        bozk.a(boywVar, 11);
        bozk.a(bpagVar, 12);
        bozk.a(bpvfVar, 13);
        this.c = new bozj(bpwgVar, boytVar3, a9, a10, a11, a12, a13, a14, bpwfVar, boyzVar, boywVar, bpagVar, bpvfVar);
        this.aW = this.aw.a(this);
        inp a15 = this.ax.a(this.aT, dtya.cb);
        this.aX = a15;
        this.d = inz.a(new dbty(this) { // from class: boyh
            private final boys a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                boys boysVar = this.a;
                View q = boysVar.q();
                if (q != null) {
                    for (ioo iooVar : boysVar.au.b(boysVar.b.c(), q)) {
                        if (iooVar.c()) {
                            return dcdc.f(iooVar);
                        }
                    }
                }
                return dcdc.e();
            }
        }, dcdc.h(this.aW, this.aR, a15));
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.bh;
    }

    @dzsi
    public final View q() {
        cqkf<bpwh> cqkfVar = this.aP;
        if (cqkfVar != null) {
            return cqkfVar.c();
        }
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ao.f();
        this.az.b(this.aS);
        cqkf<jbk> cqkfVar = this.aQ;
        dbsk.s(cqkfVar);
        jhz a = jhz.a();
        a.e = cqtt.g(ibm.b());
        a.r = 0;
        a.x = false;
        a.h = false;
        a.f(new View.OnClickListener(this) { // from class: boyi
            private final boys a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddho ddhoVar;
                boys boysVar = this.a;
                cjql e = cjqg.e(view);
                if (e != null) {
                    bpuh bpuhVar = bpuh.UNKNOWN_MODE;
                    int ordinal = boysVar.e.g.ordinal();
                    if (ordinal != 3) {
                        ddhoVar = ordinal != 4 ? dtya.be : dtya.bl;
                    } else {
                        ddhoVar = dtya.bi;
                    }
                    boysVar.aA.j(e, cjtd.a(ddhoVar));
                }
                boysVar.c.g();
            }
        });
        a.j = cqrt.l(R.string.BACK_BUTTON);
        cqkfVar.e(new iyl(a.b()));
        cqkf<bpwh> cqkfVar2 = this.aP;
        dbsk.s(cqkfVar2);
        cqkfVar2.e(this.c);
        this.aO.e(this.c);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.aO.c());
        egjVar.av(this.aP.c());
        cqkf<jbk> cqkfVar3 = this.aQ;
        dbsk.s(cqkfVar3);
        egjVar.F(cqkfVar3.c());
        egf a2 = egf.a();
        a2.l(false);
        a2.l = new afwn[]{afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRANSIT, false), afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.SATELLITE, false), afwn.e(afwm.REALTIME, false)};
        egjVar.A(a2);
        this.ak.a(egjVar.a());
        this.ai.a().aj().aF().f(new boyr());
        this.c.a();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.ao.c(bundle);
        bvrs.k(bundle, "PROTO_MODEL_KEY", this.e.a().bK());
        bvrs.k(bundle, "CLIENT_STATE_PROTO_MODEL_KEY", this.f);
        dpsn dpsnVar = this.g;
        if (dpsnVar != null && this.ad != null) {
            bvrs.k(bundle, "INITIAL_FEATURE_ID_KEY", dpsnVar);
            dhjz dhjzVar = this.ad;
            dbsk.s(dhjzVar);
            bvrs.k(bundle, "INITIAL_LOCATION_KEY", dhjzVar);
        }
        this.ah.c(bundle, "CAROUSEL_STATE_KEY", this.aC);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.c.b();
        this.az.c(this.aS);
        this.ai.a().aj().aF().f(new hvk());
        this.ao.b();
        this.aO.e(null);
        this.aP.e(null);
        cqkf<jbk> cqkfVar = this.aQ;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        super.u();
    }

    public final void w(final akqq akqqVar, dbsg<dpsn> dbsgVar, final boolean z) {
        if (!this.aD) {
            return;
        }
        aJ();
        this.b.i(true);
        bnyo bnyoVar = this.as;
        dikp bZ = diku.h.bZ();
        dhjz i = akqqVar.i();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diku dikuVar = (diku) bZ.b;
        i.getClass();
        dikuVar.b = i;
        dikuVar.a |= 1;
        dhjx aa = this.ai.a().aa();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diku dikuVar2 = (diku) bZ.b;
        aa.getClass();
        dikuVar2.d = aa;
        dikuVar2.a |= 4;
        dikq bZ2 = dikt.b.bZ();
        dikr bZ3 = diks.c.bZ();
        doay doayVar = doay.TYPE_ROAD;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        diks diksVar = (diks) bZ3.b;
        diksVar.b = doayVar.j;
        diksVar.a = 1 | diksVar.a;
        bZ2.a(bZ3);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diku dikuVar3 = (diku) bZ.b;
        dikt bK = bZ2.bK();
        bK.getClass();
        dikuVar3.e = bK;
        dikuVar3.a |= 8;
        drdh bZ4 = drdi.d.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        drdi.f((drdi) bZ4.b);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        drdi.h((drdi) bZ4.b);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        drdi.i((drdi) bZ4.b);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        drdi.g((drdi) bZ4.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diku dikuVar4 = (diku) bZ.b;
        drdi bK2 = bZ4.bK();
        bK2.getClass();
        dikuVar4.f = bK2;
        dikuVar4.a |= 16;
        dnqg bZ5 = dnqh.p.bZ();
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ5.b;
        dnqhVar.l = dnmuVar.ap;
        dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diku dikuVar5 = (diku) bZ.b;
        dnqh bK3 = bZ5.bK();
        bK3.getClass();
        dikuVar5.g = bK3;
        dikuVar5.a |= 32;
        if (dbsgVar.a()) {
            String o = akqi.j(dbsgVar.b()).o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            diku dikuVar6 = (diku) bZ.b;
            o.getClass();
            dikuVar6.a |= 2;
            dikuVar6.c = o;
        }
        this.ae = bnyoVar.b(bZ.bK(), new bnyn(this, akqqVar, z) { // from class: boyj
            private final boys a;
            private final akqq b;
            private final boolean c;

            {
                this.a = this;
                this.b = akqqVar;
                this.c = z;
            }

            @Override // defpackage.bnyn
            public final void Rb(dssj dssjVar, dssj dssjVar2) {
                ff J;
                boys boysVar = this.a;
                akqq akqqVar2 = this.b;
                boolean z2 = this.c;
                diku dikuVar7 = (diku) dssjVar;
                diky dikyVar = (diky) dssjVar2;
                boysVar.ae = null;
                if (!boysVar.aD) {
                    return;
                }
                if (dikyVar == null) {
                    Toast.makeText(boysVar.J(), boysVar.Rp(R.string.NET_FAIL_TITLE), 0).show();
                    boysVar.b.i(false);
                    return;
                }
                boysVar.g = null;
                boysVar.ad = null;
                if (dikyVar.a.size() == 0 && (J = boysVar.J()) != null) {
                    if (dikyVar.b) {
                        new bnyw().aJ(J);
                    } else if (z2) {
                        Toast.makeText(J, (int) R.string.NO_RESULTS_FOR_THIS_AREA, 0).show();
                    }
                }
                dsrj<dikx> dsrjVar = dikyVar.a;
                dccx F = dcdc.F();
                for (dikx dikxVar : dsrjVar) {
                    drdg drdgVar = dikxVar.a;
                    if (drdgVar == null) {
                        drdgVar = drdg.q;
                    }
                    ily ilyVar = new ily();
                    ilyVar.k(drdgVar.d);
                    dpum dpumVar = drdgVar.f;
                    if (dpumVar == null) {
                        dpumVar = dpum.d;
                    }
                    ilyVar.q(akqq.f(dpumVar));
                    ilyVar.F(drdgVar.g);
                    doaw bZ6 = doaz.k.bZ();
                    doay b = doay.b(dikxVar.b);
                    if (b == null) {
                        b = doay.TYPE_ROAD;
                    }
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    doaz doazVar = (doaz) bZ6.b;
                    doazVar.b = b.j;
                    doazVar.a |= 1;
                    ilyVar.z(bZ6.bK());
                    dpxf dpxfVar = drdgVar.n;
                    if (dpxfVar == null) {
                        dpxfVar = dpxf.f;
                    }
                    ilyVar.s(dpxfVar);
                    if (drdgVar.m.size() > 0) {
                        ilyVar.f(drdgVar.m.get(0).b);
                    }
                    if (drdgVar.i.size() > 0) {
                        ilyVar.A(drdgVar.i.get(0));
                    }
                    F.g(ilyVar.d());
                }
                boysVar.aR(F.f());
                if (boysVar.aC.isEmpty()) {
                    boysVar.c.h(bpuh.INITIAL);
                    return;
                }
                inj injVar = boysVar.au;
                View q = boysVar.q();
                dbsk.s(q);
                injVar.e(0, q, boysVar.H());
                akqr a = akqs.a();
                if (!boysVar.aC.isEmpty()) {
                    dcdc<ilo> dcdcVar = boysVar.aC;
                    int size = dcdcVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        akqq aj = dcdcVar.get(i2).aj();
                        if (aj != null) {
                            a.d(aj);
                        }
                    }
                    boysVar.ai.a().p(akyt.o(bpup.a(a.b(), akqqVar2), bpup.b(boysVar.av.b(), boysVar.Rn().getDimensionPixelSize(R.dimen.min_viewport_bounds_for_map_pins))));
                }
                if (!boysVar.aq.a()) {
                    return;
                }
                boysVar.aq.b().a(dcdc.f(akqo.k(akqqVar2, 700.0d)));
            }
        });
    }
}
