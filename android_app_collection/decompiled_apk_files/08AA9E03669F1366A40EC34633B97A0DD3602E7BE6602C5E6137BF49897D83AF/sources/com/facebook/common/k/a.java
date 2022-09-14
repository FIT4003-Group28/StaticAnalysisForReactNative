package com.facebook.common.k;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: LimitedInputStream.java */
/* loaded from: classes.dex */
public class a extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private int f2318a;

    /* renamed from: b  reason: collision with root package name */
    private int f2319b;

    public a(InputStream inputStream, int i) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        }
        if (i < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }
        this.f2318a = i;
        this.f2319b = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.f2318a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f2318a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.f2318a == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, Math.min(i2, this.f2318a));
        if (read > 0) {
            this.f2318a -= read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.f2318a));
        this.f2318a = (int) (this.f2318a - skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return Math.min(this.in.available(), this.f2318a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (this.in.markSupported()) {
            this.in.mark(i);
            this.f2319b = this.f2318a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if (this.f2319b == -1) {
            throw new IOException("mark not set");
        }
        this.in.reset();
        this.f2318a = this.f2319b;
    }
}
