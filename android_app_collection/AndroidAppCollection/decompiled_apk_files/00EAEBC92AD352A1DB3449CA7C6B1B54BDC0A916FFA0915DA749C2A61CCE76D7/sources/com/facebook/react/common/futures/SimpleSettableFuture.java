package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class SimpleSettableFuture<T> implements Future<T> {

    /* renamed from: b  reason: collision with root package name */
    private final CountDownLatch f5453b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    private T f5454c;

    /* renamed from: d  reason: collision with root package name */
    private Exception f5455d;

    private void b() {
        if (this.f5453b.getCount() != 0) {
            return;
        }
        throw new RuntimeException("Result has already been set!");
    }

    public T a() {
        try {
            return get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void a(Exception exc) {
        b();
        this.f5455d = exc;
        this.f5453b.countDown();
    }

    public void a(T t) {
        b();
        this.f5454c = t;
        this.f5453b.countDown();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public T get() {
        this.f5453b.await();
        Exception exc = this.f5455d;
        if (exc == null) {
            return this.f5454c;
        }
        throw new ExecutionException(exc);
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) {
        if (this.f5453b.await(j, timeUnit)) {
            Exception exc = this.f5455d;
            if (exc != null) {
                throw new ExecutionException(exc);
            }
            return this.f5454c;
        }
        throw new TimeoutException("Timed out waiting for result");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f5453b.getCount() == 0;
    }
}
