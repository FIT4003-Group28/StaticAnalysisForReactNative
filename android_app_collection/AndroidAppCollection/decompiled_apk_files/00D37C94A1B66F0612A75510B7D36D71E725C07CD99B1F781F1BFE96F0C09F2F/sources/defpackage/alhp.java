package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: alhp  reason: default package */
/* loaded from: classes.dex */
final class alhp implements awxx {
    private final long a;
    private InputStream b;
    private boolean c;
    private long d;
    private long e;
    private final alhm f;

    public alhp(alhm alhmVar, aldh aldhVar) {
        this.f = alhmVar;
        aqxo.p(aldhVar.a() != -1);
        this.b = k(aldhVar);
        this.a = aldhVar.a();
    }

    private final void j() {
        if (this.c) {
            close();
            this.c = false;
        }
        if (this.b == null) {
            InputStream k = k(this.f.a());
            this.b = k;
            anek.b(k, this.e);
        }
    }

    private static final InputStream k(aldh aldhVar) {
        return new BufferedInputStream(aldhVar, 131072);
    }

    @Override // defpackage.awxx
    public final long a() {
        return this.a;
    }

    @Override // defpackage.awxx
    public final int b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        j();
        int read = this.b.read(bArr, i, i2);
        if (read == -1) {
            if (this.d < this.a) {
                throw new IOException("The stream ended before all expected bytes were read");
            }
            return 0;
        }
        long j = this.d + read;
        this.d = j;
        if (j > this.a) {
            throw new IOException("Stream continues beyond expected size.");
        }
        return read;
    }

    @Override // defpackage.awxx
    public final long c() {
        return this.e;
    }

    @Override // defpackage.awxx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            inputStream.close();
            this.b = null;
        }
    }

    @Override // defpackage.awxx
    public final long d() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.awxx
    public final long e() {
        return this.d;
    }

    @Override // defpackage.awxx
    public final long f(long j) {
        j();
        anek.b(this.b, j);
        this.d += j;
        return j;
    }

    @Override // defpackage.awxx
    public final void g() {
        InputStream inputStream = this.b;
        if (inputStream == null) {
            return;
        }
        if (this.e != this.d) {
            inputStream.mark(131072);
        }
        this.e = this.d;
    }

    @Override // defpackage.awxx
    public final void h() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            try {
                inputStream.reset();
            } catch (IOException unused) {
                this.c = true;
            }
            this.d = this.e;
        }
    }

    @Override // defpackage.awxx
    public final boolean i() {
        return this.a - this.d > 0;
    }
}
