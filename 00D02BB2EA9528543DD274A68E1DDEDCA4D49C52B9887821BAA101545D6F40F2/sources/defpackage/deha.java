package defpackage;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: deha  reason: default package */
/* loaded from: classes.dex */
public final class deha extends dehh {
    public static <V> dehn<V> a(V v) {
        if (v == null) {
            return (dehn<V>) dehk.a;
        }
        return new dehk(v);
    }

    public static <V> dehn<V> b(Throwable th) {
        dbsk.s(th);
        return new dehj(th);
    }

    public static <V> dehn<V> c() {
        return new dehi();
    }

    public static <O> dehn<O> d(Callable<O> callable, Executor executor) {
        deiv f = deiv.f(callable);
        executor.execute(f);
        return f;
    }

    public static dehn<Void> e(Runnable runnable, Executor executor) {
        deiv g = deiv.g(runnable, null);
        executor.execute(g);
        return g;
    }

    public static <O> dehn<O> f(deff<O> deffVar, Executor executor) {
        deiv d = deiv.d(deffVar);
        executor.execute(d);
        return d;
    }

    public static <O> dehn<O> g(deff<O> deffVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        deiv d = deiv.d(deffVar);
        d.Pk(new degv(scheduledExecutorService.schedule(d, j, timeUnit)), dege.a);
        return d;
    }

    public static <V> dehn<V> h(dehn<V> dehnVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (dehnVar.isDone()) {
            return dehnVar;
        }
        deis deisVar = new deis(dehnVar);
        deiq deiqVar = new deiq(deisVar);
        deisVar.b = scheduledExecutorService.schedule(deiqVar, j, timeUnit);
        dehnVar.Pk(deiqVar, dege.a);
        return deisVar;
    }

    @SafeVarargs
    public static <V> dehn<List<V>> i(dehn<? extends V>... dehnVarArr) {
        return new defx(dcdc.t(dehnVarArr), true);
    }

    public static <V> dehn<List<V>> j(Iterable<? extends dehn<? extends V>> iterable) {
        return new defx(dcdc.q(iterable), true);
    }

    @SafeVarargs
    public static <V> degy<V> k(dehn<? extends V>... dehnVarArr) {
        return new degy<>(false, dcdc.t(dehnVarArr));
    }

    public static <V> degy<V> l(Iterable<? extends dehn<? extends V>> iterable) {
        return new degy<>(false, dcdc.q(iterable));
    }

    @SafeVarargs
    public static <V> degy<V> m(dehn<? extends V>... dehnVarArr) {
        return new degy<>(true, dcdc.t(dehnVarArr));
    }

    public static <V> degy<V> n(Iterable<? extends dehn<? extends V>> iterable) {
        return new degy<>(true, dcdc.q(iterable));
    }

    public static <V> dehn<V> o(dehn<V> dehnVar) {
        if (dehnVar.isDone()) {
            return dehnVar;
        }
        degz degzVar = new degz(dehnVar);
        dehnVar.Pk(degzVar, dege.a);
        return degzVar;
    }

    public static <V> dehn<List<V>> p(Iterable<? extends dehn<? extends V>> iterable) {
        return new defx(dcdc.q(iterable), false);
    }

    public static <V> void q(dehn<V> dehnVar, degu<? super V> deguVar, Executor executor) {
        dbsk.s(deguVar);
        dehnVar.Pk(new degw(dehnVar, deguVar), executor);
    }

    public static <V> V r(Future<V> future) {
        dbsk.p(future.isDone(), "Future was expected to be done: %s", future);
        return (V) deix.b(future);
    }

    public static <V> V s(Future<V> future) {
        dbsk.s(future);
        try {
            return (V) deix.b(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new degf((Error) cause);
            }
            throw new deiw(cause);
        }
    }
}
