package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ceze  reason: default package */
/* loaded from: classes4.dex */
public class ceze {
    public final ardh a;
    public final akzh b;
    public final cfgw c;
    private final akox i;
    private final hwe j;
    private final Bitmap k;
    private final akxa l;
    private final ardc m;
    private final alec n;
    private final dxio<afwr> o;
    private final Activity p;
    private final cfgv q;
    private final Executor r;
    private final cfgn s;
    private final cfgl t;
    @dzsi
    private akzy v;
    private final List<akta> d = new ArrayList();
    private final List<akte> e = new ArrayList();
    private final List<aktc> f = new ArrayList();
    private final List<akti> g = new ArrayList();
    private final List<akuh> h = new ArrayList();
    private dbsg<cezd> u = dbpy.a;
    private dbsg<dllr> w = dbpy.a;

    public ceze(Activity activity, akox akoxVar, hwe hweVar, akpn akpnVar, alec alecVar, akzh akzhVar, dxio<afwr> dxioVar, cfgv cfgvVar, cqat cqatVar, Executor executor, cfgn cfgnVar, cfgw cfgwVar, cfgl cfglVar, btvo btvoVar) {
        this.q = cfgvVar;
        this.i = akoxVar;
        this.j = hweVar;
        this.n = alecVar;
        this.b = akzhVar;
        this.o = dxioVar;
        this.r = executor;
        this.s = cfgnVar;
        this.p = activity;
        akxa aj = akoxVar.aj().aj();
        this.l = aj;
        this.k = BitmapFactory.decodeResource(activity.getResources(), akpnVar.c());
        ardc ardcVar = new ardc(activity.getResources(), aj);
        this.m = ardcVar;
        Resources resources = activity.getResources();
        arcv arcvVar = new arcv(arcw.o, ardcVar);
        pnv pnvVar = pnv.a;
        btvoVar.getLocationSharingParameters();
        this.a = new ardh(resources, arcvVar, false, null, false, pnvVar, cqatVar, null, btvoVar.getEnableFeatureParameters(), executor);
        this.c = cfgwVar;
        this.t = cfglVar;
    }

    public static float l(akzh akzhVar) {
        return dece.c(((akzhVar.p().k - 12.0f) / 16.0f) + 0.33f, 0.33f, 0.66f);
    }

    private final synchronized void m(akra akraVar, akra akraVar2, boolean z, boolean z2) {
        dcdc g = dcdc.g(akraVar.S(), akraVar2.S());
        dbsk.a(g.size() >= 2);
        dccx dccxVar = new dccx();
        dccxVar.g(new aldj((akqq) g.get(0), 1));
        for (int i = 1; i < g.size() - 1; i++) {
            dccxVar.g(new aldj((akqq) g.get(i), 2));
        }
        dccxVar.g(new aldj((akqq) dcft.s(g), 3));
        dcdc f = dccxVar.f();
        if (z) {
            this.d.add(this.n.a((aldl) f.get(0), bntp.POLYLINE_MEASLES.c()));
        }
        if (z2) {
            this.d.add(this.n.a((aldl) f.get(1), bntp.POLYLINE_MEASLES.c()));
        }
        this.u = dbsg.i(new cezd(this.d, this.b));
        this.i.j().k(this.u.b());
    }

    private final synchronized void n(dllh dllhVar, List<akrk> list, akrk akrkVar) {
        akoq aj = this.i.aj();
        aktg a = this.s.a(dllhVar);
        aktg b = this.s.b(dllhVar);
        this.h.add(a);
        this.h.add(b);
        aktc c = this.s.c(dllhVar, a, b);
        this.f.add(c);
        aj.ak().b(c, new alge(true, new algb(akrkVar), list, new alfx(new Rect(), dcdc.e()), dbpy.a), amsb.POST_TRIP_UGC_MANEUVER, 0, cfgn.a);
    }

    private final synchronized void o(dllt dlltVar, akqs akqsVar, @dzsi akzt akztVar) {
        dllj dlljVar = dlltVar.b;
        if (dlljVar == null) {
            dlljVar = dllj.c;
        }
        dpum dpumVar = dlljVar.a;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        akra f = akra.f(akqq.f(dpumVar));
        float f2 = dlljVar.b;
        this.t.a(akqsVar, 40.0f, f2, akztVar);
        final area areaVar = new area(f, f2, 5, true);
        areaVar.r = 1.0f;
        areaVar.h = -f2;
        areaVar.l = true;
        areaVar.q = l(this.b);
        if ((dlltVar.a & 2) != 0) {
            ardh ardhVar = this.a;
            dllh dllhVar = dlltVar.c;
            if (dllhVar == null) {
                dllhVar = dllh.g;
            }
            ardhVar.e = dllhVar.b;
        }
        this.a.a(areaVar, this.b.b());
        akzy akzyVar = this.v;
        if (akzyVar != null) {
            this.i.ac(akzyVar);
        }
        akzy akzyVar2 = new akzy(this, areaVar) { // from class: ceza
            private final ceze a;
            private final area b;

            {
                this.a = this;
                this.b = areaVar;
            }

            @Override // defpackage.akzy
            public final void a(alad aladVar) {
                ceze cezeVar = this.a;
                cezeVar.a.a(this.b, cezeVar.b.b());
            }
        };
        this.v = akzyVar2;
        this.i.ab(akzyVar2);
        this.i.j().k(new cezc(areaVar, this.b));
    }

    private final synchronized void p(akqs akqsVar, @dzsi akzt akztVar) {
        this.t.a(akqsVar, 0.0f, 0.0f, akztVar);
    }

    private final synchronized void q(List<akpp> list) {
        this.j.d(list, false);
    }

    private final synchronized void r(dlln dllnVar, List<akrk> list) {
        dvzn dvznVar = dllnVar.b;
        if (dvznVar == null) {
            dvznVar = dvzn.e;
        }
        akrk h = akrk.h(dvznVar);
        Resources resources = this.p.getResources();
        int a = dllm.a(dllnVar.f);
        if (a == 0) {
            a = 2;
        }
        t(resources, h, a);
        if (h.l() >= 2) {
            m(h.m(0), h.p(), dllnVar.d, dllnVar.e);
        }
        if ((dllnVar.a & 2) != 0) {
            dllh dllhVar = dllnVar.c;
            if (dllhVar == null) {
                dllhVar = dllh.g;
            }
            if ((dllhVar.a & 2) != 0) {
                dvzn dvznVar2 = dllhVar.c;
                if (dvznVar2 == null) {
                    dvznVar2 = dvzn.e;
                }
                h = akrk.h(dvznVar2);
            }
            n(dllhVar, list, h);
        }
    }

    private final synchronized void s(dllx dllxVar, mw<dspd> mwVar) {
        int i;
        aktg d = this.s.d();
        this.h.add(d);
        aktg a = this.s.a(dllh.g);
        this.h.add(a);
        cfgn cfgnVar = this.s;
        bvlo a2 = bvlo.a();
        Resources resources = cfgnVar.c.getResources();
        int a3 = dllw.a(dllxVar.d);
        if (a3 == 0) {
            a3 = 1;
        }
        int i2 = a3 - 1;
        if (i2 == 2) {
            i = true != cfgnVar.e.h() ? R.raw.pin_entrance_default : R.raw.pin_entrance_default_dark;
        } else if (i2 != 3) {
            i = true != cfgnVar.e.h() ? R.raw.pin_destination_default : R.raw.pin_destination_default_dark;
        } else {
            i = true != cfgnVar.e.h() ? R.raw.pin_street_default : R.raw.pin_street_default_dark;
        }
        akuh d2 = cfgnVar.d.e().d(bvlf.c(a2.b(resources, i, bvlw.a), cqrp.d(38.0d).e(cfgnVar.c), cqrp.d(54.0d).e(cfgnVar.c), Bitmap.Config.ARGB_8888));
        this.h.add(d2);
        akti e = this.s.e(dllxVar, d, a, d2);
        e.Pt(new cezb(mwVar, dllxVar));
        this.g.add(e);
    }

    private final synchronized void t(Resources resources, akrk akrkVar, int i) {
        akuh a;
        akvz e = this.i.aj().aF().e();
        dllr dllrVar = dllr.UNKNOWN_MAP_LAYER;
        switch (i - 1) {
            case 2:
                a = e.a(dmqc.LEGEND_STYLE_SECONDARY_ROUTE);
                break;
            case 3:
                a = aldg.b(resources, R.drawable.blue_walking_dot, e, bntp.POLYLINE, 1);
                break;
            case 4:
                a = aldg.b(resources, R.drawable.blue_walking_alternate_dot, e, bntp.POLYLINE_DEACTIVATED_WITH_STAMPS, 1);
                break;
            case 5:
                a = e.a(dmqc.LEGEND_STYLE_PRIMARY_ROUTE_INACTIVE);
                break;
            case 6:
                a = aldg.b(resources, R.drawable.blue_walking_dot_dim, e, bntp.POLYLINE_DIMMED, 1);
                break;
            case 7:
                a = e.a(dmqc.LEGEND_STYLE_ROAD_CLOSURE);
                break;
            case 8:
                a = e.a(dmqc.LEGEND_STYLE_PRIMARY_ROUTE_STOP_AND_GO);
                break;
            default:
                a = e.a(dmqc.LEGEND_STYLE_PRIMARY_ROUTE);
                break;
        }
        akte c = this.l.c(akrkVar.q(), a, 0, 0, 2, 2, 3);
        this.i.aj().aF().c().f(c);
        this.e.add(c);
        this.h.add(a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        cfgv cfgvVar = this.q;
        boolean d = this.o.a().l().d(afwm.SATELLITE);
        cfgi cfgiVar = cfgvVar.a;
        if (cfgiVar.c) {
            cfgiVar.bF();
            cfgiVar.c = false;
        }
        cfgj cfgjVar = (cfgj) cfgiVar.b;
        cfgj cfgjVar2 = cfgj.h;
        cfgjVar.a |= 4;
        cfgjVar.f = d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.w.a()) {
            final dllr b = this.w.b();
            this.i.k.Pk(new Runnable(this, b) { // from class: ceyy
                private final ceze a;
                private final dllr b;

                {
                    this.a = this;
                    this.b = b;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g(this.b);
                }
            }, this.r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        this.n.d();
        this.a.f();
        this.m.c();
    }

    public final synchronized void d() {
        this.o.a().l().b(afwn.e(afwm.SATELLITE, ((cfgj) this.q.a.b).f));
        akox akoxVar = this.i;
        dhjx dhjxVar = ((cfgj) this.q.a.b).c;
        if (dhjxVar == null) {
            dhjxVar = dhjx.f;
        }
        akyc e = akyt.e(alad.c(dhjxVar));
        e.b = 0;
        akoxVar.p(e);
        f();
    }

    public final synchronized void e(final dlmc dlmcVar, final akqs akqsVar, final mw<dspd> mwVar, @dzsi final akzt akztVar) {
        this.i.k.Pk(new Runnable(this, dlmcVar, akqsVar, akztVar, mwVar) { // from class: ceyz
            private final ceze a;
            private final dlmc b;
            private final akqs c;
            private final akzt d;
            private final mw e;

            {
                this.a = this;
                this.b = dlmcVar;
                this.c = akqsVar;
                this.d = akztVar;
                this.e = mwVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ceze cezeVar = this.a;
                dlmc dlmcVar2 = this.b;
                akqs akqsVar2 = this.c;
                akzt akztVar2 = this.d;
                mw<dspd> mwVar2 = this.e;
                cezeVar.f();
                dllr b = dllr.b(dlmcVar2.d);
                if (b == null) {
                    b = dllr.UNKNOWN_MAP_LAYER;
                }
                cezeVar.g(b);
                cezeVar.h(dlmcVar2, akqsVar2, akztVar2);
                cezeVar.i(dlmcVar2);
                cezeVar.j(dlmcVar2);
                cezeVar.k(dlmcVar2, mwVar2);
                ((ckhe) cezeVar.c.a.a(ckkp.b)).c();
            }
        }, this.r);
    }

    public final synchronized void f() {
        akzy akzyVar = this.v;
        if (akzyVar != null) {
            this.i.ac(akzyVar);
        }
        for (akte akteVar : this.e) {
            akteVar.j();
        }
        this.e.clear();
        for (aktc aktcVar : this.f) {
            this.i.aj().ak().a(aktcVar);
        }
        this.f.clear();
        for (akti aktiVar : this.g) {
            aktiVar.j();
        }
        this.g.clear();
        for (akuh akuhVar : this.h) {
            this.i.aj().aF().e().j(akuhVar);
        }
        this.h.clear();
        this.j.h();
        if (!this.d.isEmpty()) {
            this.n.c(this.d);
            this.d.clear();
        }
        this.a.a(new area(), this.b);
        if (this.u.a()) {
            this.i.j().l(this.u.b());
            this.u = dbpy.a;
        }
    }

    public final synchronized void g(dllr dllrVar) {
        dllr dllrVar2 = dllr.UNKNOWN_MAP_LAYER;
        if (dllrVar.ordinal() == 2) {
            this.o.a().l().b(afwn.e(afwm.SATELLITE, true));
        } else {
            this.o.a().l().b(afwn.e(afwm.SATELLITE, false));
        }
        this.w = dbsg.i(dllrVar);
    }

    public final synchronized void h(dlmc dlmcVar, akqs akqsVar, @dzsi akzt akztVar) {
        dllt dlltVar;
        dllr dllrVar = dllr.UNKNOWN_MAP_LAYER;
        int i = dlmcVar.b;
        int i2 = i != 0 ? i != 9 ? i != 10 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 1) {
                if (i == 10) {
                    dlltVar = (dllt) dlmcVar.c;
                } else {
                    dlltVar = dllt.d;
                }
                o(dlltVar, akqsVar, akztVar);
                return;
            }
            p(akqsVar, akztVar);
            return;
        }
        throw null;
    }

    public final synchronized void i(dlmc dlmcVar) {
        ArrayList arrayList = new ArrayList();
        for (dllp dllpVar : dlmcVar.g) {
            dpum dpumVar = dllpVar.a;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            akqq f = akqq.f(dpumVar);
            arrayList.add(akpp.o(f));
            if (dllpVar.b) {
                arrayList.add(akpp.p(f, false, 1, this.k));
            }
        }
        if (!arrayList.isEmpty()) {
            q(arrayList);
        }
    }

    public final synchronized void j(dlmc dlmcVar) {
        ArrayList arrayList = new ArrayList();
        for (dlln dllnVar : dlmcVar.f) {
            dvzn dvznVar = dllnVar.b;
            if (dvznVar == null) {
                dvznVar = dvzn.e;
            }
            arrayList.add(akrk.h(dvznVar));
        }
        for (dlln dllnVar2 : dlmcVar.f) {
            r(dllnVar2, arrayList);
        }
    }

    public final synchronized void k(dlmc dlmcVar, mw<dspd> mwVar) {
        for (dllx dllxVar : dlmcVar.h) {
            if (!dllxVar.f) {
                s(dllxVar, mwVar);
            }
        }
    }
}
