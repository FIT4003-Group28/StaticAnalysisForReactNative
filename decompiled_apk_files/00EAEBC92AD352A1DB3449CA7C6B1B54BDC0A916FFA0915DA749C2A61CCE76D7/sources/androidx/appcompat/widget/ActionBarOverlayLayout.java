package androidx.appcompat.widget;

import android.animation.Animator;
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
import androidx.appcompat.view.menu.n;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements c0, a.g.m.p, a.g.m.n, a.g.m.o {
    static final int[] C = {a.a.a.actionBarSize, 16842841};
    private final Runnable A;
    private final a.g.m.q B;

    /* renamed from: b  reason: collision with root package name */
    private int f1109b;

    /* renamed from: c  reason: collision with root package name */
    private int f1110c;

    /* renamed from: d  reason: collision with root package name */
    private ContentFrameLayout f1111d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f1112e;

    /* renamed from: f  reason: collision with root package name */
    private d0 f1113f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1114g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1115h;
    private boolean i;
    private boolean j;
    private boolean k;
    boolean l;
    private int m;
    private int n;
    private final Rect o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private d v;
    private OverScroller w;
    ViewPropertyAnimator x;
    final AnimatorListenerAdapter y;
    private final Runnable z;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = null;
            actionBarOverlayLayout.l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = null;
            actionBarOverlayLayout.l = false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = actionBarOverlayLayout.f1112e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.y);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = actionBarOverlayLayout.f1112e.animate().translationY(-ActionBarOverlayLayout.this.f1112e.getHeight()).setListener(ActionBarOverlayLayout.this.y);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void a(int i);

        void a(boolean z);

        void b();

        void c();

        void d();
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i, int i2) {
            super(i, i2);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1110c = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.y = new a();
        this.z = new b();
        this.A = new c();
        a(context);
        this.B = new a.g.m.q(this);
    }

    private d0 a(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        boolean z = false;
        this.f1109b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1114g = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f1114g == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f1115h = z;
        this.w = new OverScroller(context);
    }

    private boolean a(float f2, float f3) {
        this.w.fling(0, 0, 0, (int) f3, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return this.w.getFinalY() > this.f1112e.getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            r5 = 1
        L35:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.a(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    private void k() {
        h();
        this.A.run();
    }

    private void l() {
        h();
        postDelayed(this.A, 600L);
    }

    private void m() {
        h();
        postDelayed(this.z, 600L);
    }

    private void n() {
        h();
        this.z.run();
    }

    @Override // androidx.appcompat.widget.c0
    public void a(int i) {
        j();
        if (i == 2) {
            this.f1113f.n();
        } else if (i == 5) {
            this.f1113f.o();
        } else if (i != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public void a(Menu menu, n.a aVar) {
        j();
        this.f1113f.a(menu, aVar);
    }

    @Override // a.g.m.n
    public void a(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // a.g.m.n
    public void a(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // a.g.m.o
    public void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        a(view, i, i2, i3, i4, i5);
    }

    @Override // a.g.m.n
    public void a(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // a.g.m.n
    public void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public boolean a() {
        j();
        return this.f1113f.a();
    }

    @Override // androidx.appcompat.widget.c0
    public void b() {
        j();
        this.f1113f.b();
    }

    @Override // a.g.m.n
    public boolean b(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // androidx.appcompat.widget.c0
    public boolean c() {
        j();
        return this.f1113f.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.c0
    public boolean d() {
        j();
        return this.f1113f.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1114g == null || this.f1115h) {
            return;
        }
        int bottom = this.f1112e.getVisibility() == 0 ? (int) (this.f1112e.getBottom() + this.f1112e.getTranslationY() + 0.5f) : 0;
        this.f1114g.setBounds(0, bottom, getWidth(), this.f1114g.getIntrinsicHeight() + bottom);
        this.f1114g.draw(canvas);
    }

    @Override // androidx.appcompat.widget.c0
    public boolean e() {
        j();
        return this.f1113f.e();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean f() {
        j();
        return this.f1113f.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        j();
        int A = a.g.m.v.A(this) & 256;
        boolean a2 = a((View) this.f1112e, rect, true, true, false, true);
        this.r.set(rect);
        d1.a(this, this.r, this.o);
        if (!this.s.equals(this.r)) {
            this.s.set(this.r);
            a2 = true;
        }
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            a2 = true;
        }
        if (a2) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.c0
    public void g() {
        j();
        this.f1113f.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // android.view.ViewGroup
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1112e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.B.a();
    }

    public CharSequence getTitle() {
        j();
        return this.f1113f.getTitle();
    }

    void h() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean i() {
        return this.i;
    }

    void j() {
        if (this.f1111d == null) {
            this.f1111d = (ContentFrameLayout) findViewById(a.a.f.action_bar_activity_content);
            this.f1112e = (ActionBarContainer) findViewById(a.a.f.action_bar_container);
            this.f1113f = a(findViewById(a.a.f.action_bar));
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        a.g.m.v.N(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.f1112e, i, 0, i2, 0);
        e eVar = (e) this.f1112e.getLayoutParams();
        int max = Math.max(0, this.f1112e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f1112e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1112e.getMeasuredState());
        boolean z = (a.g.m.v.A(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f1109b;
            if (this.j && this.f1112e.getTabContainer() != null) {
                measuredHeight += this.f1109b;
            }
        } else {
            measuredHeight = this.f1112e.getVisibility() != 8 ? this.f1112e.getMeasuredHeight() : 0;
        }
        this.q.set(this.o);
        this.t.set(this.r);
        Rect rect = (this.i || z) ? this.t : this.q;
        rect.top += measuredHeight;
        rect.bottom += 0;
        a((View) this.f1111d, this.q, true, true, true, true);
        if (!this.u.equals(this.t)) {
            this.u.set(this.t);
            this.f1111d.a(this.t);
        }
        measureChildWithMargins(this.f1111d, i, 0, i2, 0);
        e eVar2 = (e) this.f1111d.getLayoutParams();
        int max3 = Math.max(max, this.f1111d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f1111d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1111d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.g.m.p
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.k || !z) {
            return false;
        }
        if (a(f2, f3)) {
            k();
        } else {
            n();
        }
        this.l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.g.m.p
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.g.m.p
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.g.m.p
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.m += i2;
        setActionBarHideOffset(this.m);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.g.m.p
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.B.a(view, view2, i);
        this.m = getActionBarHideOffset();
        h();
        d dVar = this.v;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.g.m.p
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1112e.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.g.m.p
    public void onStopNestedScroll(View view) {
        if (this.k && !this.l) {
            if (this.m <= this.f1112e.getHeight()) {
                m();
            } else {
                l();
            }
        }
        d dVar = this.v;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        j();
        int i2 = this.n ^ i;
        this.n = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        d dVar = this.v;
        if (dVar != null) {
            dVar.a(!z);
            if (z2 || !z) {
                this.v.a();
            } else {
                this.v.d();
            }
        }
        if ((i2 & 256) == 0 || this.v == null) {
            return;
        }
        a.g.m.v.N(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1110c = i;
        d dVar = this.v;
        if (dVar != null) {
            dVar.a(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f1112e.setTranslationY(-Math.max(0, Math.min(i, this.f1112e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.v = dVar;
        if (getWindowToken() != null) {
            this.v.a(this.f1110c);
            int i = this.n;
            if (i == 0) {
                return;
            }
            onWindowSystemUiVisibilityChanged(i);
            a.g.m.v.N(this);
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.k) {
            this.k = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        j();
        this.f1113f.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        j();
        this.f1113f.setIcon(drawable);
    }

    public void setLogo(int i) {
        j();
        this.f1113f.b(i);
    }

    public void setOverlayMode(boolean z) {
        this.i = z;
        this.f1115h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowCallback(Window.Callback callback) {
        j();
        this.f1113f.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowTitle(CharSequence charSequence) {
        j();
        this.f1113f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
