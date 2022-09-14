package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
/* compiled from: PG */
/* renamed from: jet  reason: default package */
/* loaded from: classes.dex */
public abstract class jet extends ViewGroup {
    private static final Interpolator e = new jes();
    public int A;
    protected final Scroller B;
    private final int[] a;
    private final int b;
    private float c;
    private boolean d;
    public final float[] t;
    protected final int u;
    public final int v;
    @dzsi
    public VelocityTracker w;
    protected boolean x;
    protected boolean y;
    public boolean z;

    public jet(Context context) {
        super(context);
        this.t = new float[]{0.0f, 0.0f};
        this.a = new int[]{-2147483647, Integer.MAX_VALUE};
        this.c = 0.0f;
        this.x = false;
        this.y = false;
        this.z = false;
        this.d = false;
        this.A = 500;
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.v = viewConfiguration.getScaledMaximumFlingVelocity();
        this.B = new Scroller(context2, e);
    }

    private final int a(int i) {
        int[] iArr = this.a;
        int i2 = iArr[0];
        if (i < i2) {
            return i2;
        }
        int i3 = iArr[1];
        return i > i3 ? i3 : i;
    }

    protected void J() {
        throw null;
    }

    protected void K() {
        throw null;
    }

    protected void O(int i) {
        throw null;
    }

    public final boolean Q(MotionEvent motionEvent) {
        if (this.x) {
            this.x = false;
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            R(motionEvent);
            if (!this.B.isFinished()) {
                S();
                return true;
            }
            this.z = true;
        } else if (action == 2) {
            float x = motionEvent.getX() - this.t[0];
            float y = motionEvent.getY() - this.t[1];
            int i = this.u;
            float f = i;
            boolean z = x > f || x < ((float) (-i));
            if ((y > f || y < (-i)) && !z) {
                R(motionEvent);
                S();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void R(MotionEvent motionEvent) {
        this.t[0] = motionEvent.getX();
        this.t[1] = motionEvent.getY();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void S() {
        if (!this.x && this.B.isFinished()) {
            J();
        }
        this.x = true;
        this.c = 0.0f;
        this.B.abortAnimation();
    }

    public final int U() {
        return getScrollY();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void V(int i, int i2) {
        super.scrollTo(i, i2);
        if (!this.d) {
            this.B.abortAnimation();
        }
        O(i2);
    }

    public final void W(int i, boolean z, int i2) {
        if (z) {
            i = a(i);
        }
        this.B.startScroll(0, getScrollY(), 0, i - getScrollY(), i2);
        invalidate();
    }

    public int X() {
        return this.A;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.B.computeScrollOffset()) {
            int currY = this.B.getCurrY();
            this.d = true;
            V(0, currY);
            this.d = false;
            invalidate();
            float f = this.c;
            if (f != 0.0f) {
                x(f);
                this.c = 0.0f;
            }
            if (currY != this.B.getFinalY()) {
                return;
            }
            this.B.abortAnimation();
            if (!this.y) {
                return;
            }
            K();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return Q(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        if (r0 != 3) goto L21;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            android.view.VelocityTracker r1 = r5.w
            if (r1 != 0) goto Le
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r5.w = r1
        Le:
            android.view.VelocityTracker r1 = r5.w
            r1.addMovement(r6)
            boolean r1 = r5.x
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L2e
            boolean r6 = r5.Q(r6)
            if (r6 == 0) goto L20
            return r3
        L20:
            if (r0 != r3) goto L2d
            boolean r6 = r5.z
            if (r6 == 0) goto L2d
            r5.z = r2
            boolean r6 = r5.performClick()
            return r6
        L2d:
            return r3
        L2e:
            r1 = 3
            if (r0 == r3) goto L4d
            r4 = 2
            if (r0 == r4) goto L37
            if (r0 == r1) goto L4d
            goto L67
        L37:
            float[] r0 = r5.t
            r0 = r0[r3]
            r5.R(r6)
            float[] r6 = r5.t
            r6 = r6[r3]
            float r0 = r0 - r6
            int r6 = java.lang.Math.round(r0)
            r5.scrollBy(r2, r6)
            r5.z = r2
            goto L67
        L4d:
            r6 = 0
            if (r0 != r1) goto L51
            goto L62
        L51:
            android.view.VelocityTracker r0 = r5.w
            if (r0 == 0) goto L62
            r6 = 1000(0x3e8, float:1.401E-42)
            int r1 = r5.v
            float r1 = (float) r1
            r0.computeCurrentVelocity(r6, r1)
            float r6 = r0.getYVelocity()
            float r6 = -r6
        L62:
            r5.T(r6)
            r5.z = r2
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jet.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        V(i, a(i2));
    }

    public void setScrollLimits(int i, int i2) {
        int[] iArr = this.a;
        iArr[0] = i;
        iArr[1] = i2;
    }

    public void setSmoothScrollDurationMs(int i) {
        this.A = i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view) {
        requestDisallowInterceptTouchEvent(true);
        return super.showContextMenuForChild(view);
    }

    protected void x(float f) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void T(float f) {
        this.x = false;
        int i = this.b;
        if (f > i || f < (-i)) {
            this.c = f;
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            Scroller scroller = this.B;
            int[] iArr = this.a;
            scroller.fling(scrollX, scrollY, 0, (int) f, 0, 0, iArr[0], iArr[1]);
            invalidate();
        } else {
            x(0.0f);
        }
        VelocityTracker velocityTracker = this.w;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.w = null;
        }
    }

    public jet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = new float[]{0.0f, 0.0f};
        this.a = new int[]{-2147483647, Integer.MAX_VALUE};
        this.c = 0.0f;
        this.x = false;
        this.y = false;
        this.z = false;
        this.d = false;
        this.A = 500;
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.v = viewConfiguration.getScaledMaximumFlingVelocity();
        this.B = new Scroller(context2, e);
    }

    public jet(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = new float[]{0.0f, 0.0f};
        this.a = new int[]{-2147483647, Integer.MAX_VALUE};
        this.c = 0.0f;
        this.x = false;
        this.y = false;
        this.z = false;
        this.d = false;
        this.A = 500;
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.v = viewConfiguration.getScaledMaximumFlingVelocity();
        this.B = new Scroller(context2, e);
    }
}
