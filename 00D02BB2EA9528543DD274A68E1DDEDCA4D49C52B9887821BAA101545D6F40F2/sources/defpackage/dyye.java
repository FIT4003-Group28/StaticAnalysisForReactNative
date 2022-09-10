package defpackage;

import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyye  reason: default package */
/* loaded from: classes6.dex */
public final class dyye implements eajy {
    int a;
    byte b;
    int c;
    int d;
    short e;
    private final eajb f;

    public dyye(eajb eajbVar) {
        this.f = eajbVar;
    }

    @Override // defpackage.eajy
    public final long Te(eaiz eaizVar, long j) {
        int i;
        int k;
        do {
            int i2 = this.d;
            if (i2 == 0) {
                this.f.A(this.e);
                this.e = (short) 0;
                if ((this.b & 4) != 0) {
                    return -1L;
                }
                i = this.c;
                int d = dyyi.d(this.f);
                this.d = d;
                this.a = d;
                byte h = (byte) (this.f.h() & 255);
                this.b = (byte) (this.f.h() & 255);
                if (dyyi.a.isLoggable(Level.FINE)) {
                    dyyi.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", dyyf.a(true, this.c, this.a, h, this.b));
                }
                k = this.f.k() & Integer.MAX_VALUE;
                this.c = k;
                if (h != 9) {
                    throw dyyi.b("%s != TYPE_CONTINUATION", Byte.valueOf(h));
                }
            } else {
                long Te = this.f.Te(eaizVar, Math.min(8192L, i2));
                if (Te == -1) {
                    return -1L;
                }
                this.d -= (int) Te;
                return Te;
            }
        } while (k == i);
        throw dyyi.b("TYPE_CONTINUATION streamId changed", new Object[0]);
    }

    @Override // defpackage.eajy
    public final eaka b() {
        return this.f.b();
    }

    @Override // defpackage.eajy, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
