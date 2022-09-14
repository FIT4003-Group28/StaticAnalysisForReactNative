package c.d.d.j;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class b extends FilterInputStream {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f2862b;

    /* renamed from: c  reason: collision with root package name */
    private int f2863c;

    /* renamed from: d  reason: collision with root package name */
    private int f2864d;

    public b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (inputStream != null) {
            if (bArr == null) {
                throw new NullPointerException();
            }
            this.f2862b = bArr;
            return;
        }
        throw new NullPointerException();
    }

    private int a() {
        int i = this.f2863c;
        byte[] bArr = this.f2862b;
        if (i >= bArr.length) {
            return -1;
        }
        this.f2863c = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i);
            this.f2864d = this.f2863c;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = ((FilterInputStream) this).in.read();
        return read != -1 ? read : a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
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
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.reset();
            this.f2863c = this.f2864d;
            return;
        }
        throw new IOException("mark is not supported");
    }
}
