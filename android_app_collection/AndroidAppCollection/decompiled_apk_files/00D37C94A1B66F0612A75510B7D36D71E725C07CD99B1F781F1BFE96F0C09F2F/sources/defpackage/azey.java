package defpackage;
/* compiled from: PG */
/* renamed from: azey  reason: default package */
/* loaded from: classes2.dex */
final class azey implements ayom, aypg {
    final ayom a;
    final ayqb b;
    final ayqb c;
    final aypv d;
    aypg e;
    boolean f;

    public azey(ayom ayomVar, ayqb ayqbVar, ayqb ayqbVar2, aypv aypvVar) {
        this.a = ayomVar;
        this.b = ayqbVar;
        this.c = ayqbVar2;
        this.d = aypvVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.f) {
            azqc.d(th);
            return;
        }
        this.f = true;
        try {
            this.c.a(th);
        } catch (Throwable th2) {
            bapv.j(th2);
            th = new aypo(th, th2);
        }
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.f) {
            return;
        }
        try {
            this.b.a(obj);
            this.a.c(obj);
        } catch (Throwable th) {
            bapv.j(th);
            this.e.qr();
            b(th);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.e.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.e, aypgVar)) {
            this.e = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.f) {
            return;
        }
        try {
            this.d.a();
            this.f = true;
            this.a.sm();
        } catch (Throwable th) {
            bapv.j(th);
            b(th);
        }
    }
}
