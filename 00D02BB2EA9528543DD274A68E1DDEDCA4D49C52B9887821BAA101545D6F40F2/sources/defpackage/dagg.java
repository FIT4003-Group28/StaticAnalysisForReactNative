package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
@bax
/* renamed from: dagg  reason: default package */
/* loaded from: classes.dex */
public class dagg extends HorizontalScrollView {
    private static final int B = 2132018543;
    private static final my<dagb> C = new na(16);
    public ViewPager A;
    private final int D;
    private final int E;
    private final int F;
    private int G;
    private dafv H;
    private final ArrayList<dafv> I;
    private dafv J;
    private ValueAnimator K;
    private bas L;
    private DataSetObserver M;
    private dagc N;
    private dafu O;
    private boolean P;
    private final my<dage> Q;
    public final ArrayList<dagb> a;
    public dagb b;
    final daga c;
    int d;
    int e;
    int f;
    int g;
    int h;
    ColorStateList i;
    ColorStateList j;
    ColorStateList k;
    Drawable l;
    public int m;
    PorterDuff.Mode n;
    float o;
    float p;
    final int q;
    int r;
    int s;
    int t;
    int u;
    int v;
    boolean w;
    boolean x;
    boolean y;
    public dafr z;

    public dagg(Context context) {
        this(context, null);
    }

    private final int A() {
        int i = this.D;
        if (i != -1) {
            return i;
        }
        int i2 = this.v;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        return this.F;
    }

    private final void d(ViewPager viewPager, boolean z, boolean z2) {
        List<dafu> list;
        ViewPager viewPager2 = this.A;
        if (viewPager2 != null) {
            dagc dagcVar = this.N;
            if (dagcVar != null) {
                viewPager2.i(dagcVar);
            }
            dafu dafuVar = this.O;
            if (dafuVar != null && (list = this.A.m) != null) {
                list.remove(dafuVar);
            }
        }
        dafv dafvVar = this.J;
        if (dafvVar != null) {
            h(dafvVar);
            this.J = null;
        }
        if (viewPager != null) {
            this.A = viewPager;
            if (this.N == null) {
                this.N = new dagc(this);
            }
            dagc dagcVar2 = this.N;
            dagcVar2.b = 0;
            dagcVar2.a = 0;
            viewPager.h(dagcVar2);
            dagf dagfVar = new dagf(viewPager);
            this.J = dagfVar;
            g(dagfVar);
            bas c = viewPager.c();
            if (c != null) {
                l(c, z);
            }
            if (this.O == null) {
                this.O = new dafu(this);
            }
            dafu dafuVar2 = this.O;
            dafuVar2.a = z;
            if (viewPager.m == null) {
                viewPager.m = new ArrayList();
            }
            viewPager.m.add(dafuVar2);
            setScrollPosition(viewPager.e(), 0.0f, true);
        } else {
            this.A = null;
            l(null, false);
        }
        this.P = z2;
    }

    private final void s() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            this.a.get(i).b();
        }
    }

    private final void t(View view) {
        if (view instanceof dafs) {
            dafs dafsVar = (dafs) view;
            dagb c = c();
            CharSequence charSequence = dafsVar.a;
            if (charSequence != null) {
                c.e(charSequence);
            }
            Drawable drawable = dafsVar.b;
            if (drawable != null) {
                c.a = drawable;
                dagg daggVar = c.g;
                if (daggVar.s == 1 || daggVar.v == 2) {
                    daggVar.q(true);
                }
                c.b();
            }
            int i = dafsVar.c;
            if (i != 0) {
                c.d(LayoutInflater.from(c.h.getContext()).inflate(i, (ViewGroup) c.h, false));
            }
            if (!TextUtils.isEmpty(dafsVar.getContentDescription())) {
                c.c = dafsVar.getContentDescription();
                c.b();
            }
            e(c, this.a.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private final void u(LinearLayout.LayoutParams layoutParams) {
        float f;
        if (this.v == 1 && this.s == 0) {
            layoutParams.width = 0;
            f = 1.0f;
        } else {
            layoutParams.width = -2;
            f = 0.0f;
        }
        layoutParams.weight = f;
    }

    private final void v(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && od.ae(this)) {
            daga dagaVar = this.c;
            int childCount = dagaVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (dagaVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int x = x(i, 0.0f);
            if (scrollX != x) {
                if (this.K == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.K = valueAnimator;
                    valueAnimator.setInterpolator(czum.b);
                    this.K.setDuration(this.t);
                    this.K.addUpdateListener(new daft(this));
                }
                this.K.setIntValues(scrollX, x);
                this.K.start();
            }
            daga dagaVar2 = this.c;
            int i3 = this.t;
            ValueAnimator valueAnimator2 = dagaVar2.a;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                dagaVar2.a.cancel();
            }
            dagaVar2.c(true, i, i3);
            return;
        }
        setScrollPosition(i, 0.0f, true);
    }

    private final void w(int i) {
        int childCount = this.c.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.c.getChildAt(i2);
                boolean z = i2 == i;
                childAt.setSelected(z);
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    private final int x(int i, float f) {
        int i2 = this.v;
        int i3 = 0;
        if (i2 == 0 || i2 == 2) {
            View childAt = this.c.getChildAt(i);
            int i4 = i + 1;
            View childAt2 = i4 < this.c.getChildCount() ? this.c.getChildAt(i4) : null;
            int width = childAt != null ? childAt.getWidth() : 0;
            if (childAt2 != null) {
                i3 = childAt2.getWidth();
            }
            int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
            int i5 = (int) ((width + i3) * 0.5f * f);
            return od.s(this) == 0 ? left + i5 : left - i5;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r0 != 2) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void y() {
        /*
            r4 = this;
            int r0 = r4.v
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto L14
        Lb:
            int r0 = r4.G
            int r3 = r4.d
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            daga r3 = r4.c
            defpackage.od.y(r3, r0, r2, r2, r2)
            int r0 = r4.v
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 == r2) goto L23
            if (r0 == r1) goto L23
            goto L40
        L23:
            daga r0 = r4.c
            r0.setGravity(r2)
            goto L40
        L29:
            int r0 = r4.s
            if (r0 == 0) goto L38
            if (r0 == r2) goto L32
            if (r0 == r1) goto L38
            goto L40
        L32:
            daga r0 = r4.c
            r0.setGravity(r2)
            goto L40
        L38:
            daga r0 = r4.c
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r1)
        L40:
            r4.q(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dagg.y():void");
    }

    private static ColorStateList z(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public void a(dafw dafwVar) {
        g(dafwVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        t(view);
    }

    public void b() {
        this.I.clear();
    }

    public dagb c() {
        dagb a = C.a();
        if (a == null) {
            a = new dagb();
        }
        a.g = this;
        my<dage> myVar = this.Q;
        dage a2 = myVar != null ? myVar.a() : null;
        if (a2 == null) {
            a2 = new dage(this, getContext());
        }
        a2.b(a);
        a2.setFocusable(true);
        a2.setMinimumWidth(A());
        if (!TextUtils.isEmpty(a.c)) {
            a2.setContentDescription(a.c);
        } else {
            a2.setContentDescription(a.b);
        }
        a.h = a2;
        if (a.i != -1) {
            a.h.setId(0);
        }
        return a;
    }

    public final void e(dagb dagbVar, boolean z) {
        f(dagbVar, this.a.size(), z);
    }

    public final void f(dagb dagbVar, int i, boolean z) {
        if (dagbVar.g == this) {
            dagbVar.d = i;
            this.a.add(i, dagbVar);
            int size = this.a.size();
            while (true) {
                i++;
                if (i >= size) {
                    break;
                }
                this.a.get(i).d = i;
            }
            dage dageVar = dagbVar.h;
            dageVar.setSelected(false);
            dageVar.setActivated(false);
            daga dagaVar = this.c;
            int i2 = dagbVar.d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            u(layoutParams);
            dagaVar.addView(dageVar, i2, layoutParams);
            if (!z) {
                return;
            }
            dagbVar.a();
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Deprecated
    public final void g(dafv dafvVar) {
        if (!this.I.contains(dafvVar)) {
            this.I.add(dafvVar);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public final FrameLayout.LayoutParams mo9generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public final void h(dafv dafvVar) {
        this.I.remove(dafvVar);
    }

    public final int i() {
        return this.a.size();
    }

    public final dagb j(int i) {
        if (i < 0 || i >= i()) {
            return null;
        }
        return this.a.get(i);
    }

    public final int k() {
        dagb dagbVar = this.b;
        if (dagbVar != null) {
            return dagbVar.d;
        }
        return -1;
    }

    public final void l(bas basVar, boolean z) {
        DataSetObserver dataSetObserver;
        bas basVar2 = this.L;
        if (basVar2 != null && (dataSetObserver = this.M) != null) {
            basVar2.o(dataSetObserver);
        }
        this.L = basVar;
        if (z && basVar != null) {
            if (this.M == null) {
                this.M = new dafx(this);
            }
            basVar.n(this.M);
        }
        m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        int e;
        int childCount = this.c.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            n(childCount);
        }
        Iterator<dagb> it = this.a.iterator();
        while (it.hasNext()) {
            dagb next = it.next();
            it.remove();
            next.c();
            r(next);
        }
        this.b = null;
        bas basVar = this.L;
        if (basVar != null) {
            int OV = basVar.OV();
            for (int i = 0; i < OV; i++) {
                dagb c = c();
                c.e(this.L.q(i));
                e(c, false);
            }
            ViewPager viewPager = this.A;
            if (viewPager == null || OV <= 0 || (e = viewPager.e()) == k() || e >= i()) {
                return;
            }
            o(j(e));
        }
    }

    public final void n(int i) {
        dage dageVar = (dage) this.c.getChildAt(i);
        this.c.removeViewAt(i);
        if (dageVar != null) {
            dageVar.b(null);
            dageVar.setSelected(false);
            this.Q.b(dageVar);
        }
        requestLayout();
    }

    public final void o(dagb dagbVar) {
        p(dagbVar, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dads.e(this);
        if (this.A == null) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewPager)) {
                return;
            }
            d((ViewPager) parent, true, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.P) {
            setupWithViewPager(null);
            this.P = false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        dage dageVar;
        Drawable drawable;
        for (int i = 0; i < this.c.getChildCount(); i++) {
            View childAt = this.c.getChildAt(i);
            if ((childAt instanceof dage) && (drawable = (dageVar = (dage) childAt).f) != null) {
                drawable.setBounds(dageVar.getLeft(), dageVar.getTop(), dageVar.getRight(), dageVar.getBottom());
                dageVar.f.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        pc.a(accessibilityNodeInfo).H(oz.b(1, i(), 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
        if (r8.getMeasuredWidth() != getMeasuredWidth()) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
        if (r8.getMeasuredWidth() < getMeasuredWidth()) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b3, code lost:
        if (r2 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
        r8.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(r9, getPaddingTop() + getPaddingBottom(), r8.getLayoutParams().height));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            android.content.Context r0 = r7.getContext()
            java.util.ArrayList<dagb> r1 = r7.a
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        Lc:
            r4 = 48
            if (r3 >= r1) goto L30
            java.util.ArrayList<dagb> r5 = r7.a
            java.lang.Object r5 = r5.get(r3)
            dagb r5 = (defpackage.dagb) r5
            if (r5 == 0) goto L2d
            android.graphics.drawable.Drawable r6 = r5.a
            if (r6 == 0) goto L2d
            java.lang.CharSequence r5 = r5.b
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L2d
            boolean r1 = r7.w
            if (r1 != 0) goto L30
            r4 = 72
            goto L30
        L2d:
            int r3 = r3 + 1
            goto Lc
        L30:
            float r0 = defpackage.dabd.b(r0, r4)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r9)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r3) goto L55
            if (r1 == 0) goto L46
            goto L68
        L46:
            int r9 = r7.getPaddingTop()
            int r0 = r0 + r9
            int r9 = r7.getPaddingBottom()
            int r0 = r0 + r9
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L68
        L55:
            int r1 = r7.getChildCount()
            if (r1 != r5) goto L68
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            if (r1 < r0) goto L68
            android.view.View r1 = r7.getChildAt(r2)
            r1.setMinimumHeight(r0)
        L68:
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            if (r1 == 0) goto L86
            int r1 = r7.E
            if (r1 <= 0) goto L77
            goto L84
        L77:
            float r0 = (float) r0
            android.content.Context r1 = r7.getContext()
            r3 = 56
            float r1 = defpackage.dabd.b(r1, r3)
            float r0 = r0 - r1
            int r1 = (int) r0
        L84:
            r7.r = r1
        L86:
            super.onMeasure(r8, r9)
            int r8 = r7.getChildCount()
            if (r8 != r5) goto Ld3
            android.view.View r8 = r7.getChildAt(r2)
            int r0 = r7.v
            if (r0 == 0) goto La8
            if (r0 == r5) goto L9d
            r1 = 2
            if (r0 == r1) goto La8
            goto Ld3
        L9d:
            int r0 = r8.getMeasuredWidth()
            int r1 = r7.getMeasuredWidth()
            if (r0 == r1) goto Lb3
            goto Lb2
        La8:
            int r0 = r8.getMeasuredWidth()
            int r1 = r7.getMeasuredWidth()
            if (r0 >= r1) goto Lb3
        Lb2:
            r2 = 1
        Lb3:
            if (r2 == 0) goto Ld3
            int r0 = r7.getPaddingTop()
            int r1 = r7.getPaddingBottom()
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            int r2 = r2.height
            int r0 = r0 + r1
            int r9 = getChildMeasureSpec(r9, r0, r2)
            int r0 = r7.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r8.measure(r0, r9)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dagg.onMeasure(int, int):void");
    }

    public final void p(dagb dagbVar, boolean z) {
        dagb dagbVar2 = this.b;
        if (dagbVar2 == dagbVar) {
            if (dagbVar2 == null) {
                return;
            }
            for (int size = this.I.size() - 1; size >= 0; size--) {
                this.I.get(size).c(dagbVar);
            }
            v(dagbVar.d);
            return;
        }
        int i = dagbVar != null ? dagbVar.d : -1;
        if (z) {
            if ((dagbVar2 != null && dagbVar2.d != -1) || i == -1) {
                v(i);
            } else {
                setScrollPosition(i, 0.0f, true);
            }
            if (i != -1) {
                w(i);
            }
        }
        this.b = dagbVar;
        if (dagbVar2 != null) {
            for (int size2 = this.I.size() - 1; size2 >= 0; size2--) {
                this.I.get(size2).b(dagbVar2);
            }
        }
        if (dagbVar == null) {
            return;
        }
        for (int size3 = this.I.size() - 1; size3 >= 0; size3--) {
            this.I.get(size3).a(dagbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(boolean z) {
        for (int i = 0; i < this.c.getChildCount(); i++) {
            View childAt = this.c.getChildAt(i);
            childAt.setMinimumWidth(A());
            u((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public final void r(dagb dagbVar) {
        C.b(dagbVar);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        dads.d(this, f);
    }

    public void setInlineLabel(boolean z) {
        ImageView imageView;
        if (this.w != z) {
            this.w = z;
            for (int i = 0; i < this.c.getChildCount(); i++) {
                View childAt = this.c.getChildAt(i);
                if (childAt instanceof dage) {
                    dage dageVar = (dage) childAt;
                    dageVar.setOrientation(!dageVar.g.w ? 1 : 0);
                    TextView textView = dageVar.d;
                    if (textView == null && dageVar.e == null) {
                        textView = dageVar.a;
                        imageView = dageVar.b;
                    } else {
                        imageView = dageVar.e;
                    }
                    dageVar.d(textView, imageView);
                }
            }
            y();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(dafv dafvVar) {
        dafv dafvVar2 = this.H;
        if (dafvVar2 != null) {
            h(dafvVar2);
        }
        this.H = dafvVar;
        if (dafvVar != null) {
            g(dafvVar);
        }
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(sl.b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.m = i;
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.u != i) {
            this.u = i;
            od.i(this.c);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.c.a(i);
    }

    public void setTabGravity(int i) {
        if (this.s != i) {
            this.s = i;
            y();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            s();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(sl.a(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        dafr dafrVar;
        if (i == 0) {
            dafrVar = new dafr();
        } else if (i == 1) {
            dafrVar = new dafp();
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append(i);
            sb.append(" is not a valid TabIndicatorAnimationMode");
            throw new IllegalArgumentException(sb.toString());
        }
        this.z = dafrVar;
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.x = z;
        od.i(this.c);
    }

    public void setTabMode(int i) {
        if (i != this.v) {
            this.v = i;
            y();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            for (int i = 0; i < this.c.getChildCount(); i++) {
                View childAt = this.c.getChildAt(i);
                if (childAt instanceof dage) {
                    ((dage) childAt).a(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(sl.a(getContext(), i));
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(z(i, i2));
    }

    @Deprecated
    public void setTabsFromPagerAdapter(bas basVar) {
        l(basVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.y != z) {
            this.y = z;
            for (int i = 0; i < this.c.getChildCount(); i++) {
                View childAt = this.c.getChildAt(i);
                if (childAt instanceof dage) {
                    ((dage) childAt).a(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    public dagg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        t(view);
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.c.getChildCount()) {
            return;
        }
        if (z2) {
            daga dagaVar = this.c;
            ValueAnimator valueAnimator = dagaVar.a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                dagaVar.a.cancel();
            }
            dagaVar.b = i;
            dagaVar.c = f;
            dagaVar.b(dagaVar.getChildAt(i), dagaVar.getChildAt(dagaVar.b + 1), dagaVar.c);
        }
        ValueAnimator valueAnimator2 = this.K;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.K.cancel();
        }
        scrollTo(x(i, f), 0);
        if (!z) {
            return;
        }
        w(round);
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            s();
        }
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        d(viewPager, z, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dagg(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dagg.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        t(view);
    }

    @Deprecated
    public void setOnTabSelectedListener(dafw dafwVar) {
        setOnTabSelectedListener((dafv) dafwVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        t(view);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.l != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.l = drawable;
        }
    }
}
