package defpackage;

import android.os.Bundle;
import android.view.View;
/* compiled from: PG */
/* renamed from: ecn  reason: default package */
/* loaded from: classes6.dex */
public final class ecn implements ebn {
    private static final dcqe b = dcqe.c("ecn");
    private static final eaow c = eaow.e(80);
    public Boolean a = false;
    private final gga d;
    private final dkfv e;
    private final dbsg<Runnable> f;
    private final jlp g;
    private final bvrb h;

    public ecn(gga ggaVar, cqhn cqhnVar, jlp jlpVar, bvrb bvrbVar, dkfv dkfvVar, @dzsi Runnable runnable) {
        this.d = ggaVar;
        this.e = dkfvVar;
        this.f = dbsg.j(runnable);
        this.g = jlpVar;
        this.h = bvrbVar;
    }

    private static dkgn m(dkfv dkfvVar) {
        dkgl dkglVar = dkfvVar.d;
        if (dkglVar == null) {
            dkglVar = dkgl.d;
        }
        int i = dkglVar.a;
        if (i >= 0) {
            dkgf dkgfVar = dkfvVar.c;
            if (dkgfVar == null) {
                dkgfVar = dkgf.c;
            }
            if (i < dkgfVar.a.size()) {
                dkgf dkgfVar2 = dkfvVar.c;
                if (dkgfVar2 == null) {
                    dkgfVar2 = dkgf.c;
                }
                dkgn dkgnVar = dkgfVar2.a.get(i).c;
                return dkgnVar == null ? dkgn.h : dkgnVar;
            }
        }
        dkgf dkgfVar3 = dkfvVar.c;
        if (dkgfVar3 == null) {
            dkgfVar3 = dkgf.c;
        }
        dkgfVar3.a.size();
        return dkgn.h;
    }

    @Override // defpackage.ebn
    public jic a() {
        dkgn m = m(this.e);
        return new jic((m.a & 8) != 0 ? m.e : m.d, ckqc.FIFE_MERGE, (cqtd) null, (int) c.b);
    }

    @Override // defpackage.ebn
    public jic b() {
        return new jic(m(this.e).d, ckqc.FIFE_MERGE, (cqtd) null, (int) c.b);
    }

    @Override // defpackage.ebn
    public String c() {
        return m(this.e).b;
    }

    @Override // defpackage.ebn
    public String d() {
        return m(this.e).c;
    }

    @Override // defpackage.ebn
    public String e() {
        dkgn m = m(this.e);
        return !m.f.isEmpty() ? m.f : !m.c.isEmpty() ? m.c : m.b;
    }

    @Override // defpackage.ebn
    public cjtd f() {
        dkfv dkfvVar = this.e;
        cjta b2 = cjtd.b();
        b2.d = dtxk.f;
        b2.g(dkfvVar.b);
        return b2.a();
    }

    @Override // defpackage.ebn
    public cqkl g() {
        if (this.f.a()) {
            this.f.b().run();
        } else {
            gga ggaVar = this.d;
            dkfv dkfvVar = this.e;
            ebu ebuVar = new ebu();
            Bundle bundle = new Bundle();
            bundle.putByteArray("arg_key_badge", dkfvVar.bS());
            ebuVar.B(bundle);
            ggaVar.D(ebuVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.ebn
    public Float h() {
        dkgl dkglVar = this.e.d;
        if (dkglVar == null) {
            dkglVar = dkgl.d;
        }
        return Float.valueOf(dkglVar.c);
    }

    @Override // defpackage.ebn
    public cqss i() {
        return cqta.e(m(this.e).g);
    }

    @Override // defpackage.ebn
    public Boolean j() {
        return this.a;
    }

    @Override // defpackage.ebn
    public Boolean k() {
        dkgl dkglVar = this.e.d;
        if (dkglVar == null) {
            dkglVar = dkgl.d;
        }
        return Boolean.valueOf(dkglVar.a > 0);
    }

    @Override // defpackage.ebn
    public void l() {
        if (!bvrj.UI_THREAD.b()) {
            bvoo.h("maybeShowMotivationOnBadge() runs on non-UI_THREAD: %s", bvrj.CURRENT.toString());
            this.h.b(new Runnable(this) { // from class: ecj
                private final ecn a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.l();
                }
            }, bvrj.UI_THREAD);
        } else if (this.a.booleanValue()) {
        } else {
            dkfv dkfvVar = this.e;
            if ((dkfvVar.a & 8) == 0) {
                return;
            }
            dkfu dkfuVar = dkfvVar.e;
            if (dkfuVar == null) {
                dkfuVar = dkfu.b;
            }
            String str = dkfuVar.a;
            final View o = cqkx.o(this);
            if (o == null || str.isEmpty()) {
                return;
            }
            jlo a = this.g.a(str, o);
            a.t(jln.GM2_BLUE);
            a.y();
            a.f(new Runnable(this) { // from class: eck
                private final ecn a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ecn ecnVar = this.a;
                    ecnVar.a = true;
                    cqkx.p(ecnVar);
                }
            }, dege.a);
            a.e(new Runnable(this, o) { // from class: ecl
                private final ecn a;
                private final View b;

                {
                    this.a = this;
                    this.b = o;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ecn ecnVar = this.a;
                    View view = this.b;
                    ecnVar.a = false;
                    cqkx.p(ecnVar);
                    view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(irf.a).start();
                }
            }, dege.a);
            a.w(cjtd.a(dtyc.aC));
            a.a();
            o.animate().scaleX(1.3f).scaleY(1.3f).setDuration(500L).setInterpolator(new ecm()).start();
        }
    }
}
