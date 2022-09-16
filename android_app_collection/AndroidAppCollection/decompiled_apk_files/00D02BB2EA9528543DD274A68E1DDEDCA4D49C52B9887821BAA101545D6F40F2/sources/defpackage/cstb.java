package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: cstb  reason: default package */
/* loaded from: classes5.dex */
final class cstb extends ThreadPoolExecutor {
    private static final long c = TimeUnit.MINUTES.toMillis(3);
    public final Set<Integer> a;
    public final String b;
    private final AtomicInteger d;
    private final ScheduledExecutorService e;

    public cstb(ScheduledExecutorService scheduledExecutorService, String str, int i, int i2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 1L, timeUnit, blockingQueue, threadFactory);
        this.d = new AtomicInteger(0);
        this.a = Collections.newSetFromMap(new ConcurrentHashMap());
        this.e = scheduledExecutorService;
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        final int incrementAndGet = this.d.incrementAndGet();
        final Throwable th = new Throwable();
        final ScheduledFuture<?> schedule = this.e.schedule(new Runnable(this, incrementAndGet, th) { // from class: csta
            private final cstb a;
            private final int b;
            private final Throwable c;

            {
                this.a = this;
                this.b = incrementAndGet;
                this.c = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cstb cstbVar = this.a;
                if (!cstbVar.a.contains(Integer.valueOf(this.b))) {
                    return;
                }
                cstl.a(cstbVar.b);
            }
        }, c, TimeUnit.MILLISECONDS);
        this.a.add(Integer.valueOf(incrementAndGet));
        super.execute(new Runnable(this, runnable, incrementAndGet, schedule) { // from class: cssz
            private final cstb a;
            private final Runnable b;
            private final int c;
            private final ScheduledFuture d;

            {
                this.a = this;
                this.b = runnable;
                this.c = incrementAndGet;
                this.d = schedule;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cstb cstbVar = this.a;
                Runnable runnable2 = this.b;
                int i = this.c;
                ScheduledFuture scheduledFuture = this.d;
                runnable2.run();
                cstbVar.a.remove(Integer.valueOf(i));
                scheduledFuture.cancel(false);
            }
        });
    }
}
