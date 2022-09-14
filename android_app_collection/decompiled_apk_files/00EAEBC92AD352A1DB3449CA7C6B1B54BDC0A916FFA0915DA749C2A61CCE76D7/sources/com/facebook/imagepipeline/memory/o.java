package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class o implements d {
    @Override // c.d.d.g.e, c.d.d.h.c
    public void a(Bitmap bitmap) {
        c.d.d.d.i.a(bitmap);
        bitmap.recycle();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.d.d.g.e
    /* renamed from: get */
    public Bitmap mo186get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }
}
