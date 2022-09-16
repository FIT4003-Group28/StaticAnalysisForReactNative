package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: snl  reason: default package */
/* loaded from: classes4.dex */
public final class snl extends ScheduledThreadPoolExecutor {
    public snl(ThreadFactory threadFactory) {
        super(1, threadFactory);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected final RunnableScheduledFuture decorateTask(Runnable runnable, RunnableScheduledFuture runnableScheduledFuture) {
        return soo.b(runnableScheduledFuture);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected final RunnableScheduledFuture decorateTask(Callable callable, RunnableScheduledFuture runnableScheduledFuture) {
        return soo.b(runnableScheduledFuture);
    }
}
