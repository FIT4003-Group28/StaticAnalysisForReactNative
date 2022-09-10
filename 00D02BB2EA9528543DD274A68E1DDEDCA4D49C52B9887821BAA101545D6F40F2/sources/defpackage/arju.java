package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: arju  reason: default package */
/* loaded from: classes2.dex */
public final class arju extends ges {
    public static final String a = gfu.b(arju.class, gfu.ACTIVITY_FRAGMENT, new gfs[0]);
    public arkr ad;
    public cjxo ae;
    public btrm af;
    public crow ag;
    public czz ah;
    @dzsi
    public ascc ai;
    private cqkf<army> aj;
    private cqkf<arna> ak;
    private final arjt al = new arjt(this);
    public efg b;
    public cqkj c;
    public army d;
    public arna e;
    public arkp f;
    public dxio<arkd> g;

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        if (this.ah.k()) {
            return;
        }
        this.ah.d();
        btrm btrmVar = this.af;
        dceq a2 = dcet.a();
        a2.b(ascc.class, new arjv(ascc.class, this));
        btrmVar.g(this, a2.a());
        this.af.a(this);
        this.af.b(ascc.a);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        if (this.ah.k()) {
            this.ah.e();
        }
        ascc asccVar = this.ai;
        if (asccVar != null) {
            this.af.b(asccVar);
        }
        this.ai = null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        this.f.f();
        this.ah.f();
        this.ah.n(null);
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        this.g.a().c();
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.aj = this.c.c(new armd(), null);
        this.ak = this.c.c(new arms(), null);
        this.f.a(bundle);
        arkr arkrVar = this.ad;
        arjt arjtVar = this.al;
        bvrj.UI_THREAD.c();
        arkrVar.e = arjtVar;
        this.ah.n(new View.OnClickListener(this) { // from class: arjr
            private final arju a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e();
            }
        });
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f.e(configuration);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxw.G;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        crow crowVar = this.ag;
        int e = crowVar.d > 0 ? (int) (crowVar.a.e() - crowVar.d) : 0;
        ddnr bZ = ddns.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddns ddnsVar = (ddns) bZ.b;
        ddnsVar.a |= 1;
        ddnsVar.b = e;
        ddnp ddnpVar = crowVar.b;
        if ((((ddnq) ddnpVar.b).a & 4) == 0) {
            if (ddnpVar.c) {
                ddnpVar.bF();
                ddnpVar.c = false;
            }
            ddnq ddnqVar = (ddnq) ddnpVar.b;
            ddnqVar.a |= 4;
            ddnqVar.d = e;
        }
        crowVar.e = bZ;
        this.aj.e(this.d);
        this.ak.e(this.e);
        this.f.b();
        if (!this.aD) {
            return;
        }
        this.ae.a(1);
        ViewGroup viewGroup = (ViewGroup) this.ak.c();
        viewGroup.addView(this.ah.a(), 0, new ViewGroup.LayoutParams(-1, -1));
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(viewGroup);
        egjVar.x(new djc());
        egjVar.J(new egq(this) { // from class: arjs
            private final arju a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                this.a.e.i(false);
            }
        });
        egjVar.f(false);
        egjVar.av(this.aj.c());
        egf d = egf.d(dqvj.WALK);
        d.h = ardz.NONE;
        d.k();
        egjVar.A(d);
        this.b.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.f.d(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.f.c();
        ((ViewGroup) this.ak.c()).removeView(this.ah.a());
        this.aj.e(null);
        this.ak.e(null);
        this.ae.b();
        crow crowVar = this.ag;
        ddnr ddnrVar = crowVar.e;
        if (ddnrVar == null) {
            return;
        }
        int e = ((int) (crowVar.a.e() - crowVar.d)) - ((ddns) ddnrVar.b).b;
        if (ddnrVar.c) {
            ddnrVar.bF();
            ddnrVar.c = false;
        }
        ddns ddnsVar = (ddns) ddnrVar.b;
        ddnsVar.a |= 2;
        ddnsVar.c = e;
        ddnp ddnpVar = crowVar.b;
        int i = ((ddnq) ddnpVar.b).e + e;
        if (ddnpVar.c) {
            ddnpVar.bF();
            ddnpVar.c = false;
        }
        ddnq ddnqVar = (ddnq) ddnpVar.b;
        ddnqVar.a |= 8;
        ddnqVar.e = i;
        crowVar.c.add(ddnrVar.bK());
        crowVar.e = null;
    }
}
