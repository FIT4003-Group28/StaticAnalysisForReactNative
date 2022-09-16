package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aysj  reason: default package */
/* loaded from: classes2.dex */
public final class aysj extends AtomicReference implements ayns {
    private static final long serialVersionUID = -5454794857847146511L;
    final aysk a;

    public aysj(aysk ayskVar) {
        this.a = ayskVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.a.g(th);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.i(this, aypgVar);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        aysk ayskVar = this.a;
        ayskVar.k = false;
        ayskVar.d();
    }
}
