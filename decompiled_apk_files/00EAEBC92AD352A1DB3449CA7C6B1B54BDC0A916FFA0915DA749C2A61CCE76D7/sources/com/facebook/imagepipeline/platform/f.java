package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;
/* loaded from: classes.dex */
public interface f {
    c.d.d.h.a<Bitmap> a(c.d.j.k.d dVar, Bitmap.Config config, Rect rect, int i);

    c.d.d.h.a<Bitmap> a(c.d.j.k.d dVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace);

    c.d.d.h.a<Bitmap> a(c.d.j.k.d dVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace);
}
