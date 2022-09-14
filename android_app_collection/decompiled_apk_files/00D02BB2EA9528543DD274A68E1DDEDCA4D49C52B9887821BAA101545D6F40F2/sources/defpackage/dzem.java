package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dzem  reason: default package */
/* loaded from: classes6.dex */
public final class dzem extends dyzz {
    static final dyzz b;
    final Executor a;

    static {
        dyzz dyzzVar = dzgh.a;
        dzba<? super dyzz, ? extends dyzz> dzbaVar = dzfy.h;
        b = dyzzVar;
    }

    public dzem(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.dyzz
    public final dyzy a() {
        return new dzel(this.a);
    }

    @Override // defpackage.dyzz
    public final dzak b(Runnable runnable) {
        dzfy.c(runnable);
        try {
            if (this.a instanceof ExecutorService) {
                dzev dzevVar = new dzev(runnable);
                dzevVar.b(((ExecutorService) this.a).submit(dzevVar));
                return dzevVar;
            }
            dzej dzejVar = new dzej(runnable);
            this.a.execute(dzejVar);
            return dzejVar;
        } catch (RejectedExecutionException e) {
            dzfy.a(e);
            return dzbe.INSTANCE;
        }
    }

    @Override // defpackage.dyzz
    public final dzak c(Runnable runnable, long j, TimeUnit timeUnit) {
        dzfy.c(runnable);
        if (this.a instanceof ScheduledExecutorService) {
            try {
                dzev dzevVar = new dzev(runnable);
                dzevVar.b(((ScheduledExecutorService) this.a).schedule(dzevVar, j, timeUnit));
                return dzevVar;
            } catch (RejectedExecutionException e) {
                dzfy.a(e);
                return dzbe.INSTANCE;
            }
        }
        dzei dzeiVar = new dzei(runnable);
        dzbd.f(dzeiVar.a, b.c(new dzeh(this, dzeiVar), j, timeUnit));
        return dzeiVar;
    }
}
