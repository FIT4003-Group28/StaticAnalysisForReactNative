package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public class an implements t {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f924a;

    /* renamed from: b  reason: collision with root package name */
    CharSequence f925b;

    /* renamed from: c  reason: collision with root package name */
    Window.Callback f926c;

    /* renamed from: d  reason: collision with root package name */
    boolean f927d;
    private int e;
    private View f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private boolean j;
    private CharSequence k;
    private CharSequence l;
    private int m;
    private int n;
    private Drawable o;

    public an(Toolbar toolbar, boolean z) {
        this(toolbar, z, a.h.abc_action_bar_up_description, a.e.abc_ic_ab_back_material);
    }

    public an(Toolbar toolbar, boolean z, int i, int i2) {
        this.m = 0;
        this.n = 0;
        this.f924a = toolbar;
        this.f925b = toolbar.getTitle();
        this.k = toolbar.getSubtitle();
        this.j = this.f925b != null;
        this.i = toolbar.getNavigationIcon();
        am a2 = am.a(toolbar.getContext(), null, a.j.ActionBar, a.C0020a.actionBarStyle, 0);
        this.o = a2.a(a.j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence b2 = a2.b(a.j.ActionBar_title);
            if (!TextUtils.isEmpty(b2)) {
                b(b2);
            }
            CharSequence b3 = a2.b(a.j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(b3)) {
                c(b3);
            }
            Drawable a3 = a2.a(a.j.ActionBar_logo);
            if (a3 != null) {
                b(a3);
            }
            Drawable a4 = a2.a(a.j.ActionBar_icon);
            if (a4 != null) {
                a(a4);
            }
            if (this.i == null && this.o != null) {
                c(this.o);
            }
            d(a2.a(a.j.ActionBar_displayOptions, 0));
            int g = a2.g(a.j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                a(LayoutInflater.from(this.f924a.getContext()).inflate(g, (ViewGroup) this.f924a, false));
                d(this.e | 16);
            }
            int f = a2.f(a.j.ActionBar_height, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f924a.getLayoutParams();
                layoutParams.height = f;
                this.f924a.setLayoutParams(layoutParams);
            }
            int d2 = a2.d(a.j.ActionBar_contentInsetStart, -1);
            int d3 = a2.d(a.j.ActionBar_contentInsetEnd, -1);
            if (d2 >= 0 || d3 >= 0) {
                this.f924a.a(Math.max(d2, 0), Math.max(d3, 0));
            }
            int g2 = a2.g(a.j.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                this.f924a.a(this.f924a.getContext(), g2);
            }
            int g3 = a2.g(a.j.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                this.f924a.b(this.f924a.getContext(), g3);
            }
            int g4 = a2.g(a.j.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f924a.setPopupTheme(g4);
            }
        } else {
            this.e = c();
        }
        a2.a();
        c(i);
        this.l = this.f924a.getNavigationContentDescription();
        this.f924a.setNavigationOnClickListener(new View.OnClickListener() { // from class: android.support.v7.widget.an.1

            /* renamed from: a  reason: collision with root package name */
            final android.support.v7.view.menu.a f928a;

            {
                this.f928a = new android.support.v7.view.menu.a(an.this.f924a.getContext(), 0, 16908332, 0, 0, an.this.f925b);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (an.this.f926c == null || !an.this.f927d) {
                    return;
                }
                an.this.f926c.onMenuItemSelected(0, this.f928a);
            }
        });
    }

    public void c(int i) {
        if (i == this.n) {
            return;
        }
        this.n = i;
        if (!TextUtils.isEmpty(this.f924a.getNavigationContentDescription())) {
            return;
        }
        e(this.n);
    }

    private int c() {
        if (this.f924a.getNavigationIcon() != null) {
            this.o = this.f924a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    public Context b() {
        return this.f924a.getContext();
    }

    @Override // android.support.v7.widget.t
    public void a(Window.Callback callback) {
        this.f926c = callback;
    }

    @Override // android.support.v7.widget.t
    public void a(CharSequence charSequence) {
        if (!this.j) {
            e(charSequence);
        }
    }

    @Override // android.support.v7.widget.t
    public CharSequence a() {
        return this.f924a.getTitle();
    }

    public void b(CharSequence charSequence) {
        this.j = true;
        e(charSequence);
    }

    private void e(CharSequence charSequence) {
        this.f925b = charSequence;
        if ((this.e & 8) != 0) {
            this.f924a.setTitle(charSequence);
        }
    }

    public void c(CharSequence charSequence) {
        this.k = charSequence;
        if ((this.e & 8) != 0) {
            this.f924a.setSubtitle(charSequence);
        }
    }

    @Override // android.support.v7.widget.t
    public void a(int i) {
        a(i != 0 ? android.support.v7.b.a.b.b(b(), i) : null);
    }

    @Override // android.support.v7.widget.t
    public void a(Drawable drawable) {
        this.g = drawable;
        d();
    }

    @Override // android.support.v7.widget.t
    public void b(int i) {
        b(i != 0 ? android.support.v7.b.a.b.b(b(), i) : null);
    }

    public void b(Drawable drawable) {
        this.h = drawable;
        d();
    }

    private void d() {
        Drawable drawable;
        if ((this.e & 2) == 0) {
            drawable = null;
        } else if ((this.e & 1) != 0) {
            drawable = this.h != null ? this.h : this.g;
        } else {
            drawable = this.g;
        }
        this.f924a.setLogo(drawable);
    }

    public void d(int i) {
        int i2 = this.e ^ i;
        this.e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    f();
                }
                e();
            }
            if ((i2 & 3) != 0) {
                d();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f924a.setTitle(this.f925b);
                    this.f924a.setSubtitle(this.k);
                } else {
                    this.f924a.setTitle((CharSequence) null);
                    this.f924a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || this.f == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f924a.addView(this.f);
            } else {
                this.f924a.removeView(this.f);
            }
        }
    }

    public void a(View view) {
        if (this.f != null && (this.e & 16) != 0) {
            this.f924a.removeView(this.f);
        }
        this.f = view;
        if (view == null || (this.e & 16) == 0) {
            return;
        }
        this.f924a.addView(this.f);
    }

    public void c(Drawable drawable) {
        this.i = drawable;
        e();
    }

    private void e() {
        if ((this.e & 4) != 0) {
            this.f924a.setNavigationIcon(this.i != null ? this.i : this.o);
        } else {
            this.f924a.setNavigationIcon((Drawable) null);
        }
    }

    public void d(CharSequence charSequence) {
        this.l = charSequence;
        f();
    }

    public void e(int i) {
        d(i == 0 ? null : b().getString(i));
    }

    private void f() {
        if ((this.e & 4) != 0) {
            if (TextUtils.isEmpty(this.l)) {
                this.f924a.setNavigationContentDescription(this.n);
            } else {
                this.f924a.setNavigationContentDescription(this.l);
            }
        }
    }
}
