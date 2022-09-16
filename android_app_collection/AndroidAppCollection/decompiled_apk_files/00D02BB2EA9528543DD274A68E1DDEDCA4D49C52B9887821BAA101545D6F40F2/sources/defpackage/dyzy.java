package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dyzy  reason: default package */
/* loaded from: classes6.dex */
public abstract class dyzy implements dzak {
    public static final long d(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public dzak b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public abstract dzak c(Runnable runnable, long j, TimeUnit timeUnit);
}
