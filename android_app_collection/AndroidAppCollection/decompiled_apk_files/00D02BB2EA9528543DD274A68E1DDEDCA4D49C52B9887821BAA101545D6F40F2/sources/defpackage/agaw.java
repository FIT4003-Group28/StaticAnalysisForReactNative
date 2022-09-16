package defpackage;
/* compiled from: PG */
/* renamed from: agaw  reason: default package */
/* loaded from: classes2.dex */
public class agaw {
    public final cqhn a;
    public final gga b;
    public final dxio<cztz> c;
    public final dxio<cafi> d;
    public final dxio<ache> e;
    public final dxio<akfa> f;
    public final akfc g;
    public final dxio<axwi> h;
    public final dxio<baju> i;
    public final dehq j;
    public final dehq k;
    public final agbv<akqi> l;
    private final dxio<bvjj> m;
    private final dxio<bwqv> n;
    private final dxio<axwp> o;
    private final dxio<axwy> p;
    private final dxio<begg> q;
    private final dxio<ania> r;

    public agaw(cqhn cqhnVar, gga ggaVar, dxio<cztz> dxioVar, dxio<cafi> dxioVar2, dxio<ache> dxioVar3, dxio<bvjj> dxioVar4, dxio<bwqv> dxioVar5, dxio<akfa> dxioVar6, akfc akfcVar, dxio<axwp> dxioVar7, dxio<axwy> dxioVar8, dxio<axwi> dxioVar9, dxio<begg> dxioVar10, dxio<ania> dxioVar11, dxio<baju> dxioVar12, dehq dehqVar, dehq dehqVar2, agbv<akqi> agbvVar) {
        this.a = cqhnVar;
        this.b = ggaVar;
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = dxioVar3;
        this.m = dxioVar4;
        this.n = dxioVar5;
        this.f = dxioVar6;
        this.g = akfcVar;
        this.o = dxioVar7;
        this.p = dxioVar8;
        this.h = dxioVar9;
        this.q = dxioVar10;
        this.r = dxioVar11;
        this.i = dxioVar12;
        this.j = dehqVar;
        this.k = dehqVar2;
        this.l = agbvVar;
    }

    public static final boolean f(ilo iloVar) {
        return akqi.d(iloVar.ai()) && iloVar.aj() != null;
    }

    public final void a(ilo iloVar, @dzsi bege begeVar, jjn jjnVar) {
        begj begjVar = new begj();
        begjVar.b(iloVar);
        begjVar.c = jjnVar;
        begjVar.e = begeVar;
        begjVar.n = true;
        begjVar.c(false);
        this.q.a().o(begjVar, false, null);
    }

    @dzsi
    public final azwv b(ilo iloVar) {
        return this.o.a().a(azxb.f(iloVar.ai(), iloVar.aj()));
    }

    public final void c(final ilo iloVar) {
        bwrs<ilo> a = bwrs.a(iloVar);
        this.n.a().f(a, new bwrr(this, iloVar) { // from class: agao
            private final agaw a;
            private final ilo b;

            {
                this.a = this;
                this.b = iloVar;
            }

            @Override // defpackage.bwrr
            public final void PV(Object obj) {
                ilo iloVar2 = (ilo) obj;
                this.a.l.b(this.b.ai());
            }
        }, false);
        this.p.a().j(a);
    }

    public final void d(final boolean z, final achc achcVar, dehn<achb> dehnVar) {
        bvqj.e(dehnVar, new bvqg(this, z, achcVar) { // from class: agap
            private final agaw a;
            private final boolean b;
            private final achc c;

            {
                this.a = this;
                this.b = z;
                this.c = achcVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.e.a().k(this.b, true, this.c, (achb) obj);
            }
        }, this.k);
    }

    public final boolean e(@dzsi btlu btluVar) {
        return this.r.a().b(btluVar) && !this.m.a().o(bvjk.gK, btluVar, false);
    }
}
