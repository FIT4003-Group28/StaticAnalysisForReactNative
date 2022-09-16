package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: eajj  reason: default package */
/* loaded from: classes6.dex */
final class eajj implements eajy {
    final /* synthetic */ eaka a;
    final /* synthetic */ InputStream b;

    public eajj(eaka eakaVar, InputStream inputStream) {
        this.a = eakaVar;
        this.b = inputStream;
    }

    @Override // defpackage.eajy
    public final long Te(eaiz eaizVar, long j) {
        try {
            this.a.r();
            eaju B = eaizVar.B(1);
            int read = this.b.read(B.a, B.c, (int) Math.min(j, 8192 - B.c));
            if (read == -1) {
                return -1L;
            }
            B.c += read;
            long j2 = read;
            eaizVar.b += j2;
            return j2;
        } catch (AssertionError e) {
            if (eajl.i(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.eajy
    public final eaka b() {
        return this.a;
    }

    @Override // defpackage.eajy, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("source(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
