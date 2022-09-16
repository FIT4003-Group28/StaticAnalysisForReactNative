package defpackage;
/* compiled from: PG */
/* renamed from: ayxp  reason: default package */
/* loaded from: classes2.dex */
final class ayxp extends ayxn implements ayoa {
    private static final long serialVersionUID = -4547113800637756442L;
    final bame m;

    public ayxp(bame bameVar, ayoq ayoqVar, int i) {
        super(ayoqVar, i);
        this.m = bameVar;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.e, bamfVar)) {
            this.e = bamfVar;
            if (bamfVar instanceof ayrk) {
                ayrk ayrkVar = (ayrk) bamfVar;
                int sk = ayrkVar.sk(7);
                if (sk == 1) {
                    this.j = 1;
                    this.f = ayrkVar;
                    this.h = true;
                    this.m.f(this);
                    return;
                } else if (sk == 2) {
                    this.j = 2;
                    this.f = ayrkVar;
                    this.m.f(this);
                    bamfVar.sp(this.b);
                    return;
                }
            }
            this.f = new azmk(this.b);
            this.m.f(this);
            bamfVar.sp(this.b);
        }
    }

    @Override // defpackage.ayxn
    public final void g() {
        bame bameVar = this.m;
        ayrn ayrnVar = this.f;
        long j = this.k;
        int i = 1;
        while (true) {
            long j2 = this.d.get();
            while (j != j2) {
                boolean z = this.h;
                try {
                    Object sl = ayrnVar.sl();
                    boolean z2 = sl == null;
                    if (m(z, z2, bameVar)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    bameVar.c(sl);
                    j++;
                    if (j == this.c) {
                        if (j2 != Long.MAX_VALUE) {
                            j2 = this.d.addAndGet(-j);
                        }
                        this.e.sp(j);
                        j = 0;
                    }
                } catch (Throwable th) {
                    bapv.j(th);
                    this.g = true;
                    this.e.si();
                    ayrnVar.d();
                    bameVar.b(th);
                    this.a.qr();
                    return;
                }
            }
            if (j != j2 || !m(this.h, ayrnVar.j(), bameVar)) {
                int i2 = get();
                if (i == i2) {
                    this.k = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.ayxn
    public final void h() {
        int i = 1;
        while (!this.g) {
            boolean z = this.h;
            this.m.c(null);
            if (!z) {
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                this.g = true;
                Throwable th = this.i;
                if (th != null) {
                    this.m.b(th);
                } else {
                    this.m.sm();
                }
                this.a.qr();
                return;
            }
        }
    }

    @Override // defpackage.ayxn
    public final void i() {
        bame bameVar = this.m;
        ayrn ayrnVar = this.f;
        long j = this.k;
        int i = 1;
        while (true) {
            long j2 = this.d.get();
            while (j != j2) {
                try {
                    Object sl = ayrnVar.sl();
                    if (this.g) {
                        return;
                    }
                    if (sl != null) {
                        bameVar.c(sl);
                        j++;
                    } else {
                        this.g = true;
                        bameVar.sm();
                        this.a.qr();
                        return;
                    }
                } catch (Throwable th) {
                    bapv.j(th);
                    this.g = true;
                    this.e.si();
                    bameVar.b(th);
                    this.a.qr();
                    return;
                }
            }
            if (this.g) {
                return;
            }
            if (!ayrnVar.j()) {
                int i2 = get();
                if (i == i2) {
                    this.k = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            } else {
                this.g = true;
                bameVar.sm();
                this.a.qr();
                return;
            }
        }
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        Object sl = this.f.sl();
        if (sl != null && this.j != 1) {
            long j = this.k + 1;
            if (j == this.c) {
                this.k = 0L;
                this.e.sp(j);
            } else {
                this.k = j;
            }
        }
        return sl;
    }
}
