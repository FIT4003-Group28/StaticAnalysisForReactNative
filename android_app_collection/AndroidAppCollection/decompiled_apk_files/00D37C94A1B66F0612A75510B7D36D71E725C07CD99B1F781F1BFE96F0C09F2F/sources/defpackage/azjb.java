package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azjb  reason: default package */
/* loaded from: classes2.dex */
final class azjb extends AtomicInteger implements Runnable, ayom, aypg {
    private static final long serialVersionUID = -8296689127439125014L;
    final ayom a;
    final TimeUnit c;
    final ayoq d;
    aypg g;
    volatile boolean h;
    Throwable i;
    volatile boolean j;
    volatile boolean k;
    boolean l;
    final long b = 500;
    final boolean e = true;
    final AtomicReference f = new AtomicReference();

    public azjb(ayom ayomVar, TimeUnit timeUnit, ayoq ayoqVar) {
        this.a = ayomVar;
        this.c = timeUnit;
        this.d = ayoqVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.i = th;
        this.h = true;
        f();
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.f.set(obj);
        f();
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.j;
    }

    final void f() {
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.f;
        ayom ayomVar = this.a;
        int i = 1;
        while (!this.j) {
            boolean z = this.h;
            if (!z || this.i == null) {
                Object obj = atomicReference.get();
                if (z) {
                    Object andSet = atomicReference.getAndSet(null);
                    if (obj != null && this.e) {
                        ayomVar.c(andSet);
                    }
                    ayomVar.sm();
                    this.d.qr();
                    return;
                }
                if (obj == null) {
                    if (this.k) {
                        this.l = false;
                        this.k = false;
                    }
                } else if (!this.l || this.k) {
                    ayomVar.c(atomicReference.getAndSet(null));
                    this.k = false;
                    this.l = true;
                    this.d.c(this, this.b, this.c);
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                atomicReference.lazySet(null);
                ayomVar.b(this.i);
                this.d.qr();
                return;
            }
        }
        atomicReference.lazySet(null);
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.j = true;
        this.g.qr();
        this.d.qr();
        if (getAndIncrement() == 0) {
            this.f.lazySet(null);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.k = true;
        f();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.g, aypgVar)) {
            this.g = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.h = true;
        f();
    }
}
