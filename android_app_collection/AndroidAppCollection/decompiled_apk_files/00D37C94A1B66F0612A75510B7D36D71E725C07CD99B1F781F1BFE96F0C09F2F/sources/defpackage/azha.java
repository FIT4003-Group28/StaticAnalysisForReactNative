package defpackage;
/* compiled from: PG */
/* renamed from: azha  reason: default package */
/* loaded from: classes2.dex */
final class azha extends ayrp implements Runnable, ayom {
    private static final long serialVersionUID = 6576896619930983584L;
    final ayom a;
    final ayoq b;
    final int c;
    ayrn d;
    aypg e;
    Throwable f;
    volatile boolean g;
    volatile boolean h;
    int i;
    boolean j;

    public azha(ayom ayomVar, ayoq ayoqVar, int i) {
        this.a = ayomVar;
        this.b = ayoqVar;
        this.c = i;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.g) {
            azqc.d(th);
            return;
        }
        this.f = th;
        this.g = true;
        f();
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.g) {
            return;
        }
        if (this.i != 2) {
            this.d.k(obj);
        }
        f();
    }

    @Override // defpackage.ayrn
    public final void d() {
        this.d.d();
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.h;
    }

    final void f() {
        if (getAndIncrement() == 0) {
            this.b.a(this);
        }
    }

    final boolean g(boolean z, boolean z2, ayom ayomVar) {
        if (this.h) {
            this.d.d();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th = this.f;
            if (th != null) {
                this.h = true;
                this.d.d();
                ayomVar.b(th);
                this.b.qr();
                return true;
            } else if (!z2) {
                return false;
            } else {
                this.h = true;
                ayomVar.sm();
                this.b.qr();
                return true;
            }
        }
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return this.d.j();
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (!this.h) {
            this.h = true;
            this.e.qr();
            this.b.qr();
            if (getAndIncrement() != 0) {
                return;
            }
            this.d.d();
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.e, aypgVar)) {
            this.e = aypgVar;
            if (aypgVar instanceof ayri) {
                ayri ayriVar = (ayri) aypgVar;
                int sk = ayriVar.sk(7);
                if (sk == 1) {
                    this.i = 1;
                    this.d = ayriVar;
                    this.g = true;
                    this.a.sj(this);
                    f();
                    return;
                } else if (sk == 2) {
                    this.i = 2;
                    this.d = ayriVar;
                    this.a.sj(this);
                    return;
                }
            }
            this.d = new azml(this.c);
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        if ((i & 2) != 0) {
            this.j = true;
            return 2;
        }
        return 0;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        return this.d.sl();
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.g) {
            return;
        }
        this.g = true;
        f();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.j) {
            int i = 1;
            while (!this.h) {
                boolean z = this.g;
                Throwable th = this.f;
                if (!z || th == null) {
                    this.a.c(null);
                    if (!z) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        this.h = true;
                        Throwable th2 = this.f;
                        if (th2 != null) {
                            this.a.b(th2);
                        } else {
                            this.a.sm();
                        }
                        this.b.qr();
                        return;
                    }
                } else {
                    this.h = true;
                    this.a.b(this.f);
                    this.b.qr();
                    return;
                }
            }
            return;
        }
        ayrn ayrnVar = this.d;
        ayom ayomVar = this.a;
        int i2 = 1;
        while (!g(this.g, ayrnVar.j(), ayomVar)) {
            while (true) {
                boolean z2 = this.g;
                try {
                    Object sl = ayrnVar.sl();
                    boolean z3 = sl == null;
                    if (g(z2, z3, ayomVar)) {
                        return;
                    }
                    if (!z3) {
                        ayomVar.c(sl);
                    } else {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    bapv.j(th3);
                    this.h = true;
                    this.e.qr();
                    ayrnVar.d();
                    ayomVar.b(th3);
                    this.b.qr();
                    return;
                }
            }
        }
    }
}
