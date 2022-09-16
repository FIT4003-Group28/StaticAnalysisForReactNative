package defpackage;
/* compiled from: PG */
/* renamed from: ayxo  reason: default package */
/* loaded from: classes2.dex */
final class ayxo extends ayxn {
    private static final long serialVersionUID = 644624475404284533L;
    final ayre m;
    long n;

    public ayxo(ayre ayreVar, ayoq ayoqVar, int i) {
        super(ayoqVar, i);
        this.m = ayreVar;
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
        ayre ayreVar = this.m;
        ayrn ayrnVar = this.f;
        long j = this.k;
        long j2 = this.n;
        int i = 1;
        while (true) {
            long j3 = this.d.get();
            while (j != j3) {
                boolean z = this.h;
                try {
                    Object sl = ayrnVar.sl();
                    boolean z2 = sl == null;
                    if (m(z, z2, ayreVar)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    if (ayreVar.e(sl)) {
                        j++;
                    }
                    j2++;
                    if (j2 == this.c) {
                        this.e.sp(j2);
                        j2 = 0;
                    }
                } catch (Throwable th) {
                    bapv.j(th);
                    this.g = true;
                    this.e.si();
                    ayrnVar.d();
                    ayreVar.b(th);
                    this.a.qr();
                    return;
                }
            }
            if (j != j3 || !m(this.h, ayrnVar.j(), ayreVar)) {
                int i2 = get();
                if (i == i2) {
                    this.k = j;
                    this.n = j2;
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
        ayre ayreVar = this.m;
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
                        if (ayreVar.e(sl)) {
                            j++;
                        }
                    } else {
                        this.g = true;
                        ayreVar.sm();
                        this.a.qr();
                        return;
                    }
                } catch (Throwable th) {
                    bapv.j(th);
                    this.g = true;
                    this.e.si();
                    ayreVar.b(th);
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
                ayreVar.sm();
                this.a.qr();
                return;
            }
        }
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        Object sl = this.f.sl();
        if (sl != null && this.j != 1) {
            long j = this.n + 1;
            if (j == this.c) {
                this.n = 0L;
                this.e.sp(j);
            } else {
                this.n = j;
            }
        }
        return sl;
    }
}
