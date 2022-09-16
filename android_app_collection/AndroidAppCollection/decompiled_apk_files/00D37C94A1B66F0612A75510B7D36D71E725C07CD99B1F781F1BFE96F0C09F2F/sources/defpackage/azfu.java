package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azfu  reason: default package */
/* loaded from: classes2.dex */
final class azfu extends AtomicReference implements ayod, aypg {
    private static final long serialVersionUID = -502562646270949838L;
    final /* synthetic */ azfv a;

    public azfu(azfv azfvVar) {
        this.a = azfvVar;
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        azfv azfvVar = this.a;
        azfvVar.b.f(this);
        if (azom.e(azfvVar.d, th)) {
            azfvVar.g.qr();
            azfvVar.b.qr();
            azfvVar.c.decrementAndGet();
            azfvVar.g();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        azml azmlVar;
        azfv azfvVar = this.a;
        azfvVar.b.f(this);
        if (azfvVar.get() != 0 || !azfvVar.compareAndSet(0, 1)) {
            do {
                azmlVar = (azml) azfvVar.f.get();
                if (azmlVar != null) {
                    break;
                }
                azmlVar = new azml(aynx.a);
            } while (!azfvVar.f.compareAndSet(null, azmlVar));
            synchronized (azmlVar) {
                azmlVar.k(obj);
            }
            azfvVar.c.decrementAndGet();
            if (azfvVar.getAndIncrement() != 0) {
                return;
            }
        } else {
            azfvVar.a.c(obj);
            int decrementAndGet = azfvVar.c.decrementAndGet();
            azml azmlVar2 = (azml) azfvVar.f.get();
            if (decrementAndGet != 0 || (azmlVar2 != null && !azmlVar2.j())) {
                if (azfvVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                Throwable d = azom.d(azfvVar.d);
                if (d != null) {
                    azfvVar.a.b(d);
                    return;
                } else {
                    azfvVar.a.sm();
                    return;
                }
            }
        }
        azfvVar.h();
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayod
    public final void sm() {
        azfv azfvVar = this.a;
        azfvVar.b.f(this);
        if (azfvVar.get() != 0 || !azfvVar.compareAndSet(0, 1)) {
            azfvVar.c.decrementAndGet();
            azfvVar.g();
            return;
        }
        int decrementAndGet = azfvVar.c.decrementAndGet();
        azml azmlVar = (azml) azfvVar.f.get();
        if (decrementAndGet != 0 || (azmlVar != null && !azmlVar.j())) {
            if (azfvVar.decrementAndGet() == 0) {
                return;
            }
            azfvVar.h();
            return;
        }
        Throwable d = azom.d(azfvVar.d);
        if (d != null) {
            azfvVar.a.b(d);
        } else {
            azfvVar.a.sm();
        }
    }
}
