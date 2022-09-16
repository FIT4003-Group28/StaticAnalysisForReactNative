package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: pl  reason: default package */
/* loaded from: classes4.dex */
public final class pl extends nj implements ti {
    private static final Interpolator s = new AccelerateInterpolator();
    private static final Interpolator t = new DecelerateInterpolator();
    private boolean A;
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    vh d;
    ActionBarContextView e;
    View f;
    pk g;
    re h;
    rd i;
    public int j;
    public boolean k;
    boolean l;
    public boolean m;
    public rn n;
    boolean o;
    final lo p;
    final lo q;
    final pj r;
    private Context u;
    private boolean v;
    private boolean w;
    private final ArrayList x;
    private boolean y;
    private boolean z;

    public pl(Activity activity, boolean z) {
        new ArrayList();
        this.x = new ArrayList();
        this.j = 0;
        this.k = true;
        this.z = true;
        this.p = new ph(this);
        this.q = new pi(this);
        this.r = new pj(this);
        View decorView = activity.getWindow().getDecorView();
        G(decorView);
        if (!z) {
            this.f = decorView.findViewById(16908290);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean F(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    private final void G(View view) {
        vh f;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((pl) actionBarOverlayLayout.h).j = actionBarOverlayLayout.b;
                int i = actionBarOverlayLayout.g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    lj.K(actionBarOverlayLayout);
                }
            }
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof vh) {
            f = (vh) findViewById;
        } else if (findViewById instanceof Toolbar) {
            f = ((Toolbar) findViewById).f();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't make a decor toolbar out of ");
            sb.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }
        this.d = f;
        this.e = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.c = actionBarContainer;
        vh vhVar = this.d;
        if (vhVar == null || this.e == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = vhVar.b();
        if ((this.d.a() & 4) != 0) {
            this.v = true;
        }
        Context context = this.a;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        C();
        H(ld.e(context));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, pm.a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (actionBarOverlayLayout2.d) {
                this.o = true;
                actionBarOverlayLayout2.l(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            lj.S(this.c, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.nj
    public final void A() {
        this.d.o(R.string.abc_action_bar_up_description);
    }

    @Override // defpackage.nj
    public final void B() {
        this.d.l(null);
    }

    @Override // defpackage.nj
    public final void C() {
        this.d.C();
    }

    public final void D(boolean z) {
        ln c;
        ln b;
        if (z) {
            if (!this.y) {
                this.y = true;
                E(false);
            }
        } else if (this.y) {
            this.y = false;
            E(false);
        }
        if (!lj.al(this.c)) {
            if (z) {
                this.d.r(4);
                this.e.setVisibility(0);
                return;
            }
            this.d.r(0);
            this.e.setVisibility(8);
            return;
        }
        if (z) {
            b = this.d.c(4, 100L);
            c = this.e.b(0, 200L);
        } else {
            c = this.d.c(0, 200L);
            b = this.e.b(8, 100L);
        }
        rn rnVar = new rn();
        rnVar.a.add(b);
        View view = (View) b.a.get();
        c.g(view != null ? view.animate().getDuration() : 0L);
        rnVar.a.add(c);
        rnVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(boolean r7) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl.E(boolean):void");
    }

    @Override // defpackage.nj
    public final int a() {
        return this.d.a();
    }

    @Override // defpackage.nj
    public final Context b() {
        if (this.u == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.u = new ContextThemeWrapper(this.a, i);
            } else {
                this.u = this.a;
            }
        }
        return this.u;
    }

    @Override // defpackage.nj
    public final re c(rd rdVar) {
        pk pkVar = this.g;
        if (pkVar != null) {
            pkVar.f();
        }
        this.b.l(false);
        this.e.i();
        pk pkVar2 = new pk(this, this.e.getContext(), rdVar);
        pkVar2.a.s();
        try {
            if (!pkVar2.b.c(pkVar2, pkVar2.a)) {
                return null;
            }
            this.g = pkVar2;
            pkVar2.g();
            this.e.h(pkVar2);
            D(true);
            this.e.sendAccessibilityEvent(32);
            return pkVar2;
        } finally {
            pkVar2.a.r();
        }
    }

    @Override // defpackage.nj
    public final View d() {
        return this.d.d();
    }

    @Override // defpackage.nj
    public final void e(boolean z) {
        if (z == this.w) {
            return;
        }
        this.w = z;
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            ((ni) this.x.get(i)).a();
        }
    }

    @Override // defpackage.nj
    public final void f() {
        if (!this.l) {
            this.l = true;
            E(false);
        }
    }

    @Override // defpackage.nj
    public final void h(View view, nh nhVar) {
        view.setLayoutParams(nhVar);
        this.d.j(view);
    }

    @Override // defpackage.nj
    public final void i(boolean z) {
        if (!this.v) {
            j(z);
        }
    }

    @Override // defpackage.nj
    public final void j(boolean z) {
        k(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.nj
    public final void k(int i, int i2) {
        int a = this.d.a();
        if ((i2 & 4) != 0) {
            this.v = true;
        }
        this.d.k((i & i2) | ((i2 ^ (-1)) & a));
    }

    @Override // defpackage.nj
    public final void l(boolean z) {
        k(true != z ? 0 : 2, 2);
    }

    @Override // defpackage.nj
    public final void m(Drawable drawable) {
        this.d.p(drawable);
    }

    @Override // defpackage.nj
    public final void n(boolean z) {
        rn rnVar;
        this.A = z;
        if (z || (rnVar = this.n) == null) {
            return;
        }
        rnVar.a();
    }

    @Override // defpackage.nj
    public final void o(int i) {
        p(this.a.getString(i));
    }

    @Override // defpackage.nj
    public final void p(CharSequence charSequence) {
        this.d.q(charSequence);
    }

    @Override // defpackage.nj
    public final void q(CharSequence charSequence) {
        this.d.t(charSequence);
    }

    @Override // defpackage.nj
    public final void r() {
        if (this.l) {
            this.l = false;
            E(false);
        }
    }

    @Override // defpackage.nj
    public final boolean t() {
        vh vhVar = this.d;
        if (vhVar == null || !vhVar.v()) {
            return false;
        }
        this.d.f();
        return true;
    }

    @Override // defpackage.nj
    public final boolean v(int i, KeyEvent keyEvent) {
        pk pkVar = this.g;
        if (pkVar == null) {
            return false;
        }
        sf sfVar = pkVar.a;
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        sfVar.setQwertyMode(z);
        return sfVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.nj
    public final void y() {
        H(ld.e(this.a));
    }

    @Override // defpackage.nj
    public final void z() {
        k(0, 8);
    }

    private final void H(boolean z) {
        if (z) {
            this.d.B();
        } else {
            this.d.B();
        }
        this.d.A();
        this.d.D();
        this.b.e = false;
    }

    public pl(Dialog dialog) {
        new ArrayList();
        this.x = new ArrayList();
        this.j = 0;
        this.k = true;
        this.z = true;
        this.p = new ph(this);
        this.q = new pi(this);
        this.r = new pj(this);
        G(dialog.getWindow().getDecorView());
    }
}
