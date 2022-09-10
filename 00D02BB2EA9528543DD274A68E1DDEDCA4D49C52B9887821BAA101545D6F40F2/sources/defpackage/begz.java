package defpackage;
/* compiled from: PG */
/* renamed from: begz  reason: default package */
/* loaded from: classes3.dex */
public class begz implements jbm {
    private final dxio<brba> a;
    private final cklq b;
    private final ilo c;

    public begz(dxio<brba> dxioVar, cklq cklqVar, ilo iloVar) {
        this.a = dxioVar;
        this.b = cklqVar;
        this.c = iloVar;
    }

    @Override // defpackage.jbm
    @dzsi
    public cqtd a() {
        return cqrt.g(2131232414, ibm.p());
    }

    @Override // defpackage.jbm
    public String b() {
        return this.c.au();
    }

    @Override // defpackage.jbm
    public cjtd c() {
        dpvf dpvfVar;
        if (this.c.at() != null) {
            dpvg at = this.c.at();
            dbsk.s(at);
            dpvfVar = dpvf.b(at.b);
            if (dpvfVar == null) {
                dpvfVar = dpvf.UNKNOWN_CATEGORY;
            }
        } else {
            dpvfVar = dpvf.UNKNOWN_CATEGORY;
        }
        cjta b = cjtd.b();
        b.d = dtxw.dp;
        ddes bZ = ddet.D.bZ();
        ddfc bZ2 = ddfd.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddfd ddfdVar = (ddfd) bZ2.b;
        ddfdVar.b = dpvfVar.an;
        ddfdVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddfd bK = bZ2.bK();
        bK.getClass();
        ddetVar.q = bK;
        ddetVar.a |= 32768;
        b.s(bZ.bK());
        return b.a();
    }

    @Override // defpackage.jbm
    public cqkl d(cjqm cjqmVar) {
        dpvg at = this.c.at();
        iqy iqyVar = new iqy();
        iqyVar.d = iqx.TRAVERSAL;
        if (at != null) {
            this.b.a(ckls.NEARBY_PLACES_BUTTON_CLICKED);
            brba a = this.a.a();
            dnqg bZ = dnqh.p.bZ();
            int i = ddda.aA.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ.b;
            dnqhVar.a |= 64;
            dnqhVar.g = i;
            String b = cjqmVar.a().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            b.getClass();
            dnqhVar2.a |= 2;
            dnqhVar2.c = b;
            dnqh bK = bZ.bK();
            dnng dnngVar = this.c.h().X;
            if (dnngVar == null) {
                dnngVar = dnng.r;
            }
            dnnn dnnnVar = dnngVar.b;
            if (dnnnVar == null) {
                dnnnVar = dnnn.l;
            }
            dpvf b2 = dpvf.b(at.b);
            if (b2 == null) {
                b2 = dpvf.UNKNOWN_CATEGORY;
            }
            dnnn dnnnVar2 = null;
            if (b2 == dpvf.HOTELS && aehr.c(dnnnVar)) {
                dnnnVar2 = dnnnVar;
            }
            a.Q(at, bK, null, iqyVar, dnnnVar2);
        }
        return cqkl.a;
    }
}
