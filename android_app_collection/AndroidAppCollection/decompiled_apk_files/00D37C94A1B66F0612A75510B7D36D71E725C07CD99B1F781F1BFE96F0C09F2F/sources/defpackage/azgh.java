package defpackage;
/* compiled from: PG */
/* renamed from: azgh  reason: default package */
/* loaded from: classes2.dex */
final class azgh implements ayoa, aypg {
    final ayom a;
    bamf b;

    public azgh(ayom ayomVar) {
        this.a = ayomVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.b == azof.a;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.b, bamfVar)) {
            this.b = bamfVar;
            this.a.sj(this);
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.b.si();
        this.b = azof.a;
    }

    @Override // defpackage.bame
    public final void sm() {
        this.a.sm();
    }
}
