package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: blxo */
/* loaded from: classes3.dex */
public class blxo implements blwr, blxd, blyy {
    private static final Random Q = new Random();
    private boolean A;
    private final blpk B;
    private final btvo C;
    private final blyv D;
    private final blxm E;
    private final blxe F;
    private final blze G;
    private final blxt H;
    private final blxy I;
    private final blwm J;
    private final bvrb K;
    private final cjqy L;
    private final cjqq M;
    private final cqat N;
    private final Runnable O;
    private final String P;
    private final blws U;
    private cqfc V;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String g;
    public final blzf h;
    private final ff i;
    private final btrm j;
    private final bvjj k;
    private final dzsj<blpp> l;
    private final dzsj<ccif> m;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private final int x;
    private boolean y;
    private final boolean z;
    private final blxn n = new blxn();
    private final AtomicBoolean R = new AtomicBoolean(false);
    private final cqss[] S = {irg.y(), iva.c(R.color.qu_pink_500, R.color.quantum_pink400), iva.c(R.color.qu_purple_500, R.color.quantum_purple400), iva.c(R.color.qu_deep_purple_500, R.color.quantum_deeppurple400), irg.Q(), irg.s(), iva.c(R.color.qu_light_blue_600, R.color.quantum_lightblue300), iva.c(R.color.quantum_cyan600, R.color.quantum_cyan300), irg.P(), irg.u(), iva.c(R.color.qu_light_green_700, R.color.quantum_lightgreen200), iva.c(R.color.qu_lime_800, R.color.quantum_lime100), iva.c(R.color.qu_yellow_900, R.color.quantum_yellow50), irg.K(), iva.c(R.color.qu_deep_orange_500, R.color.quantum_deeporange400), iva.c(R.color.qu_brown_500, R.color.quantum_brown400)};

    public blxo(blzf blzfVar, blyv blyvVar, @dzsi blxm blxmVar, blyz blyzVar, boolean z, blpk blpkVar, String str, ff ffVar, blwm blwmVar, btrm btrmVar, btvo btvoVar, bvjj bvjjVar, anhg anhgVar, bvrb bvrbVar, cjqy cjqyVar, cjqq cjqqVar, dzsj<blpp> dzsjVar, dzsj<ccif> dzsjVar2, cqat cqatVar) {
        this.h = blzfVar;
        this.C = btvoVar;
        this.D = blyvVar;
        this.E = blxmVar;
        this.U = blyzVar;
        blyzVar.d(this);
        this.J = blwmVar;
        this.z = z;
        this.B = blpkVar;
        this.P = str;
        this.K = bvrbVar;
        this.N = cqatVar;
        this.L = cjqyVar;
        this.M = cjqqVar;
        this.u = 0;
        this.v = 0;
        this.w = blzfVar.m();
        this.t = false;
        this.x = btvoVar.getUgcParameters().e();
        this.y = false;
        blxe blxeVar = new blxe(ffVar);
        this.F = blxeVar;
        blxeVar.d(this);
        this.G = new blze(ffVar, bvjjVar, blzfVar);
        this.H = new blxt(ffVar, anhgVar, bvrbVar, blzfVar);
        this.I = new blxy(ffVar, blyvVar);
        this.V = ad();
        if (blyvVar.B() == null) {
            blyvVar.ax(Y(null));
        }
        Z(blyvVar.B(), true);
        blyvVar.ay(true);
        ((ckco) blwmVar.a.a(ckjo.a)).a(blpkVar.o);
        this.i = ffVar;
        this.j = btrmVar;
        this.k = bvjjVar;
        this.l = dzsjVar;
        this.m = dzsjVar2;
        this.d = false;
        this.e = false;
        this.O = new blxf(this);
    }

    public static /* synthetic */ void U(blxo blxoVar) {
        blxoVar.V = null;
    }

    private final void V() {
        if (this.y) {
            this.y = false;
            ab();
        }
    }

    private final boolean W() {
        return this.k.m(bvjk.fj, false);
    }

    private final void X() {
        if (aa()) {
            T();
            return;
        }
        this.D.ay(false);
        this.V = ad();
        this.t = false;
        cqss B = this.I.B();
        if (B != null) {
            this.D.ax(B);
        } else {
            this.D.ax(Y(null));
        }
        if (this.u + this.v != this.x - 1 || this.A) {
            Z(B, false);
        } else {
            this.I.ao();
        }
        if (ac()) {
            this.u = 0;
            this.v = 0;
            blzf blzfVar = this.h;
            this.w = blzfVar.j(blzfVar.k().b);
        }
        this.j.b(new blpl());
    }

    private final cqss Y(@dzsi cqss cqssVar) {
        cqss cqssVar2 = this.S[Q.nextInt(16)];
        if (cqssVar != null) {
            for (int i = 0; i < 5; i++) {
                if (!dbsd.a(cqssVar2, cqssVar)) {
                    return cqssVar2;
                }
                cqssVar2 = this.S[Q.nextInt(16)];
            }
        }
        return cqssVar2;
    }

    private final void Z(@dzsi cqss cqssVar, boolean z) {
        cqss Y = Y(cqssVar);
        if (!this.h.g().booleanValue()) {
            this.I.ao();
            return;
        }
        blvu f = this.h.f();
        blxy blxyVar = this.I;
        String str = f.m;
        blvt blvtVar = f.n;
        dcdc<dgkm> b = f.b();
        String str2 = f.j;
        String str3 = f.k;
        cqtd g = cqrt.g(this.D.aA(f), Y);
        blwa blwaVar = this.h.a;
        blxyVar.an(str, blvtVar, b, str2, str3, Y, g, z, blwa.i(blwaVar.a(), blwaVar.c()));
    }

    private final boolean aa() {
        return (this.u + this.v >= this.x && !this.A) || !this.h.h().booleanValue();
    }

    private final void ab() {
        if (bvrj.UI_THREAD.b()) {
            this.O.run();
        } else {
            this.K.b(this.O, bvrj.UI_THREAD);
        }
    }

    private final boolean ac() {
        return this.u + this.v >= this.w && this.D.ab().booleanValue() && this.A;
    }

    private final cqfc ad() {
        boolean aa = aa();
        boolean z = this.t;
        boolean ac = ac();
        int i = this.w;
        int i2 = this.x;
        return new blxl(this, Float.valueOf((this.u + this.v) / ((i < i2 || this.A) ? i : i2)).floatValue(), z, aa, ac);
    }

    @Override // defpackage.blwr
    @dzsi
    public cqfc A() {
        return this.V;
    }

    @Override // defpackage.blxd
    public void B() {
        this.q = false;
        if (this.D.ab().booleanValue()) {
            this.F.e(blzm.OUT);
            this.p = false;
            int i = this.u + this.v;
            if (i >= this.x) {
                this.w -= i;
                this.u = 0;
                this.v = 0;
            }
            X();
            ab();
            return;
        }
        this.j.b(new blpn());
        this.E.a();
    }

    public void C(blvt blvtVar, @dzsi String str) {
        this.p = true;
        this.u++;
        if (blvtVar == blvt.RATING) {
            this.b++;
            ((ckco) this.J.a.a(ckjo.d)).a(this.B.o);
        } else if (blvtVar == blvt.MULTIPLE_CHOICE) {
            this.a++;
            ((ckco) this.J.a.a(ckjo.b)).a(this.B.o);
        } else if (blvtVar == blvt.REVIEW) {
            ((ckco) this.J.a.a(ckjo.f)).a(this.B.o);
        }
        blxn blxnVar = this.n;
        if (!dbsj.d(str) && !blxnVar.b.contains(str)) {
            blxnVar.a.add(str);
        }
        int ordinal = blvtVar.ordinal();
        if (ordinal == 0 ? W() : ordinal == 1 || ordinal == 2 || W()) {
            X();
        } else {
            if (this.C.getUgcParameters().x()) {
                cjqp g = this.M.g();
                cjta b = cjtd.b();
                b.d = dtxz.k;
                b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
                g.d(b.a());
                X();
            } else {
                this.q = true;
                this.F.e(blzm.IN);
            }
            this.k.S(bvjk.fj, true);
        }
        if (this.R.compareAndSet(false, true)) {
            ((ckco) this.J.a.a(ckjo.h)).a(this.B.o);
        }
        this.j.b(new blpm());
        ab();
    }

    public void D(blvt blvtVar) {
        if (blvtVar == blvt.RATING) {
            ((ckco) this.J.a.a(ckjo.e)).a(this.B.o);
        } else if (blvtVar == blvt.MULTIPLE_CHOICE) {
            ((ckco) this.J.a.a(ckjo.c)).a(this.B.o);
        } else if (blvtVar == blvt.REVIEW) {
            ((ckco) this.J.a.a(ckjo.g)).a(this.B.o);
        }
        this.v++;
        this.p = true;
        X();
        this.j.b(new blpm());
        ab();
    }

    public void E() {
        ab();
    }

    public void F() {
        this.I.ap();
        ab();
    }

    public void G() {
        V();
    }

    public void H() {
        this.p = true;
        this.I.ao();
        int m = this.h.m();
        dccx F = dcdc.F();
        F.g(dvrm.OOPS_MESSAGE);
        F.g(dvrm.TIMELINE_LINK);
        if (m > 0) {
            F.g(dvrm.MORE_QUESTIONS);
        }
        F.g(dvrm.DONE_BUTTON);
        this.L.u(new blwe(this.P, m, this.h.d, F.f(), this.N, this.h.l(), this.L.b()));
        ab();
    }

    public void I() {
        this.D.aw();
        this.p = true;
        this.s = true;
        this.I.aq();
        this.H.v(this.D.ab().booleanValue());
        this.H.w(blzm.SLIDE_IN);
        ab();
    }

    @Override // defpackage.blyy
    public void J() {
        V();
    }

    @Override // defpackage.blyy
    public void K() {
        V();
        ((blov) this.E).a.g();
    }

    @Override // defpackage.blyy
    public void L() {
        this.E.b();
    }

    public void M() {
        this.u = 0;
        this.v = 0;
        this.r = false;
        this.t = true;
        this.G.N(blzm.OUT);
        this.p = false;
        this.D.at();
        if (this.h.h().booleanValue()) {
            blzf blzfVar = this.h;
            this.w = blzfVar.j(blzfVar.k().b);
        }
        this.L.u(new blwd(this.P, this.h.m(), this.h.d, dvrh.MORE_QUESTIONS, this.N, this.h.l(), this.L.b()));
        X();
        ab();
    }

    public void N() {
        this.o = true;
        this.L.u(new blwd(this.P, this.h.m(), this.h.d, dvrh.EXIT, this.N, this.h.l(), this.L.b()));
        ab();
    }

    public void O() {
        this.i.g().f();
        this.m.a().c(dtxz.p, null);
    }

    public void P() {
        this.s = false;
        this.p = false;
        this.D.at();
        if (this.A && this.h.g().booleanValue()) {
            blzf blzfVar = this.h;
            this.w = blzfVar.j(blzfVar.f().b);
        }
        X();
        this.L.u(new blwd(this.P, this.h.m(), this.h.d, dvrh.MORE_QUESTIONS, this.N, this.h.l(), this.L.b()));
        this.H.w(blzm.OUT);
        ab();
    }

    public void Q(dvrh dvrhVar) {
        this.p = false;
        this.o = true;
        cjqy cjqyVar = this.L;
        String str = this.P;
        int m = this.h.m();
        blzf blzfVar = this.h;
        cjqyVar.u(new blwd(str, m, blzfVar.d, dvrhVar, this.N, blzfVar.l(), this.L.b()));
        ab();
    }

    public void R(bwrs<ilo> bwrsVar, bqjh bqjhVar) {
        blov blovVar = (blov) this.E;
        blovVar.a.g();
        bqjf q = bqjhVar.q();
        q.e(blox.class);
        blovVar.a.ae.a().b(bwrsVar, q.o());
    }

    public void S() {
        this.d = false;
        this.e = false;
        this.h.d = 3;
        this.l.a().k(this.D.az(), new blxg(this));
    }

    public void T() {
        if (f().booleanValue() || this.r) {
            return;
        }
        this.V = ad();
        this.D.aw();
        if (this.u > 0) {
            this.u = 0;
            this.v = 0;
            this.r = true;
            this.G.H();
            this.G.I(this.D.ab().booleanValue());
            boolean i = this.h.i();
            this.A = i;
            this.G.J(i);
            this.G.L(this.g);
            this.G.M(this.f);
            if (this.G.f().booleanValue()) {
                ((ckco) this.J.a.a(ckjo.i)).a(this.B.o);
            } else if (!this.d) {
                ((ckco) this.J.a.a(ckjo.k)).a(this.B.o);
            } else if (this.e) {
                ((ckco) this.J.a.a(ckjo.j)).a(this.B.o);
            } else if (!this.h.i()) {
                ((ckco) this.J.a.a(ckjo.l)).a(this.B.o);
            }
            this.G.N(blzm.IN);
            if (this.n.a.size() >= 2) {
                blze blzeVar = this.G;
                blxn blxnVar = this.n;
                dcdc z = dcbg.b(blxnVar.a).x(4).z();
                blxnVar.a.removeAll(z);
                blxnVar.b.addAll(z);
                blzeVar.G(z);
            } else if (this.c) {
                blze blzeVar2 = this.G;
                ff ffVar = this.i;
                blzeVar2.K(new ivp(ffVar, this.a, ffVar.getString(R.string.RIDDLER_LIFETIME_STATS_QUESTIONS_ANSWERED)));
            }
            dccx F = dcdc.F();
            F.g(dvrm.THANKS_MESSAGE);
            if (this.G.r().booleanValue()) {
                F.g(dvrm.COUNTER);
            }
            if (this.G.D().booleanValue()) {
                F.g(dvrm.SEARCH_TERMS);
            }
            if (this.G.f().booleanValue()) {
                F.g(dvrm.MORE_QUESTIONS);
            } else {
                F.g(dvrm.DONE_BUTTON);
            }
            this.L.u(new blwe(this.P, this.h.m(), this.h.d, F.f(), this.N, this.h.l(), this.L.b()));
            this.I.ao();
        } else {
            this.o = true;
            ab();
        }
        this.j.b(new blpn());
    }

    @Override // defpackage.blwr
    public Boolean a() {
        boolean z = false;
        if (this.D.ae().booleanValue() && !this.q) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blwr
    public Boolean b() {
        return this.I.ab();
    }

    @Override // defpackage.blwr
    public Boolean c() {
        return Boolean.valueOf(this.p);
    }

    @Override // defpackage.blwr
    public Boolean d() {
        boolean z = true;
        if (!this.q && !this.F.f()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blwr
    public Boolean e() {
        boolean z = true;
        if (!this.r && !this.G.O()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blwr
    public Boolean f() {
        boolean z = true;
        if (!this.s && !this.H.x()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blwr
    public Boolean g() {
        return Boolean.valueOf(this.y);
    }

    @Override // defpackage.blwr
    public Boolean h() {
        return Boolean.valueOf(this.z);
    }

    @Override // defpackage.blwr
    public Boolean i() {
        boolean z = false;
        if (this.z && !this.k.m(bvjk.fu, false)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blwr
    public Boolean j() {
        boolean z = false;
        if (this.C.getUgcParameters().v() && !this.r && !this.s) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blwr
    public Boolean k() {
        return false;
    }

    @Override // defpackage.blwr
    @dzsi
    public cjtd l() {
        return this.D.aq();
    }

    @Override // defpackage.blwr
    public cqkl m() {
        this.o = true;
        ab();
        return cqkl.a;
    }

    @Override // defpackage.blwr
    public cqkl n() {
        this.y = true;
        ab();
        return cqkl.a;
    }

    @Override // defpackage.blwr
    public cqkl o() {
        if (this.y) {
            this.y = false;
            ab();
            return cqkl.a;
        }
        if (a().booleanValue()) {
            this.L.u(new blwf(this.h.k(), 2, this.P, this.N, this.h.k().c(), this.L.b()));
        } else {
            this.L.u(new blwd(this.P, this.h.m(), this.h.d, dvrh.EXIT, this.N, this.h.l(), this.L.b()));
        }
        return m();
    }

    @Override // defpackage.blwr
    public cqkl p() {
        this.k.S(bvjk.fu, true);
        ab();
        return cqkl.a;
    }

    @Override // defpackage.blwr
    public cqkl q() {
        this.y = true;
        p();
        return cqkl.a;
    }

    @Override // defpackage.blwr
    public cqkl r() {
        blxm blxmVar = this.E;
        blvu k = this.h.k();
        gga ggaVar = ((blov) blxmVar).a.ah;
        blot blotVar = new blot();
        Bundle bundle = new Bundle();
        bundle.putSerializable("question_key", k);
        blotVar.B(bundle);
        gei.a(ggaVar, blotVar);
        return cqkl.a;
    }

    @Override // defpackage.blwr
    public blwp s() {
        return this.D;
    }

    @Override // defpackage.blwr
    @dzsi
    public blwp t() {
        return this.I;
    }

    @Override // defpackage.blwr
    @dzsi
    public blwp u() {
        return this.D.au();
    }

    @Override // defpackage.blwr
    public blwq v() {
        return this.F;
    }

    @Override // defpackage.blwr
    public blwt w() {
        return this.G;
    }

    @Override // defpackage.blwr
    public izu x() {
        return this.H;
    }

    @Override // defpackage.blwr
    public blws y() {
        return this.U;
    }

    @Override // defpackage.blwr
    @dzsi
    public cqfc z() {
        if (this.o) {
            return new blxi(this.E);
        }
        return null;
    }
}
