package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayru  reason: default package */
/* loaded from: classes2.dex */
public final class ayru extends AtomicReference implements ayns, aypg, ayqb {
    private static final long serialVersionUID = -4361286194466301354L;
    final ayqb a;
    final aypv b;

    public ayru(aypv aypvVar) {
        this.a = this;
        this.b = aypvVar;
    }

    @Override // defpackage.ayqb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        azqc.d(new aypq((Throwable) obj));
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        try {
            this.a.a(th);
        } catch (Throwable th2) {
            bapv.j(th2);
            azqc.d(th2);
        }
        lazySet(ayqi.a);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == ayqi.a;
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        try {
            this.b.a();
        } catch (Throwable th) {
            bapv.j(th);
            azqc.d(th);
        }
        lazySet(ayqi.a);
    }

    public ayru(ayqb ayqbVar, aypv aypvVar) {
        this.a = ayqbVar;
        this.b = aypvVar;
    }
}
