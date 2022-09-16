package defpackage;
/* compiled from: PG */
/* renamed from: beio  reason: default package */
/* loaded from: classes3.dex */
public final class beio implements beid {
    static final dcep<dgab> a = dcep.C(dgab.TREATMENT_CARD_CLICKED, dgab.WAITLISTED);
    public static final /* synthetic */ int c = 0;
    public final beip b;
    private final btpc d;
    private final dxio<akfa> e;
    private final bvrb f;
    private btlu g;
    private final buzk h;

    public beio(btpc btpcVar, dxio dxioVar, beip beipVar, bvrb bvrbVar, buzk buzkVar) {
        this.d = btpcVar;
        this.e = dxioVar;
        this.b = beipVar;
        this.f = bvrbVar;
        this.h = buzkVar;
    }

    private final void e() {
        if (this.g != null) {
            return;
        }
        btlu j = this.e.a().j();
        if (!btlu.i(j).equals(btlt.GOOGLE)) {
            return;
        }
        dbsk.s(j);
        this.g = j;
    }

    @Override // defpackage.beid
    @dzsi
    public final crzm<apsi<dbsg<dgac>>> a(bwrs<ilo> bwrsVar) {
        btlu btluVar;
        e();
        if (bwrsVar.c() == null || (btluVar = this.g) == null) {
            return null;
        }
        beip beipVar = this.b;
        String str = btluVar.d;
        ilo c2 = bwrsVar.c();
        dbsk.s(c2);
        dbsi<String, String> a2 = dbsi.a(str, c2.cQ());
        if (!beipVar.a.containsKey(a2)) {
            beipVar.a.put(a2, new crzo<>());
        }
        return beipVar.a.get(a2).a;
    }

    @Override // defpackage.beid
    public final void b(bwrs<ilo> bwrsVar) {
        c(bwrsVar, dgab.TRACKING);
    }

    public final void c(bwrs<ilo> bwrsVar, dgab dgabVar) {
        btlu btluVar;
        e();
        if (bwrsVar.c() == null || (btluVar = this.g) == null) {
            return;
        }
        String str = btluVar.d;
        ilo c2 = bwrsVar.c();
        dbsk.s(c2);
        String cQ = c2.cQ();
        dbsg<dgac> j = dbsg.j(beno.b(bwrsVar));
        boolean contains = a.contains(dgabVar);
        if (!this.d.i() || cQ.isEmpty()) {
            if (contains) {
                return;
            }
            this.b.a(str, cQ, 2, j);
            return;
        }
        dfzz bZ = dgac.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgac dgacVar = (dgac) bZ.b;
        dgacVar.b = dgabVar.j;
        dgacVar.a |= 1;
        dgac bK = bZ.bK();
        dkax bZ2 = dkay.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkay dkayVar = (dkay) bZ2.b;
        cQ.getClass();
        int i = dkayVar.a | 1;
        dkayVar.a = i;
        dkayVar.b = cQ;
        bK.getClass();
        dkayVar.c = bK;
        dkayVar.a = 2 | i;
        dqoi bZ3 = dqoj.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dqoj dqojVar = (dqoj) bZ3.b;
        dqojVar.a |= 1;
        dqojVar.b = true;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkay dkayVar2 = (dkay) bZ2.b;
        dqoj bK2 = bZ3.bK();
        bK2.getClass();
        dkayVar2.d = bK2;
        dkayVar2.a |= 4;
        dnqg bZ4 = dnqh.p.bZ();
        int i2 = ddda.aF.b;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ4.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i2;
        dnqh bK3 = bZ4.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkay dkayVar3 = (dkay) bZ2.b;
        bK3.getClass();
        dkayVar3.e = bK3;
        dkayVar3.a |= 8;
        this.h.b(bZ2.bK(), new bein(this, bwrsVar, str, cQ, bK, contains, j), this.f.h());
        if (contains) {
            return;
        }
        this.b.a(str, cQ, 1, j);
    }

    public final boolean d(bwrs<ilo> bwrsVar, String str, String str2) {
        btlu j = this.e.a().j();
        if (bwrsVar.c() == null || j == null || !j.d.equals(str)) {
            return true;
        }
        ilo c2 = bwrsVar.c();
        dbsk.s(c2);
        return !c2.cQ().equals(str2);
    }
}
