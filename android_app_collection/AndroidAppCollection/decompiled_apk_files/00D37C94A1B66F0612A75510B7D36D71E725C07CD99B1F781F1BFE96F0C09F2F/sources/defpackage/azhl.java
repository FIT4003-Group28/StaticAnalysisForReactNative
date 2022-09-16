package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azhl  reason: default package */
/* loaded from: classes2.dex */
final class azhl implements ayom {
    final azpq a;
    final AtomicReference b;

    public azhl(azpq azpqVar, AtomicReference atomicReference) {
        this.a = azpqVar;
        this.b = atomicReference;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.a.c(obj);
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
