package com.facebook.imagepipeline.k;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.facebook.common.d.i;
import com.facebook.common.d.m;
import com.facebook.common.g.g;
import com.facebook.imagepipeline.e.f;
import com.facebook.imagepipeline.nativecode.Bitmaps;
/* compiled from: DalvikPurgeableDecoder.java */
/* loaded from: classes.dex */
abstract class b implements e {

    /* renamed from: a  reason: collision with root package name */
    protected static final byte[] f2718a = {-1, -39};

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.b f2719b = com.facebook.imagepipeline.memory.c.a();

    abstract Bitmap a(com.facebook.common.h.a<g> aVar, int i, BitmapFactory.Options options);

    abstract Bitmap a(com.facebook.common.h.a<g> aVar, BitmapFactory.Options options);

    @Override // com.facebook.imagepipeline.k.e
    public com.facebook.common.h.a<Bitmap> a(com.facebook.imagepipeline.i.d dVar, Bitmap.Config config) {
        BitmapFactory.Options a2 = a(dVar.i(), config);
        com.facebook.common.h.a<g> c2 = dVar.c();
        i.a(c2);
        try {
            return a(a(c2, a2));
        } finally {
            com.facebook.common.h.a.c(c2);
        }
    }

    @Override // com.facebook.imagepipeline.k.e
    public com.facebook.common.h.a<Bitmap> a(com.facebook.imagepipeline.i.d dVar, Bitmap.Config config, int i) {
        BitmapFactory.Options a2 = a(dVar.i(), config);
        com.facebook.common.h.a<g> c2 = dVar.c();
        i.a(c2);
        try {
            return a(a(c2, i, a2));
        } finally {
            com.facebook.common.h.a.c(c2);
        }
    }

    private static BitmapFactory.Options a(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        if (Build.VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean a(com.facebook.common.h.a<g> aVar, int i) {
        g a2 = aVar.a();
        return i >= 2 && a2.a(i + (-2)) == -1 && a2.a(i - 1) == -39;
    }

    public com.facebook.common.h.a<Bitmap> a(Bitmap bitmap) {
        try {
            Bitmaps.a(bitmap);
            if (!this.f2719b.a(bitmap)) {
                bitmap.recycle();
                throw new f();
            }
            return com.facebook.common.h.a.a(bitmap, this.f2719b.a());
        } catch (Exception e) {
            bitmap.recycle();
            throw m.b(e);
        }
    }
}
