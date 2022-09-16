package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayrv  reason: default package */
/* loaded from: classes2.dex */
public final class ayrv extends AtomicReference implements ayot, aypg {
    private static final long serialVersionUID = -7012088219455310787L;
    final ayqb a;
    final ayqb b;

    public ayrv(ayqb ayqbVar, ayqb ayqbVar2) {
        this.a = ayqbVar;
        this.b = ayqbVar2;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        lazySet(ayqi.a);
        try {
            this.b.a(th);
        } catch (Throwable th2) {
            bapv.j(th2);
            azqc.d(new aypo(th, th2));
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == ayqi.a;
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        lazySet(ayqi.a);
        try {
            this.a.a(obj);
        } catch (Throwable th) {
            bapv.j(th);
            azqc.d(th);
        }
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }
}
