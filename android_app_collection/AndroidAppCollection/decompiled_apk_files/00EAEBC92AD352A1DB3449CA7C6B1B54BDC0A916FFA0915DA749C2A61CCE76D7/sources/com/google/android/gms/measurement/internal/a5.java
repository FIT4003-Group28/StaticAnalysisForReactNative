package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class a5 extends b6 {
    private static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c  reason: collision with root package name */
    private e5 f7160c;

    /* renamed from: d  reason: collision with root package name */
    private e5 f7161d;

    /* renamed from: e  reason: collision with root package name */
    private final PriorityBlockingQueue<b5<?>> f7162e;

    /* renamed from: f  reason: collision with root package name */
    private final BlockingQueue<b5<?>> f7163f;

    /* renamed from: g  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f7164g;

    /* renamed from: h  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f7165h;
    private final Object i;
    private final Semaphore j;
    private volatile boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a5(d5 d5Var) {
        super(d5Var);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.f7162e = new PriorityBlockingQueue<>();
        this.f7163f = new LinkedBlockingQueue();
        this.f7164g = new c5(this, "Thread death: Uncaught exception on worker thread");
        this.f7165h = new c5(this, "Thread death: Uncaught exception on network thread");
    }

    private final void a(b5<?> b5Var) {
        synchronized (this.i) {
            this.f7162e.add(b5Var);
            if (this.f7160c == null) {
                this.f7160c = new e5(this, "Measurement Worker", this.f7162e);
                this.f7160c.setUncaughtExceptionHandler(this.f7164g);
                this.f7160c.start();
            } else {
                this.f7160c.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> T a(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            a().a(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                b4 v = c().v();
                String valueOf = String.valueOf(str);
                v.a(valueOf.length() != 0 ? "Interrupted waiting for ".concat(valueOf) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            b4 v2 = c().v();
            String valueOf2 = String.valueOf(str);
            v2.a(valueOf2.length() != 0 ? "Timed out waiting for ".concat(valueOf2) : new String("Timed out waiting for "));
        }
        return t;
    }

    public final <V> Future<V> a(Callable<V> callable) {
        n();
        com.google.android.gms.common.internal.s.a(callable);
        b5<?> b5Var = new b5<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f7160c) {
            if (!this.f7162e.isEmpty()) {
                c().v().a("Callable skipped the worker queue.");
            }
            b5Var.run();
        } else {
            a(b5Var);
        }
        return b5Var;
    }

    public final void a(Runnable runnable) {
        n();
        com.google.android.gms.common.internal.s.a(runnable);
        a(new b5<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final <V> Future<V> b(Callable<V> callable) {
        n();
        com.google.android.gms.common.internal.s.a(callable);
        b5<?> b5Var = new b5<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f7160c) {
            b5Var.run();
        } else {
            a(b5Var);
        }
        return b5Var;
    }

    public final void b(Runnable runnable) {
        n();
        com.google.android.gms.common.internal.s.a(runnable);
        b5<?> b5Var = new b5<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            this.f7163f.add(b5Var);
            if (this.f7161d == null) {
                this.f7161d = new e5(this, "Measurement Network", this.f7163f);
                this.f7161d.setUncaughtExceptionHandler(this.f7165h);
                this.f7161d.start();
            } else {
                this.f7161d.a();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.y5
    public final void f() {
        if (Thread.currentThread() == this.f7161d) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }

    @Override // com.google.android.gms.measurement.internal.y5
    public final void g() {
        if (Thread.currentThread() == this.f7160c) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    @Override // com.google.android.gms.measurement.internal.b6
    protected final boolean q() {
        return false;
    }

    public final boolean s() {
        return Thread.currentThread() == this.f7160c;
    }
}
