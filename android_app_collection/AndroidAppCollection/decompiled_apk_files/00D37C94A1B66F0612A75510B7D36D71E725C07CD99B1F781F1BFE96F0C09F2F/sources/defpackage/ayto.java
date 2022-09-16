package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayto  reason: default package */
/* loaded from: classes2.dex */
final class ayto extends AtomicReference implements Runnable, ayns, aypg {
    private static final long serialVersionUID = 7000911171163930287L;
    final ayns a;
    final ayqm b = new ayqm();
    final aynu c;

    public ayto(ayns aynsVar, aynu aynuVar) {
        this.a = aynsVar;
        this.c = aynuVar;
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
        ayqi.c(this.b);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.U(this);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        this.a.sm();
    }
}
