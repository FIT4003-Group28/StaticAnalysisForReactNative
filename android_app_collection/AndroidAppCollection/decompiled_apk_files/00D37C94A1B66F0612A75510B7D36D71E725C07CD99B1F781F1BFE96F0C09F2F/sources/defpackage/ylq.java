package defpackage;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ylq  reason: default package */
/* loaded from: classes4.dex */
public final class ylq extends ylk {
    public static final List a = new CopyOnWriteArrayList();
    public final ykz b;

    public ylq(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
        this.b = new ykz();
        a.add(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        ykz ykzVar = this.b;
        if (th == null && (runnable instanceof Future)) {
            try {
                Future future = (Future) runnable;
                if (future.isDone() && !future.isCancelled()) {
                    future.get();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                th = e.getCause();
            }
        }
        if (!ykzVar.a.isEmpty()) {
            for (ylo yloVar : ykzVar.a) {
                yloVar.e(th);
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        ykz ykzVar = this.b;
        if (!ykzVar.a.isEmpty()) {
            for (ylo yloVar : ykzVar.a) {
                yloVar.d();
            }
        }
    }

    @Override // defpackage.ylk, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return super.schedule(this.b.a(runnable), j, timeUnit);
    }

    @Override // defpackage.ylk, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleAtFixedRate(this.b.a(runnable), j, j2, timeUnit);
    }

    @Override // defpackage.ylk, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleWithFixedDelay(this.b.a(runnable), j, j2, timeUnit);
    }

    @Override // defpackage.ylk, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        ykz ykzVar = this.b;
        if (!ykzVar.a.isEmpty()) {
            for (ylo yloVar : ykzVar.a) {
                callable = yloVar.b(callable);
            }
        }
        return super.schedule(callable, j, timeUnit);
    }
}
