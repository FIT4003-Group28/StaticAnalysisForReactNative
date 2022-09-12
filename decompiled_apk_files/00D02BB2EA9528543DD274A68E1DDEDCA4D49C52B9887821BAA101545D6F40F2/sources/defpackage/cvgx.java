package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cvgx  reason: default package */
/* loaded from: classes.dex */
public abstract class cvgx<T> {
    public final Set<cvgw<T>> a;
    private final int b;
    private ScheduledExecutorService c;
    private ScheduledFuture<?> d;
    private final cvgv e;

    public cvgx(ScheduledExecutorService scheduledExecutorService, int i) {
        this.c = scheduledExecutorService;
        this.e = new cvgv(this);
        this.b = i;
        this.a = new HashSet();
    }

    private final synchronized void d() {
        if (this.d == null || !this.a.isEmpty()) {
            return;
        }
        this.d.cancel(true);
        this.d = null;
    }

    private final synchronized void e() {
        if (this.d != null || this.a.isEmpty()) {
            return;
        }
        this.d = this.c.scheduleAtFixedRate(this.e, 0L, this.b, TimeUnit.MILLISECONDS);
    }

    public final synchronized void a(cvgw<T> cvgwVar) {
        czhx.c(cvgwVar != null);
        this.a.add(cvgwVar);
        e();
    }

    public final synchronized void b(cvgw<T> cvgwVar) {
        czhx.c(cvgwVar != null);
        if (!this.a.remove(cvgwVar)) {
            return;
        }
        d();
    }

    public abstract T c();

    public cvgx(@dzsi ThreadFactory threadFactory, int i) {
        this(Executors.newSingleThreadScheduledExecutor(threadFactory), i);
    }
}
