package a.i.b;

import a.g.m.v;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;
/* loaded from: classes.dex */
public class c {
    private static final Interpolator w = new a();

    /* renamed from: a  reason: collision with root package name */
    private int f427a;

    /* renamed from: b  reason: collision with root package name */
    private int f428b;

    /* renamed from: d  reason: collision with root package name */
    private float[] f430d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f431e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f432f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f433g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f434h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private int p;
    private OverScroller q;
    private final AbstractC0021c r;
    private View s;
    private boolean t;
    private final ViewGroup u;

    /* renamed from: c  reason: collision with root package name */
    private int f429c = -1;
    private final Runnable v = new b();

    /* loaded from: classes.dex */
    static class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.c(0);
        }
    }

    /* renamed from: a.i.b.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0021c {
        public int a(int i) {
            return i;
        }

        public int a(View view) {
            return 0;
        }

        public abstract int a(View view, int i, int i2);

        public void a(int i, int i2) {
        }

        public abstract void a(View view, float f2, float f3);

        public void a(View view, int i) {
        }

        public abstract void a(View view, int i, int i2, int i3, int i4);

        public int b(View view) {
            return 0;
        }

        public abstract int b(View view, int i, int i2);

        public void b(int i, int i2) {
        }

        public boolean b(int i) {
            return false;
        }

        public abstract boolean b(View view, int i);

        public abstract void c(int i);
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0021c abstractC0021c) {
        if (viewGroup != null) {
            if (abstractC0021c == null) {
                throw new IllegalArgumentException("Callback may not be null");
            }
            this.u = viewGroup;
            this.r = abstractC0021c;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f428b = viewConfiguration.getScaledTouchSlop();
            this.m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.q = new OverScroller(context, w);
            return;
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    private float a(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    private int a(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    private int a(View view, int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        float f4;
        float f5;
        int a2 = a(i3, (int) this.n, (int) this.m);
        int a3 = a(i4, (int) this.n, (int) this.m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(a2);
        int abs4 = Math.abs(a3);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (a2 != 0) {
            f2 = abs3;
            f3 = i5;
        } else {
            f2 = abs;
            f3 = i6;
        }
        float f6 = f2 / f3;
        if (a3 != 0) {
            f4 = abs4;
            f5 = i5;
        } else {
            f4 = abs2;
            f5 = i6;
        }
        return (int) ((b(i, a2, this.r.a(view)) * f6) + (b(i2, a3, this.r.b(view)) * (f4 / f5)));
    }

    public static c a(ViewGroup viewGroup, float f2, AbstractC0021c abstractC0021c) {
        c a2 = a(viewGroup, abstractC0021c);
        a2.f428b = (int) (a2.f428b * (1.0f / f2));
        return a2;
    }

    public static c a(ViewGroup viewGroup, AbstractC0021c abstractC0021c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0021c);
    }

    private void a(float f2, float f3) {
        this.t = true;
        this.r.a(this.s, f2, f3);
        this.t = false;
        if (this.f427a == 1) {
            c(0);
        }
    }

    private void a(float f2, float f3, int i) {
        int i2 = 1;
        if (!a(f2, f3, i, 1)) {
            i2 = 0;
        }
        if (a(f3, f2, i, 4)) {
            i2 |= 4;
        }
        if (a(f2, f3, i, 2)) {
            i2 |= 2;
        }
        if (a(f3, f2, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | i2;
            this.r.a(i2, i);
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        int left = this.s.getLeft();
        int top = this.s.getTop();
        if (i3 != 0) {
            i = this.r.a(this.s, i, i3);
            v.d(this.s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.r.b(this.s, i2, i4);
            v.e(this.s, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.r.a(this.s, i5, i6, i5 - left, i6 - top);
    }

    private boolean a(float f2, float f3, int i, int i2) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.f434h[i] & i2) != i2 || (this.p & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f428b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.r.b(i2)) {
            return (this.i[i] & i2) == 0 && abs > ((float) this.f428b);
        }
        int[] iArr = this.j;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    private boolean a(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.r.a(view) > 0;
        boolean z2 = this.r.b(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f428b) : z2 && Math.abs(f3) > ((float) this.f428b);
        }
        int i = this.f428b;
        return (f2 * f2) + (f3 * f3) > ((float) (i * i));
    }

    private float b(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    private int b(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.u.getWidth();
        float f2 = width / 2;
        float b2 = f2 + (b(Math.min(1.0f, Math.abs(i) / width)) * f2);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(b2 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    private void b(float f2, float f3, int i) {
        f(i);
        float[] fArr = this.f430d;
        this.f432f[i] = f2;
        fArr[i] = f2;
        float[] fArr2 = this.f431e;
        this.f433g[i] = f3;
        fArr2[i] = f3;
        this.f434h[i] = e((int) f2, (int) f3);
        this.k |= 1 << i;
    }

    private boolean b(int i, int i2, int i3, int i4) {
        int left = this.s.getLeft();
        int top = this.s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.q.abortAnimation();
            c(0);
            return false;
        }
        this.q.startScroll(left, top, i5, i6, a(this.s, i5, i6, i3, i4));
        c(2);
        return true;
    }

    private void c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (g(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f432f[pointerId] = x;
                this.f433g[pointerId] = y;
            }
        }
    }

    private int e(int i, int i2) {
        int i3 = i < this.u.getLeft() + this.o ? 1 : 0;
        if (i2 < this.u.getTop() + this.o) {
            i3 |= 4;
        }
        if (i > this.u.getRight() - this.o) {
            i3 |= 2;
        }
        return i2 > this.u.getBottom() - this.o ? i3 | 8 : i3;
    }

    private void e(int i) {
        if (this.f430d == null || !b(i)) {
            return;
        }
        this.f430d[i] = 0.0f;
        this.f431e[i] = 0.0f;
        this.f432f[i] = 0.0f;
        this.f433g[i] = 0.0f;
        this.f434h[i] = 0;
        this.i[i] = 0;
        this.j[i] = 0;
        this.k = (~(1 << i)) & this.k;
    }

    private void f() {
        float[] fArr = this.f430d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f431e, 0.0f);
        Arrays.fill(this.f432f, 0.0f);
        Arrays.fill(this.f433g, 0.0f);
        Arrays.fill(this.f434h, 0);
        Arrays.fill(this.i, 0);
        Arrays.fill(this.j, 0);
        this.k = 0;
    }

    private void f(int i) {
        float[] fArr = this.f430d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f430d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f431e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f432f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f433g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f434h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f430d = fArr2;
            this.f431e = fArr3;
            this.f432f = fArr4;
            this.f433g = fArr5;
            this.f434h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
    }

    private void g() {
        this.l.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.m);
        a(a(this.l.getXVelocity(this.f429c), this.n, this.m), a(this.l.getYVelocity(this.f429c), this.n, this.m));
    }

    private boolean g(int i) {
        if (!b(i)) {
            Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    public void a() {
        this.f429c = -1;
        f();
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void a(float f2) {
        this.n = f2;
    }

    public void a(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View b2 = b((int) x, (int) y);
            b(x, y, pointerId);
            b(b2, pointerId);
            int i3 = this.f434h[pointerId];
            int i4 = this.p;
            if ((i3 & i4) == 0) {
                return;
            }
            this.r.b(i3 & i4, pointerId);
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f427a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (g(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f2 = x2 - this.f430d[pointerId2];
                            float f3 = y2 - this.f431e[pointerId2];
                            a(f2, f3, pointerId2);
                            if (this.f427a != 1) {
                                View b3 = b((int) x2, (int) y2);
                                if (a(b3, f2, f3) && b(b3, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                } else if (!g(this.f429c)) {
                    return;
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f429c);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f432f;
                    int i5 = this.f429c;
                    int i6 = (int) (x3 - fArr[i5]);
                    int i7 = (int) (y3 - this.f433g[i5]);
                    a(this.s.getLeft() + i6, this.s.getTop() + i7, i6, i7);
                }
                c(motionEvent);
                return;
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x4 = motionEvent.getX(actionIndex);
                    float y4 = motionEvent.getY(actionIndex);
                    b(x4, y4, pointerId3);
                    if (this.f427a != 0) {
                        if (!c((int) x4, (int) y4)) {
                            return;
                        }
                        b(this.s, pointerId3);
                        return;
                    }
                    b(b((int) x4, (int) y4), pointerId3);
                    int i8 = this.f434h[pointerId3];
                    int i9 = this.p;
                    if ((i8 & i9) == 0) {
                        return;
                    }
                    this.r.b(i8 & i9, pointerId3);
                    return;
                } else if (actionMasked != 6) {
                    return;
                } else {
                    int pointerId4 = motionEvent.getPointerId(actionIndex);
                    if (this.f427a == 1 && pointerId4 == this.f429c) {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (true) {
                            if (i2 >= pointerCount2) {
                                i = -1;
                                break;
                            }
                            int pointerId5 = motionEvent.getPointerId(i2);
                            if (pointerId5 != this.f429c) {
                                View b4 = b((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                View view = this.s;
                                if (b4 == view && b(view, pointerId5)) {
                                    i = this.f429c;
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (i == -1) {
                            g();
                        }
                    }
                    e(pointerId4);
                    return;
                }
            } else if (this.f427a == 1) {
                a(0.0f, 0.0f);
            }
        } else if (this.f427a == 1) {
            g();
        }
        a();
    }

    public void a(View view, int i) {
        if (view.getParent() == this.u) {
            this.s = view;
            this.f429c = i;
            this.r.a(view, i);
            c(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.u + ")");
    }

    public boolean a(int i) {
        int length = this.f430d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (a(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean a(int i, int i2) {
        if (!b(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f2 = this.f432f[i2] - this.f430d[i2];
        float f3 = this.f433g[i2] - this.f431e[i2];
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f428b) : z2 && Math.abs(f3) > ((float) this.f428b);
        }
        int i3 = this.f428b;
        return (f2 * f2) + (f3 * f3) > ((float) (i3 * i3));
    }

    public boolean a(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public boolean a(boolean z) {
        if (this.f427a == 2) {
            boolean computeScrollOffset = this.q.computeScrollOffset();
            int currX = this.q.getCurrX();
            int currY = this.q.getCurrY();
            int left = currX - this.s.getLeft();
            int top = currY - this.s.getTop();
            if (left != 0) {
                v.d(this.s, left);
            }
            if (top != 0) {
                v.e(this.s, top);
            }
            if (left != 0 || top != 0) {
                this.r.a(this.s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.q.getFinalX() && currY == this.q.getFinalY()) {
                this.q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.u.post(this.v);
                } else {
                    c(0);
                }
            }
        }
        return this.f427a == 2;
    }

    public View b() {
        return this.s;
    }

    public View b(int i, int i2) {
        for (int childCount = this.u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.u;
            this.r.a(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean b(int i) {
        return ((1 << i) & this.k) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.b.c.b(android.view.MotionEvent):boolean");
    }

    boolean b(View view, int i) {
        if (view == this.s && this.f429c == i) {
            return true;
        }
        if (view == null || !this.r.b(view, i)) {
            return false;
        }
        this.f429c = i;
        a(view, i);
        return true;
    }

    public boolean b(View view, int i, int i2) {
        this.s = view;
        this.f429c = -1;
        boolean b2 = b(i, i2, 0, 0);
        if (!b2 && this.f427a == 0 && this.s != null) {
            this.s = null;
        }
        return b2;
    }

    public int c() {
        return this.o;
    }

    void c(int i) {
        this.u.removeCallbacks(this.v);
        if (this.f427a != i) {
            this.f427a = i;
            this.r.c(i);
            if (this.f427a != 0) {
                return;
            }
            this.s = null;
        }
    }

    public boolean c(int i, int i2) {
        return a(this.s, i, i2);
    }

    public int d() {
        return this.f428b;
    }

    public void d(int i) {
        this.p = i;
    }

    public boolean d(int i, int i2) {
        if (this.t) {
            return b(i, i2, (int) this.l.getXVelocity(this.f429c), (int) this.l.getYVelocity(this.f429c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public int e() {
        return this.f427a;
    }
}
