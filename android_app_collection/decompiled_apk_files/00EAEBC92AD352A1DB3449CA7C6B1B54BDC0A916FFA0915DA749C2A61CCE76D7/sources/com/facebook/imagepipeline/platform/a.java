package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory;
@TargetApi(21)
/* loaded from: classes.dex */
public class a extends b {
    public a(com.facebook.imagepipeline.memory.d dVar, int i, androidx.core.util.f fVar) {
        super(dVar, i, fVar);
    }

    @Override // com.facebook.imagepipeline.platform.b
    public int a(int i, int i2, BitmapFactory.Options options) {
        return com.facebook.imageutils.a.a(i, i2, options.inPreferredConfig);
    }
}
