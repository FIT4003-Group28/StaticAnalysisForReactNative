package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.gmm.directions.views.PastDeparturesBottomSheetView$SavedState;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: zut  reason: default package */
/* loaded from: classes7.dex */
public final class zut extends FrameLayout implements aegc {
    public static final aegg a = new zuk();
    public static final dcqe b = dcqe.c("zut");
    private static final aegq h = aegv.c();
    private int A;
    private boolean B;
    private boolean C;
    private int D;
    private dcdc<aegg> E;
    private dcdc<aegg> F;
    @dzsi
    private zuq G;
    private int H;
    @dzsi
    Drawable c;
    @dzsi
    public Animator d;
    public int e;
    public final aegl f;
    public boolean g;
    private final int i;
    private final int j;
    private final Set<acyt> k;
    private final aego l;
    private final np m;
    @dzsi
    private cqhn n;
    @dzsi
    private cqkp o;
    @dzsi
    private View p;
    @dzsi
    private Drawable q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    @dzsi
    private GestureDetector v;
    private aegq w;
    private boolean x;
    private int y;
    private int z;

    public zut(Context context) {
        this(context, null);
    }

    private final void C() {
        boolean a2 = gct.a(getContext().getResources().getConfiguration());
        if (this.B) {
            this.c = getResources().getDrawable(true != a2 ? R.drawable.expanding_scroll_view_shadow_rounded_corners : R.drawable.expanding_scroll_view_shadow_rounded_corners_nightmode);
        } else {
            this.c = getResources().getDrawable(true != a2 ? R.drawable.expanding_scroll_view_shadow : R.drawable.expanding_scroll_view_shadow_nightmode);
        }
    }

    private final void D() {
        zuq zuqVar = this.G;
        if (zuqVar != null) {
            zuqVar.a();
        }
        I(Integer.MIN_VALUE);
        s(Integer.MAX_VALUE);
        zuq zuqVar2 = this.G;
        if (zuqVar2 != null) {
            zuqVar2.b();
        }
        O(true);
    }

    private static int E(int i, int i2, int i3, int i4) {
        return akn.b(Math.round(i + ((i == i2 ? 0.0f : (i4 - i) / (i2 - i)) * (i3 - i))), i, i3);
    }

    private final void F(boolean z) {
        for (acyt acytVar : this.k) {
            acytVar.a(z);
        }
    }

    private final Drawable G() {
        if (this.q == null) {
            this.q = cqrt.i(ibk.a, ibm.j()).a(getContext());
        }
        return this.q;
    }

    private final int H(int i, boolean z) {
        int max;
        if (getChildAt(0) == null) {
            return i;
        }
        if (i > 0) {
            max = Math.min(w() - this.e, i);
        } else {
            max = Math.max(u() - this.e, i);
        }
        i(this.e + max, z);
        return i - max;
    }

    private final int I(int i) {
        return J(i, zug.a);
    }

    private final int J(int i, zun zunVar) {
        aag aagVar;
        GmmRecyclerView M = M();
        if (M == null || (aagVar = (aag) M.l) == null) {
            return i;
        }
        int i2 = i > 0 ? 1 : -1;
        while (i != 0 && M.canScrollVertically(i2) && zunVar.a(M, N())) {
            View I = aagVar.I(aagVar.ad());
            if (I == null && (I = aagVar.I(aagVar.ac())) == null) {
                return i;
            }
            int top = I.getTop();
            M.scrollBy(0, i2);
            if (I.getTop() == top) {
                return i;
            }
            i -= i2;
        }
        return i;
    }

    private final int K() {
        View view = this.p;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    private final void L() {
        this.F = this.E.contains(a) ? dcdc.q(dcft.i(this.E, new dbsl(this) { // from class: zuj
            private final zut a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                zut zutVar = this.a;
                return ((aegg) obj).a(zutVar) >= zutVar.v();
            }
        })) : this.E;
    }

    @dzsi
    private final GmmRecyclerView M() {
        View q = q();
        if (!(q instanceof GmmRecyclerView)) {
            return null;
        }
        return (GmmRecyclerView) q;
    }

    private final int N() {
        GmmRecyclerView M = M();
        if (M == null) {
            return -1;
        }
        return y(M);
    }

    private final void O(boolean z) {
        if (!this.t) {
            this.u = z;
            return;
        }
        GmmRecyclerView M = M();
        if (M == null) {
            return;
        }
        M.setTag(R.id.has_been_programmatically_scrolled, Boolean.valueOf(z));
    }

    public static int y(GmmRecyclerView gmmRecyclerView) {
        Object tag = gmmRecyclerView.getTag(R.id.header_view_index);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int A(int i) {
        if (i == 0) {
            return 0;
        }
        if (i > 0) {
            if (this.e < v()) {
                int min = Math.min(i, v() - this.e);
                i = (i - min) + H(min, true);
            }
            if (!this.g) {
                i = s(i);
            }
            int H = H(i, true);
            return this.g ? H : r(H);
        }
        int I = I(i);
        if (this.e > v()) {
            int max = Math.max(I, v() - this.e);
            I = (I - max) + H(max, true);
        }
        if (!this.g) {
            return r(I);
        }
        return H(I, true);
    }

    public final void B(int i) {
        if (i != this.H) {
            this.H = i;
            for (acyt acytVar : this.k) {
                acytVar.b(this.H);
            }
        }
    }

    @Override // defpackage.acyu
    public final void a() {
        C();
        invalidate();
    }

    @Override // defpackage.aegc
    public final boolean b() {
        return d() <= this.y;
    }

    @Override // defpackage.acyu
    public final int c() {
        return this.e;
    }

    @Override // defpackage.aegc
    public final int d() {
        Animator animator = this.d;
        return animator instanceof zup ? ((zup) animator).a : this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void dispatchDraw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zut.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getAction() == 0) {
            View childAt = getChildAt(0);
            this.x = childAt == null || motionEvent.getY() < ((float) childAt.getTop());
        }
        if (!this.x) {
            if (motionEvent.getAction() == 0) {
                View q = q();
                View childAt2 = getChildAt(0);
                if (q == null || childAt2 == null) {
                    this.g = false;
                } else {
                    int[] iArr = new int[2];
                    q.getLocationOnScreen(iArr);
                    if (motionEvent.getRawY() <= iArr[1] || motionEvent.getY() <= childAt2.getTop() + this.j) {
                        z = true;
                    }
                    this.g = z;
                }
                if (z) {
                    this.f.a(this.E);
                } else {
                    this.f.a(this.F);
                }
            }
            Animator animator = this.d;
            if (animator != null) {
                animator.cancel();
            }
            GestureDetector gestureDetector = this.v;
            if (gestureDetector != null) {
                gestureDetector.onTouchEvent(motionEvent);
            }
            super.dispatchTouchEvent(motionEvent);
            return true;
        }
        return false;
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
        if (i < this.e) {
            D();
        }
        if (getHeight() == 0) {
            i(i, z);
            return;
        }
        Animator animator = this.d;
        if (animator == null && this.e == i) {
            return;
        }
        if (animator instanceof zup) {
            zup zupVar = (zup) animator;
            int i2 = zupVar.a;
            boolean z2 = zupVar.b;
            if (i2 == i && z2 == z) {
                return;
            }
        }
        zup zupVar2 = new zup(this, i, timeInterpolator);
        zupVar2.b = z;
        zupVar2.start();
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.m.a();
    }

    @Override // defpackage.aegc
    public final void h(int i) {
        i(i, false);
    }

    public final void i(int i, boolean z) {
        int b2 = akn.b(i, u(), w());
        if (b2 == this.e) {
            return;
        }
        this.e = b2;
        if (b2 == 0) {
            setImportantForAccessibility(2);
        } else {
            setImportantForAccessibility(1);
        }
        if (getHeight() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.offsetTopAndBottom((getHeight() - this.e) - childAt.getTop());
            invalidate();
        }
        F(z);
    }

    @Override // defpackage.aegc
    public final void j() {
        e(u());
    }

    @Override // defpackage.aegc
    public final boolean k() {
        return this.e >= w();
    }

    @Override // defpackage.acyu
    public final void l(acyt acytVar) {
        this.k.add(acytVar);
    }

    @Override // defpackage.acyu
    public final void m(acyt acytVar) {
        this.k.remove(acytVar);
    }

    public final void n() {
        O(false);
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
        accessibilityEvent.setScrollY(this.e);
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
        return this.l.a(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (((java.lang.Boolean) r5).booleanValue() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r2.u == false) goto L18;
     */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r4 = 0
            android.view.View r5 = r2.getChildAt(r4)
            if (r5 != 0) goto L8
            return
        L8:
            int r6 = r2.e
            int r0 = r2.u()
            int r1 = r2.w()
            int r6 = defpackage.akn.b(r6, r0, r1)
            int r0 = r2.e
            if (r0 == r6) goto L1e
            r2.e = r6
            r6 = 1
            goto L1f
        L1e:
            r6 = r3
        L1f:
            int r0 = r2.w()
            r2.z = r0
            int r0 = r2.e
            int r7 = r7 - r0
            int r0 = r5.getMeasuredHeight()
            int r1 = r5.getMeasuredWidth()
            int r0 = r0 + r7
            r5.layout(r4, r7, r1, r0)
            int r5 = r2.N()
            if (r5 < 0) goto L61
            boolean r5 = r2.t
            if (r5 == 0) goto L5a
            com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView r5 = r2.M()
            if (r5 != 0) goto L45
            goto L61
        L45:
            r7 = 2131427961(0x7f0b0279, float:1.8477553E38)
            java.lang.Object r5 = r5.getTag(r7)
            boolean r7 = r5 instanceof java.lang.Boolean
            if (r7 != 0) goto L51
            goto L5e
        L51:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L61
            goto L5e
        L5a:
            boolean r5 = r2.u
            if (r5 != 0) goto L61
        L5e:
            r2.D()
        L61:
            if (r3 == 0) goto L66
            r2.L()
        L66:
            if (r6 == 0) goto L6b
            r2.F(r4)
        L6b:
            cqhn r3 = r2.n
            if (r3 == 0) goto L80
            cqkp r3 = r2.o
            if (r3 == 0) goto L80
            java.lang.Iterable r3 = defpackage.cqkx.n(r3)
            r4 = 0
            java.lang.Object r3 = defpackage.dcft.r(r3, r4)
            android.view.View r3 = (android.view.View) r3
            r2.p = r3
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zut.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        t(f2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNestedPreScroll(android.view.View r4, int r5, int r6, int[] r7) {
        /*
            r3 = this;
            if (r6 <= 0) goto L53
            com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView r4 = r3.M()
            r5 = 0
            if (r4 != 0) goto Lb
        L9:
            r4 = 0
            goto L18
        Lb:
            abs r4 = r4.l
            boolean r0 = r4 instanceof defpackage.aag
            if (r0 != 0) goto L12
            goto L9
        L12:
            aag r4 = (defpackage.aag) r4
            int r4 = r4.ac()
        L18:
            int r0 = r3.N()
            r1 = 1
            if (r4 >= r0) goto L4c
            com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView r4 = r3.M()
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != 0) goto L29
            goto L3f
        L29:
            abs r4 = r4.l
            aag r4 = (defpackage.aag) r4
            if (r4 != 0) goto L30
            goto L3f
        L30:
            int r2 = r3.N()
            android.view.View r4 = r4.I(r2)
            if (r4 != 0) goto L3b
            goto L3f
        L3b:
            int r0 = r4.getTop()
        L3f:
            int r6 = r6 - r0
            int r4 = java.lang.Math.max(r6, r5)
            int r5 = r3.H(r4, r5)
            int r4 = r4 - r5
            r7[r1] = r4
            return
        L4c:
            int r4 = r3.H(r6, r5)
            int r6 = r6 - r4
            r7[r1] = r6
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zut.onNestedPreScroll(android.view.View, int, int, int[]):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.m.d(i);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null) {
            return;
        }
        if (parcelable instanceof PastDeparturesBottomSheetView$SavedState) {
            PastDeparturesBottomSheetView$SavedState pastDeparturesBottomSheetView$SavedState = (PastDeparturesBottomSheetView$SavedState) parcelable;
            super.onRestoreInstanceState(pastDeparturesBottomSheetView$SavedState.getSuperState());
            this.y = pastDeparturesBottomSheetView$SavedState.b;
            this.e = akn.b(pastDeparturesBottomSheetView$SavedState.a, u(), w());
            this.D = pastDeparturesBottomSheetView$SavedState.c;
            return;
        }
        bvoo.h("An unsupported saved state Parcelable was passed to PastDeparturesBottomSheetView: %s", parcelable);
        super.onRestoreInstanceState(null);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new PastDeparturesBottomSheetView$SavedState(super.onSaveInstanceState(), k() ? Integer.MAX_VALUE : this.e, this.y, x());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        dbsg<aegg> dbsgVar = this.f.b;
        if (dbsgVar.a()) {
            this.e = dbsgVar.b().a(this);
        } else if (this.A == getResources().getConfiguration().orientation) {
        } else {
            this.A = getResources().getConfiguration().orientation;
            if (this.z == -1) {
                return;
            }
            int u = u();
            int w = w();
            this.e = E(u, this.z, w, this.e);
            this.D = E(u, this.z, w, this.D);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return view2 == q() && (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.m.e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.l.c(motionEvent);
        return true;
    }

    final Drawable p() {
        if (this.c == null) {
            C();
        }
        return this.c;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, @dzsi Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !k()) {
                return false;
            }
            i(u(), true);
            return true;
        } else if (k()) {
            return false;
        } else {
            i(w(), true);
            return true;
        }
    }

    @dzsi
    public final View q() {
        return this.w.a(this);
    }

    public final int r(int i) {
        return J(i, zuf.a);
    }

    public final int s(int i) {
        return J(i, zuh.a);
    }

    @Override // defpackage.aegc
    public void setGestureDetector(@dzsi GestureDetector gestureDetector) {
        this.v = gestureDetector;
    }

    @Override // defpackage.aegc
    public void setHideShadowWhenCollapsed(boolean z) {
        this.r = z;
        invalidate();
    }

    @Override // defpackage.aegc
    public void setHideShadowWhenFullyExpanded(boolean z) {
        this.s = z;
        invalidate();
    }

    @Override // defpackage.aegc
    public void setMinExposurePixels(int i) {
        this.y = i;
        if (this.e < u()) {
            h(u());
        } else {
            F(false);
        }
    }

    public void setNestedScrollViewId(int i) {
        this.w = i != -1 ? aegv.b(i) : h;
    }

    public void setNestedScrollViewProvider(aegq aegqVar) {
        this.w = aegqVar;
    }

    public void setNudgeBarViewHelpers(cqhn cqhnVar, @dzsi cqkp cqkpVar) {
        this.n = cqhnVar;
        this.o = cqkpVar;
    }

    public void setProgrammaticNestedScrollListener(@dzsi zuq zuqVar) {
        this.G = zuqVar;
    }

    public void setScrollEachNestedScrollViewIndividually(boolean z) {
        this.t = z;
    }

    @Override // defpackage.aegc
    public void setShouldUseRoundedCornersShadow(boolean z) {
        if (this.B == z) {
            return;
        }
        this.B = z;
        C();
        invalidate();
    }

    @Override // defpackage.aegc
    public void setShowGrippy(boolean z) {
        if (this.C == z) {
            return;
        }
        this.C = z;
        invalidate();
    }

    public void setSnapPoints(@dzsi List<aegg> list) {
        if (list == null) {
            list = dcdc.e();
        }
        this.E = dcdc.r(list);
        L();
        this.f.a(list);
    }

    public void setSoftMinimumHeightPixels(int i) {
        this.D = i;
        L();
        if (this.H == 3) {
            this.f.b(0.0f);
        }
    }

    public final void t(float f) {
        aefm a2 = aefn.a(getContext(), f, new aefl(this) { // from class: zui
            private final zut a;

            {
                this.a = this;
            }

            @Override // defpackage.aefl
            public final void a(aefm aefmVar, float f2, float f3) {
                int s;
                zut zutVar = this.a;
                int i = -Math.round(f2);
                if (f3 > 0.0f) {
                    s = (zutVar.g || zutVar.e > zutVar.v()) ? i : zutVar.r(i);
                } else {
                    s = zutVar.s(i);
                }
                if (s == 0) {
                    return;
                }
                if (zutVar.f.b(f3)) {
                    aefmVar.cancel();
                } else if (zutVar.A(i) == 0) {
                } else {
                    aefmVar.end();
                }
            }
        });
        z(a2);
        a2.start();
    }

    @Override // defpackage.acyu
    public final int u() {
        return Math.min(this.y + K(), w());
    }

    public final int v() {
        return this.D + K();
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

    public final int x() {
        return this.D + K();
    }

    public final void z(Animator animator) {
        animator.addListener(new zul(this));
    }

    public zut(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new aih();
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.w = h;
        this.z = -1;
        this.B = false;
        this.C = false;
        this.H = 3;
        this.E = dcdc.e();
        this.F = dcdc.e();
        this.y = jmj.a(context, 48);
        this.i = jmj.a(context, 8);
        this.j = jmj.a(context, 48);
        this.e = u();
        this.l = new aego(context, new zus(this));
        this.f = new aegl(this, new aegj(this) { // from class: zue
            private final zut a;

            {
                this.a = this;
            }

            @Override // defpackage.aegj
            public final void a(int i, TimeInterpolator timeInterpolator) {
                this.a.g(i, true, timeInterpolator);
            }
        });
        this.m = new np();
        setFocusableInTouchMode(true);
        this.A = getResources().getConfiguration().orientation;
    }
}
