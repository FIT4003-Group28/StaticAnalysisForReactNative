package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: eaga  reason: default package */
/* loaded from: classes6.dex */
abstract class eaga implements eajy {
    protected final eajf a;
    protected boolean b;
    protected long c = 0;
    final /* synthetic */ eagg d;

    public eaga(eagg eaggVar) {
        this.d = eaggVar;
        this.a = new eajf(eaggVar.c.b());
    }

    @Override // defpackage.eajy
    public long Te(eaiz eaizVar, long j) {
        try {
            long Te = this.d.c.Te(eaizVar, j);
            if (Te > 0) {
                this.c += Te;
            }
            return Te;
        } catch (IOException e) {
            c(false, e);
            throw e;
        }
    }

    @Override // defpackage.eajy
    public final eaka b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(boolean z, IOException iOException) {
        int i = this.d.e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + this.d.e);
        }
        eagg.k(this.a);
        eagg eaggVar = this.d;
        eaggVar.e = 6;
        eafm eafmVar = eaggVar.b;
        if (eafmVar == null) {
            return;
        }
        eafmVar.h(!z, eaggVar, iOException);
    }
}
