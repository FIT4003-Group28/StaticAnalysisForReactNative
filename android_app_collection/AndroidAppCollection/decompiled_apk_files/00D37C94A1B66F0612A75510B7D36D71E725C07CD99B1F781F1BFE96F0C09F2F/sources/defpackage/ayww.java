package defpackage;
/* compiled from: PG */
/* renamed from: ayww  reason: default package */
/* loaded from: classes2.dex */
final class ayww implements ayom, bamf {
    final bame a;
    aypg b;

    public ayww(bame bameVar) {
        this.a = bameVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.bamf
    public final void si() {
        this.b.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        this.b = aypgVar;
        this.a.f(this);
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.a.sm();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
    }
}
