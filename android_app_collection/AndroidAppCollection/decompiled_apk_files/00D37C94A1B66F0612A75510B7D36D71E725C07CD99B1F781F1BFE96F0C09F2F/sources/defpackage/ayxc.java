package defpackage;
/* compiled from: PG */
/* renamed from: ayxc  reason: default package */
/* loaded from: classes2.dex */
final class ayxc implements ayoa, bamf {
    final bame a;
    bamf b;

    public ayxc(bame bameVar) {
        this.a = bameVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.b, bamfVar)) {
            this.b = bamfVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.b.si();
    }

    @Override // defpackage.bame
    public final void sm() {
        this.a.sm();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        this.b.sp(j);
    }
}
