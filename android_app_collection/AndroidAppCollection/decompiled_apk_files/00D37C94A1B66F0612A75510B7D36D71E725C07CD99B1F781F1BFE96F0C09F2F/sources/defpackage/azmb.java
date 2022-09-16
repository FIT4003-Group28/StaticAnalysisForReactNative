package defpackage;
/* compiled from: PG */
/* renamed from: azmb  reason: default package */
/* loaded from: classes2.dex */
final class azmb extends azob implements ayot {
    private static final long serialVersionUID = 187782011903685568L;
    aypg a;

    public azmb(bame bameVar) {
        super(bameVar);
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.f.b(th);
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        g(obj);
    }

    @Override // defpackage.azob, defpackage.bamf
    public final void si() {
        super.si();
        this.a.qr();
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.a, aypgVar)) {
            this.a = aypgVar;
            this.f.f(this);
        }
    }
}
