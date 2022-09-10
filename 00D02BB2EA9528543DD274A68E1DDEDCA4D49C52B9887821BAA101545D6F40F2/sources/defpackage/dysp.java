package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dysp  reason: default package */
/* loaded from: classes6.dex */
public final class dysp extends FilterInputStream {
    private final int a;
    private final dyvi b;
    private long c;
    private long d;
    private long e;

    public dysp(InputStream inputStream, int i, dyvi dyviVar) {
        super(inputStream);
        this.e = -1L;
        this.a = i;
        this.b = dyviVar;
    }

    private final void a() {
        if (this.d > this.c) {
            this.b.i();
            this.c = this.d;
        }
    }

    private final void b() {
        if (this.d <= this.a) {
            return;
        }
        throw dyjb.j.g(String.format("Compressed gRPC message exceeds maximum size %d: %d bytes read", Integer.valueOf(this.a), Long.valueOf(this.d))).j();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.e = this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            this.d++;
        }
        b();
        a();
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.in.markSupported()) {
            if (this.e == -1) {
                throw new IOException("Mark not set");
            }
            this.in.reset();
            this.d = this.e;
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.d += skip;
        b();
        a();
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.d += read;
        }
        b();
        a();
        return read;
    }
}
