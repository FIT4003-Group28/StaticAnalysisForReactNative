package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: azmt  reason: default package */
/* loaded from: classes2.dex */
final class azmt extends AtomicBoolean implements Runnable, aypg {
    private static final long serialVersionUID = -2421395018820541164L;
    final Runnable a;

    public azmt(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get();
    }

    @Override // defpackage.aypg
    public final void qr() {
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
