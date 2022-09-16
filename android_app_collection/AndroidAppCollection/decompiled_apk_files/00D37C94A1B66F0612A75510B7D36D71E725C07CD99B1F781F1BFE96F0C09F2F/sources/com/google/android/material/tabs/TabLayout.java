package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
@bpj
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {
    private static final int x = 2132084205;
    private static final jk y = new jm(16);
    private alou A;
    private final int B;
    private final int C;
    private final int D;
    private int E;
    private final ArrayList F;
    private ValueAnimator G;
    private bpg H;
    private DataSetObserver I;

    /* renamed from: J  reason: collision with root package name */
    private alov f168J;
    private alop K;
    private boolean L;
    private final jk M;
    private aloy N;
    final alot a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public ColorStateList g;
    public ColorStateList h;
    public Drawable i;
    public int j;
    public float k;
    public float l;
    public final int m;
    public int n;
    public int o;
    int p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public ViewPager v;
    public anqx w;
    private final ArrayList z;

    public TabLayout(Context context) {
        this(context, null);
    }

    private final int m(int i, float f) {
        int i2 = this.r;
        int i3 = 0;
        if (i2 == 0 || i2 == 2) {
            View childAt = this.a.getChildAt(i);
            int i4 = i + 1;
            View childAt2 = i4 < this.a.getChildCount() ? this.a.getChildAt(i4) : null;
            int width = childAt != null ? childAt.getWidth() : 0;
            if (childAt2 != null) {
                i3 = childAt2.getWidth();
            }
            int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
            int i5 = (int) ((width + i3) * 0.5f * f);
            return lj.e(this) == 0 ? left + i5 : left - i5;
        }
        return 0;
    }

    private final int n() {
        int i = this.B;
        if (i != -1) {
            return i;
        }
        int i2 = this.r;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        return this.D;
    }

    private final void o(View view) {
        if (view instanceof alon) {
            alon alonVar = (alon) view;
            alou d = d();
            CharSequence charSequence = alonVar.a;
            Drawable drawable = alonVar.b;
            int i = alonVar.c;
            if (!TextUtils.isEmpty(alonVar.getContentDescription())) {
                d.b = alonVar.getContentDescription();
                d.b();
            }
            e(d, this.z.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private final void p(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && lj.al(this)) {
            alot alotVar = this.a;
            int childCount = alotVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (alotVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int m = m(i, 0.0f);
            if (scrollX != m) {
                if (this.G == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.G = valueAnimator;
                    valueAnimator.setInterpolator(alhv.b);
                    this.G.setDuration(this.p);
                    this.G.addUpdateListener(new aloo(this));
                }
                this.G.setIntValues(scrollX, m);
                this.G.start();
            }
            alot alotVar2 = this.a;
            int i3 = this.p;
            ValueAnimator valueAnimator2 = alotVar2.a;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                alotVar2.a.cancel();
            }
            alotVar2.b(true, i, i3);
            return;
        }
        l(i);
    }

    private final void q(int i) {
        int childCount = this.a.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.a.getChildAt(i2);
                boolean z = i2 == i;
                childAt.setSelected(z);
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    private final void s(ViewPager viewPager, boolean z) {
        List list;
        ViewPager viewPager2 = this.v;
        if (viewPager2 != null) {
            alov alovVar = this.f168J;
            if (alovVar != null) {
                viewPager2.j(alovVar);
            }
            alop alopVar = this.K;
            if (alopVar != null && (list = this.v.h) != null) {
                list.remove(alopVar);
            }
        }
        aloy aloyVar = this.N;
        if (aloyVar != null) {
            this.F.remove(aloyVar);
            this.N = null;
        }
        if (viewPager != null) {
            this.v = viewPager;
            if (this.f168J == null) {
                this.f168J = new alov(this);
            }
            alov alovVar2 = this.f168J;
            alovVar2.b = 0;
            alovVar2.a = 0;
            viewPager.e(alovVar2);
            aloy aloyVar2 = new aloy(viewPager);
            this.N = aloyVar2;
            if (!this.F.contains(aloyVar2)) {
                this.F.add(aloyVar2);
            }
            bpg bpgVar = viewPager.b;
            if (bpgVar != null) {
                i(bpgVar, true);
            }
            if (this.K == null) {
                this.K = new alop(this);
            }
            alop alopVar2 = this.K;
            alopVar2.a = true;
            if (viewPager.h == null) {
                viewPager.h = new ArrayList();
            }
            viewPager.h.add(alopVar2);
            l(viewPager.a());
        } else {
            this.v = null;
            i(null, false);
        }
        this.L = z;
    }

    public final int a() {
        alou alouVar = this.A;
        if (alouVar != null) {
            return alouVar.c;
        }
        return -1;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        o(view);
    }

    public final int b() {
        return this.z.size();
    }

    public final alou c(int i) {
        if (i < 0 || i >= b()) {
            return null;
        }
        return (alou) this.z.get(i);
    }

    public final alou d() {
        alou alouVar = (alou) y.a();
        if (alouVar == null) {
            alouVar = new alou();
        }
        alouVar.f = this;
        jk jkVar = this.M;
        alox aloxVar = jkVar != null ? (alox) jkVar.a() : null;
        if (aloxVar == null) {
            aloxVar = new alox(this, getContext());
        }
        aloxVar.a(alouVar);
        aloxVar.setFocusable(true);
        aloxVar.setMinimumWidth(n());
        if (!TextUtils.isEmpty(alouVar.b)) {
            aloxVar.setContentDescription(alouVar.b);
        } else {
            aloxVar.setContentDescription(alouVar.a);
        }
        alouVar.g = aloxVar;
        if (alouVar.h != -1) {
            alouVar.g.setId(0);
        }
        return alouVar;
    }

    public final void e(alou alouVar, boolean z) {
        int size = this.z.size();
        if (alouVar.f == this) {
            alouVar.c = size;
            this.z.add(size, alouVar);
            int size2 = this.z.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                }
                ((alou) this.z.get(size)).c = size;
            }
            alox aloxVar = alouVar.g;
            aloxVar.setSelected(false);
            aloxVar.setActivated(false);
            alot alotVar = this.a;
            int i = alouVar.c;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            r(layoutParams);
            alotVar.addView(aloxVar, i, layoutParams);
            if (!z) {
                return;
            }
            alouVar.a();
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void f() {
        int a;
        for (int childCount = this.a.getChildCount() - 1; childCount >= 0; childCount--) {
            alox aloxVar = (alox) this.a.getChildAt(childCount);
            this.a.removeViewAt(childCount);
            if (aloxVar != null) {
                aloxVar.a(null);
                aloxVar.setSelected(false);
                this.M.b(aloxVar);
            }
            requestLayout();
        }
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            alou alouVar = (alou) it.next();
            it.remove();
            alouVar.f = null;
            alouVar.g = null;
            alouVar.h = -1;
            alouVar.a = null;
            alouVar.b = null;
            alouVar.c = -1;
            alouVar.d = null;
            y.b(alouVar);
        }
        this.A = null;
        bpg bpgVar = this.H;
        if (bpgVar != null) {
            int j = bpgVar.j();
            for (int i = 0; i < j; i++) {
                alou d = d();
                CharSequence l = this.H.l(i);
                if (TextUtils.isEmpty(d.b) && !TextUtils.isEmpty(l)) {
                    d.g.setContentDescription(l);
                }
                d.a = l;
                d.b();
                e(d, false);
            }
            ViewPager viewPager = this.v;
            if (viewPager == null || j <= 0 || (a = viewPager.a()) == a() || a >= b()) {
                return;
            }
            g(c(a));
        }
    }

    public final void g(alou alouVar) {
        h(alouVar, true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void h(alou alouVar, boolean z) {
        alou alouVar2 = this.A;
        if (alouVar2 == alouVar) {
            if (alouVar2 == null) {
                return;
            }
            for (int size = this.F.size() - 1; size >= 0; size--) {
                aloy aloyVar = (aloy) this.F.get(size);
            }
            p(alouVar.c);
            return;
        }
        int i = alouVar != null ? alouVar.c : -1;
        if (z) {
            if ((alouVar2 != null && alouVar2.c != -1) || i == -1) {
                p(i);
            } else {
                l(i);
            }
            if (i != -1) {
                q(i);
            }
        }
        this.A = alouVar;
        if (alouVar2 != null) {
            for (int size2 = this.F.size() - 1; size2 >= 0; size2--) {
                aloy aloyVar2 = (aloy) this.F.get(size2);
            }
        }
        if (alouVar == null) {
            return;
        }
        for (int size3 = this.F.size() - 1; size3 >= 0; size3--) {
            ((aloy) this.F.get(size3)).a.l(alouVar.c);
        }
    }

    public final void i(bpg bpgVar, boolean z) {
        DataSetObserver dataSetObserver;
        bpg bpgVar2 = this.H;
        if (bpgVar2 != null && (dataSetObserver = this.I) != null) {
            bpgVar2.a.unregisterObserver(dataSetObserver);
        }
        this.H = bpgVar;
        if (z && bpgVar != null) {
            if (this.I == null) {
                this.I = new aloq(this);
            }
            bpgVar.a.registerObserver(this.I);
        }
        f();
    }

    public final void j(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.a.getChildCount()) {
            return;
        }
        if (z2) {
            alot alotVar = this.a;
            ValueAnimator valueAnimator = alotVar.a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                alotVar.a.cancel();
            }
            alotVar.b = i;
            alotVar.c = f;
            alotVar.a(alotVar.getChildAt(i), alotVar.getChildAt(alotVar.b + 1), alotVar.c);
        }
        ValueAnimator valueAnimator2 = this.G;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.G.cancel();
        }
        scrollTo(m(i, f), 0);
        if (!z) {
            return;
        }
        q(round);
    }

    public final void k(boolean z) {
        for (int i = 0; i < this.a.getChildCount(); i++) {
            View childAt = this.a.getChildAt(i);
            childAt.setMinimumWidth(n());
            r((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public final void l(int i) {
        j(i, 0.0f, true, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        almu.c(this);
        if (this.v == null) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewPager)) {
                return;
            }
            s((ViewPager) parent, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.L) {
            s(null, false);
            this.L = false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        alox aloxVar;
        Drawable drawable;
        for (int i = 0; i < this.a.getChildCount(); i++) {
            View childAt = this.a.getChildAt(i);
            if ((childAt instanceof alox) && (drawable = (aloxVar = (alox) childAt).c) != null) {
                drawable.setBounds(aloxVar.getLeft(), aloxVar.getTop(), aloxVar.getRight(), aloxVar.getBottom());
                aloxVar.c.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        mh.c(accessibilityNodeInfo).t(aonf.a(1, b(), 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009b, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
        if (r2 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
        r7.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(r8, getPaddingTop() + getPaddingBottom(), r7.getLayoutParams().height));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            java.util.ArrayList r1 = r6.z
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L19
            java.util.ArrayList r4 = r6.z
            java.lang.Object r4 = r4.get(r3)
            alou r4 = (defpackage.alou) r4
            int r3 = r3 + 1
            goto Lc
        L19:
            r1 = 48
            float r0 = defpackage.amyv.t(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r3) goto L40
            if (r1 == 0) goto L31
            goto L53
        L31:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L53
        L40:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L53
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L53
            android.view.View r1 = r6.getChildAt(r2)
            r1.setMinimumHeight(r0)
        L53:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L71
            int r1 = r6.C
            if (r1 <= 0) goto L62
            goto L6f
        L62:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r3 = 56
            float r1 = defpackage.amyv.t(r1, r3)
            float r0 = r0 - r1
            int r1 = (int) r0
        L6f:
            r6.n = r1
        L71:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lbe
            android.view.View r7 = r6.getChildAt(r2)
            int r0 = r6.r
            if (r0 == 0) goto L93
            if (r0 == r5) goto L88
            r1 = 2
            if (r0 == r1) goto L93
            goto Lbe
        L88:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L9e
            goto L9d
        L93:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L9e
        L9d:
            r2 = 1
        L9e:
            if (r2 == 0) goto Lbe
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            int r2 = r2.height
            int r0 = r0 + r1
            int r8 = getChildMeasureSpec(r8, r0, r2)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        almu.b(this, f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.a.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        o(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public final FrameLayout.LayoutParams mo164generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x022f, code lost:
        if (r13 != 2) goto L33;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TabLayout(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private final void r(LinearLayout.LayoutParams layoutParams) {
        if (this.r != 1 || this.o != 0) {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
            return;
        }
        layoutParams.width = 0;
        layoutParams.weight = 1.0f;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        o(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        o(view);
    }
}
