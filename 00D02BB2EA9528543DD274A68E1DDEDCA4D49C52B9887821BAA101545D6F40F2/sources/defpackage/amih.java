package defpackage;
/* compiled from: PG */
/* renamed from: amih  reason: default package */
/* loaded from: classes.dex */
public final class amih extends btnf<amhh> {
    public amih(int i, btmv btmvVar) {
        super(i, btne.GL_LABEL, btmvVar);
    }

    public final void a() {
        m(0);
    }

    public final void d(amhh amhhVar) {
        if (super.l(amhhVar.t()) == null) {
            amhhVar.w(4);
            super.j(amhhVar.t(), amhhVar);
        }
    }

    public final void e(int i) {
        super.n(i);
    }

    @dzsi
    public final synchronized amhh f(long j) {
        amhh amhhVar;
        amhhVar = (amhh) super.l(j);
        if (amhhVar != null) {
            amhhVar.w(1);
        }
        return amhhVar;
    }

    @Override // defpackage.btnf
    protected final /* bridge */ /* synthetic */ void g(amhh amhhVar) {
        amhhVar.x(4);
    }
}
