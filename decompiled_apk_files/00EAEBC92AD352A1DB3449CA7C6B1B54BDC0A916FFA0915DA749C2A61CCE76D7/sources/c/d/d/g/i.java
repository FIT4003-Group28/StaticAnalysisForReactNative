package c.d.d.g;

import java.io.InputStream;
/* loaded from: classes.dex */
public class i extends InputStream {

    /* renamed from: b  reason: collision with root package name */
    final g f2830b;

    /* renamed from: c  reason: collision with root package name */
    int f2831c;

    /* renamed from: d  reason: collision with root package name */
    int f2832d;

    public i(g gVar) {
        c.d.d.d.i.a(!gVar.isClosed());
        c.d.d.d.i.a(gVar);
        this.f2830b = gVar;
        this.f2831c = 0;
        this.f2832d = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f2830b.size() - this.f2831c;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f2832d = this.f2831c;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        g gVar = this.f2830b;
        int i = this.f2831c;
        this.f2831c = i + 1;
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
        this.f2830b.a(this.f2831c, bArr, i, min);
        this.f2831c += min;
        return min;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f2831c = this.f2832d;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        c.d.d.d.i.a(j >= 0);
        int min = Math.min((int) j, available());
        this.f2831c += min;
        return min;
    }
}
