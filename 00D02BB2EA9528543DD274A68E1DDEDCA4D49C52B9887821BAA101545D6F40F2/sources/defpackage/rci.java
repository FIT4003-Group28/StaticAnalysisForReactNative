package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: rci  reason: default package */
/* loaded from: classes7.dex */
public final class rci extends gew implements rfl, egq, qur {
    static final long aP = TimeUnit.MILLISECONDS.convert(3, TimeUnit.HOURS);
    public dwao aA;
    public GmmLocation aB;
    public long aC = 0;
    int aO = -1;
    @dzsi
    private rcn aQ;
    private rca aR;
    @dzsi
    private qut aS;
    private zio aT;
    private zke aU;
    private cqkf<rej> aV;
    private cqkf<rej> aW;
    private cqkf<rej> aX;
    private View aY;
    @dzsi
    private qup aZ;
    public cqkj ad;
    public cqat ae;
    public btrm af;
    public dxip<zio> ag;
    public acyr ah;
    public bvjj ai;
    public btvo aj;
    public sig ak;
    public dxio<acwo> al;
    public qva am;
    public acyp an;
    public cjxo ao;
    public dehq ap;
    public bypy aq;
    public bypx ar;
    public Executor as;
    public bzmm at;
    public rco au;
    public qqg av;
    @dzsi
    qqf aw;
    public rcu ax;
    public rfn ay;
    ImageView az;
    @dzsi
    private quy ba;
    private dbsg<dnqh> bb;
    @dzsi
    private dehu bc;
    public rcv c;
    public rfo d;
    public qus e;
    public ivt f;
    public efg g;

    public static Bundle aS(dbsg<dnqh> dbsgVar) {
        bvrj.UI_THREAD.c();
        Bundle bundle = new Bundle();
        if (dbsgVar.a()) {
            dsuv.d(bundle, "directionsRequestLoggingParams", dbsgVar.b());
        }
        return bundle;
    }

    private static dbsg<dnqh> bn(dbsg<Bundle> dbsgVar) {
        return (!dbsgVar.a() || !dbsgVar.b().containsKey("directionsRequestLoggingParams")) ? dbpy.a : dbsg.i((dnqh) dsuv.c(dbsgVar.b(), "directionsRequestLoggingParams", dnqh.p, dsqa.c()));
    }

    private final int bo() {
        ff J = J();
        dbsk.s(J);
        return (int) (bvsc.a(J) * 0.49f);
    }

    private final egu bp() {
        ardz ardzVar;
        qcz H;
        this.aO = Rn().getConfiguration().orientation;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(null);
        Context H2 = H();
        egjVar.D(H2 == null ? 0 : ise.b.NR(H2));
        egjVar.F(this.aV.c());
        egjVar.J(this);
        egjVar.k(this.an.d());
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egf b = egf.b();
        b.x = true;
        b.m();
        b.o();
        b.m = false;
        dqvj c = this.aR.c();
        dqvj dqvjVar = dqvj.DRIVE;
        int ordinal = c.ordinal();
        if (ordinal == 0) {
            ardzVar = ardz.DIRECTIONS_DRIVE;
        } else if (ordinal == 1) {
            ardzVar = ardz.DIRECTIONS_BICYCLE;
        } else if (ordinal == 5) {
            ardzVar = ardz.DIRECTIONS_TWO_WHEELER;
        } else {
            ardzVar = ardz.MAP;
        }
        b.h = ardzVar;
        egjVar.A(b);
        if (this.aO == 1) {
            egjVar.H((acyu) this.aW.c());
            egjVar.N(bo());
        } else {
            egjVar.ae((glg) this.aX.c(), 1);
        }
        egjVar.c(this.ay.F());
        if (this.aS != null) {
            int a = jmj.a(J(), 61);
            qut qutVar = this.aS;
            dbsk.s(qutVar);
            ((aegc) this.aW.c()).setMinExposurePixels(qutVar.h().getHeight() + a);
            qut qutVar2 = this.aS;
            dbsk.s(qutVar2);
            qutVar2.e(egjVar);
            ivt ivtVar = this.f;
            ff J = J();
            if (!this.ah.f() || !this.an.d() || J == null) {
                H = this.ay.H();
            } else {
                qcw x = qcx.x();
                x.r(amvh.i(J()));
                H = x.a();
            }
            egjVar.Q(ivtVar.b(this, H));
        }
        egjVar.aw(this.aY, false);
        return egjVar.a();
    }

    private final boolean bq() {
        Intent intent;
        Bundle extras;
        ff J = J();
        return (J == null || (intent = J.getIntent()) == null || (extras = intent.getExtras()) == null || !extras.getBoolean("cnidwr")) ? false : true;
    }

    private final boolean br() {
        dktt dkttVar = this.aj.getPassiveAssistParameters().a().am;
        if (dkttVar == null) {
            dkttVar = dktt.z;
        }
        return dkttVar.p;
    }

    private final void bs(boolean z) {
        aegc aegcVar = (aegc) this.aW.c();
        if (aegcVar != null) {
            if (z) {
                aegcVar.e(bo());
            } else {
                aegcVar.h(bo());
            }
        }
    }

    public static Bundle i(rca rcaVar, @dzsi qup qupVar, @dzsi quy quyVar, dbsg<dnqh> dbsgVar, boolean z) {
        bvrj.UI_THREAD.c();
        Bundle bundle = new Bundle();
        bundle.putSerializable("constructionParams", rcaVar);
        if (qupVar != null) {
            bundle.putBundle("commuteHubDirective", qupVar.h());
        }
        if (quyVar != null) {
            bundle.putSerializable("commuteHubState", quyVar);
        }
        if (dbsgVar.a()) {
            dsuv.d(bundle, "directionsRequestLoggingParams", dbsgVar.b());
        }
        bundle.putBoolean("has_fragment_search_tag", z);
        return bundle;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        bvrj.UI_THREAD.c();
        qut qutVar = this.aS;
        if (qutVar != null) {
            qutVar.d();
        }
        super.Qe();
    }

    @Override // defpackage.gew
    protected final void Qm() {
        bvrj.UI_THREAD.c();
        if (!this.aD) {
            return;
        }
        this.ay.y();
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        qqf qqfVar;
        rcn rcnVar;
        bvrj.UI_THREAD.c();
        this.ay.E();
        List<String> F = this.ai.F(bvjk.co, new ArrayList());
        if (this.aj.getTripAssistanceNotificationsParameters().f && bq() && F.size() < 3 && (rcnVar = this.aQ) != null && this.at.a(rcnVar)) {
            List<String> F2 = this.ai.F(bvjk.co, new ArrayList());
            F2.add(Long.toString(this.ae.b()));
            this.ai.ah(bvjk.co, F2);
            this.ai.W(bvjk.cn, 0);
        }
        if (!br() || (qqfVar = this.aw) == null || !this.at.a(qqfVar)) {
            return;
        }
        this.aw.h();
    }

    @Override // defpackage.qur
    @dzsi
    public final quy aJ() {
        bvrj.UI_THREAD.c();
        return this.ba;
    }

    @Override // defpackage.ges, defpackage.ggg
    public final /* bridge */ /* synthetic */ List aO() {
        return this.o.getBoolean("has_fragment_search_tag", false) ? dcdc.f(gfs.HOMETAB) : dcdc.e();
    }

    @Override // defpackage.qur
    public final void aR() {
        bvrj.UI_THREAD.c();
        bs(true);
    }

    public final void aT() {
        this.g.a(bp());
    }

    @Override // defpackage.rfl
    public final void aU() {
        bvrj.UI_THREAD.c();
        this.ax.a(this.aA);
    }

    public final boolean aV() {
        GmmLocation gmmLocation;
        dcdc<amvh> b = this.aR.b();
        akqq akqqVar = b.get(b.size() - 1).e;
        return (akqqVar == null || (gmmLocation = this.aB) == null || gmmLocation.F(akqqVar) >= 50.0f) ? false : true;
    }

    public final boolean aX() {
        return this.ae.e() - this.aR.e() > aP + this.aC;
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        View f;
        View f2;
        bvrj.UI_THREAD.c();
        this.aV = this.ad.e(new rea());
        this.aW = this.ad.e(new rdb());
        this.aX = this.ad.e(new rdf());
        qut qutVar = this.aS;
        if (qutVar != null) {
            final aegc aegcVar = (aegc) this.aW.c();
            qutVar.a(viewGroup, this.ay, new mw(this, aegcVar) { // from class: rcd
                private final rci a;
                private final aegc b;

                {
                    this.a = this;
                    this.b = aegcVar;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    rci rciVar = this.a;
                    aegc aegcVar2 = this.b;
                    Integer num = (Integer) obj;
                    rciVar.ay.C(num.intValue());
                    aegcVar2.setMinExposurePixels(num.intValue() + jmj.a(rciVar.J(), 61));
                }
            }, new mw(this) { // from class: rce
                private final rci a;

                {
                    this.a = this;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    this.a.ay.D(((Integer) obj).intValue());
                }
            });
        }
        ff J = J();
        dbsk.s(J);
        LinearLayout linearLayout = new LinearLayout(J);
        linearLayout.setOrientation(1);
        qut qutVar2 = this.aS;
        if (qutVar2 != null) {
            View h = qutVar2.h();
            ImageView imageView = new ImageView(J);
            this.az = imageView;
            imageView.setImageResource(true != bj() ? R.drawable.generic_above_shadow : R.drawable.generic_above_shadow_nightmode);
            linearLayout.addView(this.az, -1, J.getResources().getDimensionPixelSize(R.dimen.shadow_height));
            linearLayout.addView(h);
        }
        this.aY = linearLayout;
        aegc aegcVar2 = (aegc) this.aW.c();
        aegcVar2.setShowGrippy(true);
        aegcVar2.setShouldUseRoundedCornersShadow(true);
        bs(false);
        if (bq()) {
            gga ggaVar = this.aE;
            dbsk.s(ggaVar);
            dcdc<amvh> b = this.aR.b();
            ily ilyVar = new ily();
            ilyVar.I(b.get(b.size() - 1));
            ilo d = ilyVar.d();
            if (!this.ah.f()) {
                this.aQ = this.au.a(d, this.aV.c(), ggaVar);
            } else if (qutVar != null && (f2 = qutVar.f()) != null) {
                this.aQ = this.au.a(d, f2, ggaVar);
            }
        }
        if (!br() || this.an.d() || !this.ah.f() || qutVar == null || (f = qutVar.f()) == null) {
            return null;
        }
        qqf a = this.av.a(f);
        this.aw = a;
        a.g();
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        bvrj.UI_THREAD.c();
        super.ak();
        if (this.ae.b() - this.ax.i > rcu.a) {
            this.ax.a(this.aA);
        }
    }

    @Override // defpackage.ges
    protected final boolean bh() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ges
    public final void bi() {
        this.az.setImageResource(true != bj() ? R.drawable.generic_above_shadow : R.drawable.generic_above_shadow_nightmode);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        rjz rjzVar;
        bvrj.UI_THREAD.c();
        super.l(bundle);
        this.bb = bn(dbsg.j(this.o)).d(bn(dbsg.j(bundle)));
        Bundle bundle2 = bundle == null ? this.o : bundle;
        dbsk.l(bundle2.containsKey("constructionParams"));
        rca rcaVar = (rca) bundle2.getSerializable("constructionParams");
        dbsk.s(rcaVar);
        this.aR = rcaVar;
        dbsk.l(rcaVar.i());
        amte amteVar = (amte) bundle2.getSerializable("directionsStorageItem");
        long j = bundle2.getLong("directionsUpdatedTime");
        bvrt bvrtVar = (bvrt) bundle2.getSerializable("updatedDirectionsOptions");
        this.aA = bvrtVar != null ? (dwao) bvrtVar.e((dssr) dwao.R.cu(7), this.aR.h()) : this.aR.h();
        this.aT = zio.v(this.ag, rfn.B(this.aR.c(), this.aA), this.aR.c(), this.aA, douz.g, yiv.e, Long.valueOf(j), null, false, false);
        this.aU = zkd.a();
        Bundle bundle3 = bundle2.getBundle("commuteHubDirective");
        if (bundle3 != null) {
            this.aZ = qup.i(bundle3);
        }
        this.ba = (quy) bundle2.getSerializable("commuteHubState");
        if (this.ah.f()) {
            qut a = this.e.a(this, new Runnable(this) { // from class: rcc
                private final rci a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.aT();
                }
            });
            this.aS = a;
            a.m(this.am);
            rjzVar = this.aS.n();
        } else {
            rjzVar = null;
        }
        rjz rjzVar2 = rjzVar;
        rfo rfoVar = this.d;
        qut qutVar = this.aS;
        zio zioVar = this.aT;
        dcdc<amvh> b = this.aR.b();
        dqvj c = this.aR.c();
        dwao dwaoVar = this.aA;
        zke zkeVar = this.aU;
        dqek g = this.aR.g();
        gga a2 = rfoVar.a.a();
        rfo.a(a2, 1);
        ivg a3 = rfoVar.b.a();
        rfo.a(a3, 2);
        btvo a4 = rfoVar.c.a();
        rfo.a(a4, 3);
        cqhn a5 = rfoVar.d.a();
        rfo.a(a5, 4);
        quv a6 = rfoVar.e.a();
        rfo.a(a6, 5);
        dxio a7 = ((dxjh) rfoVar.f).a();
        rfo.a(a7, 6);
        dxio a8 = ((dxjh) rfoVar.g).a();
        rfo.a(a8, 7);
        isd a9 = rfoVar.h.a();
        rfo.a(a9, 8);
        yzi a10 = rfoVar.i.a();
        rfo.a(a10, 9);
        dxio a11 = ((dxjh) rfoVar.j).a();
        rfo.a(a11, 10);
        dxio a12 = ((dxjh) rfoVar.k).a();
        rfo.a(a12, 11);
        gun a13 = rfoVar.l.a();
        rfo.a(a13, 12);
        dxio a14 = ((dxjh) rfoVar.m).a();
        rfo.a(a14, 13);
        ziq a15 = rfoVar.n.a();
        rfo.a(a15, 14);
        zni a16 = rfoVar.o.a();
        rfo.a(a16, 15);
        wbw a17 = rfoVar.p.a();
        dxio a18 = ((dxjh) rfoVar.q).a();
        rfo.a(a18, 17);
        dxio a19 = ((dxjh) rfoVar.r).a();
        rfo.a(a19, 18);
        dzsj<qqz> dzsjVar = rfoVar.s;
        dxio a20 = ((dxjh) rfoVar.t).a();
        rfo.a(a20, 20);
        acyp a21 = rfoVar.u.a();
        rfo.a(a21, 21);
        rfo.a(zioVar, 24);
        rfo.a(b, 25);
        rfo.a(c, 26);
        rfo.a(dwaoVar, 27);
        rfo.a(this, 30);
        rfo.a(zkeVar, 31);
        this.ay = new rfn(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, dzsjVar, a20, a21, qutVar, rjzVar2, zioVar, b, c, dwaoVar, amteVar, j, this, zkeVar, g);
        rcv rcvVar = this.c;
        amvh a22 = this.aR.a();
        dcdc<amvh> b2 = this.aR.b();
        amte f = this.aR.f();
        rch rchVar = new rch(this);
        dbsg<dnqh> dbsgVar = this.bb;
        Activity activity = (Activity) ((dxjd) rcvVar.a).a;
        rcv.a(activity, 1);
        cqat a23 = rcvVar.b.a();
        rcv.a(a23, 2);
        btrm a24 = rcvVar.c.a();
        rcv.a(a24, 3);
        dzsj<srv> dzsjVar2 = rcvVar.d;
        dzsj<rcx> dzsjVar3 = rcvVar.e;
        ahjq a25 = rcvVar.f.a();
        rcv.a(a25, 6);
        akpm a26 = rcvVar.g.a();
        rcv.a(a26, 7);
        bvjj a27 = rcvVar.h.a();
        rcv.a(a27, 8);
        bvrb a28 = rcvVar.i.a();
        rcv.a(a28, 9);
        btvo a29 = rcvVar.j.a();
        rcv.a(a29, 10);
        ckcw a30 = rcvVar.k.a();
        rcv.a(a30, 11);
        rcv.a(b2, 14);
        rcv.a(rchVar, 16);
        rcv.a(dbsgVar, 17);
        this.ax = new rcu(activity, a23, a24, dzsjVar2, a25, a26, a27, a28, a29, a30, rcvVar.l.a(), a22, b2, f, rchVar, dbsgVar);
        if (bq()) {
            this.ai.W(bvjk.cn, this.ai.s(bvjk.cn, 0) + 1);
        }
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        bvrj.UI_THREAD.c();
        super.onConfigurationChanged(configuration);
        if (this.aO != Rn().getConfiguration().orientation) {
            aT();
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxl.bw;
    }

    @Override // defpackage.qur
    @dzsi
    public final qux q() {
        Fragment$SavedState r;
        bvrj.UI_THREAD.c();
        gn gnVar = this.A;
        if (gnVar == null || this.ba == null || this.aZ == null || (r = gnVar.r(this)) == null) {
            return null;
        }
        qup qupVar = this.aZ;
        dbsk.s(qupVar);
        dndr a = qupVar.a();
        quy quyVar = this.ba;
        dbsk.s(quyVar);
        qup qupVar2 = this.aZ;
        dbsk.s(qupVar2);
        return qux.e(quyVar, quw.c(a, qupVar2.b()), r, this.ae);
    }

    @Override // defpackage.gew, defpackage.ges, defpackage.fd
    public final void s() {
        bvrj.UI_THREAD.c();
        super.s();
        if (this.an.d()) {
            this.ao.a(1);
        }
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        Bundle extras = ggaVar.getIntent().getExtras();
        if (extras != null && extras.containsKey("cneta")) {
            this.ak.a(extras.getInt("cneta"));
        }
        rcu rcuVar = this.ax;
        rcuVar.b.registerReceiver(rcuVar.n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        btrm btrmVar = rcuVar.d;
        rct rctVar = rcuVar.o;
        dceq a = dcet.a();
        a.b(alhw.class, new rcw(0, alhw.class, rctVar, bvrj.UI_THREAD));
        a.b(srf.class, new rcw(1, srf.class, rctVar, bvrj.UI_THREAD));
        a.b(amqo.class, new rcw(2, amqo.class, rctVar, bvrj.UI_THREAD));
        btrmVar.g(rctVar, a.a());
        amte amteVar = rcuVar.l;
        if (amteVar != null) {
            rcuVar.h = amteVar;
            rcuVar.l = null;
            rcuVar.k = rcuVar.h.i();
            rcuVar.i = rcuVar.c.b();
            rcuVar.g = rcq.SUCCESS;
            rcuVar.d();
        }
        this.ay.s();
        btrm btrmVar2 = this.af;
        dceq a2 = dcet.a();
        a2.b(amqo.class, new rcj(amqo.class, this));
        a2.b(alco.class, new rcj(alco.class, this, bvrj.UI_THREAD));
        btrmVar2.g(this, a2.a());
        if (this.aS != null) {
            if (czui.a(22)) {
                View G = this.ay.G();
                qut qutVar = this.aS;
                dbsk.s(qutVar);
                View f = qutVar.f();
                if (G != null && f != null) {
                    f.setAccessibilityTraversalBefore(G.getId());
                }
                qut qutVar2 = this.aS;
                dbsk.s(qutVar2);
                qutVar2.h().setAccessibilityTraversalAfter(this.aW.c().getId());
            }
            qut qutVar3 = this.aS;
            dbsk.s(qutVar3);
            qutVar3.b();
        }
        if (this.ba == null && (aV() || aX())) {
            final ff J = J();
            this.as.execute(new Runnable(this, J) { // from class: rcg
                private final rci a;
                private final Activity b;

                {
                    this.a = this;
                    this.b = J;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    rci rciVar = this.a;
                    Activity activity = this.b;
                    if (rciVar.aD) {
                        rciVar.aV();
                        rciVar.aX();
                        gga ggaVar2 = rciVar.aE;
                        dbsk.s(ggaVar2);
                        ggaVar2.g().f();
                        Toast.makeText(activity, (int) R.string.COMMUTE_IMMERSIVE_EXIT_TOAST, 0).show();
                    }
                }
            });
            return;
        }
        this.aV.e(this.ay);
        this.aW.e(this.ay);
        this.aX.e(this.ay);
        this.g.a(bp());
        this.aq.a(ggaVar.getIntent(), ggaVar, 1);
        this.ar.a(ggaVar.getIntent(), ggaVar, 1);
        if (extras == null || extras.getInt("NOTIFICATION_TYPE", 0) == 0) {
            this.aU.r(ggaVar.getString(R.string.FINDING_BEST_ROUTE));
        } else {
            this.aU.r(ggaVar.getString(R.string.COMMUTE_IMMERSIVE_LOADING));
        }
        dehu d = this.ap.d(new Runnable(this) { // from class: rcf
            private final rci a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                rci rciVar = this.a;
                if (!rciVar.aD || rciVar.J() == null) {
                    return;
                }
                rciVar.al.a().i(dvum.COMMUTE_DRIVING_IMMERSIVE, null);
            }
        }, this.aj.getSurveyParameters().b, TimeUnit.MILLISECONDS);
        this.bc = d;
        bvqd.b(d, this.ap);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        bvrj.UI_THREAD.c();
        super.t(bundle);
        bundle.putSerializable("constructionParams", this.aR);
        bundle.putSerializable("directionsStorageItem", this.ax.h);
        bundle.putSerializable("commuteHubState", this.ba);
        qup qupVar = this.aZ;
        if (qupVar != null) {
            bundle.putBundle("commuteHubDirective", qupVar.h());
        }
        bundle.putLong("directionsUpdatedTime", this.ax.i);
        bundle.putSerializable("updatedDirectionsOptions", bvrt.a(this.aA));
        if (this.bb.a()) {
            dsuv.d(bundle, "directionsRequestLoggingParams", this.bb.b());
        }
    }

    @Override // defpackage.gew, defpackage.ges, defpackage.fd
    public final void u() {
        bvrj.UI_THREAD.c();
        super.u();
        rcu rcuVar = this.ax;
        rcuVar.b.unregisterReceiver(rcuVar.n);
        rcuVar.d.a(rcuVar.o);
        this.ay.t();
        this.af.a(this);
        this.aV.h();
        if (this.an.g()) {
            this.aW.e(null);
        } else {
            this.aW.h();
        }
        this.aX.h();
        qut qutVar = this.aS;
        if (qutVar != null) {
            qutVar.c();
        }
        dehu dehuVar = this.bc;
        if (dehuVar != null && !dehuVar.isDone()) {
            this.bc.cancel(true);
        }
        if (this.an.d()) {
            this.ao.b();
        }
    }

    @Override // defpackage.qur
    @dzsi
    public final qup w() {
        bvrj.UI_THREAD.c();
        return this.aZ;
    }
}
