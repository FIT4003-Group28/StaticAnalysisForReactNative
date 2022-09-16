package com.facebook.common.b;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ScheduledFutureImpl.java */
/* loaded from: classes.dex */
public class d<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f2262a;

    /* renamed from: b  reason: collision with root package name */
    private final FutureTask<V> f2263b;

    public d(Handler handler, Callable<V> callable) {
        this.f2262a = handler;
        this.f2263b = new FutureTask<>(callable);
    }

    public d(Handler handler, Runnable runnable, V v) {
        this.f2262a = handler;
        this.f2263b = new FutureTask<>(runnable, v);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f2263b.run();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f2263b.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f2263b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f2263b.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f2263b.get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        return this.f2263b.get(j, timeUnit);
    }
}
