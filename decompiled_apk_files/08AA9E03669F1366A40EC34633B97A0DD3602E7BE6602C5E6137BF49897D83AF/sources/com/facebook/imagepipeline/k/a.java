package com.facebook.imagepipeline.k;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.i.j;
import com.facebook.common.d.i;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: ArtDecoder.java */
@TargetApi(21)
/* loaded from: classes.dex */
public class a implements e {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f2715c = {-1, -39};

    /* renamed from: a  reason: collision with root package name */
    final j.b<ByteBuffer> f2716a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.d f2717b;

    public a(com.facebook.imagepipeline.memory.d dVar, int i, j.b bVar) {
        this.f2717b = dVar;
        this.f2716a = bVar;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2716a.a(ByteBuffer.allocate(16384));
        }
    }

    @Override // com.facebook.imagepipeline.k.e
    public com.facebook.common.h.a<Bitmap> a(com.facebook.imagepipeline.i.d dVar, Bitmap.Config config) {
        BitmapFactory.Options b2 = b(dVar, config);
        boolean z = b2.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return a(dVar.d(), b2);
        } catch (RuntimeException e) {
            if (z) {
                return a(dVar, Bitmap.Config.ARGB_8888);
            }
            throw e;
        }
    }

    @Override // com.facebook.imagepipeline.k.e
    public com.facebook.common.h.a<Bitmap> a(com.facebook.imagepipeline.i.d dVar, Bitmap.Config config, int i) {
        boolean e = dVar.e(i);
        BitmapFactory.Options b2 = b(dVar, config);
        InputStream d2 = dVar.d();
        i.a(d2);
        if (dVar.k() > i) {
            d2 = new com.facebook.common.k.a(d2, i);
        }
        InputStream bVar = !e ? new com.facebook.common.k.b(d2, f2715c) : d2;
        boolean z = b2.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return a(bVar, b2);
        } catch (RuntimeException e2) {
            if (z) {
                return a(dVar, Bitmap.Config.ARGB_8888);
            }
            throw e2;
        }
    }

    protected com.facebook.common.h.a<Bitmap> a(InputStream inputStream, BitmapFactory.Options options) {
        i.a(inputStream);
        Bitmap a2 = this.f2717b.a(com.facebook.i.a.a(options.outWidth, options.outHeight, options.inPreferredConfig));
        if (a2 == null) {
            throw new NullPointerException("BitmapPool.get returned null");
        }
        options.inBitmap = a2;
        ByteBuffer a3 = this.f2716a.a();
        if (a3 == null) {
            a3 = ByteBuffer.allocate(16384);
        }
        try {
            try {
                options.inTempStorage = a3.array();
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                if (a2 != decodeStream) {
                    this.f2717b.a((com.facebook.imagepipeline.memory.d) a2);
                    decodeStream.recycle();
                    throw new IllegalStateException();
                }
                return com.facebook.common.h.a.a(decodeStream, this.f2717b);
            } catch (RuntimeException e) {
                this.f2717b.a((com.facebook.imagepipeline.memory.d) a2);
                throw e;
            }
        } finally {
            this.f2716a.a(a3);
        }
    }

    private static BitmapFactory.Options b(com.facebook.imagepipeline.i.d dVar, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = dVar.i();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(dVar.d(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }
}
