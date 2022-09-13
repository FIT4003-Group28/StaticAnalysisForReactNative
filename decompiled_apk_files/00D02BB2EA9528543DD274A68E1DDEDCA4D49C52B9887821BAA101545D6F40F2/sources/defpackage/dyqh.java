package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dyqh  reason: default package */
/* loaded from: classes6.dex */
public final class dyqh implements Runnable {
    private static final Logger a = Logger.getLogger(dyqh.class.getName());
    private final Runnable b;

    public dyqh(Runnable runnable) {
        dbsk.t(runnable, "task");
        this.b = runnable;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("LogExceptionRunnable(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(this.b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Exception while executing runnable ");
            sb.append(valueOf);
            logger.logp(level, "io.grpc.internal.LogExceptionRunnable", "run", sb.toString(), th);
            dbue.b(th);
            throw new AssertionError(th);
        }
    }
}