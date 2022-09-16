package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: deho  reason: default package */
/* loaded from: classes.dex */
public final class deho<V> extends FutureTask<V> implements dehn<V> {
    private final degh a;

    public deho(Runnable runnable) {
        super(runnable, null);
        this.a = new degh();
    }

    public static <V> deho<V> b(Callable<V> callable) {
        return new deho<>(callable);
    }

    public static <V> deho<V> c(Runnable runnable) {
        return new deho<>(runnable);
    }

    @Override // defpackage.dehn
    public final void Pk(Runnable runnable, Executor executor) {
        degh deghVar = this.a;
        dbsk.t(runnable, "Runnable was null.");
        dbsk.t(executor, "Executor was null.");
        synchronized (deghVar) {
            if (!deghVar.b) {
                deghVar.a = new degg(runnable, executor, deghVar.a);
            } else {
                degh.a(runnable, executor);
            }
        }
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        degh deghVar = this.a;
        synchronized (deghVar) {
            if (deghVar.b) {
                return;
            }
            deghVar.b = true;
            degg deggVar = deghVar.a;
            degg deggVar2 = null;
            deghVar.a = null;
            while (deggVar != null) {
                degg deggVar3 = deggVar.c;
                deggVar.c = deggVar2;
                deggVar2 = deggVar;
                deggVar = deggVar3;
            }
            while (deggVar2 != null) {
                degh.a(deggVar2.a, deggVar2.b);
                deggVar2 = deggVar2.c;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (nanos <= 2147483647999999999L) {
            return (V) super.get(j, timeUnit);
        }
        return (V) super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    public deho(Callable<V> callable) {
        super(callable);
        this.a = new degh();
    }
}
