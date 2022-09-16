package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
@c.d.d.d.d
/* loaded from: classes.dex */
public class NativeRoundingFilter {
    static {
        b.a();
    }

    @c.d.d.d.d
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @c.d.d.d.d
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);
}
