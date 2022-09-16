package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: aywz  reason: default package */
/* loaded from: classes2.dex */
public final class aywz extends aznz implements ayoa {
    static final Object a = new Object();
    private static final long serialVersionUID = -3688291656102519502L;
    final bame b;
    final ayqe c;
    final int d;
    final Map e;
    final azml f;
    bamf g;
    final AtomicBoolean h = new AtomicBoolean();
    final AtomicLong i = new AtomicLong();
    final AtomicInteger j = new AtomicInteger(1);
    Throwable k;
    volatile boolean l;
    boolean m;
    boolean n;

    public aywz(bame bameVar, ayqe ayqeVar, int i, Map map) {
        this.b = bameVar;
        this.c = ayqeVar;
        this.d = i;
        this.e = map;
        this.f = new azml(i);
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.m) {
            azqc.d(th);
            return;
        }
        this.m = true;
        for (aypu aypuVar : this.e.values()) {
            ayxa ayxaVar = aypuVar.b;
            ayxaVar.f = th;
            ayxaVar.e = true;
            ayxaVar.b();
        }
        this.e.clear();
        this.k = th;
        this.l = true;
        g();
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        boolean z;
        if (this.m) {
            return;
        }
        azml azmlVar = this.f;
        try {
            Object a2 = this.c.a(obj);
            Object obj2 = a2 != null ? a2 : a;
            aypu aypuVar = (aypu) this.e.get(obj2);
            if (aypuVar != null) {
                z = false;
            } else if (this.h.get()) {
                return;
            } else {
                aypuVar = new aypu(new ayxa(this.d, this, a2));
                this.e.put(obj2, aypuVar);
                this.j.getAndIncrement();
                z = true;
            }
            try {
                ayrd.b(obj, "The valueSelector returned null");
                ayxa ayxaVar = aypuVar.b;
                ayxaVar.b.k(obj);
                ayxaVar.b();
                if (!z) {
                    return;
                }
                azmlVar.k(aypuVar);
                g();
            } catch (Throwable th) {
                bapv.j(th);
                this.g.si();
                b(th);
            }
        } catch (Throwable th2) {
            bapv.j(th2);
            this.g.si();
            b(th2);
        }
    }

    @Override // defpackage.ayrn
    public final void d() {
        this.f.d();
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.g, bamfVar)) {
            this.g = bamfVar;
            this.b.f(this);
            bamfVar.sp(this.d);
        }
    }

    final void g() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        int i = 1;
        if (this.n) {
            azml azmlVar = this.f;
            bame bameVar = this.b;
            while (!this.h.get()) {
                boolean z = this.l;
                if (!z || (th = this.k) == null) {
                    bameVar.c(null);
                    if (z) {
                        Throwable th2 = this.k;
                        if (th2 != null) {
                            bameVar.b(th2);
                            return;
                        } else {
                            bameVar.sm();
                            return;
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    azmlVar.d();
                    bameVar.b(th);
                    return;
                }
            }
            azmlVar.d();
            return;
        }
        azml azmlVar2 = this.f;
        bame bameVar2 = this.b;
        int i2 = 1;
        do {
            long j = this.i.get();
            long j2 = 0;
            while (j2 != j) {
                boolean z2 = this.l;
                aypu aypuVar = (aypu) azmlVar2.sl();
                boolean z3 = aypuVar == null;
                if (h(z2, z3, bameVar2, azmlVar2)) {
                    return;
                }
                if (z3) {
                    break;
                }
                bameVar2.c(aypuVar);
                j2++;
            }
            if (j2 == j && h(this.l, azmlVar2.j(), bameVar2, azmlVar2)) {
                return;
            }
            if (j2 != 0) {
                if (j != Long.MAX_VALUE) {
                    this.i.addAndGet(-j2);
                }
                this.g.sp(j2);
            }
            i2 = addAndGet(-i2);
        } while (i2 != 0);
    }

    final boolean h(boolean z, boolean z2, bame bameVar, azml azmlVar) {
        if (this.h.get()) {
            azmlVar.d();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th = this.k;
            if (th != null) {
                azmlVar.d();
                bameVar.b(th);
                return true;
            } else if (!z2) {
                return false;
            } else {
                bameVar.sm();
                return true;
            }
        }
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return this.f.j();
    }

    @Override // defpackage.bamf
    public final void si() {
        if (!this.h.compareAndSet(false, true) || this.j.decrementAndGet() != 0) {
            return;
        }
        this.g.si();
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        if ((i & 2) != 0) {
            this.n = true;
            return 2;
        }
        return 0;
    }

    @Override // defpackage.ayrn
    public final /* bridge */ /* synthetic */ Object sl() {
        return (aypu) this.f.sl();
    }

    @Override // defpackage.bame
    public final void sm() {
        if (!this.m) {
            for (aypu aypuVar : this.e.values()) {
                ayxa ayxaVar = aypuVar.b;
                ayxaVar.e = true;
                ayxaVar.b();
            }
            this.e.clear();
            this.m = true;
            this.l = true;
            g();
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this.i, j);
            g();
        }
    }
}
