package defpackage;
/* compiled from: PG */
/* renamed from: azgr  reason: default package */
/* loaded from: classes2.dex */
final class azgr implements ayom, aypg {
    final ayns a;
    aypg b;

    public azgr(ayns aynsVar) {
        this.a = aynsVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.b.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        this.b = aypgVar;
        this.a.sj(this);
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.a.sm();
    }
}
