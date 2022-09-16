package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayzn  reason: default package */
/* loaded from: classes2.dex */
public final class ayzn extends AtomicInteger implements ayoa, bamf {
    static final ayzm a;
    private static final long serialVersionUID = -3491074160481096299L;
    final bame b;
    final ayqe c;
    final int d;
    volatile boolean f;
    volatile boolean h;
    bamf i;
    volatile long l;
    final AtomicReference j = new AtomicReference();
    final AtomicLong k = new AtomicLong();
    final boolean e = false;
    final azoj g = new azoj();

    static {
        ayzm ayzmVar = new ayzm(null, -1L, 1);
        a = ayzmVar;
        azof.f(ayzmVar);
    }

    public ayzn(bame bameVar, ayqe ayqeVar, int i) {
        this.b = bameVar;
        this.c = ayqeVar;
        this.d = i;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.f || !azom.e(this.g, th)) {
            azqc.d(th);
            return;
        }
        d();
        this.f = true;
        g();
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        ayzm ayzmVar;
        if (this.f) {
            return;
        }
        long j = this.l + 1;
        this.l = j;
        ayzm ayzmVar2 = (ayzm) this.j.get();
        if (ayzmVar2 != null) {
            azof.f(ayzmVar2);
        }
        try {
            bamd bamdVar = (bamd) this.c.a(obj);
            ayrd.b(bamdVar, "The publisher returned is null");
            ayzm ayzmVar3 = new ayzm(this, j, this.d);
            do {
                ayzmVar = (ayzm) this.j.get();
                if (ayzmVar == a) {
                    return;
                }
            } while (!this.j.compareAndSet(ayzmVar, ayzmVar3));
            bamdVar.ad(ayzmVar3);
        } catch (Throwable th) {
            bapv.j(th);
            this.i.si();
            b(th);
        }
    }

    final void d() {
        ayzm ayzmVar;
        ayzm ayzmVar2 = (ayzm) this.j.get();
        ayzm ayzmVar3 = a;
        if (ayzmVar2 == ayzmVar3 || (ayzmVar = (ayzm) this.j.getAndSet(ayzmVar3)) == ayzmVar3 || ayzmVar == null) {
            return;
        }
        azof.f(ayzmVar);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.i, bamfVar)) {
            this.i = bamfVar;
            this.b.f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        boolean z;
        Object obj;
        if (getAndIncrement() != 0) {
            return;
        }
        bame bameVar = this.b;
        int i = 1;
        while (!this.h) {
            if (this.f) {
                if (((Throwable) this.g.get()) == null) {
                    if (this.j.get() == null) {
                        bameVar.sm();
                        return;
                    }
                } else {
                    d();
                    bameVar.b(azom.d(this.g));
                    return;
                }
            }
            ayzm ayzmVar = (ayzm) this.j.get();
            ayrn ayrnVar = ayzmVar != null ? ayzmVar.d : null;
            if (ayrnVar != null) {
                if (ayzmVar.e) {
                    if (((Throwable) this.g.get()) == null) {
                        if (ayrnVar.j()) {
                            this.j.compareAndSet(ayzmVar, null);
                        }
                    } else {
                        d();
                        bameVar.b(azom.d(this.g));
                        return;
                    }
                }
                long j = this.k.get();
                long j2 = 0;
                while (j2 != j) {
                    if (!this.h) {
                        boolean z2 = ayzmVar.e;
                        try {
                            obj = ayrnVar.sl();
                        } catch (Throwable th) {
                            bapv.j(th);
                            azof.f(ayzmVar);
                            azom.e(this.g, th);
                            obj = null;
                            z2 = true;
                        }
                        if (ayzmVar == this.j.get()) {
                            if (z2) {
                                if (((Throwable) this.g.get()) != null) {
                                    bameVar.b(azom.d(this.g));
                                    return;
                                } else if (obj == null) {
                                    this.j.compareAndSet(ayzmVar, null);
                                }
                            } else if (obj == null) {
                                break;
                            }
                            bameVar.c(obj);
                            j2++;
                        }
                        z = true;
                        break;
                    }
                    return;
                }
                z = false;
                if (j2 != 0 && !this.h) {
                    if (j != Long.MAX_VALUE) {
                        this.k.addAndGet(-j2);
                    }
                    if (ayzmVar.f != 1) {
                        ((bamf) ayzmVar.get()).sp(j2);
                    }
                }
                if (z) {
                    continue;
                }
            }
            i = addAndGet(-i);
            if (i == 0) {
                return;
            }
        }
        this.j.lazySet(null);
    }

    @Override // defpackage.bamf
    public final void si() {
        if (!this.h) {
            this.h = true;
            this.i.si();
            d();
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.f) {
            return;
        }
        this.f = true;
        g();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this.k, j);
            if (this.l == 0) {
                this.i.sp(Long.MAX_VALUE);
            } else {
                g();
            }
        }
    }
}
