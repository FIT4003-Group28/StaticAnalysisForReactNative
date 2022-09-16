package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azkt  reason: default package */
/* loaded from: classes2.dex */
final class azkt extends AtomicReference implements ayns, aypg {
    private static final long serialVersionUID = -8565274649390031272L;
    final ayot a;
    final ayov b;

    public azkt(ayot ayotVar, ayov ayovVar) {
        this.a = ayotVar;
        this.b = ayovVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.g(this, aypgVar)) {
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        this.b.W(new azcm(this, this.a, 1));
    }
}
