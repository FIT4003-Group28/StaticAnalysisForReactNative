package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aypj  reason: default package */
/* loaded from: classes2.dex */
public final class aypj implements aypg {
    final AtomicReference a = new AtomicReference();

    public final void a(aypg aypgVar) {
        ayqi.f(this.a, aypgVar);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) this.a.get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this.a);
    }
}
