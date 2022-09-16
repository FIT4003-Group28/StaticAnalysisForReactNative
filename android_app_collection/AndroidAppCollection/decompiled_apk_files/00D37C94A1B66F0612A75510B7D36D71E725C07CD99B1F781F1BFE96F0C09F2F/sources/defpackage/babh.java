package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: babh  reason: default package */
/* loaded from: classes2.dex */
public final class babh implements baba {
    public final baay a = new baay();
    public final babl b;
    public boolean c;

    public babh(babl bablVar) {
        if (bablVar != null) {
            this.b = bablVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.babl
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.a.k();
    }

    @Override // defpackage.babl
    public final long e(baay baayVar, long j) {
        if (!this.c) {
            baay baayVar2 = this.a;
            if (baayVar2.b == 0 && this.b.e(baayVar2, 8192L) == -1) {
                return -1L;
            }
            return this.a.e(baayVar, Math.min(8192L, this.a.b));
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.baba
    public final InputStream f() {
        return new babg(this);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.baba
    public final boolean n(long j) {
        baay baayVar;
        if (j >= 0) {
            if (!this.c) {
                do {
                    baayVar = this.a;
                    if (baayVar.b >= j) {
                        return true;
                    }
                } while (this.b.e(baayVar, 8192L) != -1);
                return false;
            }
            throw new IllegalStateException("closed");
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("byteCount < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        baay baayVar = this.a;
        if (baayVar.b == 0 && this.b.e(baayVar, 8192L) == -1) {
            return -1;
        }
        return this.a.read(byteBuffer);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("buffer(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd A[SYNTHETIC] */
    @Override // defpackage.baba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(defpackage.babb r18) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.babh.d(babb):long");
    }
}
