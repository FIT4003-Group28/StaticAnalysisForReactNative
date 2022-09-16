package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aywi  reason: default package */
/* loaded from: classes2.dex */
final class aywi extends AtomicReference implements ayot, aypg {
    private static final long serialVersionUID = -502562646270949838L;
    final /* synthetic */ aywj a;

    public aywi(aywj aywjVar) {
        this.a = aywjVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        aywj aywjVar = this.a;
        aywjVar.d.f(this);
        if (azom.e(aywjVar.f, th)) {
            aywjVar.i.si();
            aywjVar.d.qr();
            aywjVar.e.decrementAndGet();
            aywjVar.h();
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
        aywj aywjVar = this.a;
        aywjVar.d.f(this);
        if (aywjVar.get() != 0 || !aywjVar.compareAndSet(0, 1)) {
            azml d = aywjVar.d();
            synchronized (d) {
                d.k(obj);
            }
            aywjVar.e.decrementAndGet();
            if (aywjVar.getAndIncrement() != 0) {
                return;
            }
        } else {
            int decrementAndGet = aywjVar.e.decrementAndGet();
            if (aywjVar.c.get() != 0) {
                aywjVar.a.c(obj);
                azml azmlVar = (azml) aywjVar.h.get();
                if (decrementAndGet != 0 || (azmlVar != null && !azmlVar.j())) {
                    ayno.e(aywjVar.c, 1L);
                    if (aywjVar.b != Integer.MAX_VALUE) {
                        aywjVar.i.sp(1L);
                    }
                } else {
                    Throwable d2 = azom.d(aywjVar.f);
                    if (d2 != null) {
                        aywjVar.a.b(d2);
                        return;
                    } else {
                        aywjVar.a.sm();
                        return;
                    }
                }
            } else {
                azml d3 = aywjVar.d();
                synchronized (d3) {
                    d3.k(obj);
                }
            }
            if (aywjVar.decrementAndGet() == 0) {
                return;
            }
        }
        aywjVar.i();
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }
}
