package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aznn  reason: default package */
/* loaded from: classes2.dex */
public final class aznn extends ayor {
    static final aznf b;
    static final ScheduledExecutorService c;
    final AtomicReference d;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        b = new aznf("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public aznn() {
        aznf aznfVar = b;
        AtomicReference atomicReference = new AtomicReference();
        this.d = atomicReference;
        atomicReference.lazySet(aznl.a(aznfVar));
    }

    @Override // defpackage.ayor
    public final ayoq a() {
        return new aznm((ScheduledExecutorService) this.d.get());
    }

    @Override // defpackage.ayor
    public final aypg c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future schedule;
        azqc.o(runnable);
        aznh aznhVar = new aznh(runnable);
        try {
            if (j <= 0) {
                schedule = ((ScheduledExecutorService) this.d.get()).submit(aznhVar);
            } else {
                schedule = ((ScheduledExecutorService) this.d.get()).schedule(aznhVar, j, timeUnit);
            }
            aznhVar.a(schedule);
            return aznhVar;
        } catch (RejectedExecutionException e) {
            azqc.d(e);
            return ayqj.INSTANCE;
        }
    }

    @Override // defpackage.ayor
    public final aypg d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future schedule;
        azqc.o(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.get();
            azmx azmxVar = new azmx(runnable, scheduledExecutorService);
            try {
                if (j <= 0) {
                    schedule = scheduledExecutorService.submit(azmxVar);
                } else {
                    schedule = scheduledExecutorService.schedule(azmxVar, j, timeUnit);
                }
                azmxVar.a(schedule);
                return azmxVar;
            } catch (RejectedExecutionException e) {
                azqc.d(e);
                return ayqj.INSTANCE;
            }
        }
        azng azngVar = new azng(runnable);
        try {
            azngVar.a(((ScheduledExecutorService) this.d.get()).scheduleAtFixedRate(azngVar, j, j2, timeUnit));
            return azngVar;
        } catch (RejectedExecutionException e2) {
            azqc.d(e2);
            return ayqj.INSTANCE;
        }
    }
}
