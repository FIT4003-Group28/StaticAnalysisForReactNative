package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: byky  reason: default package */
/* loaded from: classes4.dex */
public final class byky extends ges implements egq {
    private static final dcqe an = dcqe.c("byky");
    public amwb a;
    public gll ad;
    public dxio<ascb> ae;
    public dxio<byej> af;
    public btrm ag;
    public efc ah;
    public efg ai;
    public bynr aj;
    public cjqy ak;
    public alhv al;
    public bykf am;
    private boolean ar;
    private boolean as;
    @dzsi
    private cqkf<byil> at;
    @dzsi
    akqs b;
    public akra c;
    public cqkf<byng> d;
    public bynq e;
    public cqkj f;
    public akox g;
    private final bykx ao = new bykx(this);
    private final byno ap = new byno(this) { // from class: bykq
        private final byky a;

        {
            this.a = this;
        }

        @Override // defpackage.byno
        public final boolean a() {
            return this.a.aD;
        }
    };
    private final bynn aq = new bykr(this);
    private final alht au = new byks(this);

    public static byky g(amwb amwbVar, akra akraVar, @dzsi akqs akqsVar, boolean z) {
        byky bykyVar = new byky();
        Bundle bundle = new Bundle();
        bundle.putSerializable("trafficIncidentMetadata", amwbVar);
        bundle.putSerializable("trafficIncidentLocation", akraVar);
        bundle.putSerializable("trafficIncidentBoundingBox", akqsVar);
        bundle.putBoolean("trafficIncidentnIncludeHeader", z);
        bykyVar.B(bundle);
        return bykyVar;
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        if (!this.aD) {
            return;
        }
        q();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (this.aD) {
            i();
            return true;
        }
        return false;
    }

    public final boolean i() {
        return this.af.a().f();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        dbsk.l(bundle.containsKey("trafficIncidentMetadata"));
        amwb amwbVar = (amwb) bundle.getSerializable("trafficIncidentMetadata");
        this.a = amwbVar;
        if (amwbVar == null) {
            bvoo.h("onCreate incidentMetadata should not be null", new Object[0]);
        }
        akra akraVar = (akra) bundle.getSerializable("trafficIncidentLocation");
        this.c = akraVar;
        if (akraVar == null) {
            bvoo.h("onCreate incidentLocation should not be null", new Object[0]);
        }
        this.b = (akqs) bundle.getSerializable("trafficIncidentBoundingBox");
        boolean z = bundle.getBoolean("trafficIncidentnIncludeHeader", false);
        this.ar = z;
        if (z) {
            this.at = this.f.c(new byel(), null);
        }
        this.d = this.f.c(new byne(dtyc.bp), null);
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.aD) {
            return;
        }
        q();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyc.bv;
    }

    public final void q() {
        if (this.b == null) {
            this.g.p(akyt.g(this.c.S()));
            return;
        }
        this.g.q(akyt.o(this.b, this.ad.b()), new byku(this));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        egf d;
        super.s();
        this.as = this.ae.a().g();
        w();
        btrm btrmVar = this.ag;
        bykx bykxVar = this.ao;
        dceq a = dcet.a();
        a.b(crmh.class, new bykz(crmh.class, bykxVar, bvrj.UI_THREAD));
        btrmVar.g(bykxVar, a.a());
        this.al.b(this.au);
        egu c = this.ah.c();
        if (c == null) {
            d = egf.a();
        } else {
            d = c.d();
        }
        d.l(false);
        d.m = false;
        d.x = false;
        d.l = new afwn[]{afwn.e(afwm.TRAFFIC, true), afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRANSIT, false)};
        boolean z = c != null ? c.Z : true;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(null);
        egjVar.Y(true);
        egjVar.k(false);
        egjVar.ad(z);
        egjVar.A(d);
        egjVar.f(false);
        egjVar.e(new bykt(this));
        egjVar.J(this);
        cqkf<byil> cqkfVar = this.at;
        if (cqkfVar != null) {
            egjVar.F(cqkfVar.c());
        }
        egjVar.aw(this.d.c(), false);
        if (c != null && this.as) {
            egjVar.at(this.ae.a().q(this.f).a.c());
        }
        this.ai.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putSerializable("trafficIncidentMetadata", this.a);
        bundle.putSerializable("trafficIncidentLocation", this.c);
        bundle.putSerializable("trafficIncidentBoundingBox", this.b);
        bundle.putBoolean("trafficIncidentnIncludeHeader", this.ar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ag.a(this.ao);
        this.al.c(this.au);
        cqkf<byng> cqkfVar = this.d;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        cqkf<byil> cqkfVar2 = this.at;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
        }
        super.u();
    }

    public final void w() {
        bynq a = this.aj.a(this.ap, J(), this.a, this.as, true, new bykv(this), new bykw(this.ak));
        this.e = a;
        a.R(this.aq);
        this.d.e(this.e);
        cqkf<byil> cqkfVar = this.at;
        if (cqkfVar != null) {
            cqkfVar.e(this.am.a(byny.d));
        }
    }
}
