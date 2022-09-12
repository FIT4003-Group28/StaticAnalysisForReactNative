package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: eann  reason: default package */
/* loaded from: classes6.dex */
public final class eann extends InputStream {
    protected final eanm a;
    final InputStream b;
    byte[] c;
    int d;
    final int e;

    public eann(eanm eanmVar, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.a = eanmVar;
        this.b = inputStream;
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    private final void a() {
        byte[] bArr = this.c;
        if (bArr != null) {
            this.c = null;
            eanm eanmVar = this.a;
            if (eanmVar == null) {
                return;
            }
            eanmVar.c(bArr);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.c != null ? this.e - this.d : this.b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
        this.b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        if (this.c == null) {
            this.b.mark(i);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.c == null && this.b.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (bArr != null) {
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            int i3 = bArr[i] & 255;
            if (i2 >= this.e) {
                a();
            }
            return i3;
        }
        return this.b.read();
    }

    @Override // java.io.InputStream
    public final void reset() {
        if (this.c == null) {
            this.b.reset();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long j2;
        if (this.c != null) {
            int i = this.e;
            int i2 = this.d;
            j2 = i - i2;
            if (j2 > j) {
                this.d = i2 + ((int) j);
                return j;
            }
            a();
            j -= j2;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this.b.skip(j) : j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.c;
        if (bArr2 != null) {
            int i3 = this.e;
            int i4 = this.d;
            int i5 = i3 - i4;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i4, bArr, i, i2);
            int i6 = this.d + i2;
            this.d = i6;
            if (i6 >= this.e) {
                a();
            }
            return i2;
        }
        return this.b.read(bArr, i, i2);
    }
}
