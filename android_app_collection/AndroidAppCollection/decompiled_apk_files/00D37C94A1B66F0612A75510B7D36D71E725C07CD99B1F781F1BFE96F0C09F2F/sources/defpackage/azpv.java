package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azpv  reason: default package */
/* loaded from: classes2.dex */
public final class azpv extends AtomicReference implements aypg {
    private static final long serialVersionUID = -7650903191002190468L;
    final ayot a;

    public azpv(ayot ayotVar, azpw azpwVar) {
        this.a = ayotVar;
        lazySet(azpwVar);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == null;
    }

    @Override // defpackage.aypg
    public final void qr() {
        azpw azpwVar = (azpw) getAndSet(null);
        if (azpwVar != null) {
            azpwVar.aa(this);
        }
    }
}
