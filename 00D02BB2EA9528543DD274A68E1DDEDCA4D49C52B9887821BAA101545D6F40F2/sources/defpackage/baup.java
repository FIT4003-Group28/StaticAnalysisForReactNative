package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: baup  reason: default package */
/* loaded from: classes3.dex */
public final class baup extends ges {
    public btzc a;
    public bvbi aC;
    private baum aO;
    @dzsi
    private cqkf<bayq> aP;
    public axxh ad;
    public axxf ae;
    public bvrb af;
    public efg ag;
    public cqkj ah;
    public jmz ai;
    public axwi aj;
    public aedv ak;
    public cklq al;
    public bazf am;
    public dzsj<bbag> an;
    public dzsj<bbcj> ao;
    public dzsj<bbbv> ap;
    public bbco aq;
    boolean ar;
    cqkf<?> as;
    public baze at;
    public bbak au;
    public bbbk av;
    @dzsi
    public bbbv aw;
    @dzsi
    public bbag ax;
    @dzsi
    public bbcj ay;
    @dzsi
    cryz<Boolean> az;
    bbcn b;
    public cqhn c;
    public btvo d;
    public btrm e;
    public btpc f;
    public axwq g;
    public final Runnable aA = new bauf(this);
    final Runnable aB = new baui(this);
    private final hzz aQ = new bauj(this);

    public static baup g(int i, boolean z) {
        baup baupVar = new baup();
        Bundle bundle = new Bundle();
        bundle.putInt("arg_tab_index", i);
        bundle.putBoolean("arg_show_bottom_tab", z);
        baupVar.B(bundle);
        return baupVar;
    }

    public final boolean aJ() {
        return this.d.getPlaceSheetParameters().f() && this.d.getLocalFollowParameters().a;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        this.aP = this.ah.c(new bayd(), viewGroup);
        if (this.ar) {
            this.as = this.ak.d(viewGroup);
        }
        cqkf<bayq> cqkfVar = this.aP;
        dbsk.s(cqkfVar);
        return cqkfVar.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        bbag bbagVar;
        this.e.a(this.aO);
        if (aJ() && (bbagVar = this.ax) != null) {
            bbagVar.w();
        }
        super.am();
    }

    public final void i() {
        if (!this.f.i()) {
            this.af.b(new Runnable(this) { // from class: baub
                private final baup a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.q();
                }
            }, bvrj.BACKGROUND_THREADPOOL);
            return;
        }
        dehn<Boolean> e = this.g.e();
        bvqg bvqgVar = new bvqg(this) { // from class: bauc
            private final baup a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                final baup baupVar = this.a;
                if (((Boolean) obj).booleanValue()) {
                    baupVar.q();
                } else {
                    baupVar.af.b(new Runnable(baupVar) { // from class: baue
                        private final baup a;

                        {
                            this.a = baupVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            baup baupVar2 = this.a;
                            bvrj.UI_THREAD.c();
                            baupVar2.at.f(false, baupVar2.aA);
                            baupVar2.at.A(false);
                            cqkx.p(baupVar2.at);
                            bbcj bbcjVar = baupVar2.ay;
                            if (bbcjVar != null) {
                                bbcjVar.v(false, baupVar2.aA);
                                baupVar2.ay.A(false);
                                cqkx.p(baupVar2.ay);
                            }
                            bbag bbagVar = baupVar2.ax;
                            if (bbagVar != null) {
                                bbagVar.l(false, baupVar2.aA);
                                baupVar2.ax.A(false);
                                cqkx.p(baupVar2.ax);
                            }
                        }
                    }, bvrj.UI_THREAD);
                }
            }
        };
        Executor g = this.af.g(bvrj.BACKGROUND_THREADPOOL);
        dbsk.s(g);
        this.az = bvqj.d(e, bvqgVar, g);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = bundle == null ? this.o : bundle;
        bazf bazfVar = this.am;
        bauk baukVar = new bauk(this);
        gga a = bazfVar.a.a();
        bazf.a(a, 1);
        ahjq a2 = bazfVar.b.a();
        bazf.a(a2, 2);
        axwq a3 = bazfVar.c.a();
        bazf.a(a3, 3);
        bayv a4 = bazfVar.d.a();
        bazf.a(a4, 4);
        bayy a5 = bazfVar.e.a();
        bazf.a(a5, 5);
        bazx a6 = bazfVar.f.a();
        bazf.a(a6, 6);
        ania a7 = bazfVar.g.a();
        bazf.a(a7, 7);
        dxio a8 = ((dxjh) bazfVar.h).a();
        bazf.a(a8, 8);
        wgc a9 = bazfVar.i.a();
        bazf.a(a9, 9);
        bazf.a(bazfVar.j.a(), 10);
        bazf.a(baukVar, 11);
        baze bazeVar = new baze(a, a2, a3, a4, a5, a6, a7, a8, a9, baukVar);
        this.at = bazeVar;
        bazeVar.z(this.aB);
        bbcj a10 = this.ao.a();
        this.ay = a10;
        a10.z(this.aB);
        if (aJ()) {
            bbag a11 = this.an.a();
            this.ax = a11;
            a11.z(this.aB);
        }
        if (this.d.getEnableFeatureParameters().aa) {
            this.aw = this.ap.a();
        }
        i();
        this.ar = bundle2.getBoolean("arg_show_bottom_tab");
        bbco bbcoVar = this.aq;
        dccx F = dcdc.F();
        F.g(new bbcm(J().getString(R.string.YOUR_PLACES_LISTS_TAB_TITLE), dtyd.cR, J(), this.c, this.g));
        F.g(new bbcm(J().getString(R.string.YOUR_PLACES_NICKNAMED_PLACES), dtyd.cM, J(), this.c, this.g));
        F.g(new bbcm(J().getString(R.string.YOUR_PLACES_UPCOMING_TRIPS_RESERVATIONS), dtyd.dk, J(), this.c, this.g));
        if (this.ax != null) {
            F.g(new bbcm(J().getString(R.string.YOUR_PLACES_FOLLOWED_PLACES), dtyd.cN, J(), this.c, this.g));
        }
        if (this.aw != null) {
            F.g(new bbcm(J().getString(R.string.YOUR_PLACES_VISITED_PLACES), dtyd.dn, J(), this.c, this.g));
        }
        F.g(new bbcm(J().getString(R.string.YOUR_PLACES_MY_MAPS), dtyd.cP, J(), this.c, this.g));
        dcdc f = F.f();
        dccx dccxVar = new dccx();
        bbcj bbcjVar = this.ay;
        if (bbcjVar != null) {
            dccxVar.g(bbcjVar);
        }
        dccxVar.g(this.at);
        dccxVar.g(this.av);
        bbag bbagVar = this.ax;
        if (bbagVar != null) {
            dccxVar.g(bbagVar);
        }
        bbbv bbbvVar = this.aw;
        if (bbbvVar != null) {
            dccxVar.g(bbbvVar);
        }
        dccxVar.g(this.au);
        dcdc f2 = dccxVar.f();
        hzz hzzVar = this.aQ;
        boolean z = this.ar;
        acyp a12 = bbcoVar.a.a();
        bbco.a(a12, 1);
        gga a13 = bbcoVar.b.a();
        bbco.a(a13, 2);
        anhg a14 = bbcoVar.c.a();
        bbco.a(a14, 3);
        cqhn a15 = bbcoVar.d.a();
        bbco.a(a15, 4);
        cjqy a16 = bbcoVar.e.a();
        bbco.a(a16, 5);
        bbco.a(f, 6);
        bbco.a(f2, 7);
        bbco.a(hzzVar, 8);
        this.b = new bbcn(a12, a13, a14, a15, a16, f, f2, hzzVar, z);
        int i = bundle2.getInt("arg_tab_index");
        if (i > 0 && i < this.b.e().size()) {
            this.b.NP(i);
        }
        baum baumVar = new baum(this);
        this.aO = baumVar;
        btrm btrmVar = this.e;
        dceq a17 = dcet.a();
        a17.b(azrb.class, new bauq(0, azrb.class, baumVar, bvrj.UI_THREAD));
        a17.b(azrc.class, new bauq(1, azrc.class, baumVar, bvrj.UI_THREAD));
        a17.b(azqv.class, new bauq(2, azqv.class, baumVar, bvrj.UI_THREAD));
        a17.b(azrh.class, new bauq(3, azrh.class, baumVar, bvrj.UI_THREAD));
        a17.b(azrg.class, new bauq(4, azrg.class, baumVar, bvrj.UI_THREAD));
        a17.b(cjnw.class, new bauq(5, cjnw.class, baumVar, bvrj.UI_THREAD));
        btrmVar.g(baumVar, a17.a());
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyd.cy;
    }

    public final void q() {
        bbag bbagVar;
        final List list = (List) deha.s(this.g.m());
        final List<azvo> a = this.g.x().a();
        final List list2 = (List) deha.s(this.aj.f());
        if (aJ() && (bbagVar = this.ax) != null) {
            bbagVar.j();
        }
        this.af.b(new Runnable(this, list, a, list2) { // from class: baud
            private final baup a;
            private final List b;
            private final List c;
            private final List d;

            {
                this.a = this;
                this.b = list;
                this.c = a;
                this.d = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                baup baupVar = this.a;
                List<azva> list3 = this.b;
                List<azvo> list4 = this.c;
                List<baad> list5 = this.d;
                bvrj.UI_THREAD.c();
                if (baupVar.ar) {
                    baupVar.al.b();
                }
                baupVar.at.g(list3, list4);
                baupVar.at.e(true);
                baupVar.at.A(false);
                cqkx.p(baupVar.at);
                bbcj bbcjVar = baupVar.ay;
                if (bbcjVar != null) {
                    bbcjVar.u(true);
                    baupVar.ay.t(list5);
                    baupVar.ay.A(false);
                    cqkx.p(baupVar.ay);
                }
                if (baupVar.ar) {
                    baupVar.al.c(cklt.SAVED_PLACES_LIST);
                }
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        bbag bbagVar;
        cqkf<?> cqkfVar;
        super.s();
        cqkf<bayq> cqkfVar2 = this.aP;
        View c = cqkfVar2 == null ? null : cqkfVar2.c();
        egj egjVar = new egj(this);
        egjVar.w(c);
        egjVar.ag(null);
        egf a = egf.a();
        a.s = true;
        egjVar.A(a);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        if (this.ar && (cqkfVar = this.as) != null) {
            egjVar.av(cqkfVar.c());
        }
        egu a2 = egjVar.a();
        if (cqkfVar2 != null && c != null) {
            cqkfVar2.e(this.b);
            this.ag.a(a2);
            c.getViewTreeObserver().addOnPreDrawListener(new baul(this, c));
        }
        if (this.ar) {
            this.ak.b(this);
            this.ak.g(dktk.SAVED_LISTS);
        }
        if (aJ() && (bbagVar = this.ax) != null && bbagVar.s()) {
            this.ax.j();
        }
        bbbv bbbvVar = this.aw;
        if (bbbvVar != null) {
            bbbvVar.y();
            this.aw.g(true);
        }
        this.au.y();
        this.au.e(true);
        dwxm bZ = dwxn.e.bZ();
        dusl bZ2 = dusm.a.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dusm.c((dusm) bZ2.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwxn dwxnVar = (dwxn) bZ.b;
        dusm bK = bZ2.bK();
        bK.getClass();
        dwxnVar.c = bK;
        dwxnVar.a |= 16;
        dvpi bZ3 = dvpj.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dvpj dvpjVar = (dvpj) bZ3.b;
        dvpjVar.a = 1 | dvpjVar.a;
        dvpjVar.b = 20;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwxn dwxnVar2 = (dwxn) bZ.b;
        dvpj bK2 = bZ3.bK();
        bK2.getClass();
        dwxnVar2.d = bK2;
        dwxnVar2.a |= 32;
        if (this.aw != null) {
            dwww bZ4 = dwwx.c.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dwwx.c((dwwx) bZ4.b);
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dwwx.e((dwwx) bZ4.b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwxn dwxnVar3 = (dwxn) bZ.b;
            dwwx bK3 = bZ4.bK();
            bK3.getClass();
            dwxnVar3.b = bK3;
            dwxnVar3.a |= 8;
        }
        btzc btzcVar = this.a;
        if (btzcVar != null) {
            btzcVar.a();
        }
        this.a = this.aC.a(bZ.bK(), new bauo(this), bvrj.UI_THREAD);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putInt("arg_tab_index", this.b.b().intValue());
        bundle.putBoolean("arg_show_bottom_tab", this.ar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        cqkf<bayq> cqkfVar = this.aP;
        if (cqkfVar != null) {
            View w = w(cqkfVar.c());
            if (w != null) {
                this.ai.a(w);
            }
            cqkfVar.e(null);
        }
        btzc btzcVar = this.a;
        if (btzcVar != null) {
            btzcVar.a();
        }
        if (this.ar) {
            this.ak.c(this);
        }
        this.ad.g();
        cryz<Boolean> cryzVar = this.az;
        if (cryzVar != null) {
            cryzVar.c();
        }
        super.u();
    }

    @dzsi
    public final View w(View view) {
        if (view != null) {
            ArrayList arrayList = new ArrayList();
            cqkx.f(view, jkn.n, arrayList);
            bayl baylVar = this.b.f().get(this.b.b().intValue());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                View view2 = (View) arrayList.get(i);
                i++;
                if (cqkx.i(view2) == baylVar) {
                    return view2;
                }
            }
            return null;
        }
        return null;
    }
}
