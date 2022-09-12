package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: afyl  reason: default package */
/* loaded from: classes2.dex */
public final class afyl extends ges implements akzy {
    private static final akyz ak = new afyj();
    public ahbx a;
    public cqkj ad;
    public ahbw ae;
    private cqkf<agyz> ai;
    private cqkf<agyw> aj;
    public btrm b;
    public dxio<akzh> c;
    public dxio<akox> d;
    public dxio<araj> e;
    public bvrb f;
    public efg g;
    private final afyk ah = new afyk(this);
    @dzsi
    public bvpk af = null;
    @dzsi
    private bvpk al = null;
    @dzsi
    public alad ag = null;

    @Override // defpackage.ges
    protected final void Nv() {
        ((afym) btsx.b(afym.class, this)).bR(this);
    }

    @Override // defpackage.akzy
    public final void a(alad aladVar) {
        bvpk bvpkVar = this.al;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        g();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        btrm btrmVar = this.b;
        afyk afykVar = this.ah;
        dceq a = dcet.a();
        a.b(ardp.class, new afyn(0, ardp.class, afykVar, bvrj.UI_THREAD));
        a.b(alhl.class, new afyn(1, alhl.class, afykVar, bvrj.UI_THREAD));
        a.b(alhy.class, new afyn(2, alhy.class, afykVar, bvrj.UI_THREAD));
        btrmVar.g(afykVar, a.a());
        bvqj.c(this.d.a().k, new bvqg(this) { // from class: afyf
            private final afyl a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                afyl afylVar = this.a;
                akoq akoqVar = (akoq) obj;
                if (afylVar.U()) {
                    afylVar.d.a().ab(afylVar);
                }
            }
        }, this.f.h());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        this.d.a().ac(this);
        this.b.a(this.ah);
    }

    public final void g() {
        bvpk bvpkVar = this.af;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        this.f.b(new Runnable(this) { // from class: afyg
            private final afyl a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final afyl afylVar = this.a;
                if (afylVar.ae.l()) {
                    return;
                }
                afylVar.af = bvpk.a(new Runnable(afylVar) { // from class: afyi
                    private final afyl a;

                    {
                        this.a = afylVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.ae.m();
                    }
                });
                afylVar.f.a(afylVar.af, bvrj.UI_THREAD, 500L);
            }
        }, bvrj.UI_THREAD);
    }

    public final void i(long j) {
        bvpk bvpkVar = this.al;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        bvpk a = bvpk.a(new Runnable(this) { // from class: afyh
            private final afyl a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afyl afylVar = this.a;
                akzh a2 = afylVar.c.a();
                if (a2 == null) {
                    return;
                }
                alad p = a2.p();
                alad aladVar = afylVar.ag;
                if (aladVar == null || !akqq.v(aladVar.i, p.i, 100.0d) || Math.abs(aladVar.k - p.k) / aladVar.k > 0.05d) {
                    afylVar.ag = p;
                    afylVar.i(200L);
                    return;
                }
                afylVar.g();
            }
        });
        this.al = a;
        this.f.a(a, bvrj.UI_THREAD, j);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        dkzq dkzqVar = (dkzq) this.o.getSerializable("areaFeedbackType");
        ahbx ahbxVar = this.a;
        dbsk.s(dkzqVar);
        cqhn a = ahbxVar.a.a();
        ahbx.a(a, 1);
        agwa a2 = ahbxVar.b.a();
        ahbx.a(a2, 2);
        gfq a3 = ahbxVar.c.a();
        ahbx.a(a3, 3);
        gga a4 = ahbxVar.d.a();
        ahbx.a(a4, 4);
        dxio a5 = ((dxjh) ahbxVar.e).a();
        ahbx.a(a5, 5);
        akox a6 = ahbxVar.f.a();
        ahbx.a(a6, 6);
        bvrb a7 = ahbxVar.g.a();
        ahbx.a(a7, 7);
        iwv a8 = ahbxVar.h.a();
        ahbx.a(a8, 8);
        btxv a9 = ahbxVar.i.a();
        ahbx.a(a9, 9);
        ahbx.a(dkzqVar, 10);
        ahbx.a(this, 11);
        this.ae = new ahbw(a, a2, a3, a4, a5, a6, a7, a8, a9, dkzqVar, this);
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (J() != null && configuration.orientation == 1) {
            this.ae.i();
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxu.bn;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        cqkf<agyz> e = this.ad.e(new agft());
        this.ai = e;
        e.e(this.ae);
        this.aF = this.ai.c();
        cqkf<agyw> e2 = this.ad.e(new agff());
        this.aj = e2;
        e2.e(this.ae);
        aljk aljkVar = new aljk();
        aljkVar.f = false;
        aljkVar.g = false;
        aljkVar.h = false;
        aljkVar.i = false;
        efg efgVar = this.g;
        egj egjVar = new egj(this);
        egjVar.G(this.ai.c(), 5);
        egjVar.M(this.aj.c());
        egjVar.e(this);
        egjVar.I(2);
        egjVar.ag(null);
        egjVar.w(null);
        egjVar.k(false);
        egjVar.ad(false);
        egjVar.f(false);
        egjVar.Y(true);
        egjVar.z(aljkVar);
        egf a = egf.a();
        a.g = false;
        a.x = false;
        a.l(false);
        a.q();
        a.r();
        a.l = new afwn[]{afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRANSIT, false)};
        egjVar.A(a);
        efgVar.a(egjVar.a());
        this.c.a().d = ak;
        if (!btpf.c(J()).f) {
            this.ae.i();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.ai.e(null);
        this.aj.e(null);
        this.c.a().d = null;
    }
}
