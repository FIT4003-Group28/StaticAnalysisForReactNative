package com.facebook.imagepipeline.memory;

import c.d.d.g.g;
/* loaded from: classes.dex */
public class x implements c.d.d.g.g {

    /* renamed from: b  reason: collision with root package name */
    private final int f5271b;

    /* renamed from: c  reason: collision with root package name */
    c.d.d.h.a<u> f5272c;

    public x(c.d.d.h.a<u> aVar, int i) {
        c.d.d.d.i.a(aVar);
        c.d.d.d.i.a(i >= 0 && i <= aVar.b().b());
        this.f5272c = aVar.m124clone();
        this.f5271b = i;
    }

    @Override // c.d.d.g.g
    public synchronized byte a(int i) {
        a();
        boolean z = true;
        c.d.d.d.i.a(i >= 0);
        if (i >= this.f5271b) {
            z = false;
        }
        c.d.d.d.i.a(z);
        return this.f5272c.b().a(i);
    }

    @Override // c.d.d.g.g
    public synchronized int a(int i, byte[] bArr, int i2, int i3) {
        a();
        c.d.d.d.i.a(i + i3 <= this.f5271b);
        return this.f5272c.b().a(i, bArr, i2, i3);
    }

    synchronized void a() {
        if (isClosed()) {
            throw new g.a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        c.d.d.h.a.b(this.f5272c);
        this.f5272c = null;
    }

    @Override // c.d.d.g.g
    public synchronized boolean isClosed() {
        return !c.d.d.h.a.c(this.f5272c);
    }

    @Override // c.d.d.g.g
    public synchronized int size() {
        a();
        return this.f5271b;
    }
}
