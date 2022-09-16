package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aysp  reason: default package */
/* loaded from: classes2.dex */
final class aysp extends AtomicReference implements Runnable, ayns, aypg {
    private static final long serialVersionUID = 465972761105851022L;
    final ayns a;
    final long b;
    final TimeUnit c;
    final ayor d;
    Throwable e;

    public aysp(ayns aynsVar, long j, TimeUnit timeUnit, ayor ayorVar) {
        this.a = aynsVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayorVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.e = th;
        ayqi.i(this, this.d.c(this, 0L, this.c));
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
        Throwable th = this.e;
        this.e = null;
        if (th != null) {
            this.a.b(th);
        } else {
            this.a.sm();
        }
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.g(this, aypgVar)) {
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        ayqi.i(this, this.d.c(this, this.b, this.c));
    }
}
