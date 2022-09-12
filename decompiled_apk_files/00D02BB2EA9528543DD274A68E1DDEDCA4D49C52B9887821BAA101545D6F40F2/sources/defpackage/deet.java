package defpackage;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
/* compiled from: PG */
/* renamed from: deet  reason: default package */
/* loaded from: classes.dex */
public abstract class deet extends AbstractExecutorService implements dehp {
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: a */
    public final dehn<?> submit(Runnable runnable) {
        return (dehn) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: b */
    public final <T> dehn<T> submit(Runnable runnable, T t) {
        return (dehn) super.submit(runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: c */
    public final <T> dehn<T> submit(Callable<T> callable) {
        return (dehn) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return deiv.g(runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return deiv.f(callable);
    }
}
