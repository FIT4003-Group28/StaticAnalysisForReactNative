package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azhe  reason: default package */
/* loaded from: classes2.dex */
public final class azhe extends AtomicReference implements aypg {
    private static final long serialVersionUID = -1100270633763673112L;
    final ayom a;

    public azhe(ayom ayomVar) {
        this.a = ayomVar;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == this;
    }

    @Override // defpackage.aypg
    public final void qr() {
        Object andSet = getAndSet(this);
        if (andSet == null || andSet == this) {
            return;
        }
        ((azhf) andSet).f(this);
    }
}
