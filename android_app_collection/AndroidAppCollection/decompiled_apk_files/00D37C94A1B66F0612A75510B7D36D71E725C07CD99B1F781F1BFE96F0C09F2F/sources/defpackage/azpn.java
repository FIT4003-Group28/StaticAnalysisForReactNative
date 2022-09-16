package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azpn  reason: default package */
/* loaded from: classes2.dex */
public final class azpn extends AtomicReference implements aypg {
    private static final long serialVersionUID = -7650903191002190468L;
    final ayns a;

    public azpn(ayns aynsVar, azpo azpoVar) {
        this.a = aynsVar;
        lazySet(azpoVar);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == null;
    }

    @Override // defpackage.aypg
    public final void qr() {
        azpo azpoVar = (azpo) getAndSet(null);
        if (azpoVar != null) {
            azpoVar.X(this);
        }
    }
}
