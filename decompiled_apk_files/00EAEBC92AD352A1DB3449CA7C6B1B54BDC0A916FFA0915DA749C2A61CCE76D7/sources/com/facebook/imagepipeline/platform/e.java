package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
@TargetApi(26)
/* loaded from: classes.dex */
public class e extends b {
    public e(com.facebook.imagepipeline.memory.d dVar, int i, androidx.core.util.f fVar) {
        super(dVar, i, fVar);
    }

    private static boolean a(BitmapFactory.Options options) {
        ColorSpace colorSpace = options.outColorSpace;
        return (colorSpace == null || !colorSpace.isWideGamut() || options.inPreferredConfig == Bitmap.Config.RGBA_F16) ? false : true;
    }

    @Override // com.facebook.imagepipeline.platform.b
    public int a(int i, int i2, BitmapFactory.Options options) {
        return a(options) ? i * i2 * 8 : com.facebook.imageutils.a.a(i, i2, options.inPreferredConfig);
    }
}
