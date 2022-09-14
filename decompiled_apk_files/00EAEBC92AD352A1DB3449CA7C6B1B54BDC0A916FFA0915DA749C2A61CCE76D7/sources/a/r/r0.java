package a.r;

import android.annotation.SuppressLint;
import android.view.View;
/* loaded from: classes.dex */
class r0 extends q0 {
    private static boolean j = true;

    @Override // a.r.u0
    @SuppressLint({"NewApi"})
    public void a(View view, int i, int i2, int i3, int i4) {
        if (j) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }
}
