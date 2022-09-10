package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ueg  reason: default package */
/* loaded from: classes7.dex */
public final class ueg extends ges implements ssr, uhp {
    public Executor a;
    public uhz ad;
    @dzsi
    public cqkf<uha> ae;
    @dzsi
    public cqkf<uhd> af;
    @dzsi
    public uhi ag;
    @dzsi
    public uhr ah;
    @dzsi
    public uhy ai;
    public boolean aj;
    @dzsi
    private cqkf<uhc> ak;
    @dzsi
    private crzp<dcdc<amvh>> al;
    @dzsi
    private crzp<ufb> am;
    public efg b;
    public cqkj c;
    public tkm d;
    public ufc e;
    public uhj f;
    public uhs g;

    private final void aJ() {
        if (this.al != null) {
            crzm<dcdc<amvh>> a = this.e.a();
            crzp<dcdc<amvh>> crzpVar = this.al;
            dbsk.s(crzpVar);
            a.c(crzpVar);
            this.al = null;
        }
        if (this.am != null) {
            crzm<ufb> b = this.e.b();
            crzp<ufb> crzpVar2 = this.am;
            dbsk.s(crzpVar2);
            b.c(crzpVar2);
            this.am = null;
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.ak = null;
        this.ae = null;
        this.af = null;
        super.Qe();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.ak = this.c.e(new ugp());
        this.ae = this.c.e(new ufk());
        this.af = this.c.e(new ugs());
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        this.e.e();
    }

    @Override // defpackage.ssr
    public final ssq b() {
        return ssq.WAYPOINT_EDITOR;
    }

    public final void g() {
        cqkf<uha> cqkfVar;
        if (!this.aD || D()) {
            return;
        }
        egf c = egf.c();
        egj egjVar = new egj(this);
        egjVar.w(null);
        egjVar.A(c);
        egjVar.K(jjn.COLLAPSED);
        egjVar.ar(false);
        egjVar.aq(cjmu.TRANSPARENT_BG_SATELLITE_ADAPTIVE_ICONS_DM_AWARE);
        egjVar.an();
        egjVar.ar(false);
        if (w()) {
            cqkf<uhd> cqkfVar2 = this.af;
            dbsk.s(cqkfVar2);
            uhy uhyVar = this.ai;
            dbsk.s(uhyVar);
            cqkfVar2.e(uhyVar);
            cqkf<uha> cqkfVar3 = this.ae;
            dbsk.s(cqkfVar3);
            cqkfVar3.f();
            cqkf<uhc> cqkfVar4 = this.ak;
            dbsk.s(cqkfVar4);
            cqkfVar4.f();
            cqkf<uhd> cqkfVar5 = this.af;
            dbsk.s(cqkfVar5);
            egjVar.ae((glg) cqkfVar5.c(), 2);
            egjVar.ag(null);
            egjVar.F(null);
        } else {
            cqkf<uhd> cqkfVar6 = this.af;
            dbsk.s(cqkfVar6);
            cqkfVar6.f();
            cqkf<uhc> cqkfVar7 = this.ak;
            if (cqkfVar7 != null) {
                uhr uhrVar = this.ah;
                dbsk.s(uhrVar);
                cqkfVar7.e(uhrVar);
                egjVar.G(this.ak.c(), 6);
            }
            uhi uhiVar = this.ag;
            if (uhiVar != null && (cqkfVar = this.ae) != null) {
                cqkfVar.e(uhiVar);
                cqkf<uha> cqkfVar8 = this.ae;
                dbsk.s(cqkfVar8);
                egjVar.az(cqkfVar8.c(), new Callable(this) { // from class: uef
                    private final ueg a;

                    {
                        this.a = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        View findViewById;
                        ueg uegVar = this.a;
                        cqkf cqkfVar9 = uegVar.w() ? uegVar.af : uegVar.ae;
                        View c2 = cqkfVar9 != null ? cqkfVar9.c() : null;
                        int i = 0;
                        if (c2 != null && (findViewById = c2.findViewById(R.id.edit_waypoints_error_layout)) != null) {
                            findViewById.measure(View.MeasureSpec.makeMeasureSpec(uegVar.Rn().getDisplayMetrics().widthPixels, 1073741824), 0);
                            i = findViewById.getMeasuredHeight();
                        }
                        return Integer.valueOf(i);
                    }
                });
                egjVar.ai(this.aj ? jjn.COLLAPSED : jjn.HIDDEN);
            }
        }
        this.b.a(egjVar.a());
    }

    public final void i() {
        aJ();
        this.e.d();
        J().onBackPressed();
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g();
    }

    public final void q(dcdc<Integer> dcdcVar) {
        cqkf cqkfVar = w() ? this.af : this.ak;
        View c = cqkfVar != null ? cqkfVar.c() : null;
        dbsg j = c == null ? dbpy.a : dbsg.j((RecyclerView) c.findViewById(R.id.edit_waypoints_list));
        if (j.a()) {
            if (!dcdcVar.isEmpty()) {
                ((RecyclerView) j.b()).n(((Integer) dcft.s(dcdcVar)).intValue());
                return;
            }
            abg abgVar = ((RecyclerView) j.b()).k;
            dbsk.s(abgVar);
            ((RecyclerView) j.b()).n(abgVar.c() - 1);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.d.c();
        uhs uhsVar = this.g;
        dcdc<amvh> l = this.e.a().l();
        dbsk.s(l);
        ufb l2 = this.e.b().l();
        dbsk.s(l2);
        Activity activity = (Activity) ((dxjd) uhsVar.a).a;
        boolean z = true;
        uhs.a(activity, 1);
        uhs.a(uhsVar.b.a(), 2);
        cpv a = uhsVar.c.a();
        uhs.a(a, 3);
        uhx a2 = uhsVar.d.a();
        uhs.a(a2, 4);
        ufc a3 = uhsVar.e.a();
        uhs.a(a3, 5);
        uhs.a(this, 6);
        uhs.a(l, 7);
        uhs.a(l2, 8);
        uhr uhrVar = new uhr(activity, a, a2, a3, this, l, l2);
        this.ah = uhrVar;
        uhz uhzVar = this.ad;
        dbsk.s(uhrVar);
        uhi uhiVar = this.ag;
        uhz.a(uhzVar.a.a(), 1);
        uhz.a(uhrVar, 2);
        this.ai = new uhy(uhrVar, uhiVar);
        ufb l3 = this.e.b().l();
        dbsk.s(l3);
        uhj uhjVar = this.f;
        Activity activity2 = (Activity) ((dxjd) uhjVar.a).a;
        uhj.a(activity2, 1);
        uhj.a(uhjVar.b.a(), 2);
        uhj.a(l3, 3);
        this.ag = new uhi(activity2, l3);
        if (!l3.e().a() && l3.c()) {
            z = false;
        }
        this.aj = z;
        this.al = new crzp(this) { // from class: ued
            private final ueg a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                ueg uegVar = this.a;
                if (uegVar.ah == null || !crzmVar.k()) {
                    return;
                }
                uhr uhrVar2 = uegVar.ah;
                dbsk.s(uhrVar2);
                dcdc<amvh> dcdcVar = (dcdc) crzmVar.l();
                dbsk.s(dcdcVar);
                uhrVar2.k(dcdcVar);
                uegVar.q(dcdc.e());
            }
        };
        crzm<dcdc<amvh>> a4 = this.e.a();
        crzp<dcdc<amvh>> crzpVar = this.al;
        dbsk.s(crzpVar);
        a4.a(crzpVar, this.a);
        this.am = new crzp(this) { // from class: uee
            private final ueg a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                dbsg dbsgVar;
                ueg uegVar = this.a;
                ufb ufbVar = (ufb) crzmVar.l();
                dbsk.s(ufbVar);
                ff J = uegVar.J();
                boolean z2 = false;
                if (ufbVar.f().a()) {
                    dbsgVar = dbsg.j(ufbVar.f().b().b(0, J));
                } else {
                    dbsgVar = dbpy.a;
                }
                if (dbsgVar.a()) {
                    tkm tkmVar = uegVar.d;
                    amub amubVar = (amub) dbsgVar.b();
                    tkh tkhVar = (tkh) tkmVar;
                    if (tkhVar.g) {
                        tkhVar.e();
                        qbo f = tkhVar.a.a().f();
                        if (f != null) {
                            vut I = vuv.I();
                            I.A(amuh.d(amubVar));
                            I.H(albq.a);
                            I.E(false);
                            I.o(amubVar.ag());
                            I.q(true);
                            I.D(true);
                            I.p(true);
                            I.x(false);
                            I.Q(alfa.SHOW_NONE);
                            I.J(true);
                            f.e(I.O());
                            dwaa dwaaVar = amubVar.b.b;
                            if (dwaaVar == null) {
                                dwaaVar = dwaa.g;
                            }
                            if ((dwaaVar.a & 64) != 0) {
                                cvt cvtVar = tkhVar.e;
                                dwaa dwaaVar2 = amubVar.b.b;
                                if (dwaaVar2 == null) {
                                    dwaaVar2 = dwaa.g;
                                }
                                djiq djiqVar = dwaaVar2.e;
                                if (djiqVar == null) {
                                    djiqVar = djiq.d;
                                }
                                cvtVar.a(djiqVar);
                            }
                        }
                    }
                } else {
                    uegVar.d.e();
                }
                if (ufbVar.e().a() || !ufbVar.c()) {
                    z2 = true;
                }
                uhr uhrVar2 = uegVar.ah;
                if (uhrVar2 != null) {
                    uhrVar2.j(ufbVar);
                    uegVar.q(ufbVar.a());
                }
                uhi uhiVar2 = uegVar.ag;
                if (uhiVar2 != null) {
                    uhiVar2.c(ufbVar);
                }
                uhy uhyVar = uegVar.ai;
                if (uhyVar != null) {
                    uhyVar.c(z2 ? uegVar.ag : null);
                }
                boolean z3 = uegVar.aj;
                uegVar.aj = z2;
                if (z3 != z2) {
                    uegVar.g();
                }
            }
        };
        crzm<ufb> b = this.e.b();
        crzp<ufb> crzpVar2 = this.am;
        dbsk.s(crzpVar2);
        b.d(crzpVar2, this.a);
        g();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        aJ();
        cqkf<uhc> cqkfVar = this.ak;
        dbsk.s(cqkfVar);
        cqkfVar.f();
        cqkf<uha> cqkfVar2 = this.ae;
        dbsk.s(cqkfVar2);
        cqkfVar2.f();
        cqkf<uhd> cqkfVar3 = this.af;
        dbsk.s(cqkfVar3);
        cqkfVar3.f();
        this.d.d();
    }

    public final boolean w() {
        return S() && Rn().getConfiguration().orientation == 2;
    }
}
