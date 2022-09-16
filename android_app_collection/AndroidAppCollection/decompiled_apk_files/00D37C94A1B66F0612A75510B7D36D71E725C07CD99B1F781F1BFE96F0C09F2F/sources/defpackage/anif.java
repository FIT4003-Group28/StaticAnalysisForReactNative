package defpackage;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
/* compiled from: PG */
/* renamed from: anif  reason: default package */
/* loaded from: classes.dex */
public abstract class anif extends AbstractExecutorService implements ankw {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return anlq.h(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: qo */
    public final ankt submit(Runnable runnable) {
        return (ankt) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: qp */
    public ankt submit(Callable callable) {
        return (ankt) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: qq */
    public final ankt submit(Runnable runnable, Object obj) {
        return (ankt) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return anlq.g(callable);
    }
}
