package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azpp  reason: default package */
/* loaded from: classes2.dex */
public final class azpp extends AtomicBoolean implements aypg {
    private static final long serialVersionUID = 3562861878281475070L;
    final ayom a;
    final azpq b;

    public azpp(ayom ayomVar, azpq azpqVar) {
        this.a = ayomVar;
        this.b = azpqVar;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get();
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (compareAndSet(false, true)) {
            this.b.aI(this);
        }
    }
}
