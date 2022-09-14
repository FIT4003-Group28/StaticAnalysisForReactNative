package com.facebook.common.k;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: TailAppendingInputStream.java */
/* loaded from: classes.dex */
public class b extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f2320a;

    /* renamed from: b  reason: collision with root package name */
    private int f2321b;

    /* renamed from: c  reason: collision with root package name */
    private int f2322c;

    public b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        }
        if (bArr == null) {
            throw new NullPointerException();
        }
        this.f2320a = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = this.in.read();
        return read != -1 ? read : a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int a2 = a();
            if (a2 == -1) {
                break;
            }
            bArr[i + i3] = (byte) a2;
            i3++;
        }
        if (i3 <= 0) {
            return -1;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (this.in.markSupported()) {
            this.in.reset();
            this.f2321b = this.f2322c;
            return;
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (this.in.markSupported()) {
            super.mark(i);
            this.f2322c = this.f2321b;
        }
    }

    private int a() {
        if (this.f2321b >= this.f2320a.length) {
            return -1;
        }
        byte[] bArr = this.f2320a;
        int i = this.f2321b;
        this.f2321b = i + 1;
        return bArr[i] & 255;
    }
}
