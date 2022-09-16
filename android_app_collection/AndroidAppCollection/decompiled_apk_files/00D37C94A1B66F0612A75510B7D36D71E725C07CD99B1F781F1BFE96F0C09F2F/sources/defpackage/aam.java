package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aam  reason: default package */
/* loaded from: classes.dex */
public final class aam implements vh {
    public final Toolbar a;
    public int b;
    public View c;
    CharSequence d;
    public Window.Callback e;
    boolean f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private boolean j;
    private CharSequence k;
    private CharSequence l;
    private tq m;
    private int n;
    private Drawable o;

    public aam(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.d = toolbar.n;
        this.k = toolbar.o;
        this.j = this.d != null;
        this.i = toolbar.e();
        aad l = aad.l(toolbar.getContext(), null, pm.a, R.attr.actionBarStyle, 0);
        int i = 15;
        this.o = l.h(15);
        if (!z) {
            if (toolbar.e() != null) {
                this.o = toolbar.e();
            } else {
                i = 11;
            }
            this.b = i;
        } else {
            CharSequence m = l.m(27);
            if (!TextUtils.isEmpty(m)) {
                q(m);
            }
            CharSequence m2 = l.m(25);
            if (!TextUtils.isEmpty(m2)) {
                this.k = m2;
                if ((this.b & 8) != 0) {
                    toolbar.t(m2);
                }
            }
            Drawable h = l.h(20);
            if (h != null) {
                l(h);
            }
            Drawable h2 = l.h(17);
            if (h2 != null) {
                this.g = h2;
                H();
            }
            if (this.i == null && (drawable = this.o) != null) {
                p(drawable);
            }
            k(l.c(10, 0));
            int f = l.f(9, 0);
            if (f != 0) {
                j(LayoutInflater.from(toolbar.getContext()).inflate(f, (ViewGroup) toolbar, false));
                k(this.b | 16);
            }
            int e = l.e(13, 0);
            if (e > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = e;
                toolbar.setLayoutParams(layoutParams);
            }
            int a = l.a(7, -1);
            int a2 = l.a(3, -1);
            if (a >= 0 || a2 >= 0) {
                toolbar.m(Math.max(a, 0), Math.max(a2, 0));
            }
            int f2 = l.f(28, 0);
            if (f2 != 0) {
                toolbar.x(toolbar.getContext(), f2);
            }
            int f3 = l.f(26, 0);
            if (f3 != 0) {
                toolbar.u(toolbar.getContext(), f3);
            }
            int f4 = l.f(22, 0);
            if (f4 != 0) {
                toolbar.s(f4);
            }
        }
        l.o();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.h())) {
                o(this.n);
            }
        }
        this.l = toolbar.h();
        toolbar.r(new aak(this));
    }

    private final void E(CharSequence charSequence) {
        this.d = charSequence;
        if ((this.b & 8) != 0) {
            this.a.w(charSequence);
        }
    }

    private final void F() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.l)) {
                this.a.o(this.n);
            } else {
                this.a.p(this.l);
            }
        }
    }

    private final void G() {
        if ((this.b & 4) == 0) {
            this.a.q(null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.i;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.q(drawable);
    }

    private final void H() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.h;
            if (drawable == null) {
                drawable = this.g;
            }
        } else {
            drawable = this.g;
        }
        this.a.n(drawable);
    }

    @Override // defpackage.vh
    public final void A() {
    }

    @Override // defpackage.vh
    public final void B() {
    }

    @Override // defpackage.vh
    public final void C() {
    }

    @Override // defpackage.vh
    public final void D() {
        this.a.requestLayout();
    }

    @Override // defpackage.vh
    public final int a() {
        return this.b;
    }

    @Override // defpackage.vh
    public final Context b() {
        return this.a.getContext();
    }

    @Override // defpackage.vh
    public final ln c(int i, long j) {
        ln q = lj.q(this.a);
        q.c(i == 0 ? 1.0f : 0.0f);
        q.d(j);
        q.f(new aal(this, i));
        return q;
    }

    @Override // defpackage.vh
    public final View d() {
        return this.c;
    }

    @Override // defpackage.vh
    public final ViewGroup e() {
        return this.a;
    }

    @Override // defpackage.vh
    public final void f() {
        this.a.i();
    }

    @Override // defpackage.vh
    public final void g() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.e();
        }
    }

    @Override // defpackage.vh
    public final void h() {
    }

    @Override // defpackage.vh
    public final void i() {
    }

    @Override // defpackage.vh
    public final void j(View view) {
        View view2 = this.c;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.c = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    @Override // defpackage.vh
    public final void k(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    F();
                }
                G();
            }
            if ((i2 & 3) != 0) {
                H();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.w(this.d);
                    this.a.t(this.k);
                } else {
                    this.a.w(null);
                    this.a.t(null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // defpackage.vh
    public final void l(Drawable drawable) {
        this.h = drawable;
        H();
    }

    @Override // defpackage.vh
    public final void m(Menu menu, ss ssVar) {
        if (this.m == null) {
            this.m = new tq(this.a.getContext());
        }
        tq tqVar = this.m;
        tqVar.e = ssVar;
        Toolbar toolbar = this.a;
        if (menu == null && toolbar.a == null) {
            return;
        }
        toolbar.k();
        sf sfVar = toolbar.a.a;
        if (sfVar == menu) {
            return;
        }
        if (sfVar != null) {
            sfVar.m(toolbar.r);
            sfVar.m(toolbar.s);
        }
        if (toolbar.s == null) {
            toolbar.s = new aah(toolbar);
        }
        tqVar.o();
        if (menu != null) {
            sf sfVar2 = (sf) menu;
            sfVar2.h(tqVar, toolbar.f);
            sfVar2.h(toolbar.s, toolbar.f);
        } else {
            tqVar.b(toolbar.f, null);
            toolbar.s.b(toolbar.f, null);
            tqVar.i();
            toolbar.s.i();
        }
        toolbar.a.g(toolbar.g);
        toolbar.a.h(tqVar);
        toolbar.r = tqVar;
    }

    @Override // defpackage.vh
    public final void n() {
        this.f = true;
    }

    @Override // defpackage.vh
    public final void o(int i) {
        this.l = i == 0 ? null : b().getString(i);
        F();
    }

    @Override // defpackage.vh
    public final void p(Drawable drawable) {
        this.i = drawable;
        G();
    }

    @Override // defpackage.vh
    public final void q(CharSequence charSequence) {
        this.j = true;
        E(charSequence);
    }

    @Override // defpackage.vh
    public final void r(int i) {
        this.a.setVisibility(i);
    }

    @Override // defpackage.vh
    public final void s(Window.Callback callback) {
        this.e = callback;
    }

    @Override // defpackage.vh
    public final void t(CharSequence charSequence) {
        if (!this.j) {
            E(charSequence);
        }
    }

    @Override // defpackage.vh
    public final boolean u() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b;
    }

    @Override // defpackage.vh
    public final boolean v() {
        aah aahVar = this.a.s;
        return (aahVar == null || aahVar.b == null) ? false : true;
    }

    @Override // defpackage.vh
    public final boolean w() {
        tq tqVar;
        ActionMenuView actionMenuView = this.a.a;
        return (actionMenuView == null || (tqVar = actionMenuView.c) == null || !tqVar.k()) ? false : true;
    }

    @Override // defpackage.vh
    public final boolean x() {
        tq tqVar;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null || (tqVar = actionMenuView.c) == null) {
            return false;
        }
        return tqVar.m != null || tqVar.l();
    }

    @Override // defpackage.vh
    public final boolean y() {
        return this.a.A();
    }

    @Override // defpackage.vh
    public final boolean z() {
        return this.a.B();
    }
}
