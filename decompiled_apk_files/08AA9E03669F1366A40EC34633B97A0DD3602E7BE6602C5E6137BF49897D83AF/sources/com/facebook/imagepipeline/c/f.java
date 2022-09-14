package com.facebook.imagepipeline.c;

import android.graphics.Bitmap;
/* compiled from: PlatformBitmapFactory.java */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static a f2547a;

    /* compiled from: PlatformBitmapFactory.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public abstract com.facebook.common.h.a<Bitmap> a(int i, int i2, Bitmap.Config config);

    public void a(a aVar) {
        if (f2547a == null) {
            f2547a = aVar;
        }
    }
}
