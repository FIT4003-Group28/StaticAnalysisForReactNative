package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ascu  reason: default package */
/* loaded from: classes2.dex */
public final class ascu extends ges implements bwrr<ilo> {
    public dxio<qbt> aA;
    public dxio<hwd> aB;
    public dxio<araj> aC;
    public dxio<ascb> aO;
    public dxio<awre> aP;
    public dxio<begg> aQ;
    public dxio<ckqr> aR;
    public dxio<bwsh> aS;
    public akpm aT;
    public gll aU;
    public crfm aV;
    public awti aW;
    public hwe aX;
    public ckmm aY;
    public vzg aZ;
    public bwrs<ilo> ad;
    @dzsi
    public Long aj;
    public Boolean ak;
    @dzsi
    public String al;
    public gek am;
    @dzsi
    public awtn an;
    public cpv ao;
    public bvnx ap;
    public asac aq;
    public ckcw ar;
    public btvo as;
    public cqat at;
    public cqhn au;
    public asdc av;
    public gfq aw;
    public btrm ax;
    public bvjj ay;
    public bwqv az;
    public asdb b;
    public jkf ba;
    public bvrb bb;
    public efg bc;
    public cqkj bd;
    private asuu bp;
    @dzsi
    private cqkf<asha> bq;
    private cqkf<asha> br;
    private cqkf<asuu> bs;
    private long bu;
    public cqkf<asha> c;
    public boolean d;
    public ddom e;
    public amte f;
    @dzsi
    public amte g;
    private static final dcqe bf = dcqe.c("ascu");
    private static final String bg = String.valueOf(ascu.class.getCanonicalName()).concat(".DIRECTIONS_STORAGE_ITEM_BUNDLE_KEY");
    private static final String bh = String.valueOf(ascu.class.getCanonicalName()).concat(".SHOULD_SHOW_RESUME_NAVIGATION_NOTIFICATION_BUNDLE_KEY");
    private static final String bi = String.valueOf(ascu.class.getCanonicalName()).concat(".ARRIVED_AT_PLACEMARK_REF_BUNDLE_KEY");
    private static final String bj = String.valueOf(ascu.class.getCanonicalName()).concat(".SHOULD_SAVE_PARKING_LOCATION_BUNDLE_KEY");
    private static final String bk = String.valueOf(ascu.class.getCanonicalName()).concat(".USER_MOVED_PARKING_LOCATION_BUNDLE_KEY");
    private static final String bl = String.valueOf(ascu.class.getCanonicalName()).concat(".OPT_SESSION_ID_BUNDLE_KEY");
    private static final String bm = String.valueOf(ascu.class.getCanonicalName()).concat(".IS_PERSONAL_LOGGING_MODE_BUNDLE_KEY");
    private static final String bn = String.valueOf(ascu.class.getCanonicalName()).concat(".INITIAL_ROUTE_EI_BUNDLE_KEY");
    private static final String bo = String.valueOf(ascu.class.getCanonicalName()).concat(".TOTAL_FOREGROUND_TIME_MS_BUNDLE_KEY");
    static final long a = TimeUnit.MINUTES.toMillis(6);
    public boolean ae = false;
    public boolean af = false;
    public boolean ag = false;
    public boolean ah = false;
    private long bt = 0;
    private int bv = -1;
    public boolean ai = false;
    final View.OnClickListener be = new ascl(this);
    private final jkh bw = new ascm(this);

    public ascu() {
        new ascn(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ges
    public final void Oo(View view) {
        this.ao.f(view, this.b.c());
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi ilo iloVar) {
        ilo iloVar2 = iloVar;
        asdb asdbVar = this.b;
        if (asdbVar == null || iloVar2 == null || !this.aD) {
            return;
        }
        asdbVar.x(iloVar2);
        i();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof aneh) {
            awtn k = awtn.l(((aneh) obj).a(), this.at.b()).k();
            this.af = true;
            this.ag = true;
            this.b.E(true);
            this.b.F(true);
            this.aP.a().i(k);
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.c = this.bd.c(new asgx(), null);
        this.bq = this.bd.c(new asdu(), null);
        this.br = this.bd.c(asgx.e(), null);
        this.bs = this.bd.c(new asra(), null);
        return this.c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        if (!this.aq.a || ((crgt) this.aV).b == null) {
            return;
        }
        this.aV.d(true);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        if (this.u) {
            ((ckcp) this.ar.a(ckhi.aS)).a(this.bt);
        }
        bwqv.t(this.ad, this);
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        this.aZ.a();
        return false;
    }

    public final void g(akqq akqqVar) {
        akpm akpmVar = this.aT;
        akpmVar.r(new asdh(akpmVar.k(), this.ap, J().getResources(), this.aU, this.aC.a().m(), akra.e(akqqVar.a, akqqVar.b)));
    }

    public final void i() {
        this.bv = Rn().getConfiguration().orientation;
        egj egjVar = new egj(this);
        View w = w();
        dbsk.s(w);
        egjVar.aw(w, false);
        egjVar.e(this);
        if (this.ai) {
            egjVar.ag(null);
            egjVar.w(null);
            egjVar.av(null);
            egjVar.k(false);
            egjVar.l(this.bs.c(), true);
        } else {
            egjVar.w(null);
            if (this.bv == 1) {
                egjVar.az(this.P, new Callable(this) { // from class: asci
                    private final ascu a;

                    {
                        this.a = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ascu ascuVar = this.a;
                        View c = ascuVar.c.c();
                        dbsk.s(c);
                        int i = 0;
                        if (ascuVar.b.e().booleanValue()) {
                            View findViewById = c.findViewById(R.id.arrival_dashboard_home_work_view);
                            if (findViewById != null) {
                                i = findViewById.getMeasuredHeight();
                            }
                        } else {
                            int a2 = jmj.a(ascuVar.J(), 24);
                            View findViewById2 = c.findViewById(R.id.arrival_dashboard_collapsed_view);
                            int measuredHeight = findViewById2 == null ? 0 : findViewById2.getMeasuredHeight();
                            View w2 = ascuVar.w();
                            dbsk.s(w2);
                            int measuredHeight2 = a2 + measuredHeight + w2.getMeasuredHeight();
                            View c2 = ascuVar.c.c();
                            dbsk.s(c2);
                            View findViewById3 = c2.findViewById(R.id.arrival_dashboard_street_view_thumbnail);
                            if (findViewById3 != null) {
                                i = findViewById3.getMeasuredHeight();
                            }
                            i += measuredHeight2;
                        }
                        return Integer.valueOf(i);
                    }
                });
                egjVar.an();
                egjVar.ai(this.am.a(jjn.COLLAPSED));
                egjVar.t(this.bw);
                egjVar.am(new Callable(this) { // from class: ascj
                    private final ascu a;

                    {
                        this.a = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ascu ascuVar = this.a;
                        View w2 = ascuVar.w();
                        dbsk.s(w2);
                        return Integer.valueOf(w2.getMeasuredHeight() + jmj.a(ascuVar.J(), 52));
                    }
                });
                egjVar.T(jkc.e);
                if (this.b.e().booleanValue()) {
                    egjVar.T(jkc.h);
                }
            } else {
                egjVar.ag(null);
                egjVar.ax((glg) this.br.c());
            }
        }
        egf a2 = egf.a();
        a2.a = this.ae;
        a2.t = true;
        a2.h = ardz.NAVIGATION;
        a2.x = false;
        egjVar.A(a2);
        this.bc.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        amte amteVar;
        super.l(bundle);
        dowa dowaVar = null;
        if (bundle != null) {
            this.d = false;
            ddom ddomVar = (ddom) bvrs.e(bundle, ddom.class, (dssr) ddom.aj.cu(7));
            if (ddomVar != null) {
                this.e = ddomVar;
            }
            String str = bg;
            if (bundle.containsKey(str)) {
                amte amteVar2 = (amte) bundle.getSerializable(str);
                this.f = amteVar2;
                if (amteVar2 != null && amteVar2.h()) {
                    this.g = yyt.a(this.f);
                }
            }
            String str2 = bh;
            if (bundle.containsKey(str2)) {
                this.d = bundle.getBoolean(str2);
            }
            String str3 = bi;
            if (bundle.containsKey(str3)) {
                try {
                    this.ad = this.az.e(ilo.class, bundle, str3);
                } catch (IOException e) {
                    bvoo.j(e);
                    this.ad = null;
                }
            }
            String str4 = bj;
            if (bundle.containsKey(str4)) {
                this.af = bundle.getBoolean(str4);
            }
            String str5 = bk;
            if (bundle.containsKey(str5)) {
                this.ag = bundle.getBoolean(str5);
            }
            awtr awtrVar = (awtr) bvrs.e(bundle, awtr.class, (dssr) awtr.l.cu(7));
            if (awtrVar != null) {
                this.an = awtn.m(awtrVar).k();
            }
            String str6 = bl;
            if (bundle.containsKey(str6)) {
                this.aj = Long.valueOf(bundle.getLong(str6));
            }
            String str7 = bm;
            if (bundle.containsKey(str7)) {
                this.ak = Boolean.valueOf(bundle.getBoolean(str7));
            }
            String str8 = bn;
            if (bundle.containsKey(str8)) {
                this.al = bundle.getString(str8);
            }
            String str9 = bo;
            if (bundle.containsKey(str9)) {
                this.bt = bundle.getLong(str9);
            }
        } else {
            this.aW.b().Pk(new Runnable(this) { // from class: ascd
                private final ascu a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ascu ascuVar = this.a;
                    ascuVar.an = ascuVar.aW.f();
                }
            }, this.bb.h());
        }
        if (this.e == null || (amteVar = this.f) == null || ((amteVar.h() && this.g == null) || this.ad == null)) {
            bvoo.h("Either our Bundle was corrupted or we were not initialised.", new Object[0]);
            return;
        }
        this.aB.a().j();
        this.az.f(this.ad, this, false);
        dnqg bZ = dnqh.p.bZ();
        int i = ddda.dq.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        this.aQ.a().D(this.ad, bZ.bK());
        this.am = new gek(J(), this, this.ba);
        boolean z = this.as.getNavigationParameters().a.be;
        amte amteVar3 = this.f;
        amub b = amteVar3.b(amteVar3.i, J());
        amte amteVar4 = this.g;
        amub b2 = amteVar4 != null ? amteVar4.b(amteVar4.i, J()) : null;
        ilo iloVar = (ilo) dbsg.j(this.ad.c()).c(new ily().d());
        asdc asdcVar = this.av;
        asct asctVar = new asct(this);
        ddom ddomVar2 = this.e;
        if (b != null) {
            dowaVar = b.I;
        }
        dowa dowaVar2 = dowaVar;
        amvh f = this.f.f();
        boolean z2 = this.af;
        boolean z3 = this.ag;
        View.OnClickListener onClickListener = this.be;
        Long l = this.aj;
        Boolean bool = this.ak;
        String str10 = this.al;
        cqhn cqhnVar = this.au;
        asdc.a(asctVar, 1);
        asdc.a(ddomVar2, 2);
        asdc.a(f, 5);
        asdc.a(iloVar, 6);
        asdc.a(onClickListener, 9);
        asdc.a(bool, 11);
        asdc.a(cqhnVar, 14);
        btvo a2 = asdcVar.a.a();
        asdc.a(a2, 15);
        bvsl a3 = asdcVar.b.a();
        asdc.a(a3, 16);
        ahjq a4 = asdcVar.c.a();
        asdc.a(a4, 17);
        bvjj a5 = asdcVar.d.a();
        asdc.a(a5, 18);
        Resources a6 = asdcVar.e.a();
        asdc.a(a6, 19);
        amfi a7 = asdcVar.f.a();
        asdc.a(a7, 20);
        cqat a8 = asdcVar.g.a();
        asdc.a(a8, 21);
        brwl a9 = asdcVar.h.a();
        asdc.a(a9, 22);
        bnjv a10 = asdcVar.i.a();
        asdc.a(a10, 23);
        asdc.a(asdcVar.j.a(), 24);
        vwv a11 = asdcVar.k.a();
        asdc.a(a11, 25);
        cfpe a12 = asdcVar.l.a();
        asdc.a(a12, 26);
        bxbe a13 = asdcVar.m.a();
        asdc.a(a13, 27);
        dxio a14 = ((dxjh) asdcVar.n).a();
        asdc.a(a14, 28);
        asac a15 = asdcVar.o.a();
        asdc.a(a15, 29);
        this.b = new asdb(asctVar, ddomVar2, dowaVar2, b2, f, iloVar, z2, z3, onClickListener, l, bool, str10, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15);
        this.bp = new asud(J().getResources(), new Runnable(this) { // from class: asce
            private final ascu a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ascu ascuVar = this.a;
                ascuVar.ai = false;
                ascuVar.i();
                bwrs<ilo> bwrsVar = ascuVar.ad;
                if (bwrsVar == null || bwrsVar.c() == null) {
                    return;
                }
                ilo c = ascuVar.ad.c();
                dbsk.s(c);
                akqq aj = c.aj();
                dbsk.s(aj);
                ascuVar.g(aj);
            }
        }, dtxw.T);
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.bv != Rn().getConfiguration().orientation) {
            i();
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxw.R;
    }

    public final void q(final amte amteVar) {
        this.aZ.a();
        final gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        final ascb a2 = this.aO.a();
        this.bb.b(new Runnable(this, ggaVar, a2, amteVar) { // from class: asck
            private final ascu a;
            private final gga b;
            private final ascb c;
            private final amte d;

            {
                this.a = this;
                this.b = ggaVar;
                this.c = a2;
                this.d = amteVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ascu ascuVar = this.a;
                gga ggaVar2 = this.b;
                ascb ascbVar = this.c;
                amte amteVar2 = this.d;
                if (ascuVar.ah) {
                    gfq.m(ascuVar);
                } else {
                    ggaVar2.w();
                }
                ascbVar.a(amteVar2, amteVar2.i, asca.ARRIVAL_DASHBOARD, ascuVar.ah);
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.bu = this.at.e();
        this.aR.a().a(new ckqz(this) { // from class: ascf
            private final ascu a;

            {
                this.a = this;
            }

            @Override // defpackage.ckqz
            public final boolean a() {
                ascu ascuVar = this.a;
                if (!ascuVar.aD || ascuVar.b == null || !ascuVar.bg() || !ascuVar.b.N().booleanValue()) {
                    return false;
                }
                ascuVar.b.q();
                return true;
            }
        });
        btrm btrmVar = this.ax;
        dceq a2 = dcet.a();
        a2.b(alhl.class, new ascv(alhl.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a2.a());
        asdb asdbVar = this.b;
        if (asdbVar != null) {
            this.c.e(asdbVar);
            cqkf<asha> cqkfVar = this.bq;
            dbsk.s(cqkfVar);
            cqkfVar.e(this.b);
            this.br.e(this.b);
            this.bs.e(this.bp);
            i();
            if (this.aq.a) {
                bvrb bvrbVar = this.bb;
                Runnable runnable = new Runnable(this) { // from class: ascg
                    private final ascu a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ascu ascuVar = this.a;
                        if (!ascuVar.aD || ((crgt) ascuVar.aV).b == null) {
                            return;
                        }
                        ascuVar.aV.d(true);
                    }
                };
                bvrj bvrjVar = bvrj.UI_THREAD;
                long j = a;
                bvrbVar.a(runnable, bvrjVar, j);
                if (this.ae) {
                    this.bb.a(new Runnable(this) { // from class: asch
                        private final ascu a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ascu ascuVar = this.a;
                            if (!ascuVar.ae || !ascuVar.aD) {
                                return;
                            }
                            ascuVar.ae = false;
                            ascuVar.i();
                        }
                    }, bvrj.UI_THREAD, j);
                }
            }
            if (this.d) {
                this.d = false;
                vzg vzgVar = this.aZ;
                amte amteVar = this.g;
                dbsk.s(amteVar);
                amte amteVar2 = this.g;
                dbsk.s(amteVar2);
                int i = amteVar2.i;
                amte amteVar3 = this.g;
                dbsk.s(amteVar3);
                String r = amteVar3.f().r(J().getResources(), true);
                String z = vyb.z(J().getResources(), amteVar3.a.m(amteVar3.a.o()));
                String str = true != z.isEmpty() ? "  •  " : "";
                StringBuilder sb = new StringBuilder(String.valueOf(r).length() + str.length() + String.valueOf(z).length());
                sb.append(r);
                sb.append(str);
                sb.append(z);
                vzgVar.b(amteVar, i, sb.toString());
            }
        } else {
            gga ggaVar = this.aE;
            dbsk.s(ggaVar);
            ggaVar.w();
        }
        this.aY.e(cwsv.a("NavigationArrivalEvent"));
        bwrs<ilo> bwrsVar = this.ad;
        if (bwrsVar == null || bwrsVar.c() == null) {
            return;
        }
        ilo c = this.ad.c();
        dbsk.s(c);
        akqq aj = c.aj();
        dbsk.s(aj);
        akpp m = akpp.m(aj, akps.NORMAL);
        this.aX.c();
        this.aX.i(m, true);
        this.aC.a().m().f().C(0.65f);
        g(aj);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bvrs.l(bundle, this.e);
        bundle.putSerializable(bg, this.f);
        bundle.putBoolean(bh, this.d);
        bundle.putBoolean(bj, this.af);
        bundle.putBoolean(bk, this.ag);
        bundle.putLong(bo, this.bt);
        awtn awtnVar = this.an;
        if (awtnVar != null) {
            bvrs.l(bundle, awtnVar.n());
        }
        Long l = this.aj;
        if (l != null) {
            bundle.putLong(bl, l.longValue());
        }
        bundle.putBoolean(bm, this.ak.booleanValue());
        String str = this.al;
        if (str != null) {
            bundle.putString(bn, str);
        }
        this.az.c(bundle, bi, this.ad);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.bt += this.at.e() - this.bu;
        this.ax.a(this);
        if (this.ae) {
            this.ae = false;
            J().getWindow().clearFlags(4718720);
        }
        this.c.e(null);
        cqkf<asha> cqkfVar = this.bq;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        this.br.e(null);
        this.bs.e(null);
        this.aX.h();
        this.aR.a().b();
        super.u();
        this.aY.e(cwsv.a("NavigationFinishEvent"));
    }

    @dzsi
    public final View w() {
        cqkf<asha> cqkfVar = this.bq;
        dbsk.s(cqkfVar);
        return cqkfVar.c();
    }
}
