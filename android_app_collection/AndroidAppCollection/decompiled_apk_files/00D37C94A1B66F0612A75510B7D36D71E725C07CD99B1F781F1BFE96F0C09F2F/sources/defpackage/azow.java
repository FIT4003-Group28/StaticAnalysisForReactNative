package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azow  reason: default package */
/* loaded from: classes2.dex */
public abstract class azow implements ayom, aypg {
    final AtomicReference e = new AtomicReference();

    @Override // defpackage.aypg
    public final boolean e() {
        return this.e.get() == ayqi.a;
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this.e);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        axzl.j(this.e, aypgVar, getClass());
    }
}
