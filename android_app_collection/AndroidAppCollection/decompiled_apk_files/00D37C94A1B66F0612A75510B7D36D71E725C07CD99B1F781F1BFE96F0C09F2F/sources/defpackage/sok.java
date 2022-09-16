package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
/* compiled from: PG */
/* renamed from: sok  reason: default package */
/* loaded from: classes4.dex */
public final class sok extends AbstractExecutorService {
    public boolean e;
    public final ThreadFactory g;
    public final boolean h;
    public final CountDownLatch i;
    public final sov j;
    private final int k;
    private boolean l;
    private final boolean m;
    private final soj[] n;
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicInteger c = new AtomicInteger();
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicBoolean f = new AtomicBoolean();

    public sok(int i, ThreadFactory threadFactory) {
        if (i > 0) {
            this.k = Integer.MAX_VALUE;
            this.g = threadFactory;
            this.h = true;
            this.m = true;
            this.i = new CountDownLatch(i);
            soj[] sojVarArr = new soj[i];
            for (int i2 = 0; i2 < i; i2++) {
                sojVarArr[i2] = new soj(this, i2);
            }
            this.n = sojVarArr;
            this.j = new sov(sojVarArr);
            return;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("numThreads must be positive: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private final void b(boolean z) {
        sou souVar;
        this.l = true;
        sov sovVar = this.j;
        while (true) {
            sou souVar2 = (sou) sovVar.c.get();
            if (souVar2.a == sov.a) {
                return;
            }
            if (souVar2.a != sov.b || z) {
                souVar = sovVar.e[0];
            } else {
                souVar = sovVar.e[souVar2.b];
            }
            if (sovVar.c.compareAndSet(souVar2, souVar)) {
                while (souVar2.a != sov.b) {
                    soj sojVar = sovVar.f[souVar2.b];
                    Thread thread = sojVar.b;
                    sojVar.i = 3;
                    if (thread == null) {
                        sojVar.a();
                    } else {
                        LockSupport.unpark(thread);
                    }
                    souVar2 = (sou) souVar2.a;
                }
            }
        }
    }

    public final void a() {
        if (this.m) {
            this.b.decrementAndGet();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.i.await(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i;
        runnable.getClass();
        if (!this.l) {
            if (this.m) {
                if (this.k != Integer.MAX_VALUE) {
                    do {
                        i = this.b.get();
                        if (i != this.k) {
                        }
                    } while (!this.b.compareAndSet(i, i + 1));
                } else {
                    this.b.incrementAndGet();
                }
            }
            sou souVar = new sou(runnable, -1);
            this.a.add(souVar);
            sov sovVar = this.j;
            while (true) {
                sou souVar2 = (sou) sovVar.c.get();
                if (souVar2.a == sov.b) {
                    int i2 = souVar2.b;
                    int min = Math.min(i2 + 1, sovVar.f.length);
                    if (min == i2 || sovVar.c.compareAndSet(souVar2, sovVar.d[min])) {
                        return;
                    }
                } else if (souVar2.a != sov.a) {
                    int i3 = souVar2.b;
                    if (sovVar.c.compareAndSet(souVar2, (sou) souVar2.a)) {
                        soj sojVar = sovVar.f[i3];
                        Thread thread = sojVar.b;
                        sojVar.i = 1;
                        if (thread != null) {
                            LockSupport.unpark(thread);
                            return;
                        }
                        sojVar.h.c.incrementAndGet();
                        sojVar.b();
                        return;
                    }
                } else if (!this.a.remove(souVar)) {
                    return;
                } else {
                    a();
                    throw new RejectedExecutionException();
                }
            }
        }
        throw new RejectedExecutionException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return ((sou) this.j.c.get()).a == sov.a;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.i.getCount() == 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        b(false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        b(true);
        ArrayList arrayList = new ArrayList();
        if (this.f.compareAndSet(false, true)) {
            while (true) {
                sou souVar = (sou) this.a.poll();
                if (souVar == null) {
                    break;
                }
                a();
                arrayList.add((Runnable) souVar.a);
            }
            this.e = true;
            for (soj sojVar : this.n) {
                Thread thread = sojVar.c;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        return arrayList;
    }
}
