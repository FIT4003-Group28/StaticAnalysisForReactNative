package defpackage;
/* compiled from: PG */
/* renamed from: azmd  reason: default package */
/* loaded from: classes2.dex */
final class azmd extends ayrw implements ayot {
    private static final long serialVersionUID = 3786543492451018833L;
    aypg c;

    public azmd(ayom ayomVar) {
        super(ayomVar);
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        g(th);
    }

    @Override // defpackage.ayrw, defpackage.aypg
    public final void qr() {
        super.qr();
        this.c.qr();
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        f(obj);
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.c, aypgVar)) {
            this.c = aypgVar;
            this.a.sj(this);
        }
    }
}
