package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aznb  reason: default package */
/* loaded from: classes2.dex */
public final class aznb extends ayor {
    static final aznf b;
    static final aznf c;
    static final azna d;
    static final azmy e;
    final ThreadFactory f;
    final AtomicReference g;
    private static final TimeUnit i = TimeUnit.SECONDS;
    private static final long h = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        azna aznaVar = new azna(new aznf("RxCachedThreadSchedulerShutdown"));
        d = aznaVar;
        aznaVar.qr();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        aznf aznfVar = new aznf("RxCachedThreadScheduler", max);
        b = aznfVar;
        c = new aznf("RxCachedWorkerPoolEvictor", max);
        azmy azmyVar = new azmy(0L, null, aznfVar);
        e = azmyVar;
        azmyVar.a();
    }

    public aznb() {
        aznf aznfVar = b;
        this.f = aznfVar;
        azmy azmyVar = e;
        AtomicReference atomicReference = new AtomicReference(azmyVar);
        this.g = atomicReference;
        azmy azmyVar2 = new azmy(h, i, aznfVar);
        if (!atomicReference.compareAndSet(azmyVar, azmyVar2)) {
            azmyVar2.a();
        }
    }

    @Override // defpackage.ayor
    public final ayoq a() {
        return new azmz((azmy) this.g.get());
    }
}
