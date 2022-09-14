package com.facebook.common.d;

import java.io.FilterOutputStream;
import java.io.OutputStream;
/* compiled from: CountingOutputStream.java */
/* loaded from: classes.dex */
public class c extends FilterOutputStream {

    /* renamed from: a  reason: collision with root package name */
    private long f2267a;

    public c(OutputStream outputStream) {
        super(outputStream);
        this.f2267a = 0L;
    }

    public long a() {
        return this.f2267a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.f2267a += i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        this.out.write(i);
        this.f2267a++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.out.close();
    }
}
