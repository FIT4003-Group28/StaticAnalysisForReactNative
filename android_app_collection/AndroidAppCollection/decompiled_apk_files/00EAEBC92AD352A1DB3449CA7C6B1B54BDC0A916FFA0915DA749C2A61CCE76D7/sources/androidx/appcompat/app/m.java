package androidx.appcompat.app;

import a.a.o.b;
import a.g.m.a0;
import a.g.m.b0;
import a.g.m.c0;
import a.g.m.v;
import a.g.m.z;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class m extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator B = new AccelerateInterpolator();
    private static final Interpolator C = new DecelerateInterpolator();
    final c0 A;

    /* renamed from: a  reason: collision with root package name */
    Context f972a;

    /* renamed from: b  reason: collision with root package name */
    private Context f973b;

    /* renamed from: c  reason: collision with root package name */
    ActionBarOverlayLayout f974c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarContainer f975d;

    /* renamed from: e  reason: collision with root package name */
    d0 f976e;

    /* renamed from: f  reason: collision with root package name */
    ActionBarContextView f977f;

    /* renamed from: g  reason: collision with root package name */
    View f978g;

    /* renamed from: h  reason: collision with root package name */
    p0 f979h;
    private boolean i;
    d j;
    a.a.o.b k;
    b.a l;
    private boolean m;
    private ArrayList<a.b> n;
    private boolean o;
    private int p;
    boolean q;
    boolean r;
    boolean s;
    private boolean t;
    private boolean u;
    a.a.o.h v;
    private boolean w;
    boolean x;
    final a0 y;
    final a0 z;

    /* loaded from: classes.dex */
    class a extends b0 {
        a() {
        }

        @Override // a.g.m.a0
        public void b(View view) {
            View view2;
            m mVar = m.this;
            if (mVar.q && (view2 = mVar.f978g) != null) {
                view2.setTranslationY(0.0f);
                m.this.f975d.setTranslationY(0.0f);
            }
            m.this.f975d.setVisibility(8);
            m.this.f975d.setTransitioning(false);
            m mVar2 = m.this;
            mVar2.v = null;
            mVar2.l();
            ActionBarOverlayLayout actionBarOverlayLayout = m.this.f974c;
            if (actionBarOverlayLayout != null) {
                v.N(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends b0 {
        b() {
        }

        @Override // a.g.m.a0
        public void b(View view) {
            m mVar = m.this;
            mVar.v = null;
            mVar.f975d.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    class c implements c0 {
        c() {
        }

        @Override // a.g.m.c0
        public void a(View view) {
            ((View) m.this.f975d.getParent()).invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d extends a.a.o.b implements g.a {

        /* renamed from: d  reason: collision with root package name */
        private final Context f983d;

        /* renamed from: e  reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f984e;

        /* renamed from: f  reason: collision with root package name */
        private b.a f985f;

        /* renamed from: g  reason: collision with root package name */
        private WeakReference<View> f986g;

        public d(Context context, b.a aVar) {
            this.f983d = context;
            this.f985f = aVar;
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            gVar.c(1);
            this.f984e = gVar;
            this.f984e.a(this);
        }

        @Override // a.a.o.b
        public void a() {
            m mVar = m.this;
            if (mVar.j != this) {
                return;
            }
            if (!m.a(mVar.r, mVar.s, false)) {
                m mVar2 = m.this;
                mVar2.k = this;
                mVar2.l = this.f985f;
            } else {
                this.f985f.a(this);
            }
            this.f985f = null;
            m.this.f(false);
            m.this.f977f.a();
            m.this.f976e.h().sendAccessibilityEvent(32);
            m mVar3 = m.this;
            mVar3.f974c.setHideOnContentScrollEnabled(mVar3.x);
            m.this.j = null;
        }

        @Override // a.a.o.b
        public void a(int i) {
            a((CharSequence) m.this.f972a.getResources().getString(i));
        }

        @Override // a.a.o.b
        public void a(View view) {
            m.this.f977f.setCustomView(view);
            this.f986g = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void a(androidx.appcompat.view.menu.g gVar) {
            if (this.f985f == null) {
                return;
            }
            i();
            m.this.f977f.d();
        }

        @Override // a.a.o.b
        public void a(CharSequence charSequence) {
            m.this.f977f.setSubtitle(charSequence);
        }

        @Override // a.a.o.b
        public void a(boolean z) {
            super.a(z);
            m.this.f977f.setTitleOptional(z);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            b.a aVar = this.f985f;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // a.a.o.b
        public View b() {
            WeakReference<View> weakReference = this.f986g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // a.a.o.b
        public void b(int i) {
            b(m.this.f972a.getResources().getString(i));
        }

        @Override // a.a.o.b
        public void b(CharSequence charSequence) {
            m.this.f977f.setTitle(charSequence);
        }

        @Override // a.a.o.b
        public Menu c() {
            return this.f984e;
        }

        @Override // a.a.o.b
        public MenuInflater d() {
            return new a.a.o.g(this.f983d);
        }

        @Override // a.a.o.b
        public CharSequence e() {
            return m.this.f977f.getSubtitle();
        }

        @Override // a.a.o.b
        public CharSequence g() {
            return m.this.f977f.getTitle();
        }

        @Override // a.a.o.b
        public void i() {
            if (m.this.j != this) {
                return;
            }
            this.f984e.s();
            try {
                this.f985f.a(this, this.f984e);
            } finally {
                this.f984e.r();
            }
        }

        @Override // a.a.o.b
        public boolean j() {
            return m.this.f977f.b();
        }

        public boolean k() {
            this.f984e.s();
            try {
                return this.f985f.b(this, this.f984e);
            } finally {
                this.f984e.r();
            }
        }
    }

    public m(Activity activity, boolean z) {
        new ArrayList();
        this.n = new ArrayList<>();
        this.p = 0;
        this.q = true;
        this.u = true;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (!z) {
            this.f978g = decorView.findViewById(16908290);
        }
    }

    public m(Dialog dialog) {
        new ArrayList();
        this.n = new ArrayList<>();
        this.p = 0;
        this.q = true;
        this.u = true;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        b(dialog.getWindow().getDecorView());
    }

    private d0 a(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    static boolean a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    private void b(View view) {
        this.f974c = (ActionBarOverlayLayout) view.findViewById(a.a.f.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f974c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f976e = a(view.findViewById(a.a.f.action_bar));
        this.f977f = (ActionBarContextView) view.findViewById(a.a.f.action_context_bar);
        this.f975d = (ActionBarContainer) view.findViewById(a.a.f.action_bar_container);
        d0 d0Var = this.f976e;
        if (d0Var == null || this.f977f == null || this.f975d == null) {
            throw new IllegalStateException(m.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f972a = d0Var.i();
        boolean z = (this.f976e.k() & 4) != 0;
        if (z) {
            this.i = true;
        }
        a.a.o.a a2 = a.a.o.a.a(this.f972a);
        j(a2.a() || z);
        k(a2.f());
        TypedArray obtainStyledAttributes = this.f972a.obtainStyledAttributes(null, a.a.j.ActionBar, a.a.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(a.a.j.ActionBar_hideOnContentScroll, false)) {
            i(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.a.j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            a(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void k(boolean z) {
        this.o = z;
        if (!this.o) {
            this.f976e.a((p0) null);
            this.f975d.setTabContainer(this.f979h);
        } else {
            this.f975d.setTabContainer(null);
            this.f976e.a(this.f979h);
        }
        boolean z2 = true;
        boolean z3 = m() == 2;
        p0 p0Var = this.f979h;
        if (p0Var != null) {
            if (z3) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f974c;
                if (actionBarOverlayLayout != null) {
                    v.N(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.f976e.b(!this.o && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f974c;
        if (this.o || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    private void l(boolean z) {
        if (a(this.r, this.s, this.t)) {
            if (this.u) {
                return;
            }
            this.u = true;
            h(z);
        } else if (!this.u) {
        } else {
            this.u = false;
            g(z);
        }
    }

    private void n() {
        if (this.t) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f974c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            l(false);
        }
    }

    private boolean o() {
        return v.I(this.f975d);
    }

    private void p() {
        if (!this.t) {
            this.t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f974c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            l(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public a.a.o.b a(b.a aVar) {
        d dVar = this.j;
        if (dVar != null) {
            dVar.a();
        }
        this.f974c.setHideOnContentScrollEnabled(false);
        this.f977f.c();
        d dVar2 = new d(this.f977f.getContext(), aVar);
        if (dVar2.k()) {
            this.j = dVar2;
            dVar2.i();
            this.f977f.a(dVar2);
            f(true);
            this.f977f.sendAccessibilityEvent(32);
            return dVar2;
        }
        return null;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.s) {
            this.s = false;
            l(true);
        }
    }

    public void a(float f2) {
        v.a(this.f975d, f2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a(int i) {
        this.p = i;
    }

    public void a(int i, int i2) {
        int k = this.f976e.k();
        if ((i2 & 4) != 0) {
            this.i = true;
        }
        this.f976e.a((i & i2) | ((~i2) & k));
    }

    @Override // androidx.appcompat.app.a
    public void a(Configuration configuration) {
        k(a.a.o.a.a(this.f972a).f());
    }

    @Override // androidx.appcompat.app.a
    public void a(Drawable drawable) {
        this.f976e.a(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void a(CharSequence charSequence) {
        this.f976e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a(boolean z) {
        this.q = z;
    }

    @Override // androidx.appcompat.app.a
    public boolean a(int i, KeyEvent keyEvent) {
        Menu c2;
        d dVar = this.j;
        if (dVar == null || (c2 = dVar.c()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        c2.setQwertyMode(z);
        return c2.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        a.a.o.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
            this.v = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public void b(CharSequence charSequence) {
        this.f976e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void b(boolean z) {
        if (z == this.m) {
            return;
        }
        this.m = z;
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            this.n.get(i).a(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
    }

    @Override // androidx.appcompat.app.a
    public void c(boolean z) {
        if (!this.i) {
            d(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (!this.s) {
            this.s = true;
            l(true);
        }
    }

    @Override // androidx.appcompat.app.a
    public void d(boolean z) {
        a(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void e(boolean z) {
        a.a.o.h hVar;
        this.w = z;
        if (z || (hVar = this.v) == null) {
            return;
        }
        hVar.a();
    }

    public void f(boolean z) {
        z a2;
        z a3;
        if (z) {
            p();
        } else {
            n();
        }
        if (!o()) {
            if (z) {
                this.f976e.setVisibility(4);
                this.f977f.setVisibility(0);
                return;
            }
            this.f976e.setVisibility(0);
            this.f977f.setVisibility(8);
            return;
        }
        if (z) {
            a3 = this.f976e.a(4, 100L);
            a2 = this.f977f.a(0, 200L);
        } else {
            a2 = this.f976e.a(0, 200L);
            a3 = this.f977f.a(8, 100L);
        }
        a.a.o.h hVar = new a.a.o.h();
        hVar.a(a3, a2);
        hVar.c();
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        d0 d0Var = this.f976e;
        if (d0Var == null || !d0Var.j()) {
            return false;
        }
        this.f976e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public int g() {
        return this.f976e.k();
    }

    public void g(boolean z) {
        View view;
        int[] iArr;
        a.a.o.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        if (this.p != 0 || (!this.w && !z)) {
            this.y.b(null);
            return;
        }
        this.f975d.setAlpha(1.0f);
        this.f975d.setTransitioning(true);
        a.a.o.h hVar2 = new a.a.o.h();
        float f2 = -this.f975d.getHeight();
        if (z) {
            this.f975d.getLocationInWindow(new int[]{0, 0});
            f2 -= iArr[1];
        }
        z a2 = v.a(this.f975d);
        a2.b(f2);
        a2.a(this.A);
        hVar2.a(a2);
        if (this.q && (view = this.f978g) != null) {
            z a3 = v.a(view);
            a3.b(f2);
            hVar2.a(a3);
        }
        hVar2.a(B);
        hVar2.a(250L);
        hVar2.a(this.y);
        this.v = hVar2;
        hVar2.c();
    }

    @Override // androidx.appcompat.app.a
    public Context h() {
        if (this.f973b == null) {
            TypedValue typedValue = new TypedValue();
            this.f972a.getTheme().resolveAttribute(a.a.a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f973b = new ContextThemeWrapper(this.f972a, i);
            } else {
                this.f973b = this.f972a;
            }
        }
        return this.f973b;
    }

    public void h(boolean z) {
        View view;
        View view2;
        int[] iArr;
        a.a.o.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        this.f975d.setVisibility(0);
        if (this.p != 0 || (!this.w && !z)) {
            this.f975d.setAlpha(1.0f);
            this.f975d.setTranslationY(0.0f);
            if (this.q && (view = this.f978g) != null) {
                view.setTranslationY(0.0f);
            }
            this.z.b(null);
        } else {
            this.f975d.setTranslationY(0.0f);
            float f2 = -this.f975d.getHeight();
            if (z) {
                this.f975d.getLocationInWindow(new int[]{0, 0});
                f2 -= iArr[1];
            }
            this.f975d.setTranslationY(f2);
            a.a.o.h hVar2 = new a.a.o.h();
            z a2 = v.a(this.f975d);
            a2.b(0.0f);
            a2.a(this.A);
            hVar2.a(a2);
            if (this.q && (view2 = this.f978g) != null) {
                view2.setTranslationY(f2);
                z a3 = v.a(this.f978g);
                a3.b(0.0f);
                hVar2.a(a3);
            }
            hVar2.a(C);
            hVar2.a(250L);
            hVar2.a(this.z);
            this.v = hVar2;
            hVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f974c;
        if (actionBarOverlayLayout != null) {
            v.N(actionBarOverlayLayout);
        }
    }

    public void i(boolean z) {
        if (!z || this.f974c.i()) {
            this.x = z;
            this.f974c.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void j(boolean z) {
        this.f976e.a(z);
    }

    void l() {
        b.a aVar = this.l;
        if (aVar != null) {
            aVar.a(this.k);
            this.k = null;
            this.l = null;
        }
    }

    public int m() {
        return this.f976e.m();
    }
}
