package defpackage;

import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: defp  reason: default package */
/* loaded from: classes6.dex */
final class defp implements Runnable {
    final /* synthetic */ defw a;

    public defp(defw defwVar) {
        this.a = defwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j(defv.WILL_CLOSE, defv.CLOSING);
        defw defwVar = this.a;
        defw.a.logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "close", "closing {0}", defwVar);
        defwVar.b.close();
        this.a.j(defv.CLOSING, defv.CLOSED);
    }
}
