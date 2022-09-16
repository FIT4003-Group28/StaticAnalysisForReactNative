package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azmp  reason: default package */
/* loaded from: classes2.dex */
public final class azmp extends ayor implements aznj {
    static final azmo b;
    static final aznf c;
    static final int d;
    static final aznd g;
    final ThreadFactory e;
    final AtomicReference f;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        d = availableProcessors;
        aznd azndVar = new aznd(new aznf("RxComputationShutdown"));
        g = azndVar;
        azndVar.qr();
        aznf aznfVar = new aznf("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        c = aznfVar;
        azmo azmoVar = new azmo(0, aznfVar);
        b = azmoVar;
        azmoVar.a();
    }

    public azmp() {
        aznf aznfVar = c;
        this.e = aznfVar;
        azmo azmoVar = b;
        AtomicReference atomicReference = new AtomicReference(azmoVar);
        this.f = atomicReference;
        azmo azmoVar2 = new azmo(d, aznfVar);
        if (!atomicReference.compareAndSet(azmoVar, azmoVar2)) {
            azmoVar2.a();
        }
    }

    @Override // defpackage.ayor
    public final ayoq a() {
        return new azmn(((azmo) this.f.get()).c());
    }

    @Override // defpackage.aznj
    public final void b(int i, azkg azkgVar) {
        ayrd.c(i, "number > 0 required");
        ((azmo) this.f.get()).b(i, azkgVar);
    }

    @Override // defpackage.ayor
    public final aypg c(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((azmo) this.f.get()).c().g(runnable, j, timeUnit);
    }

    @Override // defpackage.ayor
    public final aypg d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((azmo) this.f.get()).c().h(runnable, j, j2, timeUnit);
    }
}
