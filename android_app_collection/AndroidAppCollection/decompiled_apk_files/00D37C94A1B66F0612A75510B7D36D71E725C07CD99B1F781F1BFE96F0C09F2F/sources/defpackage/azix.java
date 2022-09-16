package defpackage;
/* compiled from: PG */
/* renamed from: azix  reason: default package */
/* loaded from: classes2.dex */
final class azix implements ayom, aypg {
    final ayom a;
    final ayqf b;
    aypg c;
    boolean d;

    public azix(ayom ayomVar, ayqf ayqfVar) {
        this.a = ayomVar;
        this.b = ayqfVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (!this.d) {
            this.d = true;
            this.a.b(th);
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (!this.d) {
            this.a.c(obj);
            try {
                if (!this.b.a(obj)) {
                    return;
                }
                this.d = true;
                this.c.qr();
                this.a.sm();
            } catch (Throwable th) {
                bapv.j(th);
                this.c.qr();
                b(th);
            }
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
        if (!this.d) {
            this.d = true;
            this.a.sm();
        }
    }
}
