package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dynv  reason: default package */
/* loaded from: classes6.dex */
public class dynv implements dyls {
    private volatile boolean a;
    private dylu b;
    private dyjb c;
    public dyls d;
    private List<Runnable> e = new ArrayList();
    private dynu f;
    private long g;
    private long h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void p() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List<java.lang.Runnable> r1 = r6.e     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4f
            r0 = 0
            r6.e = r0     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            r6.a = r1     // Catch: java.lang.Throwable -> L6d
            dynu r2 = r6.f     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List<java.lang.Runnable> r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L2d
            r2.c = r0     // Catch: java.lang.Throwable -> L4b
            r2.b = r1     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            return
        L2d:
            java.util.List<java.lang.Runnable> r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            r2.c = r3     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r3 = r4.iterator()
        L36:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L36
        L46:
            r4.clear()
            r3 = r4
            goto L1e
        L4b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r0
        L4e:
            return
        L4f:
            java.util.List<java.lang.Runnable> r1 = r6.e     // Catch: java.lang.Throwable -> L6d
            r6.e = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L58
        L68:
            r1.clear()
            r0 = r1
            goto L5
        L6d:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            goto L71
        L70:
            throw r0
        L71:
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dynv.p():void");
    }

    private final void q(Runnable runnable) {
        synchronized (this) {
            if (!this.a) {
                this.e.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    private final void r(dyls dylsVar) {
        dyls dylsVar2 = this.d;
        dbsk.p(dylsVar2 == null, "realStream already set to %s", dylsVar2);
        this.d = dylsVar;
        this.h = System.nanoTime();
    }

    @Override // defpackage.dyls
    public final void a(dylu dyluVar) {
        dyjb dyjbVar;
        boolean z;
        dbsk.m(this.b == null, "already started");
        synchronized (this) {
            this.b = dyluVar;
            dyjbVar = this.c;
            z = this.a;
            if (!z) {
                dynu dynuVar = new dynu(dyluVar);
                this.f = dynuVar;
                dyluVar = dynuVar;
            }
            this.g = System.nanoTime();
        }
        if (dyjbVar != null) {
            dyluVar.d(dyjbVar, new dyhw());
        } else if (z) {
            this.d.a(dyluVar);
        } else {
            q(new dynk(this, dyluVar));
        }
    }

    @Override // defpackage.dyvj
    public final void b(int i) {
        if (this.a) {
            this.d.b(i);
        } else {
            q(new dynd(this, i));
        }
    }

    @Override // defpackage.dyvj
    public final void c(InputStream inputStream) {
        dbsk.t(inputStream, "message");
        if (this.a) {
            this.d.c(inputStream);
        } else {
            q(new dynl(this, inputStream));
        }
    }

    @Override // defpackage.dyls
    public final void d() {
        q(new dyno(this));
    }

    @Override // defpackage.dyls
    public void e(dyjb dyjbVar) {
        boolean z;
        dylu dyluVar;
        dbsk.t(dyjbVar, "reason");
        synchronized (this) {
            if (this.d == null) {
                r(dysw.a);
                dyluVar = this.b;
                this.c = dyjbVar;
                z = false;
            } else {
                z = true;
                dyluVar = null;
            }
        }
        if (z) {
            q(new dynn(this, dyjbVar));
            return;
        }
        if (dyluVar != null) {
            dyluVar.d(dyjbVar, new dyhw());
        }
        p();
    }

    @Override // defpackage.dyls
    public final dyel f() {
        throw null;
    }

    @Override // defpackage.dyvj
    public final void g() {
        if (this.a) {
            this.d.g();
        } else {
            q(new dynm(this));
        }
    }

    @Override // defpackage.dyvj
    public final void h(dyfi dyfiVar) {
        q(new dynf(this, dyfiVar));
    }

    @Override // defpackage.dyls
    public final void i(dyfr dyfrVar) {
        q(new dynj(this, dyfrVar));
    }

    @Override // defpackage.dyls
    public final void j(int i) {
        if (this.a) {
            this.d.j(i);
        } else {
            q(new dynh(this, i));
        }
    }

    @Override // defpackage.dyls
    public final void k(int i) {
        if (this.a) {
            this.d.k(i);
        } else {
            q(new dyni(this, i));
        }
    }

    @Override // defpackage.dyls
    public final void l(dypf dypfVar) {
        synchronized (this) {
            if (this.b == null) {
                return;
            }
            if (this.d != null) {
                dypfVar.b("buffered_nanos", Long.valueOf(this.h - this.g));
                this.d.l(dypfVar);
            } else {
                dypfVar.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.g));
                dypfVar.a("waiting_for_connection");
            }
        }
    }

    @Override // defpackage.dyls
    public final void m(dyfu dyfuVar) {
        dbsk.t(dyfuVar, "decompressorRegistry");
        q(new dyng(this, dyfuVar));
    }

    @Override // defpackage.dyvj
    public final void n() {
        q(new dyne(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(dyls dylsVar) {
        synchronized (this) {
            if (this.d != null) {
                return;
            }
            dbsk.t(dylsVar, "stream");
            r(dylsVar);
            p();
        }
    }
}
