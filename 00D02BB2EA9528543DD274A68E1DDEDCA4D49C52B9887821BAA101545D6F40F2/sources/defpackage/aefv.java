package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.google.android.apps.gmm.home.views.HomeBottomSheetView$SavedState;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aefv  reason: default package */
/* loaded from: classes.dex */
public class aefv extends FrameLayout implements aegc {
    private static final aegq e = aegv.c();
    @dzsi
    Drawable a;
    @dzsi
    public Animator b;
    public int c;
    public final aegl d;
    private final int f;
    private final Set<acyt> g;
    private final aego h;
    private final np i;
    @dzsi
    private Drawable j;
    private boolean k;
    private boolean l;
    @dzsi
    private GestureDetector m;
    private aegq n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;

    public aefv(Context context) {
        this(context, null);
    }

    private final void A() {
        abs absVar;
        View p = p();
        if (p == null || !p.canScrollVertically(-1)) {
            return;
        }
        if (!(p instanceof RecyclerView) || (absVar = ((RecyclerView) p).l) == null) {
            z(Integer.MIN_VALUE);
        } else {
            absVar.O(0);
        }
    }

    private final void v() {
        boolean a = gct.a(getContext().getResources().getConfiguration());
        if (this.s) {
            this.a = getResources().getDrawable(true != a ? R.drawable.expanding_scroll_view_shadow_rounded_corners : R.drawable.expanding_scroll_view_shadow_rounded_corners_nightmode);
        } else {
            this.a = getResources().getDrawable(true != a ? R.drawable.expanding_scroll_view_shadow : R.drawable.expanding_scroll_view_shadow_nightmode);
        }
    }

    private final void x(boolean z) {
        for (acyt acytVar : this.g) {
            acytVar.a(z);
        }
    }

    private final int y(int i, boolean z) {
        int max;
        if (getChildAt(0) == null) {
            return i;
        }
        if (i > 0) {
            max = Math.min(w() - this.c, i);
        } else {
            max = Math.max(u() - this.c, i);
        }
        i(this.c + max, z, false);
        return i - max;
    }

    private final int z(int i) {
        View p = p();
        if (p == null) {
            return i;
        }
        int i2 = i > 0 ? 1 : -1;
        while (i != 0 && p.canScrollVertically(i2)) {
            p.scrollBy(0, i2);
            i -= i2;
        }
        return i;
    }

    @Override // defpackage.acyu
    public final void a() {
        v();
        this.j = null;
        invalidate();
    }

    @Override // defpackage.aegc
    public final boolean b() {
        return d() <= this.p;
    }

    @Override // defpackage.acyu
    public final int c() {
        return this.c;
    }

    @Override // defpackage.aegc
    public final int d() {
        Animator animator = this.b;
        return animator instanceof aefs ? ((aefs) animator).a : this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void dispatchDraw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aefv.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View childAt = getChildAt(0);
            this.o = childAt == null || motionEvent.getY() < ((float) childAt.getTop());
        }
        if (this.o) {
            return false;
        }
        Animator animator = this.b;
        if (animator != null) {
            animator.cancel();
        }
        GestureDetector gestureDetector = this.m;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // defpackage.aegc
    public final void e(int i) {
        f(i, false);
    }

    @Override // defpackage.aegc
    public final void f(int i, boolean z) {
        g(i, z, irf.a);
    }

    public final void g(int i, boolean z, TimeInterpolator timeInterpolator) {
        int b = akn.b(i, u(), w());
        if (getHeight() == 0) {
            i(b, z, false);
            return;
        }
        Animator animator = this.b;
        if (animator == null && this.c == b) {
            return;
        }
        if (animator instanceof aefs) {
            aefs aefsVar = (aefs) animator;
            int i2 = aefsVar.a;
            boolean z2 = aefsVar.b;
            if (i2 == b && z2 == z) {
                return;
            }
        }
        A();
        aefs aefsVar2 = new aefs(this, b, timeInterpolator);
        aefsVar2.b = z;
        aefsVar2.start();
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.i.a();
    }

    @Override // defpackage.aegc
    public final void h(int i) {
        i(i, false, false);
    }

    public final void i(int i, boolean z, boolean z2) {
        int b = akn.b(i, u(), w());
        if (b == this.c) {
            return;
        }
        this.c = b;
        if (b == 0) {
            setImportantForAccessibility(2);
        } else {
            setImportantForAccessibility(1);
        }
        if (getHeight() == 0) {
            this.d.c();
            return;
        }
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.offsetTopAndBottom((getHeight() - this.c) - childAt.getTop());
            invalidate();
        }
        x(z);
        if (z2) {
            return;
        }
        t(2);
        t(3);
    }

    @Override // defpackage.aegc
    public final void j() {
        e(u());
    }

    @Override // defpackage.aegc
    public final boolean k() {
        return this.c >= w();
    }

    @Override // defpackage.acyu
    public final void l(acyt acytVar) {
        this.g.add(acytVar);
    }

    @Override // defpackage.acyu
    public final void m(acyt acytVar) {
        this.g.remove(acytVar);
    }

    final Drawable n() {
        if (this.a == null) {
            v();
        }
        return this.a;
    }

    @Override // defpackage.acyu
    public final View o() {
        return this;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        String canonicalName = ScrollView.class.getCanonicalName();
        dbsk.s(canonicalName);
        accessibilityEvent.setClassName(canonicalName);
        accessibilityEvent.setScrollable(true);
        accessibilityEvent.setScrollY(this.c);
        accessibilityEvent.setMaxScrollY(w());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String canonicalName = ScrollView.class.getCanonicalName();
        dbsk.s(canonicalName);
        accessibilityNodeInfo.setClassName(canonicalName);
        accessibilityNodeInfo.setScrollable(true);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.h.a(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int b = akn.b(this.c, u(), w());
        if (this.c != b) {
            this.c = b;
            z = true;
        }
        this.q = w();
        int i5 = i4 - this.c;
        childAt.layout(0, i5, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i5);
        if (this.c < w()) {
            A();
        }
        if (!z) {
            return;
        }
        x(false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        q(f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            iArr[1] = i2 - y(i2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (i4 < 0) {
            y(i4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.i.d(i);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null) {
            return;
        }
        if (parcelable instanceof HomeBottomSheetView$SavedState) {
            HomeBottomSheetView$SavedState homeBottomSheetView$SavedState = (HomeBottomSheetView$SavedState) parcelable;
            super.onRestoreInstanceState(homeBottomSheetView$SavedState.getSuperState());
            this.p = homeBottomSheetView$SavedState.b;
            this.c = akn.b(homeBottomSheetView$SavedState.a, u(), w());
            return;
        }
        super.onRestoreInstanceState(null);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new HomeBottomSheetView$SavedState(super.onSaveInstanceState(), k() ? Integer.MAX_VALUE : this.c, this.p);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        dbsg<aegg> dbsgVar = this.d.b;
        View p = p();
        if (p == null || !p.canScrollVertically(-1)) {
            if (dbsgVar.a()) {
                this.c = dbsgVar.b().a(this);
                return;
            } else if (this.r == getResources().getConfiguration().orientation) {
                return;
            } else {
                this.r = getResources().getConfiguration().orientation;
                if (this.q == -1) {
                    return;
                }
                int u = u();
                int w = w();
                int i5 = this.q;
                this.c = akn.b(Math.round(u + ((u == i5 ? 0.0f : (this.c - u) / (i5 - u)) * (w - u))), u, w);
                return;
            }
        }
        this.c = w();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return view2 == p() && (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.i.e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.h.c(motionEvent);
        return true;
    }

    @dzsi
    public final View p() {
        return this.n.a(this);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, @dzsi Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i == 8192 && k()) {
                i(u(), true, false);
                return true;
            }
        } else if (!k()) {
            i(w(), true, false);
            return true;
        }
        return false;
    }

    public final void q(float f) {
        if (this.d.b(f)) {
            return;
        }
        aefm a = aefn.a(getContext(), f, new aefl(this) { // from class: aefp
            private final aefv a;

            {
                this.a = this;
            }

            @Override // defpackage.aefl
            public final void a(aefm aefmVar, float f2, float f3) {
                aefv aefvVar = this.a;
                if (aefvVar.d.b(f3)) {
                    aefmVar.cancel();
                } else if (aefvVar.s(-Math.round(f2)) == 0) {
                } else {
                    aefmVar.end();
                }
            }
        });
        r(a);
        a.start();
    }

    public final void r(Animator animator) {
        animator.addListener(new aefq(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int s(int i) {
        if (i == 0) {
            return 0;
        }
        if (i > 0) {
            return z(y(i, true));
        }
        return y(z(i), true);
    }

    @Override // defpackage.aegc
    public void setGestureDetector(@dzsi GestureDetector gestureDetector) {
        this.m = gestureDetector;
    }

    @Override // defpackage.aegc
    public void setHideShadowWhenCollapsed(boolean z) {
        this.k = z;
        invalidate();
    }

    @Override // defpackage.aegc
    public void setHideShadowWhenFullyExpanded(boolean z) {
        this.l = z;
        invalidate();
    }

    @Override // defpackage.aegc
    public void setMinExposurePixels(int i) {
        this.p = i;
        if (this.c < u()) {
            h(u());
        } else {
            x(false);
        }
    }

    public void setNestedScrollViewId(int i) {
        this.n = i != -1 ? aegv.b(i) : e;
    }

    public void setNestedScrollViewProvider(aegq aegqVar) {
        this.n = aegqVar;
    }

    @Override // defpackage.aegc
    public void setShouldUseRoundedCornersShadow(boolean z) {
        if (this.s == z) {
            return;
        }
        this.s = z;
        v();
        invalidate();
    }

    @Override // defpackage.aegc
    public void setShowGrippy(boolean z) {
        if (this.t == z) {
            return;
        }
        this.t = z;
        invalidate();
    }

    public void setSnapPoints(@dzsi List<aegg> list) {
        this.d.a(list);
    }

    public final void t(int i) {
        if (i != this.u) {
            this.u = i;
            for (acyt acytVar : this.g) {
                acytVar.b(this.u);
            }
        }
    }

    @Override // defpackage.acyu
    public final int u() {
        return Math.min(this.p, w());
    }

    @Override // defpackage.acyu
    public final int w() {
        int i = 0;
        View childAt = getChildAt(0);
        if (childAt != null) {
            i = childAt.getMeasuredHeight();
        }
        int height = getHeight();
        if (height <= 0 || i <= 0) {
            return Integer.MAX_VALUE;
        }
        return Math.min(height, i);
    }

    public aefv(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new aih();
        this.k = false;
        this.l = false;
        this.n = e;
        this.q = -1;
        this.s = false;
        this.t = false;
        this.u = 3;
        this.p = jmj.a(context, 48);
        this.f = jmj.a(context, 8);
        this.c = u();
        aefu aefuVar = new aefu(this);
        aegp.a(context, 1);
        aegp.a(aefuVar, 2);
        this.h = new aego(context, aefuVar);
        this.i = new np();
        this.d = new aegl(this, new aegj(this) { // from class: aefo
            private final aefv a;

            {
                this.a = this;
            }

            @Override // defpackage.aegj
            public final void a(int i, TimeInterpolator timeInterpolator) {
                this.a.g(i, true, timeInterpolator);
            }
        });
        setFocusableInTouchMode(true);
        this.r = getResources().getConfiguration().orientation;
    }
}
