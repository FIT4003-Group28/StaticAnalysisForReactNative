package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayut  reason: default package */
/* loaded from: classes2.dex */
final class ayut extends ayup {
    private static final long serialVersionUID = 4023437720691792495L;
    final AtomicReference c;
    Throwable d;
    volatile boolean e;
    final AtomicInteger f;

    public ayut(bame bameVar) {
        super(bameVar);
        this.c = new AtomicReference();
        this.f = new AtomicInteger();
    }

    @Override // defpackage.aynw
    public final void a(Object obj) {
        if (this.e || l()) {
            return;
        }
        if (obj == null) {
            h(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        this.c.set(obj);
        m();
    }

    @Override // defpackage.ayup
    public final void g() {
        this.e = true;
        m();
    }

    @Override // defpackage.ayup
    public final void i() {
        m();
    }

    @Override // defpackage.ayup
    public final void j() {
        if (this.f.getAndIncrement() == 0) {
            this.c.lazySet(null);
        }
    }

    final void m() {
        if (this.f.getAndIncrement() != 0) {
            return;
        }
        bame bameVar = this.a;
        AtomicReference atomicReference = this.c;
        int i = 1;
        do {
            long j = get();
            long j2 = 0;
            while (j2 != j) {
                if (!l()) {
                    boolean z = this.e;
                    Object andSet = atomicReference.getAndSet(null);
                    if (z) {
                        if (andSet == null) {
                            Throwable th = this.d;
                            if (th != null) {
                                k(th);
                                return;
                            } else {
                                f();
                                return;
                            }
                        }
                    } else if (andSet == null) {
                        break;
                    }
                    bameVar.c(andSet);
                    j2++;
                } else {
                    atomicReference.lazySet(null);
                    return;
                }
            }
            if (j2 == j) {
                if (!l()) {
                    boolean z2 = this.e;
                    Object obj = atomicReference.get();
                    if (z2 && obj == null) {
                        Throwable th2 = this.d;
                        if (th2 != null) {
                            k(th2);
                            return;
                        } else {
                            f();
                            return;
                        }
                    }
                } else {
                    atomicReference.lazySet(null);
                    return;
                }
            }
            if (j2 != 0) {
                ayno.e(this, j2);
            }
            i = this.f.addAndGet(-i);
        } while (i != 0);
    }

    @Override // defpackage.ayup, defpackage.ayny
    public final boolean so(Throwable th) {
        if (this.e || l()) {
            return false;
        }
        if (th == null) {
            h(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
        }
        this.d = th;
        this.e = true;
        m();
        return true;
    }
}
