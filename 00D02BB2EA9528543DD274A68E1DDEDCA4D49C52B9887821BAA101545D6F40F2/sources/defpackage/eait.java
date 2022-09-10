package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: eait  reason: default package */
/* loaded from: classes6.dex */
final class eait implements eajx {
    final /* synthetic */ eajx a;
    final /* synthetic */ eaiw b;

    public eait(eaiw eaiwVar, eajx eajxVar) {
        this.b = eaiwVar;
        this.a = eajxVar;
    }

    @Override // defpackage.eajx
    public final void a(eaiz eaizVar, long j) {
        eakb.a(eaizVar.b, 0L, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                eaju eajuVar = eaizVar.a;
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += eajuVar.c - eajuVar.b;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    eajuVar = eajuVar.f;
                }
                this.b.d();
                try {
                    try {
                        this.a.a(eaizVar, j2);
                        j -= j2;
                        this.b.g(true);
                    } catch (IOException e) {
                        throw this.b.h(e);
                    }
                } catch (Throwable th) {
                    this.b.g(false);
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.eajx
    public final eaka b() {
        return this.b;
    }

    @Override // defpackage.eajx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.d();
        try {
            try {
                this.a.close();
                this.b.g(true);
            } catch (IOException e) {
                throw this.b.h(e);
            }
        } catch (Throwable th) {
            this.b.g(false);
            throw th;
        }
    }

    @Override // defpackage.eajx, java.io.Flushable
    public final void flush() {
        this.b.d();
        try {
            try {
                this.a.flush();
                this.b.g(true);
            } catch (IOException e) {
                throw this.b.h(e);
            }
        } catch (Throwable th) {
            this.b.g(false);
            throw th;
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("AsyncTimeout.sink(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
