package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayti  reason: default package */
/* loaded from: classes2.dex */
final class ayti extends AtomicReference implements Runnable, ayns, aypg {
    private static final long serialVersionUID = 8571289934935992137L;
    final ayns a;
    final ayor b;
    Throwable c;

    public ayti(ayns aynsVar, ayor ayorVar) {
        this.a = aynsVar;
        this.b = ayorVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.c = th;
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
        Throwable th = this.c;
        if (th != null) {
            this.c = null;
            this.a.b(th);
            return;
        }
        this.a.sm();
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.g(this, aypgVar)) {
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        ayqi.i(this, this.b.f(this));
    }
}
