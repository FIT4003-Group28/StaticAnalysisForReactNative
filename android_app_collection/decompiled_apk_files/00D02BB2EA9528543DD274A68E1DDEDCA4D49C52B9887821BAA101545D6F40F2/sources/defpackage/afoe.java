package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afoe  reason: default package */
/* loaded from: classes2.dex */
public final class afoe implements afks {
    private final afmu a;

    public afoe(afmu afmuVar) {
        dbsk.s(afmuVar);
        this.a = afmuVar;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        final afmu afmuVar = this.a;
        final dwsr dwsrVar = duqpVar.s;
        if (dwsrVar == null) {
            dwsrVar = dwsr.g;
        }
        final cgem cgemVar = cgem.URL_INTENT;
        return new Runnable(afmuVar, dwsrVar, cgemVar) { // from class: afmt
            private final afmu a;
            private final dwsr b;
            private final cgem c;

            {
                this.a = afmuVar;
                this.b = dwsrVar;
                this.c = cgemVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afmu afmuVar2 = this.a;
                afmuVar2.a.a().f(this.b, this.c);
            }
        };
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_UGC_TASKS;
    }
}
