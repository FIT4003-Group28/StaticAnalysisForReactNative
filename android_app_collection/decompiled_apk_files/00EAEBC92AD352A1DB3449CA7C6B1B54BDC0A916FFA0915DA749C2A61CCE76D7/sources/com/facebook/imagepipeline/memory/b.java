package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f5203a;

    /* renamed from: b  reason: collision with root package name */
    private long f5204b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5205c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5206d;

    /* renamed from: e  reason: collision with root package name */
    private final c.d.d.h.c<Bitmap> f5207e;

    /* loaded from: classes.dex */
    class a implements c.d.d.h.c<Bitmap> {
        a() {
        }

        @Override // c.d.d.h.c
        public void a(Bitmap bitmap) {
            try {
                b.this.a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public b(int i, int i2) {
        boolean z = true;
        c.d.d.d.i.a(i > 0);
        c.d.d.d.i.a(i2 <= 0 ? false : z);
        this.f5205c = i;
        this.f5206d = i2;
        this.f5207e = new a();
    }

    public synchronized int a() {
        return this.f5203a;
    }

    public synchronized void a(Bitmap bitmap) {
        int a2 = com.facebook.imageutils.a.a(bitmap);
        c.d.d.d.i.a(this.f5203a > 0, "No bitmaps registered.");
        long j = a2;
        c.d.d.d.i.a(j <= this.f5204b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(a2), Long.valueOf(this.f5204b));
        this.f5204b -= j;
        this.f5203a--;
    }

    public synchronized int b() {
        return this.f5205c;
    }

    public synchronized boolean b(Bitmap bitmap) {
        int a2 = com.facebook.imageutils.a.a(bitmap);
        if (this.f5203a < this.f5205c) {
            long j = a2;
            if (this.f5204b + j <= this.f5206d) {
                this.f5203a++;
                this.f5204b += j;
                return true;
            }
        }
        return false;
    }

    public synchronized int c() {
        return this.f5206d;
    }

    public c.d.d.h.c<Bitmap> d() {
        return this.f5207e;
    }

    public synchronized long e() {
        return this.f5204b;
    }
}
