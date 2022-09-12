package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: duid  reason: default package */
/* loaded from: classes6.dex */
public final class duid implements duhv {
    private final int a;
    private final int b;
    private final InputStream c;
    private long d;
    private long e;
    private boolean f;
    private long g;

    public duid(InputStream inputStream, int i) {
        if (!inputStream.markSupported()) {
            this.c = new BufferedInputStream(inputStream);
        } else {
            this.c = inputStream;
        }
        this.g = -1L;
        this.a = i;
        int i2 = i + 1;
        this.b = i2;
        this.c.mark(i2);
    }

    @Override // defpackage.duhv
    public final synchronized int a(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        dbsk.b(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE - i >= i2, "Cannot read into a buffer smaller than given length");
        if (i2 == 0) {
            return 0;
        }
        if (this.f) {
            this.c.reset();
            this.f = false;
        }
        int read = this.c.read(bArr, i, (int) Math.min(i2, this.a - (this.e - this.d)));
        if (read == -1) {
            long j = this.g;
            if (j == -1) {
                this.g = this.e;
            } else if (this.e < j) {
                throw new IOException("The stream ended before all expected bytes were read");
            }
            return 0;
        }
        long j2 = this.e + read;
        this.e = j2;
        long j3 = this.g;
        if (j3 != -1 && j2 > j3) {
            throw new IOException("The stream continues beyond expected size");
        }
        return read;
    }

    @Override // defpackage.duhv
    public final synchronized void b() {
        if (this.d != this.e) {
            this.c.mark(this.b);
        }
        this.d = this.e;
    }

    @Override // defpackage.duhv
    public final synchronized long c() {
        return this.d;
    }

    @Override // defpackage.duhv, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.c.close();
    }

    @Override // defpackage.duhv
    public final synchronized long d() {
        return this.e;
    }

    @Override // defpackage.duhv
    public final synchronized long e() {
        return this.a;
    }

    @Override // defpackage.duhv
    public final synchronized void f() {
        this.e = this.d;
        this.f = true;
    }

    @Override // defpackage.duhv
    public final synchronized long g(long j) {
        long min = Math.min(j, this.a - (this.e - this.d));
        if (min == 0) {
            return 0L;
        }
        if (this.f) {
            this.c.reset();
            this.f = false;
        }
        long skip = this.c.skip(min);
        if (skip != 0 || !i()) {
            this.e += skip;
            return skip;
        }
        do {
            skip = this.c.skip(min);
        } while (skip == 0);
        this.e += skip;
        return skip;
    }

    @Override // defpackage.duhv
    public final synchronized long h() {
        return this.g;
    }

    @Override // defpackage.duhv
    public final synchronized boolean i() {
        if (this.f) {
            this.c.reset();
            this.f = false;
        }
        if (this.c.available() > 0) {
            return true;
        }
        if (this.c.read() == -1) {
            this.g = this.e;
            return false;
        }
        this.c.reset();
        long j = this.e;
        long j2 = this.d;
        while (true) {
            j -= j2;
            if (j <= 0) {
                return true;
            }
            j2 = this.c.skip(j);
        }
    }
}
