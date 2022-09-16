package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ayuw  reason: default package */
/* loaded from: classes2.dex */
public final class ayuw extends AtomicInteger implements ayny {
    private static final long serialVersionUID = 4883307006032401862L;
    public final ayup a;
    final azoj b = new azoj();
    final ayrm c = new azml(16);
    public volatile boolean d;

    public ayuw(ayup ayupVar) {
        this.a = ayupVar;
    }

    @Override // defpackage.aynw
    public final void a(Object obj) {
        if (this.a.l() || this.d) {
            return;
        }
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (so(nullPointerException)) {
                return;
            }
            azqc.d(nullPointerException);
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            this.a.a(obj);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            ayrm ayrmVar = this.c;
            synchronized (ayrmVar) {
                ayrmVar.k(obj);
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        g();
    }

    @Override // defpackage.ayny
    public final ayny b() {
        throw null;
    }

    @Override // defpackage.ayny
    public final void c(ayqa ayqaVar) {
        throw null;
    }

    @Override // defpackage.ayny
    public final void d(aypg aypgVar) {
        throw null;
    }

    public final void f() {
        if (getAndIncrement() == 0) {
            g();
        }
    }

    final void g() {
        ayup ayupVar = this.a;
        ayrm ayrmVar = this.c;
        azoj azojVar = this.b;
        int i = 1;
        while (!ayupVar.l()) {
            if (azojVar.get() == null) {
                boolean z = this.d;
                Object sl = ayrmVar.sl();
                if (z) {
                    if (sl == null) {
                        ayupVar.g();
                        return;
                    }
                } else if (sl == null) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                ayupVar.a(sl);
            } else {
                ayrmVar.d();
                ayupVar.h(azom.d(azojVar));
                return;
            }
        }
        ayrmVar.d();
    }

    @Override // defpackage.ayny
    public final boolean so(Throwable th) {
        if (this.a.l() || this.d || !azom.e(this.b, th)) {
            return false;
        }
        this.d = true;
        f();
        return true;
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return this.a.toString();
    }
}
