package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atmr  reason: default package */
/* loaded from: classes2.dex */
public class atmr implements atng, jng, atnd, atof, jco {
    private final Callable<Boolean> A;
    private List<atmk> B;
    private List<atmk> C;
    @dzsi
    private atmk D;
    @dzsi
    private String E;
    @dzsi
    private Runnable F;
    private final btrm G;
    private final boolean H;
    private final boolean I;
    private final cpv J;
    protected final atcw a;
    protected final Context b;
    @dzsi
    protected atlq c;
    public final astx d;
    public boolean e;
    public boolean f;
    public boolean g;
    private final atcu h;
    private final cjqy i;
    private final atml j;
    private final asuc k;
    private final egk l;
    private final dxio<cref> m;
    private final Executor n;
    private final boolean o;
    @dzsi
    private final atmz p;
    @dzsi
    private final ashh q;
    @dzsi
    private final ashf r;
    @dzsi
    private final cjyh s;
    @dzsi
    private final astr t;
    @dzsi
    private asub u;
    @dzsi
    private cray v;
    @dzsi
    private amuo w;
    private boolean x;
    private final boolean y;
    private boolean z;

    public atmr(atcu atcuVar, atcw atcwVar, Context context, cjqy cjqyVar, @dzsi astu astuVar, @dzsi asuh asuhVar, @dzsi arre arreVar, @dzsi crem cremVar, atml atmlVar, @dzsi dzsj<ckrp> dzsjVar, btvo btvoVar, btrm btrmVar, dxio<cref> dxioVar, Executor executor, @dzsi atmz atmzVar, @dzsi brlz brlzVar, @dzsi ashh ashhVar, @dzsi ashf ashfVar, @dzsi cjyh cjyhVar, @dzsi asik asikVar, @dzsi akfa akfaVar, @dzsi akpl akplVar, @dzsi asuc asucVar, cqhn cqhnVar) {
        cpv cpvVar = cpv.a;
        egk egkVar = new egk();
        this.l = egkVar;
        boolean z = false;
        this.e = false;
        this.A = new atmm(this);
        dcdc e = dcdc.e();
        this.B = e;
        this.C = e;
        this.f = false;
        this.g = false;
        this.h = atcuVar;
        this.a = atcwVar;
        this.b = context;
        this.i = cjqyVar;
        this.j = atmlVar;
        this.m = dxioVar;
        this.n = executor;
        this.p = atmzVar;
        this.k = asucVar;
        this.q = ashhVar;
        this.r = ashfVar;
        this.s = cjyhVar;
        this.G = btrmVar;
        this.J = cpvVar;
        this.I = akplVar == null || akplVar.b();
        z = context.getResources().getConfiguration().smallestScreenWidthDp <= 360 ? true : z;
        this.H = btvoVar.getDirectionsExperimentsParameters().l;
        this.o = z;
        asld asldVar = null;
        this.y = astk.a(context, btvoVar, akfaVar, dzsjVar, brlzVar == null ? null : brlzVar.g, asikVar);
        this.u = (!C().booleanValue() || asucVar == null) ? null : asucVar.a(context);
        this.t = C().booleanValue() ? new astr(context, cqhnVar, btrmVar, dzsjVar, true, z) : null;
        jar l = arreVar != null ? arreVar.c().l() : null;
        asuk asukVar = cremVar != null ? new asuk(context, cqhnVar, cremVar, btvoVar) : null;
        asub asubVar = this.u;
        atlq atlqVar = this.c;
        dqvj e2 = atlqVar == null ? null : atlqVar.e();
        atlq atlqVar2 = this.c;
        astx astxVar = new astx(asubVar, astuVar, asuhVar, l, asukVar, e2, atlqVar2 != null ? atlqVar2.c.a : asldVar, akfaVar, btvoVar, cqhnVar, C().booleanValue());
        this.d = astxVar;
        astxVar.o(egkVar, context);
    }

    private final void ad() {
        atlq atlqVar = this.c;
        if (atlqVar == null) {
            return;
        }
        amuo amuoVar = atlqVar.o;
        atmk atmkVar = this.D;
        if (atmkVar != null && atmkVar.h() == amuoVar) {
            return;
        }
        for (atmk atmkVar2 : this.C) {
            if (atmkVar2.h() == amuoVar) {
                this.D = atmkVar2;
                return;
            }
        }
    }

    private final void ae(amuo amuoVar) {
        this.a.a(amuoVar);
        if (czue.a(this.b) || amuoVar != this.w) {
            return;
        }
        this.m.a().b(this.m.a().q().j(this.v, null), crej.PULL_GUIDANCE, null);
    }

    @Override // defpackage.atng
    /* renamed from: A */
    public astx ac() {
        return this.d;
    }

    @Override // defpackage.atng
    @dzsi
    public asut B() {
        asuc asucVar;
        if (this.u == null) {
            asub asubVar = null;
            if (C().booleanValue() && (asucVar = this.k) != null) {
                asubVar = asucVar.a(this.b);
            }
            this.u = asubVar;
        }
        return this.u;
    }

    @Override // defpackage.atng
    public Boolean C() {
        ashf ashfVar;
        if (!this.y || (ashfVar = this.r) == null || ashfVar.b() || this.s == null) {
            return false;
        }
        if (!cqhl.b(this.b)) {
            return true;
        }
        dehn<Boolean> d = this.s.d();
        if (!d.isDone()) {
            deha.q(d, new atmo(this), this.n);
            return false;
        }
        return Boolean.valueOf(!((Boolean) deha.s(d)).booleanValue());
    }

    @Override // defpackage.atng
    @dzsi
    public asho D() {
        ashh ashhVar;
        if (!C().booleanValue() || (ashhVar = this.q) == null) {
            return null;
        }
        return ashhVar.b();
    }

    @Override // defpackage.atng
    @dzsi
    /* renamed from: E */
    public astr ab() {
        return this.t;
    }

    @Override // defpackage.atng
    public Boolean F() {
        atmz atmzVar = this.p;
        boolean z = false;
        if (atmzVar != null && atmzVar.d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void G(boolean z) {
        this.z = z;
    }

    @Override // defpackage.atng
    public Boolean H() {
        return Boolean.valueOf(this.z);
    }

    @Override // defpackage.atng
    public Boolean I() {
        return Boolean.valueOf(this.b.getResources().getConfiguration().smallestScreenWidthDp <= 360);
    }

    public Boolean J() {
        return false;
    }

    @Override // defpackage.atng
    public Boolean K() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.atng
    @dzsi
    public atnf L() {
        return r();
    }

    @Override // defpackage.atng
    @dzsi
    public atnf M() {
        return (atnf) dcft.q(this.C, 1, null);
    }

    @Override // defpackage.atng
    @dzsi
    public atnf N() {
        return (atnf) dcft.q(this.C, 2, null);
    }

    @Override // defpackage.atng
    public Boolean O() {
        return Boolean.valueOf(M() != null);
    }

    @Override // defpackage.atng
    public Boolean P() {
        return Boolean.valueOf(N() != null);
    }

    @Override // defpackage.atng
    public cqkl Q() {
        if (this.H) {
            View o = cqkx.o(this);
            if (o == null || this.f || this.g) {
                return cqkl.a;
            }
            View findViewById = o.findViewById(R.id.expanded_header);
            View findViewById2 = o.findViewById(R.id.step_cue_header);
            if (findViewById.getVisibility() == 4) {
                findViewById.setTranslationY(-findViewById.getHeight());
                findViewById.animate().alpha(1.0f).translationYBy(findViewById.getHeight()).setListener(new atmp(this, findViewById, findViewById2)).start();
            } else {
                findViewById.animate().alpha(0.0f).translationYBy(-findViewById.getHeight()).setListener(new atmq(this, findViewById2, findViewById)).start();
            }
            return cqkl.a;
        }
        return cqkl.a;
    }

    @Override // defpackage.atng
    public cqkl R() {
        if (this.e) {
            Q();
        }
        atmz atmzVar = this.p;
        if (atmzVar != null) {
            atmzVar.c();
        }
        this.a.z();
        return cqkl.a;
    }

    public Boolean S() {
        return Boolean.valueOf(this.H);
    }

    public void T(boolean z) {
        this.x = z;
        p();
        ad();
    }

    @Override // defpackage.atng
    public cqkl U() {
        f().booleanValue();
        return cqkl.a;
    }

    public cqkl V() {
        if (h().booleanValue()) {
            this.a.v();
            this.a.f();
            this.G.b(new aswf());
        }
        return cqkl.a;
    }

    @Override // defpackage.atng
    public Boolean W() {
        if (this.d.v() == null) {
            return false;
        }
        return this.d.v().k().i();
    }

    @Override // defpackage.atng
    public cqkl X() {
        if (this.d.v() != null) {
            this.d.v().k().m(false);
        }
        return cqkl.a;
    }

    @Override // defpackage.atng
    public Boolean Y() {
        f().booleanValue();
        return false;
    }

    @Override // defpackage.atng
    public Integer Z() {
        float f;
        atmz atmzVar = this.p;
        if (atmzVar != null) {
            f = atmzVar.i().floatValue();
        } else {
            f = this.b.getResources().getConfiguration().screenWidthDp * 0.45f;
        }
        return Integer.valueOf(cqrp.d(f - 16.0f).e(this.b));
    }

    @Override // defpackage.jco
    public void a(int i, boolean z) {
        c(i, z ? jni.USER_SWIPE : jni.PROGRAMMATIC, null);
    }

    @Override // defpackage.atng
    public Boolean aa() {
        return Boolean.valueOf(this.b.getResources().getConfiguration().orientation == 2);
    }

    @Override // defpackage.jco
    public void b(int i) {
    }

    @Override // defpackage.jng
    public void c(int i, jni jniVar, @dzsi cjql cjqlVar) {
        if (!this.h.bb() || this.C.size() <= i) {
            return;
        }
        amuo h = this.C.get(i).h();
        View o = cqkx.o(this);
        if (o != null) {
            this.J.f(o, this.C.get(i).V());
        }
        if (jniVar == jni.USER_SWIPE) {
            this.i.m(new cjte(deaf.SWIPE), cjtd.a(dtxw.ba));
        } else if (jniVar == jni.USER_ARROW_CLICK_PREVIOUS) {
            this.i.i(cjtd.a(e()));
        } else if (jniVar == jni.USER_ARROW_CLICK_NEXT) {
            this.i.i(cjtd.a(d()));
        }
        if (jniVar != jni.PROGRAMMATIC) {
            this.a.a(h);
        }
        if (this.C.size() >= this.B.size() || i < this.C.size() - 1) {
            return;
        }
        this.h.y();
    }

    protected ddho d() {
        return dtxw.bd;
    }

    protected ddho e() {
        return dtxw.bf;
    }

    @Override // defpackage.atng
    public Boolean f() {
        return false;
    }

    @Override // defpackage.atng
    public Boolean g() {
        if (this.c != null) {
            f().booleanValue();
        }
        return false;
    }

    @Override // defpackage.atng
    public Boolean h() {
        boolean z = false;
        if (this.c != null && f().booleanValue() && !g().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void i(atlq atlqVar) {
        View findViewById;
        dbsk.s(atlqVar);
        if (!atlqVar.b()) {
            return;
        }
        atlq atlqVar2 = this.c;
        this.c = atlqVar;
        cray g = atlqVar.m.g();
        this.v = g;
        this.w = g.b;
        crqf crqfVar = this.c.m;
        if (atlk.a(crqfVar)) {
            this.E = this.b.getString(atlk.b(crqfVar));
            if (S().booleanValue() && k() != null && K().booleanValue()) {
                Q();
            }
        } else {
            this.E = null;
        }
        if ((atlqVar2 == null || !atlqVar2.u) && atlqVar.u && this.d.v() != null) {
            this.d.v().N();
        }
        boolean z = false;
        if (atlqVar2 == null || atlqVar.a != atlqVar2.a || this.C.isEmpty() || this.C.get(0).h() != this.w) {
            p();
        } else {
            if (!this.C.isEmpty()) {
                this.C.get(0).c(this.c);
            }
            if (atlqVar.n != atlqVar2.n) {
                for (atmk atmkVar : this.C) {
                    atmkVar.I(this.c.n);
                }
            }
        }
        this.d.p(atlqVar.m.g().a.h);
        astx astxVar = this.d;
        if (atlqVar.v && !atlqVar.n) {
            z = true;
        }
        astxVar.n(z);
        this.d.i(atlqVar.c.a);
        ad();
        if (cqkx.o(this) == null || !this.e || this.g || (findViewById = cqkx.o(this).findViewById(R.id.step_cue_header)) == null) {
            return;
        }
        findViewById.setVisibility(4);
    }

    @Override // defpackage.atng
    public Boolean j() {
        atlq atlqVar = this.c;
        return Boolean.valueOf(atlqVar == null ? false : atlqVar.p);
    }

    @Override // defpackage.atng
    public Boolean k() {
        return Boolean.valueOf(this.E != null);
    }

    @Override // defpackage.atng
    @dzsi
    public String l() {
        return this.E;
    }

    @Override // defpackage.atng
    public List<? extends atnf> m() {
        return this.B;
    }

    @Override // defpackage.atng
    public List<? extends atnf> n() {
        return this.C;
    }

    public void o() {
        this.C = dcdc.e();
        this.B = dcdc.e();
        this.D = null;
        this.w = null;
    }

    public void p() {
        atmr atmrVar = this;
        if (atmrVar.c == null) {
            return;
        }
        ArrayList a = dchl.a();
        amuo amuoVar = atmrVar.w;
        int i = amuoVar == null ? 0 : amuoVar.i;
        dccx F = dcdc.F();
        F.h(atmrVar.v.a.k);
        dcdc f = F.f();
        List<atmk> list = atmrVar.C;
        atmk atmkVar = (list == null || atmrVar.w == null || list.isEmpty()) ? null : atmrVar.C.get(0);
        int i2 = i;
        while (i2 < f.size()) {
            amuo amuoVar2 = (amuo) f.get(i2);
            atmn atmnVar = new atmn(atmrVar, amuoVar2);
            atml atmlVar = atmrVar.j;
            atlq atlqVar = atmrVar.c;
            boolean z = atlqVar.n;
            Callable<Boolean> callable = atmrVar.A;
            boolean booleanValue = C().booleanValue();
            boolean z2 = !TextUtils.isEmpty(atmrVar.E);
            atmk atmkVar2 = i2 == i ? atmkVar : null;
            Runnable runnable = atmrVar.F;
            boolean booleanValue2 = f().booleanValue();
            boolean booleanValue3 = J().booleanValue();
            boolean z3 = atmrVar.x;
            Context a2 = atmlVar.a.a();
            atml.a(a2, 1);
            atln a3 = atmlVar.b.a();
            atml.a(a3, 2);
            bvsl a4 = atmlVar.c.a();
            atml.a(a4, 3);
            vtn a5 = atmlVar.d.a();
            atml.a(a5, 4);
            atmj a6 = atmlVar.e.a();
            atml.a(a6, 5);
            atnb a7 = atmlVar.f.a();
            atml.a(a7, 6);
            atnc a8 = atmlVar.g.a();
            atml.a(a8, 7);
            atne a9 = atmlVar.h.a();
            atml.a(a9, 8);
            atee a10 = atmlVar.i.a();
            int i3 = i;
            atml.a(a10, 9);
            ated a11 = atmlVar.j.a();
            atml.a(a11, 10);
            Boolean a12 = atmlVar.k.a();
            atml.a(a12, 11);
            ArrayList arrayList = a;
            btvo a13 = atmlVar.m.a();
            atml.a(a13, 13);
            atml.a(amuoVar2, 15);
            atml.a(atlqVar, 16);
            atml.a(atmrVar, 17);
            atml.a(callable, 19);
            atml.a(atmnVar, 23);
            atml.a(runnable, 24);
            arrayList.add(new atmk(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12.booleanValue(), atmlVar.l.a(), a13, atmlVar.n.a(), amuoVar2, atlqVar, this, z, callable, booleanValue, z2, atmkVar2, atmnVar, runnable, booleanValue2, booleanValue3, z3, 0));
            i2++;
            atmrVar = this;
            a = arrayList;
            f = f;
            i = i3;
        }
        atmr atmrVar2 = atmrVar;
        atmrVar2.B = a;
        atmrVar2.C = atmrVar2.c.a ? atmrVar2.B.subList(0, Math.min(atmrVar2.B.size(), 6)) : atmrVar2.B;
        atmrVar2.D = null;
    }

    @Override // defpackage.atng
    public atnf q() {
        return this.D;
    }

    @Override // defpackage.atng
    public atnf r() {
        return (atnf) dcft.r(this.C, null);
    }

    public void s() {
        if (r() != null) {
            r().v();
        }
        this.d.v().Q();
        this.d.t().N();
    }

    @Override // defpackage.atnd
    public void t(amuo amuoVar) {
        if (!this.h.bb()) {
            return;
        }
        if (!F().booleanValue()) {
            if (!Y().booleanValue() || !g().booleanValue()) {
                if (!this.H || amuoVar != this.w || this.I) {
                    if (this.c.c.a != asld.INSPECT_STEP) {
                        ae(amuoVar);
                        return;
                    } else if (amuoVar != this.w) {
                        return;
                    } else {
                        this.a.E();
                        return;
                    }
                }
                Q();
                return;
            }
            U();
            return;
        }
        atmz atmzVar = this.p;
        if (atmzVar != null) {
            atmzVar.c();
        }
        if (this.H && !this.I && K().booleanValue()) {
            Q();
        }
        ae(amuoVar);
    }

    @Override // defpackage.atng
    public jng u() {
        return this;
    }

    @Override // defpackage.atng
    public atof v() {
        return this;
    }

    @Override // defpackage.atof
    public void w() {
        if (f().booleanValue()) {
            U();
        }
    }

    @Override // defpackage.atof
    public void x() {
        if (f().booleanValue()) {
            atmz atmzVar = this.p;
            if (atmzVar != null) {
                atmzVar.c();
            }
            V();
        }
    }

    @Override // defpackage.atng
    public egk y() {
        return this.l;
    }

    public void z(Runnable runnable) {
        this.F = runnable;
    }
}
