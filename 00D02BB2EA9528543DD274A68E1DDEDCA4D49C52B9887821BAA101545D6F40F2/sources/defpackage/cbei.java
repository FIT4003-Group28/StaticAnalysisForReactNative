package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Toast;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cbei  reason: default package */
/* loaded from: classes4.dex */
public final class cbei extends ges implements bxeq, bwrr, egq {
    static final dbsl<dmpn> a = cbee.a;
    private bwrs<ilo> aA;
    private boolean aB;
    private boolean aC;
    private boolean aO;
    @dzsi
    private cqkf<cbrr> aQ;
    private cbql aS;
    private cber aT;
    private dijn aV;
    private dijn aW;
    private dive aX;
    private cbbz aY;
    public dxio<cqhn> ad;
    public btvo ae;
    public dxio<abal> af;
    public dxio<begg> ag;
    public cayn ah;
    public cbdx ai;
    public cbca aj;
    public dxio<akox> ak;
    public dxio<afwr> al;
    public dxio<axsc> am;
    public ckcw an;
    public cbcq ao;
    public cbcc ap;
    public cbes aq;
    public cbco ar;
    public cbdq as;
    public cbew at;
    public cjxo au;
    public cbqg av;
    @dzsi
    public cbev aw;
    cbcn ax;
    public cbdp ay;
    @dzsi
    private Integer az;
    public cqkj b;
    public bwqv c;
    public hwe d;
    public gfq e;
    public efg f;
    public dxio<brba> g;
    private boolean aP = false;
    private boolean aR = false;
    private cbau aU = null;
    private boolean aZ = false;

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi Object obj) {
        ilo iloVar = (ilo) obj;
        if (iloVar != null) {
            if (this.aZ) {
                bwqv.t(this.aA, this);
            }
            this.aZ = false;
            g(iloVar);
            this.aw.w();
            this.ad.a();
            cqkx.p(this.aw);
        }
    }

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.aQ.e(null);
        this.aQ = null;
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof ilo) {
            if (this.aZ) {
                bwqv.t(this.aA, this);
            }
            this.aZ = false;
            ilo iloVar = (ilo) obj;
            q(iloVar);
            g(iloVar);
        } else if (obj instanceof dprz) {
            this.aS.i((dprz) obj);
        } else if (obj instanceof bdhk) {
            this.ay.f(((bdhk) obj).a());
            this.aP = true;
            gfq.k(this);
        } else if (obj instanceof bbuf) {
            final cbdp cbdpVar = this.ay;
            List<bbtm> a2 = ((bbuf) obj).a();
            dcen N = dcep.N();
            for (bbtm bbtmVar : cbdpVar.k) {
                N.b(bbtmVar.a());
            }
            dcep f = N.f();
            dccx F = dcdc.F();
            F.i(cbdpVar.k);
            dccx F2 = dcdc.F();
            F2.i(cbdpVar.n);
            for (bbtm bbtmVar2 : a2) {
                if (!f.contains(bbtmVar2.a())) {
                    F.g(bbtmVar2);
                    F2.g(new cbcr(bbtmVar2.z().toString(), null, new cqkn(cbdpVar) { // from class: cbdo
                        private final cbdp a;

                        {
                            this.a = cbdpVar;
                        }

                        @Override // defpackage.cqkn
                        public final void a(cqkp cqkpVar, View view) {
                            this.a.g((cbrf) cqkpVar);
                        }
                    }));
                }
            }
            cbdpVar.k = F.f();
            cbdpVar.n = F2.f();
            cqhn cqhnVar = cbdpVar.c;
            cqkx.p(cbdpVar);
            this.aP = true;
            gfq.k(this);
        } else if (obj instanceof cbqt) {
            if (!this.av.c()) {
                return;
            }
            cbqt cbqtVar = (cbqt) obj;
            this.aU.d(cbqtVar.a());
            this.aU.f(cbqtVar.b());
            this.aU.l(cbqtVar.c());
            this.aY.a().m();
            this.aY.b().m();
        } else if (obj instanceof bdgu) {
            bdgu bdguVar = (bdgu) obj;
            if (!bdguVar.a) {
                return;
            }
            Toast.makeText(J(), true != bdguVar.b ? R.string.DELETE_USER_PHOTO_SUCCESS : R.string.DELETE_USER_VIDEO_SUCCESS, 1).show();
            this.ay.e();
        }
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        this.am.a().e(false);
        if (!(this.e.d() instanceof cbei)) {
            return;
        }
        this.ax.k();
    }

    @Override // defpackage.bxeq
    public final void aK() {
    }

    @Override // defpackage.bxeq
    public final void aL(String str) {
    }

    @Override // defpackage.bxeq
    public final void aM(bxmh bxmhVar, List list) {
    }

    @Override // defpackage.bxeq
    public final boolean aN() {
        return false;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        RecyclerView recyclerView;
        cqkf<cbrr> c = this.b.c(new cbnf(), null);
        this.aQ = c;
        c.e(this.aw);
        final View c2 = this.aQ.c();
        cbct cbctVar = (cbct) this.ah;
        cbctVar.a = c2;
        if (c2 == null) {
            cbctVar.b();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            c2.setImportantForAutofill(8);
        }
        final View findViewById = c2.findViewById(R.id.event_create_edit_layout_scroll_view);
        findViewById.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener(findViewById, c2) { // from class: cbed
            private final View a;
            private final View b;

            {
                this.a = findViewById;
                this.b = c2;
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                View view = this.a;
                View view2 = this.b;
                if (view.getViewTreeObserver().isAlive()) {
                    View a2 = cqhu.a(view2, ise.a);
                    dbsk.s(a2);
                    a2.animate().setDuration(0L).alpha(view.getScrollY() > 0 ? 1.0f : 0.0f).start();
                }
            }
        });
        View findViewById2 = c2.findViewById(R.id.event_category_scroll_view);
        if (findViewById2 instanceof GmmRecyclerView) {
            ((GmmRecyclerView) findViewById2).n(this.aS.e().intValue());
        }
        if (this.aP && this.ay.a().size() > 1 && (recyclerView = (RecyclerView) cqkx.e(c2, cbri.q, RecyclerView.class)) != null) {
            recyclerView.l(this.ay.a().size());
        }
        this.aP = false;
        return c2;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        this.af.a().f(false);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        if (this.aZ) {
            bwqv.t(this.aA, this);
            this.aZ = false;
        }
        afwo l = this.al.a().l();
        l.c(afwm.TRAFFIC, this.aC);
        l.c(afwm.TRANSIT, this.aB);
        l.c(afwm.BICYCLING, this.aO);
        this.ak.a().aj().aC().j(a);
        this.am.a().e(true);
        this.af.a().f(true);
        this.d.h();
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        final cbev cbevVar = this.aw;
        cbqb.a(cbevVar.a, new Runnable(cbevVar) { // from class: cbet
            private final cbev a;

            {
                this.a = cbevVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbev cbevVar2 = this.a;
                cbevVar2.v();
                cbevVar2.b.run();
            }
        }, cbevVar.c, cjtd.b, cjtd.b);
        return true;
    }

    public final void g(ilo iloVar) {
        cbcn cbcnVar = this.ax;
        cbcnVar.a = iloVar;
        cbcnVar.c = null;
        this.aT.e(iloVar);
        cbdp cbdpVar = this.ay;
        ilo iloVar2 = cbdpVar.i;
        cbdpVar.i = iloVar;
        if (iloVar == null || (iloVar2 != null && !iloVar2.ai().equals(iloVar.ai()))) {
            dcen N = dcep.N();
            N.i(cbdpVar.m.values());
            dcep f = N.f();
            cbdpVar.m = dcmn.a;
            dccx F = dcdc.F();
            for (cbrf cbrfVar : cbdpVar.n) {
                if (!f.contains(cbrfVar.a())) {
                    F.g(cbrfVar);
                }
            }
            cbdpVar.n = F.f();
            cqhn cqhnVar = cbdpVar.c;
            cqkx.p(cbdpVar);
        }
        this.ad.a();
        cqkx.p(this.ax);
        this.ad.a();
        cqkx.p(this.aT);
        this.ad.a();
        cqkx.p(this.ay);
        this.ad.a();
        cqkx.p(this.aw);
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        iqy iqyVar = new iqy();
        iqyVar.e();
        this.g.a().l(bxmhVar, dnqhVar, bxkvVar, iqyVar, new cbeh(this));
        gfq.k(this);
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        Map<String, String> map;
        dive diveVar;
        ilo iloVar;
        dprz dprzVar;
        int i;
        cqkn cqknVar;
        super.l(bundle);
        this.ak.a().aj().aC().i(a);
        afwo l = this.al.a().l();
        this.aC = l.d(afwm.TRAFFIC);
        this.aB = l.d(afwm.TRANSIT);
        this.aO = l.d(afwm.BICYCLING);
        l.c(afwm.TRAFFIC, false);
        l.c(afwm.TRANSIT, false);
        l.c(afwm.BICYCLING, false);
        Bundle bundle2 = bundle == null ? this.o : bundle;
        this.aV = null;
        this.aW = null;
        this.aX = null;
        if (bundle2 != null) {
            this.aV = (dijn) bvrs.b(bundle2.getByteArray("knowledge_entity_edit_parcel_key"), (dssr) dijn.e.cu(7));
            this.aW = (dijn) bvrs.b(bundle2.getByteArray("updated_knowledge_entity_edit_parcel_key"), (dssr) dijn.e.cu(7));
            this.aX = (dive) bvrs.b(bundle2.getByteArray("event_photo_set_parcel_key"), (dssr) dive.d.cu(7));
            dive diveVar2 = (dive) bvrs.b(bundle2.getByteArray("current_event_photo_set_parcel_key"), (dssr) dive.d.cu(7));
            try {
                diveVar = diveVar2;
                map = (Map) bundle2.getSerializable("venue_photo_map_parcel_key");
            } catch (ClassCastException unused) {
                diveVar = diveVar2;
                map = null;
            }
        } else {
            map = null;
            diveVar = null;
        }
        cbcv cbcvVar = new cbcv(this.aV);
        cbcv cbcvVar2 = new cbcv(this.aW);
        this.aR = this.aV != null;
        Runnable runnable = new Runnable(this) { // from class: cbeb
            private final cbei a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbei cbeiVar = this.a;
                cbeiVar.ad.a();
                cqkx.p(cbeiVar.aw);
            }
        };
        String e = dbsj.e(cbcvVar.b(djjd.NAME));
        String c = cbcvVar2.c(djjd.NAME);
        cbcq cbcqVar = this.ao;
        if (c == null) {
            c = e;
        }
        cbcq.a(e, 1);
        cbcq.a(c, 2);
        cbcq.a(runnable, 3);
        cbdx a2 = cbcqVar.a.a();
        cbcq.a(a2, 4);
        ff ffVar = (ff) ((dxjd) cbcqVar.b).a;
        cbcq.a(ffVar, 5);
        btvo a3 = cbcqVar.c.a();
        cbcq.a(a3, 6);
        cbcp cbcpVar = new cbcp(e, c, runnable, a2, ffVar, a3);
        dpsd i2 = cbcvVar.i();
        djjg j = cbcvVar2.j(djjd.OCCURRENCE_PATTERN, 8);
        dpsd dpsdVar = j != null ? j.a == 7 ? (dpsd) j.b : dpsd.f : null;
        dpvi d = cbcvVar.d(djjd.START_DATETIME);
        dpvi e2 = cbcvVar2.e(djjd.START_DATETIME);
        dpvi d2 = cbcvVar.d(djjd.END_DATETIME);
        dpvi e3 = cbcvVar2.e(djjd.END_DATETIME);
        cbca cbcaVar = this.aj;
        dpvi dpviVar = e2 == null ? d : e2;
        dpvi dpviVar2 = e3 == null ? d2 : e3;
        boolean z = this.aR && i2 == null;
        cbca.a(runnable, 7);
        cbca.a(this, 8);
        cbat a4 = cbcaVar.a.a();
        cbca.a(a4, 10);
        Activity activity = (Activity) ((dxjd) cbcaVar.b).a;
        cbca.a(activity, 11);
        cayn a5 = cbcaVar.c.a();
        cbca.a(a5, 12);
        cbqg a6 = cbcaVar.d.a();
        cbca.a(a6, 13);
        Map<String, String> map2 = map;
        Bundle bundle3 = bundle2;
        this.aY = new cbbz(d, dpviVar, d2, dpviVar2, i2, dpsdVar, runnable, this, z, a4, activity, a5, a6);
        if (this.av.c()) {
            this.aU = new cbau(i2, dpsdVar == null ? i2 : dpsdVar, d, dpviVar, d2, dpviVar2);
        }
        djji f = cbcvVar.f();
        if (f != null) {
            ily ilyVar = new ily();
            dpum dpumVar = f.b;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            ilyVar.q(akqq.f(dpumVar));
            ilyVar.k(f.c);
            iloVar = ilyVar.d();
        } else {
            dpum g = cbcvVar.g();
            if (g != null) {
                ily ilyVar2 = new ily();
                ilyVar2.q(akqq.f(g));
                iloVar = ilyVar2.d();
            } else {
                iloVar = null;
            }
        }
        cbco cbcoVar = this.ar;
        cbco.a(this, 2);
        bwqv a7 = cbcoVar.a.a();
        cbco.a(a7, 3);
        dxio a8 = ((dxjh) cbcoVar.b).a();
        cbco.a(a8, 4);
        cbco.a(cbcoVar.c.a(), 5);
        dxio a9 = ((dxjh) cbcoVar.d).a();
        cbco.a(a9, 6);
        this.ax = new cbcn(iloVar, this, a7, a8, a9);
        if (bundle3 != null && cctq.c(bundle3)) {
            bwrs<ilo> b = cctq.b(bundle3, this.c);
            this.aA = b;
            ilo c2 = b.c();
            if (c2 != null) {
                iloVar = c2;
            }
        }
        dprz h = cbcvVar.h();
        djjg j2 = cbcvVar2.j(djjd.EXPERIENCE_CATEGORY, 9);
        if (j2 == null) {
            dprzVar = null;
        } else if (j2.a == 8) {
            dprzVar = dprz.b(((Integer) j2.b).intValue());
            if (dprzVar == null) {
                dprzVar = dprz.EXPERIENCE_CATEGORY_UNKNOWN;
            }
        } else {
            dprzVar = dprz.EXPERIENCE_CATEGORY_UNKNOWN;
        }
        if (dprzVar == null) {
            dprzVar = h;
        }
        this.aS = new cayx(this, new dsrh(this.ae.getEventsUgcParameters().a, dupy.b), this.ae.getEventsUgcParameters().c, h, dprzVar == null ? h : dprzVar, new cbeg(this), this.ah);
        String e4 = dbsj.e(cbcvVar.b(djjd.WEBSITE));
        String c3 = cbcvVar2.c(djjd.WEBSITE);
        cbcs cbcsVar = new cbcs(e4, c3 == null ? e4 : c3, J(), this.ai, runnable);
        String e5 = dbsj.e(cbcvVar.b(djjd.DESCRIPTION));
        String c4 = cbcvVar2.c(djjd.DESCRIPTION);
        cbcc cbccVar = this.ap;
        if (c4 == null) {
            c4 = e5;
        }
        cbcc.a(e5, 1);
        cbcc.a(c4, 2);
        cbcc.a(runnable, 3);
        cbdx a10 = cbccVar.a.a();
        cbcc.a(a10, 4);
        ff ffVar2 = (ff) ((dxjd) cbccVar.b).a;
        cbcc.a(ffVar2, 5);
        cqhn a11 = cbccVar.c.a();
        cbcc.a(a11, 6);
        btvo a12 = cbccVar.d.a();
        cbcc.a(a12, 7);
        cbcb cbcbVar = new cbcb(e5, c4, runnable, a10, ffVar2, a11, a12);
        this.aP = this.aX != null;
        cbdq cbdqVar = this.as;
        String a13 = cbcvVar.a();
        cbdq.a(this, 1);
        cbdq.a(a13, 2);
        cbdq.a(cbcpVar, 3);
        bwqv a14 = cbdqVar.a.a();
        cbdq.a(a14, 4);
        gga a15 = cbdqVar.b.a();
        cbdq.a(a15, 5);
        cqhn a16 = cbdqVar.c.a();
        cbdq.a(a16, 6);
        dxio a17 = ((dxjh) cbdqVar.d).a();
        cbdq.a(a17, 7);
        dxio a18 = ((dxjh) cbdqVar.e).a();
        cbdq.a(a18, 8);
        bbtk a19 = cbdqVar.f.a();
        cbdq.a(a19, 9);
        akfa a20 = cbdqVar.g.a();
        cbdq.a(a20, 10);
        dxio a21 = ((dxjh) cbdqVar.h).a();
        ilo iloVar2 = iloVar;
        cbdq.a(a21, 11);
        aajk a22 = cbdqVar.i.a();
        cbdq.a(a22, 12);
        cayn a23 = cbdqVar.j.a();
        cbdq.a(a23, 13);
        final cbdp cbdpVar = new cbdp(this, a13, cbcpVar, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23);
        this.ay = cbdpVar;
        dive diveVar3 = diveVar != null ? diveVar : this.aX;
        dccx F = dcdc.F();
        dcen N = dcep.N();
        btlu j3 = cbdpVar.f.j();
        if (diveVar3 != null) {
            for (final dwfl dwflVar : diveVar3.a) {
                String str = dwflVar.h;
                cqkn cqknVar2 = new cqkn(cbdpVar, dwflVar) { // from class: cbdl
                    private final cbdp a;
                    private final dwfl b;

                    {
                        this.a = cbdpVar;
                        this.b = dwflVar;
                    }

                    @Override // defpackage.cqkn
                    public final void a(cqkp cqkpVar, View view) {
                        cbdp cbdpVar2 = this.a;
                        dwfl dwflVar2 = this.b;
                        cbrf cbrfVar = (cbrf) cqkpVar;
                        ily ilyVar3 = new ily();
                        dvya bZ = dvyw.bv.bZ();
                        String str2 = cbdpVar2.j;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dvyw dvywVar = (dvyw) bZ.b;
                        str2.getClass();
                        dvywVar.a |= 8;
                        dvywVar.h = str2;
                        ilyVar3.E(bZ.bK());
                        ilo d3 = ilyVar3.d();
                        bbut a24 = cbdpVar2.d.a();
                        ckoa ckoaVar = new ckoa(dcdc.f(dwflVar2));
                        bbtv v = bbty.v();
                        v.k(true);
                        a24.p(ckoaVar, 0, v.a(), bwrs.a(d3), null);
                    }
                };
                if (j3 != null) {
                    dizh dizhVar = dwflVar.p;
                    if (dizhVar == null) {
                        dizhVar = dizh.j;
                    }
                    diyt diytVar = dizhVar.e;
                    if (diytVar == null) {
                        diytVar = diyt.c;
                    }
                    for (djrz djrzVar : diytVar.a) {
                        if (j3.d.equals(djrzVar.b)) {
                            cqknVar = new cqkn(cbdpVar, dwflVar) { // from class: cbdm
                                private final cbdp a;
                                private final dwfl b;

                                {
                                    this.a = cbdpVar;
                                    this.b = dwflVar;
                                }

                                @Override // defpackage.cqkn
                                public final void a(cqkp cqkpVar, View view) {
                                    cbdp cbdpVar2 = this.a;
                                    dwfl dwflVar2 = this.b;
                                    cbdpVar2.o = (cbrf) cqkpVar;
                                    bwqv bwqvVar = cbdpVar2.a;
                                    dizh dizhVar2 = dwflVar2.p;
                                    if (dizhVar2 == null) {
                                        dizhVar2 = dizh.j;
                                    }
                                    dggg dgggVar = dizhVar2.b;
                                    if (dgggVar == null) {
                                        dgggVar = dggg.d;
                                    }
                                    cbdpVar2.b.aZ(bdgj.g(bwqvVar, dgggVar, cknv.j(dwflVar2)));
                                }
                            };
                            break;
                        }
                    }
                }
                cqknVar = null;
                F.g(new cbcr(str, cqknVar2, cqknVar));
                N.b(dwflVar.d);
            }
        }
        cbdpVar.p = diveVar3;
        cbdpVar.n = F.f();
        cbdpVar.l = N.f();
        if (map2 != null) {
            this.ay.f(map2);
            i = 1;
            this.aP = true;
        } else {
            i = 1;
        }
        cbes cbesVar = this.aq;
        dive diveVar4 = diveVar == null ? this.aX : diveVar;
        cbes.a(this, i);
        gga a24 = cbesVar.a.a();
        cbes.a(a24, 3);
        dxio a25 = ((dxjh) cbesVar.b).a();
        cbes.a(a25, 4);
        this.aT = new cber(this, diveVar4, a24, a25);
        cbef cbefVar = new cbef(this);
        cbew cbewVar = this.at;
        cbcv cbcvVar3 = i != this.aR ? null : cbcvVar;
        cbdt cbdtVar = new cbdt(this.an);
        cbcn cbcnVar = this.ax;
        cbql cbqlVar = this.aS;
        cbbz cbbzVar = this.aY;
        cber cberVar = this.aT;
        cbdp cbdpVar2 = this.ay;
        cbau cbauVar = this.aU;
        Runnable runnable2 = new Runnable(this) { // from class: cbec
            private final cbei a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbei cbeiVar = this.a;
                cbcn cbcnVar2 = cbeiVar.ax;
                cbcnVar2.d = false;
                cbcnVar2.b.a();
                cqkx.p(cbcnVar2);
                gfq.m(cbeiVar);
            }
        };
        cbew.a(this, 2);
        cbew.a(cbdtVar, 3);
        cbew.a(cbcnVar, 4);
        cbew.a(cbqlVar, 5);
        cbew.a(cbcpVar, 6);
        cbew.a(cbcbVar, 7);
        cbew.a(cbbzVar, 8);
        cbew.a(cbcsVar, 9);
        cbew.a(cberVar, 10);
        cbew.a(cbdpVar2, 11);
        cbew.a(cbefVar, 13);
        cbew.a(runnable2, 14);
        cbeq a26 = cbewVar.a.a();
        cbew.a(a26, 15);
        cqkj a27 = cbewVar.b.a();
        cbew.a(a27, 16);
        dxio a28 = ((dxjh) cbewVar.c).a();
        cbew.a(a28, 17);
        cbbc a29 = cbewVar.d.a();
        cbew.a(a29, 18);
        cbqg a30 = cbewVar.e.a();
        cbew.a(a30, 19);
        gga a31 = cbewVar.f.a();
        cbew.a(a31, 20);
        this.aw = new cbev(cbcvVar3, this, cbdtVar, cbcnVar, cbqlVar, cbcpVar, cbcbVar, cbbzVar, cbcsVar, cberVar, cbdpVar2, cbauVar, cbefVar, runnable2, a26, a27, a28, a29, a30, a31);
        if (iloVar2 != null && iloVar2.f && !iloVar2.j()) {
            this.aA = bwrs.a(iloVar2);
            g(iloVar2);
            this.aw.w();
        } else if (iloVar2 == null) {
            this.aw.w();
            this.aA = bwrs.a(null);
        } else {
            bwrs<ilo> a32 = bwrs.a(iloVar2);
            this.aA = a32;
            this.c.f(a32, this, false);
            this.aZ = true;
            bwrs<ilo> bwrsVar = this.aA;
            dbsk.s(bwrsVar);
            this.ag.a().q(bwrsVar, false);
        }
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtyd.d;
    }

    public final void q(ilo iloVar) {
        this.aA.d(iloVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (!btpf.c(J()).e) {
            this.au.a(1);
        }
        egf egfVar = new egf(false, Integer.MIN_VALUE, false, false, false, false, ardz.NONE, arbs.MOVE_JUMP_TELEPORT, false, true, new afwn[0], true, true, true, true, true, false, true, false, true, false, null, true, false, dpwz.UNKNOWN_MAP_CONTENT_TYPE);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.j(false);
        egjVar.w(this.P);
        egjVar.e(this);
        egjVar.I(2);
        egjVar.A(egfVar);
        egjVar.J(this);
        this.f.a(egjVar.a());
        this.az = Integer.valueOf(J().getWindow().getAttributes().softInputMode);
        J().getWindow().setSoftInputMode(16);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        cbev cbevVar = this.aw;
        if (cbevVar != null) {
            dbsg<dijr> q = cbevVar.q();
            if (q.a()) {
                dijn dijnVar = q.b().c;
                if (dijnVar == null) {
                    dijnVar = dijn.e;
                }
                this.aW = dijnVar;
            }
        }
        if (this.aA.c() != null) {
            cctq.a(bundle, this.c, this.aA);
        }
        dijn dijnVar2 = this.aV;
        if (dijnVar2 != null) {
            bundle.putByteArray("knowledge_entity_edit_parcel_key", dijnVar2.bS());
        }
        dijn dijnVar3 = this.aW;
        if (dijnVar3 != null) {
            bundle.putByteArray("updated_knowledge_entity_edit_parcel_key", dijnVar3.bS());
        }
        dive diveVar = this.aX;
        if (diveVar != null) {
            bundle.putByteArray("event_photo_set_parcel_key", diveVar.bS());
        }
        dive diveVar2 = this.ay.p;
        if (diveVar2 != null) {
            bundle.putByteArray("current_event_photo_set_parcel_key", diveVar2.bS());
        }
        dcdn<String, String> dcdnVar = this.ay.m;
        if (!dcdnVar.isEmpty()) {
            bundle.putSerializable("venue_photo_map_parcel_key", dcdnVar);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        if (this.az != null) {
            Window window = J().getWindow();
            Integer num = this.az;
            dbsk.s(num);
            window.setSoftInputMode(num.intValue());
        }
        this.au.b();
        super.u();
    }
}
