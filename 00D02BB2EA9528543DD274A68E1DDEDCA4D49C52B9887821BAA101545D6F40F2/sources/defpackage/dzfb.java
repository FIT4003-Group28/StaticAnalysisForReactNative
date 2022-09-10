package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzfb  reason: default package */
/* loaded from: classes6.dex */
public final class dzfb extends dyzz {
    static final dzeu b;
    static final ScheduledExecutorService c;
    final AtomicReference<ScheduledExecutorService> a;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        b = new dzeu("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public dzfb() {
        dzeu dzeuVar = b;
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.a = atomicReference;
        atomicReference.lazySet(dzez.a(dzeuVar));
    }

    @Override // defpackage.dyzz
    public final dyzy a() {
        return new dzfa(this.a.get());
    }

    @Override // defpackage.dyzz
    public final dzak c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        dzfy.c(runnable);
        dzev dzevVar = new dzev(runnable);
        try {
            if (j <= 0) {
                schedule = this.a.get().submit(dzevVar);
            } else {
                schedule = this.a.get().schedule(dzevVar, j, timeUnit);
            }
            dzevVar.b(schedule);
            return dzevVar;
        } catch (RejectedExecutionException e) {
            dzfy.a(e);
            return dzbe.INSTANCE;
        }
    }
}
