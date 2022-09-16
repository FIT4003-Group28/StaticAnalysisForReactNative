package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azdk  reason: default package */
/* loaded from: classes2.dex */
public final class azdk implements ayom, aypg {
    static final azdj a = new azdj(null);
    final ayns b;
    final ayqe c;
    final azoj d = new azoj();
    final AtomicReference e = new AtomicReference();
    volatile boolean f;
    aypg g;

    public azdk(ayns aynsVar, ayqe ayqeVar) {
        this.b = aynsVar;
        this.c = ayqeVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (azom.e(this.d, th)) {
            f();
            Throwable d = azom.d(this.d);
            if (d == azom.a) {
                return;
            }
            this.b.b(d);
            return;
        }
        azqc.d(th);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [aynu, java.lang.Object] */
    @Override // defpackage.ayom
    public final void c(Object obj) {
        azdj azdjVar;
        try {
            ?? a2 = this.c.a(obj);
            azdj azdjVar2 = new azdj(this);
            do {
                azdjVar = (azdj) this.e.get();
                if (azdjVar == a) {
                    return;
                }
            } while (!this.e.compareAndSet(azdjVar, azdjVar2));
            if (azdjVar != null) {
                ayqi.c(azdjVar);
            }
            a2.U(azdjVar2);
        } catch (Throwable th) {
            bapv.j(th);
            this.g.qr();
            b(th);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.e.get() == a;
    }

    final void f() {
        AtomicReference atomicReference = this.e;
        azdj azdjVar = a;
        azdj azdjVar2 = (azdj) atomicReference.getAndSet(azdjVar);
        if (azdjVar2 == null || azdjVar2 == azdjVar) {
            return;
        }
        ayqi.c(azdjVar2);
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.g.qr();
        f();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.g, aypgVar)) {
            this.g = aypgVar;
            this.b.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.f = true;
        if (this.e.get() == null) {
            Throwable d = azom.d(this.d);
            if (d == null) {
                this.b.sm();
            } else {
                this.b.b(d);
            }
        }
    }
}
