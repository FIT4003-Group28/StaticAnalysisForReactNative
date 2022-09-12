package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bza  reason: default package */
/* loaded from: classes.dex */
public final class bza implements ExecutorService {
    public static final long a = TimeUnit.SECONDS.toMillis(10);
    private static volatile int b;
    private final ExecutorService c;

    public bza(ExecutorService executorService) {
        this.c = executorService;
    }

    public static byv a() {
        byv byvVar = new byv(false);
        byvVar.b(b());
        byvVar.b = "source";
        return byvVar;
    }

    public static int b() {
        if (b == 0) {
            b = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return b;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.c.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.c.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.c.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.c.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.c.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.c.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.c.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.c.submit(runnable);
    }

    public final String toString() {
        return this.c.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.c.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.c.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.c.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.c.submit(callable);
    }
}
