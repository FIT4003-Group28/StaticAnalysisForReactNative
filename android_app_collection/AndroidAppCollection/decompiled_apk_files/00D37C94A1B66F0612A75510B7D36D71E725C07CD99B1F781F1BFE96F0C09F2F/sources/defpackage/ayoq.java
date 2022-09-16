package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ayoq  reason: default package */
/* loaded from: classes2.dex */
public abstract class ayoq implements aypg {
    public static final long f(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public aypg a(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public abstract aypg c(Runnable runnable, long j, TimeUnit timeUnit);

    public final aypg d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ayqm ayqmVar = new ayqm();
        ayqm ayqmVar2 = new ayqm(ayqmVar);
        azqc.o(runnable);
        long nanos = timeUnit.toNanos(j2);
        long f = f(TimeUnit.NANOSECONDS);
        aypg c = c(new ayop(this, f + timeUnit.toNanos(j), runnable, f, ayqmVar2, nanos), j, timeUnit);
        if (c == ayqj.INSTANCE) {
            return c;
        }
        ayqi.i(ayqmVar, c);
        return ayqmVar2;
    }
}
