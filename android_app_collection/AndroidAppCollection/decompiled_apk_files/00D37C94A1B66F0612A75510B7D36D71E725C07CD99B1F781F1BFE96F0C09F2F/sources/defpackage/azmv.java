package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: azmv  reason: default package */
/* loaded from: classes2.dex */
public final class azmv extends ayoq implements Runnable {
    final Executor a;
    volatile boolean c;
    final AtomicInteger d = new AtomicInteger();
    final aypf e = new aypf();
    final azmj b = new azmj();

    public azmv(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.ayoq
    public final aypg a(Runnable runnable) {
        if (this.c) {
            return ayqj.INSTANCE;
        }
        azqc.o(runnable);
        azmt azmtVar = new azmt(runnable);
        this.b.k(azmtVar);
        if (this.d.getAndIncrement() == 0) {
            try {
                this.a.execute(this);
            } catch (RejectedExecutionException e) {
                this.c = true;
                this.b.d();
                azqc.d(e);
                return ayqj.INSTANCE;
            }
        }
        return azmtVar;
    }

    @Override // defpackage.ayoq
    public final aypg c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return a(runnable);
        }
        if (this.c) {
            return ayqj.INSTANCE;
        }
        ayqm ayqmVar = new ayqm();
        ayqm ayqmVar2 = new ayqm(ayqmVar);
        azqc.o(runnable);
        azni azniVar = new azni(new azmu(this, ayqmVar2, runnable), this.e);
        this.e.d(azniVar);
        Executor executor = this.a;
        if (executor instanceof ScheduledExecutorService) {
            try {
                azniVar.a(((ScheduledExecutorService) executor).schedule((Callable) azniVar, j, timeUnit));
            } catch (RejectedExecutionException e) {
                this.c = true;
                azqc.d(e);
                return ayqj.INSTANCE;
            }
        } else {
            azniVar.a(new azmq(azmw.b.c(azniVar, j, timeUnit)));
        }
        ayqi.i(ayqmVar, azniVar);
        return ayqmVar2;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (!this.c) {
            this.c = true;
            this.e.qr();
            if (this.d.getAndIncrement() != 0) {
                return;
            }
            this.b.d();
        }
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
        r0.d();
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
            azmj r0 = r3.b
            r1 = 1
        L3:
            boolean r2 = r3.c
            if (r2 != 0) goto L2c
        L7:
            java.lang.Object r2 = r0.sl()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 != 0) goto L21
            boolean r2 = r3.c
            if (r2 == 0) goto L17
            r0.d()
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
            r0.d()
            return
        L2c:
            r0.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azmv.run():void");
    }
}
