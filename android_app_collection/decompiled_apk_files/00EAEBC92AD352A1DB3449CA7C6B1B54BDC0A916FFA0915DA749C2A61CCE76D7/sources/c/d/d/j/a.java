package c.d.d.j;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class a extends FilterInputStream {

    /* renamed from: b  reason: collision with root package name */
    private int f2860b;

    /* renamed from: c  reason: collision with root package name */
    private int f2861c;

    public a(InputStream inputStream, int i) {
        super(inputStream);
        if (inputStream != null) {
            if (i < 0) {
                throw new IllegalArgumentException("limit must be >= 0");
            }
            this.f2860b = i;
            this.f2861c = -1;
            return;
        }
        throw new NullPointerException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.f2860b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i);
            this.f2861c = this.f2860b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.f2860b == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f2860b--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.f2860b;
        if (i3 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, Math.min(i2, i3));
        if (read > 0) {
            this.f2860b -= read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f2861c == -1) {
                throw new IOException("mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f2860b = this.f2861c;
            return;
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f2860b));
        this.f2860b = (int) (this.f2860b - skip);
        return skip;
    }
}
