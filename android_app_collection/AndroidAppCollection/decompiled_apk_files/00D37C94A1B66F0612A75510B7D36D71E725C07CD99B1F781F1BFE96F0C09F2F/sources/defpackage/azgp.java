package defpackage;
/* compiled from: PG */
/* renamed from: azgp  reason: default package */
/* loaded from: classes2.dex */
final class azgp implements ayom, aypg {
    final ayom a;
    aypg b;
    private final /* synthetic */ int c;

    public azgp(ayom ayomVar) {
        this.a = ayomVar;
    }

    public azgp(ayom ayomVar, int i) {
        this.c = i;
        this.a = ayomVar;
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                this.a.c(obj);
            } else {
                this.a.c(ayoh.b(obj));
            }
        }
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        int i = this.c;
        if (i == 0) {
            this.a.b(th);
        } else if (i == 1) {
            this.a.b(th);
        } else {
            this.a.c(ayoh.a(th));
            this.a.sm();
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                return this.b.e();
            }
            return this.b.e();
        }
        return this.b.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        int i = this.c;
        if (i == 0) {
            this.b.qr();
        } else if (i == 1) {
            this.b.qr();
        } else {
            this.b.qr();
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        int i = this.c;
        if (i == 0) {
            this.a.sm();
        } else if (i == 1) {
            this.a.sm();
        } else {
            this.a.c(ayoh.a);
            this.a.sm();
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        int i = this.c;
        if (i == 0) {
            this.b = aypgVar;
            this.a.sj(this);
        } else if (i == 1) {
            if (!ayqi.h(this.b, aypgVar)) {
                return;
            }
            this.b = aypgVar;
            this.a.sj(this);
        } else if (!ayqi.h(this.b, aypgVar)) {
        } else {
            this.b = aypgVar;
            this.a.sj(this);
        }
    }
}
