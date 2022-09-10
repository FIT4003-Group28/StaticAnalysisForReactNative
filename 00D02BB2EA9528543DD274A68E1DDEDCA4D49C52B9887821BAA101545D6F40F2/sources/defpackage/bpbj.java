package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpbj  reason: default package */
/* loaded from: classes3.dex */
public final class bpbj implements ink {
    final /* synthetic */ bpbl a;

    public bpbj(bpbl bpblVar) {
        this.a = bpblVar;
    }

    @Override // defpackage.ink
    public final void a(ilo iloVar) {
        this.a.bF(iloVar);
    }

    @Override // defpackage.ink
    public final void b(ilo iloVar) {
        if (!this.a.aD) {
            return;
        }
        String o = iloVar.ai().o();
        for (int i = 0; i < this.a.aX.size(); i++) {
            drdg drdgVar = this.a.aX.get(i).a;
            if (drdgVar == null) {
                drdgVar = drdg.q;
            }
            if (drdgVar.d.equals(o)) {
                bpbl bpblVar = this.a;
                iop iopVar = bpblVar.az;
                View bq = bpblVar.bq();
                dbsk.s(bq);
                iopVar.e(i, bq, this.a.H());
                return;
            }
        }
    }
}
