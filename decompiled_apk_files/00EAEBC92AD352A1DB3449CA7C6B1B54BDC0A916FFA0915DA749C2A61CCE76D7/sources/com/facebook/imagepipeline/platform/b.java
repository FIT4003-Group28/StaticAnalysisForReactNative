package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import c.d.d.d.i;
import java.io.InputStream;
import java.nio.ByteBuffer;
@TargetApi(21)
/* loaded from: classes.dex */
public abstract class b implements f {

    /* renamed from: d  reason: collision with root package name */
    private static final Class<?> f5287d = b.class;

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f5288e = {-1, -39};

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.d f5289a;

    /* renamed from: b  reason: collision with root package name */
    private final PreverificationHelper f5290b;

    /* renamed from: c  reason: collision with root package name */
    final androidx.core.util.f<ByteBuffer> f5291c;

    public b(com.facebook.imagepipeline.memory.d dVar, int i, androidx.core.util.f fVar) {
        this.f5290b = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f5289a = dVar;
        this.f5291c = fVar;
        for (int i2 = 0; i2 < i; i2++) {
            this.f5291c.a(ByteBuffer.allocate(16384));
        }
    }

    private static BitmapFactory.Options a(c.d.j.k.d dVar, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = dVar.w();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(dVar.h(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2 A[Catch: all -> 0x00cc, RuntimeException -> 0x00ce, IllegalArgumentException -> 0x00d7, TryCatch #8 {IllegalArgumentException -> 0x00d7, RuntimeException -> 0x00ce, blocks: (B:30:0x006d, B:36:0x0086, B:50:0x00a9, B:43:0x009b, B:46:0x00a2, B:47:0x00a5), top: B:81:0x006d, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9 A[Catch: all -> 0x00cc, RuntimeException -> 0x00ce, IllegalArgumentException -> 0x00d7, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x00d7, RuntimeException -> 0x00ce, blocks: (B:30:0x006d, B:36:0x0086, B:50:0x00a9, B:43:0x009b, B:46:0x00a2, B:47:0x00a5), top: B:81:0x006d, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private c.d.d.h.a<android.graphics.Bitmap> a(java.io.InputStream r9, android.graphics.BitmapFactory.Options r10, android.graphics.Rect r11, android.graphics.ColorSpace r12) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.b.a(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, android.graphics.ColorSpace):c.d.d.h.a");
    }

    public abstract int a(int i, int i2, BitmapFactory.Options options);

    @Override // com.facebook.imagepipeline.platform.f
    public c.d.d.h.a<Bitmap> a(c.d.j.k.d dVar, Bitmap.Config config, Rect rect, int i) {
        return a(dVar, config, rect, i, null);
    }

    @Override // com.facebook.imagepipeline.platform.f
    public c.d.d.h.a<Bitmap> a(c.d.j.k.d dVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        boolean c2 = dVar.c(i);
        BitmapFactory.Options a2 = a(dVar, config);
        InputStream h2 = dVar.h();
        i.a(h2);
        if (dVar.z() > i) {
            h2 = new c.d.d.j.a(h2, i);
        }
        InputStream bVar = !c2 ? new c.d.d.j.b(h2, f5288e) : h2;
        boolean z = a2.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return a(bVar, a2, rect, colorSpace);
        } catch (RuntimeException e2) {
            if (!z) {
                throw e2;
            }
            return a(dVar, Bitmap.Config.ARGB_8888, rect, i, colorSpace);
        }
    }

    @Override // com.facebook.imagepipeline.platform.f
    public c.d.d.h.a<Bitmap> a(c.d.j.k.d dVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options a2 = a(dVar, config);
        boolean z = a2.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return a(dVar.h(), a2, rect, colorSpace);
        } catch (RuntimeException e2) {
            if (!z) {
                throw e2;
            }
            return a(dVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
        }
    }
}
