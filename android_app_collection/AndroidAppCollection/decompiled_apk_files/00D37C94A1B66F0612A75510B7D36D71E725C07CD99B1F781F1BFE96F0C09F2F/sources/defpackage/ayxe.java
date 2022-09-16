package defpackage;
/* compiled from: PG */
/* renamed from: ayxe  reason: default package */
/* loaded from: classes2.dex */
final class ayxe implements ayoa, ayrk {
    final bame a;
    bamf b;

    public ayxe(bame bameVar) {
        this.a = bameVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
    }

    @Override // defpackage.ayrn
    public final void d() {
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.b, bamfVar)) {
            this.b = bamfVar;
            this.a.f(this);
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return true;
    }

    @Override // defpackage.ayrn
    public final boolean k(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.bamf
    public final void si() {
        this.b.si();
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        return i & 2;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        return null;
    }

    @Override // defpackage.bame
    public final void sm() {
        this.a.sm();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
    }
}
