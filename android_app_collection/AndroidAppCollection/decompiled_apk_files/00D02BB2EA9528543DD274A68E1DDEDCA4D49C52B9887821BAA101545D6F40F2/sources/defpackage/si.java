package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: si  reason: default package */
/* loaded from: classes.dex */
public final class si extends qk implements wk {
    private static final Interpolator q = new AccelerateInterpolator();
    private static final Interpolator r = new DecelerateInterpolator();
    private boolean A;
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    yr d;
    ActionBarContextView e;
    View f;
    sh g;
    ud h;
    uc i;
    boolean j;
    boolean k;
    un l;
    boolean m;
    final oj n;
    final oj o;
    final sg p;
    private Context s;
    private boolean t;
    private boolean u;
    private final ArrayList<qi> v;
    private boolean w;
    private int x;
    private boolean y;
    private boolean z;

    public si(Activity activity, boolean z) {
        new ArrayList();
        this.v = new ArrayList<>();
        this.x = 0;
        this.j = true;
        this.z = true;
        this.n = new se(this);
        this.o = new sf(this);
        this.p = new sg(this);
        View decorView = activity.getWindow().getDecorView();
        t(decorView);
        if (!z) {
            this.f = decorView.findViewById(16908290);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(boolean z, boolean z2) {
        return z2 || !z;
    }

    private final void t(View view) {
        yr m;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof yr) {
            m = (yr) findViewById;
        } else if (findViewById instanceof Toolbar) {
            m = ((Toolbar) findViewById).m();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't make a decor toolbar out of ");
            sb.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }
        this.d = m;
        this.e = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.c = actionBarContainer;
        yr yrVar = this.d;
        if (yrVar == null || this.e == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = yrVar.b();
        if ((this.d.v() & 4) != 0) {
            this.t = true;
        }
        ub a = ub.a(this.a);
        int i = a.a.getApplicationInfo().targetSdkVersion;
        this.d.C();
        k(a.c());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, sj.a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (actionBarOverlayLayout2.b) {
                this.m = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            od.F(this.c, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u(boolean r6) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si.u(boolean):void");
    }

    @Override // defpackage.qk
    public final void a(CharSequence charSequence) {
        this.d.g(charSequence);
    }

    @Override // defpackage.qk
    public final void b(boolean z) {
        m(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.qk
    public final int c() {
        return this.d.v();
    }

    @Override // defpackage.qk
    public final Context d() {
        if (this.s == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.s = new ContextThemeWrapper(this.a, i);
            } else {
                this.s = this.a;
            }
        }
        return this.s;
    }

    @Override // defpackage.qk
    public final void e(boolean z) {
        if (!this.t) {
            b(z);
        }
    }

    @Override // defpackage.qk
    public final void f(boolean z) {
        un unVar;
        this.A = z;
        if (z || (unVar = this.l) == null) {
            return;
        }
        unVar.b();
    }

    @Override // defpackage.qk
    public final void g(boolean z) {
        if (z == this.u) {
            return;
        }
        this.u = z;
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            this.v.get(i).a();
        }
    }

    @Override // defpackage.qk
    public final void h(CharSequence charSequence) {
        this.d.f(charSequence);
    }

    @Override // defpackage.qk
    public final void i() {
        m(2, 2);
    }

    @Override // defpackage.qk
    public final void j() {
        this.d.m(null);
    }

    public final void k(boolean z) {
        boolean z2;
        this.w = z;
        if (!z) {
            this.d.B();
            this.c.setTabContainer(null);
        } else {
            this.c.setTabContainer(null);
            this.d.B();
        }
        int y = this.d.y();
        yr yrVar = this.d;
        boolean z3 = true;
        if (this.w || y != 2) {
            z2 = false;
        } else {
            y = 2;
            z2 = true;
        }
        yrVar.x(z2);
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (this.w || y != 2) {
            z3 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z3);
    }

    @Override // defpackage.wk
    public final void l(int i) {
        this.x = i;
    }

    public final void m(int i, int i2) {
        int v = this.d.v();
        if ((i2 & 4) != 0) {
            this.t = true;
        }
        this.d.w((i & i2) | ((i2 ^ (-1)) & v));
    }

    @Override // defpackage.wk
    public final void n(boolean z) {
        this.j = z;
    }

    @Override // defpackage.wk
    public final void o() {
        if (this.k) {
            this.k = false;
            u(true);
        }
    }

    @Override // defpackage.wk
    public final void p() {
        if (!this.k) {
            this.k = true;
            u(true);
        }
    }

    public final void q(boolean z) {
        oi z2;
        oi a;
        if (z) {
            if (!this.y) {
                this.y = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.b;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                u(false);
            }
        } else if (this.y) {
            this.y = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            u(false);
        }
        if (!od.ae(this.c)) {
            if (z) {
                this.d.A(4);
                this.e.setVisibility(0);
                return;
            }
            this.d.A(0);
            this.e.setVisibility(8);
            return;
        }
        if (z) {
            a = this.d.z(4, 100L);
            z2 = this.e.a(0, 200L);
        } else {
            z2 = this.d.z(0, 200L);
            a = this.e.a(8, 100L);
        }
        un unVar = new un();
        unVar.a.add(a);
        View view = a.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = z2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        unVar.a.add(z2);
        unVar.a();
    }

    @Override // defpackage.wk
    public final void r() {
        un unVar = this.l;
        if (unVar != null) {
            unVar.b();
            this.l = null;
        }
    }

    public si(Dialog dialog) {
        new ArrayList();
        this.v = new ArrayList<>();
        this.x = 0;
        this.j = true;
        this.z = true;
        this.n = new se(this);
        this.o = new sf(this);
        this.p = new sg(this);
        t(dialog.getWindow().getDecorView());
    }
}
