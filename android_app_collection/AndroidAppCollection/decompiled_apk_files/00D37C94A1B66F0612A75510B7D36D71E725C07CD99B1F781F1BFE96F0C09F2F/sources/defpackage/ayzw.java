package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayzw  reason: default package */
/* loaded from: classes2.dex */
final class ayzw extends AtomicInteger implements Runnable, ayoa, bamf {
    private static final long serialVersionUID = -8296689127439125014L;
    final bame a;
    final TimeUnit c;
    final ayoq d;
    bamf h;
    volatile boolean i;
    Throwable j;
    volatile boolean k;
    volatile boolean l;
    long m;
    boolean n;
    final long b = 500;
    final boolean e = true;
    final AtomicReference f = new AtomicReference();
    final AtomicLong g = new AtomicLong();

    public ayzw(bame bameVar, TimeUnit timeUnit, ayoq ayoqVar) {
        this.a = bameVar;
        this.c = timeUnit;
        this.d = ayoqVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        this.j = th;
        this.i = true;
        d();
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        this.f.set(obj);
        d();
    }

    final void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.f;
        AtomicLong atomicLong = this.g;
        bame bameVar = this.a;
        int i = 1;
        while (!this.k) {
            boolean z = this.i;
            if (!z || this.j == null) {
                Object obj = atomicReference.get();
                if (z) {
                    if (obj == null || !this.e) {
                        atomicReference.lazySet(null);
                        bameVar.sm();
                    } else {
                        Object andSet = atomicReference.getAndSet(null);
                        long j = this.m;
                        if (j != atomicLong.get()) {
                            this.m = j + 1;
                            bameVar.c(andSet);
                            bameVar.sm();
                        } else {
                            bameVar.b(new aypp("Could not emit final value due to lack of requests"));
                        }
                    }
                    this.d.qr();
                    return;
                }
                if (obj != null) {
                    if (!this.n || this.l) {
                        Object andSet2 = atomicReference.getAndSet(null);
                        long j2 = this.m;
                        if (j2 != atomicLong.get()) {
                            bameVar.c(andSet2);
                            this.m = j2 + 1;
                            this.l = false;
                            this.n = true;
                            this.d.c(this, this.b, this.c);
                        } else {
                            this.h.si();
                            bameVar.b(new aypp("Could not emit value due to lack of requests"));
                            this.d.qr();
                            return;
                        }
                    }
                } else if (this.l) {
                    this.n = false;
                    this.l = false;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                atomicReference.lazySet(null);
                bameVar.b(this.j);
                this.d.qr();
                return;
            }
        }
        atomicReference.lazySet(null);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.h, bamfVar)) {
            this.h = bamfVar;
            this.a.f(this);
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.l = true;
        d();
    }

    @Override // defpackage.bamf
    public final void si() {
        this.k = true;
        this.h.si();
        this.d.qr();
        if (getAndIncrement() == 0) {
            this.f.lazySet(null);
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        this.i = true;
        d();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this.g, j);
        }
    }
}
