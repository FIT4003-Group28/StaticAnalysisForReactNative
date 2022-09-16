package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azkv  reason: default package */
/* loaded from: classes2.dex */
final class azkv extends AtomicReference implements ayom, aypg {
    private static final long serialVersionUID = -8565274649390031272L;
    final ayot a;
    final ayov b;
    boolean c;

    public azkv(ayot ayotVar, ayov ayovVar) {
        this.a = ayotVar;
        this.b = ayovVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.c) {
            azqc.d(th);
            return;
        }
        this.c = true;
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        ((aypg) get()).qr();
        sm();
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.f(this, aypgVar)) {
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.W(new azcm(this, this.a, 1));
    }
}
