package defpackage;
/* compiled from: PG */
/* renamed from: azfd  reason: default package */
/* loaded from: classes2.dex */
final class azfd implements ayom, aypg {
    final ayod a;
    aypg b;
    long c;
    boolean d;

    public azfd(ayod ayodVar) {
        this.a = ayodVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.d) {
            azqc.d(th);
            return;
        }
        this.d = true;
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        long j = this.c;
        if (j != 0) {
            this.c = j + 1;
            return;
        }
        this.d = true;
        this.b.qr();
        this.a.sh(obj);
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
        if (ayqi.h(this.b, aypgVar)) {
            this.b = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (!this.d) {
            this.d = true;
            this.a.sm();
        }
    }
}
