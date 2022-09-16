package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ayuq  reason: default package */
/* loaded from: classes2.dex */
final class ayuq extends ayup {
    private static final long serialVersionUID = 2427151001689639875L;
    final azml c;
    Throwable d;
    volatile boolean e;
    final AtomicInteger f;

    public ayuq(bame bameVar, int i) {
        super(bameVar);
        this.c = new azml(i);
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
        this.c.k(obj);
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
            this.c.d();
        }
    }

    final void m() {
        if (this.f.getAndIncrement() != 0) {
            return;
        }
        bame bameVar = this.a;
        azml azmlVar = this.c;
        int i = 1;
        do {
            long j = get();
            long j2 = 0;
            while (j2 != j) {
                if (!l()) {
                    boolean z = this.e;
                    Object sl = azmlVar.sl();
                    if (z) {
                        if (sl == null) {
                            Throwable th = this.d;
                            if (th != null) {
                                k(th);
                                return;
                            } else {
                                f();
                                return;
                            }
                        }
                    } else if (sl == null) {
                        break;
                    }
                    bameVar.c(sl);
                    j2++;
                } else {
                    azmlVar.d();
                    return;
                }
            }
            if (j2 == j) {
                if (!l()) {
                    boolean z2 = this.e;
                    boolean j3 = azmlVar.j();
                    if (z2 && j3) {
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
                    azmlVar.d();
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
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        this.d = th;
        this.e = true;
        m();
        return true;
    }
}
