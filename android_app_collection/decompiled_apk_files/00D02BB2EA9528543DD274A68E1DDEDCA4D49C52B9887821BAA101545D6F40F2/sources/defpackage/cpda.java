package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: cpda  reason: default package */
/* loaded from: classes.dex */
public final class cpda {
    public static <TResult> cpcq<TResult> a(TResult tresult) {
        cpcx cpcxVar = new cpcx();
        cpcxVar.t(tresult);
        return cpcxVar;
    }

    public static <TResult> cpcq<TResult> b(Exception exc) {
        cpcx cpcxVar = new cpcx();
        cpcxVar.u(exc);
        return cpcxVar;
    }

    @Deprecated
    public static <TResult> cpcq<TResult> c(Executor executor, Callable<TResult> callable) {
        cnwc.n(executor, "Executor must not be null");
        cnwc.n(callable, "Callback must not be null");
        cpcx cpcxVar = new cpcx();
        executor.execute(new cpcy(cpcxVar, callable));
        return cpcxVar;
    }

    public static <TResult> TResult d(cpcq<TResult> cpcqVar) {
        cnwc.h();
        cnwc.n(cpcqVar, "Task must not be null");
        if (cpcqVar.a()) {
            return (TResult) f(cpcqVar);
        }
        cpcz cpczVar = new cpcz();
        g(cpcqVar, cpczVar);
        cpczVar.a.await();
        return (TResult) f(cpcqVar);
    }

    public static <TResult> TResult e(cpcq<TResult> cpcqVar, long j, TimeUnit timeUnit) {
        cnwc.h();
        cnwc.n(cpcqVar, "Task must not be null");
        cnwc.n(timeUnit, "TimeUnit must not be null");
        if (cpcqVar.a()) {
            return (TResult) f(cpcqVar);
        }
        cpcz cpczVar = new cpcz();
        g(cpcqVar, cpczVar);
        if (!cpczVar.a.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for Task");
        }
        return (TResult) f(cpcqVar);
    }

    private static <TResult> TResult f(cpcq<TResult> cpcqVar) {
        if (cpcqVar.b()) {
            return cpcqVar.d();
        }
        if (cpcqVar.c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(cpcqVar.e());
    }

    private static <T> void g(cpcq<T> cpcqVar, cpcz cpczVar) {
        cpcqVar.p(cpcw.b, cpczVar);
        cpcqVar.o(cpcw.b, cpczVar);
        cpcqVar.l(cpcw.b, cpczVar);
    }
}
