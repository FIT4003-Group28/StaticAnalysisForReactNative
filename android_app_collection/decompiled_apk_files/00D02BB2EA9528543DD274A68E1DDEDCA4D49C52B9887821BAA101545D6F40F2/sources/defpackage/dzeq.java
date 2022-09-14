package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzeq  reason: default package */
/* loaded from: classes6.dex */
public final class dzeq extends dyzz {
    static final dzeu a;
    static final dzeu b;
    static final dzep c;
    static final dzen f;
    private static final TimeUnit g = TimeUnit.SECONDS;
    final ThreadFactory d;
    final AtomicReference<dzen> e;

    static {
        dzep dzepVar = new dzep(new dzeu("RxCachedThreadSchedulerShutdown"));
        c = dzepVar;
        dzepVar.SQ();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        dzeu dzeuVar = new dzeu("RxCachedThreadScheduler", max);
        a = dzeuVar;
        b = new dzeu("RxCachedWorkerPoolEvictor", max);
        dzen dzenVar = new dzen(0L, null, dzeuVar);
        f = dzenVar;
        dzenVar.a();
    }

    public dzeq() {
        dzeu dzeuVar = a;
        this.d = dzeuVar;
        dzen dzenVar = f;
        AtomicReference<dzen> atomicReference = new AtomicReference<>(dzenVar);
        this.e = atomicReference;
        dzen dzenVar2 = new dzen(60L, g, dzeuVar);
        if (!atomicReference.compareAndSet(dzenVar, dzenVar2)) {
            dzenVar2.a();
        }
    }

    @Override // defpackage.dyzz
    public final dyzy a() {
        return new dzeo(this.e.get());
    }
}
