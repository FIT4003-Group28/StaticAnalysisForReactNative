package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: spe  reason: default package */
/* loaded from: classes4.dex */
public final class spe extends AbstractExecutorService {
    public final spl a;
    public final spn b;
    public final spo c;
    public final boolean d;
    public final ankx e;
    private final AtomicInteger f = new AtomicInteger(1000);
    private final ExecutorService g;
    private final spg h;

    public spe(spn spnVar, spo spoVar, boolean z, ankx ankxVar, spl splVar, ExecutorService executorService, spg spgVar) {
        this.a = splVar;
        this.g = executorService;
        this.h = spgVar;
        this.b = spnVar;
        this.c = spoVar;
        this.d = z;
        this.e = ankxVar;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.g.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.c.c();
        if (spm.c()) {
            this.g.execute(new spd(this, runnable));
        } else {
            this.g.execute(runnable);
        }
        this.c.a();
        if (spm.c()) {
            int a = this.h.a();
            this.c.b();
            if (a < 1000) {
                return;
            }
            while (true) {
                int i = this.f.get();
                if (a < i) {
                    return;
                }
                if (this.f.compareAndSet(i, i + i)) {
                    this.c.b();
                    StringBuilder sb = new StringBuilder(69);
                    sb.append("Queue size of ");
                    sb.append(a);
                    sb.append(" exceeds starvation threshold of 1000");
                    spm.b(this.b, this.a.a(), new sph(sb.toString()));
                }
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.g.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.g.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.g.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.g.shutdownNow();
    }

    public final String toString() {
        String obj = this.g.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 12);
        sb.append("Monitoring[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }
}
