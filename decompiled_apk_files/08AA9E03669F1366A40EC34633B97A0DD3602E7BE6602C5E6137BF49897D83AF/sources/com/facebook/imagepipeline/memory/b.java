package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
/* compiled from: BitmapCounter.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f2940a;

    /* renamed from: b  reason: collision with root package name */
    private long f2941b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2942c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2943d;
    private final com.facebook.common.h.c<Bitmap> e;

    public b(int i, int i2) {
        boolean z = false;
        com.facebook.common.d.i.a(i > 0);
        com.facebook.common.d.i.a(i2 > 0 ? true : z);
        this.f2942c = i;
        this.f2943d = i2;
        this.e = new com.facebook.common.h.c<Bitmap>() { // from class: com.facebook.imagepipeline.memory.b.1
            @Override // com.facebook.common.h.c
            public void a(Bitmap bitmap) {
                try {
                    b.this.b(bitmap);
                } finally {
                    bitmap.recycle();
                }
            }
        };
    }

    public synchronized boolean a(Bitmap bitmap) {
        int a2 = com.facebook.i.a.a(bitmap);
        if (this.f2940a < this.f2942c) {
            long j = a2;
            if (this.f2941b + j <= this.f2943d) {
                this.f2940a++;
                this.f2941b += j;
                return true;
            }
        }
        return false;
    }

    public synchronized void b(Bitmap bitmap) {
        int a2 = com.facebook.i.a.a(bitmap);
        com.facebook.common.d.i.a(this.f2940a > 0, "No bitmaps registered.");
        long j = a2;
        com.facebook.common.d.i.a(j <= this.f2941b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(a2), Long.valueOf(this.f2941b));
        this.f2941b -= j;
        this.f2940a--;
    }

    public com.facebook.common.h.c<Bitmap> a() {
        return this.e;
    }
}
