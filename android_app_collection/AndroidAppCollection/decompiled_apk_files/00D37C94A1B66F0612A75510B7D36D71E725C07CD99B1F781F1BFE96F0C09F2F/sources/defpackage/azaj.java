package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azaj  reason: default package */
/* loaded from: classes2.dex */
public final class azaj extends AtomicReference implements aypg {
    private static final long serialVersionUID = -5791853038359966195L;
    final ayod a;

    public azaj(ayod ayodVar, azak azakVar) {
        super(azakVar);
        this.a = ayodVar;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == null;
    }

    @Override // defpackage.aypg
    public final void qr() {
        azak azakVar = (azak) getAndSet(null);
        if (azakVar != null) {
            azakVar.Z(this);
        }
    }
}
