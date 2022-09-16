package defpackage;

import android.graphics.Matrix;
import android.view.View;
/* compiled from: PG */
/* renamed from: boa  reason: default package */
/* loaded from: classes2.dex */
class boa extends bnz {
    private static boolean a = true;
    private static boolean b = true;

    @Override // defpackage.adj
    public void g(View view, Matrix matrix) {
        if (a) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    @Override // defpackage.adj
    public void h(View view, Matrix matrix) {
        if (b) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                b = false;
            }
        }
    }
}
