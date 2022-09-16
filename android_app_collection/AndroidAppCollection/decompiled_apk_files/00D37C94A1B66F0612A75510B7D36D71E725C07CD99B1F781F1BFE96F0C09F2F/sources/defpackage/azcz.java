package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azcz  reason: default package */
/* loaded from: classes2.dex */
final class azcz extends AtomicReference implements ayom, ayns, aypg {
    private static final long serialVersionUID = -8948264376121066672L;
    final ayom a;
    ayok b;

    public azcz(ayom ayomVar, ayok ayokVar) {
        this.b = ayokVar;
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
        ayqi.c(this);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.i(this, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        ayok ayokVar = this.b;
        if (ayokVar == null) {
            this.a.sm();
            return;
        }
        this.b = null;
        ayokVar.az(this);
    }
}
