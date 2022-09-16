package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayvz  reason: default package */
/* loaded from: classes2.dex */
public final class ayvz extends AtomicReference implements ayoa, aypg {
    private static final long serialVersionUID = -4606175640614850599L;
    final long a;
    final aywa b;
    final int c;
    final int d;
    volatile boolean e;
    volatile ayrn f;
    long g;
    int h;

    public ayvz(aywa aywaVar, long j) {
        this.a = j;
        this.b = aywaVar;
        int i = aywaVar.f;
        this.d = i;
        this.c = i >> 2;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        lazySet(azof.a);
        aywa aywaVar = this.b;
        if (azom.e(aywaVar.i, th)) {
            this.e = true;
            aywaVar.m.si();
            for (ayvz ayvzVar : (ayvz[]) aywaVar.k.getAndSet(aywa.b)) {
                azof.f(ayvzVar);
            }
            aywaVar.h();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.h == 2) {
            this.b.h();
            return;
        }
        aywa aywaVar = this.b;
        if (aywaVar.get() != 0 || !aywaVar.compareAndSet(0, 1)) {
            ayrn ayrnVar = this.f;
            if (ayrnVar == null) {
                ayrnVar = new azmk(aywaVar.f);
                this.f = ayrnVar;
            }
            if (!ayrnVar.k(obj)) {
                aywaVar.b(new aypp("Inner queue full?!"));
                return;
            } else if (aywaVar.getAndIncrement() != 0) {
                return;
            }
        } else {
            long j = aywaVar.l.get();
            ayrn ayrnVar2 = this.f;
            if (j == 0 || (ayrnVar2 != null && !ayrnVar2.j())) {
                if (ayrnVar2 == null && (ayrnVar2 = this.f) == null) {
                    ayrnVar2 = new azmk(aywaVar.f);
                    this.f = ayrnVar2;
                }
                if (!ayrnVar2.k(obj)) {
                    aywaVar.b(new aypp("Inner queue full?!"));
                    return;
                }
            } else {
                aywaVar.c.c(obj);
                if (j != Long.MAX_VALUE) {
                    aywaVar.l.decrementAndGet();
                }
                d(1L);
            }
            if (aywaVar.decrementAndGet() == 0) {
                return;
            }
        }
        aywaVar.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(long j) {
        if (this.h != 1) {
            long j2 = this.g + j;
            if (j2 < this.c) {
                this.g = j2;
                return;
            }
            this.g = 0L;
            ((bamf) get()).sp(j2);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == azof.a;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.g(this, bamfVar)) {
            if (bamfVar instanceof ayrk) {
                ayrk ayrkVar = (ayrk) bamfVar;
                int sk = ayrkVar.sk(7);
                if (sk == 1) {
                    this.h = 1;
                    this.f = ayrkVar;
                    this.e = true;
                    this.b.h();
                    return;
                } else if (sk == 2) {
                    this.h = 2;
                    this.f = ayrkVar;
                }
            }
            bamfVar.sp(this.d);
        }
    }

    @Override // defpackage.aypg
    public final void qr() {
        azof.f(this);
    }

    @Override // defpackage.bame
    public final void sm() {
        this.e = true;
        this.b.h();
    }
}
