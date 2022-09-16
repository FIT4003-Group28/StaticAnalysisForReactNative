package defpackage;

import com.google.android.libraries.youtube.common.concurrent.YouTubeFutures$LifecycleAwareFutureCallback;
import com.google.android.libraries.youtube.common.concurrent.YouTubeFutures$LifecycleAwareFutureWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: ylx */
/* loaded from: classes4.dex */
public final class ylx {
    private static final amqo c = aqxo.i(gsh.m);
    public static final Executor a = qrj.e;
    private static final ylv d = ngc.l;
    public static final ylw b = lgj.n;

    public static ankb a(zdt zdtVar) {
        return new ylu(zdtVar);
    }

    public static ankt b(apy apyVar, ankt anktVar, ampg ampgVar) {
        return new YouTubeFutures$LifecycleAwareFutureWrapper(apt.CREATED, apyVar.getLifecycle(), anktVar, ampgVar);
    }

    public static ankt c(apy apyVar, ankt anktVar, ampg ampgVar) {
        return new YouTubeFutures$LifecycleAwareFutureWrapper(apt.RESUMED, apyVar.getLifecycle(), anktVar, ampgVar);
    }

    public static Object d(Future future, ampg ampgVar) {
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Exception exc = (Exception) ampgVar.apply(e);
            exc.getClass();
            throw exc;
        } catch (ExecutionException e2) {
            t(e2.getCause(), ampgVar);
            throw new AssertionError();
        }
    }

    public static Object e(Future future, ampg ampgVar, long j, TimeUnit timeUnit) {
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Exception exc = (Exception) ampgVar.apply(e);
            exc.getClass();
            throw exc;
        } catch (ExecutionException e2) {
            t(e2.getCause(), ampgVar);
            throw new AssertionError();
        } catch (TimeoutException e3) {
            Exception exc2 = (Exception) ampgVar.apply(e3);
            exc2.getClass();
            throw exc2;
        }
    }

    public static Object f(Future future, Object obj) {
        try {
            return d(future, ydy.d);
        } catch (Exception e) {
            zep.d("Failed to get the result of the future.", e);
            return obj;
        }
    }

    public static Object g(Future future, long j, TimeUnit timeUnit, Object obj) {
        try {
            return e(future, ydy.d, j, timeUnit);
        } catch (Exception e) {
            zep.d("Failed to get the result of the future.", e);
            return obj;
        }
    }

    public static Object h(Future future, Object obj) {
        try {
            return anlz.y(future);
        } catch (Exception e) {
            zep.d("Failed to get the value of the future.", e);
            return obj;
        }
    }

    public static void i(ankt anktVar, ylw ylwVar) {
        k(anktVar, anjk.a, d, ylwVar);
    }

    public static void j(ankt anktVar, Executor executor, ylv ylvVar) {
        k(anktVar, executor, ylvVar, b);
    }

    public static void k(ankt anktVar, Executor executor, ylv ylvVar, ylw ylwVar) {
        l(anktVar, executor, ylvVar, ylwVar, null);
    }

    public static void l(ankt anktVar, Executor executor, ylv ylvVar, ylw ylwVar, Runnable runnable) {
        anlz.A(anktVar, new ylt(ylwVar, runnable, ylvVar), executor);
    }

    public static void m(ankt anktVar, ylv ylvVar) {
        k(anktVar, anjk.a, ylvVar, b);
    }

    public static void n(apy apyVar, ankt anktVar, zdt zdtVar, zdt zdtVar2) {
        s(apyVar.getLifecycle(), anktVar, zdtVar, zdtVar2, apt.CREATED);
    }

    public static void o(apy apyVar, ankt anktVar, zdt zdtVar, zdt zdtVar2) {
        s(apyVar.getLifecycle(), anktVar, zdtVar, zdtVar2, apt.RESUMED);
    }

    public static void p(apy apyVar, ankt anktVar, zdt zdtVar, zdt zdtVar2) {
        s(apyVar.getLifecycle(), anktVar, zdtVar, zdtVar2, apt.STARTED);
    }

    public static /* synthetic */ void q(Runnable runnable) {
        if (ylr.e()) {
            runnable.run();
        } else {
            ((Executor) c.get()).execute(runnable);
        }
    }

    private static void s(apu apuVar, ankt anktVar, zdt zdtVar, zdt zdtVar2, apt aptVar) {
        ylr.c();
        anlz.A(anktVar, new YouTubeFutures$LifecycleAwareFutureCallback(aptVar, apuVar, zdtVar2, zdtVar), a);
    }

    private static void t(Throwable th, ampg ampgVar) {
        if (th instanceof Error) {
            throw new anjl((Error) th);
        }
        if (th instanceof RuntimeException) {
            throw new anlr(th);
        }
        Exception exc = (Exception) ampgVar.apply(th);
        exc.getClass();
        throw exc;
    }
}
