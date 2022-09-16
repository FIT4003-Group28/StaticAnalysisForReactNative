package defpackage;
/* compiled from: PG */
/* renamed from: azpy  reason: default package */
/* loaded from: classes2.dex */
final class azpy extends ayrp {
    private static final long serialVersionUID = 7926949470189395511L;
    final /* synthetic */ azpz a;

    public azpy(azpz azpzVar) {
        this.a = azpzVar;
    }

    @Override // defpackage.ayrn
    public final void d() {
        this.a.a.d();
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.a.d;
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return this.a.a.j();
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (!this.a.d) {
            this.a.d = true;
            this.a.e();
            this.a.b.lazySet(null);
            if (this.a.h.getAndIncrement() != 0) {
                return;
            }
            this.a.b.lazySet(null);
            this.a.a.d();
        }
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        if ((i & 2) != 0) {
            this.a.i = true;
            return 2;
        }
        return 0;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        return this.a.a.sl();
    }
}
