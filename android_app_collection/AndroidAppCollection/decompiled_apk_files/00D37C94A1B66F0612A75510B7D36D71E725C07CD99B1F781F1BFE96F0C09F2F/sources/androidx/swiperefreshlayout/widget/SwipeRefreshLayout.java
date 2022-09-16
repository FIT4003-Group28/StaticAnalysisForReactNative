package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements kg, kf, kd, kh {
    private static final String k = "SwipeRefreshLayout";
    private static final int[] l = {16842766};
    private int A;
    private final DecelerateInterpolator B;
    private int C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    private int H;
    private Animation.AnimationListener I;

    /* renamed from: J  reason: collision with root package name */
    private final Animation f72J;
    private final Animation K;
    public bmp a;
    public boolean b;
    public int c;
    public bmd d;
    public int e;
    public int f;
    public int g;
    public bmh h;
    public boolean i;
    public boolean j;
    private View m;
    private int n;
    private float o;
    private float p;
    private final ki q;
    private final ke r;
    private final int[] s;
    private final int[] t;
    private final int[] u;
    private boolean v;
    private int w;
    private float x;
    private float y;
    private boolean z;

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private final Animation p(int i, int i2) {
        bml bmlVar = new bml(this, i, i2);
        bmlVar.setDuration(300L);
        bmd bmdVar = this.d;
        bmdVar.a = null;
        bmdVar.clearAnimation();
        this.d.startAnimation(bmlVar);
        return bmlVar;
    }

    private final void q() {
        if (this.m == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.d)) {
                    this.m = childAt;
                    return;
                }
            }
        }
    }

    private final void r(float f) {
        if (f > this.o) {
            u(true, true);
            return;
        }
        this.b = false;
        this.h.d(0.0f);
        bmm bmmVar = new bmm(this);
        this.e = this.c;
        this.K.reset();
        this.K.setDuration(200L);
        this.K.setInterpolator(this.B);
        bmd bmdVar = this.d;
        bmdVar.a = bmmVar;
        bmdVar.clearAnimation();
        this.d.startAnimation(this.K);
        this.h.b(false);
    }

    private final void s(float f) {
        this.h.b(true);
        float min = Math.min(1.0f, Math.abs(f / this.o));
        double d = min;
        Double.isNaN(d);
        float max = (((float) Math.max(d - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f);
        float f2 = this.o;
        float f3 = this.g;
        double max2 = Math.max(0.0f, Math.min(abs - f2, f3 + f3) / f3) / 4.0f;
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f4 = (float) (max2 - pow);
        float f5 = f4 + f4;
        float f6 = f3 * f5;
        int i = this.f + ((int) ((f3 * min) + f6 + f6));
        if (this.d.getVisibility() != 0) {
            this.d.setVisibility(0);
        }
        this.d.setScaleX(1.0f);
        this.d.setScaleY(1.0f);
        if (f < this.o) {
            if (this.h.getAlpha() > 76 && !w(this.F)) {
                this.F = p(this.h.getAlpha(), 76);
            }
        } else if (this.h.getAlpha() < 255 && !w(this.G)) {
            this.G = p(this.h.getAlpha(), PrivateKeyType.INVALID);
        }
        this.h.d(Math.min(0.8f, max * 0.8f));
        this.h.c(Math.min(1.0f, max));
        bmh bmhVar = this.h;
        bmhVar.a.g = (((max * 0.4f) - 0.25f) + f5 + f5) * 0.5f;
        bmhVar.invalidateSelf();
        m(i - this.c);
    }

    private final void t(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A) {
            this.A = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private final void u(boolean z, boolean z2) {
        if (this.b != z) {
            this.i = z2;
            q();
            this.b = z;
            if (z) {
                int i = this.c;
                Animation.AnimationListener animationListener = this.I;
                this.e = i;
                this.f72J.reset();
                this.f72J.setDuration(200L);
                this.f72J.setInterpolator(this.B);
                if (animationListener != null) {
                    this.d.a = animationListener;
                }
                this.d.clearAnimation();
                this.d.startAnimation(this.f72J);
                return;
            }
            n(this.I);
        }
    }

    private final void v(float f) {
        float f2 = this.y;
        float f3 = this.n;
        if (f - f2 <= f3 || this.z) {
            return;
        }
        this.x = f2 + f3;
        this.z = true;
        this.h.setAlpha(76);
    }

    private static final boolean w(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    @Override // defpackage.kf
    public final void c(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.kf
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.r.d(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.r.e(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.r.f(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.r.h(i, i2, i3, i4, iArr);
    }

    @Override // defpackage.kf
    public final boolean e(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // defpackage.kg
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (i5 != 0) {
            return;
        }
        int i7 = iArr[1];
        this.r.i(i, i2, i3, i4, this.t, 0, iArr);
        int i8 = i4 - (iArr[1] - i7);
        if (i8 == 0) {
            i8 = this.t[1] + i4;
            i6 = 0;
        } else {
            i6 = i8;
        }
        if (i8 >= 0 || o()) {
            return;
        }
        float abs = this.p + Math.abs(i8);
        this.p = abs;
        s(abs);
        iArr[1] = iArr[1] + i6;
    }

    public final void g(float f) {
        int i = this.e;
        m((i + ((int) ((this.f - i) * f))) - this.d.getTop());
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.C;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.q.a();
    }

    public final void h() {
        this.d.clearAnimation();
        this.h.stop();
        this.d.setVisibility(8);
        this.d.getBackground().setAlpha(PrivateKeyType.INVALID);
        this.h.setAlpha(PrivateKeyType.INVALID);
        m(this.f - this.c);
        this.c = this.d.getTop();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.r.j();
    }

    public final void i(float f) {
        this.d.setScaleX(f);
        this.d.setScaleY(f);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.r.a;
    }

    public final void j(int... iArr) {
        q();
        bmh bmhVar = this.h;
        bmhVar.a.c(iArr);
        bmhVar.a.h();
        bmhVar.invalidateSelf();
    }

    public final void k(int i) {
        this.d.setBackgroundColor(i);
    }

    @Override // defpackage.kf
    public final void ko(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // defpackage.kf
    public final void kp(View view, int i, int i2, int i3, int i4, int i5) {
        f(view, i, i2, i3, i4, i5, this.u);
    }

    public final void m(int i) {
        this.d.bringToFront();
        lj.E(this.d, i);
        this.c = this.d.getTop();
    }

    public final void n(Animation.AnimationListener animationListener) {
        bmk bmkVar = new bmk(this);
        this.E = bmkVar;
        bmkVar.setDuration(150L);
        bmd bmdVar = this.d;
        bmdVar.a = animationListener;
        bmdVar.clearAnimation();
        this.d.startAnimation(this.E);
    }

    public final boolean o() {
        View view = this.m;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        q();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || o() || this.b || this.v) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.A;
                    if (i == -1) {
                        Log.e(k, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    v(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        t(motionEvent);
                    }
                }
            }
            this.z = false;
            this.A = -1;
        } else {
            m(this.f - this.d.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.A = pointerId;
            this.z = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.y = motionEvent.getY(findPointerIndex2);
        }
        return this.z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.m == null) {
            q();
        }
        View view = this.m;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight();
        bmd bmdVar = this.d;
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.c;
        bmdVar.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m == null) {
            q();
        }
        View view = this.m;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(this.H, 1073741824), View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.C = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.d) {
                this.C = i3;
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
        if (i2 > 0) {
            float f = this.p;
            float f2 = 0.0f;
            if (f > 0.0f) {
                float f3 = i2;
                if (f3 > f) {
                    iArr[1] = (int) f;
                    this.p = 0.0f;
                } else {
                    f2 = f - f3;
                    this.p = f2;
                    iArr[1] = i2;
                }
                s(f2);
            }
        }
        int[] iArr2 = this.s;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        f(view, i, i2, i3, i4, 0, this.u);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.q.d(i);
        startNestedScroll(i & 2);
        this.p = 0.0f;
        this.v = true;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        l(savedState.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.b);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.b && (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.q.c(0);
        this.v = false;
        float f = this.p;
        if (f > 0.0f) {
            r(f);
            this.p = 0.0f;
        } else {
            post(new Runnable() { // from class: bmi
                @Override // java.lang.Runnable
                public final void run() {
                    SwipeRefreshLayout.this.h();
                }
            });
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || o() || this.b || this.v) {
            return false;
        }
        if (actionMasked == 0) {
            this.A = motionEvent.getPointerId(0);
            this.z = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.A);
            if (findPointerIndex < 0) {
                Log.e(k, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.z) {
                float y = motionEvent.getY(findPointerIndex);
                float f = this.x;
                this.z = false;
                r((y - f) * 0.5f);
            }
            this.A = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.A);
            if (findPointerIndex2 < 0) {
                Log.e(k, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            v(y2);
            if (this.z) {
                float f2 = (y2 - this.x) * 0.5f;
                if (f2 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                s(f2);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(k, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.A = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                t(motionEvent);
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            h();
        }
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.r.a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.r.l(i);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.r.b();
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new asq(9);
        final boolean a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.a = z;
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.o = -1.0f;
        this.s = new int[2];
        this.t = new int[2];
        this.u = new int[2];
        this.A = -1;
        this.C = -1;
        this.I = new bmm(this, 1);
        this.f72J = new bmn(this);
        this.K = new bmo(this);
        this.n = ViewConfiguration.get(context).getScaledTouchSlop();
        this.w = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.B = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.H = (int) (displayMetrics.density * 40.0f);
        this.d = new bmd(getContext());
        bmh bmhVar = new bmh(getContext());
        this.h = bmhVar;
        bmg bmgVar = bmhVar.a;
        float f = bmhVar.b.getDisplayMetrics().density;
        bmgVar.e(2.5f * f);
        bmgVar.p = 7.5f * f;
        bmgVar.h();
        bmgVar.q = (int) (10.0f * f);
        bmgVar.r = (int) (f * 5.0f);
        bmhVar.invalidateSelf();
        this.d.setImageDrawable(this.h);
        this.d.setVisibility(8);
        addView(this.d);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.g = i;
        this.o = i;
        this.q = new ki();
        this.r = new ke(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.H;
        this.c = i2;
        this.f = i2;
        g(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    public final void l(boolean z) {
        if (z) {
            if (!this.b) {
                this.b = true;
                m((this.g + this.f) - this.c);
                this.i = false;
                Animation.AnimationListener animationListener = this.I;
                this.d.setVisibility(0);
                this.h.setAlpha(PrivateKeyType.INVALID);
                bmj bmjVar = new bmj(this);
                this.D = bmjVar;
                bmjVar.setDuration(this.w);
                if (animationListener != null) {
                    this.d.a = animationListener;
                }
                this.d.clearAnimation();
                this.d.startAnimation(this.D);
                return;
            }
            z = true;
        }
        u(z, false);
    }
}
