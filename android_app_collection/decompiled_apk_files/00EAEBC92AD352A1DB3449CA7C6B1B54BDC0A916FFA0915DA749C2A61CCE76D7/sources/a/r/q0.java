package a.r;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
/* loaded from: classes.dex */
class q0 extends p0 {

    /* renamed from: g  reason: collision with root package name */
    private static boolean f678g = true;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f679h = true;
    private static boolean i = true;

    @Override // a.r.u0
    @SuppressLint({"NewApi"})
    public void a(View view, Matrix matrix) {
        if (f678g) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f678g = false;
            }
        }
    }

    @Override // a.r.u0
    @SuppressLint({"NewApi"})
    public void b(View view, Matrix matrix) {
        if (f679h) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f679h = false;
            }
        }
    }

    @Override // a.r.u0
    @SuppressLint({"NewApi"})
    public void c(View view, Matrix matrix) {
        if (i) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }
}
