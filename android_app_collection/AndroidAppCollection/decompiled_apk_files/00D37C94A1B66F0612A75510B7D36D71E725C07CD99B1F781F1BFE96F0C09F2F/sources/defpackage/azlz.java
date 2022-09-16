package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azlz  reason: default package */
/* loaded from: classes2.dex */
final class azlz extends AtomicReference implements Runnable, ayot, aypg {
    private static final long serialVersionUID = 37497744973048446L;
    final ayot a;
    final AtomicReference b = new AtomicReference();
    final long c;
    final TimeUnit d;

    public azlz(ayot ayotVar, long j, TimeUnit timeUnit) {
        this.a = ayotVar;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        aypg aypgVar = (aypg) get();
        if (aypgVar == ayqi.a || !compareAndSet(aypgVar, ayqi.a)) {
            azqc.d(th);
            return;
        }
        ayqi.c(this.b);
        this.a.b(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
        ayqi.c(this.b);
    }

    @Override // java.lang.Runnable
    public final void run() {
        aypg aypgVar = (aypg) get();
        if (aypgVar == ayqi.a || !compareAndSet(aypgVar, ayqi.a)) {
            return;
        }
        if (aypgVar != null) {
            aypgVar.qr();
        }
        this.a.b(new TimeoutException(azom.c(this.c, this.d)));
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        aypg aypgVar = (aypg) get();
        if (aypgVar == ayqi.a || !compareAndSet(aypgVar, ayqi.a)) {
            return;
        }
        ayqi.c(this.b);
        this.a.sh(obj);
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }
}
