package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: soi  reason: default package */
/* loaded from: classes4.dex */
public final class soi extends AbstractExecutorService {
    private final ExecutorService a;
    private final yxm b;

    private soi(ExecutorService executorService, yxm yxmVar) {
        this.a = executorService;
        this.b = yxmVar;
    }

    public static ExecutorService a(ampq ampqVar, ExecutorService executorService) {
        return ampqVar.h() ? new soi(executorService, (yxm) ampqVar.c()) : executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        yxb a;
        final yxl yxlVar = null;
        if (!this.b.a && (a = yxd.a()) != null) {
            yxlVar = new yxl(a);
        }
        if (yxlVar == null) {
            this.a.execute(runnable);
        } else {
            this.a.execute(new Runnable() { // from class: soh
                @Override // java.lang.Runnable
                public final void run() {
                    yxl yxlVar2 = yxl.this;
                    Runnable runnable2 = runnable;
                    yxd.k(yxlVar2.a);
                    yxlVar2.b.b();
                    try {
                        runnable2.run();
                        yxlVar2.close();
                    } catch (Throwable th) {
                        try {
                            yxlVar2.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                }
            });
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    public final String toString() {
        return this.a.toString();
    }
}
