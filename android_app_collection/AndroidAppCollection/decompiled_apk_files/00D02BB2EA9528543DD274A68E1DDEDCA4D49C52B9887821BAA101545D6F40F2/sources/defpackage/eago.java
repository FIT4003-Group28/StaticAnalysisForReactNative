package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: eago  reason: default package */
/* loaded from: classes6.dex */
final class eago extends eaje {
    boolean a;
    long b;
    final /* synthetic */ eagp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eago(eagp eagpVar, eajy eajyVar) {
        super(eajyVar);
        this.c = eagpVar;
        this.a = false;
        this.b = 0L;
    }

    private final void c(IOException iOException) {
        if (this.a) {
            return;
        }
        this.a = true;
        eagp eagpVar = this.c;
        eagpVar.a.h(false, eagpVar, iOException);
    }

    @Override // defpackage.eaje, defpackage.eajy
    public final long Te(eaiz eaizVar, long j) {
        try {
            long Te = this.d.Te(eaizVar, 8192L);
            if (Te > 0) {
                this.b += Te;
            }
            return Te;
        } catch (IOException e) {
            c(e);
            throw e;
        }
    }

    @Override // defpackage.eaje, defpackage.eajy, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
        c(null);
    }
}
