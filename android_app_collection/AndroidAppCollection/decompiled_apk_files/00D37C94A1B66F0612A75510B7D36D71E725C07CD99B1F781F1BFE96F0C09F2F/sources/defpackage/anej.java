package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anej  reason: default package */
/* loaded from: classes.dex */
public final class anej extends FilterInputStream {
    private long a;
    private long b;

    public anej(InputStream inputStream) {
        super(inputStream);
        this.b = -1L;
        inputStream.getClass();
        aqxo.q(true, "limit must be non-negative");
        this.a = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(this.in.available(), this.a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.b = this.a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.in.markSupported()) {
            if (this.b == -1) {
                throw new IOException("Mark not set");
            }
            this.in.reset();
            this.a = this.b;
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.a));
        this.a -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.a;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.a -= read;
        }
        return read;
    }
}
