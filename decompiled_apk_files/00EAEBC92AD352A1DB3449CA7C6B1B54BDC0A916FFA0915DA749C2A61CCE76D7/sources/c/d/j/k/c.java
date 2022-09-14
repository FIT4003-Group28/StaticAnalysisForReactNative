package c.d.j.k;

import android.graphics.Bitmap;
import c.d.d.d.i;
/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: b  reason: collision with root package name */
    private c.d.d.h.a<Bitmap> f3374b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Bitmap f3375c;

    /* renamed from: d  reason: collision with root package name */
    private final g f3376d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3377e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3378f;

    public c(Bitmap bitmap, c.d.d.h.c<Bitmap> cVar, g gVar, int i) {
        this(bitmap, cVar, gVar, i, 0);
    }

    public c(Bitmap bitmap, c.d.d.h.c<Bitmap> cVar, g gVar, int i, int i2) {
        i.a(bitmap);
        this.f3375c = bitmap;
        Bitmap bitmap2 = this.f3375c;
        i.a(cVar);
        this.f3374b = c.d.d.h.a.a(bitmap2, cVar);
        this.f3376d = gVar;
        this.f3377e = i;
        this.f3378f = i2;
    }

    public c(c.d.d.h.a<Bitmap> aVar, g gVar, int i, int i2) {
        c.d.d.h.a<Bitmap> a2 = aVar.a();
        i.a(a2);
        this.f3374b = a2;
        this.f3375c = this.f3374b.b();
        this.f3376d = gVar;
        this.f3377e = i;
        this.f3378f = i2;
    }

    private static int a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int b(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    private synchronized c.d.d.h.a<Bitmap> i() {
        c.d.d.h.a<Bitmap> aVar;
        aVar = this.f3374b;
        this.f3374b = null;
        this.f3375c = null;
        return aVar;
    }

    @Override // c.d.j.k.e
    public int a() {
        int i;
        return (this.f3377e % 180 != 0 || (i = this.f3378f) == 5 || i == 7) ? b(this.f3375c) : a(this.f3375c);
    }

    @Override // c.d.j.k.e
    public int b() {
        int i;
        return (this.f3377e % 180 != 0 || (i = this.f3378f) == 5 || i == 7) ? a(this.f3375c) : b(this.f3375c);
    }

    @Override // c.d.j.k.b
    public g c() {
        return this.f3376d;
    }

    @Override // c.d.j.k.b, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c.d.d.h.a<Bitmap> i = i();
        if (i != null) {
            i.close();
        }
    }

    @Override // c.d.j.k.b
    public int d() {
        return com.facebook.imageutils.a.a(this.f3375c);
    }

    @Override // c.d.j.k.a
    public Bitmap f() {
        return this.f3375c;
    }

    public int g() {
        return this.f3378f;
    }

    public int h() {
        return this.f3377e;
    }

    @Override // c.d.j.k.b
    public synchronized boolean isClosed() {
        return this.f3374b == null;
    }
}
