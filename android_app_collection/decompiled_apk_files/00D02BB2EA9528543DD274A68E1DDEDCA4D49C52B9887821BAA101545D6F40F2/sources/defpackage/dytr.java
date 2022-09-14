package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dytr  reason: default package */
/* loaded from: classes6.dex */
final class dytr {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public long d;
    public boolean e;
    public ScheduledFuture<?> f;
    private final dbtp g;

    public dytr(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, dbtp dbtpVar) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = dbtpVar;
        dbtpVar.f();
    }

    public final long a() {
        return this.g.d(TimeUnit.NANOSECONDS);
    }
}
