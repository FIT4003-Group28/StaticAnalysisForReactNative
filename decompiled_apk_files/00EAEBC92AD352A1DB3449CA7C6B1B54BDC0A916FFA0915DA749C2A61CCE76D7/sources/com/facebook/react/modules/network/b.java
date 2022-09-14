package com.facebook.react.modules.network;

import java.io.FilterOutputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class b extends FilterOutputStream {

    /* renamed from: b  reason: collision with root package name */
    private long f5702b;

    public b(OutputStream outputStream) {
        super(outputStream);
        this.f5702b = 0L;
    }

    public long a() {
        return this.f5702b;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        this.f5702b++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f5702b += i2;
    }
}
