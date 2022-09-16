package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azpz  reason: default package */
/* loaded from: classes2.dex */
public final class azpz extends azpx {
    final azml a;
    final AtomicReference b;
    final AtomicReference c;
    volatile boolean d;
    volatile boolean e;
    Throwable f;
    final AtomicBoolean g;
    final ayrp h;
    boolean i;

    public azpz(int i, Runnable runnable) {
        ayrd.c(i, "capacityHint");
        this.a = new azml(i);
        this.c = new AtomicReference(runnable);
        this.b = new AtomicReference();
        this.g = new AtomicBoolean();
        this.h = new azpy(this);
    }

    final void aI() {
        if (this.h.getAndIncrement() != 0) {
            return;
        }
        ayom ayomVar = (ayom) this.b.get();
        int i = 1;
        int i2 = 1;
        while (ayomVar == null) {
            i2 = this.h.addAndGet(-i2);
            if (i2 == 0) {
                return;
            }
            ayomVar = (ayom) this.b.get();
        }
        if (!this.i) {
            azml azmlVar = this.a;
            while (!this.d) {
                boolean z = this.e;
                Object sl = this.a.sl();
                if (z) {
                    if (sl == null) {
                        aJ(ayomVar);
                        return;
                    }
                } else if (sl == null) {
                    i = this.h.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                ayomVar.c(sl);
            }
            this.b.lazySet(null);
            azmlVar.d();
            return;
        }
        azml azmlVar2 = this.a;
        while (!this.d) {
            boolean z2 = this.e;
            ayomVar.c(null);
            if (!z2) {
                i = this.h.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                aJ(ayomVar);
                return;
            }
        }
        this.b.lazySet(null);
        azmlVar2.d();
    }

    final void aJ(ayom ayomVar) {
        this.b.lazySet(null);
        Throwable th = this.f;
        if (th != null) {
            ayomVar.b(th);
        } else {
            ayomVar.sm();
        }
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        ayrd.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.e || this.d) {
            azqc.d(th);
            return;
        }
        this.f = th;
        this.e = true;
        e();
        aI();
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        ayrd.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.e || this.d) {
            return;
        }
        this.a.k(obj);
        aI();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        Runnable runnable = (Runnable) this.c.get();
        if (runnable == null || !this.c.compareAndSet(runnable, null)) {
            return;
        }
        runnable.run();
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        if (this.g.get() || !this.g.compareAndSet(false, true)) {
            ayqj.h(new IllegalStateException("Only a single observer allowed."), ayomVar);
            return;
        }
        ayomVar.sj(this.h);
        this.b.lazySet(ayomVar);
        if (this.d) {
            this.b.lazySet(null);
        } else {
            aI();
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (this.e || this.d) {
            aypgVar.qr();
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.e || this.d) {
            return;
        }
        this.e = true;
        e();
        aI();
    }
}
