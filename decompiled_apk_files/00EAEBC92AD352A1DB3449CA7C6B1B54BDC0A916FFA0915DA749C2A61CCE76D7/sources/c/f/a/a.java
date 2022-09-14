package c.f.a;

import android.os.Handler;
import android.view.MotionEvent;
/* loaded from: classes.dex */
public class a extends b<a> {
    private float D;
    private float E;
    private Handler F;
    private int G;
    private long z = 800;
    private long A = 160;
    private int B = 1;
    private int C = 1;
    private final Runnable H = new RunnableC0107a();

    /* renamed from: c.f.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0107a implements Runnable {
        RunnableC0107a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.e();
        }
    }

    private void d(MotionEvent motionEvent) {
        if (!f(motionEvent)) {
            e();
        }
    }

    private void e(MotionEvent motionEvent) {
        this.D = motionEvent.getRawX();
        this.E = motionEvent.getRawY();
        b();
        this.G = 1;
        Handler handler = this.F;
        if (handler == null) {
            this.F = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        this.F.postDelayed(this.H, this.z);
    }

    private boolean f(MotionEvent motionEvent) {
        if (this.G == this.C) {
            if (((this.B & 1) == 0 || motionEvent.getRawX() - this.D <= ((float) this.A)) && (((this.B & 2) == 0 || this.D - motionEvent.getRawX() <= ((float) this.A)) && (((this.B & 4) == 0 || this.E - motionEvent.getRawY() <= ((float) this.A)) && ((this.B & 8) == 0 || motionEvent.getRawY() - this.E <= ((float) this.A))))) {
                return false;
            }
            this.F.removeCallbacksAndMessages(null);
            a();
            d();
            return true;
        }
        return false;
    }

    @Override // c.f.a.b
    protected void c(MotionEvent motionEvent) {
        int k = k();
        if (k == 0) {
            e(motionEvent);
        }
        if (k == 2) {
            f(motionEvent);
            if (motionEvent.getPointerCount() > this.G) {
                this.G = motionEvent.getPointerCount();
            }
            if (motionEvent.getActionMasked() != 1) {
                return;
            }
            d(motionEvent);
        }
    }

    public void d(int i) {
        this.B = i;
    }

    public void e(int i) {
        this.C = i;
    }

    @Override // c.f.a.b
    protected void p() {
        Handler handler = this.F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // c.f.a.b
    protected void q() {
        Handler handler = this.F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
