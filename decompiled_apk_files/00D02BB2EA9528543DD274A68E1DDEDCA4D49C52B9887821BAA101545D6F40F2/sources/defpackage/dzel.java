package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: dzel  reason: default package */
/* loaded from: classes6.dex */
public final class dzel extends dyzy implements Runnable {
    final Executor a;
    volatile boolean c;
    final AtomicInteger d = new AtomicInteger();
    final dzaj e = new dzaj();
    final dzdz<Runnable> b = new dzdz<>();

    public dzel(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        if (!this.c) {
            this.c = true;
            this.e.SQ();
            if (this.d.getAndIncrement() != 0) {
                return;
            }
            this.b.f();
        }
    }

    @Override // defpackage.dyzy
    public final dzak b(Runnable runnable) {
        if (this.c) {
            return dzbe.INSTANCE;
        }
        dzfy.c(runnable);
        dzej dzejVar = new dzej(runnable);
        this.b.g(dzejVar);
        if (this.d.getAndIncrement() == 0) {
            try {
                this.a.execute(this);
            } catch (RejectedExecutionException e) {
                this.c = true;
                this.b.f();
                dzfy.a(e);
                return dzbe.INSTANCE;
            }
        }
        return dzejVar;
    }

    @Override // defpackage.dyzy
    public final dzak c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return b(runnable);
        }
        if (this.c) {
            return dzbe.INSTANCE;
        }
        dzbg dzbgVar = new dzbg();
        dzbg dzbgVar2 = new dzbg(dzbgVar);
        dzfy.c(runnable);
        dzew dzewVar = new dzew(new dzek(this, dzbgVar2, runnable), this.e);
        this.e.b(dzewVar);
        Executor executor = this.a;
        if (executor instanceof ScheduledExecutorService) {
            try {
                dzewVar.b(((ScheduledExecutorService) executor).schedule((Callable) dzewVar, j, timeUnit));
            } catch (RejectedExecutionException e) {
                this.c = true;
                dzfy.a(e);
                return dzbe.INSTANCE;
            }
        } else {
            dzewVar.b(new dzeg(dzem.b.c(dzewVar, j, timeUnit)));
        }
        dzbd.f(dzbgVar, dzewVar);
        return dzbgVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
        r1 = r3.d.addAndGet(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r1 != 0) goto L2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r3.c == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0.f();
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
            dzdz<java.lang.Runnable> r0 = r3.b
            r1 = 1
        L3:
            boolean r2 = r3.c
            if (r2 != 0) goto L2c
        L7:
            java.lang.Object r2 = r0.SP()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 != 0) goto L21
            boolean r2 = r3.c
            if (r2 == 0) goto L17
            r0.f()
            return
        L17:
            java.util.concurrent.atomic.AtomicInteger r2 = r3.d
            int r1 = -r1
            int r1 = r2.addAndGet(r1)
            if (r1 != 0) goto L3
            return
        L21:
            r2.run()
            boolean r2 = r3.c
            if (r2 == 0) goto L7
            r0.f()
            return
        L2c:
            r0.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzel.run():void");
    }
}
