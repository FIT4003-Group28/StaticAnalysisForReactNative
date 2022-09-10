package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: eajt  reason: default package */
/* loaded from: classes6.dex */
public final class eajt implements eajb {
    public final eaiz a = new eaiz();
    public final eajy b;
    public boolean c;

    public eajt(eajy eajyVar) {
        if (eajyVar != null) {
            this.b = eajyVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // defpackage.eajb
    public final void A(long j) {
        if (!this.c) {
            while (j > 0) {
                eaiz eaizVar = this.a;
                if (eaizVar.b != 0 || this.b.Te(eaizVar, 8192L) != -1) {
                    long min = Math.min(j, this.a.b);
                    this.a.A(min);
                    j -= min;
                } else {
                    throw new EOFException();
                }
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.eajb
    public final long H() {
        return g((byte) 0, Long.MAX_VALUE);
    }

    @Override // defpackage.eajy
    public final long Te(eaiz eaizVar, long j) {
        if (j >= 0) {
            if (!this.c) {
                eaiz eaizVar2 = this.a;
                if (eaizVar2.b == 0 && this.b.Te(eaizVar2, 8192L) == -1) {
                    return -1L;
                }
                return this.a.Te(eaizVar, Math.min(j, this.a.b));
            }
            throw new IllegalStateException("closed");
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("byteCount < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.eajy
    public final eaka b() {
        return this.b.b();
    }

    @Override // defpackage.eajb
    public final boolean c() {
        if (!this.c) {
            return this.a.c() && this.b.Te(this.a, 8192L) == -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.eajy
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.a.z();
    }

    @Override // defpackage.eajb
    public final void d(long j) {
        if (e(j)) {
            return;
        }
        throw new EOFException();
    }

    @Override // defpackage.eajb
    public final boolean e(long j) {
        eaiz eaizVar;
        if (j >= 0) {
            if (!this.c) {
                do {
                    eaizVar = this.a;
                    if (eaizVar.b >= j) {
                        return true;
                    }
                } while (this.b.Te(eaizVar, 8192L) != -1);
                return false;
            }
            throw new IllegalStateException("closed");
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("byteCount < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.eajb
    public final InputStream f() {
        return new eajs(this);
    }

    public final long g(byte b, long j) {
        if (!this.c) {
            long j2 = 0;
            if (j < 0) {
                throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", 0L, Long.valueOf(j)));
            }
            while (j2 < j) {
                long C = this.a.C(b, j2, j);
                if (C == -1) {
                    eaiz eaizVar = this.a;
                    long j3 = eaizVar.b;
                    if (j3 >= j || this.b.Te(eaizVar, 8192L) == -1) {
                        break;
                    }
                    j2 = Math.max(j2, j3);
                } else {
                    return C;
                }
            }
            return -1L;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.eajb
    public final byte h() {
        d(1L);
        return this.a.h();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.eajb
    public final short j() {
        d(2L);
        return this.a.j();
    }

    @Override // defpackage.eajb
    public final int k() {
        d(4L);
        return this.a.k();
    }

    @Override // defpackage.eajb
    public final int m() {
        d(4L);
        return eakb.c(this.a.k());
    }

    @Override // defpackage.eajb
    public final eajc o(long j) {
        d(j);
        return new eajc(this.a.w(j));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        eaiz eaizVar = this.a;
        if (eaizVar.b == 0 && this.b.Te(eaizVar, 8192L) == -1) {
            return -1;
        }
        return this.a.read(byteBuffer);
    }

    @Override // defpackage.eajb
    public final String s() {
        return t(Long.MAX_VALUE);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("buffer(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.eajb
    public final byte[] w(long j) {
        d(j);
        return this.a.w(j);
    }

    @Override // defpackage.eajb
    public final void x(byte[] bArr) {
        try {
            d(bArr.length);
            this.a.x(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                eaiz eaizVar = this.a;
                long j = eaizVar.b;
                if (j <= 0) {
                    throw e;
                }
                int y = eaizVar.y(bArr, i, (int) j);
                if (y == -1) {
                    throw new AssertionError();
                }
                i += y;
            }
        }
    }

    @Override // defpackage.eajb
    public final String t(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("limit < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long g = g((byte) 10, j2);
        if (g != -1) {
            return this.a.u(g);
        }
        if (j2 >= Long.MAX_VALUE || !e(j2) || this.a.i((-1) + j2) != 13 || !e(1 + j2) || this.a.i(j2) != 10) {
            eaiz eaizVar = new eaiz();
            eaiz eaizVar2 = this.a;
            eaizVar2.G(eaizVar, 0L, Math.min(32L, eaizVar2.b));
            long min = Math.min(this.a.b, j);
            String e = eaizVar.n().e();
            StringBuilder sb2 = new StringBuilder(String.valueOf(e).length() + 50);
            sb2.append("\\n not found: limit=");
            sb2.append(min);
            sb2.append(" content=");
            sb2.append(e);
            sb2.append((char) 8230);
            throw new EOFException(sb2.toString());
        }
        return this.a.u(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd A[SYNTHETIC] */
    @Override // defpackage.eajb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long D(defpackage.eajc r18) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eajt.D(eajc):long");
    }
}
