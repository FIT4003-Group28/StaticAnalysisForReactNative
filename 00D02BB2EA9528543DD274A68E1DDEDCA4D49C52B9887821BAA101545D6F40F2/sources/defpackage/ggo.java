package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ggo  reason: default package */
/* loaded from: classes6.dex */
public abstract class ggo extends ges implements egq {
    public bwqv a;
    public dxio<akox> ad;
    public cpv ae;
    public afwp af;
    @dzsi
    public ilo ag;
    protected dnqb ah;
    public View ai;
    @dzsi
    public cryz<akoq> aj;
    @dzsi
    public hwb ak;
    private final alht al = new ggm(this);
    public efg b;
    public ggr c;
    public Executor d;
    public dxio<hwe> e;
    public cjqy f;
    public alhv g;

    private final void bD(boolean z) {
        if (this.ag == null) {
            this.c.c("", "");
            return;
        }
        this.c.c(bt(), bu());
        if (!z) {
            return;
        }
        this.ae.f(this.ai, bv());
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        this.aj = bvqj.d(this.ad.a().k, new bvqg(this) { // from class: ggl
            private final ggo a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                akqq aj;
                ggo ggoVar = this.a;
                akoq akoqVar = (akoq) obj;
                if (!ggoVar.aD) {
                    return;
                }
                ilo iloVar = ggoVar.ag;
                if (iloVar != null && (aj = iloVar.aj()) != null && ggoVar.aS()) {
                    ggoVar.ak = ggoVar.e.a().i(akpp.o(aj), true);
                }
                ggoVar.br();
                ggoVar.aj = null;
            }
        }, this.d);
    }

    protected boolean aJ() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public egf aR() {
        egf a = egf.a();
        a.l(false);
        a.r();
        a.H = true;
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean aS() {
        return true;
    }

    @dzsi
    protected cjtd aT() {
        return null;
    }

    @dzsi
    protected cjtd aU() {
        return null;
    }

    @dzsi
    protected cjtd aV() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void aX();

    @Override // defpackage.fd
    public View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        View bp = bp();
        this.ai = bp;
        return bp;
    }

    @Override // defpackage.ges, defpackage.fd
    public void am() {
        super.am();
        cryz<akoq> cryzVar = this.aj;
        if (cryzVar != null) {
            cryzVar.c();
            this.aj = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bA(boolean z) {
        this.c.l(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean bB(alhr alhrVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bC() {
        this.c.s(true);
    }

    public void bn() {
        if (!this.aD) {
            return;
        }
        this.A.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bo() {
    }

    protected View bp() {
        return this.c.a(g(), i(), q(), w(), Rp(R.string.CANCEL_BUTTON), new Runnable(this) { // from class: ggh
            private final ggo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.bn();
            }
        }, new Runnable(this) { // from class: ggi
            private final ggo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ggo ggoVar = this.a;
                if (!ggoVar.aD) {
                    return;
                }
                ggoVar.aX();
            }
        }, new Runnable(this) { // from class: ggj
            private final ggo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ggo ggoVar = this.a;
                if (!ggoVar.aD) {
                    return;
                }
                ggoVar.bo();
            }
        }, new Runnable(this) { // from class: ggk
            private final ggo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.e();
            }
        }, aT(), aU(), aV(), this.f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public View bq() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void br() {
        akqq aj;
        ilo iloVar = this.ag;
        if (iloVar == null || (aj = iloVar.aj()) == null) {
            return;
        }
        this.ad.a().p(akyt.g(aj));
    }

    public void bs() {
        bD(true);
    }

    protected String bt() {
        return bw();
    }

    protected String bu() {
        return "";
    }

    public final String bv() {
        if (!this.aD) {
            return bt();
        }
        bvsi bvsiVar = new bvsi(H());
        bvsiVar.d(bt());
        String bu = bu();
        if (!dbsj.d(bu)) {
            bvsiVar.d(bu);
        }
        return bvsiVar.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String bw() {
        doay doayVar = doay.TYPE_ROAD;
        int ordinal = this.ag.ce().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.ag.ch();
            }
            if (ordinal == 2) {
                return this.ag.ci();
            }
            if (ordinal == 3) {
                return this.ag.cj();
            }
            if (ordinal == 4) {
                return this.ag.cf();
            }
            return this.ag.n();
        }
        return this.ag.cg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bx() {
        this.c.d();
    }

    public final void by(boolean z) {
        this.c.e(z);
    }

    public final void bz(boolean z) {
        this.c.f(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String g();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String i();

    @Override // defpackage.ges, defpackage.fd
    public void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        try {
            this.ag = (ilo) this.a.d(ilo.class, bundle, "placemark");
            this.ah = dnqb.b(bundle.getInt("rdp_entry point_type"));
        } catch (IOException e) {
            dbue.b(e.getCause() == null ? e : e.getCause());
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            throw new RuntimeException(th);
        }
    }

    protected int q() {
        return 1;
    }

    @Override // defpackage.ges, defpackage.fd
    public void s() {
        super.s();
        this.g.b(this.al);
        ggn ggnVar = new ggn(this);
        egj egjVar = new egj(this);
        egjVar.ad(false);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(null);
        egjVar.F(this.ai);
        egjVar.aw(bq(), false);
        egjVar.A(aR());
        egjVar.e(ggnVar);
        egjVar.I(2);
        egjVar.J(this);
        egjVar.k(true);
        if (aJ()) {
            egjVar.c(this.af.f());
        }
        this.b.a(egjVar.a());
        this.c.b();
        if (this.ag != null) {
            bD(false);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public void t(Bundle bundle) {
        super.t(bundle);
        ilo iloVar = this.ag;
        if (iloVar != null) {
            this.a.c(bundle, "placemark", iloVar);
        }
        bundle.putInt("rdp_entry point_type", this.ah.ah);
    }

    @Override // defpackage.ges, defpackage.fd
    public void u() {
        this.g.c(this.al);
        if (this.ak != null) {
            this.e.a().j(this.ak);
        }
        super.u();
    }

    protected abstract String w();
}
