package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: aylx  reason: default package */
/* loaded from: classes2.dex */
final class aylx implements Executor {
    private static final Logger a = Logger.getLogger(aylx.class.getName());
    private boolean b;
    private ArrayDeque c;

    private final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(runnable);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    sb.append("Exception while executing runnable ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", sb.toString(), th);
                }
            } else {
                return;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        if (!this.b) {
            this.b = true;
            try {
                runnable.run();
                if (this.c != null) {
                    a();
                }
                this.b = false;
                return;
            } catch (Throwable th) {
                try {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(runnable);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    sb.append("Exception while executing runnable ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "execute", sb.toString(), th);
                    if (this.c != null) {
                        a();
                    }
                    this.b = false;
                    return;
                } catch (Throwable th2) {
                    if (this.c != null) {
                        a();
                    }
                    this.b = false;
                    throw th2;
                }
            }
        }
        if (this.c == null) {
            this.c = new ArrayDeque(4);
        }
        this.c.add(runnable);
    }
}
