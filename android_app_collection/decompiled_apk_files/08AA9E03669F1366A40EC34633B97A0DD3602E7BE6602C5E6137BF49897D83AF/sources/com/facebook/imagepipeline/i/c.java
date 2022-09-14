package com.facebook.imagepipeline.i;

import android.graphics.Bitmap;
import com.facebook.common.d.i;
/* compiled from: CloseableStaticBitmap.java */
/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private com.facebook.common.h.a<Bitmap> f2702a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Bitmap f2703b;

    /* renamed from: c  reason: collision with root package name */
    private final g f2704c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2705d;

    public c(Bitmap bitmap, com.facebook.common.h.c<Bitmap> cVar, g gVar, int i) {
        this.f2703b = (Bitmap) i.a(bitmap);
        this.f2702a = com.facebook.common.h.a.a(this.f2703b, (com.facebook.common.h.c) i.a(cVar));
        this.f2704c = gVar;
        this.f2705d = i;
    }

    public c(com.facebook.common.h.a<Bitmap> aVar, g gVar, int i) {
        this.f2702a = (com.facebook.common.h.a) i.a(aVar.c());
        this.f2703b = this.f2702a.a();
        this.f2704c = gVar;
        this.f2705d = i;
    }

    @Override // com.facebook.imagepipeline.i.b, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.facebook.common.h.a<Bitmap> i = i();
        if (i != null) {
            i.close();
        }
    }

    private synchronized com.facebook.common.h.a<Bitmap> i() {
        com.facebook.common.h.a<Bitmap> aVar;
        aVar = this.f2702a;
        this.f2702a = null;
        this.f2703b = null;
        return aVar;
    }

    @Override // com.facebook.imagepipeline.i.b
    public synchronized boolean c() {
        return this.f2702a == null;
    }

    @Override // com.facebook.imagepipeline.i.a
    public Bitmap a() {
        return this.f2703b;
    }

    @Override // com.facebook.imagepipeline.i.b
    public int b() {
        return com.facebook.i.a.a(this.f2703b);
    }

    @Override // com.facebook.imagepipeline.i.e
    public int f() {
        if (this.f2705d == 90 || this.f2705d == 270) {
            return b(this.f2703b);
        }
        return a(this.f2703b);
    }

    @Override // com.facebook.imagepipeline.i.e
    public int g() {
        if (this.f2705d == 90 || this.f2705d == 270) {
            return a(this.f2703b);
        }
        return b(this.f2703b);
    }

    private static int a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    private static int b(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    public int h() {
        return this.f2705d;
    }

    @Override // com.facebook.imagepipeline.i.b
    public g d() {
        return this.f2704c;
    }
}
