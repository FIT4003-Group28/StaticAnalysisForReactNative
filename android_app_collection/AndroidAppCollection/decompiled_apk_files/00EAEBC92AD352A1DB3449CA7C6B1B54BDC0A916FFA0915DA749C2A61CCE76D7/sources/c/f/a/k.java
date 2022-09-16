package c.f.a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public class k extends b<k> {
    private double A;
    private double B;
    private float C;
    private float D;
    private ScaleGestureDetector.OnScaleGestureListener E = new a();
    private ScaleGestureDetector z;

    /* loaded from: classes.dex */
    class a implements ScaleGestureDetector.OnScaleGestureListener {
        a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            double d2 = k.this.A;
            k.this.A *= scaleGestureDetector.getScaleFactor();
            long timeDelta = scaleGestureDetector.getTimeDelta();
            if (timeDelta > 0) {
                k kVar = k.this;
                kVar.B = (kVar.A - d2) / timeDelta;
            }
            if (Math.abs(k.this.C - scaleGestureDetector.getCurrentSpan()) < k.this.D || k.this.k() != 2) {
                return true;
            }
            k.this.a();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            k.this.C = scaleGestureDetector.getCurrentSpan();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public k() {
        b(false);
    }

    @Override // c.f.a.b
    protected void c(MotionEvent motionEvent) {
        if (k() == 0) {
            Context context = m().getContext();
            this.B = 0.0d;
            this.A = 1.0d;
            this.z = new ScaleGestureDetector(context, this.E);
            this.D = ViewConfiguration.get(context).getScaledTouchSlop();
            b();
        }
        ScaleGestureDetector scaleGestureDetector = this.z;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        if (motionEvent.getActionMasked() == 6) {
            pointerCount--;
        }
        if (k() == 4 && pointerCount < 2) {
            d();
        } else if (motionEvent.getActionMasked() != 1) {
        } else {
            e();
        }
    }

    @Override // c.f.a.b
    protected void q() {
        this.z = null;
        this.B = 0.0d;
        this.A = 1.0d;
    }

    public float t() {
        ScaleGestureDetector scaleGestureDetector = this.z;
        if (scaleGestureDetector == null) {
            return Float.NaN;
        }
        return scaleGestureDetector.getFocusX();
    }

    public float u() {
        ScaleGestureDetector scaleGestureDetector = this.z;
        if (scaleGestureDetector == null) {
            return Float.NaN;
        }
        return scaleGestureDetector.getFocusY();
    }

    public double v() {
        return this.A;
    }

    public double w() {
        return this.B;
    }
}
