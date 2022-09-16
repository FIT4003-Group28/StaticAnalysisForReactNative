package defpackage;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: rlu  reason: default package */
/* loaded from: classes4.dex */
public final class rlu extends rmk {
    public static final AtomicLong a = new AtomicLong(Long.MIN_VALUE);
    public rlt b;
    public rlt c;
    public final Object d;
    public final Semaphore e;
    public volatile boolean f;
    private final PriorityBlockingQueue g;
    private final BlockingQueue h;
    private final Thread.UncaughtExceptionHandler i;
    private final Thread.UncaughtExceptionHandler j;

    public rlu(rlx rlxVar) {
        super(rlxVar);
        this.d = new Object();
        this.e = new Semaphore(2);
        this.g = new PriorityBlockingQueue();
        this.h = new LinkedBlockingQueue();
        this.i = new rlr(this, "Thread death: Uncaught exception on worker thread");
        this.j = new rlr(this, "Thread death: Uncaught exception on network thread");
    }

    public final Object a(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            aH().g(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                aG().f.a(str.length() != 0 ? "Interrupted waiting for ".concat(str) : new String("Interrupted waiting for "));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            aG().f.a(str.length() != 0 ? "Timed out waiting for ".concat(str) : new String("Timed out waiting for "));
        }
        return obj;
    }

    public final Future b(Callable callable) {
        j();
        qnm.b(callable);
        rls rlsVar = new rls(this, callable, false);
        if (Thread.currentThread() == this.b) {
            if (!this.g.isEmpty()) {
                aG().f.a("Callable skipped the worker queue.");
            }
            rlsVar.run();
        } else {
            c(rlsVar);
        }
        return rlsVar;
    }

    public final void c(rls rlsVar) {
        synchronized (this.d) {
            this.g.add(rlsVar);
            rlt rltVar = this.b;
            if (rltVar != null) {
                rltVar.a();
            } else {
                rlt rltVar2 = new rlt(this, "Measurement Worker", this.g);
                this.b = rltVar2;
                rltVar2.setUncaughtExceptionHandler(this.i);
                this.b.start();
            }
        }
    }

    public final void e(Runnable runnable) {
        j();
        qnm.b(runnable);
        rls rlsVar = new rls(this, runnable, false, "Task exception on network thread");
        synchronized (this.d) {
            this.h.add(rlsVar);
            rlt rltVar = this.c;
            if (rltVar != null) {
                rltVar.a();
            } else {
                rlt rltVar2 = new rlt(this, "Measurement Network", this.h);
                this.c = rltVar2;
                rltVar2.setUncaughtExceptionHandler(this.j);
                this.c.start();
            }
        }
    }

    @Override // defpackage.rmk
    protected final boolean f() {
        return false;
    }

    public final void g(Runnable runnable) {
        j();
        qnm.b(runnable);
        c(new rls(this, runnable, false, "Task exception on worker thread"));
    }

    public final void h(Runnable runnable) {
        j();
        qnm.b(runnable);
        c(new rls(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean i() {
        return Thread.currentThread() == this.b;
    }

    @Override // defpackage.rmj
    public final void n() {
        if (Thread.currentThread() == this.b) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }
}
