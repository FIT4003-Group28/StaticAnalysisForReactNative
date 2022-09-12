package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dzes  reason: default package */
/* loaded from: classes6.dex */
public class dzes extends dyzy implements dzak {
    public final ScheduledExecutorService b;
    public volatile boolean c;

    public dzes(ThreadFactory threadFactory) {
        this.b = dzez.a(threadFactory);
    }

    @Override // defpackage.dzak
    public final void SQ() {
        if (!this.c) {
            this.c = true;
            this.b.shutdownNow();
        }
    }

    @Override // defpackage.dyzy
    public final dzak b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // defpackage.dyzy
    public final dzak c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.c) {
            return dzbe.INSTANCE;
        }
        return f(runnable, j, timeUnit, null);
    }

    public final dzak e(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        dzfy.c(runnable);
        dzev dzevVar = new dzev(runnable);
        try {
            if (j <= 0) {
                schedule = this.b.submit(dzevVar);
            } else {
                schedule = this.b.schedule(dzevVar, j, timeUnit);
            }
            dzevVar.b(schedule);
            return dzevVar;
        } catch (RejectedExecutionException e) {
            dzfy.a(e);
            return dzbe.INSTANCE;
        }
    }

    public final dzew f(Runnable runnable, long j, TimeUnit timeUnit, dzbc dzbcVar) {
        Future<?> schedule;
        dzfy.c(runnable);
        dzew dzewVar = new dzew(runnable, dzbcVar);
        if (dzbcVar == null || dzbcVar.b(dzewVar)) {
            try {
                if (j <= 0) {
                    schedule = this.b.submit((Callable) dzewVar);
                } else {
                    schedule = this.b.schedule((Callable) dzewVar, j, timeUnit);
                }
                dzewVar.b(schedule);
            } catch (RejectedExecutionException e) {
                if (dzbcVar != null) {
                    dzbcVar.d(dzewVar);
                }
                dzfy.a(e);
            }
            return dzewVar;
        }
        return dzewVar;
    }
}
