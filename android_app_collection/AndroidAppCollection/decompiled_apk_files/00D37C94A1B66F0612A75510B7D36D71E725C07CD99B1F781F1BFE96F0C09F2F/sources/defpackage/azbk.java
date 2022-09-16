package defpackage;
/* compiled from: PG */
/* renamed from: azbk  reason: default package */
/* loaded from: classes2.dex */
final class azbk implements ayot, aypg {
    final ayod a;
    aypg b;

    public azbk(ayod ayodVar) {
        this.a = ayodVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
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

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        this.b = ayqi.a;
        this.a.sh(obj);
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.b, aypgVar)) {
            this.b = aypgVar;
            this.a.sj(this);
        }
    }
}
