package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: kzt  reason: default package */
/* loaded from: classes7.dex */
public final class kzt implements btph, kzd {
    public final kzj A;
    public int B;
    private final kxu D;
    private final kxo E;
    @dzsi
    private atlq F;
    private final ldc I;
    private final ldk J;
    public final ViewGroup a;
    public final View b;
    public final kyv c;
    public final kzc d;
    public final lab e;
    public final lad f;
    public final lak g;
    public final jzp h;
    public final kdg i;
    public final kcy j;
    public final cqkf<lcv> k;
    public final View l;
    public final ViewGroup m;
    public final ViewGroup n;
    public final ViewGroup o;
    @dzsi
    public ViewGroup p;
    public final lai q;
    @dzsi
    public ViewGroup r;
    public final ldd s;
    public int t;
    public final View.OnFocusChangeListener v;
    public final lda w;
    public final ldg x;
    public final kdf y;
    public final kzh z;
    private final Object C = new Object();
    private final View.OnGenericMotionListener G = new kzm(this);
    public final ntq u = new kzn(this);
    private final Runnable H = new kzp(this);

    public kzt(cqkj cqkjVar, dxio<akox> dxioVar, kzc kzcVar, lab labVar, lad ladVar, bvnx bvnxVar, btrm btrmVar, jzp jzpVar, kdg kdgVar, kcy kcyVar, lai laiVar, kxu kxuVar, ksi ksiVar, kyv kyvVar) {
        cqiw lbeVar;
        kzq kzqVar = new kzq(this);
        this.v = kzqVar;
        kzr kzrVar = new kzr(this);
        this.I = kzrVar;
        kzs kzsVar = new kzs(this);
        this.J = kzsVar;
        this.w = new kzf(this);
        this.x = new kzg(this);
        this.z = new kzh(this);
        this.y = new kzi(this);
        this.A = new kzj(this);
        this.c = kyvVar;
        this.d = kzcVar;
        dbsk.s(labVar);
        this.e = labVar;
        this.g = new lak(cqkjVar, dxioVar, btrmVar, new ldl(kcyVar, kzqVar, kzsVar), new kyw(dxioVar, bvnxVar));
        dbsk.s(ladVar);
        this.f = ladVar;
        dbsk.s(jzpVar);
        this.h = jzpVar;
        dbsk.s(kcyVar);
        this.j = kcyVar;
        dbsk.s(kdgVar);
        this.i = kdgVar;
        dbsk.s(laiVar);
        this.q = laiVar;
        dbsk.s(kxuVar);
        this.D = kxuVar;
        if (jzpVar.g()) {
            lbeVar = new lbm();
        } else if (d(jzpVar)) {
            lbeVar = new laz();
        } else {
            lbeVar = new lbe();
        }
        cqkf<lcv> e = cqkjVar.e(lbeVar);
        this.k = e;
        this.B = 1;
        kxn k = kxo.k();
        k.d((int) ksiVar.c(nqo.aN));
        k.i();
        this.E = k.j();
        View c = e.c();
        this.b = c;
        this.l = c.findViewById(lbn.b);
        this.m = (ViewGroup) c.findViewById(lbn.c);
        this.o = (ViewGroup) c.findViewById(lbn.e);
        this.n = (ViewGroup) c.findViewById(lbn.d);
        this.a = (ViewGroup) c.findViewById(lbn.a);
        this.s = new ldd(kcyVar, kzqVar, kzrVar);
    }

    public static boolean d(jzp jzpVar) {
        return jzpVar.d() && jzpVar.e() && !jzpVar.b();
    }

    public static void f(View view, View view2) {
        view.setTouchDelegate(new TouchDelegate(new Rect(0, 0, lbn.w.e(view2.getContext()), lbn.x.e(view2.getContext())), view2));
    }

    private final boolean l() {
        return this.B != 2 && this.h.h();
    }

    private final void m() {
        dbsk.l(this.B == 3);
        p();
    }

    private final boolean n() {
        return this.i.b == kdc.MAP_INTERACTION_AND_BUTTONS_ENABLED || this.i.b == kdc.MAP_INTERACTION_AND_BUTTONS_FORCED;
    }

    private final boolean o() {
        return this.i.c == kdd.FREE_NAV;
    }

    private final void p() {
        dbsk.l(this.B != 2);
        ViewPropertyAnimator animate = this.l.animate();
        if (animate.getInterpolator() == this.c.a) {
            if (this.l.getAlpha() != 1.0f || this.B != 3) {
                return;
            }
            g(true);
            return;
        }
        animate.alpha(1.0f).translationX(0.0f).setInterpolator(this.c.a).withEndAction(new kzo(this));
        q();
        this.i.k(this, true);
    }

    private final void q() {
        if (o()) {
            ViewGroup viewGroup = this.o;
            kyv kyvVar = this.c;
            ViewPropertyAnimator animate = viewGroup.animate();
            if (animate.getInterpolator() == kyvVar.a && (viewGroup.getAlpha() > 0.0f || animate.getStartDelay() == 0)) {
                return;
            }
            this.o.animate().alpha(1.0f).translationX(0.0f).setInterpolator(this.c.a);
        } else if (h(this.o)) {
        } else {
            this.c.a(this.o, false);
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.kzd
    public final void a() {
        if (this.B == 3) {
            m();
        }
    }

    @Override // defpackage.kzd
    public final void b(@dzsi atlq atlqVar) {
        this.F = atlqVar;
        j();
    }

    public final void e() {
        cqkx.p(this.s);
    }

    public final void g(boolean z) {
        boolean z2 = true;
        if (this.B == 1) {
            z2 = false;
        }
        dbsk.l(z2);
        if (z) {
            View c = this.k.c();
            c.removeCallbacks(this.H);
            c.postDelayed(this.H, 10000L);
            return;
        }
        this.H.run();
    }

    public final boolean h(View view) {
        kyv kyvVar = this.c;
        ViewPropertyAnimator animate = view.animate();
        return animate.getInterpolator() == kyvVar.b && (view.getAlpha() < 1.0f || animate.getStartDelay() == 0);
    }

    public final void i() {
        int i = 3;
        boolean z = false;
        if (!this.h.b()) {
            if (!n() || (this.j.b && !this.h.d())) {
                i = 2;
            } else if (!this.e.b.h() || this.t > 0 || this.i.b == kdc.MAP_INTERACTION_AND_BUTTONS_FORCED || this.j.b) {
                i = 1;
            }
            if (this.B != i) {
                this.B = i;
                int i2 = i - 1;
                if (i2 == 0) {
                    p();
                } else if (i2 != 1) {
                    m();
                } else {
                    g(false);
                }
                j();
            }
            q();
            this.s.g(l());
            this.g.e(l());
            boolean booleanValue = this.s.a().booleanValue();
            this.d.a(booleanValue);
            this.e.c(booleanValue);
            lad ladVar = this.f;
            if (booleanValue && o()) {
                z = true;
            }
            ladVar.b(z);
            return;
        }
        if (!n()) {
            i = 2;
        } else if (this.t > 0 || this.i.b == kdc.MAP_INTERACTION_AND_BUTTONS_FORCED) {
            i = 1;
        }
        int i3 = this.B;
        if (i3 != i) {
            this.B = i;
            this.s.g(l());
            this.g.e(l());
            boolean booleanValue2 = this.s.a().booleanValue();
            this.d.a(booleanValue2);
            this.e.c(booleanValue2);
            this.f.b(booleanValue2 && o());
            int i4 = this.B;
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i5 == 0) {
                p();
                j();
            } else if (i5 == 1) {
                g(false);
                j();
            } else if (i5 != 2) {
                String str = i4 != 1 ? i4 != 2 ? "AUTO" : "OFF" : "ON";
                StringBuilder sb = new StringBuilder(str.length() + 30);
                sb.append("Unexpected map buttons state: ");
                sb.append(str);
                throw new AssertionError(sb.toString());
            } else if (i3 != 2) {
                m();
            } else {
                j();
            }
        }
        q();
        if (!this.h.b() || !this.h.d() || this.h.e()) {
            return;
        }
        View c = this.k.c();
        if (this.i.b != kdc.MAP_INTERACTION_DISABLED) {
            c.setOnGenericMotionListener(this.G);
        } else {
            c.setOnGenericMotionListener(null);
        }
    }

    public final void j() {
        if (this.B == 2) {
            this.D.l(this.C);
            return;
        }
        atlq atlqVar = this.F;
        if (atlqVar == null || !atlqVar.b()) {
            this.D.k(this.C, this.E);
        } else if (this.F.c.a != asld.FOLLOWING) {
            this.D.k(this.C, this.E);
        } else {
            this.D.l(this.C);
        }
    }

    public final int k() {
        if (this.j.b || !this.g.b()) {
            return 2;
        }
        this.g.a(false);
        return 1;
    }
}
