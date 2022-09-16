package com.facebook.react.b.a;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: SimpleSettableFuture.java */
/* loaded from: classes.dex */
public class a<T> implements Future<T> {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f3169a = new CountDownLatch(1);

    /* renamed from: b  reason: collision with root package name */
    private T f3170b;

    /* renamed from: c  reason: collision with root package name */
    private Exception f3171c;

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    public void a(T t) {
        b();
        this.f3170b = t;
        this.f3169a.countDown();
    }

    public void a(Exception exc) {
        b();
        this.f3171c = exc;
        this.f3169a.countDown();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f3169a.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        this.f3169a.await();
        if (this.f3171c != null) {
            throw new ExecutionException(this.f3171c);
        }
        return this.f3170b;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) {
        if (!this.f3169a.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for result");
        }
        if (this.f3171c != null) {
            throw new ExecutionException(this.f3171c);
        }
        return this.f3170b;
    }

    public T a() {
        try {
            return get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    private void b() {
        if (this.f3169a.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }
}
