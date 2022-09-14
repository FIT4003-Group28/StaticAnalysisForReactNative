package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
@c.d.d.d.d
/* loaded from: classes.dex */
public class NativeMemoryChunk implements u, Closeable {

    /* renamed from: b  reason: collision with root package name */
    private final long f5190b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5191c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5192d;

    static {
        com.facebook.imagepipeline.nativecode.a.a();
    }

    public NativeMemoryChunk() {
        this.f5191c = 0;
        this.f5190b = 0L;
        this.f5192d = true;
    }

    public NativeMemoryChunk(int i) {
        c.d.d.d.i.a(i > 0);
        this.f5191c = i;
        this.f5190b = nativeAllocate(this.f5191c);
        this.f5192d = false;
    }

    private void b(int i, u uVar, int i2, int i3) {
        if (uVar instanceof NativeMemoryChunk) {
            c.d.d.d.i.b(!isClosed());
            c.d.d.d.i.b(!uVar.isClosed());
            w.a(i, uVar.b(), i2, i3, this.f5191c);
            nativeMemcpy(uVar.d() + i2, this.f5190b + i, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @c.d.d.d.d
    private static native long nativeAllocate(int i);

    @c.d.d.d.d
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @c.d.d.d.d
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @c.d.d.d.d
    private static native void nativeFree(long j);

    @c.d.d.d.d
    private static native void nativeMemcpy(long j, long j2, int i);

    @c.d.d.d.d
    private static native byte nativeReadByte(long j);

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized byte a(int i) {
        boolean z = true;
        c.d.d.d.i.b(!isClosed());
        c.d.d.d.i.a(i >= 0);
        if (i >= this.f5191c) {
            z = false;
        }
        c.d.d.d.i.a(z);
        return nativeReadByte(this.f5190b + i);
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized int a(int i, byte[] bArr, int i2, int i3) {
        int a2;
        c.d.d.d.i.a(bArr);
        c.d.d.d.i.b(!isClosed());
        a2 = w.a(i, i3, this.f5191c);
        w.a(i, bArr.length, i2, a2, this.f5191c);
        nativeCopyToByteArray(this.f5190b + i, bArr, i2, a2);
        return a2;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public long a() {
        return this.f5190b;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public void a(int i, u uVar, int i2, int i3) {
        c.d.d.d.i.a(uVar);
        if (uVar.a() == a()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(uVar)) + " which share the same address " + Long.toHexString(this.f5190b));
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
        return this.f5191c;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized int b(int i, byte[] bArr, int i2, int i3) {
        int a2;
        c.d.d.d.i.a(bArr);
        c.d.d.d.i.b(!isClosed());
        a2 = w.a(i, i3, this.f5191c);
        w.a(i, bArr.length, i2, a2, this.f5191c);
        nativeCopyFromByteArray(this.f5190b + i, bArr, i2, a2);
        return a2;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public ByteBuffer c() {
        return null;
    }

    @Override // com.facebook.imagepipeline.memory.u, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f5192d) {
            this.f5192d = true;
            nativeFree(this.f5190b);
        }
    }

    @Override // com.facebook.imagepipeline.memory.u
    public long d() {
        return this.f5190b;
    }

    protected void finalize() {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized boolean isClosed() {
        return this.f5192d;
    }
}
