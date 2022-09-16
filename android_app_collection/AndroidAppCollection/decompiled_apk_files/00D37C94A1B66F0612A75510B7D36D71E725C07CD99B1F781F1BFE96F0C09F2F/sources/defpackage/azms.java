package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azms  reason: default package */
/* loaded from: classes2.dex */
final class azms extends AtomicReference implements Runnable, aypg {
    private static final long serialVersionUID = -4101336210206799084L;
    final ayqm a;
    final ayqm b;

    public azms(Runnable runnable) {
        super(runnable);
        this.a = new ayqm();
        this.b = new ayqm();
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == null;
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (getAndSet(null) != null) {
            ayqi.c(this.a);
            ayqi.c(this.b);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                lazySet(null);
                this.a.lazySet(ayqi.a);
                this.b.lazySet(ayqi.a);
            }
        }
    }
}
