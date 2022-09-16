package defpackage;

import io.grpc.Status;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aygi  reason: default package */
/* loaded from: classes2.dex */
public class aygi implements ayeo {
    private volatile boolean a;
    private ayeq b;
    private Status c;
    public ayeo e;
    private aygh f;
    private long g;
    private long h;
    private List d = new ArrayList();
    private List i = new ArrayList();

    private final void s(Runnable runnable) {
        aqxo.z(this.b != null, "May only be called after start");
        synchronized (this) {
            if (!this.a) {
                this.d.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    private final void t(ayeq ayeqVar) {
        for (Runnable runnable : this.i) {
            runnable.run();
        }
        this.i = null;
        this.e.m(ayeqVar);
    }

    private final void u(ayeo ayeoVar) {
        ayeo ayeoVar2 = this.e;
        aqxo.B(ayeoVar2 == null, "realStream already set to %s", ayeoVar2);
        this.e = ayeoVar;
        this.h = System.nanoTime();
    }

    @Override // defpackage.ayeo
    public final axyb a() {
        throw null;
    }

    @Override // defpackage.ayeo
    public void b(ayhk ayhkVar) {
        synchronized (this) {
            if (this.b == null) {
                return;
            }
            if (this.e != null) {
                ayhkVar.b("buffered_nanos", Long.valueOf(this.h - this.g));
                this.e.b(ayhkVar);
            } else {
                ayhkVar.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.g));
                ayhkVar.a("waiting_for_connection");
            }
        }
    }

    @Override // defpackage.ayeo
    public void c(Status status) {
        boolean z = true;
        aqxo.z(this.b != null, "May only be called after start");
        status.getClass();
        synchronized (this) {
            if (this.e == null) {
                u(aykc.a);
                this.c = status;
                z = false;
            }
        }
        if (z) {
            s(new aygc(this, status));
            return;
        }
        r();
        p(status);
        this.b.a(status, ayep.PROCESSED, new ayat());
    }

    @Override // defpackage.ayml
    public final void d() {
        aqxo.z(this.b != null, "May only be called after start");
        if (this.a) {
            this.e.d();
        } else {
            s(new ayga(this, 2));
        }
    }

    @Override // defpackage.ayeo
    public final void e() {
        aqxo.z(this.b != null, "May only be called after start");
        s(new ayga(this, 3));
    }

    @Override // defpackage.ayml
    public final void f() {
        aqxo.z(this.b == null, "May only be called before start");
        this.i.add(new ayga(this, 1));
    }

    @Override // defpackage.ayml
    public final void g(int i) {
        aqxo.z(this.b != null, "May only be called after start");
        if (this.a) {
            this.e.g(i);
        } else {
            s(new ayfy(this, i, 1));
        }
    }

    @Override // defpackage.ayml
    public final void h(axyr axyrVar) {
        aqxo.z(this.b == null, "May only be called before start");
        this.i.add(new ayfw(this, axyrVar));
    }

    @Override // defpackage.ayeo
    public final void i(axyy axyyVar) {
        aqxo.z(this.b == null, "May only be called before start");
        this.i.add(new ayfz(this, axyyVar));
    }

    @Override // defpackage.ayeo
    public final void j(axzb axzbVar) {
        aqxo.z(this.b == null, "May only be called before start");
        axzbVar.getClass();
        this.i.add(new ayfx(this, axzbVar));
    }

    @Override // defpackage.ayeo
    public final void k(int i) {
        aqxo.z(this.b == null, "May only be called before start");
        this.i.add(new ayfy(this, i));
    }

    @Override // defpackage.ayeo
    public final void l(int i) {
        aqxo.z(this.b == null, "May only be called before start");
        this.i.add(new ayfy(this, i, 2));
    }

    @Override // defpackage.ayeo
    public final void m(ayeq ayeqVar) {
        Status status;
        boolean z;
        aqxo.z(this.b == null, "already started");
        synchronized (this) {
            status = this.c;
            z = this.a;
            if (!z) {
                aygh ayghVar = new aygh(ayeqVar);
                this.f = ayghVar;
                ayeqVar = ayghVar;
            }
            this.b = ayeqVar;
            this.g = System.nanoTime();
        }
        if (status != null) {
            ayeqVar.a(status, ayep.PROCESSED, new ayat());
        } else if (!z) {
        } else {
            t(ayeqVar);
        }
    }

    @Override // defpackage.ayml
    public final void n(InputStream inputStream) {
        aqxo.z(this.b != null, "May only be called after start");
        if (this.a) {
            this.e.n(inputStream);
        } else {
            s(new aygb(this, inputStream));
        }
    }

    @Override // defpackage.ayml
    public final boolean o() {
        if (this.a) {
            return this.e.o();
        }
        return false;
    }

    protected void p(Status status) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Runnable q(ayeo ayeoVar) {
        synchronized (this) {
            if (this.e != null) {
                return null;
            }
            ayeoVar.getClass();
            u(ayeoVar);
            ayeq ayeqVar = this.b;
            if (ayeqVar == null) {
                this.d = null;
                this.a = true;
            }
            if (ayeqVar == null) {
                return null;
            }
            t(ayeqVar);
            return new ayga(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List r1 = r6.d     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4f
            r0 = 0
            r6.d = r0     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            r6.a = r1     // Catch: java.lang.Throwable -> L6d
            aygh r2 = r6.f     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L2d
            r2.c = r0     // Catch: java.lang.Throwable -> L4b
            r2.b = r1     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            return
        L2d:
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L4b
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
            java.util.List r1 = r6.d     // Catch: java.lang.Throwable -> L6d
            r6.d = r0     // Catch: java.lang.Throwable -> L6d
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aygi.r():void");
    }
}
