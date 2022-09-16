package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vus  reason: default package */
/* loaded from: classes7.dex */
public final class vus extends vuv {
    public final dbty<alfa> A;
    public final dbty<alfb> B;
    public final Runnable C;
    public final amvh D;
    public final boolean E;
    public final int F;
    public final int G;
    public final amuh a;
    public final boolean b;
    public final dcdc<vto> c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final amuo i;
    public final dcdc<akqq> j;
    public final dcdc<akqq> k;
    public final dcdc<akqq> l;
    public final dcdc<akpp> m;
    public final akps n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;
    public final vtp y;
    public final boolean z;

    public vus(amuh amuhVar, boolean z, dcdc<vto> dcdcVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @dzsi amuo amuoVar, dcdc<akqq> dcdcVar2, dcdc<akqq> dcdcVar3, dcdc<akqq> dcdcVar4, dcdc<akpp> dcdcVar5, akps akpsVar, boolean z7, int i, boolean z8, boolean z9, boolean z10, int i2, boolean z11, boolean z12, boolean z13, int i3, int i4, int i5, vtp vtpVar, boolean z14, dbty<alfa> dbtyVar, dbty<alfb> dbtyVar2, @dzsi Runnable runnable, @dzsi amvh amvhVar, boolean z15) {
        this.a = amuhVar;
        this.b = z;
        this.c = dcdcVar;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = amuoVar;
        this.j = dcdcVar2;
        this.k = dcdcVar3;
        this.l = dcdcVar4;
        this.m = dcdcVar5;
        this.n = akpsVar;
        this.o = z7;
        this.G = i;
        this.p = z8;
        this.q = z9;
        this.r = z10;
        this.F = i2;
        this.s = z11;
        this.t = z12;
        this.u = z13;
        this.v = i3;
        this.w = i4;
        this.x = i5;
        this.y = vtpVar;
        this.z = z14;
        this.A = dbtyVar;
        this.B = dbtyVar2;
        this.C = runnable;
        this.D = amvhVar;
        this.E = z15;
    }

    @Override // defpackage.vuv
    public final dbty<alfa> A() {
        return this.A;
    }

    @Override // defpackage.vuv
    public final dbty<alfb> B() {
        return this.B;
    }

    @Override // defpackage.vuv
    @dzsi
    public final Runnable C() {
        return this.C;
    }

    @Override // defpackage.vuv
    @dzsi
    public final amvh D() {
        return this.D;
    }

    @Override // defpackage.vuv
    public final boolean E() {
        return this.E;
    }

    @Override // defpackage.vuv
    public final vut F() {
        return new vur(this);
    }

    @Override // defpackage.vuv
    public final int G() {
        return this.F;
    }

    @Override // defpackage.vuv
    public final int H() {
        return this.G;
    }

    @Override // defpackage.vuv
    public final amuh a() {
        return this.a;
    }

    @Override // defpackage.vuv
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.vuv
    public final dcdc<vto> c() {
        return this.c;
    }

    @Override // defpackage.vuv
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.vuv
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        amuo amuoVar;
        Runnable runnable;
        amvh amvhVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof vuv) {
            vuv vuvVar = (vuv) obj;
            if (this.a.equals(vuvVar.a()) && this.b == vuvVar.b() && dchl.m(this.c, vuvVar.c()) && this.d == vuvVar.d() && this.e == vuvVar.e() && this.f == vuvVar.f() && this.g == vuvVar.g() && this.h == vuvVar.h() && ((amuoVar = this.i) != null ? amuoVar.equals(vuvVar.i()) : vuvVar.i() == null) && dchl.m(this.j, vuvVar.j()) && dchl.m(this.k, vuvVar.k()) && dchl.m(this.l, vuvVar.l()) && dchl.m(this.m, vuvVar.m()) && this.n.equals(vuvVar.n()) && this.o == vuvVar.o()) {
                int i = this.G;
                int H = vuvVar.H();
                if (i == 0) {
                    throw null;
                }
                if (i == H && this.p == vuvVar.p() && this.q == vuvVar.q() && this.r == vuvVar.r()) {
                    int i2 = this.F;
                    int G = vuvVar.G();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (G == 1 && this.s == vuvVar.s() && this.t == vuvVar.t() && this.u == vuvVar.u() && this.v == vuvVar.v() && this.w == vuvVar.w() && this.x == vuvVar.x() && this.y.equals(vuvVar.y()) && this.z == vuvVar.z() && this.A.equals(vuvVar.A()) && this.B.equals(vuvVar.B()) && ((runnable = this.C) != null ? runnable.equals(vuvVar.C()) : vuvVar.C() == null) && ((amvhVar = this.D) != null ? amvhVar.equals(vuvVar.D()) : vuvVar.D() == null) && this.E == vuvVar.E()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.vuv
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.vuv
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.vuv
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003;
        amuo amuoVar = this.i;
        int i2 = 0;
        int hashCode2 = (((((((((((((((((((((hashCode ^ (amuoVar == null ? 0 : amuoVar.hashCode())) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ (true != this.o ? 1237 : 1231)) * 1000003) ^ vuu.b(this.G)) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003) ^ (true != this.r ? 1237 : 1231)) * 1000003;
        if (this.F == 0) {
            throw null;
        }
        int hashCode3 = (((((((((((((((((((((hashCode2 ^ 1) * 1000003) ^ (true != this.s ? 1237 : 1231)) * 1000003) ^ (true != this.t ? 1237 : 1231)) * 1000003) ^ (true != this.u ? 1237 : 1231)) * 1000003) ^ this.v) * 1000003) ^ this.w) * 1000003) ^ this.x) * 1000003) ^ this.y.hashCode()) * 1000003) ^ (true != this.z ? 1237 : 1231)) * 1000003) ^ this.A.hashCode()) * 1000003) ^ this.B.hashCode()) * 1000003;
        Runnable runnable = this.C;
        int hashCode4 = (hashCode3 ^ (runnable == null ? 0 : runnable.hashCode())) * 1000003;
        amvh amvhVar = this.D;
        if (amvhVar != null) {
            i2 = amvhVar.hashCode();
        }
        int i3 = (hashCode4 ^ i2) * 1000003;
        if (true == this.E) {
            i = 1231;
        }
        return i3 ^ i;
    }

    @Override // defpackage.vuv
    @dzsi
    public final amuo i() {
        return this.i;
    }

    @Override // defpackage.vuv
    public final dcdc<akqq> j() {
        return this.j;
    }

    @Override // defpackage.vuv
    public final dcdc<akqq> k() {
        return this.k;
    }

    @Override // defpackage.vuv
    public final dcdc<akqq> l() {
        return this.l;
    }

    @Override // defpackage.vuv
    public final dcdc<akpp> m() {
        return this.m;
    }

    @Override // defpackage.vuv
    public final akps n() {
        return this.n;
    }

    @Override // defpackage.vuv
    public final boolean o() {
        return this.o;
    }

    @Override // defpackage.vuv
    public final boolean p() {
        return this.p;
    }

    @Override // defpackage.vuv
    public final boolean q() {
        return this.q;
    }

    @Override // defpackage.vuv
    public final boolean r() {
        return this.r;
    }

    @Override // defpackage.vuv
    public final boolean s() {
        return this.s;
    }

    @Override // defpackage.vuv
    public final boolean t() {
        return this.t;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        boolean z2 = this.d;
        boolean z3 = this.e;
        boolean z4 = this.f;
        boolean z5 = this.g;
        boolean z6 = this.h;
        String valueOf3 = String.valueOf(this.i);
        String valueOf4 = String.valueOf(this.j);
        String valueOf5 = String.valueOf(this.k);
        String valueOf6 = String.valueOf(this.l);
        String valueOf7 = String.valueOf(this.m);
        String valueOf8 = String.valueOf(this.n);
        boolean z7 = this.o;
        String a = vuu.a(this.G);
        boolean z8 = this.p;
        boolean z9 = this.q;
        boolean z10 = this.r;
        String str = this.F != 1 ? "null" : "NORTH_UP";
        boolean z11 = this.s;
        boolean z12 = this.t;
        boolean z13 = this.u;
        int i = this.v;
        int i2 = this.w;
        int i3 = this.x;
        String valueOf9 = String.valueOf(this.y);
        boolean z14 = this.z;
        String valueOf10 = String.valueOf(this.A);
        String valueOf11 = String.valueOf(this.B);
        String valueOf12 = String.valueOf(this.C);
        String valueOf13 = String.valueOf(this.D);
        boolean z15 = this.E;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(a).length();
        int length10 = str.length();
        int length11 = String.valueOf(valueOf9).length();
        int length12 = String.valueOf(valueOf10).length();
        StringBuilder sb = new StringBuilder(length + 771 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + String.valueOf(valueOf11).length() + String.valueOf(valueOf12).length() + String.valueOf(valueOf13).length());
        sb.append("DirectionsMapRequest{routes=");
        sb.append(valueOf);
        sb.append(", alwaysShowImportantMeasles=");
        sb.append(z);
        sb.append(", textureTypes=");
        sb.append(valueOf2);
        sb.append(", showAlternateRoutes=");
        sb.append(z2);
        sb.append(", shouldUpdateViewport=");
        sb.append(z3);
        sb.append(", forceDestinationInViewPort=");
        sb.append(z4);
        sb.append(", shouldUpdateIndoor=");
        sb.append(z5);
        sb.append(", pickable=");
        sb.append(z6);
        sb.append(", step=");
        sb.append(valueOf3);
        sb.append(", destinations=");
        sb.append(valueOf4);
        sb.append(", vehiclesPointsToIncludeInViewport=");
        sb.append(valueOf5);
        sb.append(", pointsToIncludeInViewport=");
        sb.append(valueOf6);
        sb.append(", mapPinsToDisplay=");
        sb.append(valueOf7);
        sb.append(", pinType=");
        sb.append(valueOf8);
        sb.append(", shouldShowPolylines=");
        sb.append(z7);
        sb.append(", pinDisplayMode=");
        sb.append(a);
        sb.append(", navigating=");
        sb.append(z8);
        sb.append(", overviewMode=");
        sb.append(z9);
        sb.append(", showJamcidents=");
        sb.append(z10);
        sb.append(", orientation=");
        sb.append(str);
        sb.append(", showManeuverCallouts=");
        sb.append(z11);
        sb.append(", inLastMileMode=");
        sb.append(z12);
        sb.append(", frameFullRoute=");
        sb.append(z13);
        sb.append(", framePathIndex=");
        sb.append(i);
        sb.append(", frameStepGroupIndex=");
        sb.append(i2);
        sb.append(", activeStepGroupIndex=");
        sb.append(i3);
        sb.append(", textureStrategy=");
        sb.append(valueOf9);
        sb.append(", useRouteOverviewConfigSet=");
        sb.append(z14);
        sb.append(", calloutDisplayModeSupplier=");
        sb.append(valueOf10);
        sb.append(", calloutInfoFormatSupplier=");
        sb.append(valueOf11);
        sb.append(", callback=");
        sb.append(valueOf12);
        sb.append(", addStopWaypoint=");
        sb.append(valueOf13);
        sb.append(", allPathsAreActive=");
        sb.append(z15);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.vuv
    public final boolean u() {
        return this.u;
    }

    @Override // defpackage.vuv
    public final int v() {
        return this.v;
    }

    @Override // defpackage.vuv
    public final int w() {
        return this.w;
    }

    @Override // defpackage.vuv
    public final int x() {
        return this.x;
    }

    @Override // defpackage.vuv
    public final vtp y() {
        return this.y;
    }

    @Override // defpackage.vuv
    public final boolean z() {
        return this.z;
    }
}
