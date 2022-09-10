package com.google.android.apps.gmm.base.views.expandingscrollview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import com.google.android.apps.maps.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ExpandingScrollView extends jet implements jkj, jkf, jke, no {
    private final float C;
    private final int D;
    private final np E;
    private float F;
    @dzsi
    private Callable<Integer> G;
    @dzsi
    private Callable<Integer> H;
    @dzsi
    private Callable<Integer> I;
    private int J;
    private final float[] K;
    private final int[] L;
    private boolean M;
    private float N;
    private float O;
    private final Rect P;
    private boolean Q;
    private boolean R;
    public final int a;
    public int b;
    public jkc c;
    public jkc d;
    public jkc e;
    public jjn f;
    @dzsi
    public jjn g;
    @dzsi
    public jjn h;
    @dzsi
    public jjn i;
    public boolean j;
    public final Set<jkh> k;
    public final Set<jkd> l;
    @dzsi
    public View m;
    @dzsi
    public View n;
    public int o;
    public boolean p;
    @dzsi
    public Drawable q;
    public int r;
    public int s;

    public ExpandingScrollView(Context context) {
        super(context);
        this.E = new np();
        this.c = jkc.c;
        this.d = jkc.c;
        this.e = jkc.l;
        this.f = jjn.HIDDEN;
        this.J = -1;
        this.K = new float[jjn.values().length];
        this.L = new int[jjn.values().length];
        this.k = dcnm.m();
        this.l = dcnm.m();
        this.P = new Rect();
        this.o = 0;
        this.s = 1;
        this.p = true;
        Resources resources = getResources();
        ab(resources.getConfiguration(), false);
        float f = resources.getDisplayMetrics().density;
        this.C = f;
        this.a = (int) (f * 400.0f);
        this.D = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        n();
        setClipChildren(false);
        setImportantForAccessibility(1);
    }

    private final void Y(int i) {
        this.q = getResources().getDrawable(i);
    }

    private final void Z() {
        boolean a = gct.a(getContext().getResources().getConfiguration());
        if (this.Q) {
            this.q = null;
        } else if (!this.R) {
            Y(true != a ? R.drawable.expanding_scroll_view_shadow : R.drawable.expanding_scroll_view_shadow_nightmode);
        } else {
            Y(true != a ? R.drawable.expanding_scroll_view_shadow_rounded_corners : R.drawable.expanding_scroll_view_shadow_rounded_corners_nightmode);
        }
    }

    private final void aa(@dzsi View view) {
        View view2 = this.n;
        if (view2 != null) {
            view2.animate().setUpdateListener(null);
            this.o = 0;
        }
        this.n = view;
        if (view != null) {
            dbsk.s(view);
            this.n.animate().setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: jeq
                private final ExpandingScrollView a;

                {
                    this.a = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ExpandingScrollView expandingScrollView = this.a;
                    int k = expandingScrollView.k();
                    if (k != expandingScrollView.o) {
                        expandingScrollView.o = k;
                        expandingScrollView.P();
                    }
                }
            });
        }
    }

    private final void ab(Configuration configuration, boolean z) {
        this.c = configuration.orientation == 2 ? this.e : this.d;
        setExpandingState(this.f, z);
    }

    private final int ac() {
        Callable<Integer> callable = this.H;
        if (callable != null) {
            try {
                return callable.call().intValue();
            } catch (Throwable unused) {
                return 0;
            }
        }
        return 0;
    }

    private final int ad() {
        Callable<Integer> callable = this.I;
        if (callable != null) {
            try {
                return callable.call().intValue();
            } catch (Throwable unused) {
                return 0;
            }
        }
        return 0;
    }

    private static boolean ae(View view, View view2) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != view2) {
            parent = parent.getParent();
        }
        return parent == view2;
    }

    private final jjn af(int i) {
        jjn jjnVar = null;
        int i2 = Integer.MAX_VALUE;
        for (jjn jjnVar2 : this.c.d(this.f)) {
            int abs = Math.abs(C(jjnVar2) - i);
            int i3 = abs < i2 ? abs : i2;
            if (abs < i2) {
                jjnVar = jjnVar2;
            }
            i2 = i3;
        }
        return jjnVar;
    }

    private final void ag(jjn jjnVar) {
        jjn jjnVar2 = this.f;
        this.f = jjnVar;
        N();
        p();
        if (this.f != jjnVar2) {
            jkg jkgVar = this.j ? jkg.SWIPE : jkg.AUTOMATED;
            for (jkh jkhVar : this.k) {
                jkhVar.L(this, jjnVar2, this.f, jkgVar);
            }
        }
    }

    private final void ah(jjn jjnVar) {
        ai(jjnVar, Math.round((M() * this.K[jjnVar.ordinal()]) / 100.0f));
    }

    private final void ai(jjn jjnVar, int i) {
        int ordinal = jjnVar.ordinal();
        int[] iArr = this.L;
        if (iArr[ordinal] == i) {
            return;
        }
        iArr[ordinal] = i;
        for (int i2 = ordinal - 1; i2 >= 0; i2--) {
            int[] iArr2 = this.L;
            if (iArr2[i2] > i) {
                iArr2[i2] = i;
            }
        }
        int i3 = ordinal + 1;
        while (true) {
            int[] iArr3 = this.L;
            if (i3 >= iArr3.length) {
                break;
            }
            if (iArr3[i3] < i) {
                iArr3[i3] = i;
            }
            i3++;
        }
        p();
        if (this.x) {
            int scrollY = getScrollY();
            while (scrollY < C(E(this.f))) {
                jjn jjnVar2 = this.f;
                if (jjnVar2 == E(jjnVar2)) {
                    break;
                }
                ag(E(this.f));
            }
            while (scrollY > C(D(this.f))) {
                jjn jjnVar3 = this.f;
                if (jjnVar3 == D(jjnVar3)) {
                    return;
                }
                ag(D(this.f));
            }
        } else if (this.f == jjnVar) {
            W(C(jjnVar), true, X());
        }
    }

    private final void aj(int i, Iterable<jkh> iterable) {
        jjn[] values = jjn.values();
        if (i > C(values[values.length - 1])) {
            return;
        }
        int i2 = 0;
        jjn jjnVar = values[0];
        if (M() > 0) {
            jjn[] values2 = jjn.values();
            int length = values2.length;
            while (i2 < length) {
                jjn jjnVar2 = values2[i2];
                if (i < C(jjnVar2)) {
                    break;
                }
                i2++;
                jjnVar = jjnVar2;
            }
        }
        float f = 0.0f;
        if (C(jjnVar) == M()) {
            for (jkh jkhVar : iterable) {
                jkhVar.P(this, jjnVar, 0.0f);
            }
            return;
        }
        int C = C(jjnVar);
        int C2 = C(jjnVar == jjn.HIDDEN ? jjn.COLLAPSED : D(jjnVar));
        if (C2 != C) {
            f = Math.max(0.0f, (i - C) / (C2 - C));
        }
        for (jkh jkhVar2 : iterable) {
            jkhVar2.P(this, jjnVar, f);
        }
    }

    @Override // defpackage.jkj
    public final boolean A(jjn jjnVar) {
        return jjnVar == this.c.a(jjnVar, this.f);
    }

    @Override // defpackage.jkf
    public final void B(jjn jjnVar) {
        setExpandingState(jjnVar, true);
    }

    public int C(jjn jjnVar) {
        return this.L[jjnVar.ordinal()];
    }

    @Override // defpackage.jkj
    public final jjn D(jjn jjnVar) {
        return this.c.c(jjnVar);
    }

    @Override // defpackage.jkj
    public final jjn E(jjn jjnVar) {
        return this.c.b(jjnVar);
    }

    @Override // defpackage.jke
    public final void F(jkh jkhVar) {
        jjn jjnVar = this.i;
        if (jjnVar != null) {
            jkhVar.M(this, jjnVar);
        }
        this.k.add(jkhVar);
        aj(getScrollY(), dcdc.f(jkhVar));
    }

    @Override // defpackage.jke
    public final boolean G(jkh jkhVar) {
        if (!this.k.remove(jkhVar)) {
            return false;
        }
        if (this.i == null) {
            return true;
        }
        jkhVar.N(this, this.f);
        return true;
    }

    @Override // defpackage.jke
    public final void H(jkd jkdVar) {
        this.l.add(jkdVar);
    }

    @Override // defpackage.jke
    public final boolean I(jkd jkdVar) {
        return this.l.remove(jkdVar);
    }

    @Override // defpackage.jet
    protected final void J() {
        cwsy.b().a.m("ExpandingScrollDragEvent");
        this.y = true;
        this.j = true;
        this.i = this.f;
        for (jkh jkhVar : this.k) {
            jkhVar.M(this, this.f);
        }
    }

    @Override // defpackage.jet
    protected final void K() {
        this.y = false;
        this.i = null;
        this.j = false;
        for (jkh jkhVar : this.k) {
            jkhVar.N(this, this.f);
        }
        cwsy.b().a.n("ExpandingScrollDragEvent", false, null);
    }

    @Override // defpackage.jkj
    public final jjn L() {
        return this.f;
    }

    public int M() {
        return this.b;
    }

    public final int N() {
        int i = this.J;
        this.J = -1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jet
    public final void O(int i) {
        if (!this.k.isEmpty()) {
            aj(i, this.k);
        }
    }

    public final void P() {
        for (jkh jkhVar : this.k) {
            jkhVar.O();
        }
    }

    @Override // defpackage.nn
    public final boolean a(View view, View view2, int i, int i2) {
        return onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.nn
    public final void b(View view, View view2, int i, int i2) {
        onNestedScrollAccepted(view, view2, i);
    }

    @Override // defpackage.nn
    public final void c(View view, int i) {
        onStopNestedScroll(view);
    }

    @Override // defpackage.nn
    public final void d(View view, int i, int i2, int i3, int i4, int i5) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable drawable = this.q;
        if (drawable != null && C(this.f) > 0) {
            drawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent = super.dispatchGenericMotionEvent(motionEvent);
        if (dispatchGenericMotionEvent || this.m == null) {
            return dispatchGenericMotionEvent;
        }
        int scrollY = this.r - getScrollY();
        motionEvent.offsetLocation(0.0f, -scrollY);
        boolean dispatchGenericMotionEvent2 = this.m.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(0.0f, scrollY);
        return dispatchGenericMotionEvent2;
    }

    @Override // defpackage.nn
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        onNestedPreScroll(view, i, i2, iArr);
    }

    @Override // defpackage.no
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // defpackage.jke
    public final void g() {
        if (this.q != null) {
            Z();
        }
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.E.a();
    }

    @Override // defpackage.jke
    public final View h() {
        return this;
    }

    @Override // defpackage.jke
    public final View i() {
        return this;
    }

    @Override // defpackage.jkj
    public final View j() {
        return this.m;
    }

    @Override // defpackage.jke
    public final int k() {
        View view = this.n;
        if (view != null && view.getVisibility() == 0) {
            float y = this.n.getY();
            for (ViewParent parent = this.n.getParent(); parent != null && parent != this.m; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getVisibility() != 0) {
                    return 0;
                }
                y += viewGroup.getY();
            }
            if (y < 0.0f) {
                return (int) (-y);
            }
        }
        return 0;
    }

    @Override // defpackage.jkf
    public final jkj l() {
        return this;
    }

    @Override // defpackage.jke
    public final jkf m() {
        return this;
    }

    public final void n() {
        jjn[] values;
        for (jjn jjnVar : jjn.values()) {
            setExposurePercentage(jjnVar, jjnVar.g);
        }
    }

    protected int o(int i) {
        return View.MeasureSpec.getSize(i);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jjn jjnVar = this.f;
        ab(configuration, false);
        jjn jjnVar2 = this.f;
        if (jjnVar2 != jjnVar) {
            this.g = jjnVar;
            this.h = jjnVar2;
        } else if (this.g != null && this.c.d(jjnVar).contains(this.g)) {
            if (this.f == this.h) {
                setExpandingState(this.g, false);
            }
            this.g = null;
            this.h = null;
        }
        for (jkh jkhVar : this.k) {
            jkhVar.L(this, jjnVar, this.f, jkg.AUTOMATED);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ScrollView.class.getCanonicalName());
        accessibilityEvent.setScrollable(true);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ScrollView.class.getCanonicalName());
        accessibilityNodeInfo.setScrollable(true);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    @Override // defpackage.jet, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        r(motionEvent);
        if (this.s == 5) {
            return super.Q(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int o = o(i2);
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            getChildAt(i4).measure(i, View.MeasureSpec.makeMeasureSpec(o, 1073741824));
            i3 = Math.max(i3, getChildAt(i4).getMeasuredWidth());
        }
        setMeasuredDimension(i3, size + size);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        if ((f2 >= 0.0f || od.az(view)) && (f2 <= 0.0f || getScrollY() >= M())) {
            return false;
        }
        this.F = f2;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            i2 = Math.min(i2, C(jjn.FULLY_EXPANDED) - getScrollY());
        } else if (od.az(view)) {
            i2 = 0;
        }
        iArr[1] = i2;
        scrollBy(0, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.E.d(i);
        S();
        this.F = 0.0f;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f = savedState.a;
        for (int i = 0; i < jjn.values().length; i++) {
            this.K[i] = savedState.b[i];
            this.L[i] = savedState.c[i];
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f, this.K, this.L);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != 0) {
            this.s = 4;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.E.e();
        T(this.F);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00db, code lost:
        if (r0 != 3) goto L56;
     */
    @Override // defpackage.jet, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    protected void p() {
        if (this.f != jjn.HIDDEN || ac() != 0) {
            q();
            return;
        }
        int C = C(jjn.HIDDEN);
        setScrollLimits(C, C);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, @dzsi Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i == 8192 && this.f.ordinal() > jjn.EXPANDED.ordinal()) {
                jjn E = E(this.f);
                if (E.b()) {
                    setExpandingState(E, false);
                    return true;
                }
            }
        } else if (this.f.ordinal() > jjn.COLLAPSED.ordinal() && this.f.ordinal() < jjn.FULLY_EXPANDED.ordinal()) {
            setExpandingState(D(this.f), false);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q() {
        setScrollLimits(C((jjn) Collections.min(this.c.d(this.f))), C((jjn) Collections.max(this.c.d(this.f))));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.s = 2;
            this.N = motionEvent.getX();
            this.O = motionEvent.getY();
            super.R(motionEvent);
        } else if (this.s != 2 || Math.abs(motionEvent.getX() - this.N) <= this.D) {
            if (this.s == 2 && Math.abs(motionEvent.getY() - this.O) > this.u) {
                this.s = 3;
            } else if (this.s != 3) {
            } else {
                this.s = 5;
            }
        } else {
            this.s = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean s(jjn jjnVar) {
        return this.p && jjnVar == jjn.EXPANDED;
    }

    public void setAboveView(@dzsi View view) {
        aa(view);
    }

    public void setContent(@dzsi View view) {
        setContent(view, null);
    }

    public void setExpandedHeightCallable(@dzsi Callable<Integer> callable) {
        this.I = callable;
    }

    @Override // defpackage.jkf
    public void setExpandingState(jjn jjnVar, boolean z) {
        int X = z ? X() : 0;
        jjn a = this.c.a(jjnVar, this.f);
        ag(a);
        int C = C(a);
        if (X > 0) {
            W(C, false, X);
        } else {
            scrollTo(0, C);
        }
    }

    public void setExpandingStateTransition(jkc jkcVar) {
        setExpandingStateTransition(jkcVar, true);
    }

    public void setExposurePercentage(jjn jjnVar, float f) {
        dbsk.b(f >= 0.0f, "percentage may not be negative");
        this.K[jjnVar.ordinal()] = f;
        ah(jjnVar);
    }

    public void setExposurePixels(jjn jjnVar, int i) {
        this.K[jjnVar.ordinal()] = -1.0f;
        ai(jjnVar, i);
    }

    @Override // defpackage.jkf
    public void setHidden(boolean z) {
        if (z) {
            B(jjn.HIDDEN);
        } else if (this.f != jjn.HIDDEN) {
        } else {
            B(jjn.COLLAPSED);
        }
    }

    public void setHiddenHeightCallable(@dzsi Callable<Integer> callable) {
        this.H = callable;
    }

    @Override // defpackage.jke
    public void setInitialScroll(int i) {
        V(0, i);
        this.J = i;
    }

    public void setShouldHideShadowAbove(boolean z) {
        if (this.q == null || this.Q != z) {
            this.Q = z;
            Z();
        }
    }

    public void setShouldStealEventsAboveSliderTop(boolean z) {
        this.p = z;
    }

    public void setShouldUseRoundedCornersShadow(boolean z) {
        if (this.q == null || this.R != z) {
            this.R = z;
            if (this.Q) {
                return;
            }
            Z();
        }
    }

    public void setTwoThirdsHeight(int i) {
        if (ad() == 0) {
            setExposurePixels(jjn.EXPANDED, i);
        }
    }

    public void setViewHeaderHeightCallableForSizingCollapsedState(@dzsi Callable<Integer> callable) {
        this.G = callable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t() {
        boolean z;
        Iterator<jkd> it = this.l.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().a()) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            B(jjn.COLLAPSED);
        }
        for (jkd jkdVar : this.l) {
            jkdVar.b(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean u(MotionEvent motionEvent) {
        View view = this.n;
        if (view != null && ae(view, this)) {
            float x = motionEvent.getX();
            int scrollX = getScrollX();
            float y = motionEvent.getY();
            int scrollY = getScrollY();
            this.P.set(0, 0, view.getWidth(), view.getHeight());
            this.P.offset((int) view.getTranslationX(), (int) view.getTranslationY());
            offsetDescendantRectToMyCoords(view, this.P);
            return this.P.contains(((int) x) + scrollX, ((int) y) + scrollY);
        }
        return false;
    }

    @Override // defpackage.jkf
    public final void v() {
        jjn jjnVar;
        jjn jjnVar2 = jjn.HIDDEN;
        int ordinal = this.f.ordinal();
        if (ordinal == 0) {
            jjnVar = jjn.HIDDEN;
        } else if (ordinal != 1) {
            jjnVar = (ordinal == 2 || ordinal == 3) ? jjn.COLLAPSED : this.f;
        } else {
            jjnVar = jjn.EXPANDED;
        }
        if (jjnVar != this.f) {
            B(jjnVar);
        }
    }

    @Override // defpackage.jkf
    public final boolean w() {
        jjn jjnVar = jjn.HIDDEN;
        int ordinal = this.f.ordinal();
        if (ordinal == 2 || ordinal == 3) {
            B(jjn.COLLAPSED);
            return true;
        }
        return false;
    }

    @Override // defpackage.jet
    protected void x(float f) {
        if (this.f == jjn.HIDDEN && ac() == 0) {
            return;
        }
        y(f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void y(float f) {
        jjn jjnVar;
        if (Math.abs(f) > this.a) {
            jjnVar = af((int) ((f * 0.3f) + getScrollY()));
        } else {
            jjnVar = this.f;
            jjn af = af(getScrollY());
            jjn D = getScrollY() > C(this.f) ? D(this.f) : E(this.f);
            jjn jjnVar2 = this.f;
            if (af != jjnVar2) {
                jjnVar = af;
            } else if (D != jjnVar2) {
                int C = C(jjnVar2);
                if ((getScrollY() - C) / (C(D) - C) > 0.2f) {
                    jjnVar = D;
                }
            }
        }
        B(jjnVar);
    }

    @Override // defpackage.jkj
    public final jjn z(jjn jjnVar) {
        return this.c.a(jjnVar, this.f);
    }

    public void setContent(@dzsi View view, @dzsi View view2) {
        removeAllViews();
        this.m = view;
        if (view != null) {
            addView(view);
            boolean z = true;
            if (view2 != null && !ae(view2, view)) {
                z = false;
            }
            dbsk.a(z);
        }
        aa(view2);
        this.M = false;
    }

    public void setExpandingStateTransition(jkc jkcVar, jkc jkcVar2) {
        setExpandingStateTransition(jkcVar, jkcVar2, true);
    }

    @Override // defpackage.jkf
    public void setExpandingStateTransition(jkc jkcVar, jkc jkcVar2, boolean z) {
        this.d = jkcVar;
        this.e = jkcVar2;
        ab(getContext().getResources().getConfiguration(), z);
        this.g = null;
        this.h = null;
        requestLayout();
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new jer();
        public final jjn a;
        public final float[] b;
        public final int[] c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = jjn.a(parcel.readString());
            this.b = parcel.createFloatArray();
            this.c = parcel.createIntArray();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a.toString());
            parcel.writeFloatArray(this.b);
            parcel.writeIntArray(this.c);
        }

        public SavedState(Parcelable parcelable, jjn jjnVar, float[] fArr, int[] iArr) {
            super(parcelable);
            this.a = jjnVar;
            this.b = fArr;
            this.c = iArr;
        }
    }

    public void setExpandingStateTransition(jkc jkcVar, boolean z) {
        setExpandingStateTransition(jkcVar, jkc.l, z);
    }

    public ExpandingScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E = new np();
        this.c = jkc.c;
        this.d = jkc.c;
        this.e = jkc.l;
        this.f = jjn.HIDDEN;
        this.J = -1;
        this.K = new float[jjn.values().length];
        this.L = new int[jjn.values().length];
        this.k = dcnm.m();
        this.l = dcnm.m();
        this.P = new Rect();
        this.o = 0;
        this.s = 1;
        this.p = true;
        Resources resources = getResources();
        ab(resources.getConfiguration(), false);
        float f = resources.getDisplayMetrics().density;
        this.C = f;
        this.a = (int) (f * 400.0f);
        this.D = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        n();
        setClipChildren(false);
        setImportantForAccessibility(1);
    }

    public ExpandingScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.E = new np();
        this.c = jkc.c;
        this.d = jkc.c;
        this.e = jkc.l;
        this.f = jjn.HIDDEN;
        this.J = -1;
        this.K = new float[jjn.values().length];
        this.L = new int[jjn.values().length];
        this.k = dcnm.m();
        this.l = dcnm.m();
        this.P = new Rect();
        this.o = 0;
        this.s = 1;
        this.p = true;
        Resources resources = getResources();
        ab(resources.getConfiguration(), false);
        float f = resources.getDisplayMetrics().density;
        this.C = f;
        this.a = (int) (f * 400.0f);
        this.D = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        n();
        setClipChildren(false);
        setImportantForAccessibility(1);
    }
}
