package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aytt  reason: default package */
/* loaded from: classes2.dex */
final class aytt extends AtomicReference implements Runnable, aypg {
    private static final long serialVersionUID = 3167244060586201109L;
    final ayns a;

    public aytt(ayns aynsVar) {
        this.a = aynsVar;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.sm();
    }
}
