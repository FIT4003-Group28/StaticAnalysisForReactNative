package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azov  reason: default package */
/* loaded from: classes2.dex */
public abstract class azov implements ayns, aypg {
    final AtomicReference b = new AtomicReference();

    @Override // defpackage.aypg
    public final boolean e() {
        return this.b.get() == ayqi.a;
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this.b);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        axzl.j(this.b, aypgVar, getClass());
    }
}
