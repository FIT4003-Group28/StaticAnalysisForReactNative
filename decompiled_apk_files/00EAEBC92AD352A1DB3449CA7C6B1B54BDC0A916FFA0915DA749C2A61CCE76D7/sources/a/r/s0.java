package a.r;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
/* loaded from: classes.dex */
class s0 extends r0 {
    private static boolean k = true;

    @Override // a.r.u0
    @SuppressLint({"NewApi"})
    public void a(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.a(view, i);
        } else if (!k) {
        } else {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }
}
