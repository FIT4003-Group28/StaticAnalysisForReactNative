package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: pbm  reason: default package */
/* loaded from: classes4.dex */
public final class pbm extends InputStream {
    private final pbl a;
    private final pbn b;
    private boolean d = false;
    private boolean e = false;
    private final byte[] c = new byte[1];

    public pbm(pbl pblVar, pbn pbnVar) {
        this.a = pblVar;
        this.b = pbnVar;
    }

    public final void a() {
        if (!this.d) {
            this.a.b(this.b);
            this.d = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.e) {
            this.a.c();
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
    public final long skip(long j) {
        pce.d(!this.e);
        a();
        return super.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        pce.d(!this.e);
        a();
        return this.a.a(bArr, i, i2);
    }
}
