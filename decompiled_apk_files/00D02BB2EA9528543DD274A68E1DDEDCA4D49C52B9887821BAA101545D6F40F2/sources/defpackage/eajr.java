package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: eajr  reason: default package */
/* loaded from: classes6.dex */
public final class eajr implements eaja {
    public final eaiz a = new eaiz();
    public final eajx b;
    public boolean c;

    public eajr(eajx eajxVar) {
        if (eajxVar != null) {
            this.b = eajxVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override // defpackage.eaja
    public final void J(byte[] bArr) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.T(bArr);
        c();
    }

    @Override // defpackage.eaja
    public final void L(byte[] bArr, int i, int i2) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.L(bArr, i, i2);
        c();
    }

    @Override // defpackage.eaja
    public final void N(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.M(i);
        c();
    }

    @Override // defpackage.eaja
    public final void P(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.O(i);
        c();
    }

    @Override // defpackage.eaja
    public final void Q(int i) {
        if (!this.c) {
            eaiz eaizVar = this.a;
            eaju B = eaizVar.B(2);
            byte[] bArr = B.a;
            int i2 = B.c;
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >>> 8) & 255);
            bArr[i3] = (byte) (i & 255);
            B.c = i3 + 1;
            eaizVar.b += 2;
            c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.eaja
    public final void W(String str) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.V(str);
        c();
    }

    @Override // defpackage.eajx
    public final void a(eaiz eaizVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.a(eaizVar, j);
        c();
    }

    @Override // defpackage.eajx
    public final eaka b() {
        return this.b.b();
    }

    public final void c() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long g = this.a.g();
        if (g <= 0) {
            return;
        }
        this.b.a(this.a, g);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.eajx
    public final void close() {
        if (!this.c) {
            Throwable th = null;
            try {
                eaiz eaizVar = this.a;
                long j = eaizVar.b;
                if (j > 0) {
                    this.b.a(eaizVar, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th == null) {
                return;
            }
            Charset charset = eakb.a;
            throw th;
        }
    }

    @Override // defpackage.eaja, defpackage.eajx, java.io.Flushable
    public final void flush() {
        if (!this.c) {
            eaiz eaizVar = this.a;
            long j = eaizVar.b;
            if (j > 0) {
                this.b.a(eaizVar, j);
            }
            this.b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("buffer(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        int write = this.a.write(byteBuffer);
        c();
        return write;
    }
}
