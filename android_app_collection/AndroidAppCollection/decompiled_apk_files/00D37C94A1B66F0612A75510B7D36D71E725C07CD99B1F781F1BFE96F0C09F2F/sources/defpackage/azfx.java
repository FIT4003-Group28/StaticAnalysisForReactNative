package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azfx  reason: default package */
/* loaded from: classes2.dex */
final class azfx extends AtomicReference implements ayot, aypg {
    private static final long serialVersionUID = -502562646270949838L;
    final /* synthetic */ azfy a;

    public azfx(azfy azfyVar) {
        this.a = azfyVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        azfy azfyVar = this.a;
        azfyVar.b.f(this);
        if (azom.e(azfyVar.d, th)) {
            azfyVar.g.qr();
            azfyVar.b.qr();
            azfyVar.c.decrementAndGet();
            azfyVar.g();
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

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        azml azmlVar;
        azfy azfyVar = this.a;
        azfyVar.b.f(this);
        if (azfyVar.get() != 0 || !azfyVar.compareAndSet(0, 1)) {
            do {
                azmlVar = (azml) azfyVar.f.get();
                if (azmlVar != null) {
                    break;
                }
                azmlVar = new azml(aynx.a);
            } while (!azfyVar.f.compareAndSet(null, azmlVar));
            synchronized (azmlVar) {
                azmlVar.k(obj);
            }
            azfyVar.c.decrementAndGet();
            if (azfyVar.getAndIncrement() != 0) {
                return;
            }
        } else {
            azfyVar.a.c(obj);
            int decrementAndGet = azfyVar.c.decrementAndGet();
            azml azmlVar2 = (azml) azfyVar.f.get();
            if (decrementAndGet != 0 || (azmlVar2 != null && !azmlVar2.j())) {
                if (azfyVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                Throwable d = azom.d(azfyVar.d);
                if (d != null) {
                    azfyVar.a.b(d);
                    return;
                } else {
                    azfyVar.a.sm();
                    return;
                }
            }
        }
        azfyVar.h();
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }
}
