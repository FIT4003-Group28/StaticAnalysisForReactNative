package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzcj  reason: default package */
/* loaded from: classes6.dex */
final class dzcj extends AtomicReference<dzak> implements Runnable, dyzq, dzak {
    private static final long serialVersionUID = 8571289934935992137L;
    final dyzq a;
    final dyzz b;
    Throwable c;

    public dzcj(dyzq dyzqVar, dyzz dyzzVar) {
        this.a = dyzqVar;
        this.b = dyzzVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        dzbd.e(this);
    }

    @Override // defpackage.dyzq
    public final void a(dzak dzakVar) {
        if (dzbd.b(this, dzakVar)) {
            this.a.a(this);
        }
    }

    @Override // defpackage.dyzq
    public final void b() {
        dzbd.f(this, this.b.b(this));
    }

    @Override // defpackage.dyzq
    public final void c(Throwable th) {
        this.c = th;
        dzbd.f(this, this.b.b(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.c;
        if (th != null) {
            this.c = null;
            this.a.c(th);
            return;
        }
        this.a.b();
    }
}
