package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.directions.framework.details.AutoValue_TripDetailsContext;
import com.google.android.apps.gmm.directions.framework.details.TripDetailsContext;
import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ssu  reason: default package */
/* loaded from: classes7.dex */
public final class ssu extends gew implements dxiw, tmw, suv, sux, suy {
    public static final dcqe c = dcqe.c("ssu");
    public tgi ad;
    public tnv ae;
    public udl af;
    public gfq ag;
    public tkm ah;
    public ufc ai;
    public ueq aj;
    public udk ak;
    public Executor al;
    public ssx am;
    @dzsi
    public sso an;
    public dbsg<qcz> ao = dbpy.a;
    public boolean ap = false;
    public udh aq;
    @dzsi
    private cryz<tgh> ar;
    public dxiu<Object> d;
    public tib e;
    public ssp f;
    public ufg g;

    private final void aU(amve amveVar) {
        dqvj c2;
        if (new vxg(amveVar).a()) {
            c2 = dqvj.MIXED;
        } else {
            c2 = dqvj.c(amveVar.b().b);
            if (c2 == null) {
                c2 = dqvj.DRIVE;
            }
        }
        if (c2 != null) {
            this.ae.b(c2);
        }
    }

    @Override // defpackage.dxiw
    public final dxis<Object> NK() {
        return this.d;
    }

    @Override // defpackage.gew
    public final void Qm() {
        if (this.aD) {
            this.ah.f();
        }
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof wtf) {
            q((wtf) obj);
        } else if (obj instanceof bnpg) {
            sso ssoVar = this.an;
            if (ssoVar == null || !ssoVar.h(ssq.WAYPOINT_EDITOR)) {
                bnpg bnpgVar = (bnpg) obj;
                ((uer) this.g).f().d(bnpgVar.c(), bnpgVar.b(), bnpgVar.a().b().intValue(), true);
                return;
            }
            this.ai.j((bnpg) obj);
        } else if (!(obj instanceof qeh)) {
        } else {
            sso ssoVar2 = this.an;
            if (ssoVar2 != null && ssoVar2.h(ssq.WAYPOINT_EDITOR)) {
                udh udhVar = this.aq;
                udhVar.c.b(false);
                ufc ufcVar = udhVar.b;
                amvh a = ((qeh) obj).a();
                amsz b = udhVar.c.a().b();
                dbsk.s(b);
                ufcVar.k(a, b.c);
            } else {
                udh udhVar2 = this.aq;
                udhVar2.c.b(false);
                ufg ufgVar = udhVar2.a;
                amvh a2 = ((qeh) obj).a();
                amsz b2 = udhVar2.c.a().b();
                dbsk.s(b2);
                ufgVar.e(a2, b2.c);
            }
            gfq.k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ff  */
    @Override // defpackage.suy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aJ(defpackage.dcdc<defpackage.amvh> r13, int r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssu.aJ(dcdc, int):void");
    }

    @Override // defpackage.sux
    public final void aR(tlv tlvVar) {
        if (tlvVar.p().a()) {
            amve b = tlvVar.p().b();
            dbsk.s(b);
            aU(b);
        }
        if (this.an != null) {
            TripDetailsContext e = TripDetailsContext.e(tlvVar, dbpy.a, dbpy.a);
            sso ssoVar = this.an;
            dbsk.s(ssoVar);
            ssoVar.f(e);
        }
    }

    @Override // defpackage.sux
    public final void aS(tlv tlvVar, amve amveVar) {
        aU(amveVar);
        if (this.an != null) {
            TripDetailsContext e = TripDetailsContext.e(tlvVar, dbsg.i(amveVar), dbpy.a);
            sso ssoVar = this.an;
            dbsk.s(ssoVar);
            ssoVar.f(e);
        }
    }

    @Override // defpackage.sux
    public final void aT(tlv tlvVar, wuv wuvVar) {
        this.ae.b(dqvj.TAXI);
        if (this.an != null) {
            AutoValue_TripDetailsContext autoValue_TripDetailsContext = new AutoValue_TripDetailsContext(true, dbpy.a, dbpy.a, dbsg.i(TripDetailsContext.TaxiTripDetailsContext.c(tlvVar.e(), wuvVar.s())));
            sso ssoVar = this.an;
            dbsk.s(ssoVar);
            ssoVar.f(autoValue_TripDetailsContext);
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        return new View(layoutInflater.getContext());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        btlu btluVar;
        super.ak();
        ude udeVar = (ude) this.af;
        if (udeVar.c.b.b) {
            if (udeVar.i.j() != null) {
                btluVar = udeVar.i.j();
            } else {
                btluVar = btlu.b;
            }
            udeVar.g.d(btluVar);
            udeVar.h.c(btluVar);
            udeVar.c.b(false);
        }
        this.ak.d(false);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.an = null;
        super.am();
    }

    @Override // defpackage.tmw
    public final void bX(dcdc<amvh> dcdcVar, dwao dwaoVar) {
        sso ssoVar = this.an;
        if (ssoVar != null) {
            dbsg<uig> d = ssoVar.d();
            if (!d.a()) {
                return;
            }
            d.b();
        }
    }

    @Override // defpackage.nxd
    @dzsi
    public final nxe d(dthb dthbVar) {
        sso ssoVar = this.an;
        if (ssoVar != null) {
            dbsg<uig> d = ssoVar.d();
            if (!d.a()) {
                return null;
            }
            return d.b().e.a().g(dthbVar);
        }
        return null;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        sso ssoVar = this.an;
        if (ssoVar == null || ssoVar.c.j() <= 1) {
            return false;
        }
        ssoVar.c.f();
        return true;
    }

    @Override // defpackage.suv
    public final void i(boolean z) {
        sso ssoVar = this.an;
        if (ssoVar != null) {
            ssoVar.e(z);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle != null) {
            this.ao = dbpy.a;
            this.e.g(bundle);
            this.ad.c(bundle);
            ((uer) this.g).f().a(bundle);
            this.ai.o(bundle);
            ucy ucyVar = ((ude) this.af).c.b;
            if (bundle.containsKey("SearchContextStore.searchContext")) {
                ucyVar.a = (amsz) bundle.getSerializable("SearchContextStore.searchContext");
            }
            ucyVar.b = bundle.getBoolean("SearchContextStore.hasPendingSearchQuery", false);
            ucyVar.c = bundle.getBoolean("SearchContextStore.hasPendingSearchAlongRoute", false);
        }
        ssp sspVar = this.f;
        gn R = R();
        tgi a = sspVar.a.a();
        ssp.a(a, 1);
        ssp.a(sspVar.b.a(), 2);
        Executor a2 = sspVar.c.a();
        ssp.a(a2, 3);
        ufg a3 = sspVar.d.a();
        ssp.a(a3, 4);
        ssp.a(R, 5);
        this.an = new sso(a, a2, a3, R);
    }

    @Override // defpackage.tmw
    public final void q(wtf wtfVar) {
        dbsg<Integer> h;
        cryz<tgh> cryzVar = this.ar;
        if (cryzVar == null || !cryzVar.d()) {
            this.ap = true;
        }
        this.ak.d(true);
        sso ssoVar = this.an;
        if (ssoVar == null || !ssoVar.h(ssq.WAYPOINT_EDITOR)) {
            ufg ufgVar = this.g;
            if (wtfVar.a().a()) {
                h = wtfVar.a();
            } else {
                h = ((uer) ufgVar).f().h();
            }
            if (!h.a()) {
                bvoo.h("Received a WaypointUpdate with an absent waypointIndex while there were no empty waypoints in the current waypoints store.", new Object[0]);
                return;
            } else {
                ((uer) ufgVar).f().d(wtfVar.b(), wtfVar.c(), h.b().intValue(), true);
                return;
            }
        }
        this.ai.i(wtfVar);
    }

    @Override // defpackage.gew, defpackage.ges, defpackage.fd
    public final void s() {
        ssw d;
        super.s();
        if (this.ao.a()) {
            d = (ssw) this.ao.b().Op(this.am);
        } else {
            d = ssw.d();
        }
        this.ao = dbpy.a;
        final sso ssoVar = this.an;
        if (ssoVar != null) {
            ssoVar.e = new crzp(ssoVar) { // from class: ssj
                private final sso a;

                {
                    this.a = ssoVar;
                }

                @Override // defpackage.crzp
                public final void On(final crzm crzmVar) {
                    final sso ssoVar2 = this.a;
                    ssoVar2.a.execute(new Runnable(ssoVar2, crzmVar) { // from class: ssl
                        private final sso a;
                        private final crzm b;

                        {
                            this.a = ssoVar2;
                            this.b = crzmVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            sso ssoVar3 = this.a;
                            crzm crzmVar2 = this.b;
                            if (!ssoVar3.c.J() && ssoVar3.h(ssq.ZERO_STATE)) {
                                dbsg j = dbsg.j((FetchState) crzmVar2.l());
                                if (!j.a() || ((FetchState) j.b()).a().a().equals(tgk.NOT_STARTED)) {
                                    return;
                                }
                                ssoVar3.g();
                                ssoVar3.a();
                            }
                        }
                    });
                }
            };
            crzm<FetchState> a = ssoVar.b.a();
            crzp<FetchState> crzpVar = ssoVar.e;
            dbsk.s(crzpVar);
            a.d(crzpVar, ssoVar.a);
            ssoVar.f = new crzp(ssoVar) { // from class: ssk
                private final sso a;

                {
                    this.a = ssoVar;
                }

                @Override // defpackage.crzp
                public final void On(final crzm crzmVar) {
                    final sso ssoVar2 = this.a;
                    ssoVar2.a.execute(new Runnable(ssoVar2, crzmVar) { // from class: ssm
                        private final sso a;
                        private final crzm b;

                        {
                            this.a = ssoVar2;
                            this.b = crzmVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            sso ssoVar3 = this.a;
                            crzm crzmVar2 = this.b;
                            if (!ssoVar3.c.J() && !ssoVar3.h(ssq.ZERO_STATE)) {
                                uff uffVar = (uff) crzmVar2.l();
                                dbsk.s(uffVar);
                                dcdc<amvh> a2 = uffVar.a();
                                if (a2.size() >= 2 && ufe.a(a2)) {
                                    return;
                                }
                                ssoVar3.g();
                                ssoVar3.b();
                            }
                        }
                    });
                }
            };
            crzm<uff> a2 = ssoVar.d.a();
            crzp<uff> crzpVar2 = ssoVar.f;
            dbsk.s(crzpVar2);
            a2.d(crzpVar2, ssoVar.a);
            if (!ssoVar.i().a()) {
                ssq ssqVar = ssq.ZERO_STATE;
                int ordinal = d.a().ordinal();
                if (ordinal == 0) {
                    ssoVar.b();
                } else if (ordinal == 1) {
                    ssoVar.a();
                } else if (ordinal == 2) {
                    ssoVar.e(false);
                } else if (ordinal == 3) {
                    ssoVar.f(TripDetailsContext.e(d.b().b(), dbpy.a, dbpy.a));
                } else if (ordinal == 4) {
                    ssoVar.c();
                }
            }
        }
        this.e.d();
        this.ar = new cryz<>(new sst(this));
        dehn<tgh> c2 = d.c();
        cryz<tgh> cryzVar = this.ar;
        dbsk.s(cryzVar);
        deha.q(c2, cryzVar, this.al);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.e.f(bundle);
        ((uer) this.g).f().b(bundle);
        this.ai.p(bundle);
        this.ad.b(bundle);
        ucy ucyVar = ((ude) this.af).c.b;
        amsz amszVar = ucyVar.a;
        if (amszVar != null) {
            bundle.putSerializable("SearchContextStore.searchContext", amszVar);
        }
        bundle.putBoolean("SearchContextStore.hasPendingSearchQuery", ucyVar.b);
        bundle.putBoolean("SearchContextStore.hasPendingSearchAlongRoute", ucyVar.c);
    }

    @Override // defpackage.gew, defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        sso ssoVar = this.an;
        if (ssoVar != null) {
            if (ssoVar.e != null) {
                crzm<FetchState> a = ssoVar.b.a();
                crzp<FetchState> crzpVar = ssoVar.e;
                dbsk.s(crzpVar);
                a.c(crzpVar);
                ssoVar.e = null;
            }
            if (ssoVar.f != null) {
                crzm<uff> a2 = ssoVar.d.a();
                crzp<uff> crzpVar2 = ssoVar.f;
                dbsk.s(crzpVar2);
                a2.c(crzpVar2);
                ssoVar.f = null;
            }
        }
        this.ap = false;
        cryz<tgh> cryzVar = this.ar;
        if (cryzVar != null) {
            if (cryzVar.d()) {
                this.ad.e();
            }
            cryz<tgh> cryzVar2 = this.ar;
            dbsk.s(cryzVar2);
            cryzVar2.c();
            this.ar = null;
        }
        this.e.e();
    }

    @Override // defpackage.suy
    public final void w(dbsg<amvh> dbsgVar) {
        if (this.an != null) {
            this.ai.c();
            if (dbsgVar.a()) {
                this.ai.f(dbsgVar.b());
            }
            sso ssoVar = this.an;
            dbsk.s(ssoVar);
            ssoVar.c();
        }
    }
}
