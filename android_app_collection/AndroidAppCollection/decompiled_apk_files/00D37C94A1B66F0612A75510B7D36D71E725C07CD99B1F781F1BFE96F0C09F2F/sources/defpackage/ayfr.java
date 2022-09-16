package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: ayfr  reason: default package */
/* loaded from: classes2.dex */
public class ayfr extends axyg {
    private static final axyg c;
    public final axyx a;
    public axyg b;
    private final ScheduledFuture d;
    private final Executor e;
    private volatile boolean f;
    private Status g;
    private List h = new ArrayList();
    private ayfq i;
    private axzl j;

    static {
        Logger.getLogger(ayfr.class.getName());
        c = new ayfk();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ayfr(Executor executor, ScheduledExecutorService scheduledExecutorService, axyy axyyVar) {
        ScheduledFuture<?> schedule;
        executor.getClass();
        this.e = executor;
        scheduledExecutorService.getClass();
        this.a = axyx.b();
        if (axyyVar == null) {
            schedule = null;
        } else {
            long min = Math.min(Long.MAX_VALUE, axyyVar.b(TimeUnit.NANOSECONDS));
            long abs = Math.abs(min) / TimeUnit.SECONDS.toNanos(1L);
            long abs2 = Math.abs(min) % TimeUnit.SECONDS.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            if (min < 0) {
                sb.append("ClientCall started after deadline exceeded. Deadline exceeded after -");
            } else {
                sb.append("Deadline exceeded after ");
            }
            sb.append(abs);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb.append("s. ");
            schedule = scheduledExecutorService.schedule(new ayfe(this, sb), min, TimeUnit.NANOSECONDS);
        }
        this.d = schedule;
    }

    private final void j(Runnable runnable) {
        synchronized (this) {
            if (!this.f) {
                this.h.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.axyg
    public final void b(String str, Throwable th) {
        Status withDescription;
        Status status = Status.c;
        if (str != null) {
            withDescription = status.withDescription(str);
        } else {
            withDescription = status.withDescription("Call cancelled without message");
        }
        if (th != null) {
            withDescription = withDescription.c(th);
        }
        g(withDescription, false);
    }

    @Override // defpackage.axyg
    public final void c() {
        j(new ayfj(this));
    }

    @Override // defpackage.axyg
    public final void d(int i) {
        if (this.f) {
            this.b.d(i);
        } else {
            j(new ayfi(this, i));
        }
    }

    @Override // defpackage.axyg
    public final void e(Object obj) {
        if (this.f) {
            this.b.e(obj);
        } else {
            j(new ayfh(this, obj));
        }
    }

    protected void f() {
    }

    public final void g(Status status, boolean z) {
        boolean z2;
        axzl axzlVar;
        synchronized (this) {
            if (this.b == null) {
                i(c);
                axzlVar = this.j;
                this.g = status;
                z2 = false;
            } else if (z) {
                return;
            } else {
                z2 = true;
                axzlVar = null;
            }
            if (z2) {
                j(new ayfg(this, status));
            } else {
                if (axzlVar != null) {
                    this.e.execute(new ayfl(this, axzlVar, status, null));
                }
                h();
            }
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.h     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.h = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.f = r0     // Catch: java.lang.Throwable -> L42
            ayfq r0 = r3.i     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.e
            ayff r2 = new ayff
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List r1 = r3.h     // Catch: java.lang.Throwable -> L42
            r3.h = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            goto L46
        L45:
            throw r0
        L46:
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayfr.h():void");
    }

    public final void i(axyg axygVar) {
        axyg axygVar2 = this.b;
        aqxo.B(axygVar2 == null, "realCall already set to %s", axygVar2);
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.b = axygVar;
    }

    @Override // defpackage.axyg
    public final void k(axzl axzlVar, ayat ayatVar) {
        Status status;
        boolean z;
        aqxo.z(this.j == null, "already started");
        synchronized (this) {
            this.j = axzlVar;
            status = this.g;
            z = this.f;
            if (!z) {
                ayfq ayfqVar = new ayfq(axzlVar, null);
                this.i = ayfqVar;
                axzlVar = ayfqVar;
            }
        }
        if (status != null) {
            this.e.execute(new ayfl(this, axzlVar, status, null));
        } else if (z) {
            this.b.k(axzlVar, ayatVar);
        } else {
            j(new ayfd(this, axzlVar, ayatVar, null));
        }
    }

    public final String toString() {
        ampp c2 = akzj.c(this);
        c2.b("realCall", this.b);
        return c2.toString();
    }
}
