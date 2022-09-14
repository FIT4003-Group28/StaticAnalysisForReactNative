package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements android.support.v4.j.m {
    static final int[] e = {a.C0020a.actionBarSize, 16842841};
    private final Runnable A;
    private final Runnable B;
    private final android.support.v4.j.o C;

    /* renamed from: a  reason: collision with root package name */
    ActionBarContainer f801a;

    /* renamed from: b  reason: collision with root package name */
    boolean f802b;

    /* renamed from: c  reason: collision with root package name */
    ViewPropertyAnimator f803c;

    /* renamed from: d  reason: collision with root package name */
    final AnimatorListenerAdapter f804d;
    private int f;
    private int g;
    private ContentFrameLayout h;
    private t i;
    private Drawable j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private a x;
    private final int y;
    private OverScroller z;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(int i);

        void a(boolean z);

        void b();

        void c();

        void d();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.j.m
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.j.m
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.y = 600;
        this.f804d = new AnimatorListenerAdapter() { // from class: android.support.v7.widget.ActionBarOverlayLayout.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout.this.f803c = null;
                ActionBarOverlayLayout.this.f802b = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout.this.f803c = null;
                ActionBarOverlayLayout.this.f802b = false;
            }
        };
        this.A = new Runnable() { // from class: android.support.v7.widget.ActionBarOverlayLayout.2
            @Override // java.lang.Runnable
            public void run() {
                ActionBarOverlayLayout.this.c();
                ActionBarOverlayLayout.this.f803c = ActionBarOverlayLayout.this.f801a.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener(ActionBarOverlayLayout.this.f804d);
            }
        };
        this.B = new Runnable() { // from class: android.support.v7.widget.ActionBarOverlayLayout.3
            @Override // java.lang.Runnable
            public void run() {
                ActionBarOverlayLayout.this.c();
                ActionBarOverlayLayout.this.f803c = ActionBarOverlayLayout.this.f801a.animate().translationY(-ActionBarOverlayLayout.this.f801a.getHeight()).setListener(ActionBarOverlayLayout.this.f804d);
            }
        };
        a(context);
        this.C = new android.support.v4.j.o(this);
    }

    private void a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(e);
        boolean z = false;
        this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.j = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.j == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.k = z;
        this.z = new OverScroller(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public void setActionBarVisibilityCallback(a aVar) {
        this.x = aVar;
        if (getWindowToken() != null) {
            this.x.a(this.g);
            if (this.p == 0) {
                return;
            }
            onWindowSystemUiVisibilityChanged(this.p);
            android.support.v4.j.s.i(this);
        }
    }

    public void setOverlayMode(boolean z) {
        this.l = z;
        this.k = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.m = z;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        android.support.v4.j.s.i(this);
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        b();
        int i2 = this.p ^ i;
        this.p = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        if (this.x != null) {
            this.x.a(!z);
            if (z2 || !z) {
                this.x.a();
            } else {
                this.x.b();
            }
        }
        if ((i2 & 256) == 0 || this.x == null) {
            return;
        }
        android.support.v4.j.s.i(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.g = i;
        if (this.x != null) {
            this.x.a(i);
        }
    }

    private boolean a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        b bVar = (b) view.getLayoutParams();
        if (!z || bVar.leftMargin == rect.left) {
            z5 = false;
        } else {
            bVar.leftMargin = rect.left;
            z5 = true;
        }
        if (z2 && bVar.topMargin != rect.top) {
            bVar.topMargin = rect.top;
            z5 = true;
        }
        if (z4 && bVar.rightMargin != rect.right) {
            bVar.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || bVar.bottomMargin == rect.bottom) {
            return z5;
        }
        bVar.bottomMargin = rect.bottom;
        return true;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        b();
        int h = android.support.v4.j.s.h(this) & 256;
        boolean a2 = a(this.f801a, rect, true, true, false, true);
        this.t.set(rect);
        as.a(this, this.t, this.q);
        if (!this.u.equals(this.t)) {
            this.u.set(this.t);
            a2 = true;
        }
        if (!this.r.equals(this.q)) {
            this.r.set(this.q);
            a2 = true;
        }
        if (a2) {
            requestLayout();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public b generateDefaultLayoutParams() {
        return new b(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        b();
        measureChildWithMargins(this.f801a, i, 0, i2, 0);
        b bVar = (b) this.f801a.getLayoutParams();
        int max = Math.max(0, this.f801a.getMeasuredWidth() + bVar.leftMargin + bVar.rightMargin);
        int max2 = Math.max(0, this.f801a.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f801a.getMeasuredState());
        boolean z = (android.support.v4.j.s.h(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f;
            if (this.m && this.f801a.getTabContainer() != null) {
                measuredHeight += this.f;
            }
        } else {
            measuredHeight = this.f801a.getVisibility() != 8 ? this.f801a.getMeasuredHeight() : 0;
        }
        this.s.set(this.q);
        this.v.set(this.t);
        if (!this.l && !z) {
            this.s.top += measuredHeight;
            this.s.bottom += 0;
        } else {
            this.v.top += measuredHeight;
            this.v.bottom += 0;
        }
        a(this.h, this.s, true, true, true, true);
        if (!this.w.equals(this.v)) {
            this.w.set(this.v);
            this.h.a(this.v);
        }
        measureChildWithMargins(this.h, i, 0, i2, 0);
        b bVar2 = (b) this.h.getLayoutParams();
        int max3 = Math.max(max, this.h.getMeasuredWidth() + bVar2.leftMargin + bVar2.rightMargin);
        int max4 = Math.max(max2, this.h.getMeasuredHeight() + bVar2.topMargin + bVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
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
                b bVar = (b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = bVar.leftMargin + paddingLeft;
                int i7 = bVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.j == null || this.k) {
            return;
        }
        int bottom = this.f801a.getVisibility() == 0 ? (int) (this.f801a.getBottom() + this.f801a.getTranslationY() + 0.5f) : 0;
        this.j.setBounds(0, bottom, getWidth(), this.j.getIntrinsicHeight() + bottom);
        this.j.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.j.m
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f801a.getVisibility() != 0) {
            return false;
        }
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.j.m
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.C.a(view, view2, i);
        this.o = getActionBarHideOffset();
        c();
        if (this.x != null) {
            this.x.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.j.m
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.o += i2;
        setActionBarHideOffset(this.o);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.j.m
    public void onStopNestedScroll(View view) {
        if (this.n && !this.f802b) {
            if (this.o <= this.f801a.getHeight()) {
                d();
            } else {
                e();
            }
        }
        if (this.x != null) {
            this.x.d();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.j.m
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.n || !z) {
            return false;
        }
        if (a(f, f2)) {
            g();
        } else {
            f();
        }
        this.f802b = true;
        return true;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.C.a();
    }

    void b() {
        if (this.h == null) {
            this.h = (ContentFrameLayout) findViewById(a.f.action_bar_activity_content);
            this.f801a = (ActionBarContainer) findViewById(a.f.action_bar_container);
            this.i = a(findViewById(a.f.action_bar));
        }
    }

    private t a(View view) {
        if (view instanceof t) {
            return (t) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.n) {
            this.n = z;
            if (z) {
                return;
            }
            c();
            setActionBarHideOffset(0);
        }
    }

    public int getActionBarHideOffset() {
        if (this.f801a != null) {
            return -((int) this.f801a.getTranslationY());
        }
        return 0;
    }

    public void setActionBarHideOffset(int i) {
        c();
        this.f801a.setTranslationY(-Math.max(0, Math.min(i, this.f801a.getHeight())));
    }

    void c() {
        removeCallbacks(this.A);
        removeCallbacks(this.B);
        if (this.f803c != null) {
            this.f803c.cancel();
        }
    }

    private void d() {
        c();
        postDelayed(this.A, 600L);
    }

    private void e() {
        c();
        postDelayed(this.B, 600L);
    }

    private void f() {
        c();
        this.A.run();
    }

    private void g() {
        c();
        this.B.run();
    }

    private boolean a(float f, float f2) {
        this.z.fling(0, 0, 0, (int) f2, 0, 0, PKIFailureInfo.systemUnavail, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return this.z.getFinalY() > this.f801a.getHeight();
    }

    public void setWindowCallback(Window.Callback callback) {
        b();
        this.i.a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        b();
        this.i.a(charSequence);
    }

    public CharSequence getTitle() {
        b();
        return this.i.a();
    }

    public void setIcon(int i) {
        b();
        this.i.a(i);
    }

    public void setIcon(Drawable drawable) {
        b();
        this.i.a(drawable);
    }

    public void setLogo(int i) {
        b();
        this.i.b(i);
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(int i, int i2) {
            super(i, i2);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
