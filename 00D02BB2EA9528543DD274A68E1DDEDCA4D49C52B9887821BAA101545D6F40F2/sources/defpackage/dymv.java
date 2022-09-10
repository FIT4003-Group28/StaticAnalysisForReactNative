package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dymv  reason: default package */
/* loaded from: classes6.dex */
public class dymv<ReqT, RespT> extends dyex<ReqT, RespT> {
    private static final Logger c = Logger.getLogger(dymv.class.getName());
    private static final dyex<Object, Object> k = new dymo();
    public final dyfo a;
    public dyex<ReqT, RespT> b;
    @dzsi
    private final ScheduledFuture<?> d;
    private final Executor e;
    private volatile boolean f;
    private dyew<RespT> g;
    private dyjb h;
    private List<Runnable> i = new ArrayList();
    private dymu<RespT> j;

    public dymv(Executor executor, ScheduledExecutorService scheduledExecutorService, @dzsi dyfr dyfrVar) {
        ScheduledFuture<?> schedule;
        dbsk.t(executor, "callExecutor");
        this.e = executor;
        dbsk.t(scheduledExecutorService, "scheduler");
        dyfo a = dyfo.a();
        this.a = a;
        dyfr f = a.f();
        if (dyfrVar == null && f == null) {
            schedule = null;
        } else {
            long min = dyfrVar != null ? Math.min(Long.MAX_VALUE, dyfrVar.c(TimeUnit.NANOSECONDS)) : Long.MAX_VALUE;
            if (f != null && f.c(TimeUnit.NANOSECONDS) < min) {
                min = f.c(TimeUnit.NANOSECONDS);
                Logger logger = c;
                if (logger.isLoggable(Level.FINE)) {
                    StringBuilder sb = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(min)));
                    if (dyfrVar == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(" Explicit call timeout was '%d' ns.", Long.valueOf(dyfrVar.c(TimeUnit.NANOSECONDS))));
                    }
                    logger.logp(Level.FINE, "io.grpc.internal.DelayedClientCall", "scheduleDeadlineIfNeeded", sb.toString());
                }
            }
            long abs = Math.abs(min) / TimeUnit.SECONDS.toNanos(1L);
            long abs2 = Math.abs(min) % TimeUnit.SECONDS.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            if (min < 0) {
                sb2.append("ClientCall started after deadline exceeded. Deadline exceeded after -");
            } else {
                sb2.append("Deadline exceeded after ");
            }
            sb2.append(abs);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb2.append("s. ");
            schedule = scheduledExecutorService.schedule(new dymi(this, sb2), min, TimeUnit.NANOSECONDS);
        }
        this.d = schedule;
    }

    private final void j(Runnable runnable) {
        synchronized (this) {
            if (!this.f) {
                this.i.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.dyex
    public final void a(dyew<RespT> dyewVar, dyhw dyhwVar) {
        dyjb dyjbVar;
        boolean z;
        dbsk.m(this.g == null, "already started");
        synchronized (this) {
            dbsk.t(dyewVar, "listener");
            this.g = dyewVar;
            dyjbVar = this.h;
            z = this.f;
            if (!z) {
                dymu<RespT> dymuVar = new dymu<>(dyewVar);
                this.j = dymuVar;
                dyewVar = dymuVar;
            }
        }
        if (dyjbVar != null) {
            this.e.execute(new dymp(this, dyewVar, dyjbVar));
        } else if (z) {
            this.b.a(dyewVar, dyhwVar);
        } else {
            j(new dymh(this, dyewVar, dyhwVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(dyjb dyjbVar, boolean z) {
        boolean z2;
        dyew<RespT> dyewVar;
        synchronized (this) {
            if (this.b == null) {
                i(k);
                dyewVar = this.g;
                this.h = dyjbVar;
                z2 = false;
            } else if (z) {
                return;
            } else {
                z2 = true;
                dyewVar = null;
            }
            if (z2) {
                j(new dymk(this, dyjbVar));
            } else {
                if (dyewVar != null) {
                    this.e.execute(new dymp(this, dyewVar, dyjbVar));
                }
                h();
            }
            g();
        }
    }

    @Override // defpackage.dyex
    public final void c(int i) {
        if (this.f) {
            this.b.c(i);
        } else {
            j(new dymm(this, i));
        }
    }

    @Override // defpackage.dyex
    public final void d(@dzsi String str, @dzsi Throwable th) {
        dyjb g;
        dyjb dyjbVar = dyjb.c;
        if (str != null) {
            g = dyjbVar.g(str);
        } else {
            g = dyjbVar.g("Call cancelled without message");
        }
        if (th != null) {
            g = g.f(th);
        }
        b(g, false);
    }

    @Override // defpackage.dyex
    public final void e() {
        j(new dymn(this));
    }

    @Override // defpackage.dyex
    public final void f(ReqT reqt) {
        if (this.f) {
            this.b.f(reqt);
        } else {
            j(new dyml(this, reqt));
        }
    }

    protected void g() {
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
    /* JADX WARN: Multi-variable type inference failed */
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
            java.util.List<java.lang.Runnable> r1 = r3.i     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.i = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.f = r0     // Catch: java.lang.Throwable -> L42
            dymu<RespT> r0 = r3.j     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.e
            dymj r2 = new dymj
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List<java.lang.Runnable> r1 = r3.i     // Catch: java.lang.Throwable -> L42
            r3.i = r0     // Catch: java.lang.Throwable -> L42
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dymv.h():void");
    }

    public final void i(dyex<ReqT, RespT> dyexVar) {
        dyex<ReqT, RespT> dyexVar2 = this.b;
        dbsk.p(dyexVar2 == null, "realCall already set to %s", dyexVar2);
        ScheduledFuture<?> scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.b = dyexVar;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("realCall", this.b);
        return b.toString();
    }
}
