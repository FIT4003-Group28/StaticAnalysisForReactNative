package c;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealBufferedSource.java */
/* loaded from: classes.dex */
public final class o implements e {

    /* renamed from: a  reason: collision with root package name */
    public final c f1315a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final t f1316b;

    /* renamed from: c  reason: collision with root package name */
    boolean f1317c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(t tVar) {
        if (tVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f1316b = tVar;
    }

    @Override // c.e
    public c b() {
        return this.f1315a;
    }

    @Override // c.t
    public long read(c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f1317c) {
            throw new IllegalStateException("closed");
        } else {
            if (this.f1315a.f1283b == 0 && this.f1316b.read(this.f1315a, 8192L) == -1) {
                return -1L;
            }
            return this.f1315a.read(cVar, Math.min(j, this.f1315a.f1283b));
        }
    }

    @Override // c.e
    public boolean e() {
        if (this.f1317c) {
            throw new IllegalStateException("closed");
        }
        return this.f1315a.e() && this.f1316b.read(this.f1315a, 8192L) == -1;
    }

    @Override // c.e
    public void a(long j) {
        if (!b(j)) {
            throw new EOFException();
        }
    }

    @Override // c.e
    public boolean b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f1317c) {
            throw new IllegalStateException("closed");
        } else {
            while (this.f1315a.f1283b < j) {
                if (this.f1316b.read(this.f1315a, 8192L) == -1) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // c.e
    public byte h() {
        a(1L);
        return this.f1315a.h();
    }

    @Override // c.e
    public f d(long j) {
        a(j);
        return this.f1315a.d(j);
    }

    @Override // c.e
    public byte[] s() {
        this.f1315a.a(this.f1316b);
        return this.f1315a.s();
    }

    @Override // c.e
    public byte[] h(long j) {
        a(j);
        return this.f1315a.h(j);
    }

    @Override // c.e
    public void a(byte[] bArr) {
        try {
            a(bArr.length);
            this.f1315a.a(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f1315a.f1283b > 0) {
                int a2 = this.f1315a.a(bArr, i, (int) this.f1315a.f1283b);
                if (a2 == -1) {
                    throw new AssertionError();
                }
                i += a2;
            }
            throw e;
        }
    }

    @Override // c.e
    public int a(byte[] bArr, int i, int i2) {
        long j = i2;
        v.a(bArr.length, i, j);
        if (this.f1315a.f1283b == 0 && this.f1316b.read(this.f1315a, 8192L) == -1) {
            return -1;
        }
        return this.f1315a.a(bArr, i, (int) Math.min(j, this.f1315a.f1283b));
    }

    @Override // c.e
    public void a(c cVar, long j) {
        try {
            a(j);
            this.f1315a.a(cVar, j);
        } catch (EOFException e) {
            cVar.a(this.f1315a);
            throw e;
        }
    }

    @Override // c.e
    public String a(Charset charset) {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.f1315a.a(this.f1316b);
        return this.f1315a.a(charset);
    }

    @Override // c.e
    public String r() {
        return c(Long.MAX_VALUE);
    }

    public String c(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long a2 = a((byte) 10, 0L, j2);
        if (a2 != -1) {
            return this.f1315a.g(a2);
        }
        if (j2 < Long.MAX_VALUE && b(j2) && this.f1315a.c(j2 - 1) == 13 && b(1 + j2) && this.f1315a.c(j2) == 10) {
            return this.f1315a.g(j2);
        }
        c cVar = new c();
        this.f1315a.a(cVar, 0L, Math.min(32L, this.f1315a.a()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f1315a.a(), j) + " content=" + cVar.p().f() + (char) 8230);
    }

    @Override // c.e
    public short i() {
        a(2L);
        return this.f1315a.i();
    }

    @Override // c.e
    public short l() {
        a(2L);
        return this.f1315a.l();
    }

    @Override // c.e
    public int j() {
        a(4L);
        return this.f1315a.j();
    }

    @Override // c.e
    public int m() {
        a(4L);
        return this.f1315a.m();
    }

    @Override // c.e
    public long k() {
        a(8L);
        return this.f1315a.k();
    }

    @Override // c.e
    public long n() {
        byte c2;
        a(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!b(i2)) {
                break;
            }
            c2 = this.f1315a.c(i);
            if ((c2 < 48 || c2 > 57) && !(i == 0 && c2 == 45)) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(c2)));
        }
        return this.f1315a.n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r1 != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long o() {
        /*
            r6 = this;
            r0 = 1
            r6.a(r0)
            r0 = 0
            r1 = 0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.b(r3)
            if (r3 == 0) goto L49
            c.c r3 = r6.f1315a
            long r4 = (long) r1
            byte r3 = r3.c(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 != 0) goto L49
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was %#x"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r4[r0] = r3
            java.lang.String r0 = java.lang.String.format(r2, r4)
            r1.<init>(r0)
            throw r1
        L49:
            c.c r0 = r6.f1315a
            long r0 = r0.o()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.o.o():long");
    }

    @Override // c.e
    public void i(long j) {
        if (this.f1317c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.f1315a.f1283b == 0 && this.f1316b.read(this.f1315a, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f1315a.a());
            this.f1315a.i(min);
            j -= min;
        }
    }

    @Override // c.e
    public long a(byte b2) {
        return a(b2, 0L, Long.MAX_VALUE);
    }

    public long a(byte b2, long j, long j2) {
        if (this.f1317c) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        }
        while (j < j2) {
            long a2 = this.f1315a.a(b2, j, j2);
            if (a2 != -1) {
                return a2;
            }
            long j3 = this.f1315a.f1283b;
            if (j3 >= j2 || this.f1316b.read(this.f1315a, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, j3);
        }
        return -1L;
    }

    @Override // c.e
    public boolean a(long j, f fVar) {
        return a(j, fVar, 0, fVar.h());
    }

    public boolean a(long j, f fVar, int i, int i2) {
        if (this.f1317c) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i2 < 0 || fVar.h() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = i3 + j;
            if (!b(1 + j2) || this.f1315a.c(j2) != fVar.a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // c.e
    public InputStream f() {
        return new InputStream() { // from class: c.o.1
            @Override // java.io.InputStream
            public int read() {
                if (o.this.f1317c) {
                    throw new IOException("closed");
                }
                if (o.this.f1315a.f1283b != 0 || o.this.f1316b.read(o.this.f1315a, 8192L) != -1) {
                    return o.this.f1315a.h() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                if (o.this.f1317c) {
                    throw new IOException("closed");
                }
                v.a(bArr.length, i, i2);
                if (o.this.f1315a.f1283b != 0 || o.this.f1316b.read(o.this.f1315a, 8192L) != -1) {
                    return o.this.f1315a.a(bArr, i, i2);
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int available() {
                if (o.this.f1317c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(o.this.f1315a.f1283b, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                o.this.close();
            }

            public String toString() {
                return o.this + ".inputStream()";
            }
        };
    }

    @Override // c.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f1317c) {
            return;
        }
        this.f1317c = true;
        this.f1316b.close();
        this.f1315a.t();
    }

    @Override // c.t
    public u timeout() {
        return this.f1316b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f1316b + ")";
    }
}
