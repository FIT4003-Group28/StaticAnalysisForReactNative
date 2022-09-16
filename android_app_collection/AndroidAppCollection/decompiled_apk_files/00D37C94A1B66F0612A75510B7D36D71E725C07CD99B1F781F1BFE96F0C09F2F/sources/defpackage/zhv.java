package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: zhv  reason: default package */
/* loaded from: classes4.dex */
public final class zhv extends anie {
    public final AtomicReference a = new AtomicReference();

    public final void d() {
        aypg aypgVar = (aypg) this.a.getAndSet(null);
        if (aypgVar != null) {
            aypgVar.qr();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anie
    public final boolean e(Throwable th) {
        return super.e(th);
    }

    @Override // defpackage.anie
    protected final void qu() {
        if (isCancelled()) {
            d();
        }
    }
}
