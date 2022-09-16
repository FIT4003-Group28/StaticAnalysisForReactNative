package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aysf  reason: default package */
/* loaded from: classes2.dex */
final class aysf extends AtomicReference implements ayns, aypg {
    private static final long serialVersionUID = -4101678820158072998L;
    final ayns a;
    final aynu b;

    public aysf(ayns aynsVar, aynu aynuVar) {
        this.a = aynsVar;
        this.b = aynuVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.a.b(th);
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
        if (ayqi.g(this, aypgVar)) {
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        this.b.U(new ayse(this, this.a));
    }
}
