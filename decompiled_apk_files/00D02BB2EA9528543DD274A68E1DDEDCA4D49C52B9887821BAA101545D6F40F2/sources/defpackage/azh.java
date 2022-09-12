package defpackage;

import android.graphics.Matrix;
import android.view.View;
/* compiled from: PG */
/* renamed from: azh  reason: default package */
/* loaded from: classes3.dex */
class azh extends azg {
    private static boolean a = true;
    private static boolean b = true;

    @Override // defpackage.azl
    public void e(View view, Matrix matrix) {
        if (a) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    @Override // defpackage.azl
    public void f(View view, Matrix matrix) {
        if (b) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                b = false;
            }
        }
    }
}
