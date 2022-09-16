package defpackage;
/* compiled from: PG */
/* renamed from: ayta  reason: default package */
/* loaded from: classes2.dex */
final class ayta implements ayns, aypg {
    final ayns a;
    aypg b;

    public ayta(ayns aynsVar) {
        this.a = aynsVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.b.qr();
        this.b = ayqi.a;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.b, aypgVar)) {
            this.b = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        this.a.sm();
    }
}
