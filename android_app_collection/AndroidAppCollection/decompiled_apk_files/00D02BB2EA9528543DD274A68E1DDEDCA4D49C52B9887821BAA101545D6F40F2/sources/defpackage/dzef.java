package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzef  reason: default package */
/* loaded from: classes6.dex */
public final class dzef extends dyzz {
    static final dzed a;
    static final dzeu b;
    static final int c;
    static final dzee d;
    final ThreadFactory e;
    final AtomicReference<dzed> f;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        c = availableProcessors;
        dzee dzeeVar = new dzee(new dzeu("RxComputationShutdown"));
        d = dzeeVar;
        dzeeVar.SQ();
        dzeu dzeuVar = new dzeu("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        b = dzeuVar;
        dzed dzedVar = new dzed(0, dzeuVar);
        a = dzedVar;
        dzedVar.b();
    }

    public dzef() {
        dzeu dzeuVar = b;
        this.e = dzeuVar;
        dzed dzedVar = a;
        AtomicReference<dzed> atomicReference = new AtomicReference<>(dzedVar);
        this.f = atomicReference;
        dzed dzedVar2 = new dzed(c, dzeuVar);
        if (!atomicReference.compareAndSet(dzedVar, dzedVar2)) {
            dzedVar2.b();
        }
    }

    @Override // defpackage.dyzz
    public final dyzy a() {
        return new dzec(this.f.get().a());
    }

    @Override // defpackage.dyzz
    public final dzak c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f.get().a().e(runnable, j, timeUnit);
    }
}
