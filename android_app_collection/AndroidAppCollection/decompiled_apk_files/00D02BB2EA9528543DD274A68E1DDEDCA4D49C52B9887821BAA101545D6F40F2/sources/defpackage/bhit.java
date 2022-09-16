package defpackage;
/* compiled from: PG */
/* renamed from: bhit  reason: default package */
/* loaded from: classes3.dex */
public class bhit implements bhin {
    private static final dcqe b = dcqe.c("bhit");
    String a;
    private final bhhf c;
    private final bhje d;
    private final bvjj e;
    @dzsi
    private bwrs<ilo> f;

    public bhit(cqhn cqhnVar, bhhf bhhfVar, bhje bhjeVar, bvjj bvjjVar) {
        this.c = bhhfVar;
        this.d = bhjeVar;
        this.e = bvjjVar;
    }

    private static bvjk g(String str) {
        return new bvjk(str.length() != 0 ? "MERCHANT_MODE_ADS_UPSELL_CARD_DISMISSED_".concat(str) : new String("MERCHANT_MODE_ADS_UPSELL_CARD_DISMISSED_"), bvjk.b);
    }

    @Override // defpackage.bhin
    public cjtd a(ddho ddhoVar) {
        bwrs<ilo> bwrsVar = this.f;
        dbsk.s(bwrsVar);
        ilo c = bwrsVar.c();
        dbsk.s(c);
        cjta c2 = cjtd.c(c.a());
        c2.d = ddhoVar;
        return c2.a();
    }

    @Override // defpackage.bhin
    public cqkl b() {
        String str = this.a;
        if (str != null) {
            this.e.S(g(str), true);
            cqkx.p(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.bhin
    public cqkl c() {
        ilo iloVar = (ilo) bwrs.b(this.f);
        if (iloVar != null) {
            dvwi dvwiVar = iloVar.bf().v;
            if (dvwiVar == null) {
                dvwiVar = dvwi.m;
            }
            dvwh dvwhVar = dvwiVar.k;
            if (dvwhVar == null) {
                dvwhVar = dvwh.e;
            }
            dnpq dnpqVar = dvwhVar.d;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
            this.d.a(dnpqVar.c);
        }
        return cqkl.a;
    }

    @Override // defpackage.bhin
    public String d() {
        ilo iloVar = (ilo) bwrs.b(this.f);
        if (iloVar == null) {
            return "";
        }
        dvwi dvwiVar = iloVar.bf().v;
        if (dvwiVar == null) {
            dvwiVar = dvwi.m;
        }
        dvwh dvwhVar = dvwiVar.k;
        if (dvwhVar == null) {
            dvwhVar = dvwh.e;
        }
        return dvwhVar.a;
    }

    @Override // defpackage.bhin
    public String e() {
        ilo iloVar = (ilo) bwrs.b(this.f);
        if (iloVar == null) {
            return "";
        }
        dvwi dvwiVar = iloVar.bf().v;
        if (dvwiVar == null) {
            dvwiVar = dvwi.m;
        }
        dvwh dvwhVar = dvwiVar.k;
        if (dvwhVar == null) {
            dvwhVar = dvwh.e;
        }
        return dvwhVar.b;
    }

    @Override // defpackage.bhin
    public String f() {
        ilo iloVar = (ilo) bwrs.b(this.f);
        if (iloVar == null) {
            return "";
        }
        dvwi dvwiVar = iloVar.bf().v;
        if (dvwiVar == null) {
            dvwiVar = dvwi.m;
        }
        dvwh dvwhVar = dvwiVar.k;
        if (dvwhVar == null) {
            dvwhVar = dvwh.e;
        }
        return dvwhVar.c;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        if (c == null) {
            bvoo.h("Placemark should not be null.", new Object[0]);
            return;
        }
        this.f = bwrsVar;
        this.a = c.cQ();
    }

    @Override // defpackage.bega
    public void u() {
        this.f = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        ilo iloVar;
        String str = this.a;
        boolean z = false;
        if (str == null) {
            return false;
        }
        if (!this.e.m(g(str), false)) {
            bhhf bhhfVar = this.c;
            if (bhhfVar.b(this.f) && bhhfVar.a.getMerchantModeParameters().t && (iloVar = (ilo) bwrs.b(this.f)) != null) {
                dvwi dvwiVar = iloVar.bf().v;
                if (dvwiVar == null) {
                    dvwiVar = dvwi.m;
                }
                if ((dvwiVar.a & 2048) != 0) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
