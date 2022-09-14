package c.f.a;

import android.view.MotionEvent;
import c.f.a.m;
/* loaded from: classes.dex */
public class n extends b<n> {
    private double A;
    private double B;
    private m.a C = new a();
    private m z;

    /* loaded from: classes.dex */
    class a implements m.a {
        a() {
        }

        @Override // c.f.a.m.a
        public boolean a(m mVar) {
            double d2 = n.this.A;
            n.this.A += mVar.c();
            long d3 = mVar.d();
            if (d3 > 0) {
                n nVar = n.this;
                nVar.B = (nVar.A - d2) / d3;
            }
            if (Math.abs(n.this.A) < 0.08726646259971647d || n.this.k() != 2) {
                return true;
            }
            n.this.a();
            return true;
        }

        @Override // c.f.a.m.a
        public void b(m mVar) {
            n.this.d();
        }

        @Override // c.f.a.m.a
        public boolean c(m mVar) {
            return true;
        }
    }

    public n() {
        b(false);
    }

    @Override // c.f.a.b
    protected void c(MotionEvent motionEvent) {
        int k = k();
        if (k == 0) {
            this.B = 0.0d;
            this.A = 0.0d;
            this.z = new m(this.C);
            b();
        }
        m mVar = this.z;
        if (mVar != null) {
            mVar.a(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            if (k == 4) {
                d();
            } else {
                e();
            }
        }
    }

    @Override // c.f.a.b
    protected void q() {
        this.z = null;
        this.B = 0.0d;
        this.A = 0.0d;
    }

    public float t() {
        m mVar = this.z;
        if (mVar == null) {
            return Float.NaN;
        }
        return mVar.a();
    }

    public float u() {
        m mVar = this.z;
        if (mVar == null) {
            return Float.NaN;
        }
        return mVar.b();
    }

    public double v() {
        return this.A;
    }

    public double w() {
        return this.B;
    }
}
