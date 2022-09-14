package a.r;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
class m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static i a(View view, ViewGroup viewGroup, Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? k.a(view, viewGroup, matrix) : l.a(view, viewGroup, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            k.a(view);
        } else {
            l.b(view);
        }
    }
}
