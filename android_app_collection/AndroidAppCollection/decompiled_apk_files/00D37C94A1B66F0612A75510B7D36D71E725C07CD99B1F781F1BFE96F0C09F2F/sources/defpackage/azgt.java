package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azgt  reason: default package */
/* loaded from: classes2.dex */
final class azgt extends AtomicReference implements Runnable, aypg {
    private static final long serialVersionUID = 346773832286157679L;
    final ayom a;
    long b;

    public azgt(ayom ayomVar) {
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
        if (get() != ayqi.a) {
            ayom ayomVar = this.a;
            long j = this.b;
            this.b = 1 + j;
            ayomVar.c(Long.valueOf(j));
        }
    }
}
