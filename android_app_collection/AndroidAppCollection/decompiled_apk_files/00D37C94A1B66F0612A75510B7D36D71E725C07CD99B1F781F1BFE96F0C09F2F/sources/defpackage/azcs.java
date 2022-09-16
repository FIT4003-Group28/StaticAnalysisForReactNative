package defpackage;
/* compiled from: PG */
/* renamed from: azcs  reason: default package */
/* loaded from: classes2.dex */
final class azcs extends ayrw implements ayod {
    private static final long serialVersionUID = 7603343402964826922L;
    aypg c;

    public azcs(ayom ayomVar) {
        super(ayomVar);
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        g(th);
    }

    @Override // defpackage.ayrw, defpackage.aypg
    public final void qr() {
        super.qr();
        this.c.qr();
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        f(obj);
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.c, aypgVar)) {
            this.c = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayod
    public final void sm() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.a.sm();
    }
}
