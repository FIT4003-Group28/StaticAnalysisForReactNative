package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dehw  reason: default package */
/* loaded from: classes.dex */
public final class dehw extends deht implements dehq {
    final ScheduledExecutorService a;

    public dehw(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        dbsk.s(scheduledExecutorService);
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final dehu schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        deiv g = deiv.g(runnable, null);
        return new dehu(g, this.a.schedule(g, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final <V> dehu schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        deiv f = deiv.f(callable);
        return new dehu(f, this.a.schedule(f, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final dehu scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        dehv dehvVar = new dehv(runnable);
        return new dehu(dehvVar, this.a.scheduleAtFixedRate(dehvVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g */
    public final dehu scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        dehv dehvVar = new dehv(runnable);
        return new dehu(dehvVar, this.a.scheduleWithFixedDelay(dehvVar, j, j2, timeUnit));
    }
}
