package defpackage;
/* compiled from: PG */
/* renamed from: azbr  reason: default package */
/* loaded from: classes2.dex */
final class azbr implements ayod, aypg {
    final ayot a;
    aypg b;

    public azbr(ayot ayotVar) {
        this.a = ayotVar;
    }

    @Override // defpackage.ayod
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

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        this.b = ayqi.a;
        this.a.sh(false);
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.b, aypgVar)) {
            this.b = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayod
    public final void sm() {
        this.b = ayqi.a;
        this.a.sh(true);
    }
}
