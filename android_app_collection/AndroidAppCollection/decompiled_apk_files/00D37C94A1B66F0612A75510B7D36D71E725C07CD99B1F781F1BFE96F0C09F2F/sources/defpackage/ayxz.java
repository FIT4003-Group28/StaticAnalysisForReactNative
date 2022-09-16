package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayxz  reason: default package */
/* loaded from: classes2.dex */
final class ayxz extends AtomicInteger implements ayoa, bamf {
    private static final long serialVersionUID = 163080509307634843L;
    final bame a;
    bamf b;
    volatile boolean c;
    Throwable d;
    volatile boolean e;
    final AtomicLong f = new AtomicLong();
    final AtomicReference g = new AtomicReference();

    public ayxz(bame bameVar) {
        this.a = bameVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        this.d = th;
        this.c = true;
        d();
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        this.g.lazySet(obj);
        d();
    }

    final void d() {
        boolean z;
        if (getAndIncrement() != 0) {
            return;
        }
        bame bameVar = this.a;
        AtomicLong atomicLong = this.f;
        AtomicReference atomicReference = this.g;
        int i = 1;
        do {
            long j = 0;
            while (true) {
                z = false;
                if (j == atomicLong.get()) {
                    break;
                }
                boolean z2 = this.c;
                Object andSet = atomicReference.getAndSet(null);
                boolean z3 = andSet == null;
                if (g(z2, z3, bameVar, atomicReference)) {
                    return;
                }
                if (z3) {
                    break;
                }
                bameVar.c(andSet);
                j++;
            }
            if (j == atomicLong.get()) {
                boolean z4 = this.c;
                if (atomicReference.get() == null) {
                    z = true;
                }
                if (g(z4, z, bameVar, atomicReference)) {
                    return;
                }
            }
            if (j != 0) {
                ayno.e(atomicLong, j);
            }
            i = addAndGet(-i);
        } while (i != 0);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.b, bamfVar)) {
            this.b = bamfVar;
            this.a.f(this);
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    final boolean g(boolean z, boolean z2, bame bameVar, AtomicReference atomicReference) {
        if (this.e) {
            atomicReference.lazySet(null);
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th = this.d;
            if (th != null) {
                atomicReference.lazySet(null);
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

    @Override // defpackage.bamf
    public final void si() {
        if (!this.e) {
            this.e = true;
            this.b.si();
            if (getAndIncrement() != 0) {
                return;
            }
            this.g.lazySet(null);
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        this.c = true;
        d();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this.f, j);
            d();
        }
    }
}
