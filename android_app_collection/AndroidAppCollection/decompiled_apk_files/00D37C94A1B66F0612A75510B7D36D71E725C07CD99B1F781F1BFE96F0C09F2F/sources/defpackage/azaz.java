package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azaz  reason: default package */
/* loaded from: classes2.dex */
final class azaz extends AtomicReference implements ayod, ayns, aypg {
    private static final long serialVersionUID = -2177128922851101253L;
    final ayns a;
    final ayqe b;

    public azaz(ayns aynsVar, ayqe ayqeVar) {
        this.a = aynsVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayod
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

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        try {
            aynu aynuVar = (aynu) this.b.a(obj);
            ayrd.b(aynuVar, "The mapper returned a null CompletableSource");
            if (e()) {
                return;
            }
            aynuVar.U(this);
        } catch (Throwable th) {
            bapv.j(th);
            b(th);
        }
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.i(this, aypgVar);
    }

    @Override // defpackage.ayod
    public final void sm() {
        this.a.sm();
    }
}
