package defpackage;
/* compiled from: PG */
/* renamed from: eagf  reason: default package */
/* loaded from: classes6.dex */
final class eagf extends eaga {
    private boolean e;

    public eagf(eagg eaggVar) {
        super(eaggVar);
    }

    @Override // defpackage.eaga, defpackage.eajy
    public final long Te(eaiz eaizVar, long j) {
        if (!this.b) {
            if (this.e) {
                return -1L;
            }
            long Te = super.Te(eaizVar, 8192L);
            if (Te != -1) {
                return Te;
            }
            this.e = true;
            c(true, null);
            return -1L;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.eajy, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (!this.e) {
            c(false, null);
        }
        this.b = true;
    }
}
