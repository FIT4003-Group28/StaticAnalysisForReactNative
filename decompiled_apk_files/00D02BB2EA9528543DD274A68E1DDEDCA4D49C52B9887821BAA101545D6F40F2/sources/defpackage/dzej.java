package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: dzej  reason: default package */
/* loaded from: classes6.dex */
final class dzej extends AtomicBoolean implements Runnable, dzak {
    private static final long serialVersionUID = -2421395018820541164L;
    final Runnable a;

    public dzej(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        lazySet(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get()) {
            return;
        }
        try {
            this.a.run();
        } finally {
            lazySet(true);
        }
    }
}
