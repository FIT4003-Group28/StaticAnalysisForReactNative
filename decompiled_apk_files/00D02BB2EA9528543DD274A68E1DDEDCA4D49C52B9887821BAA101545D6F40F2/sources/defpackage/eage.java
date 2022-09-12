package defpackage;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eage  reason: default package */
/* loaded from: classes6.dex */
public final class eage extends eaga {
    private long e;

    public eage(eagg eaggVar, long j) {
        super(eaggVar);
        this.e = j;
        if (j == 0) {
            c(true, null);
        }
    }

    @Override // defpackage.eaga, defpackage.eajy
    public final long Te(eaiz eaizVar, long j) {
        if (!this.b) {
            long j2 = this.e;
            if (j2 == 0) {
                return -1L;
            }
            long Te = super.Te(eaizVar, Math.min(j2, 8192L));
            if (Te == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                c(false, protocolException);
                throw protocolException;
            }
            long j3 = this.e - Te;
            this.e = j3;
            if (j3 == 0) {
                c(true, null);
            }
            return Te;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.eajy, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (this.e != 0 && !eafa.C(this, TimeUnit.MILLISECONDS)) {
            c(false, null);
        }
        this.b = true;
    }
}
