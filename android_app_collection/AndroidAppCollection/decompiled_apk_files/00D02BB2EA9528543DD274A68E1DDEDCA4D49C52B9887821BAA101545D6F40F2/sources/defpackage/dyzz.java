package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dyzz  reason: default package */
/* loaded from: classes6.dex */
public abstract class dyzz {
    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    public abstract dyzy a();

    public dzak b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public dzak c(Runnable runnable, long j, TimeUnit timeUnit) {
        dyzy a = a();
        dzfy.c(runnable);
        dyzx dyzxVar = new dyzx(runnable, a);
        a.c(dyzxVar, j, timeUnit);
        return dyzxVar;
    }
}
