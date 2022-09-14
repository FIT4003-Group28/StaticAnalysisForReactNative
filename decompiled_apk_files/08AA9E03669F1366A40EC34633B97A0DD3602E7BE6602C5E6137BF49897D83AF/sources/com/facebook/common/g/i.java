package com.facebook.common.g;

import java.io.InputStream;
/* compiled from: PooledByteBufferInputStream.java */
/* loaded from: classes.dex */
public class i extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    final g f2286a;

    /* renamed from: b  reason: collision with root package name */
    int f2287b;

    /* renamed from: c  reason: collision with root package name */
    int f2288c;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    public i(g gVar) {
        com.facebook.common.d.i.a(!gVar.b());
        this.f2286a = (g) com.facebook.common.d.i.a(gVar);
        this.f2287b = 0;
        this.f2288c = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f2286a.a() - this.f2287b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f2288c = this.f2287b;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        g gVar = this.f2286a;
        int i = this.f2287b;
        this.f2287b = i + 1;
        return gVar.a(i) & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.f2286a.a(this.f2287b, bArr, i, min);
        this.f2287b += min;
        return min;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f2287b = this.f2288c;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        com.facebook.common.d.i.a(j >= 0);
        int min = Math.min((int) j, available());
        this.f2287b += min;
        return min;
    }
}
