package defpackage;
/* compiled from: PG */
/* renamed from: azis  reason: default package */
/* loaded from: classes2.dex */
final class azis implements ayom, aypg {
    final ayom a;
    boolean b;
    aypg c;
    long d;

    public azis(ayom ayomVar, long j) {
        this.a = ayomVar;
        this.d = j;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.b) {
            azqc.d(th);
            return;
        }
        this.b = true;
        this.c.qr();
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (!this.b) {
            long j = this.d;
            long j2 = (-1) + j;
            this.d = j2;
            if (j <= 0) {
                return;
            }
            this.a.c(obj);
            if (j2 != 0) {
                return;
            }
            sm();
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
            if (this.d == 0) {
                this.b = true;
                aypgVar.qr();
                ayqj.f(this.a);
                return;
            }
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (!this.b) {
            this.b = true;
            this.c.qr();
            this.a.sm();
        }
    }
}
