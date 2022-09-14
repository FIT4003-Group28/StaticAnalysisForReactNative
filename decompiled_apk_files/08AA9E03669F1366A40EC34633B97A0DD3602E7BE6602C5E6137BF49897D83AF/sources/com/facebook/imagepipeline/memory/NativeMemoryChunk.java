package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
@com.facebook.common.d.d
/* loaded from: classes.dex */
public class NativeMemoryChunk implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final long f2931a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2932b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2933c;

    @com.facebook.common.d.d
    private static native long nativeAllocate(int i);

    @com.facebook.common.d.d
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @com.facebook.common.d.d
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @com.facebook.common.d.d
    private static native void nativeFree(long j);

    @com.facebook.common.d.d
    private static native void nativeMemcpy(long j, long j2, int i);

    @com.facebook.common.d.d
    private static native byte nativeReadByte(long j);

    static {
        com.facebook.imagepipeline.nativecode.a.a();
    }

    public NativeMemoryChunk(int i) {
        com.facebook.common.d.i.a(i > 0);
        this.f2932b = i;
        this.f2931a = nativeAllocate(this.f2932b);
        this.f2933c = false;
    }

    public NativeMemoryChunk() {
        this.f2932b = 0;
        this.f2931a = 0L;
        this.f2933c = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f2933c) {
            this.f2933c = true;
            nativeFree(this.f2931a);
        }
    }

    public synchronized boolean a() {
        return this.f2933c;
    }

    public int b() {
        return this.f2932b;
    }

    public synchronized int a(int i, byte[] bArr, int i2, int i3) {
        int a2;
        com.facebook.common.d.i.a(bArr);
        com.facebook.common.d.i.b(!a());
        a2 = a(i, i3);
        a(i, bArr.length, i2, a2);
        nativeCopyFromByteArray(this.f2931a + i, bArr, i2, a2);
        return a2;
    }

    public synchronized int b(int i, byte[] bArr, int i2, int i3) {
        int a2;
        com.facebook.common.d.i.a(bArr);
        com.facebook.common.d.i.b(!a());
        a2 = a(i, i3);
        a(i, bArr.length, i2, a2);
        nativeCopyToByteArray(this.f2931a + i, bArr, i2, a2);
        return a2;
    }

    public synchronized byte a(int i) {
        com.facebook.common.d.i.b(!a());
        boolean z = false;
        com.facebook.common.d.i.a(i >= 0);
        if (i < this.f2932b) {
            z = true;
        }
        com.facebook.common.d.i.a(z);
        return nativeReadByte(this.f2931a + i);
    }

    public void a(int i, NativeMemoryChunk nativeMemoryChunk, int i2, int i3) {
        com.facebook.common.d.i.a(nativeMemoryChunk);
        if (nativeMemoryChunk.f2931a == this.f2931a) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(nativeMemoryChunk)) + " which share the same address " + Long.toHexString(this.f2931a));
            com.facebook.common.d.i.a(false);
        }
        if (nativeMemoryChunk.f2931a < this.f2931a) {
            synchronized (nativeMemoryChunk) {
                synchronized (this) {
                    b(i, nativeMemoryChunk, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (nativeMemoryChunk) {
                b(i, nativeMemoryChunk, i2, i3);
            }
        }
    }

    private void b(int i, NativeMemoryChunk nativeMemoryChunk, int i2, int i3) {
        com.facebook.common.d.i.b(!a());
        com.facebook.common.d.i.b(!nativeMemoryChunk.a());
        a(i, nativeMemoryChunk.f2932b, i2, i3);
        nativeMemcpy(nativeMemoryChunk.f2931a + i2, this.f2931a + i, i3);
    }

    protected void finalize() {
        if (a()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. Underlying address = " + Long.toHexString(this.f2931a));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    private int a(int i, int i2) {
        return Math.min(Math.max(0, this.f2932b - i), i2);
    }

    private void a(int i, int i2, int i3, int i4) {
        boolean z = false;
        com.facebook.common.d.i.a(i4 >= 0);
        com.facebook.common.d.i.a(i >= 0);
        com.facebook.common.d.i.a(i3 >= 0);
        com.facebook.common.d.i.a(i + i4 <= this.f2932b);
        if (i3 + i4 <= i2) {
            z = true;
        }
        com.facebook.common.d.i.a(z);
    }
}
