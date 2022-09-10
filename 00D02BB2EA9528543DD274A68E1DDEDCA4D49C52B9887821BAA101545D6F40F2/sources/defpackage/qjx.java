package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: qjx  reason: default package */
/* loaded from: classes7.dex */
public final class qjx extends ges implements egq, qur {
    private static final afwn[] as = {afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.TRANSIT, false)};
    public cqat a;
    @dzsi
    private dehu aA;
    public qus ad;
    public qkc ae;
    public btvo af;
    public dxio<acwo> ag;
    public btrm ah;
    public qqg ai;
    public bzmm aj;
    public qva ak;
    public cqhn al;
    public acyp am;
    public cjxo an;
    public dehq ao;
    public qph ap;
    public cqkf<qng> aq;
    @dzsi
    qqf ar;
    @dzsi
    private qut at;
    @dzsi
    private qco au;
    private cqkf<qng> av;
    private vne aw;
    @dzsi
    private cqkf<qng> ax;
    private int ay = -1;
    @dzsi
    private rjz az;
    public efg b;
    public cqkj c;
    public qpn d;
    public qpi e;
    public ivt f;
    public acyr g;

    private final boolean aT() {
        if (this.am.d() || !this.g.f()) {
            return false;
        }
        dktt dkttVar = this.af.getPassiveAssistParameters().a().am;
        if (dkttVar == null) {
            dkttVar = dktt.z;
        }
        return dkttVar.p;
    }

    private final egu aU() {
        qcx a;
        egj egjVar = new egj(this);
        egjVar.w(null);
        egjVar.E(new dbty(this) { // from class: qjv
            private final qjx a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                int a2;
                Context H = this.a.H();
                if (H == null) {
                    a2 = 0;
                } else {
                    a2 = jmj.a(H, 8) + ise.b.NR(H);
                }
                return Integer.valueOf(a2);
            }
        });
        egjVar.ag(null);
        egf b = egf.b();
        b.x = true;
        b.m();
        b.l = as;
        egjVar.A(b);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.J(this);
        aegc aegcVar = (aegc) this.aq.c();
        aegcVar.setShowGrippy(true);
        aegcVar.setShouldUseRoundedCornersShadow(true);
        if (this.ay == 1 || !aV()) {
            egjVar.H(aegcVar);
            egjVar.N(g());
        } else {
            cqkf<qng> cqkfVar = this.av;
            if (cqkfVar != null) {
                egjVar.ae((glg) cqkfVar.c(), 1);
            }
        }
        if (this.at != null) {
            int a2 = jmj.a(J(), 56);
            qut qutVar = this.at;
            dbsk.s(qutVar);
            aegcVar.setMinExposurePixels(qutVar.h().getHeight() + a2);
            qut qutVar2 = this.at;
            dbsk.s(qutVar2);
            qutVar2.e(egjVar);
            ivt ivtVar = this.f;
            ff J = J();
            if (this.g.f() && this.am.d() && J != null) {
                qcw x = qcx.x();
                x.r(amvh.i(J()));
                a = x.a();
            } else {
                Context H = H();
                qco qcoVar = this.au;
                dbsk.s(qcoVar);
                a = qna.a(H, qcoVar);
            }
            egjVar.Q(ivtVar.b(this, a));
            egjVar.k(true);
        } else {
            cqkf<qng> cqkfVar2 = this.ax;
            dbsk.s(cqkfVar2);
            egjVar.F(cqkfVar2.c());
        }
        return egjVar.a();
    }

    private final boolean aV() {
        dktt dkttVar = this.af.getPassiveAssistParameters().a().am;
        if (dkttVar == null) {
            dkttVar = dktt.z;
        }
        return dkttVar.y;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        qut qutVar = this.at;
        if (qutVar != null) {
            qutVar.d();
        }
        this.ax = null;
        super.Qe();
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        qqf qqfVar;
        this.ap.j();
        if (!aT() || this.at == null || (qqfVar = this.ar) == null || !this.aj.a(qqfVar)) {
            return;
        }
        this.ar.h();
    }

    @Override // defpackage.qur
    @dzsi
    public final quy aJ() {
        qco qcoVar = this.au;
        if (qcoVar == null) {
            return null;
        }
        return qcoVar.f();
    }

    @Override // defpackage.ges, defpackage.ggg
    public final /* bridge */ /* synthetic */ List aO() {
        return this.o.getBoolean("has_fragment_search_tag", false) ? dcdc.f(gfs.HOMETAB) : dcdc.e();
    }

    @Override // defpackage.qur
    public final void aR() {
        aegc aS = aS();
        if (aS != null) {
            aS.e(g());
        }
    }

    @dzsi
    public final aegc aS() {
        return (aegc) this.aq.c();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        boolean z;
        boolean z2;
        int i;
        char c;
        char c2;
        aegq a;
        qut qutVar;
        View f;
        boolean z3 = this.af.getTransitPagesParameters().z;
        boolean z4 = this.af.getTransitPagesParameters().C;
        if (z3) {
            this.aq = this.c.d(new qlo(z4), viewGroup, false);
        } else {
            this.aq = this.c.d(new qlh(z4), viewGroup, false);
        }
        if (aV()) {
            this.av = this.c.d(new qlr(z4), viewGroup, false);
        }
        final aegc aegcVar = (aegc) this.aq.c();
        aegcVar.setShowGrippy(true);
        aegcVar.setShouldUseRoundedCornersShadow(true);
        aegcVar.h(g());
        this.ay = Rn().getConfiguration().orientation;
        qut qutVar2 = this.at;
        if (qutVar2 != null) {
            qpn qpnVar = this.d;
            qph qphVar = this.ap;
            qco qcoVar = this.au;
            dbsk.s(qcoVar);
            Activity activity = (Activity) ((dxjd) qpnVar.a).a;
            qpn.a(activity, 1);
            qpn.a(qpnVar.b.a(), 2);
            qpn.a(((dxjh) qpnVar.c).a(), 3);
            dxio a2 = ((dxjh) qpnVar.d).a();
            qpn.a(a2, 4);
            dxio a3 = ((dxjh) qpnVar.e).a();
            qpn.a(a3, 5);
            isd a4 = qpnVar.f.a();
            qpn.a(a4, 6);
            yzi a5 = qpnVar.g.a();
            qpn.a(a5, 7);
            dxio a6 = ((dxjh) qpnVar.h).a();
            z2 = z4;
            qpn.a(a6, 8);
            acyp a7 = qpnVar.i.a();
            z = z3;
            qpn.a(a7, 9);
            btvo a8 = qpnVar.j.a();
            qpn.a(a8, 10);
            qpn.a(qphVar, 12);
            qpn.a(qcoVar, 13);
            c = 2;
            c2 = 4;
            i = 5;
            qutVar2.a(viewGroup, new qpm(activity, a2, a3, a4, a5, a6, a7, a8, qutVar2, qphVar, qcoVar), new mw(this, aegcVar) { // from class: qjt
                private final qjx a;
                private final aegc b;

                {
                    this.a = this;
                    this.b = aegcVar;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    qjx qjxVar = this.a;
                    aegc aegcVar2 = this.b;
                    Integer num = (Integer) obj;
                    qjxVar.ap.n(num.intValue());
                    aegcVar2.setMinExposurePixels(num.intValue() + jmj.a(qjxVar.J(), 56));
                }
            }, new mw(this) { // from class: qju
                private final qjx a;

                {
                    this.a = this;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    this.a.ap.m(((Integer) obj).intValue());
                }
            });
        } else {
            z = z3;
            z2 = z4;
            i = 5;
            c = 2;
            c2 = 4;
            this.ax = this.c.d(new qlc(), viewGroup, false);
            aegcVar.setMinExposurePixels(jmj.a(J(), 56));
        }
        if (aT() && (qutVar = this.at) != null && (f = qutVar.f()) != null) {
            qqf a9 = this.ai.a(f);
            this.ar = a9;
            a9.g();
        }
        if (!z) {
            this.ap.q();
            aegq[] aegqVarArr = new aegq[3];
            aegqVarArr[0] = aegv.b(qlh.a);
            aegqVarArr[1] = aegu.a;
            aegqVarArr[c] = aegv.b(qks.a);
            ((aefv) aegcVar).setNestedScrollViewProvider(aegv.a(aegqVarArr));
            return null;
        }
        zut zutVar = (zut) aegcVar;
        if (z2) {
            aegq[] aegqVarArr2 = new aegq[i];
            aegqVarArr2[0] = aegv.b(qls.a);
            aegqVarArr2[1] = aegu.a;
            aegqVarArr2[c] = aegv.b(qmd.a);
            aegqVarArr2[3] = aegu.a;
            aegqVarArr2[c2] = aegv.b(qks.a);
            a = aegv.a(aegqVarArr2);
        } else {
            aegq[] aegqVarArr3 = new aegq[3];
            aegqVarArr3[0] = aegv.b(qls.a);
            aegqVarArr3[1] = aegu.a;
            aegqVarArr3[c] = aegv.b(qks.a);
            a = aegv.a(aegqVarArr3);
        }
        zutVar.setNestedScrollViewProvider(a);
        zutVar.setProgrammaticNestedScrollListener(this.ap.p());
        zutVar.setSoftMinimumHeightPixels(g());
        zutVar.setNudgeBarViewHelpers(this.al, this.az);
        zutVar.setScrollEachNestedScrollViewIndividually(true);
        return null;
    }

    public final int g() {
        ff J = J();
        dbsk.s(J);
        return (int) (bvsc.a(J) * Math.max(this.ap.v(), 0.45f));
    }

    public final void i() {
        if (this.at != null) {
            this.b.a(aU());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        qco i = qco.i(this.o);
        if (i == null) {
            return;
        }
        this.au = i;
        if (this.g.f()) {
            qut a = this.ad.a(this, new Runnable(this) { // from class: qjq
                private final qjx a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.i();
                }
            });
            this.at = a;
            a.m(this.ak);
            this.az = this.at.n();
        }
        qpi qpiVar = this.e;
        rjz rjzVar = this.az;
        qnm qnmVar = new qnm(this) { // from class: qjr
            private final qjx a;

            {
                this.a = this;
            }

            @Override // defpackage.qnm
            public final void a() {
                aegc aS;
                qjx qjxVar = this.a;
                if (qjxVar.aq == null || (aS = qjxVar.aS()) == null) {
                    return;
                }
                aS.e(Math.max(aS.c(), qjxVar.g()));
            }
        };
        Activity activity = (Activity) ((dxjd) qpiVar.a).a;
        qpi.a(activity, 1);
        dxio a2 = ((dxjh) qpiVar.b).a();
        qpi.a(a2, 2);
        qoq a3 = qpiVar.c.a();
        qpi.a(a3, 3);
        qpi.a(qpiVar.d.a(), 4);
        ros a4 = qpiVar.e.a();
        qpi.a(a4, 5);
        qpi.a(qpiVar.f.a(), 6);
        dxio a5 = ((dxjh) qpiVar.g).a();
        qpi.a(a5, 7);
        qpi.a(qpiVar.h.a(), 8);
        cjqy a6 = qpiVar.i.a();
        qpi.a(a6, 9);
        cjqq a7 = qpiVar.j.a();
        qpi.a(a7, 10);
        qpe a8 = qpiVar.k.a();
        qpi.a(a8, 11);
        qpi.a(qpiVar.l.a(), 12);
        btvo a9 = qpiVar.m.a();
        qpi.a(a9, 13);
        acyp a10 = qpiVar.n.a();
        qpi.a(a10, 14);
        qpi.a(qnmVar, 16);
        qpi.a(i, 17);
        this.ap = new qph(activity, a2, a3, a4, a5, a6, a7, a8, a9, a10, rjzVar, qnmVar, i, bundle);
        this.aw = new vne(new dbty(this) { // from class: qjs
            private final qjx a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.aS();
            }
        });
        super.l(bundle);
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.ay != configuration.orientation) {
            this.ay = configuration.orientation;
            i();
        }
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtyc.cn;
    }

    @Override // defpackage.qur
    @dzsi
    public final qux q() {
        qut qutVar = this.at;
        qco qcoVar = this.au;
        gn gnVar = this.A;
        qup w = w();
        quw quwVar = null;
        if (gnVar != null && qcoVar != null && qutVar != null && w != null) {
            quy k = qutVar.k();
            dndr a = qcoVar.c().a();
            Fragment$SavedState r = gnVar.r(this);
            if (r != null && k != null) {
                if (a != null) {
                    quwVar = quw.c(a, w.b());
                }
                return qux.e(k, quwVar, r, this.a);
            }
        }
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (this.am.d()) {
            this.an.a(1);
        }
        this.ap.i((acyu) this.aq.c());
        this.aq.e(this.ap);
        cqkf<qng> cqkfVar = this.av;
        if (cqkfVar != null) {
            cqkfVar.e(this.ap);
        }
        cqkf<qng> cqkfVar2 = this.ax;
        if (cqkfVar2 != null) {
            cqkfVar2.e(this.ap);
        }
        if (this.at != null) {
            if (czui.a(22)) {
                qut qutVar = this.at;
                dbsk.s(qutVar);
                View f = qutVar.f();
                if (f != null) {
                    f.setAccessibilityTraversalBefore(R.id.on_map_directions_button);
                }
                this.aq.c().setAccessibilityTraversalAfter(R.id.mylocation_button);
            }
            qut qutVar2 = this.at;
            dbsk.s(qutVar2);
            qutVar2.b();
        }
        this.b.a(aU());
        this.ae.a();
        vnf.c(this.ah, this.aw);
        dehu d = this.ao.d(new Runnable(this) { // from class: qjw
            private final qjx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                qjx qjxVar = this.a;
                if (!qjxVar.aD || qjxVar.J() == null) {
                    return;
                }
                qjxVar.ag.a().i(dvum.COMMUTE_TRANSIT_IMMERSIVE, null);
            }
        }, this.af.getSurveyParameters().b, TimeUnit.MILLISECONDS);
        this.aA = d;
        bvqd.b(d, this.ao);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.ap.l(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.aq.e(null);
        cqkf<qng> cqkfVar = this.av;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        this.ap.k();
        cqkf<qng> cqkfVar2 = this.ax;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
        }
        qut qutVar = this.at;
        if (qutVar != null) {
            qutVar.c();
        }
        this.ae.b();
        vnf.b(this.ah, this.aw);
        dehu dehuVar = this.aA;
        if (dehuVar != null && !dehuVar.isDone()) {
            this.aA.cancel(true);
        }
        if (this.am.d()) {
            this.an.b();
        }
        super.u();
    }

    @Override // defpackage.qur
    @dzsi
    public final qup w() {
        qco qcoVar = this.au;
        if (qcoVar == null) {
            return null;
        }
        return qcoVar.e();
    }
}
