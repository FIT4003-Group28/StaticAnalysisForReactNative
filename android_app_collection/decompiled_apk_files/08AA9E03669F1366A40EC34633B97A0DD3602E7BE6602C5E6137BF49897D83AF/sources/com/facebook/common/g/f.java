package com.facebook.common.g;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: PooledByteArrayBufferedInputStream.java */
/* loaded from: classes.dex */
public class f extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f2282a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f2283b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.common.h.c<byte[]> f2284c;

    /* renamed from: d  reason: collision with root package name */
    private int f2285d = 0;
    private int e = 0;
    private boolean f = false;

    public f(InputStream inputStream, byte[] bArr, com.facebook.common.h.c<byte[]> cVar) {
        this.f2282a = (InputStream) com.facebook.common.d.i.a(inputStream);
        this.f2283b = (byte[]) com.facebook.common.d.i.a(bArr);
        this.f2284c = (com.facebook.common.h.c) com.facebook.common.d.i.a(cVar);
    }

    @Override // java.io.InputStream
    public int read() {
        com.facebook.common.d.i.b(this.e <= this.f2285d);
        b();
        if (!a()) {
            return -1;
        }
        byte[] bArr = this.f2283b;
        int i = this.e;
        this.e = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        com.facebook.common.d.i.b(this.e <= this.f2285d);
        b();
        if (!a()) {
            return -1;
        }
        int min = Math.min(this.f2285d - this.e, i2);
        System.arraycopy(this.f2283b, this.e, bArr, i, min);
        this.e += min;
        return min;
    }

    @Override // java.io.InputStream
    public int available() {
        com.facebook.common.d.i.b(this.e <= this.f2285d);
        b();
        return (this.f2285d - this.e) + this.f2282a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f) {
            this.f = true;
            this.f2284c.a(this.f2283b);
            super.close();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        com.facebook.common.d.i.b(this.e <= this.f2285d);
        b();
        long j2 = this.f2285d - this.e;
        if (j2 >= j) {
            this.e = (int) (this.e + j);
            return j;
        }
        this.e = this.f2285d;
        return j2 + this.f2282a.skip(j - j2);
    }

    private boolean a() {
        if (this.e < this.f2285d) {
            return true;
        }
        int read = this.f2282a.read(this.f2283b);
        if (read <= 0) {
            return false;
        }
        this.f2285d = read;
        this.e = 0;
        return true;
    }

    private void b() {
        if (this.f) {
            throw new IOException("stream already closed");
        }
    }

    protected void finalize() {
        if (!this.f) {
            com.facebook.common.e.a.d("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }
}
