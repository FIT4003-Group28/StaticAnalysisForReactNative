package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azmy  reason: default package */
/* loaded from: classes2.dex */
final class azmy implements Runnable {
    public final long a;
    public final ConcurrentLinkedQueue b;
    final aypf c;
    public final ThreadFactory d;
    private final ScheduledExecutorService e;
    private final Future f;

    public azmy(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        ScheduledFuture<?> scheduledFuture;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.a = nanos;
        this.b = new ConcurrentLinkedQueue();
        this.c = new aypf();
        this.d = threadFactory;
        ScheduledExecutorService scheduledExecutorService = null;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, aznb.c);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            scheduledFuture = null;
        }
        this.e = scheduledExecutorService;
        this.f = scheduledFuture;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c.qr();
        Future future = this.f;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = this.e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.b.isEmpty()) {
            long nanoTime = System.nanoTime();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                azna aznaVar = (azna) it.next();
                if (aznaVar.a > nanoTime) {
                    return;
                }
                if (this.b.remove(aznaVar)) {
                    this.c.i(aznaVar);
                }
            }
        }
    }
}
