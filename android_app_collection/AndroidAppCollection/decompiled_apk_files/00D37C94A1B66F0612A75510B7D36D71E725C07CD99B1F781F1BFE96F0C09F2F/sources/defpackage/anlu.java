package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: anlu  reason: default package */
/* loaded from: classes.dex */
public final class anlu extends InputStream {
    private final byte[] a;
    private int b;
    private int c;
    private final anma d;

    public anlu(InputStream inputStream) {
        anma anmaVar = new anma();
        this.d = anmaVar;
        this.a = new byte[256];
        this.b = 0;
        this.c = 0;
        try {
            anlx.c(anmaVar, inputStream);
        } catch (anlv e) {
            throw new IOException("Brotli decoder initialization failed", e);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        anlx.a(this.d);
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.c;
        if (i >= this.b) {
            byte[] bArr = this.a;
            int length = bArr.length;
            int read = read(bArr, 0, 256);
            this.b = read;
            this.c = 0;
            if (read == -1) {
                return -1;
            }
            i = 0;
        }
        byte[] bArr2 = this.a;
        this.c = i + 1;
        return bArr2[i] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(23);
            sb.append("Bad offset: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Bad length: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            int i3 = i + i2;
            int length = bArr.length;
            if (i3 > length) {
                StringBuilder sb3 = new StringBuilder(42);
                sb3.append("Buffer overflow: ");
                sb3.append(i3);
                sb3.append(" > ");
                sb3.append(length);
                throw new IllegalArgumentException(sb3.toString());
            } else if (i2 == 0) {
                return 0;
            } else {
                int max = Math.max(this.b - this.c, 0);
                if (max != 0) {
                    max = Math.min(max, i2);
                    System.arraycopy(this.a, this.c, bArr, i, max);
                    this.c += max;
                    i += max;
                    i2 -= max;
                    if (i2 == 0) {
                        return max;
                    }
                }
                try {
                    anma anmaVar = this.d;
                    anmaVar.f = bArr;
                    anmaVar.ac = i;
                    anmaVar.ad = i2;
                    anmaVar.ae = 0;
                    anlx.b(anmaVar);
                    int i4 = this.d.ae;
                    if (i4 != 0) {
                        return i4 + max;
                    }
                    return -1;
                } catch (anlv e) {
                    throw new IOException("Brotli stream decoding failed", e);
                }
            }
        }
    }
}
