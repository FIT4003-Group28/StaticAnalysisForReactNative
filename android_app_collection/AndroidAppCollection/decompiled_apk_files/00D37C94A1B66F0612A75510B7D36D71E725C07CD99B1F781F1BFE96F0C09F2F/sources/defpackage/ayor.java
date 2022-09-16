package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ayor  reason: default package */
/* loaded from: classes2.dex */
public abstract class ayor {
    static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public static final long e(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public abstract ayoq a();

    public aypg c(Runnable runnable, long j, TimeUnit timeUnit) {
        ayoq a2 = a();
        azqc.o(runnable);
        ayon ayonVar = new ayon(runnable, a2);
        a2.c(ayonVar, j, timeUnit);
        return ayonVar;
    }

    public aypg d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ayoq a2 = a();
        azqc.o(runnable);
        ayoo ayooVar = new ayoo(runnable, a2);
        aypg d = a2.d(ayooVar, j, j2, timeUnit);
        return d == ayqj.INSTANCE ? d : ayooVar;
    }

    public aypg f(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }
}
