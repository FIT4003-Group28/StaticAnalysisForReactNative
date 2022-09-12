package defpackage;

import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
/* compiled from: PG */
/* renamed from: aswz  reason: default package */
/* loaded from: classes2.dex */
public final class aswz extends ges implements asxu, asmm, egq {
    public Application a;
    public ckcq aA;
    public boolean aB;
    private boolean aO;
    private boolean aP;
    @dzsi
    private aswk aQ;
    @dzsi
    private cqkf<aszo> aR;
    @dzsi
    private cqkf<asuq> aS;
    @dzsi
    private cqkf<aszo> aT;
    private asml aU;
    private ckcq aV;
    public gfq ad;
    public dxio<glj> ae;
    public asxg af;
    public crfm ag;
    public asmi ah;
    public atop ai;
    public cjxo aj;
    public bvjj ak;
    public bwqv al;
    public asxt am;
    public asxw an;
    public efg ao;
    public cqkj ap;
    public ckrp aq;
    public asik ar;
    public bvrb as;
    public cjqq at;
    public ckrh au;
    public atbs av;
    public dzsj<askx> aw;
    public boolean ax;
    @dzsi
    public aszm ay;
    public ckcq az;
    public ckcw b;
    public btvo c;
    public cqat d;
    public dzsj<aswk> e;
    public dxio<qbt> f;
    public btrm g;
    private final Application.ActivityLifecycleCallbacks aW = new aswx(this);
    private final gj aX = new aswp(this);
    final asxv aC = new aswy(this);
    private final acyt aY = new aswv(this);
    private final asww aZ = new asww();

    @Override // defpackage.ges
    protected final void Nv() {
        dxix.a(this);
    }

    @Override // defpackage.asxu
    public final void PZ() {
        aJ(new aswr(this));
    }

    @Override // defpackage.asmn
    public final void Qa() {
        this.ax = false;
        if (this.aD) {
            this.az.b();
            this.aq.d();
            this.ag.d(true);
        }
    }

    @Override // defpackage.asmn
    public final void Qb(aste asteVar) {
        if (asteVar.q() == 2) {
            this.au.x(3);
        }
        if (asteVar.q() == 3) {
            this.au.y(3);
        }
        this.an.h(asteVar);
    }

    @Override // defpackage.asmn
    public final void Qc() {
        this.an.j();
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        this.aU.Qs(eguVar);
        this.aw.a().n();
    }

    final void aJ(Runnable runnable) {
        if (!this.aD) {
            return;
        }
        this.as.b(new aswu(this, runnable), bvrj.UI_THREAD);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void aj(Bundle bundle) {
        super.aj(bundle);
        if (this.aO) {
            return;
        }
        this.aO = true;
        if (this.aQ == null) {
            this.aQ = this.e.a();
        }
        this.aQ.NZ(bundle);
        this.ak.Z(bvjk.aW, this.d.b());
        aszs aszsVar = this.aQ.a;
        this.aS.e(aszsVar.n());
        this.aR.e(aszsVar);
        this.aT.e(aszsVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        if (this.aO) {
            this.aS.e(null);
            this.aR.e(null);
            this.aT.e(null);
            aswk aswkVar = this.aQ;
            if (aswkVar != null) {
                aswkVar.Qp();
            }
        }
        this.aj.b();
        this.ah.d();
        this.a.unregisterActivityLifecycleCallbacks(this.aW);
        J().g().m(this.aX);
    }

    @Override // defpackage.ges
    public final achc bk() {
        return achc.DIRECTION_PAGE;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (!this.ae.a().h() && !this.aq.d() && !this.ai.c()) {
            aszm aszmVar = this.ay;
            if (aszmVar.e != null) {
                this.an.j();
                return true;
            } else if (aszmVar.c.a != asld.FOLLOWING) {
                this.an.E();
                return true;
            } else {
                Qa();
                if (((asio) this.ar).b) {
                    this.aE.finish();
                }
                return true;
            }
        }
        return true;
    }

    public final void g() {
        if (this.aD) {
            boolean b = btpf.b(this.aE);
            egj egjVar = new egj(this);
            aefv aefvVar = null;
            egjVar.w(null);
            boolean z = false;
            egjVar.k(false);
            egjVar.ad(!b);
            egjVar.f(false);
            egjVar.J(this);
            egjVar.ag(null);
            egjVar.l(this.aS.c(), true);
            egjVar.e(this.ai.f);
            egjVar.F(this.aR.c());
            aszm aszmVar = this.ay;
            if (aszmVar != null && aszmVar.b()) {
                egk egkVar = new egk();
                egkVar.a(this.aR.c());
                View a = this.ai.a();
                aszs aszsVar = this.aQ.a;
                egjVar.m(egkVar);
                egjVar.o(cjxf.LARGE);
                egjVar.aw(a, false);
                dqvj dqvjVar = this.ay.l.f;
                if (this.ai.b == null) {
                    z = true;
                }
                egjVar.A(egf.e(dqvjVar, z, aszsVar.u()));
                if (this.ax && !this.aP && this.c.getNavigationParameters().B() && a == null && this.am.b()) {
                    aefvVar = this.am.a();
                }
                egjVar.H(aefvVar);
                egjVar.m(aszsVar.x());
                egjVar.p();
            } else {
                if (((asio) this.ar).b) {
                    egjVar.af(true);
                }
                egjVar.A(egf.e(dqvj.DRIVE, false, null));
            }
            this.ao.a(egjVar.a());
            this.aU.b();
        }
    }

    public final void i() {
        this.az.a();
        this.aV.a();
        this.aA.a();
    }

    @Override // defpackage.asxu
    public final void j(aszm aszmVar) {
        this.ay = aszmVar;
        g();
    }

    @Override // defpackage.asxu
    public final void k() {
        aJ(new aswq(this));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.aU = new asml();
        if (anac.d) {
            this.aj.a(13);
        }
        this.aS = this.ap.c(new aspn(), null);
        this.aR = this.ap.e(new asyu());
        this.aT = this.ap.e(new asyg());
        asmi asmiVar = this.ah;
        arym arymVar = arym.FREE_NAV;
        asmiVar.e();
        this.az = ((ckcr) this.b.a(ckhi.O)).a();
        this.aV = ((ckcr) this.b.a(ckhi.P)).a();
        this.aA = ((ckcr) this.b.a(ckhi.Q)).a();
        this.a.registerActivityLifecycleCallbacks(this.aW);
        J().g().l(this.aX);
    }

    @Override // defpackage.asmn
    public final void m() {
        k();
    }

    @Override // defpackage.asxu
    public final void n() {
        this.ax = false;
        this.aP = false;
        this.az.b();
        this.aV.b();
        this.ai.d();
        this.aq.d();
        aJ(new asws(this));
    }

    @Override // defpackage.asxu
    public final void o(amvh amvhVar, amuh amuhVar, @dzsi dpfh dpfhVar) {
        this.aP = true;
        if (((asio) this.ar).b) {
            amub k = amuhVar.k();
            crfm crfmVar = this.ag;
            crfn a = crfn.a(k.d());
            a.d = k.c;
            a.k = dpfhVar == null ? null : dpfhVar.f;
            crfmVar.c(a.c());
            return;
        }
        this.g.b(new crid(amvhVar, amuhVar, dpfhVar));
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.aO) {
            return;
        }
        this.aQ.Qo(configuration);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxp.aE;
    }

    @Override // defpackage.asmn
    public final void q() {
        this.ai.d();
        aJ(new aswt(this));
    }

    @Override // defpackage.asmn
    public final void r() {
        this.ai.b();
        g();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (!this.ax) {
            i();
            this.ax = true;
        }
        if (!this.aO) {
            return;
        }
        this.ae.a().c();
        this.f.a().f().h();
        btrm btrmVar = this.g;
        asww aswwVar = this.aZ;
        dceq a = dcet.a();
        a.b(crhd.class, new asxa(crhd.class, aswwVar, bvrj.UI_THREAD));
        btrmVar.g(aswwVar, a.a());
        this.an.F(this.aC);
        this.aQ.b();
        if (this.c.getNavigationParameters().B()) {
            this.am.a().l(this.aY);
        }
        dbsk.t(this.ay, "currentState");
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        aswk aswkVar = this.aQ;
        if (aswkVar != null) {
            aswkVar.Qr(bundle);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        if (!this.aO) {
            return;
        }
        if (this.c.getNavigationParameters().B()) {
            this.am.a().m(this.aY);
        }
        this.aQ.c();
        this.an.G(this.aC);
        this.g.a(this.aZ);
        super.u();
    }

    @Override // defpackage.asmm
    public final void v(Runnable runnable) {
        if (!this.aD) {
            return;
        }
        this.aU.c(runnable);
    }

    @Override // defpackage.asmm
    public final /* bridge */ /* synthetic */ asmp w() {
        return this.an;
    }

    @Override // defpackage.asmn
    public final void y() {
        throw null;
    }
}
