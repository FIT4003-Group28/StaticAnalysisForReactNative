package defpackage;

import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
/* compiled from: PG */
/* renamed from: khd  reason: default package */
/* loaded from: classes3.dex */
public final class khd implements kbk {
    public final jwq a;
    public final AutonavToggleController b;
    public khb c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    private final adoa j;
    private final boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;

    public khd(adoa adoaVar, jwq jwqVar, AutonavToggleController autonavToggleController, aacz aaczVar) {
        this.j = adoaVar;
        this.a = jwqVar;
        this.b = autonavToggleController;
        asxj asxjVar = aaczVar.b().e;
        this.k = (asxjVar == null ? asxj.a : asxjVar).bC;
    }

    public static void c(fqu fquVar, int i) {
        if (fquVar == null) {
            return;
        }
        fquVar.m(i);
    }

    public static void d(yye yyeVar, int i) {
        yyeVar.d = i;
    }

    private final void e() {
        this.c.f.a(this.l, false);
        this.c.b.b(false);
        this.c.e.b(false);
        this.c.a.b(false);
        this.c.d.b(false);
        this.c.g.b(false);
        this.a.l(false, false);
        this.b.l(false, false);
    }

    private final void t() {
        x(this.c.d);
        x(this.c.a);
        x(this.c.f);
        x(this.c.e);
        x(this.c.b);
    }

    private final boolean u() {
        return this.j.d() == 0 || this.j.d() == 1;
    }

    private static final void v(fqu fquVar) {
        if (fquVar.o()) {
            fquVar.l(false, true);
        }
    }

    private static final void w(fqu fquVar) {
        if (fquVar.o()) {
            fquVar.l(false, false);
            fquVar.l(true, true);
        }
    }

    private static final void x(yye yyeVar) {
        if (yyeVar.f()) {
            yyeVar.b.animate().cancel();
        }
    }

    private static final void y(yye yyeVar) {
        if (yyeVar.f()) {
            yyeVar.a(false, true);
        }
    }

    private static final void z(yye yyeVar) {
        if (yyeVar.f()) {
            yyeVar.a(false, false);
            yyeVar.a(true, true);
        }
    }

    public final void a() {
        if (this.c == null) {
            return;
        }
        if (this.o) {
            s();
        } else {
            e();
        }
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        if (z) {
            y(this.c.a);
            y(this.c.f);
            y(this.c.e);
            y(this.c.b);
            y(this.c.d);
            y(this.c.g);
            v(this.a);
            v(this.b);
            return;
        }
        t();
        this.o = false;
        e();
    }

    @Override // defpackage.kbk
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        this.q = ControlsOverlayStyle.a(controlsOverlayStyle);
        a();
    }

    @Override // defpackage.kbk
    public final void j(boolean z) {
        if (this.s != z) {
            this.s = z;
            a();
        }
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void k(boolean z) {
    }

    @Override // defpackage.kbk
    public final void l(ezx ezxVar) {
        this.p = ezxVar.b();
        a();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final void nL(boolean z) {
        this.o = true;
        s();
        if (z) {
            z(this.c.a);
            z(this.c.f);
            z(this.c.e);
            z(this.c.d);
            z(this.c.b);
            z(this.c.g);
            w(this.a);
            w(this.b);
        }
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.kbk
    public final void od(ControlsState controlsState) {
        boolean z = true;
        if (this.l == controlsState.i() && this.m == controlsState.j()) {
            if (this.n == (controlsState.a == ahzb.ENDED)) {
                return;
            }
        }
        this.l = controlsState.i();
        this.m = controlsState.j();
        if (controlsState.a != ahzb.ENDED) {
            z = false;
        }
        this.n = z;
        a();
    }

    @Override // defpackage.kbk
    public final void oe(boolean z) {
        if (!this.k || this.u == z) {
            return;
        }
        this.u = z;
        a();
    }

    @Override // defpackage.kbk
    public final void og(boolean z) {
        if (this.t == z) {
            return;
        }
        this.t = z;
        a();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kbk
    public final void q(boolean z) {
        if (this.r != z) {
            this.r = z;
            a();
        }
    }

    private final void s() {
        if (!this.r) {
            if (!this.s && !this.t && !this.u) {
                boolean z = true;
                boolean z2 = this.e && this.p && !this.q && this.n;
                this.a.l(z2, false);
                this.b.l(this.f && !this.q && !u(), false);
                this.c.b.a(this.p && !this.q && (!z2 || this.d), false);
                boolean z3 = !z2;
                this.c.e.a(z3, false);
                this.c.c.a(z3, false);
                this.c.a.a(!this.l && !z2 && !this.n, false);
                this.c.f.a(!this.q && this.m, false);
                this.c.g.a(this.h, false);
                yye yyeVar = this.c.d;
                if (this.q || !this.m || this.n || !this.p || u() || !this.g || z2) {
                    z = false;
                }
                yyeVar.a(z, false);
                return;
            }
        } else if (this.n) {
            this.n = false;
        }
        t();
        this.c.e.b(false);
        this.c.f.b(false);
        this.c.g.b(false);
        this.c.d.b(false);
        this.c.a.b(false);
        this.c.b.b(false);
        this.a.l(false, false);
        this.b.l(false, false);
    }
}
