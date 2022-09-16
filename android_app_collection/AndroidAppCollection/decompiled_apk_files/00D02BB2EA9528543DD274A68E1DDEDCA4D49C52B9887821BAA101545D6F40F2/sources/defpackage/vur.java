package defpackage;
/* compiled from: PG */
/* renamed from: vur  reason: default package */
/* loaded from: classes7.dex */
public final class vur extends vut {
    private vtp A;
    private Boolean B;
    private dbty<alfa> C;
    private dbty<alfb> D;
    private Boolean E;
    private int F;
    private int G;
    public amuo a;
    public Runnable b;
    public amvh c;
    private amuh d;
    private Boolean e;
    private dcdc<vto> f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private dcdc<akqq> l;
    private dcdc<akqq> m;
    private dcdc<akqq> n;
    private dcdc<akpp> o;
    private akps p;
    private Boolean q;
    private Boolean r;
    private Boolean s;
    private Boolean t;
    private Boolean u;
    private Boolean v;
    private Boolean w;
    private Integer x;
    private Integer y;
    private Integer z;

    public vur() {
    }

    public vur(vuv vuvVar) {
        vus vusVar = (vus) vuvVar;
        this.d = vusVar.a;
        this.e = Boolean.valueOf(vusVar.b);
        this.f = vusVar.c;
        this.g = Boolean.valueOf(vusVar.d);
        this.h = Boolean.valueOf(vusVar.e);
        this.i = Boolean.valueOf(vusVar.f);
        this.j = Boolean.valueOf(vusVar.g);
        this.k = Boolean.valueOf(vusVar.h);
        this.a = vusVar.i;
        this.l = vusVar.j;
        this.m = vusVar.k;
        this.n = vusVar.l;
        this.o = vusVar.m;
        this.p = vusVar.n;
        this.q = Boolean.valueOf(vusVar.o);
        this.G = vusVar.G;
        this.r = Boolean.valueOf(vusVar.p);
        this.s = Boolean.valueOf(vusVar.q);
        this.t = Boolean.valueOf(vusVar.r);
        this.F = vusVar.F;
        this.u = Boolean.valueOf(vusVar.s);
        this.v = Boolean.valueOf(vusVar.t);
        this.w = Boolean.valueOf(vusVar.u);
        this.x = Integer.valueOf(vusVar.v);
        this.y = Integer.valueOf(vusVar.w);
        this.z = Integer.valueOf(vusVar.x);
        this.A = vusVar.y;
        this.B = Boolean.valueOf(vusVar.z);
        this.C = vusVar.A;
        this.D = vusVar.B;
        this.b = vusVar.C;
        this.c = vusVar.D;
        this.E = Boolean.valueOf(vusVar.E);
    }

    @Override // defpackage.vut
    public final void A(amuh amuhVar) {
        if (amuhVar != null) {
            this.d = amuhVar;
            return;
        }
        throw new NullPointerException("Null routes");
    }

    @Override // defpackage.vut
    public final void B(boolean z) {
        this.q = Boolean.valueOf(z);
    }

    @Override // defpackage.vut
    public final void C() {
        this.j = false;
    }

    @Override // defpackage.vut
    public final void D(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.vut
    public final void E(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.vut
    public final void F(boolean z) {
        this.t = Boolean.valueOf(z);
    }

    @Override // defpackage.vut
    public final void G(boolean z) {
        this.u = Boolean.valueOf(z);
    }

    @Override // defpackage.vut
    public final void H(vtp vtpVar) {
        if (vtpVar != null) {
            this.A = vtpVar;
            return;
        }
        throw new NullPointerException("Null textureStrategy");
    }

    @Override // defpackage.vut
    protected final void I(dcdc<vto> dcdcVar) {
        if (dcdcVar != null) {
            this.f = dcdcVar;
            return;
        }
        throw new NullPointerException("Null textureTypes");
    }

    @Override // defpackage.vut
    public final void J(boolean z) {
        this.B = Boolean.valueOf(z);
    }

    @Override // defpackage.vut
    public final void K(dcdc<akqq> dcdcVar) {
        if (dcdcVar != null) {
            this.m = dcdcVar;
            return;
        }
        throw new NullPointerException("Null vehiclesPointsToIncludeInViewport");
    }

    @Override // defpackage.vut
    public final void L() {
        this.s = false;
    }

    @Override // defpackage.vut
    protected final int M() {
        int i = this.G;
        if (i != 0) {
            return i;
        }
        throw new IllegalStateException("Property \"pinDisplayMode\" has not been set");
    }

    @Override // defpackage.vut
    public final void N(int i) {
        if (i != 0) {
            this.G = i;
            return;
        }
        throw new NullPointerException("Null pinDisplayMode");
    }

    @Override // defpackage.vut
    protected final amuh a() {
        amuh amuhVar = this.d;
        if (amuhVar != null) {
            return amuhVar;
        }
        throw new IllegalStateException("Property \"routes\" has not been set");
    }

    @Override // defpackage.vut
    protected final dcdc<akqq> b() {
        dcdc<akqq> dcdcVar = this.l;
        if (dcdcVar != null) {
            return dcdcVar;
        }
        throw new IllegalStateException("Property \"destinations\" has not been set");
    }

    @Override // defpackage.vut
    protected final dcdc<akqq> c() {
        dcdc<akqq> dcdcVar = this.m;
        if (dcdcVar != null) {
            return dcdcVar;
        }
        throw new IllegalStateException("Property \"vehiclesPointsToIncludeInViewport\" has not been set");
    }

    @Override // defpackage.vut
    protected final akps d() {
        akps akpsVar = this.p;
        if (akpsVar != null) {
            return akpsVar;
        }
        throw new IllegalStateException("Property \"pinType\" has not been set");
    }

    @Override // defpackage.vut
    protected final int f() {
        Integer num = this.x;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"framePathIndex\" has not been set");
    }

    @Override // defpackage.vut
    protected final int g() {
        Integer num = this.y;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"frameStepGroupIndex\" has not been set");
    }

    @Override // defpackage.vut
    protected final vtp h() {
        vtp vtpVar = this.A;
        if (vtpVar != null) {
            return vtpVar;
        }
        throw new IllegalStateException("Property \"textureStrategy\" has not been set");
    }

    @Override // defpackage.vut
    public final void j(int i) {
        this.z = Integer.valueOf(i);
    }

    @Override // defpackage.vut
    public final void k(boolean z) {
        this.E = Boolean.valueOf(z);
    }

    @Override // defpackage.vut
    public final void l(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.vut
    public final void m(dbty<alfa> dbtyVar) {
        if (dbtyVar != null) {
            this.C = dbtyVar;
            return;
        }
        throw new NullPointerException("Null calloutDisplayModeSupplier");
    }

    @Override // defpackage.vut
    public final void n(dbty<alfb> dbtyVar) {
        if (dbtyVar != null) {
            this.D = dbtyVar;
            return;
        }
        throw new NullPointerException("Null calloutInfoFormatSupplier");
    }

    @Override // defpackage.vut
    public final void o(dcdc<akqq> dcdcVar) {
        if (dcdcVar != null) {
            this.l = dcdcVar;
            return;
        }
        throw new NullPointerException("Null destinations");
    }

    @Override // defpackage.vut
    public final void p(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    @Override // defpackage.vut
    public final void q(boolean z) {
        this.w = Boolean.valueOf(z);
    }

    @Override // defpackage.vut
    public final void r(int i) {
        this.x = Integer.valueOf(i);
    }

    @Override // defpackage.vut
    public final void s(int i) {
        this.y = Integer.valueOf(i);
    }

    @Override // defpackage.vut
    public final void t(boolean z) {
        this.v = Boolean.valueOf(z);
    }

    @Override // defpackage.vut
    protected final void u(dcdc<akpp> dcdcVar) {
        if (dcdcVar != null) {
            this.o = dcdcVar;
            return;
        }
        throw new NullPointerException("Null mapPinsToDisplay");
    }

    @Override // defpackage.vut
    public final void v(boolean z) {
        this.r = Boolean.valueOf(z);
    }

    @Override // defpackage.vut
    public final void w(int i) {
        if (i != 0) {
            this.F = 1;
            return;
        }
        throw new NullPointerException("Null orientation");
    }

    @Override // defpackage.vut
    public final void x(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    @Override // defpackage.vut
    public final void y(akps akpsVar) {
        if (akpsVar != null) {
            this.p = akpsVar;
            return;
        }
        throw new NullPointerException("Null pinType");
    }

    @Override // defpackage.vut
    protected final void z(dcdc<akqq> dcdcVar) {
        if (dcdcVar != null) {
            this.n = dcdcVar;
            return;
        }
        throw new NullPointerException("Null pointsToIncludeInViewport");
    }

    @Override // defpackage.vut
    protected final boolean e() {
        Boolean bool = this.w;
        if (bool == null) {
            throw new IllegalStateException("Property \"frameFullRoute\" has not been set");
        }
        return bool.booleanValue();
    }

    @Override // defpackage.vut
    protected final vuv i() {
        String str = this.d == null ? " routes" : "";
        if (this.e == null) {
            str = str.concat(" alwaysShowImportantMeasles");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" textureTypes");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" showAlternateRoutes");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" shouldUpdateViewport");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" forceDestinationInViewPort");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" shouldUpdateIndoor");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" pickable");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" destinations");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" vehiclesPointsToIncludeInViewport");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" pointsToIncludeInViewport");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" mapPinsToDisplay");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" pinType");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" shouldShowPolylines");
        }
        if (this.G == 0) {
            str = String.valueOf(str).concat(" pinDisplayMode");
        }
        if (this.r == null) {
            str = String.valueOf(str).concat(" navigating");
        }
        if (this.s == null) {
            str = String.valueOf(str).concat(" overviewMode");
        }
        if (this.t == null) {
            str = String.valueOf(str).concat(" showJamcidents");
        }
        if (this.F == 0) {
            str = String.valueOf(str).concat(" orientation");
        }
        if (this.u == null) {
            str = String.valueOf(str).concat(" showManeuverCallouts");
        }
        if (this.v == null) {
            str = String.valueOf(str).concat(" inLastMileMode");
        }
        if (this.w == null) {
            str = String.valueOf(str).concat(" frameFullRoute");
        }
        if (this.x == null) {
            str = String.valueOf(str).concat(" framePathIndex");
        }
        if (this.y == null) {
            str = String.valueOf(str).concat(" frameStepGroupIndex");
        }
        if (this.z == null) {
            str = String.valueOf(str).concat(" activeStepGroupIndex");
        }
        if (this.A == null) {
            str = String.valueOf(str).concat(" textureStrategy");
        }
        if (this.B == null) {
            str = String.valueOf(str).concat(" useRouteOverviewConfigSet");
        }
        if (this.C == null) {
            str = String.valueOf(str).concat(" calloutDisplayModeSupplier");
        }
        if (this.D == null) {
            str = String.valueOf(str).concat(" calloutInfoFormatSupplier");
        }
        if (this.E == null) {
            str = String.valueOf(str).concat(" allPathsAreActive");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new vus(this.d, this.e.booleanValue(), this.f, this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.a, this.l, this.m, this.n, this.o, this.p, this.q.booleanValue(), this.G, this.r.booleanValue(), this.s.booleanValue(), this.t.booleanValue(), this.F, this.u.booleanValue(), this.v.booleanValue(), this.w.booleanValue(), this.x.intValue(), this.y.intValue(), this.z.intValue(), this.A, this.B.booleanValue(), this.C, this.D, this.b, this.c, this.E.booleanValue());
    }
}
