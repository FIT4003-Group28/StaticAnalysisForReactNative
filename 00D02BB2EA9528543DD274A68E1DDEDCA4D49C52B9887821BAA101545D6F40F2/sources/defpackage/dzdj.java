package defpackage;
/* compiled from: PG */
/* renamed from: dzdj  reason: default package */
/* loaded from: classes6.dex */
final class dzdj<T> extends dzbs<T> implements Runnable, dyzw {
    private static final long serialVersionUID = 6576896619930983584L;
    final dyzw<? super T> a;
    final dyzy b;
    final int c;
    dzbq<T> d;
    dzak e;
    Throwable f;
    volatile boolean g;
    volatile boolean h;
    int i;
    boolean j;

    public dzdj(dyzw<? super T> dyzwVar, dyzy dyzyVar, int i) {
        this.a = dyzwVar;
        this.b = dyzyVar;
        this.c = i;
    }

    @Override // defpackage.dzbq
    public final boolean SO() {
        return this.d.SO();
    }

    @Override // defpackage.dzbq
    public final T SP() {
        return this.d.SP();
    }

    @Override // defpackage.dzak
    public final void SQ() {
        if (!this.h) {
            this.h = true;
            this.e.SQ();
            this.b.SQ();
            if (getAndIncrement() != 0) {
                return;
            }
            this.d.f();
        }
    }

    @Override // defpackage.dyzw
    public final void b(dzak dzakVar) {
        if (dzbd.c(this.e, dzakVar)) {
            this.e = dzakVar;
            if (dzakVar instanceof dzbn) {
                dzbn dzbnVar = (dzbn) dzakVar;
                int h = dzbnVar.h();
                if (h == 1) {
                    this.i = 1;
                    this.d = dzbnVar;
                    this.g = true;
                    this.a.b(this);
                    i();
                    return;
                } else if (h == 2) {
                    this.i = 2;
                    this.d = dzbnVar;
                    this.a.b(this);
                    return;
                }
            }
            this.d = new dzea(this.c);
            this.a.b(this);
        }
    }

    @Override // defpackage.dyzw
    public final void c(T t) {
        if (this.g) {
            return;
        }
        if (this.i != 2) {
            this.d.g(t);
        }
        i();
    }

    @Override // defpackage.dyzw
    public final void d(Throwable th) {
        if (this.g) {
            dzfy.a(th);
            return;
        }
        this.f = th;
        this.g = true;
        i();
    }

    @Override // defpackage.dyzw
    public final void e() {
        if (this.g) {
            return;
        }
        this.g = true;
        i();
    }

    @Override // defpackage.dzbq
    public final void f() {
        this.d.f();
    }

    @Override // defpackage.dzbo
    public final int h() {
        this.j = true;
        return 2;
    }

    final void i() {
        if (getAndIncrement() == 0) {
            this.b.b(this);
        }
    }

    final boolean j(boolean z, boolean z2, dyzw<? super T> dyzwVar) {
        if (this.h) {
            this.d.f();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th = this.f;
            if (th != null) {
                this.d.f();
                dyzwVar.d(th);
                this.b.SQ();
                return true;
            } else if (!z2) {
                return false;
            } else {
                dyzwVar.e();
                this.b.SQ();
                return true;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        if (this.j) {
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
                        Throwable th2 = this.f;
                        if (th2 != null) {
                            this.a.d(th2);
                        } else {
                            this.a.e();
                        }
                        this.b.SQ();
                        return;
                    }
                } else {
                    this.a.d(th);
                    this.b.SQ();
                    return;
                }
            }
            return;
        }
        dzbq<T> dzbqVar = this.d;
        dyzw<? super T> dyzwVar = this.a;
        int i2 = 1;
        while (!j(this.g, dzbqVar.SO(), dyzwVar)) {
            while (true) {
                boolean z2 = this.g;
                try {
                    Object obj = (T) dzbqVar.SP();
                    boolean z3 = obj == null;
                    if (j(z2, z3, dyzwVar)) {
                        return;
                    }
                    if (!z3) {
                        dyzwVar.c(obj);
                    } else {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    dzas.a(th3);
                    this.e.SQ();
                    dzbqVar.f();
                    dyzwVar.d(th3);
                    this.b.SQ();
                    return;
                }
            }
        }
    }
}
