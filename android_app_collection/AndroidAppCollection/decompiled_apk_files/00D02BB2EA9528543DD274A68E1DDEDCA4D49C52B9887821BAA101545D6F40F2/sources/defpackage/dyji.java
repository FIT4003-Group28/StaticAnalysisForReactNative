package defpackage;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dyji  reason: default package */
/* loaded from: classes6.dex */
public final class dyji implements Executor {
    private final Thread.UncaughtExceptionHandler a;
    private final Queue<Runnable> b = new ConcurrentLinkedQueue();
    private final AtomicReference<Thread> c = new AtomicReference<>();

    public dyji(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public final void a() {
        while (this.c.compareAndSet(null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable poll = this.b.poll();
                    if (poll != null) {
                        poll.run();
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

    public final void b(Runnable runnable) {
        Queue<Runnable> queue = this.b;
        dbsk.t(runnable, "runnable is null");
        queue.add(runnable);
    }

    public final void c() {
        dbsk.m(Thread.currentThread() == this.c.get(), "Not called from the SynchronizationContext");
    }

    public final dyjh d(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        dyjg dyjgVar = new dyjg(runnable);
        return new dyjh(dyjgVar, scheduledExecutorService.schedule(new dyjf(this, dyjgVar, runnable), j, timeUnit));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
