package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: dtp  reason: default package */
/* loaded from: classes3.dex */
final class dtp implements Runnable {
    final /* synthetic */ dtq a;
    private final /* synthetic */ int b;

    public dtp(dtq dtqVar) {
        this.a = dtqVar;
    }

    public dtp(dtq dtqVar, int i) {
        this.b = i;
        this.a = dtqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            dtq dtqVar = this.a;
            try {
                if (dtqVar.e != null || !dtqVar.h) {
                    return;
                }
                qab qabVar = new qab(dtqVar.a);
                qabVar.c();
                dtqVar.e = qabVar;
                return;
            } catch (IOException | qsc | qsd unused) {
                dtqVar.e = null;
                return;
            }
        }
        qdb.b(this.a.a);
    }
}
