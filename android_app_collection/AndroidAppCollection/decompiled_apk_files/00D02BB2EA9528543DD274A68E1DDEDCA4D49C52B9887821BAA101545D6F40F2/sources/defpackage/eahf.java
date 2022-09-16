package defpackage;

import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eahf  reason: default package */
/* loaded from: classes6.dex */
public final class eahf implements eajy {
    int a;
    byte b;
    int c;
    int d;
    short e;
    private final eajb f;

    public eahf(eajb eajbVar) {
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
                int b = eahh.b(this.f);
                this.d = b;
                this.a = b;
                byte h = (byte) (this.f.h() & 255);
                this.b = (byte) (this.f.h() & 255);
                if (eahh.a.isLoggable(Level.FINE)) {
                    eahh.a.fine(eagn.c(true, this.c, this.a, h, this.b));
                }
                k = this.f.k() & Integer.MAX_VALUE;
                this.c = k;
                if (h != 9) {
                    throw eagn.b("%s != TYPE_CONTINUATION", Byte.valueOf(h));
                }
            } else {
                long Te = this.f.Te(eaizVar, Math.min(8192L, i2));
                if (Te == -1) {
                    return -1L;
                }
                this.d = (int) (this.d - Te);
                return Te;
            }
        } while (k == i);
        throw eagn.b("TYPE_CONTINUATION streamId changed", new Object[0]);
    }

    @Override // defpackage.eajy
    public final eaka b() {
        return this.f.b();
    }

    @Override // defpackage.eajy, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
