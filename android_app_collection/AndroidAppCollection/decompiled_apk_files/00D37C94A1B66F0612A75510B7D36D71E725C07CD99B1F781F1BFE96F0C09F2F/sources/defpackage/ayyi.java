package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayyi  reason: default package */
/* loaded from: classes2.dex */
public final class ayyi extends AtomicInteger implements ayoa, aypg {
    static final ayyh[] a = new ayyh[0];
    static final ayyh[] b = new ayyh[0];
    private static final long serialVersionUID = -1672047311619175801L;
    final AtomicReference c;
    final AtomicReference d = new AtomicReference();
    final AtomicBoolean e = new AtomicBoolean();
    final AtomicReference f = new AtomicReference(a);
    final int g;
    volatile ayrn h;
    int i;
    volatile boolean j;
    Throwable k;
    int l;

    public ayyi(AtomicReference atomicReference, int i) {
        this.c = atomicReference;
        this.g = i;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.j) {
            azqc.d(th);
            return;
        }
        this.k = th;
        this.j = true;
        d();
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.i != 0 || this.h.k(obj)) {
            d();
        } else {
            b(new aypp("Prefetch queue is full?!"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        ayrn ayrnVar = this.h;
        int i = this.l;
        int i2 = this.g;
        int i3 = i2 - (i2 >> 2);
        int i4 = this.i;
        int i5 = 1;
        ayrn ayrnVar2 = ayrnVar;
        int i6 = i;
        while (true) {
            if (ayrnVar2 != null) {
                ayyh[] ayyhVarArr = (ayyh[]) this.f.get();
                long j = Long.MAX_VALUE;
                boolean z = false;
                for (ayyh ayyhVar : ayyhVarArr) {
                    long j2 = ayyhVar.get();
                    if (j2 != Long.MIN_VALUE) {
                        j = Math.min(j2 - ayyhVar.c, j);
                        z = true;
                    }
                }
                if (!z) {
                    j = 0;
                }
                for (long j3 = 0; j != j3; j3 = 0) {
                    boolean z2 = this.j;
                    try {
                        Object sl = ayrnVar2.sl();
                        boolean z3 = sl == null;
                        if (i(z2, z3)) {
                            return;
                        }
                        if (z3) {
                            break;
                        }
                        for (ayyh ayyhVar2 : ayyhVarArr) {
                            if (!ayyhVar2.a()) {
                                ayyhVar2.a.c(sl);
                                ayyhVar2.c++;
                            }
                        }
                        if (i4 != 1 && (i6 = i6 + 1) == i3) {
                            ((bamf) this.d.get()).sp(i3);
                            i6 = 0;
                        }
                        j--;
                        if (ayyhVarArr == this.f.get()) {
                        }
                    } catch (Throwable th) {
                        bapv.j(th);
                        ((bamf) this.d.get()).si();
                        ayrnVar2.d();
                        this.j = true;
                        h(th);
                        return;
                    }
                }
                if (i(this.j, ayrnVar2.j())) {
                    return;
                }
            }
            this.l = i6;
            i5 = addAndGet(-i5);
            if (i5 == 0) {
                return;
            }
            if (ayrnVar2 == null) {
                ayrnVar2 = this.h;
            }
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.f.get() == b;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.g(this.d, bamfVar)) {
            if (bamfVar instanceof ayrk) {
                ayrk ayrkVar = (ayrk) bamfVar;
                int sk = ayrkVar.sk(7);
                if (sk == 1) {
                    this.i = 1;
                    this.h = ayrkVar;
                    this.j = true;
                    d();
                    return;
                } else if (sk == 2) {
                    this.i = 2;
                    this.h = ayrkVar;
                    bamfVar.sp(this.g);
                    return;
                }
            }
            this.h = new azmk(this.g);
            bamfVar.sp(this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(ayyh ayyhVar) {
        ayyh[] ayyhVarArr;
        ayyh[] ayyhVarArr2;
        do {
            ayyhVarArr = (ayyh[]) this.f.get();
            int length = ayyhVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (ayyhVarArr[i] == ayyhVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                ayyhVarArr2 = a;
            } else {
                ayyh[] ayyhVarArr3 = new ayyh[length - 1];
                System.arraycopy(ayyhVarArr, 0, ayyhVarArr3, 0, i);
                System.arraycopy(ayyhVarArr, i + 1, ayyhVarArr3, i, (length - i) - 1);
                ayyhVarArr2 = ayyhVarArr3;
            }
        } while (!this.f.compareAndSet(ayyhVarArr, ayyhVarArr2));
    }

    final void h(Throwable th) {
        ayyh[] ayyhVarArr;
        for (ayyh ayyhVar : (ayyh[]) this.f.getAndSet(b)) {
            if (!ayyhVar.a()) {
                ayyhVar.a.b(th);
            }
        }
    }

    final boolean i(boolean z, boolean z2) {
        ayyh[] ayyhVarArr;
        if (!z || !z2) {
            return false;
        }
        Throwable th = this.k;
        if (th != null) {
            h(th);
            return true;
        }
        for (ayyh ayyhVar : (ayyh[]) this.f.getAndSet(b)) {
            if (!ayyhVar.a()) {
                ayyhVar.a.sm();
            }
        }
        return true;
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.f.getAndSet(b);
        this.c.compareAndSet(this, null);
        azof.f(this.d);
    }

    @Override // defpackage.bame
    public final void sm() {
        this.j = true;
        d();
    }
}
