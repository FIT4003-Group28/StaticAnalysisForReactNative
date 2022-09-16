package defpackage;
/* compiled from: PG */
/* renamed from: ctp  reason: default package */
/* loaded from: classes3.dex */
public final class ctp implements ctj, cth {
    public volatile cth a;
    public volatile cth b;
    private final ctj c;
    private final Object d;
    private cti e = cti.CLEARED;
    private cti f = cti.CLEARED;
    private boolean g;

    public ctp(Object obj, ctj ctjVar) {
        this.d = obj;
        this.c = ctjVar;
    }

    @Override // defpackage.ctj
    public final ctj a() {
        ctj a;
        synchronized (this.d) {
            ctj ctjVar = this.c;
            a = ctjVar != null ? ctjVar.a() : this;
        }
        return a;
    }

    @Override // defpackage.cth
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            if (this.e != cti.SUCCESS && this.f != cti.RUNNING) {
                this.f = cti.RUNNING;
                this.b.b();
            }
            if (this.g && this.e != cti.RUNNING) {
                this.e = cti.RUNNING;
                this.a.b();
            }
            this.g = false;
        }
    }

    @Override // defpackage.cth
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            this.e = cti.CLEARED;
            this.f = cti.CLEARED;
            this.b.c();
            this.a.c();
        }
    }

    @Override // defpackage.ctj
    public final void d(cth cthVar) {
        synchronized (this.d) {
            if (!cthVar.equals(this.a)) {
                this.f = cti.FAILED;
                return;
            }
            this.e = cti.FAILED;
            ctj ctjVar = this.c;
            if (ctjVar != null) {
                ctjVar.d(this);
            }
        }
    }

    @Override // defpackage.ctj
    public final void e(cth cthVar) {
        synchronized (this.d) {
            if (cthVar.equals(this.b)) {
                this.f = cti.SUCCESS;
                return;
            }
            this.e = cti.SUCCESS;
            ctj ctjVar = this.c;
            if (ctjVar != null) {
                ctjVar.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.cth
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = cti.PAUSED;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = cti.PAUSED;
                this.a.f();
            }
        }
    }

    @Override // defpackage.ctj
    public final boolean g(cth cthVar) {
        boolean z;
        synchronized (this.d) {
            ctj ctjVar = this.c;
            z = false;
            if ((ctjVar == null || ctjVar.g(this)) && cthVar.equals(this.a) && this.e != cti.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ctj
    public final boolean h(cth cthVar) {
        boolean z;
        synchronized (this.d) {
            ctj ctjVar = this.c;
            z = false;
            if ((ctjVar == null || ctjVar.h(this)) && cthVar.equals(this.a) && !j()) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r4.e == defpackage.cti.SUCCESS) goto L9;
     */
    @Override // defpackage.ctj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(defpackage.cth r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.d
            monitor-enter(r0)
            ctj r1 = r4.c     // Catch: java.lang.Throwable -> L22
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            boolean r1 = r1.i(r4)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L10
            goto L12
        L10:
            r2 = 0
            goto L20
        L12:
            cth r1 = r4.a     // Catch: java.lang.Throwable -> L22
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Throwable -> L22
            if (r5 != 0) goto L20
            cti r5 = r4.e     // Catch: java.lang.Throwable -> L22
            cti r1 = defpackage.cti.SUCCESS     // Catch: java.lang.Throwable -> L22
            if (r5 == r1) goto L10
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r2
        L22:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L26
        L25:
            throw r5
        L26:
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctp.i(cth):boolean");
    }

    @Override // defpackage.ctj, defpackage.cth
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.b.j() && !this.a.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.cth
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.e == cti.CLEARED;
        }
        return z;
    }

    @Override // defpackage.cth
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.e == cti.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.cth
    public final boolean m(cth cthVar) {
        if (cthVar instanceof ctp) {
            ctp ctpVar = (ctp) cthVar;
            if (this.a != null ? this.a.m(ctpVar.a) : ctpVar.a == null) {
                if (this.b == null) {
                    if (ctpVar.b == null) {
                        return true;
                    }
                } else if (this.b.m(ctpVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cth
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            z = this.e == cti.RUNNING;
        }
        return z;
    }
}
