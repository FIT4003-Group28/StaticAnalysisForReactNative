package a.r;

import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
class t0 extends s0 {
    @Override // a.r.p0, a.r.u0
    public void a(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // a.r.s0, a.r.u0
    public void a(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // a.r.r0, a.r.u0
    public void a(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // a.r.q0, a.r.u0
    public void a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // a.r.p0, a.r.u0
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // a.r.q0, a.r.u0
    public void b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // a.r.q0, a.r.u0
    public void c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
