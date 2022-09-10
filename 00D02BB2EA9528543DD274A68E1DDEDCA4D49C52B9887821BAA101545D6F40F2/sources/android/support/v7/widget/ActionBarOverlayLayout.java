package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements yq, nn, no {
    static final int[] f = {R.attr.actionBarSize, 16842841};
    private final Runnable A;
    private final np B;
    public ActionBarContainer a;
    public boolean b;
    public boolean c;
    public ViewPropertyAnimator d;
    public final AnimatorListenerAdapter e;
    private int g;
    private int h;
    private ContentFrameLayout i;
    private yr j;
    private Drawable k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private ow t;
    private ow u;
    private ow v;
    private ow w;
    private wk x;
    private OverScroller y;
    private final Runnable z;

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private final void p(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f);
        boolean z = false;
        this.g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.l = z;
        this.y = new OverScroller(context);
    }

    private static final boolean q(View view, Rect rect, boolean z) {
        boolean z2;
        wl wlVar = (wl) view.getLayoutParams();
        if (wlVar.leftMargin != rect.left) {
            wlVar.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (wlVar.topMargin != rect.top) {
            wlVar.topMargin = rect.top;
            z2 = true;
        }
        if (wlVar.rightMargin != rect.right) {
            wlVar.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || wlVar.bottomMargin == rect.bottom) {
            return z2;
        }
        wlVar.bottomMargin = rect.bottom;
        return true;
    }

    @Override // defpackage.nn
    public final boolean a(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.nn
    public final void b(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.nn
    public final void c(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof wl;
    }

    @Override // defpackage.nn
    public final void d(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.k == null || this.l) {
            return;
        }
        int bottom = this.a.getVisibility() == 0 ? (int) (this.a.getBottom() + this.a.getTranslationY() + 0.5f) : 0;
        this.k.setBounds(0, bottom, getWidth(), this.k.getIntrinsicHeight() + bottom);
        this.k.draw(canvas);
    }

    @Override // defpackage.nn
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // defpackage.no
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        d(view, i, i2, i3, i4, i5);
    }

    final void g() {
        yr m;
        if (this.i == null) {
            this.i = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.a = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof yr) {
                m = (yr) findViewById;
            } else if (findViewById instanceof Toolbar) {
                m = ((Toolbar) findViewById).m();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of " + findViewById.getClass().getSimpleName());
            }
            this.j = m;
        }
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new wl();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new wl(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new wl(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.B.a();
    }

    public final void h() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.yq
    public final void i(int i) {
        g();
        if (i == 2) {
            this.j.h();
        } else if (i == 5) {
            this.j.i();
        } else if (i != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // defpackage.yq
    public final boolean j() {
        g();
        return this.j.n();
    }

    @Override // defpackage.yq
    public final boolean k() {
        g();
        return this.j.o();
    }

    @Override // defpackage.yq
    public final boolean l() {
        g();
        return this.j.p();
    }

    @Override // defpackage.yq
    public final boolean m() {
        g();
        return this.j.q();
    }

    @Override // defpackage.yq
    public final boolean n() {
        g();
        return this.j.r();
    }

    @Override // defpackage.yq
    public final void o() {
        g();
        this.j.u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x005d, code lost:
        if (r0 != false) goto L7;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r6) {
        /*
            r5 = this;
            r5.g()
            ow r6 = defpackage.ow.b(r6, r5)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r6.c()
            int r2 = r6.d()
            int r3 = r6.e()
            int r4 = r6.f()
            r0.<init>(r1, r2, r3, r4)
            android.support.v7.widget.ActionBarContainer r1 = r5.a
            r2 = 0
            boolean r0 = q(r1, r0, r2)
            android.graphics.Rect r1 = r5.q
            defpackage.od.aA(r5, r6, r1)
            android.graphics.Rect r1 = r5.q
            int r1 = r1.left
            android.graphics.Rect r2 = r5.q
            int r2 = r2.top
            android.graphics.Rect r3 = r5.q
            int r3 = r3.right
            android.graphics.Rect r4 = r5.q
            int r4 = r4.bottom
            ow r1 = r6.o(r1, r2, r3, r4)
            r5.t = r1
            ow r2 = r5.u
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L4b
            ow r0 = r5.t
            r5.u = r0
            r0 = 1
        L4b:
            android.graphics.Rect r1 = r5.r
            android.graphics.Rect r2 = r5.q
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L5d
            android.graphics.Rect r0 = r5.r
            android.graphics.Rect r1 = r5.q
            r0.set(r1)
            goto L5f
        L5d:
            if (r0 == 0) goto L62
        L5f:
            r5.requestLayout()
        L62:
            ow r6 = r6.k()
            ow r6 = r6.h()
            ow r6 = r6.j()
            android.view.WindowInsets r6 = r6.p()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p(getContext());
        od.L(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                wl wlVar = (wl) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = wlVar.leftMargin + paddingLeft;
                int i7 = wlVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        op omVar;
        g();
        measureChildWithMargins(this.a, i, 0, i2, 0);
        wl wlVar = (wl) this.a.getLayoutParams();
        int max = Math.max(0, this.a.getMeasuredWidth() + wlVar.leftMargin + wlVar.rightMargin);
        int max2 = Math.max(0, this.a.getMeasuredHeight() + wlVar.topMargin + wlVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.a.getMeasuredState());
        int K = od.K(this) & 256;
        if (K != 0) {
            measuredHeight = this.g;
            if (this.m && this.a.a != null) {
                measuredHeight += measuredHeight;
            }
        } else {
            measuredHeight = this.a.getVisibility() != 8 ? this.a.getMeasuredHeight() : 0;
        }
        this.s.set(this.q);
        ow owVar = this.t;
        this.v = owVar;
        if (this.b || K != 0) {
            kd a = kd.a(owVar.c(), this.v.d() + measuredHeight, this.v.e(), this.v.f());
            ow owVar2 = this.v;
            if (Build.VERSION.SDK_INT >= 30) {
                omVar = new oo(owVar2);
            } else if (Build.VERSION.SDK_INT >= 29) {
                omVar = new on(owVar2);
            } else {
                omVar = new om(owVar2);
            }
            ol.b(a, omVar);
            this.v = ol.a(omVar);
        } else {
            this.s.top += measuredHeight;
            Rect rect = this.s;
            rect.bottom = rect.bottom;
            this.v = this.v.o(0, measuredHeight, 0, 0);
        }
        q(this.i, this.s, true);
        if (!this.w.equals(this.v)) {
            ow owVar3 = this.v;
            this.w = owVar3;
            od.Q(this.i, owVar3);
        }
        measureChildWithMargins(this.i, i, 0, i2, 0);
        wl wlVar2 = (wl) this.i.getLayoutParams();
        int max3 = Math.max(max, this.i.getMeasuredWidth() + wlVar2.leftMargin + wlVar2.rightMargin);
        int max4 = Math.max(max2, this.i.getMeasuredHeight() + wlVar2.topMargin + wlVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.i.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.n || !z) {
            return false;
        }
        this.y.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.y.getFinalY() > this.a.getHeight()) {
            h();
            this.A.run();
        } else {
            h();
            this.z.run();
        }
        this.c = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.o + i2;
        this.o = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.B.d(i);
        ActionBarContainer actionBarContainer = this.a;
        this.o = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        h();
        wk wkVar = this.x;
        if (wkVar != null) {
            wkVar.r();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.a.getVisibility() != 0) {
            return false;
        }
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.n || this.c) {
            return;
        }
        if (this.o > this.a.getHeight()) {
            h();
            postDelayed(this.A, 600L);
            return;
        }
        h();
        postDelayed(this.z, 600L);
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        g();
        int i2 = this.p ^ i;
        this.p = i;
        int i3 = i & 4;
        int i4 = i & 256;
        wk wkVar = this.x;
        if (wkVar != null) {
            wkVar.n(i4 == 0);
            if (i3 == 0 || i4 == 0) {
                this.x.o();
            } else {
                this.x.p();
            }
        }
        if ((i2 & 256) == 0 || this.x == null) {
            return;
        }
        od.L(this);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.h = i;
        wk wkVar = this.x;
        if (wkVar != null) {
            wkVar.l(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.a.setTranslationY(-Math.max(0, Math.min(i, this.a.getHeight())));
    }

    public void setActionBarVisibilityCallback(wk wkVar) {
        this.x = wkVar;
        if (getWindowToken() != null) {
            this.x.l(this.h);
            int i = this.p;
            if (i == 0) {
                return;
            }
            onWindowSystemUiVisibilityChanged(i);
            od.L(this);
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.n) {
            this.n = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        g();
        this.j.j(i);
    }

    public void setLogo(int i) {
        g();
        this.j.l(i);
    }

    @Override // defpackage.yq
    public void setMenu(Menu menu, vs vsVar) {
        g();
        this.j.t(menu, vsVar);
    }

    @Override // defpackage.yq
    public void setMenuPrepared() {
        g();
        this.j.s();
    }

    public void setOverlayMode(boolean z) {
        this.b = z;
        boolean z2 = false;
        if (z && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.l = z2;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // defpackage.yq
    public void setWindowCallback(Window.Callback callback) {
        g();
        this.j.e(callback);
    }

    @Override // defpackage.yq
    public void setWindowTitle(CharSequence charSequence) {
        g();
        this.j.f(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = 0;
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.t = ow.a;
        this.u = ow.a;
        this.v = ow.a;
        this.w = ow.a;
        this.e = new wh(this);
        this.z = new wi(this);
        this.A = new wj(this);
        p(context);
        this.B = new np();
    }

    public void setIcon(Drawable drawable) {
        g();
        this.j.k(drawable);
    }
}
