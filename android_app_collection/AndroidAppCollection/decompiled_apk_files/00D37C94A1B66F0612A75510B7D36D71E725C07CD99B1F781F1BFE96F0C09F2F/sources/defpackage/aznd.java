package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aznd  reason: default package */
/* loaded from: classes2.dex */
public class aznd extends ayoq implements aypg {
    public final ScheduledExecutorService b;
    public volatile boolean c;

    public aznd(ThreadFactory threadFactory) {
        this.b = aznl.a(threadFactory);
    }

    @Override // defpackage.ayoq
    public final aypg a(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // defpackage.ayoq
    public final aypg c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.c) {
            return ayqj.INSTANCE;
        }
        return i(runnable, j, timeUnit, null);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c;
    }

    public final aypg g(Runnable runnable, long j, TimeUnit timeUnit) {
        Future schedule;
        azqc.o(runnable);
        aznh aznhVar = new aznh(runnable);
        try {
            if (j <= 0) {
                schedule = this.b.submit(aznhVar);
            } else {
                schedule = this.b.schedule(aznhVar, j, timeUnit);
            }
            aznhVar.a(schedule);
            return aznhVar;
        } catch (RejectedExecutionException e) {
            azqc.d(e);
            return ayqj.INSTANCE;
        }
    }

    public final aypg h(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future schedule;
        azqc.o(runnable);
        if (j2 <= 0) {
            azmx azmxVar = new azmx(runnable, this.b);
            try {
                if (j <= 0) {
                    schedule = this.b.submit(azmxVar);
                } else {
                    schedule = this.b.schedule(azmxVar, j, timeUnit);
                }
                azmxVar.a(schedule);
                return azmxVar;
            } catch (RejectedExecutionException e) {
                azqc.d(e);
                return ayqj.INSTANCE;
            }
        }
        azng azngVar = new azng(runnable);
        try {
            azngVar.a(this.b.scheduleAtFixedRate(azngVar, j, j2, timeUnit));
            return azngVar;
        } catch (RejectedExecutionException e2) {
            azqc.d(e2);
            return ayqj.INSTANCE;
        }
    }

    public final azni i(Runnable runnable, long j, TimeUnit timeUnit, ayqh ayqhVar) {
        Future schedule;
        azqc.o(runnable);
        azni azniVar = new azni(runnable, ayqhVar);
        if (ayqhVar == null || ayqhVar.d(azniVar)) {
            try {
                if (j <= 0) {
                    schedule = this.b.submit((Callable) azniVar);
                } else {
                    schedule = this.b.schedule((Callable) azniVar, j, timeUnit);
                }
                azniVar.a(schedule);
            } catch (RejectedExecutionException e) {
                if (ayqhVar != null) {
                    ayqhVar.i(azniVar);
                }
                azqc.d(e);
            }
            return azniVar;
        }
        return azniVar;
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (!this.c) {
            this.c = true;
            this.b.shutdownNow();
        }
    }
}
