package defpackage;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.util.Base64;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cfkh  reason: default package */
/* loaded from: classes4.dex */
public final class cfkh extends cfje implements cfhh {
    private static final dcqe g = dcqe.c("cfkh");
    public final cfgv a;
    public final dxio<akzh> b;
    public final dlnm c;
    public final Runnable d;
    public final dbsg<dllx> e;
    public final boolean f;
    private final dddi h;
    private final dbsg<cfgz> i;
    private final Runnable j;
    private dcdc<cfhg> k;

    public cfkh(final Resources resources, final cqhu cqhuVar, cfgv cfgvVar, dxio<akzh> dxioVar, final cjnf cjnfVar, final gce gceVar, cfjy cfjyVar, cfhy cfhyVar, dddi dddiVar, dlnm dlnmVar, Runnable runnable, Runnable runnable2, mw<Boolean> mwVar) {
        dlnb dlnbVar;
        dddi dddiVar2 = dddiVar;
        dlnm dlnmVar2 = dlnmVar;
        this.a = cfgvVar;
        this.b = dxioVar;
        this.h = dddiVar2;
        this.c = dlnmVar2;
        this.j = runnable;
        this.d = runnable2;
        dlmc dlmcVar = dlnmVar2.j;
        dbsg<dllx> r = dcbg.b((dlmcVar == null ? dlmc.j : dlmcVar).h).r(cfjz.a);
        this.e = r;
        dbsg<dspd> f = f(dlnmVar2, cfgvVar);
        int i = 1;
        boolean z = false;
        if (r.a() != f.a() || !r.c(dllx.g).e.equals(f.c(dspd.b))) {
            bvoo.h("SelectMultipleLocationQuestion selectedPoint does not match stored currentSelectedOptionId. Question ID was %s", Base64.encode(dlnmVar2.g.G(), 0));
        }
        dbsg<cfgd> e = cfgvVar.e(dlnmVar2.g);
        if (e.a() && !e.b().c && dcbg.b(e.b().f).p(cfka.a)) {
            z = true;
        }
        this.f = z;
        mwVar.a(Boolean.valueOf(!z));
        this.i = r.h(new dbrn(this, gceVar, cqhuVar, cjnfVar, resources) { // from class: cfkb
            private final cfkh a;
            private final gce b;
            private final cqhu c;
            private final cjnf d;
            private final Resources e;

            {
                this.a = this;
                this.b = gceVar;
                this.c = cqhuVar;
                this.d = cjnfVar;
                this.e = resources;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cqtd e2;
                final cfkh cfkhVar = this.a;
                gce gceVar2 = this.b;
                final cjnf cjnfVar2 = this.d;
                final Resources resources2 = this.e;
                dllx dllxVar = (dllx) obj;
                boolean h = gceVar2.h();
                int a = dllw.a(dllxVar.d);
                if (a == 0) {
                    a = 1;
                }
                int i2 = a - 1;
                if (i2 == 2) {
                    e2 = iup.e(true != h ? R.raw.pin_entrance_active : R.raw.pin_entrance_active_dark);
                } else if (i2 != 3) {
                    e2 = iup.e(true != h ? R.raw.pin_destination_active : R.raw.pin_destination_active_dark);
                } else {
                    e2 = iup.e(true != h ? R.raw.pin_street_active : R.raw.pin_street_active_dark);
                }
                return cfhy.a(e2, dllxVar.c, new cqfc(cfkhVar, cjnfVar2, resources2) { // from class: cfkg
                    private final cfkh a;
                    private final cjnf b;
                    private final Resources c;

                    {
                        this.a = cfkhVar;
                        this.b = cjnfVar2;
                        this.c = resources2;
                    }

                    @Override // defpackage.cqfc
                    public final void a(View view, boolean z2) {
                        cfkh cfkhVar2 = this.a;
                        cjnf cjnfVar3 = this.b;
                        Resources resources3 = this.c;
                        View a2 = cqhu.a(view, cfba.a);
                        if (a2 == null || cfkhVar2.f) {
                            return;
                        }
                        cjnd i3 = cjne.i();
                        cjnb cjnbVar = (cjnb) i3;
                        cjnbVar.a = resources3.getString(R.string.UGC_POST_TRIP_MOVE_MAP_TOOL_TIP_LABEL);
                        i3.d(a2);
                        cjnbVar.d = cjkd.ABOVE;
                        cjnfVar3.a(i3.a());
                    }
                });
            }
        });
        this.k = dcdc.e();
        dccx F = dcdc.F();
        if (dlnmVar2.b == 17) {
            dlnbVar = (dlnb) dlnmVar2.c;
        } else {
            dlnbVar = dlnb.c;
        }
        for (dlna dlnaVar : dlnbVar.b) {
            dspd dspdVar = dlnmVar2.g;
            mw mwVar2 = new mw(this) { // from class: cfkc
                private final cfkh a;

                {
                    this.a = this;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    this.a.e((dspd) obj);
                }
            };
            Resources a = cfjyVar.a.a();
            cfjy.a(a, i);
            cfgv a2 = cfjyVar.b.a();
            cfjy.a(a2, 2);
            gce a3 = cfjyVar.c.a();
            cfjy.a(a3, 3);
            cfjy.a(dddiVar2, 4);
            cfjy.a(dspdVar, 5);
            cfjy.a(dlnaVar, 6);
            cfjy.a(mwVar2, 7);
            F.g(new cfjx(a, a2, a3, dddiVar, dspdVar, dlnaVar, mwVar2));
            dddiVar2 = dddiVar;
            dlnmVar2 = dlnmVar;
            i = 1;
        }
        this.k = F.f();
    }

    public static dbsg<dspd> f(dlnm dlnmVar, cfgv cfgvVar) {
        return cfgvVar.b(dlnmVar.g).h(cfkf.a);
    }

    @Override // defpackage.cfhh
    public Spanned a() {
        dlnb dlnbVar;
        dlnm dlnmVar = this.c;
        if (dlnmVar.b == 17) {
            dlnbVar = (dlnb) dlnmVar.c;
        } else {
            dlnbVar = dlnb.c;
        }
        return Html.fromHtml(dlnbVar.a);
    }

    @Override // defpackage.cfhh
    public cjtd c() {
        cjta b = cjtd.b();
        b.d = dtxy.oc;
        dddf bZ = dddg.g.bZ();
        dddi dddiVar = this.h;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddg dddgVar = (dddg) bZ.b;
        dddiVar.getClass();
        dddgVar.d = dddiVar;
        dddgVar.a |= 32;
        b.j(bZ.bK());
        return b.a();
    }

    @Override // defpackage.cfhh
    /* renamed from: d */
    public dcdc<cfhg> b() {
        return dcdc.r(this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(dspd dspdVar) {
        cfgv cfgvVar = this.a;
        dspd dspdVar2 = this.c.g;
        dbsg<cfgc> c = cfgvVar.c(dspdVar2, dspdVar);
        cfgb bZ = cfgc.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cfgc cfgcVar = (cfgc) bZ.b;
        dspdVar.getClass();
        cfgcVar.a |= 1;
        cfgcVar.b = dspdVar;
        cfgvVar.d(dspdVar2, c.c(bZ.bK()));
        this.j.run();
    }

    @Override // defpackage.cfje
    public final cflf h() {
        return new cflf(this) { // from class: cfkd
            private final cfkh a;

            {
                this.a = this;
            }

            @Override // defpackage.cflf
            public final void a() {
                cfkh cfkhVar = this.a;
                dbsg<cfgc> b = cfkhVar.a.b(cfkhVar.c.g);
                if (!b.a() || !cfkhVar.e.a()) {
                    return;
                }
                akqq akqqVar = cfkhVar.b.a().p().i;
                dpum dpumVar = cfkhVar.e.b().b;
                if (dpumVar == null) {
                    dpumVar = dpum.d;
                }
                if (akqq.v(akqq.f(dpumVar), akqqVar, 0.5d)) {
                    return;
                }
                cfgb bZ = cfgc.d.bZ();
                dspd b2 = cfkh.f(cfkhVar.c, cfkhVar.a).b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cfgc cfgcVar = (cfgc) bZ.b;
                b2.getClass();
                cfgcVar.a |= 1;
                cfgcVar.b = b2;
                dpum h = akqqVar.h();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cfgc cfgcVar2 = (cfgc) bZ.b;
                h.getClass();
                cfgcVar2.c = h;
                cfgcVar2.a |= 2;
                cfkhVar.a.d(cfkhVar.c.g, bZ.bK());
                if ((b.b().a & 2) != 0) {
                    return;
                }
                cfkhVar.d.run();
            }
        };
    }

    @Override // defpackage.cfje
    public final mw<dspd> i() {
        return new mw(this) { // from class: cfke
            private final cfkh a;

            {
                this.a = this;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.e((dspd) obj);
            }
        };
    }

    @Override // defpackage.cfje
    @dzsi
    public final cfgz j() {
        return this.i.f();
    }

    @Override // defpackage.cfje
    public final boolean l() {
        return this.f;
    }
}
