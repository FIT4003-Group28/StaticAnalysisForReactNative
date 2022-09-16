package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aznr  reason: default package */
/* loaded from: classes2.dex */
public final class aznr extends ayoq implements aypg {
    volatile boolean c;
    final PriorityBlockingQueue a = new PriorityBlockingQueue();
    private final AtomicInteger d = new AtomicInteger();
    final AtomicInteger b = new AtomicInteger();

    @Override // defpackage.ayoq
    public final aypg a(Runnable runnable) {
        return g(runnable, f(TimeUnit.MILLISECONDS));
    }

    @Override // defpackage.ayoq
    public final aypg c(Runnable runnable, long j, TimeUnit timeUnit) {
        long f = f(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
        return g(new azno(runnable, this, f), f);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c;
    }

    final aypg g(Runnable runnable, long j) {
        if (this.c) {
            return ayqj.INSTANCE;
        }
        aznp aznpVar = new aznp(runnable, Long.valueOf(j), this.b.incrementAndGet());
        this.a.add(aznpVar);
        if (this.d.getAndIncrement() == 0) {
            int i = 1;
            while (!this.c) {
                aznp aznpVar2 = (aznp) this.a.poll();
                if (aznpVar2 == null) {
                    i = this.d.addAndGet(-i);
                    if (i == 0) {
                        return ayqj.INSTANCE;
                    }
                } else if (!aznpVar2.d) {
                    aznpVar2.a.run();
                }
            }
            this.a.clear();
            return ayqj.INSTANCE;
        }
        return banl.o(new aznq(this, aznpVar));
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.c = true;
    }
}
