package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azal  reason: default package */
/* loaded from: classes2.dex */
public final class azal extends AtomicReference implements ayod, aypg {
    private static final long serialVersionUID = -6076952298809384986L;
    final ayqb a;
    final ayqb b;
    final aypv c;

    public azal(ayqb ayqbVar, ayqb ayqbVar2, aypv aypvVar) {
        this.a = ayqbVar;
        this.b = ayqbVar2;
        this.c = aypvVar;
    }

    @Override // defpackage.ayod
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
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        lazySet(ayqi.a);
        try {
            this.a.a(obj);
        } catch (Throwable th) {
            bapv.j(th);
            azqc.d(th);
        }
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayod
    public final void sm() {
        lazySet(ayqi.a);
        try {
            this.c.a();
        } catch (Throwable th) {
            bapv.j(th);
            azqc.d(th);
        }
    }
}
