package defpackage;
/* compiled from: PG */
/* renamed from: bhsh  reason: default package */
/* loaded from: classes3.dex */
public class bhsh implements bhrx, bega {
    public dbsg<bwrs<ilo>> a = dbpy.a;
    public final dxio<bhng> b;
    private boolean c;
    private boolean d;
    private final btvo e;
    private final dxio<cclq> f;
    private final dxio<begg> g;
    private final cclp h;
    private final bhru i;
    private final bhsk j;
    private final boolean k;
    private final bhhf l;
    private final iic m;
    private iib n;

    public bhsh(btvo btvoVar, huc hucVar, dxio<bhng> dxioVar, dxio<cclq> dxioVar2, dxio<begg> dxioVar3, cclp cclpVar, bhru bhruVar, bhsk bhskVar, bvpe bvpeVar, bvjj bvjjVar, bhtp bhtpVar, bhhf bhhfVar) {
        this.e = btvoVar;
        this.b = dxioVar;
        this.f = dxioVar2;
        this.g = dxioVar3;
        this.h = cclpVar;
        this.i = bhruVar;
        this.j = bhskVar;
        this.k = bvjjVar.m(bvjk.kg, false);
        this.l = bhhfVar;
        cjta b = cjtd.b();
        b.d = dtxx.v;
        final cjtd a = b.a();
        bvob bvobVar = new bvob(bvpeVar.b, hucVar.a(new htz(a) { // from class: bhsf
            private final cjtd a;

            {
                this.a = a;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a;
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        }));
        iic j = iid.j();
        j.e(dcdc.e());
        ifj ifjVar = (ifj) j;
        ifjVar.e = bvobVar;
        ifjVar.f = a;
        this.m = j;
        this.n = j.f();
    }

    private final void h() {
        this.a = dbpy.a;
        i(dcdc.e());
        this.c = false;
        this.d = false;
    }

    private final void i(dcdc<bhsl> dcdcVar) {
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            F.g(cqgr.fT(new bhor(dtxx.x), dcdcVar.get(i)));
        }
        iic iicVar = this.m;
        iicVar.e(F.f());
        this.n = iicVar.f();
    }

    @Override // defpackage.bhrx
    public Boolean a() {
        boolean z = false;
        if (this.c && this.g.a().i(bege.MENU)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhrx
    public cqkl b() {
        if (a().booleanValue()) {
            this.g.a().k(bege.MENU);
        }
        return cqkl.a;
    }

    @Override // defpackage.bhrx
    public Boolean c() {
        bwrs<ilo> b = this.a.b();
        dbsk.s(b);
        ilo c = b.c();
        boolean z = false;
        if (this.e.getUgcOfferingsParameters().a()) {
            dbsk.s(c);
            if (c.aX(this.e.getEnableFeatureParameters())) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhrx
    public cqkl d() {
        dbsk.l(this.a.a());
        if (e().booleanValue()) {
            dbsk.s(this.a.b().c());
            this.f.a().n(this.a.b());
        } else {
            this.f.a().k(this.a.b());
        }
        return cqkl.a;
    }

    @Override // defpackage.bhrx
    public Boolean e() {
        if (!this.a.a()) {
            return false;
        }
        return Boolean.valueOf(this.l.b(this.a.b()));
    }

    @Override // defpackage.bhrx
    public iib f() {
        return this.n;
    }

    @Override // defpackage.bhrx
    public Boolean g() {
        boolean z = true;
        if (!this.k && !this.e.getPlaceOfferingsParametersWithoutLogging().i) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        h();
        this.a = dbsg.i(bwrsVar);
        this.h.a(bwrsVar);
        i(this.j.a(this.h, dgfb.DISH, new bvqg(this) { // from class: bhsg
            private final bhsh a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                bhsh bhshVar = this.a;
                dbsk.l(bhshVar.a.a());
                bhshVar.b.a().a((ccln) obj, bhshVar.a.b());
            }
        }));
        this.c = this.i.f(this.h);
        this.d = this.i.c(this.h);
    }

    @Override // defpackage.bega
    public void u() {
        h();
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.d);
    }
}
