package defpackage;
/* compiled from: PG */
/* renamed from: bruj  reason: default package */
/* loaded from: classes4.dex */
public abstract class bruj implements brvb {
    protected final brsc a;
    protected cjtd b;
    protected brrx c;
    @dzsi
    public bwrs<ilo> d;

    /* JADX INFO: Access modifiers changed from: protected */
    public bruj(brsc brscVar, brrx brrxVar) {
        this.b = cjtd.b;
        this.a = brscVar;
        this.c = brrxVar;
        this.b = brscVar.b(brrxVar);
    }

    protected abstract String c();

    @Override // defpackage.brvb
    public Boolean e() {
        return q();
    }

    @Override // defpackage.brvb
    public Boolean g() {
        return false;
    }

    @Override // defpackage.brvb
    public cqkl h(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.brvb
    public void i(bwrs<ilo> bwrsVar) {
        this.d = bwrsVar;
        brsc brscVar = this.a;
        brscVar.a = bwrsVar;
        this.b = brscVar.b(this.c);
    }

    @Override // defpackage.brvb
    public void j(brrx brrxVar) {
        this.c = brrxVar;
        this.b = this.a.b(brrxVar);
    }

    @Override // defpackage.brvb
    public String k() {
        return this.c.e().c(c());
    }

    @Override // defpackage.brvb
    public cjtd l() {
        return this.b;
    }

    @Override // defpackage.brvb
    public Boolean m() {
        return Boolean.valueOf(this.c.c());
    }

    @Override // defpackage.brvb
    public dghs n() {
        return this.c.a();
    }

    public brrw o() {
        return this.c.g();
    }

    @Override // defpackage.brvb
    public Boolean p() {
        return Boolean.valueOf(this.c.d());
    }

    @Override // defpackage.brvb
    public Boolean q() {
        boolean z = true;
        if (this.c.g() != brrw.TRAVERSAL_SIDE_SECTION && this.c.g() != brrw.CATEGORICAL_SEARCH_LIST && this.c.g() != brrw.PLACE_LIST) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public final ilo r() {
        bwrs<ilo> bwrsVar = this.d;
        if (bwrsVar != null) {
            return bwrsVar.c();
        }
        return null;
    }
}
