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
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: afa  reason: default package */
/* loaded from: classes2.dex */
public final class afa implements yr {
    final Toolbar a;
    CharSequence b;
    Window.Callback c;
    boolean d;
    private int e;
    private View f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private boolean j;
    private CharSequence k;
    private CharSequence l;
    private wt m;
    private int n;
    private final Drawable o;

    public afa(Toolbar toolbar) {
        this.n = 0;
        this.a = toolbar;
        this.b = toolbar.i;
        this.k = toolbar.j;
        this.j = this.b != null;
        this.i = toolbar.e();
        String str = null;
        aeq b = aeq.b(toolbar.getContext(), null, sj.a, R.attr.actionBarStyle, 0);
        Drawable d = b.d(15);
        this.o = d;
        CharSequence f = b.f(27);
        if (!TextUtils.isEmpty(f)) {
            g(f);
        }
        CharSequence f2 = b.f(25);
        if (!TextUtils.isEmpty(f2)) {
            this.k = f2;
            if ((this.e & 8) != 0) {
                toolbar.setSubtitle(f2);
            }
        }
        Drawable d2 = b.d(20);
        if (d2 != null) {
            m(d2);
        }
        Drawable d3 = b.d(17);
        if (d3 != null) {
            k(d3);
        }
        if (this.i == null && d != null) {
            this.i = d;
            F();
        }
        w(b.i(10, 0));
        int o = b.o(9, 0);
        if (o != 0) {
            View inflate = LayoutInflater.from(toolbar.getContext()).inflate(o, (ViewGroup) toolbar, false);
            View view = this.f;
            if (view != null && (this.e & 16) != 0) {
                toolbar.removeView(view);
            }
            this.f = inflate;
            if (inflate != null && (this.e & 16) != 0) {
                toolbar.addView(inflate);
            }
            w(this.e | 16);
        }
        int n = b.n(13, 0);
        if (n > 0) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            layoutParams.height = n;
            toolbar.setLayoutParams(layoutParams);
        }
        int l = b.l(7, -1);
        int l2 = b.l(3, -1);
        if (l >= 0 || l2 >= 0) {
            toolbar.setContentInsetsRelative(Math.max(l, 0), Math.max(l2, 0));
        }
        int o2 = b.o(28, 0);
        if (o2 != 0) {
            toolbar.setTitleTextAppearance(toolbar.getContext(), o2);
        }
        int o3 = b.o(26, 0);
        if (o3 != 0) {
            toolbar.setSubtitleTextAppearance(toolbar.getContext(), o3);
        }
        int o4 = b.o(22, 0);
        if (o4 != 0) {
            toolbar.setPopupTheme(o4);
        }
        b.q();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.d())) {
                int i = this.n;
                this.l = i != 0 ? b().getString(i) : str;
                G();
            }
        }
        this.l = toolbar.d();
        toolbar.setNavigationOnClickListener(new aey(this));
    }

    private final void D(CharSequence charSequence) {
        this.b = charSequence;
        if ((this.e & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    private final void E() {
        Drawable drawable;
        int i = this.e;
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
        this.a.setLogo(drawable);
    }

    private final void F() {
        if ((this.e & 4) == 0) {
            this.a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.i;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private final void G() {
        if ((this.e & 4) != 0) {
            if (TextUtils.isEmpty(this.l)) {
                this.a.setNavigationContentDescription(this.n);
            } else {
                this.a.setNavigationContentDescription(this.l);
            }
        }
    }

    @Override // defpackage.yr
    public final void A(int i) {
        this.a.setVisibility(i);
    }

    @Override // defpackage.yr
    public final void B() {
    }

    @Override // defpackage.yr
    public final void C() {
    }

    @Override // defpackage.yr
    public final ViewGroup a() {
        return this.a;
    }

    @Override // defpackage.yr
    public final Context b() {
        return this.a.getContext();
    }

    @Override // defpackage.yr
    public final boolean c() {
        aeu aeuVar = this.a.m;
        return (aeuVar == null || aeuVar.b == null) ? false : true;
    }

    @Override // defpackage.yr
    public final void d() {
        this.a.c();
    }

    @Override // defpackage.yr
    public final void e(Window.Callback callback) {
        this.c = callback;
    }

    @Override // defpackage.yr
    public final void f(CharSequence charSequence) {
        if (!this.j) {
            D(charSequence);
        }
    }

    @Override // defpackage.yr
    public final void g(CharSequence charSequence) {
        this.j = true;
        D(charSequence);
    }

    @Override // defpackage.yr
    public final void h() {
    }

    @Override // defpackage.yr
    public final void i() {
    }

    @Override // defpackage.yr
    public final void j(int i) {
        k(i != 0 ? sl.b(b(), i) : null);
    }

    @Override // defpackage.yr
    public final void k(Drawable drawable) {
        this.g = drawable;
        E();
    }

    @Override // defpackage.yr
    public final void l(int i) {
        m(i != 0 ? sl.b(b(), i) : null);
    }

    @Override // defpackage.yr
    public final void m(Drawable drawable) {
        this.h = drawable;
        E();
    }

    @Override // defpackage.yr
    public final boolean n() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b;
    }

    @Override // defpackage.yr
    public final boolean o() {
        return this.a.a();
    }

    @Override // defpackage.yr
    public final boolean p() {
        wt wtVar;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null || (wtVar = actionMenuView.c) == null) {
            return false;
        }
        return wtVar.n != null || wtVar.l();
    }

    @Override // defpackage.yr
    public final boolean q() {
        return this.a.b();
    }

    @Override // defpackage.yr
    public final boolean r() {
        wt wtVar;
        ActionMenuView actionMenuView = this.a.a;
        return (actionMenuView == null || (wtVar = actionMenuView.c) == null || !wtVar.k()) ? false : true;
    }

    @Override // defpackage.yr
    public final void s() {
        this.d = true;
    }

    @Override // defpackage.yr
    public final void t(Menu menu, vs vsVar) {
        if (this.m == null) {
            this.m = new wt(this.a.getContext());
        }
        wt wtVar = this.m;
        wtVar.e = vsVar;
        this.a.setMenu((vf) menu, wtVar);
    }

    @Override // defpackage.yr
    public final void u() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.e();
        }
    }

    @Override // defpackage.yr
    public final int v() {
        return this.e;
    }

    @Override // defpackage.yr
    public final void w(int i) {
        View view;
        int i2 = this.e ^ i;
        this.e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    G();
                }
                F();
            }
            if ((i2 & 3) != 0) {
                E();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.b);
                    this.a.setSubtitle(this.k);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // defpackage.yr
    public final void x(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // defpackage.yr
    public final int y() {
        return 0;
    }

    @Override // defpackage.yr
    public final oi z(int i, long j) {
        oi B = od.B(this.a);
        B.b(i == 0 ? 1.0f : 0.0f);
        B.e(j);
        B.f(new aez(this, i));
        return B;
    }
}
