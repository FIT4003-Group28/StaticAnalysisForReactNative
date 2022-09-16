package defpackage;
/* compiled from: PG */
/* renamed from: azll  reason: default package */
/* loaded from: classes2.dex */
final class azll implements ayot, aypg {
    final ayot a;
    aypg b;

    public azll(ayot ayotVar) {
        this.a = ayotVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
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
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
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
