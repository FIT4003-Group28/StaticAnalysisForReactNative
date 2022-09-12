package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzff  reason: default package */
/* loaded from: classes6.dex */
public final class dzff extends dyzy implements dzak {
    volatile boolean c;
    final PriorityBlockingQueue<dzfd> a = new PriorityBlockingQueue<>();
    private final AtomicInteger d = new AtomicInteger();
    final AtomicInteger b = new AtomicInteger();

    @Override // defpackage.dzak
    public final void SQ() {
        this.c = true;
    }

    @Override // defpackage.dyzy
    public final dzak b(Runnable runnable) {
        return e(runnable, d(TimeUnit.MILLISECONDS));
    }

    @Override // defpackage.dyzy
    public final dzak c(Runnable runnable, long j, TimeUnit timeUnit) {
        long d = d(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
        return e(new dzfc(runnable, this, d), d);
    }

    final dzak e(Runnable runnable, long j) {
        if (this.c) {
            return dzbe.INSTANCE;
        }
        dzfd dzfdVar = new dzfd(runnable, Long.valueOf(j), this.b.incrementAndGet());
        this.a.add(dzfdVar);
        if (this.d.getAndIncrement() == 0) {
            int i = 1;
            while (!this.c) {
                dzfd poll = this.a.poll();
                if (poll == null) {
                    i = this.d.addAndGet(-i);
                    if (i == 0) {
                        return dzbe.INSTANCE;
                    }
                } else if (!poll.d) {
                    poll.a.run();
                }
            }
            this.a.clear();
            return dzbe.INSTANCE;
        }
        return new dzam(new dzfe(this, dzfdVar));
    }
}
