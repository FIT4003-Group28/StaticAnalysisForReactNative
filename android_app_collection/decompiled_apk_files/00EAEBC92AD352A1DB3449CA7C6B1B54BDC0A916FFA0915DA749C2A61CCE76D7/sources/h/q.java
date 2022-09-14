package h;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q implements e {

    /* renamed from: b  reason: collision with root package name */
    public final c f10186b = new c();

    /* renamed from: c  reason: collision with root package name */
    public final v f10187c;

    /* renamed from: d  reason: collision with root package name */
    boolean f10188d;

    /* loaded from: classes.dex */
    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            q qVar = q.this;
            if (!qVar.f10188d) {
                return (int) Math.min(qVar.f10186b.f10134c, 2147483647L);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            q.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            q qVar = q.this;
            if (!qVar.f10188d) {
                c cVar = qVar.f10186b;
                if (cVar.f10134c != 0 || qVar.f10187c.read(cVar, 8192L) != -1) {
                    return q.this.f10186b.readByte() & 255;
                }
                return -1;
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (!q.this.f10188d) {
                x.a(bArr.length, i, i2);
                q qVar = q.this;
                c cVar = qVar.f10186b;
                if (cVar.f10134c != 0 || qVar.f10187c.read(cVar, 8192L) != -1) {
                    return q.this.f10186b.a(bArr, i, i2);
                }
                return -1;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return q.this + ".inputStream()";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(v vVar) {
        if (vVar != null) {
            this.f10187c = vVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // h.e
    public int a(m mVar) {
        if (!this.f10188d) {
            do {
                int a2 = this.f10186b.a(mVar, true);
                if (a2 == -1) {
                    return -1;
                }
                if (a2 != -2) {
                    this.f10186b.skip(mVar.f10165b[a2].g());
                    return a2;
                }
            } while (this.f10187c.read(this.f10186b, 8192L) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // h.e
    public long a(byte b2) {
        return a(b2, 0L, Long.MAX_VALUE);
    }

    public long a(byte b2, long j, long j2) {
        if (!this.f10188d) {
            if (j < 0 || j2 < j) {
                throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
            }
            while (j < j2) {
                long a2 = this.f10186b.a(b2, j, j2);
                if (a2 == -1) {
                    c cVar = this.f10186b;
                    long j3 = cVar.f10134c;
                    if (j3 >= j2 || this.f10187c.read(cVar, 8192L) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return a2;
                }
            }
            return -1L;
        }
        throw new IllegalStateException("closed");
    }

    public long a(f fVar, long j) {
        if (!this.f10188d) {
            while (true) {
                long a2 = this.f10186b.a(fVar, j);
                if (a2 != -1) {
                    return a2;
                }
                c cVar = this.f10186b;
                long j2 = cVar.f10134c;
                if (this.f10187c.read(cVar, 8192L) == -1) {
                    return -1L;
                }
                j = Math.max(j, (j2 - fVar.g()) + 1);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // h.e
    public String a(Charset charset) {
        if (charset != null) {
            this.f10186b.a(this.f10187c);
            return this.f10186b.a(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // h.e
    public void a(c cVar, long j) {
        try {
            i(j);
            this.f10186b.a(cVar, j);
        } catch (EOFException e2) {
            cVar.a(this.f10186b);
            throw e2;
        }
    }

    @Override // h.e
    public boolean a(long j, f fVar) {
        return a(j, fVar, 0, fVar.g());
    }

    public boolean a(long j, f fVar, int i, int i2) {
        if (!this.f10188d) {
            if (j < 0 || i < 0 || i2 < 0 || fVar.g() - i < i2) {
                return false;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = i3 + j;
                if (!f(1 + j2) || this.f10186b.a(j2) != fVar.a(i + i3)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    @Override // h.e
    public long b(f fVar) {
        return a(fVar, 0L);
    }

    public long b(f fVar, long j) {
        if (!this.f10188d) {
            while (true) {
                long b2 = this.f10186b.b(fVar, j);
                if (b2 != -1) {
                    return b2;
                }
                c cVar = this.f10186b;
                long j2 = cVar.f10134c;
                if (this.f10187c.read(cVar, 8192L) == -1) {
                    return -1L;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // h.e
    public long c(f fVar) {
        return b(fVar, 0L);
    }

    @Override // h.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f10188d) {
            return;
        }
        this.f10188d = true;
        this.f10187c.close();
        this.f10186b.a();
    }

    @Override // h.e
    public f e(long j) {
        i(j);
        return this.f10186b.e(j);
    }

    @Override // h.e
    public boolean f(long j) {
        c cVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f10188d) {
            throw new IllegalStateException("closed");
        } else {
            do {
                cVar = this.f10186b;
                if (cVar.f10134c >= j) {
                    return true;
                }
            } while (this.f10187c.read(cVar, 8192L) != -1);
            return false;
        }
    }

    @Override // h.e
    public byte[] g(long j) {
        i(j);
        return this.f10186b.g(j);
    }

    @Override // h.e
    public String h(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long a2 = a((byte) 10, 0L, j2);
        if (a2 != -1) {
            return this.f10186b.j(a2);
        }
        if (j2 < Long.MAX_VALUE && f(j2) && this.f10186b.a(j2 - 1) == 13 && f(1 + j2) && this.f10186b.a(j2) == 10) {
            return this.f10186b.j(j2);
        }
        c cVar = new c();
        c cVar2 = this.f10186b;
        cVar2.a(cVar, 0L, Math.min(32L, cVar2.e()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f10186b.e(), j) + " content=" + cVar.c().b() + (char) 8230);
    }

    @Override // h.e
    public void i(long j) {
        if (f(j)) {
            return;
        }
        throw new EOFException();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f10188d;
    }

    @Override // h.e, h.d
    public c j() {
        return this.f10186b;
    }

    @Override // h.e
    public String n() {
        return h(Long.MAX_VALUE);
    }

    @Override // h.e
    public byte[] o() {
        this.f10186b.a(this.f10187c);
        return this.f10186b.o();
    }

    @Override // h.e
    public int p() {
        i(4L);
        return this.f10186b.p();
    }

    @Override // h.e
    public c q() {
        return this.f10186b;
    }

    @Override // h.e
    public boolean r() {
        if (!this.f10188d) {
            return this.f10186b.r() && this.f10187c.read(this.f10186b, 8192L) == -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        c cVar = this.f10186b;
        if (cVar.f10134c == 0 && this.f10187c.read(cVar, 8192L) == -1) {
            return -1;
        }
        return this.f10186b.read(byteBuffer);
    }

    @Override // h.v
    public long read(c cVar, long j) {
        if (cVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f10188d) {
                throw new IllegalStateException("closed");
            } else {
                c cVar2 = this.f10186b;
                if (cVar2.f10134c == 0 && this.f10187c.read(cVar2, 8192L) == -1) {
                    return -1L;
                }
                return this.f10186b.read(cVar, Math.min(j, this.f10186b.f10134c));
            }
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // h.e
    public byte readByte() {
        i(1L);
        return this.f10186b.readByte();
    }

    @Override // h.e
    public void readFully(byte[] bArr) {
        try {
            i(bArr.length);
            this.f10186b.readFully(bArr);
        } catch (EOFException e2) {
            int i = 0;
            while (true) {
                c cVar = this.f10186b;
                long j = cVar.f10134c;
                if (j <= 0) {
                    throw e2;
                }
                int a2 = cVar.a(bArr, i, (int) j);
                if (a2 == -1) {
                    throw new AssertionError();
                }
                i += a2;
            }
        }
    }

    @Override // h.e
    public int readInt() {
        i(4L);
        return this.f10186b.readInt();
    }

    @Override // h.e
    public long readLong() {
        i(8L);
        return this.f10186b.readLong();
    }

    @Override // h.e
    public short readShort() {
        i(2L);
        return this.f10186b.readShort();
    }

    @Override // h.e
    public short s() {
        i(2L);
        return this.f10186b.s();
    }

    @Override // h.e
    public void skip(long j) {
        if (!this.f10188d) {
            while (j > 0) {
                c cVar = this.f10186b;
                if (cVar.f10134c == 0 && this.f10187c.read(cVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f10186b.e());
                this.f10186b.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // h.e
    public long t() {
        byte a2;
        i(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!f(i2)) {
                break;
            }
            a2 = this.f10186b.a(i);
            if ((a2 < 48 || a2 > 57) && !(i == 0 && a2 == 45)) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(a2)));
        }
        return this.f10186b.t();
    }

    @Override // h.v
    public w timeout() {
        return this.f10187c.timeout();
    }

    public String toString() {
        return "buffer(" + this.f10187c + ")";
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // h.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long u() {
        /*
            r6 = this;
            r0 = 1
            r6.i(r0)
            r0 = 0
            r1 = 0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.f(r3)
            if (r3 == 0) goto L4a
            h.c r3 = r6.f10186b
            long r4 = (long) r1
            byte r3 = r3.a(r4)
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
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            h.c r0 = r6.f10186b
            long r0 = r0.u()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.q.u():long");
    }

    @Override // h.e
    public InputStream v() {
        return new a();
    }
}
