package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aytc  reason: default package */
/* loaded from: classes2.dex */
final class aytc extends AtomicReference implements ayns, aypg {
    private static final long serialVersionUID = 251330541679988317L;
    final /* synthetic */ aytd a;

    public aytc(aytd aytdVar) {
        this.a = aytdVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        aytd aytdVar = this.a;
        aytdVar.e.f(this);
        if (!aytdVar.c) {
            aytdVar.f.si();
            aytdVar.e.qr();
            if (azom.e(aytdVar.d, th)) {
                if (aytdVar.getAndSet(0) <= 0) {
                    return;
                }
                aytdVar.a.b(azom.d(aytdVar.d));
                return;
            }
            azqc.d(th);
        } else if (azom.e(aytdVar.d, th)) {
            if (aytdVar.decrementAndGet() == 0) {
                aytdVar.a.b(azom.d(aytdVar.d));
            } else if (aytdVar.b == Integer.MAX_VALUE) {
            } else {
                aytdVar.f.sp(1L);
            }
        } else {
            azqc.d(th);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        aytd aytdVar = this.a;
        aytdVar.e.f(this);
        if (aytdVar.decrementAndGet() != 0) {
            if (aytdVar.b == Integer.MAX_VALUE) {
                return;
            }
            aytdVar.f.sp(1L);
            return;
        }
        Throwable th = (Throwable) aytdVar.d.get();
        if (th != null) {
            aytdVar.a.b(th);
        } else {
            aytdVar.a.sm();
        }
    }
}
