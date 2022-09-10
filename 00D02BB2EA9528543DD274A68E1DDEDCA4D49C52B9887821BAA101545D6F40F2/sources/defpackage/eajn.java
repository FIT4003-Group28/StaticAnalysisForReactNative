package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: eajn  reason: default package */
/* loaded from: classes6.dex */
final class eajn implements eajx {
    final eajq a = new eajq();
    final /* synthetic */ eajp b;

    public eajn(eajp eajpVar) {
        this.b = eajpVar;
    }

    @Override // defpackage.eajx
    public final void a(eaiz eaizVar, long j) {
        synchronized (this.b.b) {
            if (this.b.c) {
                throw new IllegalStateException("closed");
            }
            while (j > 0) {
                eajp eajpVar = this.b;
                if (eajpVar.d) {
                    throw new IOException("source is closed");
                }
                long j2 = eajpVar.a;
                eaiz eaizVar2 = eajpVar.b;
                long j3 = j2 - eaizVar2.b;
                if (j3 == 0) {
                    this.a.i(eaizVar2);
                } else {
                    long min = Math.min(j3, j);
                    this.b.b.a(eaizVar, min);
                    j -= min;
                    this.b.b.notifyAll();
                }
            }
        }
    }

    @Override // defpackage.eajx
    public final eaka b() {
        return this.a;
    }

    @Override // defpackage.eajx, java.io.Flushable
    public final void flush() {
        synchronized (this.b.b) {
            eajp eajpVar = this.b;
            if (eajpVar.c) {
                throw new IllegalStateException("closed");
            }
            if (eajpVar.d && eajpVar.b.b > 0) {
                throw new IOException("source is closed");
            }
        }
    }

    @Override // defpackage.eajx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b.b) {
            eajp eajpVar = this.b;
            if (!eajpVar.c) {
                if (eajpVar.d && eajpVar.b.b > 0) {
                    throw new IOException("source is closed");
                }
                eajpVar.c = true;
                eajpVar.b.notifyAll();
            }
        }
    }
}
