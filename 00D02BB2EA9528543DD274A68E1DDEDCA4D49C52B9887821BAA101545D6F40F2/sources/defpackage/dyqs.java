package defpackage;

import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyqs  reason: default package */
/* loaded from: classes6.dex */
public final class dyqs implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ dyrz a;

    public dyqs(dyrz dyrzVar) {
        this.a = dyrzVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = dyrz.a;
        Level level = Level.SEVERE;
        String valueOf = String.valueOf(this.a.h);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
        sb.append("[");
        sb.append(valueOf);
        sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$2", "uncaughtException", sb.toString(), th);
        dyrz dyrzVar = this.a;
        if (dyrzVar.u) {
            return;
        }
        dyrzVar.u = true;
        dyrzVar.m(true);
        dyrzVar.i(false);
        dyrzVar.r(new dyqn(th));
        dyrzVar.G.a(4, "PANIC! Entering TRANSIENT_FAILURE");
        dyrzVar.q.a(dyfk.TRANSIENT_FAILURE);
    }
}
