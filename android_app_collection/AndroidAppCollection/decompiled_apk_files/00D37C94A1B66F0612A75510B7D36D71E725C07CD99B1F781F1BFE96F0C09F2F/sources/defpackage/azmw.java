package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azmw  reason: default package */
/* loaded from: classes2.dex */
public final class azmw extends ayor {
    static final ayor b;
    final Executor c;

    static {
        ayor ayorVar = azpj.a;
        ayqe ayqeVar = azqc.h;
        b = ayorVar;
    }

    public azmw(Executor executor) {
        this.c = executor;
    }

    @Override // defpackage.ayor
    public final ayoq a() {
        return new azmv(this.c);
    }

    @Override // defpackage.ayor
    public final aypg c(Runnable runnable, long j, TimeUnit timeUnit) {
        azqc.o(runnable);
        if (this.c instanceof ScheduledExecutorService) {
            try {
                aznh aznhVar = new aznh(runnable);
                aznhVar.a(((ScheduledExecutorService) this.c).schedule(aznhVar, j, timeUnit));
                return aznhVar;
            } catch (RejectedExecutionException e) {
                azqc.d(e);
                return ayqj.INSTANCE;
            }
        }
        azms azmsVar = new azms(runnable);
        ayqi.i(azmsVar.a, b.c(new azmr(this, azmsVar), j, timeUnit));
        return azmsVar;
    }

    @Override // defpackage.ayor
    public final aypg d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (this.c instanceof ScheduledExecutorService) {
            azqc.o(runnable);
            try {
                azng azngVar = new azng(runnable);
                azngVar.a(((ScheduledExecutorService) this.c).scheduleAtFixedRate(azngVar, j, j2, timeUnit));
                return azngVar;
            } catch (RejectedExecutionException e) {
                azqc.d(e);
                return ayqj.INSTANCE;
            }
        }
        return super.d(runnable, j, j2, timeUnit);
    }

    @Override // defpackage.ayor
    public final aypg f(Runnable runnable) {
        azqc.o(runnable);
        try {
            if (!(this.c instanceof ExecutorService)) {
                azmt azmtVar = new azmt(runnable);
                this.c.execute(azmtVar);
                return azmtVar;
            }
            aznh aznhVar = new aznh(runnable);
            aznhVar.a(((ExecutorService) this.c).submit(aznhVar));
            return aznhVar;
        } catch (RejectedExecutionException e) {
            azqc.d(e);
            return ayqj.INSTANCE;
        }
    }
}
