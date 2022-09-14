package defpackage;
/* compiled from: PG */
/* renamed from: eagb  reason: default package */
/* loaded from: classes6.dex */
final class eagb implements eajx {
    final /* synthetic */ eagg a;
    private final eajf b;
    private boolean c;

    public eagb(eagg eaggVar) {
        this.a = eaggVar;
        this.b = new eajf(eaggVar.d.b());
    }

    @Override // defpackage.eajx
    public final void a(eaiz eaizVar, long j) {
        if (!this.c) {
            if (j == 0) {
                return;
            }
            eajr eajrVar = (eajr) this.a.d;
            if (eajrVar.c) {
                throw new IllegalStateException("closed");
            }
            eajrVar.a.U(j);
            eajrVar.c();
            this.a.d.W("\r\n");
            this.a.d.a(eaizVar, j);
            this.a.d.W("\r\n");
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.eajx
    public final eaka b() {
        return this.b;
    }

    @Override // defpackage.eajx, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.d.W("0\r\n\r\n");
        eagg.k(this.b);
        this.a.e = 3;
    }

    @Override // defpackage.eajx, java.io.Flushable
    public final synchronized void flush() {
        if (this.c) {
            return;
        }
        this.a.d.flush();
    }
}
