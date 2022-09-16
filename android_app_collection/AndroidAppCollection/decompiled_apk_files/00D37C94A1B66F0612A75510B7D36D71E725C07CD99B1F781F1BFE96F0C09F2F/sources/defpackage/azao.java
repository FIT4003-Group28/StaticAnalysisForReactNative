package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azao  reason: default package */
/* loaded from: classes2.dex */
final class azao extends AtomicReference implements ayns, aypg {
    private static final long serialVersionUID = 703409937383992161L;
    final ayod a;
    final ayof b;

    public azao(ayod ayodVar, ayof ayofVar) {
        this.a = ayodVar;
        this.b = ayofVar;
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
        this.b.X(new azca(this, this.a, 1));
    }
}
