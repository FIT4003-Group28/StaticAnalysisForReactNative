package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azbw  reason: default package */
/* loaded from: classes2.dex */
final class azbw extends AtomicReference implements Runnable, ayod, aypg {
    private static final long serialVersionUID = 8571289934935992137L;
    final ayod a;
    final ayor b;
    Object c;
    Throwable d;

    public azbw(ayod ayodVar, ayor ayorVar) {
        this.a = ayodVar;
        this.b = ayorVar;
    }

    @Override // defpackage.ayod
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
            this.d = null;
            this.a.b(th);
            return;
        }
        Object obj = this.c;
        if (obj != null) {
            this.c = null;
            this.a.sh(obj);
            return;
        }
        this.a.sm();
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        this.c = obj;
        ayqi.i(this, this.b.f(this));
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.g(this, aypgVar)) {
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayod
    public final void sm() {
        ayqi.i(this, this.b.f(this));
    }
}
