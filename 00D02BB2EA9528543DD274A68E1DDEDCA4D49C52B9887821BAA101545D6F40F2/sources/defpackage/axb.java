package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState;
/* compiled from: PG */
/* renamed from: axb  reason: default package */
/* loaded from: classes.dex */
public class axb extends ViewGroup implements no, nn, nl {
    private static final int[] D = {16842766};
    private boolean A;
    private int B;
    private final DecelerateInterpolator C;
    private int E;
    private Animation F;
    private Animation G;
    private Animation H;
    private Animation I;
    private Animation J;
    private int K;
    private awy L;
    private boolean M;
    private Animation.AnimationListener N;
    private final Animation O;
    private final Animation P;
    awz a;
    boolean b;
    int c;
    boolean d;
    awl e;
    protected int f;
    float g;
    public int h;
    public int i;
    int j;
    awp k;
    boolean l;
    boolean m;
    private View n;
    private int o;
    private float p;
    private float q;
    private final np r;
    private final nm s;
    private final int[] t;
    private final int[] u;
    private final int[] v;
    private boolean w;
    private int x;
    private float y;
    private float z;

    public axb(Context context) {
        this(context, null);
    }

    private final void m(boolean z, boolean z2) {
        if (this.b != z) {
            this.l = z2;
            o();
            this.b = z;
            if (z) {
                int i = this.c;
                Animation.AnimationListener animationListener = this.N;
                this.f = i;
                this.O.reset();
                this.O.setDuration(200L);
                this.O.setInterpolator(this.C);
                if (animationListener != null) {
                    this.e.setAnimationListener(animationListener);
                }
                this.e.clearAnimation();
                this.e.startAnimation(this.O);
                return;
            }
            i(this.N);
        }
    }

    private final Animation n(int i, int i2) {
        awt awtVar = new awt(this, i, i2);
        awtVar.setDuration(300L);
        this.e.setAnimationListener(null);
        this.e.clearAnimation();
        this.e.startAnimation(awtVar);
        return awtVar;
    }

    private final void o() {
        if (this.n == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.e)) {
                    this.n = childAt;
                    return;
                }
            }
        }
    }

    private final void p(float f) {
        this.k.b(true);
        float min = Math.min(1.0f, Math.abs(f / this.p));
        double d = min;
        Double.isNaN(d);
        float max = (((float) Math.max(d - 0.4d, (double) dcyn.a)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.p;
        int i = this.j;
        if (i <= 0) {
            i = this.m ? this.i - this.h : this.i;
        }
        float f2 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f2 + f2) / f2) / 4.0f;
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = (float) (max2 - pow);
        float f4 = f3 + f3;
        float f5 = f2 * f4;
        int i2 = this.h + ((int) ((f2 * min) + f5 + f5));
        if (this.e.getVisibility() != 0) {
            this.e.setVisibility(0);
        }
        if (!this.d) {
            this.e.setScaleX(1.0f);
            this.e.setScaleY(1.0f);
        }
        if (this.d) {
            h(Math.min(1.0f, f / this.p));
        }
        if (f < this.p) {
            if (this.k.getAlpha() > 76 && !t(this.H)) {
                this.H = n(this.k.getAlpha(), 76);
            }
        } else if (this.k.getAlpha() < 255 && !t(this.I)) {
            this.I = n(this.k.getAlpha(), 255);
        }
        this.k.e(Math.min(0.8f, max * 0.8f));
        this.k.c(Math.min(1.0f, max));
        awp awpVar = this.k;
        awpVar.a.g = (((max * 0.4f) - 0.25f) + f4 + f4) * 0.5f;
        awpVar.invalidateSelf();
        l(i2 - this.c);
    }

    private final void q(float f) {
        if (f > this.p) {
            m(true, true);
            return;
        }
        this.b = false;
        this.k.e(0.0f);
        awu awuVar = !this.d ? new awu(this) : null;
        int i = this.c;
        if (this.d) {
            this.f = i;
            this.g = this.e.getScaleX();
            awx awxVar = new awx(this);
            this.J = awxVar;
            awxVar.setDuration(150L);
            if (awuVar != null) {
                this.e.setAnimationListener(awuVar);
            }
            this.e.clearAnimation();
            this.e.startAnimation(this.J);
        } else {
            this.f = i;
            this.P.reset();
            this.P.setDuration(200L);
            this.P.setInterpolator(this.C);
            if (awuVar != null) {
                this.e.setAnimationListener(awuVar);
            }
            this.e.clearAnimation();
            this.e.startAnimation(this.P);
        }
        this.k.b(false);
    }

    private final void r(float f) {
        float f2 = this.z;
        float f3 = this.o;
        if (f - f2 <= f3 || this.A) {
            return;
        }
        this.y = f2 + f3;
        this.A = true;
        this.k.setAlpha(76);
    }

    private final void s(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.B) {
            this.B = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private static final boolean t(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    @Override // defpackage.nn
    public final boolean a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
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

    @Override // defpackage.nn
    public final void d(View view, int i, int i2, int i3, int i4, int i5) {
        f(view, i, i2, i3, i4, i5, this.v);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.s.l(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.s.m(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.s.j(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.s.h(i, i2, i3, i4, iArr);
    }

    @Override // defpackage.nn
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // defpackage.no
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (i5 != 0) {
            return;
        }
        int i7 = iArr[1];
        this.s.i(i, i2, i3, i4, this.u, 0, iArr);
        int i8 = i4 - (iArr[1] - i7);
        if (i8 == 0) {
            i8 = this.u[1] + i4;
            i6 = 0;
        } else {
            i6 = i8;
        }
        if (i8 >= 0 || j()) {
            return;
        }
        float abs = this.q + Math.abs(i8);
        this.q = abs;
        p(abs);
        iArr[1] = iArr[1] + i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.e.clearAnimation();
        this.k.stop();
        this.e.setVisibility(8);
        this.e.getBackground().setAlpha(255);
        this.k.setAlpha(255);
        if (this.d) {
            h(0.0f);
        } else {
            l(this.h - this.c);
        }
        this.c = this.e.getTop();
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.E;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.r.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(float f) {
        this.e.setScaleX(f);
        this.e.setScaleY(f);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.s.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(Animation.AnimationListener animationListener) {
        aws awsVar = new aws(this);
        this.G = awsVar;
        awsVar.setDuration(150L);
        this.e.setAnimationListener(animationListener);
        this.e.clearAnimation();
        this.e.startAnimation(this.G);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.s.a;
    }

    public boolean j() {
        awy awyVar = this.L;
        if (awyVar != null) {
            return awyVar.a();
        }
        View view = this.n;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(float f) {
        int i = this.f;
        l((i + ((int) ((this.h - i) * f))) - this.e.getTop());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(int i) {
        this.e.bringToFront();
        od.ag(this.e, i);
        this.c = this.e.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        o();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || j() || this.b || this.w) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.B;
                    if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                        return false;
                    }
                    r(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        s(motionEvent);
                    }
                }
            }
            this.A = false;
            this.B = -1;
        } else {
            l(this.h - this.e.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.B = pointerId;
            this.A = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.z = motionEvent.getY(findPointerIndex2);
        }
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.n == null) {
            o();
        }
        View view = this.n;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.e.getMeasuredWidth();
        int measuredHeight2 = this.e.getMeasuredHeight();
        awl awlVar = this.e;
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.c;
        awlVar.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.n == null) {
            o();
        }
        View view = this.n;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.e.measure(View.MeasureSpec.makeMeasureSpec(this.K, 1073741824), View.MeasureSpec.makeMeasureSpec(this.K, 1073741824));
        this.E = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.e) {
                this.E = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        float f;
        if (i2 > 0) {
            float f2 = this.q;
            if (f2 > 0.0f) {
                float f3 = i2;
                if (f3 > f2) {
                    iArr[1] = (int) f2;
                    this.q = 0.0f;
                    f = 0.0f;
                } else {
                    f = f2 - f3;
                    this.q = f;
                    iArr[1] = i2;
                }
                p(f);
            }
        }
        if (this.m && i2 > 0 && this.q == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.e.setVisibility(8);
        }
        int[] iArr2 = this.t;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        f(view, i, i2, i3, i4, 0, this.v);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.r.d(i);
        startNestedScroll(i & 2);
        this.q = 0.0f;
        this.w = true;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        SwipeRefreshLayout$SavedState swipeRefreshLayout$SavedState = (SwipeRefreshLayout$SavedState) parcelable;
        super.onRestoreInstanceState(swipeRefreshLayout$SavedState.getSuperState());
        setRefreshing(swipeRefreshLayout$SavedState.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new SwipeRefreshLayout$SavedState(super.onSaveInstanceState(), this.b);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.b && (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.r.e();
        this.w = false;
        float f = this.q;
        if (f > 0.0f) {
            q(f);
            this.q = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || j() || this.b || this.w) {
            return false;
        }
        if (actionMasked == 0) {
            this.B = motionEvent.getPointerId(0);
            this.A = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.B);
            if (findPointerIndex < 0) {
                return false;
            }
            if (this.A) {
                float y = motionEvent.getY(findPointerIndex);
                float f = this.y;
                this.A = false;
                q((y - f) * 0.5f);
            }
            this.B = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.B);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            r(y2);
            if (this.A) {
                float f2 = (y2 - this.y) * 0.5f;
                if (f2 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                p(f2);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    return false;
                }
                this.B = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                s(motionEvent);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (!this.M || (view = this.n) == null || od.Z(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        o();
        awp awpVar = this.k;
        awpVar.a.a(iArr);
        awpVar.a.b(0);
        awpVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = akm.c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.p = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            g();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.M = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.s.a(z);
    }

    public void setOnChildScrollUpCallback(awy awyVar) {
        this.L = awyVar;
    }

    public void setOnRefreshListener(awz awzVar) {
        this.a = awzVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.e.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(akm.c(getContext(), i));
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.i = i;
        this.d = z;
        this.e.invalidate();
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.d = z;
        this.h = i;
        this.i = i2;
        this.m = true;
        g();
        this.b = false;
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.K = (int) (displayMetrics.density * 56.0f);
            } else {
                this.K = (int) (displayMetrics.density * 40.0f);
            }
            this.e.setImageDrawable(null);
            this.k.a(i);
            this.e.setImageDrawable(this.k);
        }
    }

    public void setSlingshotDistance(int i) {
        this.j = i;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.s.d(i);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.s.f();
    }

    public axb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.p = -1.0f;
        this.t = new int[2];
        this.u = new int[2];
        this.v = new int[2];
        this.B = -1;
        this.E = -1;
        this.N = new awq(this);
        this.O = new awv(this);
        this.P = new aww(this);
        this.o = ViewConfiguration.get(context).getScaledTouchSlop();
        this.x = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.C = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.K = (int) (displayMetrics.density * 40.0f);
        this.e = new awl(getContext());
        awp awpVar = new awp(getContext());
        this.k = awpVar;
        awpVar.a(1);
        this.e.setImageDrawable(this.k);
        this.e.setVisibility(8);
        addView(this.e);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.i = i;
        this.p = i;
        this.r = new np();
        this.s = new nm(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.K;
        this.c = i2;
        this.h = i2;
        k(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    public void setRefreshing(boolean z) {
        if (z) {
            if (!this.b) {
                this.b = true;
                l((!this.m ? this.i + this.h : this.i) - this.c);
                this.l = false;
                Animation.AnimationListener animationListener = this.N;
                this.e.setVisibility(0);
                this.k.setAlpha(255);
                awr awrVar = new awr(this);
                this.F = awrVar;
                awrVar.setDuration(this.x);
                if (animationListener != null) {
                    this.e.setAnimationListener(animationListener);
                }
                this.e.clearAnimation();
                this.e.startAnimation(this.F);
                return;
            }
            z = true;
        }
        m(z, false);
    }
}
