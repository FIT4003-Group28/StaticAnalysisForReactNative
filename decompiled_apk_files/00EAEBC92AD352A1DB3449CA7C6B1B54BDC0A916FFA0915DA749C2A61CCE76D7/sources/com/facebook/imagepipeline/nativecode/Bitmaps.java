package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import c.d.d.d.i;
@c.d.d.d.d
/* loaded from: classes.dex */
public class Bitmaps {
    static {
        a.a();
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2) {
        boolean z = true;
        i.a(bitmap2.getConfig() == bitmap.getConfig());
        i.a(bitmap.isMutable());
        i.a(bitmap.getWidth() == bitmap2.getWidth());
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z = false;
        }
        i.a(z);
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @c.d.d.d.d
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
