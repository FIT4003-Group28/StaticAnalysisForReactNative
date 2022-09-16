package defpackage;
/* compiled from: PG */
/* renamed from: azbi  reason: default package */
/* loaded from: classes2.dex */
final class azbi implements ayns, aypg {
    final ayod a;
    aypg b;

    public azbi(ayod ayodVar) {
        this.a = ayodVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.b = ayqi.a;
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
        this.b = ayqi.a;
        this.a.sm();
    }
}
