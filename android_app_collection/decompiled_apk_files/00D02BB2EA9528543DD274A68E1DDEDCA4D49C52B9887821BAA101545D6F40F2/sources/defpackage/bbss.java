package defpackage;
/* compiled from: PG */
/* renamed from: bbss  reason: default package */
/* loaded from: classes3.dex */
public final class bbss extends bbui {
    private String d;
    private dwyd e;
    private cjqm f;
    private dceq<bbvh, bbtj> i;
    private dcet<bbvh, bbtj> j;
    private dceq<bbvh, bbtn> k;
    private dcet<bbvh, bbtn> l;
    private dbsg<bbuk> g = dbpy.a;
    public dbsg<cdfp> a = dbpy.a;
    private dbsg<dcdc<String>> h = dbpy.a;
    public dbsg<Integer> b = dbpy.a;
    public dbsg<Boolean> c = dbpy.a;

    @Override // defpackage.bbui
    public final dbsg<dcdc<String>> a() {
        return this.h;
    }

    @Override // defpackage.bbui
    public final dceq<bbvh, bbtj> b() {
        if (this.i == null) {
            this.i = dcet.a();
        }
        return this.i;
    }

    @Override // defpackage.bbui
    public final dcet<bbvh, bbtj> c() {
        dceq<bbvh, bbtj> dceqVar = this.i;
        if (dceqVar != null) {
            return dceqVar.a();
        }
        if (this.j == null) {
            this.j = dcay.a;
        }
        return this.j;
    }

    @Override // defpackage.bbui
    public final dceq<bbvh, bbtn> d() {
        if (this.k == null) {
            this.k = dcet.a();
        }
        return this.k;
    }

    @Override // defpackage.bbui
    public final dcet<bbvh, bbtn> e() {
        dceq<bbvh, bbtn> dceqVar = this.k;
        if (dceqVar != null) {
            return dceqVar.a();
        }
        if (this.l == null) {
            this.l = dcay.a;
        }
        return this.l;
    }

    @Override // defpackage.bbui
    public final bbuj f() {
        dceq<bbvh, bbtj> dceqVar = this.i;
        if (dceqVar != null) {
            this.j = dceqVar.a();
        } else if (this.j == null) {
            this.j = dcay.a;
        }
        dceq<bbvh, bbtn> dceqVar2 = this.k;
        if (dceqVar2 != null) {
            this.l = dceqVar2.a();
        } else if (this.l == null) {
            this.l = dcay.a;
        }
        String str = this.d == null ? " accountName" : "";
        if (this.e == null) {
            str = str.concat(" entryPoint");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" loggedInteraction");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bbst(this.d, this.e, this.f, this.g, this.a, this.h, this.b, this.c, this.j, this.l);
    }

    @Override // defpackage.bbui
    public final void g(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }

    @Override // defpackage.bbui
    public final void h(dwyd dwydVar) {
        if (dwydVar != null) {
            this.e = dwydVar;
            return;
        }
        throw new NullPointerException("Null entryPoint");
    }

    @Override // defpackage.bbui
    public final void i(cjqm cjqmVar) {
        if (cjqmVar != null) {
            this.f = cjqmVar;
            return;
        }
        throw new NullPointerException("Null loggedInteraction");
    }

    @Override // defpackage.bbui
    public final void j(dbsg<dcdc<String>> dbsgVar) {
        this.h = dbsgVar;
    }

    @Override // defpackage.bbui
    public final void k(dcdc<String> dcdcVar) {
        this.h = dbsg.i(dcdcVar);
    }

    @Override // defpackage.bbui
    public final void l(bbuk bbukVar) {
        this.g = dbsg.i(bbukVar);
    }
}
