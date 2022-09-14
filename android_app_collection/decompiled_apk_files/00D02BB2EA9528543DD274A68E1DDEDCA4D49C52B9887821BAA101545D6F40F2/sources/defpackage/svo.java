package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.directions.framework.details.TripDetailsContext;
import com.google.android.apps.maps.R;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: svo  reason: default package */
/* loaded from: classes7.dex */
public final class svo extends ges implements egq, ssr {
    public Executor a;
    public tkm ad;
    public udw ae;
    public byyp af;
    public swz ag;
    public cjmt ah;
    @dzsi
    public tfv ai;
    @dzsi
    public tft aj;
    public swy ak;
    @dzsi
    public svp al;
    @dzsi
    private cqkf<tfr> am;
    @dzsi
    private cqkf<tfp> an;
    @dzsi
    private cqkf<tfo> ao;
    @dzsi
    private cqkf<tfq> ap;
    @dzsi
    private tfy aq;
    @dzsi
    private tfo ar;
    private final bzgj as = new bzgj();
    private TripDetailsContext at;
    @dzsi
    private crzp<dbsg<tlv>> au;
    @dzsi
    private crzp<dbsg<amve>> av;
    public efg b;
    public cqkj c;
    public dxio<afwp> d;
    public tfz e;
    public tfw f;
    public tfu g;

    private final void i() {
        jjn jjnVar;
        jkc jkcVar;
        egf c = egf.c();
        dbsg<tlv> l = this.ak.b().l();
        dbsk.s(l);
        c.h = tkl.a(l);
        egj egjVar = new egj(this);
        egjVar.ao(true);
        egjVar.A(c);
        egjVar.c(this.d.a().e());
        egjVar.k(true);
        egjVar.ap(3);
        egjVar.an();
        egjVar.J(this);
        svp svpVar = this.al;
        dbsk.s(svpVar);
        if (svpVar.a()) {
            cqkf<tfo> cqkfVar = this.ao;
            dbsk.s(cqkfVar);
            tfo tfoVar = this.ar;
            dbsk.s(tfoVar);
            cqkfVar.e(tfoVar);
            tft tftVar = this.aj;
            dbsk.s(tftVar);
            svp svpVar2 = this.al;
            dbsk.s(svpVar2);
            tftVar.h(svpVar2.b());
            cqkf<tfq> cqkfVar2 = this.ap;
            dbsk.s(cqkfVar2);
            cqkfVar2.f();
            cqkf<tfp> cqkfVar3 = this.an;
            dbsk.s(cqkfVar3);
            cqkfVar3.f();
            cqkf<tfr> cqkfVar4 = this.am;
            dbsk.s(cqkfVar4);
            cqkfVar4.f();
            tfv tfvVar = this.ai;
            dbsk.s(tfvVar);
            tfvVar.f(jjn.FULLY_EXPANDED);
            cqkf<tfo> cqkfVar5 = this.ao;
            dbsk.s(cqkfVar5);
            egjVar.ax((glg) cqkfVar5.c());
            egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
            egjVar.ag(null);
            egjVar.F(null);
        } else {
            cqkf<tfo> cqkfVar6 = this.ao;
            dbsk.s(cqkfVar6);
            cqkfVar6.f();
            cqkf<tfq> cqkfVar7 = this.ap;
            if (cqkfVar7 != null) {
                tfv tfvVar2 = this.ai;
                dbsk.s(tfvVar2);
                cqkfVar7.e(tfvVar2);
                egjVar.u(1);
                cqkf<tfq> cqkfVar8 = this.ap;
                dbsk.s(cqkfVar8);
                egjVar.aw(cqkfVar8.c(), false);
                tft tftVar2 = this.aj;
                dbsk.s(tftVar2);
                svp svpVar3 = this.al;
                dbsk.s(svpVar3);
                tftVar2.h(svpVar3.b());
            }
            cqkf<tfr> cqkfVar9 = this.am;
            if (cqkfVar9 != null) {
                tfy tfyVar = this.aq;
                dbsk.s(tfyVar);
                cqkfVar9.e(tfyVar);
                egjVar.G(this.am.c(), 5);
            }
            cqkf<tfp> cqkfVar10 = this.an;
            if (cqkfVar10 != null) {
                tft tftVar3 = this.aj;
                dbsk.s(tftVar3);
                cqkfVar10.e(tftVar3);
                cqkf<tfp> cqkfVar11 = this.an;
                dbsk.s(cqkfVar11);
                egjVar.az(cqkfVar11.c(), new Callable(this) { // from class: svl
                    private final svo a;

                    {
                        this.a = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i;
                        svp svpVar4 = this.a.al;
                        dbsk.s(svpVar4);
                        View c2 = svpVar4.a.c();
                        int i2 = 0;
                        if (c2 != null) {
                            c2.measure(View.MeasureSpec.makeMeasureSpec(svpVar4.b.getDisplayMetrics().widthPixels, 1073741824), 0);
                            i = c2.getMeasuredHeight();
                        } else {
                            i = 0;
                        }
                        if (!svpVar4.c.d().a()) {
                            View findViewById = c2 != null ? c2.findViewById(R.id.trip_details_contents) : null;
                            if (findViewById != null) {
                                findViewById.measure(View.MeasureSpec.makeMeasureSpec(svpVar4.b.getDisplayMetrics().widthPixels, 1073741824), 0);
                                i2 = findViewById.getMeasuredHeight();
                            }
                            i -= i2;
                        }
                        return Integer.valueOf(i);
                    }
                });
                svp svpVar4 = this.al;
                dbsk.s(svpVar4);
                dbsg<amve> l2 = svpVar4.d.c().l();
                dbsk.s(l2);
                dbsg<tlv> l3 = svpVar4.d.b().l();
                dbsk.s(l3);
                if (l3.a() && l3.b().d().h()) {
                    jjnVar = jjn.EXPANDED;
                } else if (l2.a()) {
                    jjnVar = vyb.b(l2.b()) == dqvj.TRANSIT ? jjn.EXPANDED : jjn.COLLAPSED;
                } else {
                    jjnVar = jjn.COLLAPSED;
                }
                egjVar.ai(jjnVar);
                egjVar.aq(cjmu.TRANSPARENT_BG_SATELLITE_ADAPTIVE_ICONS_DM_AWARE);
                egjVar.t(new svn(this));
                svp svpVar5 = this.al;
                dbsk.s(svpVar5);
                if (svpVar5.c.d().a()) {
                    jkcVar = jkc.o;
                } else {
                    jkcVar = jkc.c;
                }
                dbsk.s(this.al);
                egjVar.ak(jkcVar, jkc.c);
            }
        }
        efg efgVar = this.b;
        egjVar.w(null);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.am = null;
        this.an = null;
        this.ap = null;
        this.al = null;
        super.Qe();
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        this.ad.c();
        boolean z = eguVar.j == jjn.FULLY_EXPANDED;
        if (!z) {
            this.ad.f();
        }
        tft tftVar = this.aj;
        if (tftVar != null) {
            tftVar.g(z);
        }
        tfv tfvVar = this.ai;
        if (tfvVar != null) {
            svp svpVar = this.al;
            dbsk.s(svpVar);
            tfvVar.f(svpVar.a() ? jjn.FULLY_EXPANDED : eguVar.j);
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.am = this.c.e(new tfm());
        this.an = this.c.e(new tfe());
        this.ao = this.c.e(new tew());
        this.ap = this.c.e(new tfk());
        cqkf<tfp> cqkfVar = this.an;
        dbsk.s(cqkfVar);
        cqkf<tfq> cqkfVar2 = this.ap;
        dbsk.s(cqkfVar2);
        cqkf<tfo> cqkfVar3 = this.ao;
        dbsk.s(cqkfVar3);
        this.al = new svp(cqkfVar, cqkfVar2, cqkfVar3, Rn(), this.at, this.ak);
        return null;
    }

    @Override // defpackage.ssr
    public final ssq b() {
        return ssq.DETAILS;
    }

    public final void g(boolean z) {
        dbsg<tlv> l = this.ak.b().l();
        dbsk.s(l);
        dbsg<amve> l2 = this.ak.c().l();
        dbsk.s(l2);
        if (z) {
            tfv tfvVar = this.ai;
            if (tfvVar != null) {
                tfvVar.e(l, l2);
            }
            tft tftVar = this.aj;
            if (tftVar != null) {
                tftVar.f(l, l2);
            }
        }
        if (this.ae == null || !l.a()) {
            udw udwVar = this.ae;
            dbsk.s(udwVar);
            udwVar.d();
        } else {
            tlv b = l.b();
            dbsk.s(b);
            if (l2.a()) {
                udw udwVar2 = this.ae;
                dbsk.s(udwVar2);
                btlu a = this.ak.a();
                dbsk.s(a);
                tlv b2 = l.b();
                dbsk.s(b2);
                amve b3 = l2.b();
                dbsk.s(b3);
                udwVar2.c(a, b2, b.w(b3).b().intValue());
            } else {
                udw udwVar3 = this.ae;
                dbsk.s(udwVar3);
                btlu a2 = this.ak.a();
                dbsk.s(a2);
                tlv b4 = l.b();
                dbsk.s(b4);
                udwVar3.b(a2, b4);
            }
        }
        if (this.ad == null || !l.a()) {
            return;
        }
        tkm tkmVar = this.ad;
        dbsk.s(tkmVar);
        btlu a3 = this.ak.a();
        dbsk.s(a3);
        tlv b5 = l.b();
        dbsk.s(b5);
        tkmVar.a(a3, b5, l2);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        swy swsVar;
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        TripDetailsContext tripDetailsContext = (TripDetailsContext) bundle.getParcelable("trip_details_context");
        dbsk.s(tripDetailsContext);
        this.at = tripDetailsContext;
        swz swzVar = this.ag;
        if (tripDetailsContext.d().a()) {
            sww swwVar = swzVar.b;
            dxio a = ((dxjh) swwVar.a).a();
            sww.a(a, 1);
            tma a2 = swwVar.b.a();
            sww.a(a2, 2);
            Executor a3 = swwVar.c.a();
            sww.a(a3, 3);
            tmb a4 = swwVar.d.a();
            sww.a(a4, 4);
            wuw a5 = swwVar.e.a();
            sww.a(a5, 5);
            sww.a(tripDetailsContext, 6);
            swsVar = new swv(a, a2, a3, a4, a5, tripDetailsContext);
        } else {
            swt swtVar = swzVar.a;
            dxio a6 = ((dxjh) swtVar.a).a();
            swt.a(a6, 1);
            tma a7 = swtVar.b.a();
            swt.a(a7, 2);
            Executor a8 = swtVar.c.a();
            swt.a(a8, 3);
            tgi a9 = swtVar.d.a();
            swt.a(a9, 4);
            swt.a(tripDetailsContext, 5);
            swsVar = new sws(a6, a7, a8, a9, tripDetailsContext);
        }
        this.ak = swsVar;
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i();
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        swy swyVar = this.ak;
        if (swyVar == null) {
            return dtxy.a;
        }
        dbsg<amve> l = swyVar.c().l();
        if (l != null && l.a()) {
            amve b = l.b();
            dqvj c = dqvj.c(b.b().b);
            if (c == null) {
                c = dqvj.DRIVE;
            }
            int ordinal = c.ordinal();
            if (ordinal == 0) {
                return dtxn.bi;
            }
            if (ordinal == 1) {
                return dtxn.I;
            }
            if (ordinal == 2) {
                return dtxn.en;
            }
            if (ordinal == 3) {
                return dtxn.dQ;
            }
            if (ordinal == 5) {
                return dtxn.ed;
            }
            if (ordinal != 7) {
                if (ordinal == 8) {
                    amsq b2 = amsr.b(b);
                    if (b2.equals(amsq.DOCKED_BIKESHARING)) {
                        return dtxn.aZ;
                    }
                    if (b2.equals(amsq.DOCKLESS_BIKESHARING)) {
                        return dtxn.u;
                    }
                }
            } else if (wuw.c(b)) {
                return dtxn.cT;
            } else {
                if (wuw.b(b)) {
                    return dtxn.cX;
                }
            }
        }
        return dtxy.a;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.au = new crzp(this) { // from class: svi
            private final svo a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                this.a.g(true);
            }
        };
        this.av = new crzp(this) { // from class: svj
            private final svo a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                this.a.g(true);
            }
        };
        this.ak.d();
        g(false);
        tfs tfsVar = new tfs(this.at);
        dbsg<tlv> l = this.ak.b().l();
        dbsk.s(l);
        dbsg<amve> l2 = this.ak.c().l();
        dbsk.s(l2);
        gga a = this.e.a.a();
        tfz.a(a);
        this.aq = new tfy(a);
        tfw tfwVar = this.f;
        sxb a2 = tfwVar.a.a();
        tfw.a(a2, 1);
        tfw.a(tfwVar.b.a(), 2);
        tfw.a(tfsVar, 3);
        tfw.a(l, 4);
        tfw.a(l2, 5);
        this.ai = new tfv(a2, tfsVar, l, l2);
        tfu tfuVar = this.g;
        swy swyVar = this.ak;
        szq a3 = tfuVar.a.a();
        tfu.a(a3, 1);
        svq a4 = tfuVar.b.a();
        tfu.a(a4, 2);
        tfu.a((Activity) ((dxjd) tfuVar.c).a, 3);
        tfu.a(tfuVar.d.a(), 4);
        tfu.a(tfsVar, 5);
        tfu.a(swyVar, 6);
        tfu.a(l, 7);
        tfu.a(l2, 8);
        this.aj = new tft(a3, a4, tfsVar, swyVar, l, l2);
        this.ar = new svm(this);
        crzm<dbsg<tlv>> b = this.ak.b();
        crzp<dbsg<tlv>> crzpVar = this.au;
        dbsk.s(crzpVar);
        b.a(crzpVar, this.a);
        crzm<dbsg<amve>> c = this.ak.c();
        crzp<dbsg<amve>> crzpVar2 = this.av;
        dbsk.s(crzpVar2);
        c.a(crzpVar2, this.a);
        if (this.as.c()) {
            this.af.d(new bzgf(this) { // from class: svk
                private final svo a;

                {
                    this.a = this;
                }

                @Override // defpackage.bzgf
                public final void a() {
                    tfv tfvVar = this.a.ai;
                    if (tfvVar != null) {
                        tfvVar.g();
                    }
                }
            }, this.as, this.a);
        }
        i();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putParcelable("trip_details_context", this.at);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ak.e();
        this.ad.d();
        this.ae.d();
        cqkf<tfr> cqkfVar = this.am;
        dbsk.s(cqkfVar);
        cqkfVar.f();
        cqkf<tfp> cqkfVar2 = this.an;
        dbsk.s(cqkfVar2);
        cqkfVar2.f();
        cqkf<tfq> cqkfVar3 = this.ap;
        dbsk.s(cqkfVar3);
        cqkfVar3.f();
        cqkf<tfo> cqkfVar4 = this.ao;
        dbsk.s(cqkfVar4);
        cqkfVar4.f();
        if (this.au != null) {
            crzm<dbsg<tlv>> b = this.ak.b();
            crzp<dbsg<tlv>> crzpVar = this.au;
            dbsk.s(crzpVar);
            b.c(crzpVar);
        }
        if (this.av != null) {
            crzm<dbsg<amve>> c = this.ak.c();
            crzp<dbsg<amve>> crzpVar2 = this.av;
            dbsk.s(crzpVar2);
            c.c(crzpVar2);
        }
        super.u();
    }
}
