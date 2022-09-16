package defpackage;

import android.graphics.Matrix;
import android.view.View;
/* compiled from: PG */
/* renamed from: bod  reason: default package */
/* loaded from: classes2.dex */
final class bod extends boc {
    @Override // defpackage.bnz, defpackage.adj
    public final float c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.bob, defpackage.adj
    public final void d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.bnz, defpackage.adj
    public final void e(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.boc, defpackage.adj
    public final void f(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.boa, defpackage.adj
    public final void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.boa, defpackage.adj
    public final void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
