package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azjp  reason: default package */
/* loaded from: classes2.dex */
final class azjp extends AtomicInteger implements Runnable, ayom, aypg {
    static final Object a = new Object();
    private static final long serialVersionUID = 2233020065421370272L;
    final ayom b;
    final int c;
    final azjo d = new azjo(this);
    final AtomicReference e = new AtomicReference();
    final AtomicInteger f = new AtomicInteger(1);
    final azmj g = new azmj();
    final azoj h = new azoj();
    final AtomicBoolean i = new AtomicBoolean();
    volatile boolean j;
    azpz k;

    public azjp(ayom ayomVar, int i) {
        this.b = ayomVar;
        this.c = i;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.d.qr();
        if (azom.e(this.h, th)) {
            this.j = true;
            f();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.g.k(obj);
        f();
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.i.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (getAndIncrement() != 0) {
            return;
        }
        ayom ayomVar = this.b;
        azmj azmjVar = this.g;
        azoj azojVar = this.h;
        int i = 1;
        while (this.f.get() != 0) {
            azpz azpzVar = this.k;
            boolean z = this.j;
            if (!z || azojVar.get() == null) {
                Object sl = azmjVar.sl();
                if (z) {
                    if (sl == null) {
                        Throwable d = azom.d(azojVar);
                        if (d == null) {
                            if (azpzVar != null) {
                                this.k = null;
                                azpzVar.sm();
                            }
                            ayomVar.sm();
                            return;
                        }
                        if (azpzVar != null) {
                            this.k = null;
                            azpzVar.b(d);
                        }
                        ayomVar.b(d);
                        return;
                    }
                } else if (sl == null) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                if (sl != a) {
                    azpzVar.c(sl);
                } else {
                    if (azpzVar != null) {
                        this.k = null;
                        azpzVar.sm();
                    }
                    if (!this.i.get()) {
                        azpz azpzVar2 = new azpz(this.c, this);
                        this.k = azpzVar2;
                        this.f.getAndIncrement();
                        ayomVar.c(azpzVar2);
                    }
                }
            } else {
                azmjVar.d();
                Throwable d2 = azom.d(azojVar);
                if (azpzVar != null) {
                    this.k = null;
                    azpzVar.b(d2);
                }
                ayomVar.b(d2);
                return;
            }
        }
        azmjVar.d();
        this.k = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.g.k(a);
        f();
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (this.i.compareAndSet(false, true)) {
            this.d.qr();
            if (this.f.decrementAndGet() != 0) {
                return;
            }
            ayqi.c(this.e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f.decrementAndGet() == 0) {
            ayqi.c(this.e);
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.g(this.e, aypgVar)) {
            g();
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.d.qr();
        this.j = true;
        f();
    }
}
