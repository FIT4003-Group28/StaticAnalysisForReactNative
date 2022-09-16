package com.facebook.imagepipeline.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.Bitmaps;
/* compiled from: ArtBitmapFactory.java */
@TargetApi(21)
/* loaded from: classes.dex */
public class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.d f2539a;

    public a(com.facebook.imagepipeline.memory.d dVar) {
        this.f2539a = dVar;
    }

    @Override // com.facebook.imagepipeline.c.f
    public com.facebook.common.h.a<Bitmap> a(int i, int i2, Bitmap.Config config) {
        Bitmap a2 = this.f2539a.a(com.facebook.i.a.a(i, i2, config));
        Bitmaps.a(a2, i, i2, config);
        return com.facebook.common.h.a.a(a2, this.f2539a);
    }
}
