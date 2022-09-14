package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class i implements u, Closeable {

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f5255b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5256c;

    /* renamed from: d  reason: collision with root package name */
    private final long f5257d = System.identityHashCode(this);

    public i(int i) {
        this.f5255b = ByteBuffer.allocateDirect(i);
        this.f5256c = i;
    }

    private void b(int i, u uVar, int i2, int i3) {
        if (uVar instanceof i) {
            c.d.d.d.i.b(!isClosed());
            c.d.d.d.i.b(!uVar.isClosed());
            w.a(i, uVar.b(), i2, i3, this.f5256c);
            this.f5255b.position(i);
            uVar.c().position(i2);
            byte[] bArr = new byte[i3];
            this.f5255b.get(bArr, 0, i3);
            uVar.c().put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized byte a(int i) {
        boolean z = true;
        c.d.d.d.i.b(!isClosed());
        c.d.d.d.i.a(i >= 0);
        if (i >= this.f5256c) {
            z = false;
        }
        c.d.d.d.i.a(z);
        return this.f5255b.get(i);
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized int a(int i, byte[] bArr, int i2, int i3) {
        int a2;
        c.d.d.d.i.a(bArr);
        c.d.d.d.i.b(!isClosed());
        a2 = w.a(i, i3, this.f5256c);
        w.a(i, bArr.length, i2, a2, this.f5256c);
        this.f5255b.position(i);
        this.f5255b.get(bArr, i2, a2);
        return a2;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public long a() {
        return this.f5257d;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public void a(int i, u uVar, int i2, int i3) {
        c.d.d.d.i.a(uVar);
        if (uVar.a() == a()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(a()) + " to BufferMemoryChunk " + Long.toHexString(uVar.a()) + " which are the same ");
            c.d.d.d.i.a(false);
        }
        if (uVar.a() < a()) {
            synchronized (uVar) {
                synchronized (this) {
                    b(i, uVar, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (uVar) {
                b(i, uVar, i2, i3);
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.u
    public int b() {
        return this.f5256c;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized int b(int i, byte[] bArr, int i2, int i3) {
        int a2;
        c.d.d.d.i.a(bArr);
        c.d.d.d.i.b(!isClosed());
        a2 = w.a(i, i3, this.f5256c);
        w.a(i, bArr.length, i2, a2, this.f5256c);
        this.f5255b.position(i);
        this.f5255b.put(bArr, i2, a2);
        return a2;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized ByteBuffer c() {
        return this.f5255b;
    }

    @Override // com.facebook.imagepipeline.memory.u, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f5255b = null;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public long d() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized boolean isClosed() {
        return this.f5255b == null;
    }
}
