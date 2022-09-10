package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dzfa  reason: default package */
/* loaded from: classes6.dex */
final class dzfa extends dyzy {
    final ScheduledExecutorService a;
    final dzaj b = new dzaj();
    volatile boolean c;

    public dzfa(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        if (!this.c) {
            this.c = true;
            this.b.SQ();
        }
    }

    @Override // defpackage.dyzy
    public final dzak c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        if (this.c) {
            return dzbe.INSTANCE;
        }
        dzfy.c(runnable);
        dzew dzewVar = new dzew(runnable, this.b);
        this.b.b(dzewVar);
        try {
            if (j <= 0) {
                schedule = this.a.submit((Callable) dzewVar);
            } else {
                schedule = this.a.schedule((Callable) dzewVar, j, timeUnit);
            }
            dzewVar.b(schedule);
            return dzewVar;
        } catch (RejectedExecutionException e) {
            SQ();
            dzfy.a(e);
            return dzbe.INSTANCE;
        }
    }
}
