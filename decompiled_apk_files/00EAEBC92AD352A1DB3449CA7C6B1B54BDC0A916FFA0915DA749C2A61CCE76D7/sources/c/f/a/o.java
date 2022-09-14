package c.f.a;

import android.os.Handler;
import android.view.MotionEvent;
/* loaded from: classes.dex */
public class o extends b<o> {
    private static float Q = Float.MIN_VALUE;
    private float A;
    private float B;
    private long C;
    private long D;
    private int E;
    private int F;
    private int G;
    private float H;
    private float I;
    private float J;
    private float K;
    private float L;
    private float M;
    private Handler N;
    private int O;
    private final Runnable P;
    private float z;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.e();
        }
    }

    public o() {
        float f2 = Q;
        this.z = f2;
        this.A = f2;
        this.B = f2;
        this.C = 500L;
        this.D = 500L;
        this.E = 1;
        this.F = 1;
        this.G = 1;
        this.P = new a();
        b(true);
    }

    private void t() {
        Handler handler = this.N;
        if (handler == null) {
            this.N = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        int i = this.O + 1;
        this.O = i;
        if (i != this.E || this.G < this.F) {
            this.N.postDelayed(this.P, this.D);
            return;
        }
        a();
        d();
    }

    private boolean u() {
        float f2 = (this.L - this.H) + this.J;
        if (this.z == Q || Math.abs(f2) <= this.z) {
            float f3 = (this.M - this.I) + this.K;
            if (this.A != Q && Math.abs(f3) > this.A) {
                return true;
            }
            float f4 = (f3 * f3) + (f2 * f2);
            float f5 = this.B;
            return f5 != Q && f4 > f5;
        }
        return true;
    }

    private void v() {
        Handler handler = this.N;
        if (handler == null) {
            this.N = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        this.N.postDelayed(this.P, this.C);
    }

    public o a(float f2) {
        this.B = f2 * f2;
        return this;
    }

    public o a(long j) {
        this.D = j;
        return this;
    }

    public o b(float f2) {
        this.z = f2;
        return this;
    }

    public o b(long j) {
        this.C = j;
        return this;
    }

    public o c(float f2) {
        this.A = f2;
        return this;
    }

    @Override // c.f.a.b
    protected void c(MotionEvent motionEvent) {
        int k = k();
        int actionMasked = motionEvent.getActionMasked();
        if (k == 0) {
            this.J = 0.0f;
            this.K = 0.0f;
            this.H = motionEvent.getRawX();
            this.I = motionEvent.getRawY();
        }
        if (actionMasked == 6 || actionMasked == 5) {
            this.J += this.L - this.H;
            this.K += this.M - this.I;
            this.L = f.a(motionEvent, true);
            this.M = f.b(motionEvent, true);
            this.H = this.L;
            this.I = this.M;
        } else {
            this.L = f.a(motionEvent, true);
            this.M = f.b(motionEvent, true);
        }
        if (this.G < motionEvent.getPointerCount()) {
            this.G = motionEvent.getPointerCount();
        }
        if (u()) {
            e();
            return;
        }
        if (k == 0) {
            if (actionMasked == 0) {
                b();
            }
        } else if (k != 2) {
            return;
        } else {
            if (actionMasked == 1) {
                t();
                return;
            } else if (actionMasked != 0) {
                return;
            }
        }
        v();
    }

    public o d(int i) {
        this.F = i;
        return this;
    }

    public o e(int i) {
        this.E = i;
        return this;
    }

    @Override // c.f.a.b
    protected void p() {
        Handler handler = this.N;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // c.f.a.b
    protected void q() {
        this.O = 0;
        this.G = 0;
        Handler handler = this.N;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
