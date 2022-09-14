package c.f.a;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
/* loaded from: classes.dex */
public class g extends b<g> {
    private static float E = 10.0f;
    private float A;
    private float B;
    private float C;
    private Handler D;
    private long z = 500;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.a();
        }
    }

    public g(Context context) {
        b(true);
        this.A = E * context.getResources().getDisplayMetrics().density;
    }

    public g a(float f2) {
        this.A = f2 * f2;
        return this;
    }

    public void a(long j) {
        this.z = j;
    }

    @Override // c.f.a.b
    protected void b(int i, int i2) {
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
    }

    @Override // c.f.a.b
    protected void c(MotionEvent motionEvent) {
        if (k() == 0) {
            b();
            this.B = motionEvent.getRawX();
            this.C = motionEvent.getRawY();
            this.D = new Handler();
            this.D.postDelayed(new a(), this.z);
        }
        if (motionEvent.getActionMasked() == 1) {
            Handler handler = this.D;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.D = null;
            }
            if (k() == 4) {
                d();
                return;
            }
        } else {
            float rawX = motionEvent.getRawX() - this.B;
            float rawY = motionEvent.getRawY() - this.C;
            if ((rawX * rawX) + (rawY * rawY) <= this.A) {
                return;
            }
            if (k() == 4) {
                c();
                return;
            }
        }
        e();
    }
}
