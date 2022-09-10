package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aske  reason: default package */
/* loaded from: classes2.dex */
public final class aske extends itb implements ascb {
    public final gga a;
    public final cjqy b;
    public final asik c;
    public final ckrh d;
    @dzsi
    public crhp e;
    private final ckcw f;
    private final btvo g;
    private final dxio<qbt> h;
    private final vxa i;
    private final btrm j;
    private final asjp k;
    private final bvrb o;
    private final askd p;
    private final cklq q;
    private final ckmm r;
    private final ckml s;
    private final brlz t;
    private final ashf u;
    private final arnd v;
    private final cjmt w;
    private final akfa x;
    private final cjvm y;
    private final askc z = new askc();
    private final cjqv A = new askb(this);

    public aske(gga ggaVar, ckcw ckcwVar, btvo btvoVar, dxio<qbt> dxioVar, vxa vxaVar, btrm btrmVar, asjp asjpVar, bvrb bvrbVar, cjqy cjqyVar, cklq cklqVar, asik asikVar, ckmm ckmmVar, ckml ckmlVar, brlz brlzVar, ashf ashfVar, arnd arndVar, cjmt cjmtVar, ckrh ckrhVar, akfa akfaVar, cjvm cjvmVar) {
        this.a = ggaVar;
        this.f = ckcwVar;
        this.g = btvoVar;
        this.h = dxioVar;
        this.i = vxaVar;
        this.j = btrmVar;
        this.k = asjpVar;
        this.o = bvrbVar;
        this.p = new askd(ckcwVar);
        this.b = cjqyVar;
        this.q = cklqVar;
        this.c = asikVar;
        this.r = ckmmVar;
        this.s = ckmlVar;
        this.t = brlzVar;
        this.u = ashfVar;
        this.v = arndVar;
        this.w = cjmtVar;
        this.d = ckrhVar;
        this.x = akfaVar;
        this.y = cjvmVar;
    }

    private final boolean B() {
        crhp crhpVar = this.e;
        return crhpVar != null && crhpVar.d();
    }

    private final boolean C() {
        crhp crhpVar = this.e;
        return crhpVar != null && crhpVar.f();
    }

    private final void D(asca ascaVar) {
        askd askdVar = this.p;
        ckhg ckhgVar = ascaVar.n;
        if (ckhgVar != null) {
            askdVar.b = ((ckcr) askdVar.a.a(ckhgVar)).a();
            askdVar.b.a();
        }
        this.y.a(this.z);
    }

    private final void E() {
        this.y.b(this.z);
        Long a = asjx.a(this.z.b());
        if (a != null) {
            ((ckcp) this.f.a(ckhi.aW)).a(a.longValue());
        }
        this.z.c();
    }

    private static void F(asmm asmmVar, Runnable runnable) {
        asmmVar.v(runnable);
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        btrm btrmVar = this.j;
        dceq a = dcet.a();
        a.b(crhp.class, new askf(crhp.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        this.b.z(this.A);
        if (Build.VERSION.SDK_INT < 28 || !this.g.getAssistantParameters().b) {
            return;
        }
        ashf ashfVar = this.u;
        btrm btrmVar2 = ashfVar.b;
        ashe asheVar = ashfVar.c;
        dceq a2 = dcet.a();
        a2.b(crhd.class, new ashg(0, crhd.class, asheVar, bvrj.UI_THREAD));
        a2.b(crhp.class, new ashg(1, crhp.class, asheVar, bvrj.UI_THREAD));
        btrmVar2.g(asheVar, a2.a());
        ashfVar.e.a().i().d(ashfVar.k, ashfVar.d);
        ashfVar.j = true;
        ashfVar.g.setLayoutParams(new ViewGroup.LayoutParams(-1, ashfVar.h));
        arnd arndVar = this.v;
        gga ggaVar = this.a;
        cjmt cjmtVar = this.w;
        arndVar.f = ggaVar;
        arndVar.g = cjmtVar;
        if (!arndVar.e.b()) {
            return;
        }
        cpwx cpwxVar = arndVar.d;
        String valueOf = String.valueOf(ggaVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("#registerNavigationClientActivityLifecycleCallbacks: ");
        sb.append(valueOf);
        sb.toString();
        dbsg<Activity> b = cpwxVar.d.b();
        if (!b.a() || b.b() != ggaVar) {
            cpwxVar.d.d(dbsg.i(ggaVar));
        }
        cpwxVar.l = new cpxg(cpwxVar.c, cpwxVar.d);
        ((Application) cpwxVar.c).registerActivityLifecycleCallbacks(cpwxVar.l);
        arndVar.i = true;
    }

    @Override // defpackage.itb
    public final void Nu() {
        this.j.a(this);
        this.b.A(this.A);
        if (Build.VERSION.SDK_INT >= 28 && this.g.getAssistantParameters().b) {
            ashf ashfVar = this.u;
            if (ashfVar.j) {
                ashfVar.b.a(ashfVar.c);
                ashfVar.e.a().i().c(ashfVar.k);
                ashfVar.j = false;
            }
            arnd arndVar = this.v;
            gga ggaVar = arndVar.f;
            if (ggaVar != null && arndVar.i) {
                cpwx cpwxVar = arndVar.d;
                String valueOf = String.valueOf(ggaVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
                sb.append("#unregisterNavigationClientActivityLifecycleCallbacks: ");
                sb.append(valueOf);
                sb.toString();
                cpxg cpxgVar = cpwxVar.l;
                if (cpxgVar != null) {
                    ((Application) cpwxVar.c).unregisterActivityLifecycleCallbacks(cpxgVar);
                }
                dbsg<Activity> b = cpwxVar.d.b();
                if (b.a() && b.b() == ggaVar) {
                    cpwxVar.d.d(dbpy.a);
                }
                arndVar.i = false;
            }
            arndVar.f = null;
            arndVar.g = null;
        }
        super.Nu();
    }

    @Override // defpackage.ascb
    public final void a(amte amteVar, int i, asca ascaVar, boolean z) {
        D(ascaVar);
        this.a.D(new asjl(asjo.b(this.i, amteVar, i, (awpl.a(this.g) || cfnr.f(this.g)) && ascaVar == asca.DIRECTIONS, ascaVar == asca.DIRECTIONS || ascaVar == asca.COMMUTE_IMMERSIVE, z, false)));
    }

    @Override // defpackage.ascb
    public final void d(qcz qczVar, asca ascaVar) {
        amte n;
        D(ascaVar);
        dbsg dbsgVar = (dbsg) qczVar.Op(this.k);
        if (dbsgVar.a()) {
            qbn n2 = qczVar.n();
            if (n2 != null && (n = n2.a().n()) != null) {
                amsy amsyVar = n.a;
                ddqn bZ = ddqo.f.bZ();
                boolean t = amsyVar.t();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddqo ddqoVar = (ddqo) bZ.b;
                ddqoVar.a |= 128;
                ddqoVar.c = t;
                dovb s = amsyVar.s();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddqo ddqoVar2 = (ddqo) bZ.b;
                ddqoVar2.d = s.i;
                int i = ddqoVar2.a | 256;
                ddqoVar2.a = i;
                ddqoVar2.e = n.b.k;
                ddqoVar2.a = i | 512;
                boolean z = !amsyVar.d();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddqo ddqoVar3 = (ddqo) bZ.b;
                ddqoVar3.a |= 64;
                ddqoVar3.b = z;
                ddqo bK = bZ.bK();
                cjta b = cjtd.b();
                b.d = dtxn.cQ;
                amve m = amsyVar.m(amsyVar.o());
                if (m != null) {
                    b.g(m.m());
                } else {
                    b.b = amsyVar.c();
                }
                b.o(bK);
                this.b.o(b.a());
            }
            this.a.D(new asjl((asjo) dbsgVar.b()));
            return;
        }
        E();
        this.p.b = null;
        if (qczVar.d()) {
            return;
        }
        this.h.a().m(qczVar);
    }

    @Override // defpackage.ascb
    public final void e() {
        boolean z;
        askd askdVar = this.p;
        ckcq ckcqVar = askdVar.b;
        if (ckcqVar != null) {
            ckcqVar.b();
            askdVar.b = null;
            z = true;
        } else {
            z = false;
        }
        E();
        this.q.c(cklt.NAVIGATION);
        this.s.e(ckoi.NAVIGATION);
        if (z) {
            this.r.e(cwsv.a("NavigationStartEvent"));
        }
    }

    @Override // defpackage.ascb
    public final void f(asbz asbzVar) {
        if (!this.g.getNavigationParameters().A()) {
            gga ggaVar = this.a;
            Toast.makeText(ggaVar, ggaVar.getString(R.string.DRIVING_MODE_NOT_AVAILABLE), 1).show();
            return;
        }
        asjo asjoVar = new asjo();
        asjoVar.q = crfn.b(asbzVar).c();
        this.a.D(new asjl(asjoVar));
    }

    @Override // defpackage.ascb
    public final boolean g() {
        crhp crhpVar = this.e;
        return crhpVar != null && crhpVar.b();
    }

    @Override // defpackage.ascb
    @dzsi
    public final dqvj h() {
        crhp crhpVar = this.e;
        if (crhpVar == null) {
            return null;
        }
        if (crhpVar.d()) {
            return this.e.e().g().a.h;
        }
        if (!this.e.f()) {
            return null;
        }
        return this.e.g().f;
    }

    @Override // defpackage.ascb
    public final boolean i() {
        final asmm t = t();
        if (t == null || !t.bb()) {
            return false;
        }
        F(t, new Runnable(t) { // from class: asjy
            private final asmm a;

            {
                this.a = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.w().z();
            }
        });
        return true;
    }

    @Override // defpackage.ascb
    public final boolean j() {
        final asmm t = t();
        if (t == null || !t.bb()) {
            return false;
        }
        t.w().x();
        F(t, new Runnable(t) { // from class: asjz
            private final asmm a;

            {
                this.a = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.w().v();
            }
        });
        return true;
    }

    @Override // defpackage.ascb
    public final boolean k() {
        atct atctVar;
        if (!B() || (atctVar = (atct) this.a.z(atbq.class)) == null || !atctVar.bb()) {
            return false;
        }
        atctVar.Ql();
        return true;
    }

    @Override // defpackage.ascb
    public final void l(final aste asteVar) {
        this.o.b(new Runnable(this, asteVar) { // from class: aska
            private final aske a;
            private final aste b;

            {
                this.a = this;
                this.b = asteVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aske askeVar = this.a;
                aste asteVar2 = this.b;
                int i = 0;
                if (askeVar.g()) {
                    asmm t = askeVar.t();
                    if (t != null) {
                        t.Qb(asteVar2);
                    } else if (((asio) askeVar.c).b) {
                        askeVar.a.w();
                        fd H = askeVar.a.g().H(gfu.ACTIVITY_FRAGMENT.c);
                        if (H instanceof asmm) {
                            ((asmm) H).Qb(asteVar2);
                        }
                    } else {
                        i = 5;
                    }
                } else {
                    i = 4;
                }
                if (i != 0) {
                    if (asteVar2.q() == 2) {
                        askeVar.d.x(i);
                    } else if (asteVar2.q() != 3) {
                    } else {
                        askeVar.d.y(i);
                    }
                }
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.ascb
    public final boolean m() {
        asmm t = t();
        if (t == null || !t.bb() || !t.w().n()) {
            return false;
        }
        t.w().j();
        return true;
    }

    @Override // defpackage.ascb
    public final boolean n() {
        this.r.e(cwsv.a("NavigationEndEvent"));
        asmm t = t();
        if (t == null || !t.bb()) {
            return false;
        }
        t.Qa();
        return true;
    }

    @Override // defpackage.ascb
    public final void o(dqkr dqkrVar) {
        this.j.b(new crin(dbsg.i(dqkrVar), false, aryv.a));
    }

    @Override // defpackage.ascb
    public final boolean p() {
        return ashb.a(this.t.g, this.c, this.x);
    }

    @Override // defpackage.ascb
    public final atby q(cqkj cqkjVar) {
        return new atby(this, cqkjVar, this.a.getResources());
    }

    @Override // defpackage.ascb
    public final void r(amte amteVar, int i) {
        if (amteVar.c(i) == dqvj.WALK) {
            amtd amtdVar = new amtd(amteVar);
            duqc j = amteVar.j();
            dsqp dsqpVar = (dsqp) j.cu(5);
            dsqpVar.bC(j);
            duqb duqbVar = (duqb) dsqpVar;
            if (duqbVar.c) {
                duqbVar.bF();
                duqbVar.c = false;
            }
            duqc.c((duqc) duqbVar.b);
            amtdVar.b(duqbVar.bK());
            this.a.D(new asjl(asjo.b(this.i, amtdVar.a(), i, false, true, false, false)));
        }
    }

    @Override // defpackage.ascb
    public final void s() {
        asmm t;
        if ((B() || C()) && (t = t()) != null && t.bb()) {
            t.m();
        }
    }

    @dzsi
    public final asmm t() {
        if (B()) {
            return (asmm) this.a.z(atbq.class);
        }
        if (!C()) {
            return null;
        }
        return (asmm) this.a.z(aswz.class);
    }
}
