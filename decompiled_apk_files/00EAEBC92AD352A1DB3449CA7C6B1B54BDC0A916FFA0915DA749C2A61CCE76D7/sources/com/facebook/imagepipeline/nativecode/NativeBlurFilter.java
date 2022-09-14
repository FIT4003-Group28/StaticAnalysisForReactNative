package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import c.d.d.d.i;
@c.d.d.d.d
/* loaded from: classes.dex */
public class NativeBlurFilter {
    static {
        b.a();
    }

    public static void a(Bitmap bitmap, int i, int i2) {
        i.a(bitmap);
        boolean z = true;
        i.a(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        i.a(z);
        nativeIterativeBoxBlur(bitmap, i, i2);
    }

    @c.d.d.d.d
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
