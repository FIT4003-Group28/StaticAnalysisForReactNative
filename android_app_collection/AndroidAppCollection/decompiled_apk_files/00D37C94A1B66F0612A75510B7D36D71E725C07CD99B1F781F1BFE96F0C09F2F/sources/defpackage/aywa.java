package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aywa  reason: default package */
/* loaded from: classes2.dex */
public final class aywa extends AtomicInteger implements ayoa, bamf {
    static final ayvz[] a = new ayvz[0];
    static final ayvz[] b = new ayvz[0];
    private static final long serialVersionUID = -2117620485640801370L;
    final bame c;
    final ayqe d;
    final int e;
    final int f;
    volatile ayrm g;
    volatile boolean h;
    final azoj i = new azoj();
    volatile boolean j;
    final AtomicReference k;
    final AtomicLong l;
    bamf m;
    long n;
    long o;
    int p;
    int q;
    final int r;

    public aywa(bame bameVar, ayqe ayqeVar, int i, int i2) {
        AtomicReference atomicReference = new AtomicReference();
        this.k = atomicReference;
        this.l = new AtomicLong();
        this.c = bameVar;
        this.d = ayqeVar;
        this.e = i;
        this.f = i2;
        this.r = Math.max(1, i >> 1);
        atomicReference.lazySet(a);
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.h) {
            azqc.d(th);
        } else if (azom.e(this.i, th)) {
            this.h = true;
            h();
        } else {
            azqc.d(th);
        }
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        ayvz[] ayvzVarArr;
        ayvz[] ayvzVarArr2;
        if (this.h) {
            return;
        }
        try {
            bamd bamdVar = (bamd) this.d.a(obj);
            ayrd.b(bamdVar, "The mapper returned a null Publisher");
            if (bamdVar instanceof Callable) {
                try {
                    Object call = ((Callable) bamdVar).call();
                    if (call != null) {
                        if (get() != 0 || !compareAndSet(0, 1)) {
                            if (!d().k(call)) {
                                b(new IllegalStateException("Scalar queue full?!"));
                                return;
                            } else if (getAndIncrement() != 0) {
                                return;
                            }
                        } else {
                            long j = this.l.get();
                            ayrn ayrnVar = this.g;
                            if (j == 0 || (ayrnVar != null && !ayrnVar.j())) {
                                if (ayrnVar == null) {
                                    ayrnVar = d();
                                }
                                if (!ayrnVar.k(call)) {
                                    b(new IllegalStateException("Scalar queue full?!"));
                                    return;
                                }
                            } else {
                                this.c.c(call);
                                if (j != Long.MAX_VALUE) {
                                    this.l.decrementAndGet();
                                }
                                if (this.e != Integer.MAX_VALUE && !this.j) {
                                    int i = this.q + 1;
                                    this.q = i;
                                    int i2 = this.r;
                                    if (i == i2) {
                                        this.q = 0;
                                        this.m.sp(i2);
                                    }
                                }
                            }
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        }
                        i();
                        return;
                    } else if (this.e == Integer.MAX_VALUE || this.j) {
                        return;
                    } else {
                        int i3 = this.q + 1;
                        this.q = i3;
                        int i4 = this.r;
                        if (i3 != i4) {
                            return;
                        }
                        this.q = 0;
                        this.m.sp(i4);
                        return;
                    }
                } catch (Throwable th) {
                    bapv.j(th);
                    azom.e(this.i, th);
                    h();
                    return;
                }
            }
            long j2 = this.n;
            this.n = 1 + j2;
            ayvz ayvzVar = new ayvz(this, j2);
            do {
                ayvzVarArr = (ayvz[]) this.k.get();
                if (ayvzVarArr != b) {
                    int length = ayvzVarArr.length;
                    ayvzVarArr2 = new ayvz[length + 1];
                    System.arraycopy(ayvzVarArr, 0, ayvzVarArr2, 0, length);
                    ayvzVarArr2[length] = ayvzVar;
                } else {
                    azof.f(ayvzVar);
                    return;
                }
            } while (!this.k.compareAndSet(ayvzVarArr, ayvzVarArr2));
            bamdVar.ad(ayvzVar);
        } catch (Throwable th2) {
            bapv.j(th2);
            this.m.si();
            b(th2);
        }
    }

    final ayrn d() {
        ayrm ayrmVar = this.g;
        if (ayrmVar == null) {
            int i = this.e;
            if (i == Integer.MAX_VALUE) {
                ayrmVar = new azml(this.f);
            } else {
                ayrmVar = new azmk(i);
            }
            this.g = ayrmVar;
        }
        return ayrmVar;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.m, bamfVar)) {
            this.m = bamfVar;
            this.c.f(this);
            if (this.j) {
                return;
            }
            int i = this.e;
            if (i == Integer.MAX_VALUE) {
                bamfVar.sp(Long.MAX_VALUE);
            } else {
                bamfVar.sp(i);
            }
        }
    }

    final void g() {
        ayrm ayrmVar = this.g;
        if (ayrmVar != null) {
            ayrmVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        if (getAndIncrement() == 0) {
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        boolean z;
        int i2;
        long j5;
        bame bameVar = this.c;
        int i3 = 1;
        while (!k()) {
            ayrm ayrmVar = this.g;
            long j6 = this.l.get();
            long j7 = -1;
            long j8 = 0;
            if (ayrmVar != null) {
                j = j6;
                j2 = 0;
                while (true) {
                    i = i3;
                    long j9 = 0;
                    Object obj = null;
                    while (true) {
                        if (j == 0) {
                            break;
                        }
                        Object sl = ayrmVar.sl();
                        if (k()) {
                            return;
                        }
                        if (sl == null) {
                            obj = sl;
                            break;
                        }
                        bameVar.c(sl);
                        j2++;
                        j9++;
                        j--;
                        obj = sl;
                    }
                    if (j9 != 0) {
                        j = j6 == Long.MAX_VALUE ? Long.MAX_VALUE : this.l.addAndGet(-j9);
                    }
                    if (j == 0 || obj == null) {
                        break;
                    }
                    i3 = i;
                }
            } else {
                i = i3;
                j = j6;
                j2 = 0;
            }
            boolean z2 = this.h;
            ayrm ayrmVar2 = this.g;
            ayvz[] ayvzVarArr = (ayvz[]) this.k.get();
            int length = ayvzVarArr.length;
            if (z2 && ((ayrmVar2 == null || ayrmVar2.j()) && length == 0)) {
                Throwable d = azom.d(this.i);
                if (d == azom.a) {
                    return;
                }
                if (d == null) {
                    bameVar.sm();
                    return;
                } else {
                    bameVar.b(d);
                    return;
                }
            }
            if (length != 0) {
                long j10 = this.o;
                int i4 = this.p;
                if (length <= i4 || ayvzVarArr[i4].a != j10) {
                    if (length <= i4) {
                        i4 = 0;
                    }
                    for (int i5 = 0; i5 < length && ayvzVarArr[i4].a != j10; i5++) {
                        i4++;
                        if (i4 == length) {
                            i4 = 0;
                        }
                    }
                    this.p = i4;
                    this.o = ayvzVarArr[i4].a;
                }
                int i6 = i4;
                boolean z3 = false;
                int i7 = 0;
                while (i7 < length) {
                    if (k()) {
                        return;
                    }
                    ayvz ayvzVar = ayvzVarArr[i6];
                    Object obj2 = null;
                    while (!k()) {
                        ayrn ayrnVar = ayvzVar.f;
                        if (ayrnVar != null) {
                            long j11 = j8;
                            while (j != j8) {
                                try {
                                    obj2 = ayrnVar.sl();
                                    if (obj2 == null) {
                                        break;
                                    }
                                    bameVar.c(obj2);
                                    if (k()) {
                                        return;
                                    }
                                    j += j7;
                                    j11++;
                                    j7 = -1;
                                } catch (Throwable th) {
                                    bapv.j(th);
                                    azof.f(ayvzVar);
                                    azom.e(this.i, th);
                                    this.m.si();
                                    if (k()) {
                                        return;
                                    }
                                    j(ayvzVar);
                                    i7++;
                                    z3 = true;
                                    i2 = 1;
                                }
                            }
                            long j12 = j11;
                            if (j12 != j8) {
                                long addAndGet = j6 != Long.MAX_VALUE ? this.l.addAndGet(-j12) : Long.MAX_VALUE;
                                ayvzVar.d(j12);
                                j = addAndGet;
                                j5 = 0;
                            } else {
                                j5 = j8;
                            }
                            if (j != j5 && obj2 != null) {
                                j7 = -1;
                                j8 = 0;
                            }
                        }
                        boolean z4 = ayvzVar.e;
                        ayrn ayrnVar2 = ayvzVar.f;
                        if (z4 && (ayrnVar2 == null || ayrnVar2.j())) {
                            j(ayvzVar);
                            if (k()) {
                                return;
                            }
                            j2++;
                            z3 = true;
                        }
                        if (j == 0) {
                            break;
                        }
                        i6++;
                        if (i6 == length) {
                            i6 = 0;
                        }
                        i2 = 1;
                        i7 += i2;
                        j7 = -1;
                        j8 = 0;
                    }
                    return;
                }
                this.p = i6;
                this.o = ayvzVarArr[i6].a;
                z = z3;
                j4 = j2;
                j3 = 0;
            } else {
                j3 = 0;
                j4 = j2;
                z = false;
            }
            if (j4 != j3 && !this.j) {
                this.m.sp(j4);
            }
            if (!z) {
                i3 = addAndGet(-i);
                if (i3 == 0) {
                    return;
                }
            } else {
                i3 = i;
            }
        }
    }

    final void j(ayvz ayvzVar) {
        ayvz[] ayvzVarArr;
        ayvz[] ayvzVarArr2;
        do {
            ayvzVarArr = (ayvz[]) this.k.get();
            int length = ayvzVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (ayvzVarArr[i] == ayvzVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                ayvzVarArr2 = a;
            } else {
                ayvz[] ayvzVarArr3 = new ayvz[length - 1];
                System.arraycopy(ayvzVarArr, 0, ayvzVarArr3, 0, i);
                System.arraycopy(ayvzVarArr, i + 1, ayvzVarArr3, i, (length - i) - 1);
                ayvzVarArr2 = ayvzVarArr3;
            }
        } while (!this.k.compareAndSet(ayvzVarArr, ayvzVarArr2));
    }

    final boolean k() {
        if (this.j) {
            g();
            return true;
        } else if (this.i.get() == null) {
            return false;
        } else {
            g();
            Throwable d = azom.d(this.i);
            if (d != azom.a) {
                this.c.b(d);
            }
            return true;
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        ayrm ayrmVar;
        ayvz[] ayvzVarArr;
        if (!this.j) {
            this.j = true;
            this.m.si();
            ayvz[] ayvzVarArr2 = (ayvz[]) this.k.get();
            ayvz[] ayvzVarArr3 = b;
            if (ayvzVarArr2 != ayvzVarArr3 && (ayvzVarArr = (ayvz[]) this.k.getAndSet(ayvzVarArr3)) != ayvzVarArr3) {
                for (ayvz ayvzVar : ayvzVarArr) {
                    azof.f(ayvzVar);
                }
                Throwable d = azom.d(this.i);
                if (d != null && d != azom.a) {
                    azqc.d(d);
                }
            }
            if (getAndIncrement() != 0 || (ayrmVar = this.g) == null) {
                return;
            }
            ayrmVar.d();
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.h) {
            return;
        }
        this.h = true;
        h();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this.l, j);
            h();
        }
    }
}
