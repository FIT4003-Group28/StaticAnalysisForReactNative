package defpackage;
/* compiled from: PG */
/* renamed from: azii  reason: default package */
/* loaded from: classes2.dex */
final class azii implements ayom, aypg {
    final ayom a;
    long b;
    aypg c;

    public azii(ayom ayomVar, long j) {
        this.a = ayomVar;
        this.b = j;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
        } else {
            this.a.c(obj);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.c.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.c, aypgVar)) {
            this.c = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.a.sm();
    }
}
