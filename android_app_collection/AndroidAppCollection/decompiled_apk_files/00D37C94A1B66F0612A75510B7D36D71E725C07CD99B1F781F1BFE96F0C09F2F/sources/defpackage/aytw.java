package defpackage;
/* compiled from: PG */
/* renamed from: aytw  reason: default package */
/* loaded from: classes2.dex */
final class aytw extends ayrq implements ayns {
    final ayom a;
    aypg b;

    public aytw(ayom ayomVar) {
        this.a = ayomVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayrn
    public final void d() {
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return true;
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.b.qr();
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.b, aypgVar)) {
            this.b = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        return i & 2;
    }

    @Override // defpackage.ayrn
    public final /* bridge */ /* synthetic */ Object sl() {
        return null;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        this.a.sm();
    }
}
