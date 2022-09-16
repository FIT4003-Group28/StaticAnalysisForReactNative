package h;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p implements d {

    /* renamed from: b  reason: collision with root package name */
    public final c f10182b = new c();

    /* renamed from: c  reason: collision with root package name */
    public final u f10183c;

    /* renamed from: d  reason: collision with root package name */
    boolean f10184d;

    /* loaded from: classes.dex */
    class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            p.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            p pVar = p.this;
            if (!pVar.f10184d) {
                pVar.flush();
            }
        }

        public String toString() {
            return p.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            p pVar = p.this;
            if (!pVar.f10184d) {
                pVar.f10182b.mo339writeByte((int) ((byte) i));
                p.this.mo336l();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            p pVar = p.this;
            if (!pVar.f10184d) {
                pVar.f10182b.mo338write(bArr, i, i2);
                p.this.mo336l();
                return;
            }
            throw new IOException("closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(u uVar) {
        if (uVar != null) {
            this.f10183c = uVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override // h.d
    public long a(v vVar) {
        if (vVar != null) {
            long j = 0;
            while (true) {
                long read = vVar.read(this.f10182b, 8192L);
                if (read == -1) {
                    return j;
                }
                j += read;
                mo336l();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // h.d
    /* renamed from: a */
    public d mo330a(f fVar) {
        if (!this.f10184d) {
            this.f10182b.mo330a(fVar);
            mo336l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // h.d
    /* renamed from: a */
    public d mo331a(String str) {
        if (!this.f10184d) {
            this.f10182b.mo331a(str);
            return mo336l();
        }
        throw new IllegalStateException("closed");
    }

    @Override // h.d
    /* renamed from: a */
    public d mo332a(String str, int i, int i2) {
        if (!this.f10184d) {
            this.f10182b.mo332a(str, i, i2);
            mo336l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // h.d
    /* renamed from: c */
    public d mo333c(long j) {
        if (!this.f10184d) {
            this.f10182b.mo333c(j);
            return mo336l();
        }
        throw new IllegalStateException("closed");
    }

    @Override // h.u, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f10184d) {
            return;
        }
        try {
            if (this.f10182b.f10134c > 0) {
                this.f10183c.write(this.f10182b, this.f10182b.f10134c);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f10183c.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f10184d = true;
        if (th == null) {
            return;
        }
        x.a(th);
        throw null;
    }

    @Override // h.d
    /* renamed from: d */
    public d mo335d(long j) {
        if (!this.f10184d) {
            this.f10182b.mo335d(j);
            mo336l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // h.d, h.u, java.io.Flushable
    public void flush() {
        if (!this.f10184d) {
            c cVar = this.f10182b;
            long j = cVar.f10134c;
            if (j > 0) {
                this.f10183c.write(cVar, j);
            }
            this.f10183c.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f10184d;
    }

    @Override // h.d
    public c j() {
        return this.f10182b;
    }

    @Override // h.d
    public d k() {
        if (!this.f10184d) {
            long e2 = this.f10182b.e();
            if (e2 > 0) {
                this.f10183c.write(this.f10182b, e2);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // h.d
    /* renamed from: l */
    public d mo336l() {
        if (!this.f10184d) {
            long b2 = this.f10182b.b();
            if (b2 > 0) {
                this.f10183c.write(this.f10182b, b2);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // h.d
    public OutputStream m() {
        return new a();
    }

    @Override // h.u
    public w timeout() {
        return this.f10183c.timeout();
    }

    public String toString() {
        return "buffer(" + this.f10183c + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (!this.f10184d) {
            int write = this.f10182b.write(byteBuffer);
            mo336l();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // h.d
    /* renamed from: write */
    public d mo337write(byte[] bArr) {
        if (!this.f10184d) {
            this.f10182b.mo337write(bArr);
            mo336l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // h.d
    /* renamed from: write */
    public d mo338write(byte[] bArr, int i, int i2) {
        if (!this.f10184d) {
            this.f10182b.mo338write(bArr, i, i2);
            mo336l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // h.u
    public void write(c cVar, long j) {
        if (!this.f10184d) {
            this.f10182b.write(cVar, j);
            mo336l();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // h.d
    /* renamed from: writeByte */
    public d mo339writeByte(int i) {
        if (!this.f10184d) {
            this.f10182b.mo339writeByte(i);
            mo336l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // h.d
    /* renamed from: writeInt */
    public d mo340writeInt(int i) {
        if (!this.f10184d) {
            this.f10182b.mo340writeInt(i);
            return mo336l();
        }
        throw new IllegalStateException("closed");
    }

    @Override // h.d
    /* renamed from: writeShort */
    public d mo341writeShort(int i) {
        if (!this.f10184d) {
            this.f10182b.mo341writeShort(i);
            mo336l();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
