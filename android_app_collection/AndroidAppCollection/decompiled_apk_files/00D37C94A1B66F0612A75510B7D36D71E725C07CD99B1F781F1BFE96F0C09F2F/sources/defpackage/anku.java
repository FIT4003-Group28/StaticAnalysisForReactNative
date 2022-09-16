package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anku  reason: default package */
/* loaded from: classes.dex */
public final class anku extends FutureTask implements ankt {
    private final anjn a;

    public anku(Runnable runnable) {
        super(runnable, null);
        this.a = new anjn();
    }

    public static anku b(Callable callable) {
        return new anku(callable);
    }

    public static anku c(Runnable runnable) {
        return new anku(runnable);
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        anjn anjnVar = this.a;
        synchronized (anjnVar) {
            if (anjnVar.b) {
                return;
            }
            anjnVar.b = true;
            anjm anjmVar = anjnVar.a;
            anjm anjmVar2 = null;
            anjnVar.a = null;
            while (anjmVar != null) {
                anjm anjmVar3 = anjmVar.c;
                anjmVar.c = anjmVar2;
                anjmVar2 = anjmVar;
                anjmVar = anjmVar3;
            }
            while (anjmVar2 != null) {
                anjn.a(anjmVar2.a, anjmVar2.b);
                anjmVar2 = anjmVar2.c;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (nanos <= 2147483647999999999L) {
            return super.get(j, timeUnit);
        }
        return super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    @Override // defpackage.ankt
    public final void qY(Runnable runnable, Executor executor) {
        anjn anjnVar = this.a;
        runnable.getClass();
        executor.getClass();
        synchronized (anjnVar) {
            if (!anjnVar.b) {
                anjnVar.a = new anjm(runnable, executor, anjnVar.a);
            } else {
                anjn.a(runnable, executor);
            }
        }
    }

    public anku(Callable callable) {
        super(callable);
        this.a = new anjn();
    }
}
