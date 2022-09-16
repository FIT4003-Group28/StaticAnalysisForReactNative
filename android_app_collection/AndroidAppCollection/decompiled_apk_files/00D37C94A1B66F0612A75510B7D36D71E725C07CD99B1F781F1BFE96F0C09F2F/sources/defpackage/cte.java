package defpackage;
/* compiled from: PG */
/* renamed from: cte  reason: default package */
/* loaded from: classes3.dex */
public final class cte implements ctj, cth {
    public volatile cth a;
    public volatile cth b;
    private final Object c;
    private final ctj d;
    private cti e = cti.CLEARED;
    private cti f = cti.CLEARED;

    public cte(Object obj, ctj ctjVar) {
        this.c = obj;
        this.d = ctjVar;
    }

    private final boolean o(cth cthVar) {
        return cthVar.equals(this.a) || (this.e == cti.FAILED && cthVar.equals(this.b));
    }

    @Override // defpackage.ctj
    public final ctj a() {
        ctj a;
        synchronized (this.c) {
            ctj ctjVar = this.d;
            a = ctjVar != null ? ctjVar.a() : this;
        }
        return a;
    }

    @Override // defpackage.cth
    public final void b() {
        synchronized (this.c) {
            if (this.e != cti.RUNNING) {
                this.e = cti.RUNNING;
                this.a.b();
            }
        }
    }

    @Override // defpackage.cth
    public final void c() {
        synchronized (this.c) {
            this.e = cti.CLEARED;
            this.a.c();
            if (this.f != cti.CLEARED) {
                this.f = cti.CLEARED;
                this.b.c();
            }
        }
    }

    @Override // defpackage.ctj
    public final void d(cth cthVar) {
        synchronized (this.c) {
            if (!cthVar.equals(this.b)) {
                this.e = cti.FAILED;
                if (this.f != cti.RUNNING) {
                    this.f = cti.RUNNING;
                    this.b.b();
                }
                return;
            }
            this.f = cti.FAILED;
            ctj ctjVar = this.d;
            if (ctjVar != null) {
                ctjVar.d(this);
            }
        }
    }

    @Override // defpackage.ctj
    public final void e(cth cthVar) {
        synchronized (this.c) {
            if (cthVar.equals(this.a)) {
                this.e = cti.SUCCESS;
            } else if (cthVar.equals(this.b)) {
                this.f = cti.SUCCESS;
            }
            ctj ctjVar = this.d;
            if (ctjVar != null) {
                ctjVar.e(this);
            }
        }
    }

    @Override // defpackage.cth
    public final void f() {
        synchronized (this.c) {
            if (this.e == cti.RUNNING) {
                this.e = cti.PAUSED;
                this.a.f();
            }
            if (this.f == cti.RUNNING) {
                this.f = cti.PAUSED;
                this.b.f();
            }
        }
    }

    @Override // defpackage.ctj
    public final boolean g(cth cthVar) {
        boolean z;
        synchronized (this.c) {
            ctj ctjVar = this.d;
            z = false;
            if ((ctjVar == null || ctjVar.g(this)) && o(cthVar)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ctj
    public final boolean h(cth cthVar) {
        boolean z;
        synchronized (this.c) {
            ctj ctjVar = this.d;
            z = false;
            if ((ctjVar == null || ctjVar.h(this)) && o(cthVar)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ctj
    public final boolean i(cth cthVar) {
        boolean z;
        synchronized (this.c) {
            ctj ctjVar = this.d;
            z = false;
            if ((ctjVar == null || ctjVar.i(this)) && o(cthVar)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ctj, defpackage.cth
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.a.j() && !this.b.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.cth
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            z = false;
            if (this.e == cti.CLEARED && this.f == cti.CLEARED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.cth
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.e != cti.SUCCESS && this.f != cti.SUCCESS) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.cth
    public final boolean m(cth cthVar) {
        if (cthVar instanceof cte) {
            cte cteVar = (cte) cthVar;
            if (this.a.m(cteVar.a) && this.b.m(cteVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cth
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.e != cti.RUNNING && this.f != cti.RUNNING) {
                z = false;
            }
        }
        return z;
    }
}
