package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ayks  reason: default package */
/* loaded from: classes2.dex */
final class ayks {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public long d;
    public boolean e;
    public ScheduledFuture f;
    private final amqi g;

    public ayks(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, amqi amqiVar) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = amqiVar;
        amqiVar.f();
    }

    public final long a() {
        return this.g.a(TimeUnit.NANOSECONDS);
    }
}
