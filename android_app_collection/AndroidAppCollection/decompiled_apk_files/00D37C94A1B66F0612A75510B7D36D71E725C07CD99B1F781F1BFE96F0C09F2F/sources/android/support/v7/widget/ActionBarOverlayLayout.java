package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.google.android.youtube.R;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements vg, kh, kf, kg {
    static final int[] a = {R.attr.actionBarSize, 16842841};
    private final Runnable A;
    private final ki B;
    public int b;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public ti h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int k;
    private ContentFrameLayout l;
    private vh m;
    private Drawable n;
    private boolean o;
    private boolean p;
    private int q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private mb u;
    private mb v;
    private mb w;
    private mb x;
    private OverScroller y;
    private final Runnable z;

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private final void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        boolean z = false;
        this.k = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.n = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.o = z;
        this.y = new OverScroller(context);
    }

    private static final boolean w(View view, Rect rect, boolean z) {
        boolean z2;
        tj tjVar = (tj) view.getLayoutParams();
        if (tjVar.leftMargin != rect.left) {
            tjVar.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (tjVar.topMargin != rect.top) {
            tjVar.topMargin = rect.top;
            z2 = true;
        }
        if (tjVar.rightMargin != rect.right) {
            tjVar.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || tjVar.bottomMargin == rect.bottom) {
            return z2;
        }
        tjVar.bottomMargin = rect.bottom;
        return true;
    }

    @Override // defpackage.kf
    public final void c(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof tj;
    }

    @Override // defpackage.kf
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.n == null || this.o) {
            return;
        }
        int bottom = this.c.getVisibility() == 0 ? (int) (this.c.getBottom() + this.c.getTranslationY() + 0.5f) : 0;
        this.n.setBounds(0, bottom, getWidth(), this.n.getIntrinsicHeight() + bottom);
        this.n.draw(canvas);
    }

    @Override // defpackage.kf
    public final boolean e(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.kg
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        kp(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.vg
    public final void g() {
        j();
        this.m.g();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new tj();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new tj(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.B.a();
    }

    public final void h() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.vg
    public final void i(int i) {
        j();
        if (i == 2) {
            this.m.i();
        } else if (i == 5) {
            this.m.h();
        } else if (i != 109) {
        } else {
            boolean z = true;
            this.d = true;
            if (getContext().getApplicationInfo().targetSdkVersion >= 19) {
                z = false;
            }
            this.o = z;
        }
    }

    final void j() {
        vh f;
        if (this.l == null) {
            this.l = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof vh) {
                f = (vh) findViewById;
            } else if (findViewById instanceof Toolbar) {
                f = ((Toolbar) findViewById).f();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of " + findViewById.getClass().getSimpleName());
            }
            this.m = f;
        }
    }

    public final void k(int i) {
        h();
        this.c.setTranslationY(-Math.max(0, Math.min(i, this.c.getHeight())));
    }

    @Override // defpackage.kf
    public final void ko(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // defpackage.kf
    public final void kp(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public final void l(boolean z) {
        if (z != this.p) {
            this.p = z;
            if (z) {
                return;
            }
            h();
            k(0);
        }
    }

    @Override // defpackage.vg
    public final void m(Menu menu, ss ssVar) {
        j();
        this.m.m(menu, ssVar);
    }

    @Override // defpackage.vg
    public final void n() {
        j();
        this.m.n();
    }

    @Override // defpackage.vg
    public final void o(Window.Callback callback) {
        j();
        this.m.s(callback);
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
            r5.j()
            mb r6 = defpackage.mb.r(r6, r5)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r6.d()
            int r2 = r6.f()
            int r3 = r6.e()
            int r4 = r6.c()
            r0.<init>(r1, r2, r3, r4)
            android.support.v7.widget.ActionBarContainer r1 = r5.c
            r2 = 0
            boolean r0 = w(r1, r0, r2)
            android.graphics.Rect r1 = r5.r
            defpackage.lj.as(r5, r6, r1)
            android.graphics.Rect r1 = r5.r
            int r1 = r1.left
            android.graphics.Rect r2 = r5.r
            int r2 = r2.top
            android.graphics.Rect r3 = r5.r
            int r3 = r3.right
            android.graphics.Rect r4 = r5.r
            int r4 = r4.bottom
            mb r1 = r6.o(r1, r2, r3, r4)
            r5.u = r1
            mb r2 = r5.v
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L4b
            mb r0 = r5.u
            r5.v = r0
            r0 = 1
        L4b:
            android.graphics.Rect r1 = r5.s
            android.graphics.Rect r2 = r5.r
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L5d
            android.graphics.Rect r0 = r5.s
            android.graphics.Rect r1 = r5.r
            r0.set(r1)
            goto L5f
        L5d:
            if (r0 == 0) goto L62
        L5f:
            r5.requestLayout()
        L62:
            mb r6 = r6.l()
            mb r6 = r6.n()
            mb r6 = r6.m()
            android.view.WindowInsets r6 = r6.s()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        lj.K(this);
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
                tj tjVar = (tj) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = tjVar.leftMargin + paddingLeft;
                int i7 = tjVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.c, i, 0, i2, 0);
        tj tjVar = (tj) this.c.getLayoutParams();
        int max = Math.max(0, this.c.getMeasuredWidth() + tjVar.leftMargin + tjVar.rightMargin);
        int max2 = Math.max(0, this.c.getMeasuredHeight() + tjVar.topMargin + tjVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.c.getMeasuredState());
        int j = lj.j(this) & 256;
        if (j != 0) {
            measuredHeight = this.k;
        } else {
            measuredHeight = this.c.getVisibility() != 8 ? this.c.getMeasuredHeight() : 0;
        }
        this.t.set(this.r);
        mb mbVar = this.u;
        this.w = mbVar;
        if (this.d || j != 0) {
            gz d = gz.d(mbVar.d(), this.w.f() + measuredHeight, this.w.e(), this.w.c());
            lr lrVar = new lr(this.w);
            lrVar.c(d);
            this.w = lrVar.a();
        } else {
            this.t.top += measuredHeight;
            Rect rect = this.t;
            rect.bottom = rect.bottom;
            this.w = this.w.o(0, measuredHeight, 0, 0);
        }
        w(this.l, this.t, true);
        if (!this.x.equals(this.w)) {
            mb mbVar2 = this.w;
            this.x = mbVar2;
            lj.r(this.l, mbVar2);
        }
        measureChildWithMargins(this.l, i, 0, i2, 0);
        tj tjVar2 = (tj) this.l.getLayoutParams();
        int max3 = Math.max(max, this.l.getMeasuredWidth() + tjVar2.leftMargin + tjVar2.rightMargin);
        int max4 = Math.max(max2, this.l.getMeasuredHeight() + tjVar2.topMargin + tjVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.l.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.p || !z) {
            return false;
        }
        this.y.fling(0, 0, 0, (int) f2, 0, 0, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, Integer.MAX_VALUE);
        if (this.y.getFinalY() > this.c.getHeight()) {
            h();
            this.A.run();
        } else {
            h();
            this.z.run();
        }
        this.f = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.q + i2;
        this.q = i5;
        k(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        pl plVar;
        rn rnVar;
        this.B.d(i);
        ActionBarContainer actionBarContainer = this.c;
        this.q = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        h();
        ti tiVar = this.h;
        if (tiVar == null || (rnVar = (plVar = (pl) tiVar).n) == null) {
            return;
        }
        rnVar.a();
        plVar.n = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.c.getVisibility() != 0) {
            return false;
        }
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.p || this.f) {
            return;
        }
        if (this.q > this.c.getHeight()) {
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
        j();
        int i2 = this.g ^ i;
        this.g = i;
        int i3 = i & 4;
        int i4 = i & 256;
        ti tiVar = this.h;
        if (tiVar != null) {
            pl plVar = (pl) tiVar;
            plVar.k = i4 == 0;
            if (i3 == 0 || i4 == 0) {
                if (plVar.m) {
                    plVar.m = false;
                    plVar.E(true);
                }
            } else if (!plVar.m) {
                plVar.m = true;
                plVar.E(true);
            }
        }
        if ((i2 & 256) == 0 || this.h == null) {
            return;
        }
        lj.K(this);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        ti tiVar = this.h;
        if (tiVar != null) {
            ((pl) tiVar).j = i;
        }
    }

    @Override // defpackage.vg
    public final void p(CharSequence charSequence) {
        j();
        this.m.t(charSequence);
    }

    @Override // defpackage.vg
    public final boolean q() {
        j();
        return this.m.u();
    }

    @Override // defpackage.vg
    public final boolean r() {
        j();
        return this.m.w();
    }

    @Override // defpackage.vg
    public final boolean s() {
        j();
        return this.m.x();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.vg
    public final boolean t() {
        j();
        return this.m.y();
    }

    @Override // defpackage.vg
    public final boolean u() {
        j();
        return this.m.z();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.u = mb.a;
        this.v = mb.a;
        this.w = mb.a;
        this.x = mb.a;
        this.j = new tg(this);
        this.z = new th(this, 1);
        this.A = new th(this);
        v(context);
        this.B = new ki();
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new tj(layoutParams);
    }
}
