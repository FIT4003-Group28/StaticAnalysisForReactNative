package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzeb  reason: default package */
/* loaded from: classes6.dex */
class dzeb extends AtomicReference<Future> implements dzak {
    protected static final FutureTask<Void> c = new FutureTask<>(dzbl.a, null);
    protected static final FutureTask<Void> d = new FutureTask<>(dzbl.a, null);
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable a;
    protected Thread b;

    public dzeb(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        FutureTask<Void> futureTask;
        Future future = get();
        if (future == c || future == (futureTask = d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.b != Thread.currentThread());
    }

    public final void b(Future<?> future) {
        Future future2;
        do {
            future2 = get();
            if (future2 == c) {
                return;
            }
            if (future2 == d) {
                future.cancel(this.b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
