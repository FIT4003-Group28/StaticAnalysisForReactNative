package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bvpv  reason: default package */
/* loaded from: classes.dex */
public final class bvpv implements ScheduledExecutorService {
    public static final /* synthetic */ int a = 0;
    private final dxio<bvrb> b;
    private final bvrj c;
    private final cqat d;

    public bvpv(dxio<bvrb> dxioVar, bvrj bvrjVar, cqat cqatVar) {
        this.b = dxioVar;
        this.c = bvrjVar;
        this.d = cqatVar;
    }

    private final <V> bvqx<V> b(Runnable runnable, V v, long j) {
        bvqx<V> bvqxVar = new bvqx<>(new bvqy(runnable, this.d, j), v, false);
        if (j == 0) {
            this.b.a().b(bvqxVar, this.c);
        } else {
            this.b.a().a(bvqxVar, this.c, j);
        }
        return bvqxVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: a */
    public final bvqx<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return b(runnable, null, timeUnit.toMillis(j));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This method has not been implemented yet.");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.a().b(runnable, this.c);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        throw new UnsupportedOperationException("This method has not been implemented yet.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        throw new UnsupportedOperationException("This method has not been implemented yet.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(final Callable<V> callable, long j, TimeUnit timeUnit) {
        final bvqx bvqxVar = new bvqx(new bvqy(bvpn.a, this.d, timeUnit.toMillis(j)), null, false);
        bvqxVar.a(schedule(new Runnable(callable, bvqxVar) { // from class: bvpo
            private final Callable a;
            private final bvqx b;

            {
                this.a = callable;
                this.b = bvqxVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = this.a;
                bvqx bvqxVar2 = this.b;
                int i = bvpv.a;
                try {
                    bvqxVar2.b.a(callable2.call());
                } catch (Throwable th) {
                    bvqxVar2.b.setException(th);
                    if (th instanceof bvqw) {
                        throw ((bvqw) th);
                    }
                    throw new bvqw(th);
                }
            }
        }, j, timeUnit).a);
        return bvqxVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        bvqr bvqrVar = new bvqr(dehx.b(this));
        bvqx bvqxVar = new bvqx(new bvqy(bvpp.a, this.d, timeUnit.toMillis(j2)), null, true);
        bvqxVar.a(schedule(new bvpt(this, bvqrVar, bvqxVar, j2, timeUnit, runnable), j, timeUnit).a);
        return bvqxVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        bvqx bvqxVar = new bvqx(new bvqy(bvpq.a, this.d, timeUnit.toMillis(j2)), null, true);
        bvqxVar.a(schedule(new bvpu(this, runnable, bvqxVar, j2, timeUnit), j, timeUnit).a);
        return bvqxVar;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("This method has not been implemented yet.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("This method has not been implemented yet.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return b(runnable, null, 0L);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This method has not been implemented yet.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This method has not been implemented yet.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return b(runnable, t, 0L);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return schedule(callable, 0L, TimeUnit.MILLISECONDS);
    }
}
