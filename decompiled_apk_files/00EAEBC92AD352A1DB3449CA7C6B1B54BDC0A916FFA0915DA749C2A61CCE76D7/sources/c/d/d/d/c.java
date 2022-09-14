package c.d.d.d;

import java.io.FilterOutputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class c extends FilterOutputStream {

    /* renamed from: b  reason: collision with root package name */
    private long f2807b;

    public c(OutputStream outputStream) {
        super(outputStream);
        this.f2807b = 0L;
    }

    public long a() {
        return this.f2807b;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        this.f2807b++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f2807b += i2;
    }
}
