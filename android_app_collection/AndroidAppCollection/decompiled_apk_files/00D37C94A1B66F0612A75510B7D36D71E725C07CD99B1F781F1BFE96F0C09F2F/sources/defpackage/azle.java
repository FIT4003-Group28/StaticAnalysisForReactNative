package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azle  reason: default package */
/* loaded from: classes2.dex */
final class azle extends AtomicReference implements ayot, ayns, aypg {
    private static final long serialVersionUID = -2177128922851101253L;
    final ayns a;
    final ayqe b;

    public azle(ayns aynsVar, ayqe ayqeVar) {
        this.a = aynsVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
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

    @Override // defpackage.ayot, defpackage.ayod
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

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.i(this, aypgVar);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        this.a.sm();
    }
}
