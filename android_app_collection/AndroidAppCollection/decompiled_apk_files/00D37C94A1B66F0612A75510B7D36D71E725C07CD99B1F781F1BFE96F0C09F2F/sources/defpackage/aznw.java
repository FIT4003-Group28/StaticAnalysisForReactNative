package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aznw  reason: default package */
/* loaded from: classes2.dex */
public final class aznw extends AtomicReference implements ayoa, bamf, aypg {
    private static final long serialVersionUID = -7251123623727029452L;
    final ayqb a;
    final ayqb b;
    final ayqb c;

    public aznw(ayqb ayqbVar, ayqb ayqbVar2, ayqb ayqbVar3) {
        this.a = ayqbVar;
        this.b = ayqbVar2;
        this.c = ayqbVar3;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (get() != azof.a) {
            lazySet(azof.a);
            try {
                this.b.a(th);
                return;
            } catch (Throwable th2) {
                bapv.j(th2);
                azqc.d(new aypo(th, th2));
                return;
            }
        }
        azqc.d(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (!e()) {
            try {
                this.a.a(obj);
            } catch (Throwable th) {
                bapv.j(th);
                ((bamf) get()).si();
                b(th);
            }
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == azof.a;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.g(this, bamfVar)) {
            try {
                this.c.a(this);
            } catch (Throwable th) {
                bapv.j(th);
                bamfVar.si();
                b(th);
            }
        }
    }

    @Override // defpackage.aypg
    public final void qr() {
        azof.f(this);
    }

    @Override // defpackage.bamf
    public final void si() {
        azof.f(this);
    }

    @Override // defpackage.bame
    public final void sm() {
        if (get() != azof.a) {
            lazySet(azof.a);
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        ((bamf) get()).sp(j);
    }
}
