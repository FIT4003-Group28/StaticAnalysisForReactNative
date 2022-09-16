package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anle  reason: default package */
/* loaded from: classes.dex */
public final class anle extends anlb implements ankx {
    final ScheduledExecutorService a;

    public anle(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final ankv schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        anlq h = anlq.h(runnable, null);
        return new anlc(h, this.a.schedule(h, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final ankv schedule(Callable callable, long j, TimeUnit timeUnit) {
        anlq g = anlq.g(callable);
        return new anlc(g, this.a.schedule(g, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final ankv scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        anld anldVar = new anld(runnable);
        return new anlc(anldVar, this.a.scheduleAtFixedRate(anldVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final ankv scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        anld anldVar = new anld(runnable);
        return new anlc(anldVar, this.a.scheduleWithFixedDelay(anldVar, j, j2, timeUnit));
    }
}
