package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azik  reason: default package */
/* loaded from: classes2.dex */
final class azik extends AtomicReference implements ayom, aypg {
    private static final long serialVersionUID = 8094547886072529208L;
    final ayom a;
    final AtomicReference b = new AtomicReference();

    public azik(ayom ayomVar) {
        this.a = ayomVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this.b);
        ayqi.c(this);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.g(this.b, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.a.sm();
    }
}
