package com.google.firebase.crashlytics.c.h;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f8648a;

    /* renamed from: b  reason: collision with root package name */
    private c.e.a.b.g.h<Void> f8649b = c.e.a.b.g.k.a((Object) null);

    /* renamed from: c  reason: collision with root package name */
    private final Object f8650c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private ThreadLocal<Boolean> f8651d = new ThreadLocal<>();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f8651d.set(true);
        }
    }

    /* loaded from: classes.dex */
    class b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f8653a;

        b(i iVar, Runnable runnable) {
            this.f8653a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            this.f8653a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements c.e.a.b.g.a<Void, T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callable f8654a;

        c(i iVar, Callable callable) {
            this.f8654a = callable;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
        @Override // c.e.a.b.g.a
        public T a(c.e.a.b.g.h<Void> hVar) {
            return this.f8654a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements c.e.a.b.g.a<T, Void> {
        d(i iVar) {
        }

        @Override // c.e.a.b.g.a
        public Void a(c.e.a.b.g.h<T> hVar) {
            return null;
        }
    }

    public i(ExecutorService executorService) {
        this.f8648a = executorService;
        executorService.submit(new a());
    }

    private <T> c.e.a.b.g.h<Void> a(c.e.a.b.g.h<T> hVar) {
        return hVar.a(this.f8648a, new d(this));
    }

    private <T> c.e.a.b.g.a<Void, T> c(Callable<T> callable) {
        return new c(this, callable);
    }

    private boolean c() {
        return Boolean.TRUE.equals(this.f8651d.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Void> a(Runnable runnable) {
        return a(new b(this, runnable));
    }

    public <T> c.e.a.b.g.h<T> a(Callable<T> callable) {
        c.e.a.b.g.h<T> a2;
        synchronized (this.f8650c) {
            a2 = this.f8649b.a((Executor) this.f8648a, (c.e.a.b.g.a<Void, TContinuationResult>) c(callable));
            this.f8649b = a(a2);
        }
        return a2;
    }

    public void a() {
        if (c()) {
            return;
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public <T> c.e.a.b.g.h<T> b(Callable<c.e.a.b.g.h<T>> callable) {
        c.e.a.b.g.h<T> b2;
        synchronized (this.f8650c) {
            b2 = this.f8649b.b(this.f8648a, c(callable));
            this.f8649b = a(b2);
        }
        return b2;
    }

    public Executor b() {
        return this.f8648a;
    }
}
