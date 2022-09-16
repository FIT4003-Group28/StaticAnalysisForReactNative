package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azch  reason: default package */
/* loaded from: classes2.dex */
final class azch extends AtomicReference implements ayod, aypg {
    private static final long serialVersionUID = 8571289934935992137L;
    final ayqm a = new ayqm();
    final ayod b;

    public azch(ayod ayodVar) {
        this.b = ayodVar;
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        this.b.b(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
        ayqi.c(this.a);
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        this.b.sh(obj);
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayod
    public final void sm() {
        this.b.sm();
    }
}
