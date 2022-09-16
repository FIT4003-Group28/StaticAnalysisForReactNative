package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azde  reason: default package */
/* loaded from: classes2.dex */
final class azde extends AtomicReference implements ayom, ayod, aypg {
    private static final long serialVersionUID = -8948264376121066672L;
    final ayom a;
    final ayqe b;

    public azde(ayom ayomVar, ayqe ayqeVar) {
        this.a = ayomVar;
        this.b = ayqeVar;
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
        ayqi.c(this);
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        try {
            ayok ayokVar = (ayok) this.b.a(obj);
            ayrd.b(ayokVar, "The mapper returned a null Publisher");
            ayokVar.az(this);
        } catch (Throwable th) {
            bapv.j(th);
            this.a.b(th);
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.i(this, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.a.sm();
    }
}
