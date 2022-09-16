package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azji  reason: default package */
/* loaded from: classes2.dex */
final class azji extends AtomicReference implements Runnable, aypg {
    private static final long serialVersionUID = -2809475196591179431L;
    final ayom a;

    public azji(ayom ayomVar) {
        this.a = ayomVar;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == ayqi.a;
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!e()) {
            this.a.c(0L);
            lazySet(ayqj.INSTANCE);
            this.a.sm();
        }
    }
}
