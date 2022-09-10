package defpackage;

import java.net.ProtocolException;
/* compiled from: PG */
/* renamed from: eagd  reason: default package */
/* loaded from: classes6.dex */
final class eagd implements eajx {
    final /* synthetic */ eagg a;
    private final eajf b;
    private boolean c;
    private long d;

    public eagd(eagg eaggVar, long j) {
        this.a = eaggVar;
        this.b = new eajf(eaggVar.d.b());
        this.d = j;
    }

    @Override // defpackage.eajx
    public final void a(eaiz eaizVar, long j) {
        if (!this.c) {
            eafa.B(eaizVar.b, j);
            if (j > this.d) {
                throw new ProtocolException("expected " + this.d + " bytes but received " + j);
            }
            this.a.d.a(eaizVar, j);
            this.d -= j;
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.eajx
    public final eaka b() {
        return this.b;
    }

    @Override // defpackage.eajx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        if (this.d > 0) {
            throw new ProtocolException("unexpected end of stream");
        }
        eagg.k(this.b);
        this.a.e = 3;
    }

    @Override // defpackage.eajx, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        this.a.d.flush();
    }
}
