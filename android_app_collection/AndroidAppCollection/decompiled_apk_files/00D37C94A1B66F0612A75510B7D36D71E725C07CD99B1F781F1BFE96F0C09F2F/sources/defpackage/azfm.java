package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azfm  reason: default package */
/* loaded from: classes2.dex */
public final class azfm extends AtomicInteger implements aypg, ayom {
    static final azfl[] a = new azfl[0];
    static final azfl[] b = new azfl[0];
    private static final long serialVersionUID = -2117620485640801370L;
    final ayom c;
    final ayqe d;
    final int f;
    final int g;
    volatile ayrm h;
    volatile boolean i;
    volatile boolean k;
    final AtomicReference l;
    aypg m;
    long n;
    long o;
    int p;
    Queue q;
    int r;
    final azoj j = new azoj();
    final boolean e = false;

    public azfm(ayom ayomVar, ayqe ayqeVar, int i, int i2) {
        this.c = ayomVar;
        this.d = ayqeVar;
        this.f = i;
        this.g = i2;
        if (i != Integer.MAX_VALUE) {
            this.q = new ArrayDeque(i);
        }
        this.l = new AtomicReference(a);
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.i) {
            azqc.d(th);
        } else if (azom.e(this.j, th)) {
            this.i = true;
            f();
        } else {
            azqc.d(th);
        }
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.i) {
            return;
        }
        try {
            ayok ayokVar = (ayok) this.d.a(obj);
            ayrd.b(ayokVar, "The mapper returned a null ObservableSource");
            if (this.f != Integer.MAX_VALUE) {
                synchronized (this) {
                    int i = this.r;
                    if (i == this.f) {
                        this.q.offer(ayokVar);
                        return;
                    }
                    this.r = i + 1;
                }
            }
            i(ayokVar);
        } catch (Throwable th) {
            bapv.j(th);
            this.m.qr();
            b(th);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (getAndIncrement() == 0) {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0003, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azfm.g():void");
    }

    final void h(azfl azflVar) {
        azfl[] azflVarArr;
        azfl[] azflVarArr2;
        do {
            azflVarArr = (azfl[]) this.l.get();
            int length = azflVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azflVarArr[i] == azflVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azflVarArr2 = a;
            } else {
                azfl[] azflVarArr3 = new azfl[length - 1];
                System.arraycopy(azflVarArr, 0, azflVarArr3, 0, i);
                System.arraycopy(azflVarArr, i + 1, azflVarArr3, i, (length - i) - 1);
                azflVarArr2 = azflVarArr3;
            }
        } while (!this.l.compareAndSet(azflVarArr, azflVarArr2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (decrementAndGet() != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void i(defpackage.ayok r7) {
        /*
            r6 = this;
        L0:
            boolean r0 = r7 instanceof java.util.concurrent.Callable
            r1 = 0
            if (r0 == 0) goto L8d
            java.util.concurrent.Callable r7 = (java.util.concurrent.Callable) r7
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = 1
            java.lang.Object r7 = r7.call()     // Catch: java.lang.Throwable -> L5e
            if (r7 != 0) goto L12
            goto L6a
        L12:
            int r3 = r6.get()
            if (r3 != 0) goto L2a
            boolean r3 = r6.compareAndSet(r1, r2)
            if (r3 == 0) goto L2a
            ayom r3 = r6.c
            r3.c(r7)
            int r7 = r6.decrementAndGet()
            if (r7 == 0) goto L6a
            goto L5a
        L2a:
            ayrm r3 = r6.h
            if (r3 != 0) goto L42
            int r3 = r6.f
            if (r3 != r0) goto L3a
            azml r3 = new azml
            int r4 = r6.g
            r3.<init>(r4)
            goto L40
        L3a:
            azmk r4 = new azmk
            r4.<init>(r3)
            r3 = r4
        L40:
            r6.h = r3
        L42:
            boolean r7 = r3.k(r7)
            if (r7 != 0) goto L53
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r3 = "Scalar queue full?!"
            r7.<init>(r3)
            r6.b(r7)
            goto L6a
        L53:
            int r7 = r6.getAndIncrement()
            if (r7 == 0) goto L5a
            goto L8c
        L5a:
            r6.g()
            goto L6a
        L5e:
            r7 = move-exception
            defpackage.bapv.j(r7)
            azoj r3 = r6.j
            defpackage.azom.e(r3, r7)
            r6.f()
        L6a:
            int r7 = r6.f
            if (r7 == r0) goto L8c
            monitor-enter(r6)
            java.util.Queue r7 = r6.q     // Catch: java.lang.Throwable -> L89
            java.lang.Object r7 = r7.poll()     // Catch: java.lang.Throwable -> L89
            ayok r7 = (defpackage.ayok) r7     // Catch: java.lang.Throwable -> L89
            if (r7 != 0) goto L80
            int r0 = r6.r     // Catch: java.lang.Throwable -> L89
            int r0 = r0 + (-1)
            r6.r = r0     // Catch: java.lang.Throwable -> L89
            r1 = 1
        L80:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L89
            if (r1 != 0) goto L85
            goto L0
        L85:
            r6.f()
            return
        L89:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L89
            throw r7
        L8c:
            return
        L8d:
            azfl r0 = new azfl
            long r2 = r6.n
            r4 = 1
            long r4 = r4 + r2
            r6.n = r4
            r0.<init>(r6, r2)
        L99:
            java.util.concurrent.atomic.AtomicReference r2 = r6.l
            java.lang.Object r2 = r2.get()
            azfl[] r2 = (defpackage.azfl[]) r2
            azfl[] r3 = defpackage.azfm.b
            if (r2 != r3) goto La9
            defpackage.ayqi.c(r0)
            return
        La9:
            int r3 = r2.length
            int r4 = r3 + 1
            azfl[] r4 = new defpackage.azfl[r4]
            java.lang.System.arraycopy(r2, r1, r4, r1, r3)
            r4[r3] = r0
            java.util.concurrent.atomic.AtomicReference r3 = r6.l
            boolean r2 = r3.compareAndSet(r2, r4)
            if (r2 == 0) goto L99
            r7.az(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azfm.i(ayok):void");
    }

    final boolean j() {
        if (this.k) {
            return true;
        }
        if (((Throwable) this.j.get()) == null) {
            return false;
        }
        k();
        Throwable d = azom.d(this.j);
        if (d != azom.a) {
            this.c.b(d);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        azfl[] azflVarArr;
        this.m.qr();
        azfl[] azflVarArr2 = (azfl[]) this.l.get();
        azfl[] azflVarArr3 = b;
        if (azflVarArr2 == azflVarArr3 || (azflVarArr = (azfl[]) this.l.getAndSet(azflVarArr3)) == azflVarArr3) {
            return false;
        }
        for (azfl azflVar : azflVarArr) {
            ayqi.c(azflVar);
        }
        return true;
    }

    @Override // defpackage.aypg
    public final void qr() {
        Throwable d;
        if (!this.k) {
            this.k = true;
            if (!k() || (d = azom.d(this.j)) == null || d == azom.a) {
                return;
            }
            azqc.d(d);
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.m, aypgVar)) {
            this.m = aypgVar;
            this.c.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.i) {
            return;
        }
        this.i = true;
        f();
    }
}
