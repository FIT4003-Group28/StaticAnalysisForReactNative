package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzei  reason: default package */
/* loaded from: classes6.dex */
final class dzei extends AtomicReference<Runnable> implements Runnable, dzak {
    private static final long serialVersionUID = -4101336210206799084L;
    final dzbg a;
    final dzbg b;

    public dzei(Runnable runnable) {
        super(runnable);
        this.a = new dzbg();
        this.b = new dzbg();
    }

    @Override // defpackage.dzak
    public final void SQ() {
        if (getAndSet(null) != null) {
            dzbd.e(this.a);
            dzbd.e(this.b);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = get();
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                lazySet(null);
                this.a.lazySet(dzbd.a);
                this.b.lazySet(dzbd.a);
            }
        }
    }
}
