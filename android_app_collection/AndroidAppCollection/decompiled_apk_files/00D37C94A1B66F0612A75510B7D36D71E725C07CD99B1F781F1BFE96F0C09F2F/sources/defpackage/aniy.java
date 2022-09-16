package defpackage;

import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aniy  reason: default package */
/* loaded from: classes.dex */
public final class aniy implements Runnable {
    final /* synthetic */ anjd a;

    public aniy(anjd anjdVar) {
        this.a = anjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(anjc.WILL_CLOSE, anjc.CLOSING);
        anjd anjdVar = this.a;
        anjd.a.logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "close", "closing {0}", anjdVar);
        anjdVar.b.close();
        this.a.e(anjc.CLOSING, anjc.CLOSED);
    }
}
