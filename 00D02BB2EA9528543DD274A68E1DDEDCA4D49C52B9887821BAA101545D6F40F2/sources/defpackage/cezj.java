package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: cezj  reason: default package */
/* loaded from: classes4.dex */
public final class cezj extends ges {
    public static final String a = String.valueOf(cezj.class.getName()).concat("-callback");
    public cezg ad;
    public cfgv ae;
    public cfgw af;
    public cezt ag;
    public araj ah;
    public cpv ai;
    private dlno aj;
    private int ak;
    public cfjn b;
    public efg c;
    public cqkj d;
    public cfjo e;
    public cjxo f;
    public ceze g;

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf c = this.d.c(new cfdo(), null);
        c.e(this.b);
        if (Build.VERSION.SDK_INT >= 28) {
            c.c().setAccessibilityPaneTitle(this.b.j());
        } else {
            new Handler().postDelayed(new Runnable(this) { // from class: cezh
                private final cezj a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cezj cezjVar = this.a;
                    cezjVar.ai.b(cezjVar.J().findViewById(16908290), cezjVar.b.j());
                }
            }, 500L);
        }
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.g.d();
        this.g.c();
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        return this.b.k();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = bundle == null ? this.o : bundle;
        cfgv cfgvVar = this.ae;
        cfgj cfgjVar = (cfgj) bvrs.e(bundle2, cfgj.class, (dssr) cfgj.h.cu(7));
        if (cfgjVar != null) {
            cfgvVar.a = cfgj.h.ca(cfgjVar);
        }
        this.ad.b();
        cezu cezuVar = (cezu) G();
        this.aj = this.ae.a();
        cfjo cfjoVar = this.e;
        dbsk.s(cezuVar);
        gga a2 = cfjoVar.a.a();
        cfjo.a(a2, 1);
        cqhn a3 = cfjoVar.b.a();
        cfjo.a(a3, 2);
        cfjb a4 = cfjoVar.c.a();
        cfjo.a(a4, 3);
        aujx a5 = cfjoVar.d.a();
        cfjo.a(a5, 4);
        cfgv a6 = cfjoVar.e.a();
        cfjo.a(a6, 5);
        ceze a7 = cfjoVar.f.a();
        cfjo.a(a7, 6);
        cfkq a8 = cfjoVar.g.a();
        cfjo.a(a8, 7);
        bvrb a9 = cfjoVar.h.a();
        cfjo.a(a9, 8);
        cezg a10 = cfjoVar.i.a();
        cfjo.a(a10, 9);
        Resources a11 = cfjoVar.j.a();
        cfjo.a(a11, 10);
        cfjo.a(cezuVar, 11);
        cfjo.a(cezj.class, 12);
        this.b = new cfjn(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, cezuVar, cezj.class);
        this.ag.a(cezt.e(this.aj));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ah.m().e();
        this.ah.m().h(amwd.OFF);
        this.ad.a.a();
        this.g.a();
        this.ak = J().getWindow().getAttributes().softInputMode;
        J().getWindow().setSoftInputMode(32);
        efg efgVar = this.c;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.y(true);
        egjVar.f(false);
        egjVar.ac();
        egjVar.e(this);
        egjVar.j(false);
        egjVar.Q(null);
        egjVar.af(true);
        egjVar.J(new egq(this) { // from class: cezi
            private final cezj a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                this.a.g.b();
            }
        });
        egf a2 = egf.a();
        a2.l(false);
        a2.r();
        a2.x = false;
        a2.j();
        a2.p();
        a2.o();
        a2.H = false;
        a2.h = ardz.NONE;
        a2.i();
        egjVar.A(a2);
        efgVar.a(egjVar.a());
        ((ckhe) this.af.a.a(ckkp.a)).c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        cfgv cfgvVar = this.ae;
        for (cfjf cfjfVar : cfgvVar.b) {
            cfjfVar.a.l(cfgvVar);
        }
        bvrs.l(bundle, cfgvVar.a.bK());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.f.b();
        this.ad.a.b();
        J().getWindow().setSoftInputMode(this.ak);
        if (Build.VERSION.SDK_INT <= 27) {
            jmw.d(J(), null);
        }
        super.u();
    }
}
