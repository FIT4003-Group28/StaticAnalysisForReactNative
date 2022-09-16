package c.d.d.g;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class f extends InputStream {

    /* renamed from: b  reason: collision with root package name */
    private final InputStream f2824b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f2825c;

    /* renamed from: d  reason: collision with root package name */
    private final c.d.d.h.c<byte[]> f2826d;

    /* renamed from: e  reason: collision with root package name */
    private int f2827e;

    /* renamed from: f  reason: collision with root package name */
    private int f2828f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2829g;

    public f(InputStream inputStream, byte[] bArr, c.d.d.h.c<byte[]> cVar) {
        c.d.d.d.i.a(inputStream);
        this.f2824b = inputStream;
        c.d.d.d.i.a(bArr);
        this.f2825c = bArr;
        c.d.d.d.i.a(cVar);
        this.f2826d = cVar;
        this.f2827e = 0;
        this.f2828f = 0;
        this.f2829g = false;
    }

    private boolean a() {
        if (this.f2828f < this.f2827e) {
            return true;
        }
        int read = this.f2824b.read(this.f2825c);
        if (read <= 0) {
            return false;
        }
        this.f2827e = read;
        this.f2828f = 0;
        return true;
    }

    private void b() {
        if (!this.f2829g) {
            return;
        }
        throw new IOException("stream already closed");
    }

    @Override // java.io.InputStream
    public int available() {
        c.d.d.d.i.b(this.f2828f <= this.f2827e);
        b();
        return (this.f2827e - this.f2828f) + this.f2824b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f2829g) {
            this.f2829g = true;
            this.f2826d.a(this.f2825c);
            super.close();
        }
    }

    protected void finalize() {
        if (!this.f2829g) {
            c.d.d.e.a.b("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() {
        c.d.d.d.i.b(this.f2828f <= this.f2827e);
        b();
        if (!a()) {
            return -1;
        }
        byte[] bArr = this.f2825c;
        int i = this.f2828f;
        this.f2828f = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        c.d.d.d.i.b(this.f2828f <= this.f2827e);
        b();
        if (!a()) {
            return -1;
        }
        int min = Math.min(this.f2827e - this.f2828f, i2);
        System.arraycopy(this.f2825c, this.f2828f, bArr, i, min);
        this.f2828f += min;
        return min;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        c.d.d.d.i.b(this.f2828f <= this.f2827e);
        b();
        int i = this.f2827e;
        int i2 = this.f2828f;
        long j2 = i - i2;
        if (j2 >= j) {
            this.f2828f = (int) (i2 + j);
            return j;
        }
        this.f2828f = i;
        return j2 + this.f2824b.skip(j - j2);
    }
}
