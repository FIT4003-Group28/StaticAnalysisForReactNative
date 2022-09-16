package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: sot  reason: default package */
/* loaded from: classes4.dex */
public final class sot extends anif implements ankx {
    public static final /* synthetic */ int b = 0;
    public final snc a;

    public sot(snc sncVar) {
        this.a = sncVar;
    }

    public static int a(Delayed delayed, Delayed delayed2) {
        long delay = delayed2.getDelay(TimeUnit.MILLISECONDS);
        long delay2 = delayed.getDelay(TimeUnit.MILLISECONDS);
        if (delay > delay2) {
            return -1;
        }
        return delay == delay2 ? 0 : 1;
    }

    private final ankv i(Runnable runnable, long j, long j2, TimeUnit timeUnit, boolean z) {
        long millis = timeUnit.toMillis(j);
        sor sorVar = new sor(this, runnable, millis + this.a.d(), timeUnit.toMillis(j2), z);
        uwp.g(sorVar, millis);
        j(sorVar, sorVar);
        return sorVar;
    }

    private static final void j(ankt anktVar, Runnable runnable) {
        anktVar.qY(new ibx(runnable, 3, (char[]) null), anjk.a);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final ankv schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(Executors.callable(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final ankv schedule(Callable callable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        sos sosVar = new sos(this, callable, this.a.d() + millis);
        uwp.g(sosVar, millis);
        j(sosVar, sosVar);
        return sosVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final ankv scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, true);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final ankv scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        uwp.h(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // defpackage.anif, defpackage.ankw
    public final ankt qp(final Callable callable) {
        final SettableFuture f = SettableFuture.f();
        uwp.h(new Runnable() { // from class: soq
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture = SettableFuture.this;
                Callable callable2 = callable;
                int i = sot.b;
                try {
                    settableFuture.o(callable2.call());
                } catch (Exception e) {
                    settableFuture.e(e);
                    throw new RuntimeException(e);
                }
            }
        });
        return f;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.anif, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        return submit(callable);
    }
}
