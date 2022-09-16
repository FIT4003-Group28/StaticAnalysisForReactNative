package com.facebook.imagepipeline.c;

import android.graphics.Bitmap;
/* compiled from: SimpleBitmapReleaser.java */
/* loaded from: classes.dex */
public class g implements com.facebook.common.h.c<Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private static g f2548a;

    public static g a() {
        if (f2548a == null) {
            f2548a = new g();
        }
        return f2548a;
    }

    private g() {
    }

    @Override // com.facebook.common.h.c
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
