package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azdj  reason: default package */
/* loaded from: classes2.dex */
final class azdj extends AtomicReference implements ayns {
    private static final long serialVersionUID = -8003404460084760287L;
    final azdk a;

    public azdj(azdk azdkVar) {
        this.a = azdkVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        azdk azdkVar = this.a;
        if (!azdkVar.e.compareAndSet(this, null) || !azom.e(azdkVar.d, th)) {
            azqc.d(th);
            return;
        }
        azdkVar.qr();
        Throwable d = azom.d(azdkVar.d);
        if (d == azom.a) {
            return;
        }
        azdkVar.b.b(d);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        azdk azdkVar = this.a;
        if (!azdkVar.e.compareAndSet(this, null) || !azdkVar.f) {
            return;
        }
        Throwable d = azom.d(azdkVar.d);
        if (d == null) {
            azdkVar.b.sm();
        } else {
            azdkVar.b.b(d);
        }
    }
}
