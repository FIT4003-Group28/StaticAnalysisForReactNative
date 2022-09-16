package defpackage;

import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayij  reason: default package */
/* loaded from: classes2.dex */
public final class ayij implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ ayji a;

    public ayij(ayji ayjiVar) {
        this.a = ayjiVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = ayji.a;
        Level level = Level.SEVERE;
        String valueOf = String.valueOf(this.a.i);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
        sb.append("[");
        sb.append(valueOf);
        sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$2", "uncaughtException", sb.toString(), th);
        ayji ayjiVar = this.a;
        if (ayjiVar.u) {
            return;
        }
        ayjiVar.u = true;
        ayjiVar.e(true);
        ayjiVar.l(false);
        ayjiVar.m(new ayih(th));
        ayjiVar.G.a(4, "PANIC! Entering TRANSIENT_FAILURE");
        ayjiVar.q.a(axyt.TRANSIENT_FAILURE);
    }
}
