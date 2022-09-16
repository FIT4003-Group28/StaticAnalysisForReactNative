package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class s implements d {

    /* renamed from: a  reason: collision with root package name */
    protected final d0<Bitmap> f5264a = new e();

    /* renamed from: b  reason: collision with root package name */
    private final int f5265b;

    /* renamed from: c  reason: collision with root package name */
    private int f5266c;

    /* renamed from: d  reason: collision with root package name */
    private final h0 f5267d;

    /* renamed from: e  reason: collision with root package name */
    private int f5268e;

    public s(int i, int i2, h0 h0Var, c.d.d.g.c cVar) {
        this.f5265b = i;
        this.f5266c = i2;
        this.f5267d = h0Var;
        if (cVar != null) {
            cVar.a(this);
        }
    }

    private Bitmap a(int i) {
        this.f5267d.a(i);
        return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
    }

    private synchronized void b(int i) {
        Bitmap a2;
        while (this.f5268e > i && (a2 = this.f5264a.a()) != null) {
            int a3 = this.f5264a.a(a2);
            this.f5268e -= a3;
            this.f5267d.c(a3);
        }
    }

    @Override // c.d.d.g.e, c.d.d.h.c
    public void a(Bitmap bitmap) {
        int a2 = this.f5264a.a(bitmap);
        if (a2 <= this.f5266c) {
            this.f5267d.d(a2);
            this.f5264a.b(bitmap);
            synchronized (this) {
                this.f5268e += a2;
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.d.d.g.e
    /* renamed from: get */
    public synchronized Bitmap mo186get(int i) {
        if (this.f5268e > this.f5265b) {
            b(this.f5265b);
        }
        Bitmap mo179get = this.f5264a.mo179get(i);
        if (mo179get == null) {
            return a(i);
        }
        int a2 = this.f5264a.a(mo179get);
        this.f5268e -= a2;
        this.f5267d.b(a2);
        return mo179get;
    }
}
