package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: PG */
/* renamed from: ayuj  reason: default package */
/* loaded from: classes2.dex */
final class ayuj extends aznz {
    private static final long serialVersionUID = -5082275438355852221L;
    final bame a;
    final ayqe b;
    final ayuk[] c;
    final azml d;
    final Object[] e;
    boolean f;
    int g;
    int h;
    volatile boolean i;
    final AtomicLong j;
    volatile boolean k;
    final AtomicReference l;

    public ayuj(bame bameVar, ayqe ayqeVar, int i, int i2) {
        this.a = bameVar;
        this.b = ayqeVar;
        ayuk[] ayukVarArr = new ayuk[i];
        for (int i3 = 0; i3 < i; i3++) {
            ayukVarArr[i3] = new ayuk(this, i3, i2);
        }
        this.c = ayukVarArr;
        this.e = new Object[i];
        this.d = new azml(i2);
        this.j = new AtomicLong();
        this.l = new AtomicReference();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        for (ayuk ayukVar : this.c) {
            azof.f(ayukVar);
        }
    }

    @Override // defpackage.ayrn
    public final void d() {
        this.d.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (getAndIncrement() != 0) {
            return;
        }
        int i = 1;
        if (this.f) {
            bame bameVar = this.a;
            azml azmlVar = this.d;
            while (!this.i) {
                Throwable th = (Throwable) this.l.get();
                if (th == null) {
                    boolean z = this.k;
                    boolean j = azmlVar.j();
                    if (!j) {
                        bameVar.c(null);
                    }
                    if (!z || !j) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        bameVar.sm();
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
        bame bameVar2 = this.a;
        azml azmlVar2 = this.d;
        int i2 = 1;
        do {
            long j2 = this.j.get();
            long j3 = 0;
            while (j3 != j2) {
                boolean z2 = this.k;
                Object sl = azmlVar2.sl();
                boolean z3 = sl == null;
                if (h(z2, z3, bameVar2, azmlVar2)) {
                    return;
                }
                if (z3) {
                    break;
                }
                try {
                    Object a = this.b.a((Object[]) azmlVar2.sl());
                    ayrd.b(a, "The combiner returned a null value");
                    bameVar2.c(a);
                    ((ayuk) sl).d();
                    j3++;
                } catch (Throwable th2) {
                    bapv.j(th2);
                    b();
                    azom.e(this.l, th2);
                    bameVar2.b(azom.d(this.l));
                    return;
                }
            }
            if (j3 == j2 && h(this.k, azmlVar2.j(), bameVar2, azmlVar2)) {
                return;
            }
            if (j3 != 0 && j2 != Long.MAX_VALUE) {
                this.j.addAndGet(-j3);
            }
            i2 = addAndGet(-i2);
        } while (i2 != 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i, Object obj) {
        boolean z;
        synchronized (this) {
            Object[] objArr = this.e;
            int i2 = this.g;
            if (objArr[i] == null) {
                i2++;
                this.g = i2;
            }
            objArr[i] = obj;
            z = false;
            if (objArr.length == i2) {
                azml azmlVar = this.d;
                ayuk ayukVar = this.c[i];
                Object clone = objArr.clone();
                AtomicReferenceArray atomicReferenceArray = azmlVar.g;
                long a = azmlVar.a();
                int i3 = azmlVar.f;
                long j = 2 + a;
                if (atomicReferenceArray.get(((int) j) & i3) == null) {
                    int i4 = ((int) a) & i3;
                    atomicReferenceArray.lazySet(i4 + 1, clone);
                    atomicReferenceArray.lazySet(i4, ayukVar);
                } else {
                    AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
                    azmlVar.g = atomicReferenceArray2;
                    int i5 = ((int) a) & i3;
                    atomicReferenceArray2.lazySet(i5 + 1, clone);
                    atomicReferenceArray2.lazySet(i5, ayukVar);
                    azmlVar.b(atomicReferenceArray, atomicReferenceArray2);
                    atomicReferenceArray.lazySet(i5, azml.b);
                }
                azmlVar.e(j);
            } else {
                z = true;
            }
        }
        if (z) {
            this.c[i].d();
        } else {
            f();
        }
    }

    final boolean h(boolean z, boolean z2, bame bameVar, azml azmlVar) {
        if (this.i) {
            b();
            azmlVar.d();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable d = azom.d(this.l);
            if (d != null && d != azom.a) {
                b();
                azmlVar.d();
                bameVar.b(d);
                return true;
            } else if (!z2) {
                return false;
            } else {
                b();
                bameVar.sm();
                return true;
            }
        }
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return this.d.j();
    }

    @Override // defpackage.bamf
    public final void si() {
        this.i = true;
        b();
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        boolean z = false;
        if ((i & 4) != 0) {
            return 0;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            z = true;
        }
        this.f = z;
        return i2;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        Object sl = this.d.sl();
        if (sl == null) {
            return null;
        }
        Object a = this.b.a((Object[]) this.d.sl());
        ayrd.b(a, "The combiner returned a null value");
        ((ayuk) sl).d();
        return a;
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this.j, j);
            f();
        }
    }
}
