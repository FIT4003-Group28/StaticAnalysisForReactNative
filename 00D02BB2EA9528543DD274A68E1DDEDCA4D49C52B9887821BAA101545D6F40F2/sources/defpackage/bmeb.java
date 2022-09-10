package defpackage;
/* compiled from: PG */
/* renamed from: bmeb  reason: default package */
/* loaded from: classes3.dex */
public final class bmeb implements bmea {
    protected final bbut a;
    protected final bwsh b;

    public bmeb(bbut bbutVar, bwsh bwshVar) {
        this.a = bbutVar;
        this.b = bwshVar;
    }

    @Override // defpackage.bmea
    public final void a(bwrs<ilo> bwrsVar, @dzsi dwfl dwflVar) {
        if (bwrsVar.c() == null) {
            return;
        }
        if (!cknv.f(dwflVar)) {
            int aG = bwrsVar.c().aG();
            if (aG == 0 || aG > 1) {
                this.a.l(bwrsVar, dwflVar, bbur.DEFAULT);
                return;
            } else {
                this.a.n(bwrsVar.c());
                return;
            }
        }
        this.b.e(dwflVar, null, bwrsVar.c());
    }
}
