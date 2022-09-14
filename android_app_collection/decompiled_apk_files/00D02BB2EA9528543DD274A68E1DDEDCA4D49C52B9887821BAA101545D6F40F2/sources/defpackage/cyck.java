package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cyck  reason: default package */
/* loaded from: classes5.dex */
public final class cyck extends ThreadPoolExecutor {
    private cyck(int i, int i2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 60L, timeUnit, blockingQueue, threadFactory);
    }

    public static cyck a(int i, TimeUnit timeUnit, ThreadFactory threadFactory) {
        dbsk.b(i > 0, "maxThreads == 0 is invalid. At least one thread must be created.");
        cyck cyckVar = new cyck(i, i, timeUnit, new LinkedBlockingQueue(), threadFactory);
        cyckVar.allowCoreThreadTimeOut(true);
        return cyckVar;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th != null || !(runnable instanceof Future)) {
            return;
        }
        Future future = (Future) runnable;
        if (!future.isDone()) {
            return;
        }
        try {
            deha.r(future);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            e.getCause();
        }
    }
}
