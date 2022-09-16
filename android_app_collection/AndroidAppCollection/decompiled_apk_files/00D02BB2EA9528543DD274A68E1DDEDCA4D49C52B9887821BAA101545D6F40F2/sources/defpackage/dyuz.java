package defpackage;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dyuz  reason: default package */
/* loaded from: classes6.dex */
public final class dyuz implements Executor, Runnable {
    private static final Logger b = Logger.getLogger(dyuz.class.getName());
    private static final dyuw c;
    private final Executor d;
    private final Queue<Runnable> e = new ConcurrentLinkedQueue();
    public volatile int a = 0;

    static {
        dyuw dyuyVar;
        try {
            dyuyVar = new dyux(AtomicIntegerFieldUpdater.newUpdater(dyuz.class, "a"));
        } catch (Throwable th) {
            b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            dyuyVar = new dyuy();
        }
        c = dyuyVar;
    }

    public dyuz(Executor executor) {
        dbsk.t(executor, "'executor' must not be null.");
        this.d = executor;
    }

    private final void a(@dzsi Runnable runnable) {
        if (c.a(this)) {
            try {
                this.d.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.e.remove(runnable);
                }
                c.b(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Queue<Runnable> queue = this.e;
        dbsk.t(runnable, "'r' must not be null.");
        queue.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                Runnable poll = this.e.poll();
                if (poll == null) {
                    break;
                }
                try {
                    poll.run();
                } catch (RuntimeException e) {
                    Logger logger = b;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(poll);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    sb.append("Exception while executing runnable ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.internal.SerializingExecutor", "run", sb.toString(), (Throwable) e);
                }
            } catch (Throwable th) {
                c.b(this);
                throw th;
            }
        }
        c.b(this);
        if (!this.e.isEmpty()) {
            a(null);
        }
    }
}
