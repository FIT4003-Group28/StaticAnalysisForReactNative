package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.Toolbar;
/* loaded from: classes.dex */
public class y0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f1433a;

    /* renamed from: b  reason: collision with root package name */
    private int f1434b;

    /* renamed from: c  reason: collision with root package name */
    private View f1435c;

    /* renamed from: d  reason: collision with root package name */
    private View f1436d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1437e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1438f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1439g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1440h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private c n;
    private int o;
    private int p;
    private Drawable q;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final androidx.appcompat.view.menu.a f1441b;

        a() {
            this.f1441b = new androidx.appcompat.view.menu.a(y0.this.f1433a.getContext(), 0, 16908332, 0, 0, y0.this.i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y0 y0Var = y0.this;
            Window.Callback callback = y0Var.l;
            if (callback == null || !y0Var.m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1441b);
        }
    }

    /* loaded from: classes.dex */
    class b extends a.g.m.b0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1443a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1444b;

        b(int i) {
            this.f1444b = i;
        }

        @Override // a.g.m.b0, a.g.m.a0
        public void a(View view) {
            this.f1443a = true;
        }

        @Override // a.g.m.a0
        public void b(View view) {
            if (!this.f1443a) {
                y0.this.f1433a.setVisibility(this.f1444b);
            }
        }

        @Override // a.g.m.b0, a.g.m.a0
        public void c(View view) {
            y0.this.f1433a.setVisibility(0);
        }
    }

    public y0(Toolbar toolbar, boolean z) {
        this(toolbar, z, a.a.h.abc_action_bar_up_description, a.a.e.abc_ic_ab_back_material);
    }

    public y0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.f1433a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.f1440h = this.i != null;
        this.f1439g = toolbar.getNavigationIcon();
        x0 a2 = x0.a(toolbar.getContext(), null, a.a.j.ActionBar, a.a.a.actionBarStyle, 0);
        this.q = a2.b(a.a.j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e2 = a2.e(a.a.j.ActionBar_title);
            if (!TextUtils.isEmpty(e2)) {
                setTitle(e2);
            }
            CharSequence e3 = a2.e(a.a.j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e3)) {
                b(e3);
            }
            Drawable b2 = a2.b(a.a.j.ActionBar_logo);
            if (b2 != null) {
                b(b2);
            }
            Drawable b3 = a2.b(a.a.j.ActionBar_icon);
            if (b3 != null) {
                setIcon(b3);
            }
            if (this.f1439g == null && (drawable = this.q) != null) {
                a(drawable);
            }
            a(a2.d(a.a.j.ActionBar_displayOptions, 0));
            int g2 = a2.g(a.a.j.ActionBar_customNavigationLayout, 0);
            if (g2 != 0) {
                a(LayoutInflater.from(this.f1433a.getContext()).inflate(g2, (ViewGroup) this.f1433a, false));
                a(this.f1434b | 16);
            }
            int f2 = a2.f(a.a.j.ActionBar_height, 0);
            if (f2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1433a.getLayoutParams();
                layoutParams.height = f2;
                this.f1433a.setLayoutParams(layoutParams);
            }
            int b4 = a2.b(a.a.j.ActionBar_contentInsetStart, -1);
            int b5 = a2.b(a.a.j.ActionBar_contentInsetEnd, -1);
            if (b4 >= 0 || b5 >= 0) {
                this.f1433a.a(Math.max(b4, 0), Math.max(b5, 0));
            }
            int g3 = a2.g(a.a.j.ActionBar_titleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar2 = this.f1433a;
                toolbar2.b(toolbar2.getContext(), g3);
            }
            int g4 = a2.g(a.a.j.ActionBar_subtitleTextStyle, 0);
            if (g4 != 0) {
                Toolbar toolbar3 = this.f1433a;
                toolbar3.a(toolbar3.getContext(), g4);
            }
            int g5 = a2.g(a.a.j.ActionBar_popupTheme, 0);
            if (g5 != 0) {
                this.f1433a.setPopupTheme(g5);
            }
        } else {
            this.f1434b = p();
        }
        a2.a();
        c(i);
        this.k = this.f1433a.getNavigationContentDescription();
        this.f1433a.setNavigationOnClickListener(new a());
    }

    private void c(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.f1434b & 8) != 0) {
            this.f1433a.setTitle(charSequence);
        }
    }

    private int p() {
        if (this.f1433a.getNavigationIcon() != null) {
            this.q = this.f1433a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    private void q() {
        if ((this.f1434b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.f1433a.setNavigationContentDescription(this.p);
            } else {
                this.f1433a.setNavigationContentDescription(this.k);
            }
        }
    }

    private void r() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1434b & 4) != 0) {
            toolbar = this.f1433a;
            drawable = this.f1439g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.f1433a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void s() {
        Drawable drawable;
        int i = this.f1434b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f1438f) == null) {
            drawable = this.f1437e;
        }
        this.f1433a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.d0
    public a.g.m.z a(int i, long j) {
        a.g.m.z a2 = a.g.m.v.a(this.f1433a);
        a2.a(i == 0 ? 1.0f : 0.0f);
        a2.a(j);
        a2.a(new b(i));
        return a2;
    }

    @Override // androidx.appcompat.widget.d0
    public void a(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1434b ^ i;
        this.f1434b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    q();
                }
                r();
            }
            if ((i2 & 3) != 0) {
                s();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1433a.setTitle(this.i);
                    toolbar = this.f1433a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.f1433a.setTitle((CharSequence) null);
                    toolbar = this.f1433a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f1436d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f1433a.addView(view);
            } else {
                this.f1433a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void a(Drawable drawable) {
        this.f1439g = drawable;
        r();
    }

    @Override // androidx.appcompat.widget.d0
    public void a(Menu menu, n.a aVar) {
        if (this.n == null) {
            this.n = new c(this.f1433a.getContext());
            this.n.a(a.a.f.action_menu_presenter);
        }
        this.n.a(aVar);
        this.f1433a.a((androidx.appcompat.view.menu.g) menu, this.n);
    }

    public void a(View view) {
        View view2 = this.f1436d;
        if (view2 != null && (this.f1434b & 16) != 0) {
            this.f1433a.removeView(view2);
        }
        this.f1436d = view;
        if (view == null || (this.f1434b & 16) == 0) {
            return;
        }
        this.f1433a.addView(this.f1436d);
    }

    @Override // androidx.appcompat.widget.d0
    public void a(n.a aVar, g.a aVar2) {
        this.f1433a.a(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.d0
    public void a(p0 p0Var) {
        View view = this.f1435c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1433a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1435c);
            }
        }
        this.f1435c = p0Var;
        if (p0Var == null || this.o != 2) {
            return;
        }
        this.f1433a.addView(this.f1435c, 0);
        Toolbar.e eVar = (Toolbar.e) this.f1435c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f893a = 8388691;
        p0Var.setAllowCollapse(true);
    }

    public void a(CharSequence charSequence) {
        this.k = charSequence;
        q();
    }

    @Override // androidx.appcompat.widget.d0
    public void a(boolean z) {
    }

    @Override // androidx.appcompat.widget.d0
    public boolean a() {
        return this.f1433a.i();
    }

    @Override // androidx.appcompat.widget.d0
    public void b() {
        this.m = true;
    }

    @Override // androidx.appcompat.widget.d0
    public void b(int i) {
        b(i != 0 ? a.a.k.a.a.c(i(), i) : null);
    }

    public void b(Drawable drawable) {
        this.f1438f = drawable;
        s();
    }

    public void b(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.f1434b & 8) != 0) {
            this.f1433a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void b(boolean z) {
        this.f1433a.setCollapsible(z);
    }

    public void c(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        if (!TextUtils.isEmpty(this.f1433a.getNavigationContentDescription())) {
            return;
        }
        d(this.p);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean c() {
        return this.f1433a.h();
    }

    @Override // androidx.appcompat.widget.d0
    public void collapseActionView() {
        this.f1433a.c();
    }

    public void d(int i) {
        a(i == 0 ? null : i().getString(i));
    }

    @Override // androidx.appcompat.widget.d0
    public boolean d() {
        return this.f1433a.g();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean e() {
        return this.f1433a.k();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean f() {
        return this.f1433a.b();
    }

    @Override // androidx.appcompat.widget.d0
    public void g() {
        this.f1433a.d();
    }

    @Override // androidx.appcompat.widget.d0
    public CharSequence getTitle() {
        return this.f1433a.getTitle();
    }

    @Override // androidx.appcompat.widget.d0
    public ViewGroup h() {
        return this.f1433a;
    }

    @Override // androidx.appcompat.widget.d0
    public Context i() {
        return this.f1433a.getContext();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean j() {
        return this.f1433a.f();
    }

    @Override // androidx.appcompat.widget.d0
    public int k() {
        return this.f1434b;
    }

    @Override // androidx.appcompat.widget.d0
    public Menu l() {
        return this.f1433a.getMenu();
    }

    @Override // androidx.appcompat.widget.d0
    public int m() {
        return this.o;
    }

    @Override // androidx.appcompat.widget.d0
    public void n() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public void o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(int i) {
        setIcon(i != 0 ? a.a.k.a.a.c(i(), i) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(Drawable drawable) {
        this.f1437e = drawable;
        s();
    }

    @Override // androidx.appcompat.widget.d0
    public void setTitle(CharSequence charSequence) {
        this.f1440h = true;
        c(charSequence);
    }

    @Override // androidx.appcompat.widget.d0
    public void setVisibility(int i) {
        this.f1433a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1440h) {
            c(charSequence);
        }
    }
}
