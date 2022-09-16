package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayry  reason: default package */
/* loaded from: classes2.dex */
public final class ayry extends AtomicReference implements ayns, aypg {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        lazySet(ayqi.a);
        azqc.d(new aypq(th));
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == ayqi.a;
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        lazySet(ayqi.a);
    }
}
