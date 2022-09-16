package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azlr  reason: default package */
/* loaded from: classes2.dex */
final class azlr extends AtomicReference implements Runnable, ayot, aypg {
    private static final long serialVersionUID = 3528003840217436037L;
    final ayot a;
    final ayor b;
    Object c;
    Throwable d;

    public azlr(ayot ayotVar, ayor ayorVar) {
        this.a = ayotVar;
        this.b = ayorVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.d = th;
        ayqi.i(this, this.b.f(this));
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.d;
        if (th != null) {
            this.a.b(th);
        } else {
            this.a.sh(this.c);
        }
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        this.c = obj;
        ayqi.i(this, this.b.f(this));
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.g(this, aypgVar)) {
            this.a.sj(this);
        }
    }
}
