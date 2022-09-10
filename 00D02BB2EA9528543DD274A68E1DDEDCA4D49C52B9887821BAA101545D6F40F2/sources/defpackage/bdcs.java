package defpackage;
/* compiled from: PG */
/* renamed from: bdcs  reason: default package */
/* loaded from: classes3.dex */
public class bdcs implements bdan {
    private final dzsj<axwy> a;
    private final dzsj<bbut> b;
    private final bnju c;
    private final axyp d;
    private final bbtq e;
    @dzsi
    private axyo f;
    @dzsi
    private bwrs<ilo> g;

    public bdcs(ilo iloVar, bbtq bbtqVar, bnjv bnjvVar, dzsj<axwy> dzsjVar, dzsj<bbut> dzsjVar2, axyp axypVar) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.g = bwrs.a(iloVar);
        this.e = bbtqVar;
        this.c = bnjvVar.a(iloVar).a();
        this.d = axypVar;
        this.f = axypVar.a(iloVar);
    }

    private final cjtd m(ddho ddhoVar) {
        cjta c = cjtd.c(this.c.b());
        c.d = ddhoVar;
        return c.a();
    }

    @Override // defpackage.bdan
    public Boolean a() {
        return this.c.D();
    }

    @Override // defpackage.bdan
    public Boolean b() {
        bwrs<ilo> bwrsVar = this.g;
        boolean z = false;
        if (bwrsVar == null) {
            return false;
        }
        ilo c = bwrsVar.c();
        if (c != null && c.bM()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdan
    public Boolean c() {
        bwrs<ilo> bwrsVar = this.g;
        boolean z = false;
        if (bwrsVar == null) {
            return false;
        }
        ilo c = bwrsVar.c();
        if (c != null && !c.i) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdan
    public cqkl d() {
        this.c.G();
        return cqkl.a;
    }

    @Override // defpackage.bdan
    public cqkl e() {
        if (this.g != null) {
            bwrs<ilo> bwrsVar = this.g;
            dbsk.s(bwrsVar);
            this.b.a().l(bwrsVar, null, bbur.DEFAULT);
        }
        return cqkl.a;
    }

    @Override // defpackage.bdan
    public cqkl f() {
        bwrs<ilo> bwrsVar = this.g;
        if (bwrsVar != null) {
            this.a.a().j(bwrsVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.bdan
    @dzsi
    public cqtd g() {
        axyo axyoVar = this.f;
        if (axyoVar != null) {
            return axyoVar.d();
        }
        return null;
    }

    @Override // defpackage.bdan
    public String h() {
        axyo axyoVar = this.f;
        return axyoVar != null ? axyoVar.g() : "";
    }

    @Override // defpackage.bdan
    public cjtd i() {
        return m(this.e.c());
    }

    @Override // defpackage.bdan
    public cjtd j() {
        return m(this.e.d());
    }

    @Override // defpackage.bdan
    public cjtd k() {
        return m(this.e.e());
    }

    public void l(bwrs<ilo> bwrsVar) {
        axyo axyoVar;
        this.g = bwrsVar;
        ilo c = bwrsVar.c();
        if (c != null) {
            this.c.au(c);
            axyoVar = this.d.a(c);
        } else {
            axyoVar = null;
        }
        this.f = axyoVar;
    }
}
