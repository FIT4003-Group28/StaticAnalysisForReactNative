package c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealBufferedSink.java */
/* loaded from: classes.dex */
public final class n implements d {

    /* renamed from: a  reason: collision with root package name */
    public final c f1312a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final s f1313b;

    /* renamed from: c  reason: collision with root package name */
    boolean f1314c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(s sVar) {
        if (sVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f1313b = sVar;
    }

    @Override // c.d, c.e
    public c b() {
        return this.f1312a;
    }

    @Override // c.s
    public void write(c cVar, long j) {
        if (this.f1314c) {
            throw new IllegalStateException("closed");
        }
        this.f1312a.write(cVar, j);
        w();
    }

    @Override // c.d
    public d b(f fVar) {
        if (this.f1314c) {
            throw new IllegalStateException("closed");
        }
        this.f1312a.b(fVar);
        return w();
    }

    @Override // c.d
    public d b(String str) {
        if (this.f1314c) {
            throw new IllegalStateException("closed");
        }
        this.f1312a.b(str);
        return w();
    }

    @Override // c.d
    public d c(byte[] bArr) {
        if (this.f1314c) {
            throw new IllegalStateException("closed");
        }
        this.f1312a.c(bArr);
        return w();
    }

    @Override // c.d
    public d c(byte[] bArr, int i, int i2) {
        if (this.f1314c) {
            throw new IllegalStateException("closed");
        }
        this.f1312a.c(bArr, i, i2);
        return w();
    }

    @Override // c.d
    public long a(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long read = tVar.read(this.f1312a, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
            w();
        }
    }

    @Override // c.d
    public d i(int i) {
        if (this.f1314c) {
            throw new IllegalStateException("closed");
        }
        this.f1312a.i(i);
        return w();
    }

    @Override // c.d
    public d h(int i) {
        if (this.f1314c) {
            throw new IllegalStateException("closed");
        }
        this.f1312a.h(i);
        return w();
    }

    @Override // c.d
    public d g(int i) {
        if (this.f1314c) {
            throw new IllegalStateException("closed");
        }
        this.f1312a.g(i);
        return w();
    }

    @Override // c.d
    public d o(long j) {
        if (this.f1314c) {
            throw new IllegalStateException("closed");
        }
        this.f1312a.o(j);
        return w();
    }

    @Override // c.d
    public d n(long j) {
        if (this.f1314c) {
            throw new IllegalStateException("closed");
        }
        this.f1312a.n(j);
        return w();
    }

    @Override // c.d
    public d m(long j) {
        if (this.f1314c) {
            throw new IllegalStateException("closed");
        }
        this.f1312a.m(j);
        return w();
    }

    @Override // c.d
    public d w() {
        if (this.f1314c) {
            throw new IllegalStateException("closed");
        }
        long g = this.f1312a.g();
        if (g > 0) {
            this.f1313b.write(this.f1312a, g);
        }
        return this;
    }

    @Override // c.d
    public d d() {
        if (this.f1314c) {
            throw new IllegalStateException("closed");
        }
        long a2 = this.f1312a.a();
        if (a2 > 0) {
            this.f1313b.write(this.f1312a, a2);
        }
        return this;
    }

    @Override // c.d, c.s, java.io.Flushable
    public void flush() {
        if (this.f1314c) {
            throw new IllegalStateException("closed");
        }
        if (this.f1312a.f1283b > 0) {
            this.f1313b.write(this.f1312a, this.f1312a.f1283b);
        }
        this.f1313b.flush();
    }

    @Override // c.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f1314c) {
            return;
        }
        Throwable th = null;
        try {
            if (this.f1312a.f1283b > 0) {
                this.f1313b.write(this.f1312a, this.f1312a.f1283b);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f1313b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f1314c = true;
        if (th == null) {
            return;
        }
        v.a(th);
    }

    @Override // c.s
    public u timeout() {
        return this.f1313b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f1313b + ")";
    }
}
