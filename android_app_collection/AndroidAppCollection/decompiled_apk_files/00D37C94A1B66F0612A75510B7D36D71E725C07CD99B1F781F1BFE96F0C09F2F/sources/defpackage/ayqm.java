package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayqm  reason: default package */
/* loaded from: classes2.dex */
public final class ayqm extends AtomicReference implements aypg {
    private static final long serialVersionUID = -754898800686245608L;

    public ayqm() {
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    public ayqm(aypg aypgVar) {
        lazySet(aypgVar);
    }
}
