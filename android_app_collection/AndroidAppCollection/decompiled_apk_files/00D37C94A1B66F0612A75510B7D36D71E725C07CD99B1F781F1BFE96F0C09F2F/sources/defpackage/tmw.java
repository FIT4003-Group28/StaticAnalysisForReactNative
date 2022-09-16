package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: tmw  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tmw implements Runnable {
    public final /* synthetic */ tmy a;
    private final /* synthetic */ int b;

    public /* synthetic */ tmw(tmy tmyVar, int i) {
        this.b = i;
        this.a = tmyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.a();
            return;
        }
        final tmy tmyVar = this.a;
        tmyVar.g = null;
        amlp l = amna.l("GIL:AutoProcessLogBatch");
        try {
            tmyVar.a.c(new tlm() { // from class: tmv
                @Override // defpackage.tlm
                public final List a() {
                    return tmy.this.b.c();
                }
            });
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
