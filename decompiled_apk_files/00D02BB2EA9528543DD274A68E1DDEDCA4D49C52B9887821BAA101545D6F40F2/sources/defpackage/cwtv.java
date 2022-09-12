package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwtv  reason: default package */
/* loaded from: classes.dex */
public final class cwtv implements dehq {
    public final cwtj a;
    private final dehq b;

    public cwtv(dehq dehqVar, cwtj cwtjVar) {
        dbsk.s(dehqVar);
        this.b = dehqVar;
        this.a = cwtjVar;
    }

    private final Runnable h(final Runnable runnable) {
        return new Runnable(this, runnable) { // from class: cwtt
            private final cwtv a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cwtv cwtvVar = this.a;
                try {
                    this.b.run();
                } catch (Throwable th) {
                    cwtvVar.a.a(th);
                    throw th;
                }
            }
        };
    }

    private final <V> Callable<V> i(Callable<V> callable) {
        return new cwtu(this, callable);
    }

    private final <V> List<? extends Callable<V>> j(Collection<? extends Callable<V>> collection) {
        ArrayList arrayList = new ArrayList();
        for (Callable<V> callable : collection) {
            arrayList.add(i(callable));
        }
        return arrayList;
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: a */
    public final dehn<?> submit(Runnable runnable) {
        return this.b.a(h(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.b.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: b */
    public final <V> dehn<V> submit(Runnable runnable, V v) {
        return this.b.b(h(runnable), v);
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: c */
    public final <V> dehn<V> submit(Callable<V> callable) {
        return this.b.c(i(callable));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final dehu schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b.d(h(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final <V> dehu schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return this.b.e(i(callable), j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.execute(h(runnable));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final dehu scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.b.f(h(runnable), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g */
    public final dehu scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.b.g(h(runnable), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService, defpackage.dehp
    public final <V> List<Future<V>> invokeAll(Collection<? extends Callable<V>> collection) {
        return this.b.invokeAll(j(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <V> V invokeAny(Collection<? extends Callable<V>> collection) {
        return (V) this.b.invokeAny(j(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService, defpackage.dehp
    public final <V> List<Future<V>> invokeAll(Collection<? extends Callable<V>> collection, long j, TimeUnit timeUnit) {
        return this.b.invokeAll(j(collection), j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <V> V invokeAny(Collection<? extends Callable<V>> collection, long j, TimeUnit timeUnit) {
        return (V) this.b.invokeAny(j(collection), j, timeUnit);
    }
}
