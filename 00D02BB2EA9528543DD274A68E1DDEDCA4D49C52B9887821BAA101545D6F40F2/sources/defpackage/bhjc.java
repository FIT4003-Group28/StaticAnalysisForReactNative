package defpackage;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bhjc  reason: default package */
/* loaded from: classes3.dex */
public class bhjc implements bhis, bega {
    private static final dcqe b = dcqe.c("bhjc");
    public final bhhf a;
    private final bbut c;
    private final boxa d;
    private final apup e;
    private final apus f;
    private final bhhy g;
    private final bhit h;
    private final bhje i;
    private final dxio<bhix> j;
    @dzsi
    private bwrs<ilo> k;
    private Set<dboe> l = EnumSet.noneOf(dboe.class);

    public bhjc(bhhf bhhfVar, bbut bbutVar, boxa boxaVar, apup apupVar, apus apusVar, bhhy bhhyVar, bhit bhitVar, dxio<bhix> dxioVar, bhje bhjeVar) {
        this.a = bhhfVar;
        this.c = bbutVar;
        this.d = boxaVar;
        this.e = apupVar;
        this.f = apusVar;
        this.g = bhhyVar;
        this.h = bhitVar;
        this.j = dxioVar;
        this.i = bhjeVar;
    }

    private final Boolean z() {
        ilo iloVar = (ilo) bwrs.b(this.k);
        boolean z = false;
        if (iloVar != null && iloVar.bf() != null) {
            dvwi dvwiVar = iloVar.bf().v;
            if (dvwiVar == null) {
                dvwiVar = dvwi.m;
            }
            if ((dvwiVar.a & 256) != 0) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhis
    public cqkl a() {
        ilo iloVar = (ilo) bwrs.b(this.k);
        if (iloVar == null || !w().booleanValue()) {
            return cqkl.a;
        }
        bbut bbutVar = this.c;
        bbuz m = bbve.m();
        m.b(bbuy.SHOW_PLACESHEET_PHOTOS_TAB_AND_MERCHANT_MODE_SNACKBAR);
        m.e(dwyd.MERCHANT_MODE_TOOLBAR);
        ((bbsu) m).b = iloVar;
        bbutVar.j(m.a());
        return cqkl.a;
    }

    @Override // defpackage.bhis
    public cqkl b() {
        ilo iloVar = (ilo) bwrs.b(this.k);
        if (iloVar == null || !w().booleanValue()) {
            return cqkl.a;
        }
        bhhy bhhyVar = this.g;
        bhhu e = bhhx.e();
        bhhq bhhqVar = (bhhq) e;
        bhhqVar.d = 2;
        bhhqVar.a = bhhw.g();
        bhhqVar.c = dwyd.MERCHANT_MODE_ADD_MENU_PHOTOS;
        bhhqVar.b = iloVar;
        bhhyVar.e(e.a());
        return cqkl.a;
    }

    @Override // defpackage.bhis
    public cqkl c() {
        ilo iloVar = (ilo) bwrs.b(this.k);
        if (iloVar == null || !w().booleanValue()) {
            return cqkl.a;
        }
        dobr cy = iloVar.cy();
        if (cy != null) {
            for (dobk dobkVar : cy.f) {
                int a = dobj.a(dobkVar.c);
                if (a != 0 && a == 2 && dobkVar.a == 2) {
                    dnps bZ = dnqe.i.bZ();
                    dnqb dnqbVar = dnqb.MERCHANT_MODE_TOOLBAR;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnqe dnqeVar = (dnqe) bZ.b;
                    dnqeVar.b = dnqbVar.ah;
                    dnqeVar.a |= 1;
                    dnqe dnqeVar2 = (dnqe) bZ.b;
                    dnqeVar2.c = 1;
                    dnqeVar2.a |= 2;
                    this.d.C(bwrs.a(iloVar), bZ.bK(), dobkVar.a == 2 ? (String) dobkVar.b : "");
                    return cqkl.a;
                }
            }
        }
        this.d.F(bwrs.a(iloVar));
        return cqkl.a;
    }

    @Override // defpackage.bhis
    public cqkl d() {
        ilo iloVar = (ilo) bwrs.b(this.k);
        if (iloVar != null) {
            dvwi dvwiVar = iloVar.bf().v;
            if (dvwiVar == null) {
                dvwiVar = dvwi.m;
            }
            dnpq dnpqVar = dvwiVar.h;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
            this.i.a(dnpqVar.c);
        }
        return cqkl.a;
    }

    @Override // defpackage.bhis
    public cqkl e() {
        bwrs<ilo> bwrsVar = this.k;
        if (bwrsVar != null) {
            this.f.e(bwrsVar, false);
        }
        return cqkl.a;
    }

    @Override // defpackage.bhis
    public cqkl f() {
        bwrs<ilo> bwrsVar = this.k;
        if (bwrsVar != null) {
            this.e.e(bwrsVar, dboe.EVENT);
        }
        return cqkl.a;
    }

    @Override // defpackage.bhis
    public cqkl g() {
        bwrs<ilo> bwrsVar = this.k;
        if (bwrsVar != null) {
            this.e.e(bwrsVar, dboe.OFFER);
        }
        return cqkl.a;
    }

    @Override // defpackage.bhis
    public cqkl h() {
        bwrs<ilo> bwrsVar = this.k;
        if (bwrsVar != null) {
            this.e.e(bwrsVar, dboe.PRODUCT);
        }
        return cqkl.a;
    }

    @Override // defpackage.bhis
    public cqkl i() {
        bwrs<ilo> bwrsVar = this.k;
        if (bwrsVar != null) {
            this.e.e(bwrsVar, dboe.STANDARD);
        }
        return cqkl.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // defpackage.bhis
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean j(java.lang.Boolean r5) {
        /*
            r4 = this;
            bwrs<ilo> r0 = r4.k
            java.io.Serializable r0 = defpackage.bwrs.b(r0)
            ilo r0 = (defpackage.ilo) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            dvxh r3 = r0.bf()
            if (r3 == 0) goto L24
            dvxh r0 = r0.bf()
            dvwi r0 = r0.v
            if (r0 != 0) goto L1c
            dvwi r0 = defpackage.dvwi.m
        L1c:
            int r0 = r0.a
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L34
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L34:
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L47
            bhhf r5 = r4.a
            bwrs<ilo> r0 = r4.k
            boolean r5 = r5.k(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L47:
            bhhf r5 = r4.a
            bwrs<ilo> r0 = r4.k
            boolean r0 = r5.b(r0)
            if (r0 == 0) goto L66
            btvo r5 = r5.a
            dkpa r5 = r5.getMerchantModeParameters()
            boolean r5 = r5.r
            if (r5 == 0) goto L66
            bhhf r5 = r4.a
            bwrs<ilo> r0 = r4.k
            boolean r5 = r5.k(r0)
            if (r5 != 0) goto L66
            goto L67
        L66:
            r1 = 0
        L67:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhjc.j(java.lang.Boolean):java.lang.Boolean");
    }

    @Override // defpackage.bhis
    public Boolean k() {
        int a;
        boolean z = false;
        if (z().booleanValue()) {
            bhhf bhhfVar = this.a;
            if (bhhfVar.m(this.k) && (a = dkoz.a(bhhfVar.a.getMerchantModeParameters().j)) != 0 && a == 2) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhis
    public Boolean l() {
        int a;
        boolean z = false;
        if (z().booleanValue()) {
            bhhf bhhfVar = this.a;
            if (bhhfVar.m(this.k) && (a = dkoz.a(bhhfVar.a.getMerchantModeParameters().j)) != 0 && a == 3) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhis
    public Boolean m() {
        int a;
        boolean z = false;
        if (z().booleanValue()) {
            bhhf bhhfVar = this.a;
            if (bhhfVar.m(this.k) && (a = dkoz.a(bhhfVar.a.getMerchantModeParameters().j)) != 0 && a == 4) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhis
    public Boolean n() {
        int a;
        boolean z = false;
        if (z().booleanValue()) {
            bhhf bhhfVar = this.a;
            if (bhhfVar.m(this.k) && (a = dkoz.a(bhhfVar.a.getMerchantModeParameters().j)) != 0 && a == 5) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhis
    public Boolean o() {
        return Boolean.valueOf(this.l.contains(dboe.EVENT));
    }

    @Override // defpackage.bhis
    public Boolean p() {
        return Boolean.valueOf(this.l.contains(dboe.OFFER));
    }

    @Override // defpackage.bhis
    public Boolean q() {
        return Boolean.valueOf(this.l.contains(dboe.STANDARD));
    }

    @Override // defpackage.bhis
    public Boolean r() {
        return Boolean.valueOf(this.l.contains(dboe.PRODUCT));
    }

    @Override // defpackage.bhis
    public Boolean s() {
        ilo iloVar = (ilo) bwrs.b(this.k);
        if (iloVar == null || !this.a.p(iloVar)) {
            return false;
        }
        bhhy bhhyVar = this.g;
        bhhu e = bhhx.e();
        bhhq bhhqVar = (bhhq) e;
        bhhqVar.d = 2;
        bhhqVar.b = iloVar;
        return Boolean.valueOf(bhhyVar.i(e.a()));
    }

    @Override // defpackage.bega
    public void t(final bwrs<ilo> bwrsVar) {
        this.k = bwrsVar;
        if (!this.a.d(bwrsVar)) {
            return;
        }
        if (bwrsVar.c() == null) {
            bvoo.h("Placemark cannot be null.", new Object[0]);
            return;
        }
        this.h.t(bwrsVar);
        if (this.a.q(bwrsVar)) {
            this.j.a().t(bwrsVar);
        }
        HashSet d = dcnm.d(dboe.values());
        this.l = d;
        dcft.y(d, new dbsl(this, bwrsVar) { // from class: bhjb
            private final bhjc a;
            private final bwrs b;

            {
                this.a = this;
                this.b = bwrsVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return !this.a.a.j(this.b, (dboe) obj);
            }
        });
    }

    @Override // defpackage.bega
    public void u() {
        this.l.clear();
        this.k = null;
    }

    @Override // defpackage.bhis
    public cjtd v(ddho ddhoVar) {
        bwrs<ilo> bwrsVar = this.k;
        dbsk.s(bwrsVar);
        ilo c = bwrsVar.c();
        dbsk.s(c);
        cjta c2 = cjtd.c(c.bZ());
        c2.d = ddhoVar;
        return c2.a();
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.a.d(this.k));
    }

    @Override // defpackage.bhis
    @dzsi
    public bhin x() {
        if (!this.h.w().booleanValue() || y() != null) {
            return null;
        }
        return this.h;
    }

    @Override // defpackage.bhis
    @dzsi
    public bhip y() {
        if (!this.a.q(this.k) || !this.j.a().a().booleanValue()) {
            return null;
        }
        return this.j.a();
    }
}
