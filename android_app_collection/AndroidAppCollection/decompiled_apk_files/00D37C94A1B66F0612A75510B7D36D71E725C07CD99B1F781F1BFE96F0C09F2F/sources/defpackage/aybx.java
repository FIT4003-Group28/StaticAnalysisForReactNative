package defpackage;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aybx  reason: default package */
/* loaded from: classes2.dex */
public final class aybx implements Executor {
    private final Thread.UncaughtExceptionHandler a;
    private final Queue b = new ConcurrentLinkedQueue();
    private final AtomicReference c = new AtomicReference();

    public aybx(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        uncaughtExceptionHandler.getClass();
        this.a = uncaughtExceptionHandler;
    }

    public final aybw a(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        aybv aybvVar = new aybv(runnable);
        return new aybw(aybvVar, scheduledExecutorService.schedule(new aybu(this, aybvVar, runnable), j, timeUnit));
    }

    public final void b() {
        while (this.c.compareAndSet(null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.b.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        this.c.set(null);
                        if (this.b.isEmpty()) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    this.c.set(null);
                    throw th;
                }
            }
        }
    }

    public final void c(Runnable runnable) {
        Queue queue = this.b;
        runnable.getClass();
        queue.add(runnable);
    }

    public final void d() {
        aqxo.z(Thread.currentThread() == this.c.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable);
        b();
    }
}
