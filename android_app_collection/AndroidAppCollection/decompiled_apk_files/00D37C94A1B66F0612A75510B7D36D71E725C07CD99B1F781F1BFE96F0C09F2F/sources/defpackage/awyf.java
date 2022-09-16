package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: awyf  reason: default package */
/* loaded from: classes2.dex */
public class awyf implements awxx {
    private final InputStream a;
    private long b;
    private long c;
    private boolean d;
    private long e;

    public awyf(InputStream inputStream) {
        this(inputStream, -1L);
    }

    @Override // defpackage.awxx
    public synchronized long a() {
        return this.e;
    }

    @Override // defpackage.awxx
    public final synchronized int b(byte[] bArr, int i, int i2) {
        aqxo.q(bArr.length - i >= i2, "Cannot read into a buffer smaller than given length");
        if (i2 == 0) {
            return 0;
        }
        if (this.d) {
            this.a.reset();
            this.d = false;
        }
        int read = this.a.read(bArr, i, (int) Math.min(i2, 1048576 - (this.c - this.b)));
        if (read == -1) {
            long j = this.e;
            if (j == -1) {
                this.e = this.c;
            } else if (this.c < j) {
                throw new IOException("The stream ended before all expected bytes were read");
            }
            return 0;
        }
        long j2 = this.c + read;
        this.c = j2;
        long j3 = this.e;
        if (j3 != -1 && j2 > j3) {
            throw new IOException("The stream continues beyond expected size");
        }
        return read;
    }

    @Override // defpackage.awxx
    public final synchronized long c() {
        return this.b;
    }

    @Override // defpackage.awxx, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    @Override // defpackage.awxx
    public final synchronized long d() {
        return 1048576L;
    }

    @Override // defpackage.awxx
    public final synchronized long e() {
        return this.c;
    }

    @Override // defpackage.awxx
    public final synchronized long f(long j) {
        long min = Math.min(j, 1048576 - (this.c - this.b));
        if (min == 0) {
            return 0L;
        }
        if (this.d) {
            this.a.reset();
            this.d = false;
        }
        long skip = this.a.skip(min);
        if (skip != 0 || !i()) {
            this.c += skip;
            return skip;
        }
        do {
            skip = this.a.skip(min);
        } while (skip == 0);
        this.c += skip;
        return skip;
    }

    @Override // defpackage.awxx
    public final synchronized void g() {
        if (this.b != this.c) {
            this.a.mark(1048577);
        }
        this.b = this.c;
    }

    @Override // defpackage.awxx
    public final synchronized void h() {
        this.c = this.b;
        this.d = true;
    }

    @Override // defpackage.awxx
    public final synchronized boolean i() {
        if (this.d) {
            this.a.reset();
            this.d = false;
        }
        if (this.a.available() > 0) {
            return true;
        }
        if (this.a.read() == -1) {
            this.e = this.c;
            return false;
        }
        this.a.reset();
        long j = this.c;
        long j2 = this.b;
        while (true) {
            j -= j2;
            if (j <= 0) {
                return true;
            }
            j2 = this.a.skip(j);
        }
    }

    public awyf(InputStream inputStream, long j) {
        if (!inputStream.markSupported()) {
            this.a = new BufferedInputStream(inputStream);
        } else {
            this.a = inputStream;
        }
        this.e = j;
        this.a.mark(1048577);
    }
}
