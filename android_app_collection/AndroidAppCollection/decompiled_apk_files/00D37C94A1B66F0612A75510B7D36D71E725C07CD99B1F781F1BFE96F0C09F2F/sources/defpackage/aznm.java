package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aznm  reason: default package */
/* loaded from: classes2.dex */
final class aznm extends ayoq {
    final ScheduledExecutorService a;
    final aypf b = new aypf();
    volatile boolean c;

    public aznm(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.ayoq
    public final aypg c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future schedule;
        if (this.c) {
            return ayqj.INSTANCE;
        }
        azqc.o(runnable);
        azni azniVar = new azni(runnable, this.b);
        this.b.d(azniVar);
        try {
            if (j <= 0) {
                schedule = this.a.submit((Callable) azniVar);
            } else {
                schedule = this.a.schedule((Callable) azniVar, j, timeUnit);
            }
            azniVar.a(schedule);
            return azniVar;
        } catch (RejectedExecutionException e) {
            qr();
            azqc.d(e);
            return ayqj.INSTANCE;
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (!this.c) {
            this.c = true;
            this.b.qr();
        }
    }
}
