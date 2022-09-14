package c.f.a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.reactnativecommunity.webview.RNCWebViewManager;
/* loaded from: classes.dex */
public class j extends b<j> {
    private static float X = Float.MAX_VALUE;
    private static float Y = Float.MIN_VALUE;
    private static int Z = 1;
    private static int a0 = 10;
    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private int L;
    private int M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private VelocityTracker V;
    private boolean W;
    private float z;

    public j(Context context) {
        float f2 = Y;
        this.z = f2;
        float f3 = X;
        this.A = f3;
        this.B = f2;
        this.C = f2;
        this.D = f3;
        this.E = f3;
        this.F = f2;
        this.G = f2;
        this.H = f3;
        this.I = f3;
        this.J = f3;
        this.K = f3;
        this.L = Z;
        this.M = a0;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.z = scaledTouchSlop * scaledTouchSlop;
    }

    private static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
        if (r0 >= r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
        if (r0 >= r2) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean x() {
        /*
            r6 = this;
            float r0 = r6.R
            float r1 = r6.N
            float r0 = r0 - r1
            float r1 = r6.P
            float r0 = r0 + r1
            float r1 = r6.A
            float r2 = c.f.a.j.X
            r3 = 1
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L16
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L16
            return r3
        L16:
            float r1 = r6.B
            float r2 = c.f.a.j.Y
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L23
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L23
            return r3
        L23:
            float r1 = r6.S
            float r2 = r6.O
            float r1 = r1 - r2
            float r2 = r6.Q
            float r1 = r1 + r2
            float r2 = r6.E
            float r4 = c.f.a.j.X
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L38
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L38
            return r3
        L38:
            float r2 = r6.F
            float r4 = c.f.a.j.Y
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L45
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L45
            return r3
        L45:
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            float r1 = r6.z
            float r2 = c.f.a.j.X
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L57
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L57
            return r3
        L57:
            float r0 = r6.T
            float r1 = r6.I
            float r2 = c.f.a.j.X
            r4 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L75
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 >= 0) goto L6a
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L74
        L6a:
            float r1 = r6.I
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 < 0) goto L75
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L75
        L74:
            return r3
        L75:
            float r1 = r6.U
            float r2 = r6.J
            float r5 = c.f.a.j.X
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 == 0) goto L92
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 >= 0) goto L87
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L91
        L87:
            float r2 = r6.J
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L92
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L92
        L91:
            return r3
        L92:
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            float r1 = r6.K
            float r2 = c.f.a.j.X
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto La4
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto La4
            return r3
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.j.x():boolean");
    }

    private boolean y() {
        float f2 = (this.R - this.N) + this.P;
        float f3 = this.C;
        if (f3 == Y || f2 >= f3) {
            float f4 = this.D;
            if (f4 != X && f2 > f4) {
                return true;
            }
            float f5 = (this.S - this.O) + this.Q;
            float f6 = this.G;
            if (f6 != Y && f5 < f6) {
                return true;
            }
            float f7 = this.H;
            return f7 != X && f5 > f7;
        }
        return true;
    }

    public j a(float f2) {
        this.B = f2;
        return this;
    }

    public j b(float f2) {
        this.A = f2;
        return this;
    }

    public j c(float f2) {
        this.F = f2;
        return this;
    }

    public j c(boolean z) {
        this.W = z;
        return this;
    }

    @Override // c.f.a.b
    protected void c(MotionEvent motionEvent) {
        int k = k();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 6 || actionMasked == 5) {
            this.P += this.R - this.N;
            this.Q += this.S - this.O;
            this.R = f.a(motionEvent, this.W);
            this.S = f.b(motionEvent, this.W);
            this.N = this.R;
            this.O = this.S;
        } else {
            this.R = f.a(motionEvent, this.W);
            this.S = f.b(motionEvent, this.W);
        }
        if (k != 0 || motionEvent.getPointerCount() < this.L) {
            VelocityTracker velocityTracker = this.V;
            if (velocityTracker != null) {
                a(velocityTracker, motionEvent);
                this.V.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
                this.T = this.V.getXVelocity();
                this.U = this.V.getYVelocity();
            }
        } else {
            this.N = this.R;
            this.O = this.S;
            this.P = 0.0f;
            this.Q = 0.0f;
            this.V = VelocityTracker.obtain();
            a(this.V, motionEvent);
            b();
        }
        if (actionMasked == 1) {
            if (k == 4 || k == 2) {
                d();
                return;
            }
        } else if (actionMasked != 5 || motionEvent.getPointerCount() <= this.M) {
            if (actionMasked != 6 || k != 4 || motionEvent.getPointerCount() >= this.L) {
                if (k != 2) {
                    return;
                }
                if (!y()) {
                    if (!x()) {
                        return;
                    }
                    this.N = this.R;
                    this.O = this.S;
                    a();
                    return;
                }
            }
        } else if (k == 4) {
            c();
            return;
        }
        e();
    }

    public j d(float f2) {
        this.E = f2;
        return this;
    }

    public j d(int i) {
        this.M = i;
        return this;
    }

    public j e(float f2) {
        this.D = f2;
        return this;
    }

    public j e(int i) {
        this.L = i;
        return this;
    }

    public j f(float f2) {
        this.C = f2;
        return this;
    }

    public j g(float f2) {
        this.H = f2;
        return this;
    }

    public j h(float f2) {
        this.G = f2;
        return this;
    }

    public j i(float f2) {
        this.z = f2 * f2;
        return this;
    }

    public j j(float f2) {
        this.K = f2 * f2;
        return this;
    }

    public j k(float f2) {
        this.I = f2;
        return this;
    }

    public j l(float f2) {
        this.J = f2;
        return this;
    }

    @Override // c.f.a.b
    protected void q() {
        VelocityTracker velocityTracker = this.V;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.V = null;
        }
    }

    public float t() {
        return (this.R - this.N) + this.P;
    }

    public float u() {
        return (this.S - this.O) + this.Q;
    }

    public float v() {
        return this.T;
    }

    public float w() {
        return this.U;
    }
}
