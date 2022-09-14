package com.facebook.imagepipeline.memory;

import com.facebook.common.g.g;
/* compiled from: NativePooledByteBuffer.java */
/* loaded from: classes.dex */
public class m implements com.facebook.common.g.g {

    /* renamed from: a  reason: collision with root package name */
    com.facebook.common.h.a<NativeMemoryChunk> f2956a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2957b;

    public m(com.facebook.common.h.a<NativeMemoryChunk> aVar, int i) {
        com.facebook.common.d.i.a(aVar);
        com.facebook.common.d.i.a(i >= 0 && i <= aVar.a().b());
        this.f2956a = aVar.clone();
        this.f2957b = i;
    }

    @Override // com.facebook.common.g.g
    public synchronized int a() {
        c();
        return this.f2957b;
    }

    @Override // com.facebook.common.g.g
    public synchronized byte a(int i) {
        c();
        boolean z = false;
        com.facebook.common.d.i.a(i >= 0);
        if (i < this.f2957b) {
            z = true;
        }
        com.facebook.common.d.i.a(z);
        return this.f2956a.a().a(i);
    }

    @Override // com.facebook.common.g.g
    public synchronized void a(int i, byte[] bArr, int i2, int i3) {
        c();
        com.facebook.common.d.i.a(i + i3 <= this.f2957b);
        this.f2956a.a().b(i, bArr, i2, i3);
    }

    @Override // com.facebook.common.g.g
    public synchronized boolean b() {
        return !com.facebook.common.h.a.a((com.facebook.common.h.a<?>) this.f2956a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        com.facebook.common.h.a.c(this.f2956a);
        this.f2956a = null;
    }

    synchronized void c() {
        if (b()) {
            throw new g.a();
        }
    }
}
