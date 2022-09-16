package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayxa  reason: default package */
/* loaded from: classes2.dex */
public final class ayxa extends aznz implements bamd {
    private static final long serialVersionUID = -3852313036005250360L;
    final Object a;
    public final azml b;
    final aywz c;
    public volatile boolean e;
    public Throwable f;
    boolean j;
    int k;
    final AtomicLong d = new AtomicLong();
    final AtomicBoolean g = new AtomicBoolean();
    final AtomicReference h = new AtomicReference();
    final AtomicBoolean i = new AtomicBoolean();

    public ayxa(int i, aywz aywzVar, Object obj) {
        this.b = new azml(i);
        this.c = aywzVar;
        this.a = obj;
    }

    @Override // defpackage.bamd
    public final void ad(bame bameVar) {
        if (this.i.compareAndSet(false, true)) {
            bameVar.f(this);
            this.h.lazySet(bameVar);
            b();
            return;
        }
        azoc.f(new IllegalStateException("Only one Subscriber allowed!"), bameVar);
    }

    public final void b() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        int i = 1;
        if (!this.j) {
            azml azmlVar = this.b;
            bame bameVar = (bame) this.h.get();
            int i2 = 1;
            while (true) {
                if (bameVar != null) {
                    long j = this.d.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.e;
                        Object sl = azmlVar.sl();
                        boolean z2 = sl == null;
                        if (f(z, z2, bameVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        bameVar.c(sl);
                        j2++;
                    }
                    if (j2 == j && f(this.e, azmlVar.j(), bameVar)) {
                        return;
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            this.d.addAndGet(-j2);
                        }
                        this.c.g.sp(j2);
                    }
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
                if (bameVar == null) {
                    bameVar = (bame) this.h.get();
                }
            }
        } else {
            azml azmlVar2 = this.b;
            bame bameVar2 = (bame) this.h.get();
            while (true) {
                if (bameVar2 != null) {
                    if (this.g.get()) {
                        azmlVar2.d();
                        return;
                    }
                    boolean z3 = this.e;
                    if (!z3 || (th = this.f) == null) {
                        bameVar2.c(null);
                        if (z3) {
                            Throwable th2 = this.f;
                            if (th2 != null) {
                                bameVar2.b(th2);
                                return;
                            } else {
                                bameVar2.sm();
                                return;
                            }
                        }
                    } else {
                        azmlVar2.d();
                        bameVar2.b(th);
                        return;
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
                if (bameVar2 == null) {
                    bameVar2 = (bame) this.h.get();
                }
            }
        }
    }

    @Override // defpackage.ayrn
    public final void d() {
        this.b.d();
    }

    final boolean f(boolean z, boolean z2, bame bameVar) {
        if (this.g.get()) {
            this.b.d();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th = this.f;
            if (th != null) {
                this.b.d();
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
        return this.b.j();
    }

    @Override // defpackage.bamf
    public final void si() {
        if (this.g.compareAndSet(false, true)) {
            aywz aywzVar = this.c;
            Object obj = this.a;
            if (obj == null) {
                obj = aywz.a;
            }
            aywzVar.e.remove(obj);
            if (aywzVar.j.decrementAndGet() != 0) {
                return;
            }
            aywzVar.g.si();
            if (aywzVar.getAndIncrement() != 0) {
                return;
            }
            aywzVar.f.d();
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
        Object sl = this.b.sl();
        if (sl != null) {
            this.k++;
            return sl;
        }
        int i = this.k;
        if (i == 0) {
            return null;
        }
        this.k = 0;
        this.c.g.sp(i);
        return null;
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this.d, j);
            b();
        }
    }
}
