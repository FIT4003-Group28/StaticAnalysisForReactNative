package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class e extends t<Bitmap> {
    @Override // com.facebook.imagepipeline.memory.d0
    public int a(Bitmap bitmap) {
        return com.facebook.imageutils.a.a(bitmap);
    }

    protected boolean b(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            c.d.d.e.a.d("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            c.d.d.e.a.d("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }

    @Override // com.facebook.imagepipeline.memory.t, com.facebook.imagepipeline.memory.d0
    /* renamed from: c */
    public void b(Bitmap bitmap) {
        if (b(bitmap)) {
            super.b((e) bitmap);
        }
    }

    @Override // com.facebook.imagepipeline.memory.t, com.facebook.imagepipeline.memory.d0
    /* renamed from: get */
    public Bitmap mo179get(int i) {
        Bitmap bitmap = (Bitmap) super.mo179get(i);
        if (bitmap == null || !b(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }
}
