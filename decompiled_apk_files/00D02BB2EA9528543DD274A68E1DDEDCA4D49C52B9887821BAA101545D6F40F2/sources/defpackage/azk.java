package defpackage;

import android.graphics.Matrix;
import android.view.View;
/* compiled from: PG */
/* renamed from: azk  reason: default package */
/* loaded from: classes3.dex */
final class azk extends azj {
    @Override // defpackage.azg, defpackage.azl
    public final void a(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.azg, defpackage.azl
    public final float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.azh, defpackage.azl
    public final void e(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.azh, defpackage.azl
    public final void f(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.azi, defpackage.azl
    public final void g(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.azj, defpackage.azl
    public final void h(View view, int i) {
        view.setTransitionVisibility(i);
    }
}
