package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: amy  reason: default package */
/* loaded from: classes2.dex */
public final class amy {
    private static final Interpolator w = new amv();
    public int a;
    public int b;
    public float[] c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float g;
    public int h;
    public final int i;
    public int j;
    public View k;
    private int[] m;
    private int[] n;
    private int[] o;
    private int p;
    private VelocityTracker q;
    private float r;
    private OverScroller s;
    private final amx t;
    private boolean u;
    private final ViewGroup v;
    private int l = -1;
    private final Runnable x = new amw(this);

    private amy(Context context, ViewGroup viewGroup, amx amxVar) {
        if (amxVar != null) {
            this.v = viewGroup;
            this.t = amxVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.i = i;
            this.h = i;
            this.b = viewConfiguration.getScaledTouchSlop();
            this.r = viewConfiguration.getScaledMaximumFlingVelocity();
            this.g = viewConfiguration.getScaledMinimumFlingVelocity();
            this.s = new OverScroller(context, w);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    public static amy a(ViewGroup viewGroup, amx amxVar) {
        return new amy(viewGroup.getContext(), viewGroup, amxVar);
    }

    public static amy m(ViewGroup viewGroup, amx amxVar) {
        amy a = a(viewGroup, amxVar);
        a.b = a.b;
        return a;
    }

    private final boolean n(int i, int i2, int i3, int i4) {
        int i5;
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.k.getLeft();
        int top = this.k.getTop();
        int i6 = i - left;
        int i7 = i2 - top;
        if (i6 != 0) {
            i5 = i6;
        } else if (i7 == 0) {
            this.s.abortAnimation();
            g(0);
            return false;
        } else {
            i5 = 0;
        }
        View view = this.k;
        int z = z(i3, (int) this.g, (int) this.r);
        int z2 = z(i4, (int) this.g, (int) this.r);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(z);
        int abs4 = Math.abs(z2);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (z != 0) {
            f = abs3;
            f2 = i8;
        } else {
            f = abs;
            f2 = i9;
        }
        float f5 = f / f2;
        if (z2 != 0) {
            f3 = abs4;
            f4 = i8;
        } else {
            f3 = abs2;
            f4 = i9;
        }
        this.s.startScroll(left, top, i5, i7, (int) ((o(i5, z, this.t.e(view)) * f5) + (o(i7, z2, this.t.i()) * (f3 / f4))));
        g(2);
        return true;
    }

    private final int o(int i, int i2, int i3) {
        int width;
        if (i == 0) {
            return 0;
        }
        float width2 = this.v.getWidth() / 2;
        float sin = width2 + (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * width2);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    private final void p(float f, float f2) {
        this.u = true;
        this.t.c(this.k, f, f2);
        this.u = false;
        if (this.a == 1) {
            g(0);
        }
    }

    private final void q(int i) {
        if (this.c == null || !f(i)) {
            return;
        }
        this.c[i] = 0.0f;
        this.d[i] = 0.0f;
        this.e[i] = 0.0f;
        this.f[i] = 0.0f;
        this.m[i] = 0;
        this.n[i] = 0;
        this.o[i] = 0;
        this.p = ((1 << i) ^ (-1)) & this.p;
    }

    private final void r(float f, float f2, int i) {
        float[] fArr = this.c;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.d;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.e;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.m;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.n;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.o;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.c = fArr2;
            this.d = fArr3;
            this.e = fArr4;
            this.f = fArr5;
            this.m = iArr;
            this.n = iArr2;
            this.o = iArr3;
        }
        float[] fArr9 = this.c;
        this.e[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.d;
        this.f[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.m;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.v.getLeft() + this.h) {
            i2 = 1;
        }
        if (i5 < this.v.getTop() + this.h) {
            i2 |= 4;
        }
        if (i4 > this.v.getRight() - this.h) {
            i2 |= 2;
        }
        if (i5 > this.v.getBottom() - this.h) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.p |= 1 << i;
    }

    private final void s(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (x(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.e[pointerId] = x;
                this.f[pointerId] = y;
            }
        }
    }

    private final void t(float f, float f2, int i) {
        boolean u = u(f, f2, i, 1);
        if (u(f2, f, i, 4)) {
            u |= true;
        }
        if (u(f, f2, i, 2)) {
            boolean z = u ? 1 : 0;
            char c = u ? 1 : 0;
            u = z | true;
        }
        if (u(f2, f, i, 8)) {
            boolean z2 = u ? 1 : 0;
            char c2 = u ? 1 : 0;
            u = z2 | true;
        }
        if (u) {
            int[] iArr = this.n;
            iArr[i] = iArr[i] | (u ? 1 : 0);
            amx amxVar = this.t;
            int i2 = u ? 1 : 0;
            int i3 = u ? 1 : 0;
            int i4 = u ? 1 : 0;
            amxVar.d(i2, i);
        }
    }

    private final boolean u(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.m[i] & i2) == i2 && (this.j & i2) != 0 && (this.o[i] & i2) != i2 && (this.n[i] & i2) != i2) {
            float f3 = this.b;
            if (abs > f3 || abs2 > f3) {
                if (abs >= abs2 * 0.5f || !this.t.j()) {
                    if ((this.n[i] & i2) == 0 && abs > this.b) {
                        return true;
                    }
                } else {
                    int[] iArr = this.o;
                    iArr[i] = iArr[i] | i2;
                    return false;
                }
            }
        }
        return false;
    }

    private final boolean v(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        int e = this.t.e(view);
        int i = this.t.i();
        if (e <= 0 || i <= 0) {
            return e > 0 ? Math.abs(f) > ((float) this.b) : i > 0 && Math.abs(f2) > ((float) this.b);
        }
        int i2 = this.b;
        return (f * f) + (f2 * f2) > ((float) (i2 * i2));
    }

    private final void w() {
        this.q.computeCurrentVelocity(1000, this.r);
        p(y(this.q.getXVelocity(this.l), this.g, this.r), y(this.q.getYVelocity(this.l), this.g, this.r));
    }

    private final boolean x(int i) {
        if (!f(i)) {
            String str = "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.";
            return false;
        }
        return true;
    }

    private static final float y(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    private static final int z(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    public final void b(View view, int i) {
        if (view.getParent() == this.v) {
            this.k = view;
            this.l = i;
            this.t.b(view, i);
            g(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.v + ")");
    }

    public final void c() {
        this.l = -1;
        float[] fArr = this.c;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.d, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.m, 0);
            Arrays.fill(this.n, 0);
            Arrays.fill(this.o, 0);
            this.p = 0;
        }
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.q = null;
        }
    }

    public final boolean d(View view, int i, int i2) {
        this.k = view;
        this.l = -1;
        boolean n = n(i, i2, 0, 0);
        if (n || this.a != 0 || this.k == null) {
            return n;
        }
        this.k = null;
        return false;
    }

    public final boolean e(int i, int i2) {
        if (!this.u) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return n(i, i2, (int) this.q.getXVelocity(this.l), (int) this.q.getYVelocity(this.l));
    }

    public final boolean f(int i) {
        return ((1 << i) & this.p) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i) {
        this.v.removeCallbacks(this.x);
        if (this.a != i) {
            this.a = i;
            this.t.a(i);
            if (this.a != 0) {
                return;
            }
            this.k = null;
        }
    }

    final boolean h(View view, int i) {
        if (view == this.k && this.l == i) {
            return true;
        }
        if (view == null || !this.t.f(view, i)) {
            return false;
        }
        this.l = i;
        b(view, i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
        if (r12 != r11) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amy.i(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
        if (r9.l == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
        w();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amy.j(android.view.MotionEvent):void");
    }

    public final View k(int i, int i2) {
        int childCount = this.v.getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                View childAt = this.v.getChildAt(childCount);
                if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                    return childAt;
                }
            } else {
                return null;
            }
        }
    }

    public final boolean l() {
        if (this.a == 2) {
            boolean computeScrollOffset = this.s.computeScrollOffset();
            int currX = this.s.getCurrX();
            int currY = this.s.getCurrY();
            int left = currX - this.k.getLeft();
            int top = currY - this.k.getTop();
            if (left != 0) {
                od.ah(this.k, left);
            }
            if (top != 0) {
                od.ag(this.k, top);
            }
            if (left != 0 || top != 0) {
                this.t.l(this.k, currX, currY);
            }
            if (computeScrollOffset) {
                if (currX == this.s.getFinalX() && currY == this.s.getFinalY()) {
                    this.s.abortAnimation();
                }
            }
            this.v.post(this.x);
        }
        return this.a == 2;
    }
}
