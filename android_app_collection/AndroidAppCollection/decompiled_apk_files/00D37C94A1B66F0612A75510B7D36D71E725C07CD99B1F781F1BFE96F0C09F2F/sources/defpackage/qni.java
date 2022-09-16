package defpackage;

import java.util.TimerTask;
/* compiled from: PG */
/* renamed from: qni  reason: default package */
/* loaded from: classes4.dex */
final class qni extends TimerTask {
    final /* synthetic */ qnl a;

    public qni(qnl qnlVar) {
        this.a = qnlVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        qta qtaVar;
        qnl qnlVar = this.a;
        if (!qnlVar.h.isEmpty() && qnlVar.i == null && qnlVar.b != 0) {
            qoh qohVar = qnlVar.c;
            int[] k = qpl.k(qnlVar.h);
            qnm.g("Must be called from the main thread.");
            if (!qohVar.l()) {
                qtaVar = qoh.v();
            } else {
                qns qnsVar = new qns(qohVar, k);
                qoh.u(qnsVar);
                qtaVar = qnsVar;
            }
            qnlVar.i = qtaVar;
            qnlVar.i.g(new qnh(qnlVar));
            qnlVar.h.clear();
        }
    }
}
