package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: clcl  reason: default package */
/* loaded from: classes5.dex */
public final class clcl extends clbg {
    private static final int x = View.MeasureSpec.makeMeasureSpec(0, 0);
    private boolean A;
    private clck B;
    private Runnable C;
    private float D;
    private boolean E;
    private Rect F;
    protected final clcj b;
    public final clci c;
    public final clbi<clck> d;
    public final Rect e;
    public View f;
    public final Rect g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    @dzsi
    public Animator l;
    public float m;
    public float n;
    public int o;
    public int p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    private final boolean y;
    private final Handler z;

    public clcl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int g(float f, float f2, float f3, int i) {
        float f4 = i;
        return (int) (((((f3 + f4) / f) * f2) - f4) - f3);
    }

    public static int l(float f, int i, int i2, int i3) {
        float f2;
        float f3 = i;
        float f4 = (f * 0.0f) - f3;
        float f5 = (i2 * f) - f3;
        if (f4 > 0.0f || f5 < i3) {
            float f6 = i3;
            if (f5 - f4 <= f6) {
                f2 = ((f5 + f4) - f6) / 2.0f;
            } else if (f4 > 0.0f) {
                return (int) f4;
            } else {
                if (f5 >= f6) {
                    return 0;
                }
                f2 = f5 - f6;
            }
            return (int) f2;
        }
        return 0;
    }

    private final void q(View view) {
        View view2 = this.f;
        boolean z = true;
        if (view2 != null && view2 != view) {
            z = false;
        }
        clbk.a(z, "ZoomView can't take a second View");
        this.f = view;
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
    }

    private final float r() {
        return e(d());
    }

    private final Rect s() {
        return new Rect(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
        q(view);
    }

    @Override // defpackage.clbg
    protected final boolean b(clbf clbfVar) {
        if (!clbfVar.c(clbd.DOUBLE_TAP) || !this.h) {
            if (clbfVar.c(clbd.DRAG, clbd.DRAG_X, clbd.DRAG_Y, clbd.ZOOM)) {
                return true;
            }
            return this.i && clbfVar.c(clbd.TOUCH);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        getChildAt(0).dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
        return true;
    }

    public final float c() {
        return this.u ? Math.min(this.m, d()) : this.m;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (!this.c.computeScrollOffset()) {
            if (!this.i) {
                return;
            }
            o(true);
            this.i = false;
            return;
        }
        clci clciVar = this.c;
        scrollBy(clciVar.getCurrX() - clciVar.a, clciVar.getCurrY() - clciVar.b);
        clciVar.a = clciVar.getCurrX();
        clciVar.b = clciVar.getCurrY();
        o(false);
        invalidate();
    }

    public final float d() {
        float width = this.e.width() / this.f.getWidth();
        float height = this.e.height() / this.f.getHeight();
        int i = this.p;
        return i != 1 ? i != 2 ? width : Math.min(width, height) : height;
    }

    public final float e(float f) {
        return Math.min(this.n, Math.max(c(), f));
    }

    public final float f() {
        View view = this.f;
        if (view != null) {
            return view.getScaleX();
        }
        return 1.0f;
    }

    public final float h(float f) {
        return (f + getScrollX()) / f();
    }

    public final float i(float f) {
        return (f + getScrollY()) / f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float j(float f) {
        return (f * f()) - getScrollX();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float k(float f) {
        return (f * f()) - getScrollY();
    }

    public final void m() {
        setZoom(this.B.a);
        clck clckVar = this.B;
        scrollTo(clckVar.b, clckVar.c);
        n();
        this.B = null;
        this.C = null;
    }

    @Override // android.view.ViewGroup
    protected final void measureChild(View view, int i, int i2) {
        int i3 = x;
        view.measure(i3, i3);
    }

    @Override // android.view.ViewGroup
    protected final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int i5 = x;
        view.measure(i5, i5);
    }

    public final void n() {
        int l = l(f(), getScrollX(), this.g.width(), this.e.width());
        int l2 = l(f(), getScrollY(), this.g.height(), this.e.height());
        this.j -= l;
        this.k -= l2;
        if (l == 0) {
            if (l2 == 0) {
                return;
            }
            l = 0;
        }
        scrollBy(l, l2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [V, java.lang.Object, clck] */
    public final void o(boolean z) {
        ?? clckVar = new clck(f(), getScrollX(), getScrollY(), z);
        clck clckVar2 = this.d.a;
        if (clckVar2 != 0 && clckVar2.equals(clckVar)) {
            return;
        }
        clbi<clck> clbiVar = this.d;
        clck clckVar3 = clbiVar.a;
        clbiVar.a = clckVar;
        Iterator<yxh> it = clbiVar.iterator();
        while (it.hasNext()) {
            yxh next = it.next();
            clck clckVar4 = clbiVar.a;
            yxn yxnVar = next.a;
            clcb clcbVar = yxnVar.c;
            if (clcbVar != null && yxnVar.d && clckVar4 != null) {
                clck clckVar5 = clckVar4;
                if (clckVar5.a > 0.0f) {
                    clcl clclVar = yxnVar.b;
                    clcbVar.setViewArea(new Rect((int) clclVar.h(-clclVar.getPaddingLeft()), (int) clclVar.i(-clclVar.getPaddingTop()), (int) clclVar.h(clclVar.e.width() + clclVar.getPaddingRight()), (int) clclVar.i(clclVar.e.height() + clclVar.getPaddingBottom())));
                    next.a.c.e(yxn.a(clckVar5.a));
                }
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() != 0) {
            q(getChildAt(0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clcl.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("s"));
        if (this.y) {
            Bundle bundle2 = bundle.getBundle("p");
            this.B = new clck(bundle2.getFloat("z"), bundle2.getInt("sx"), bundle2.getInt("sy"), true);
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("s", super.onSaveInstanceState());
        if (this.y) {
            clck clckVar = this.d.a;
            Bundle bundle2 = new Bundle();
            clck clckVar2 = clckVar;
            bundle2.putInt("sx", clckVar2.b);
            bundle2.putInt("sy", clckVar2.c);
            bundle2.putFloat("z", clckVar2.a);
            bundle.putBundle("p", bundle2);
            clck clckVar3 = this.d.a;
        }
        return bundle;
    }

    public final void p(float f, float f2, float f3, Interpolator interpolator) {
        Animator animator = this.l;
        if (animator != null) {
            animator.cancel();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setTarget(this.f);
        objectAnimator.setPropertyName("scaleX");
        objectAnimator.setFloatValues(f(), f3);
        ObjectAnimator objectAnimator2 = new ObjectAnimator();
        objectAnimator2.setTarget(this.f);
        objectAnimator2.setPropertyName("scaleY");
        objectAnimator2.setFloatValues(f(), f3);
        objectAnimator2.addUpdateListener(new clcg());
        animatorSet.playTogether(ObjectAnimator.ofInt(this, "scrollX", getScrollX(), (int) f), ObjectAnimator.ofInt(this, "scrollY", getScrollY(), (int) f2), objectAnimator, objectAnimator2);
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(interpolator);
        animatorSet.addListener(new clch(this));
        this.l = animatorSet;
        animatorSet.start();
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        this.f = null;
    }

    public void setMaxZoom(float f) {
        this.n = f;
    }

    public void setShareScroll(boolean z, boolean z2, boolean z3, boolean z4) {
        clcj clcjVar = this.b;
        int i = clcj.k;
        clcjVar.b = z;
        clcjVar.c = z2;
        clcjVar.d = z3;
        clcjVar.e = z4;
    }

    public void setStraightenVerticalScroll(boolean z) {
        this.v = z;
    }

    public void setZoom(float f) {
        setZoom(f, this.e.width() / 2, this.e.height() / 2);
    }

    public clcl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        clcj clcjVar = new clcj(this, new clbn(getContext()));
        this.b = clcjVar;
        this.z = new Handler();
        this.e = new Rect();
        this.g = new Rect();
        this.h = true;
        this.i = false;
        this.D = 1.0f;
        this.o = 0;
        this.p = 2;
        this.q = true;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.E = false;
        this.w = false;
        this.c = new clci(getContext());
        this.d = new clbi<>(new clck(1.0f, 0, 0, true));
        this.a.b = clcjVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, clcc.a, i, i);
        this.m = obtainStyledAttributes.getFloat(1, 0.5f);
        this.n = obtainStyledAttributes.getFloat(0, 64.0f);
        this.y = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
        setLayoutDirection(0);
    }

    public void setZoom(float f, float f2, float f3) {
        this.E = true;
        float f4 = f();
        int scrollX = getScrollX();
        float f5 = f();
        int scrollY = getScrollY();
        this.f.setScaleX(f);
        this.f.setScaleY(f);
        scrollBy(g(f4, f, f2, scrollX), g(f5, f, f3, scrollY));
    }
}
