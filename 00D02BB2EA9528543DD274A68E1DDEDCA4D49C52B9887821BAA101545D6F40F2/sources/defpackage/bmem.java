package defpackage;
/* compiled from: PG */
/* renamed from: bmem  reason: default package */
/* loaded from: classes3.dex */
public final class bmem implements bmea {
    public boolean a = false;
    private final bwsh b;
    private final bbut c;

    public bmem(bwsh bwshVar, bbut bbutVar) {
        this.b = bwshVar;
        this.c = bbutVar;
    }

    private static ilo b(String str) {
        ily ilyVar = new ily();
        dvya bZ = dvyw.bv.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvyw dvywVar = (dvyw) bZ.b;
        str.getClass();
        dvywVar.a |= 8;
        dvywVar.h = str;
        ilyVar.E(bZ.bK());
        return ilyVar.d();
    }

    @Override // defpackage.bmea
    public final void a(bwrs<ilo> bwrsVar, @dzsi dwfl dwflVar) {
        ilo c = bwrsVar.c();
        if (c == null || dwflVar == null) {
            return;
        }
        if (c.aE().size() != 1 || !cknv.f(dwflVar)) {
            dcdc r = dcdc.r(c.aE());
            String cG = c.cG();
            if (c.aE().size() == 1) {
                if (dbsj.d(cG)) {
                    this.c.o(new ckoa(r), 0, bbty.v().a(), null);
                    return;
                }
                bbvm bZ = bbvn.d.bZ();
                boolean z = this.a;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bbvn bbvnVar = (bbvn) bZ.b;
                int i = bbvnVar.a | 1;
                bbvnVar.a = i;
                bbvnVar.b = z;
                boolean z2 = this.a;
                bbvnVar.a = i | 2;
                bbvnVar.c = z2;
                bbut bbutVar = this.c;
                ckoa ckoaVar = new ckoa(r);
                bbtv v = bbty.v();
                v.k(true);
                v.w(bZ.bK());
                bbutVar.p(ckoaVar, 0, v.a(), bwrs.a(b(cG)), null);
                return;
            }
            bwrs<ilo> a = bwrs.a(c);
            if (dbsj.d(cG)) {
                this.c.m(new ckoa(r), dwflVar, a);
                return;
            } else {
                this.c.m(new ckoa(r), dwflVar, bwrs.a(b(cG)));
                return;
            }
        }
        this.b.e(dwflVar, null, null);
    }
}
