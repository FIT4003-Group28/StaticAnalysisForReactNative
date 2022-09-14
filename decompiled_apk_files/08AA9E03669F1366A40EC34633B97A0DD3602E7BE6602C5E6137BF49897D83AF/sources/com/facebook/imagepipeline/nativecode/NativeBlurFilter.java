package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.d.d;
import com.facebook.common.d.i;
@d
/* loaded from: classes.dex */
public class NativeBlurFilter {
    @d
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    static {
        a.a();
    }

    public static void a(Bitmap bitmap, int i, int i2) {
        i.a(bitmap);
        boolean z = false;
        i.a(i > 0);
        if (i2 > 0) {
            z = true;
        }
        i.a(z);
        nativeIterativeBoxBlur(bitmap, i, i2);
    }
}
