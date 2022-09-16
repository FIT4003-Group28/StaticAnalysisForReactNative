package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: axe  reason: default package */
/* loaded from: classes2.dex */
public final class axe extends InputStream {
    private final asv a;
    private final asy b;
    private long f;
    private boolean d = false;
    private boolean e = false;
    private final byte[] c = new byte[1];

    public axe(asv asvVar, asy asyVar) {
        this.a = asvVar;
        this.b = asyVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.e) {
            this.a.j();
            this.e = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.c) == -1) {
            return -1;
        }
        return this.c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ptx.e(!this.e);
        if (!this.d) {
            this.a.h(this.b);
            this.d = true;
        }
        int g = this.a.g(bArr, i, i2);
        if (g == -1) {
            return -1;
        }
        this.f += g;
        return g;
    }
}
