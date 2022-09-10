package defpackage;

import android.text.Html;
import android.text.Spanned;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cfju  reason: default package */
/* loaded from: classes4.dex */
public final class cfju extends cfje implements cfhb {
    public final cfgv a;
    public final dxio<akzh> b;
    public final dspd c;
    public final cfjm d;
    @dzsi
    public akqq e;
    private final dddi f;
    private final dlmv g;
    private final mw<Boolean> h;
    private final cfgz i = cfhy.a(cqrt.f(2131232027), null, null);
    private final akzt j;
    private dcdc<cfjp> k;
    private dcdc<cfjp> l;

    public cfju(cfgv cfgvVar, dxio<akzh> dxioVar, cfjq cfjqVar, dddi dddiVar, dspd dspdVar, dlmv dlmvVar, cfjm cfjmVar, mw<Boolean> mwVar) {
        cfjq cfjqVar2 = cfjqVar;
        this.a = cfgvVar;
        this.b = dxioVar;
        this.f = dddiVar;
        this.c = dspdVar;
        this.g = dlmvVar;
        this.d = cfjmVar;
        this.h = mwVar;
        this.k = dcdc.e();
        this.l = dcdc.e();
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        for (dlmh dlmhVar : dlmvVar.d) {
            boolean contains = dlmvVar.e.contains(dlmhVar.a);
            cfjm cfjmVar2 = new cfjm(this) { // from class: cfjr
                private final cfju a;

                {
                    this.a = this;
                }

                @Override // defpackage.cfjm
                public final void a(cfgd cfgdVar) {
                    cfju cfjuVar = this.a;
                    cfjuVar.m(cfgdVar);
                    cfjuVar.d.a(cfgdVar);
                }
            };
            cqhn a = cfjqVar2.a.a();
            cfjq.a(a, 1);
            dxio a2 = ((dxjh) cfjqVar2.b).a();
            cfjq.a(a2, 2);
            cfjq.a(dddiVar, 3);
            cfjq.a(dlmhVar, 4);
            cfjq.a(cfjmVar2, 5);
            cfjp cfjpVar = new cfjp(a, a2, dddiVar, dlmhVar, cfjmVar2, !contains);
            F.g(cfjpVar);
            if (contains) {
                F2.g(cfjpVar);
            }
            cfjqVar2 = cfjqVar;
        }
        this.k = F.f();
        this.l = F2.f();
        this.j = new cfjt(this, dxioVar);
        dbsg<cfgd> e = cfgvVar.e(dspdVar);
        if (!e.a() || e.b().c) {
            return;
        }
        m(e.b());
        g();
    }

    @Override // defpackage.cfhb
    public Spanned a() {
        return Html.fromHtml(this.g.b);
    }

    @Override // defpackage.cfhb
    @dzsi
    public String b() {
        dlmv dlmvVar = this.g;
        if ((dlmvVar.a & 2) != 0) {
            return dlmvVar.c;
        }
        return null;
    }

    @Override // defpackage.cfhb
    public List<cfha> c() {
        return dcdc.r(this.k);
    }

    @Override // defpackage.cfhb
    @dzsi
    public cfha d() {
        return null;
    }

    @Override // defpackage.cfhb
    public cjtd e() {
        cjta b = cjtd.b();
        b.d = dtxy.ob;
        dddf bZ = dddg.g.bZ();
        dddi dddiVar = this.f;
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

    @Override // defpackage.cfhb
    public Boolean f() {
        return false;
    }

    public final void g() {
        dcdc<cfjp> dcdcVar = this.l;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cfjp cfjpVar = dcdcVar.get(i);
            boolean z = cfjpVar.b;
            cfjpVar.b = true;
            if (!z) {
                cqhn cqhnVar = cfjpVar.a;
                cqkx.p(cfjpVar);
            }
        }
        this.h.a(false);
    }

    @Override // defpackage.cfje
    public final cflf h() {
        return new cflf(this) { // from class: cfjs
            private final cfju a;

            {
                this.a = this;
            }

            @Override // defpackage.cflf
            public final void a() {
                cfju cfjuVar = this.a;
                if (cfjuVar.e == null) {
                    return;
                }
                akqq akqqVar = cfjuVar.b.a().p().i;
                if ((cfjuVar.a.e(cfjuVar.c).c(cfgd.h).a & 4) == 0 && akqq.v(cfjuVar.e, akqqVar, 0.5d)) {
                    return;
                }
                cfga bZ = cfgd.h.bZ();
                dpum h = akqqVar.h();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cfgd cfgdVar = (cfgd) bZ.b;
                h.getClass();
                cfgdVar.e = h;
                cfgdVar.a |= 4;
                cfgd bK = bZ.bK();
                cfjuVar.a.f(cfjuVar.c, bK);
                cfjuVar.g();
                cfjuVar.m(bK);
            }
        };
    }

    @Override // defpackage.cfje
    @dzsi
    public final cfgz j() {
        return this.i;
    }

    @Override // defpackage.cfje
    @dzsi
    public final akzt k() {
        return this.j;
    }

    public final void m(cfgd cfgdVar) {
        dspd dspdVar = cfgdVar.b;
        dcdc<cfjp> dcdcVar = this.k;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cfjp cfjpVar = dcdcVar.get(i);
            cfjpVar.f(cfjpVar.g().equals(dspdVar));
        }
    }
}
