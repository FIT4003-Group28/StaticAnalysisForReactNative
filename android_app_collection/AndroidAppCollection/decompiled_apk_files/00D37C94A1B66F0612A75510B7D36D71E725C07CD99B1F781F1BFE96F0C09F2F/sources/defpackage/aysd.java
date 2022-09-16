package defpackage;
/* compiled from: PG */
/* renamed from: aysd  reason: default package */
/* loaded from: classes2.dex */
public final class aysd implements ayns, bamf {
    final bame a;
    aypg b;

    public aysd(bame bameVar) {
        this.a = bameVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.bamf
    public final void si() {
        this.b.qr();
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.b, aypgVar)) {
            this.b = aypgVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        this.a.sm();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
    }
}
