package defpackage;
/* compiled from: PG */
/* renamed from: eajo  reason: default package */
/* loaded from: classes6.dex */
final class eajo implements eajy {
    final eaka a = new eaka();
    final /* synthetic */ eajp b;

    public eajo(eajp eajpVar) {
        this.b = eajpVar;
    }

    @Override // defpackage.eajy
    public final eaka b() {
        return this.a;
    }

    @Override // defpackage.eajy, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b.b) {
            eajp eajpVar = this.b;
            eajpVar.d = true;
            eajpVar.b.notifyAll();
        }
    }

    @Override // defpackage.eajy
    public final long Te(eaiz eaizVar, long j) {
        synchronized (this.b.b) {
            if (!this.b.d) {
                while (true) {
                    eajp eajpVar = this.b;
                    eaiz eaizVar2 = eajpVar.b;
                    if (eaizVar2.b != 0) {
                        long Te = eaizVar2.Te(eaizVar, 8192L);
                        this.b.b.notifyAll();
                        return Te;
                    } else if (eajpVar.c) {
                        return -1L;
                    } else {
                        this.a.i(eaizVar2);
                    }
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }
}
