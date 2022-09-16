package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azhi  reason: default package */
/* loaded from: classes2.dex */
public final class azhi extends AtomicReference implements aypg {
    private static final long serialVersionUID = 7463222674719692880L;
    final ayom a;

    public azhi(ayom ayomVar, azhj azhjVar) {
        this.a = ayomVar;
        lazySet(azhjVar);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == null;
    }

    @Override // defpackage.aypg
    public final void qr() {
        azhj azhjVar = (azhj) getAndSet(null);
        if (azhjVar != null) {
            azhjVar.f(this);
        }
    }
}
