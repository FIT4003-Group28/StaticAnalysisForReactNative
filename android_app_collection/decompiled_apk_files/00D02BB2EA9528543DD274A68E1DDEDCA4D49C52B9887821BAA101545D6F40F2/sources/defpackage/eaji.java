package defpackage;

import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: eaji  reason: default package */
/* loaded from: classes6.dex */
final class eaji implements eajx {
    final /* synthetic */ eaka a;
    final /* synthetic */ OutputStream b;

    public eaji(eaka eakaVar, OutputStream outputStream) {
        this.a = eakaVar;
        this.b = outputStream;
    }

    @Override // defpackage.eajx
    public final void a(eaiz eaizVar, long j) {
        eakb.a(eaizVar.b, 0L, j);
        while (j > 0) {
            this.a.r();
            eaju eajuVar = eaizVar.a;
            int min = (int) Math.min(j, eajuVar.c - eajuVar.b);
            this.b.write(eajuVar.a, eajuVar.b, min);
            int i = eajuVar.b + min;
            eajuVar.b = i;
            long j2 = min;
            j -= j2;
            eaizVar.b -= j2;
            if (i == eajuVar.c) {
                eaizVar.a = eajuVar.b();
                eajv.b(eajuVar);
            }
        }
    }

    @Override // defpackage.eajx
    public final eaka b() {
        return this.a;
    }

    @Override // defpackage.eajx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.eajx, java.io.Flushable
    public final void flush() {
        this.b.flush();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6);
        sb.append("sink(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
