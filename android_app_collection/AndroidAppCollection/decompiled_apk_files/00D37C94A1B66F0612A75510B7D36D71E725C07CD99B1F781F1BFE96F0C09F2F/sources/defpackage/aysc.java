package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aysc  reason: default package */
/* loaded from: classes2.dex */
public final class aysc extends AtomicReference implements ayom, aypg {
    private static final long serialVersionUID = -7251123623727029452L;
    final ayqb a;
    final ayqb b;
    final aypv c;

    public aysc(ayqb ayqbVar, ayqb ayqbVar2, aypv aypvVar) {
        this.a = ayqbVar;
        this.b = ayqbVar2;
        this.c = aypvVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (!e()) {
            lazySet(ayqi.a);
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

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (!e()) {
            try {
                this.a.a(obj);
            } catch (Throwable th) {
                bapv.j(th);
                ((aypg) get()).qr();
                b(th);
            }
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

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (!e()) {
            lazySet(ayqi.a);
            try {
                this.c.a();
            } catch (Throwable th) {
                bapv.j(th);
                azqc.d(th);
            }
        }
    }
}
