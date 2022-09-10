package defpackage;
/* compiled from: PG */
/* renamed from: crad  reason: default package */
/* loaded from: classes5.dex */
public final class crad extends crap {
    public final cral a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final float e;
    public final boolean f;
    public final float g;
    public final boolean h;
    public final float i;
    public final boolean j;
    public final double k;
    public final boolean l;
    public final double m;
    public final boolean n;
    public final dcdc<Integer> o;
    private final String p;

    public crad(cral cralVar, boolean z, boolean z2, boolean z3, float f, boolean z4, float f2, boolean z5, float f3, boolean z6, double d, boolean z7, double d2, boolean z8, dcdc<Integer> dcdcVar, String str) {
        this.a = cralVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = f;
        this.f = z4;
        this.g = f2;
        this.h = z5;
        this.i = f3;
        this.j = z6;
        this.k = d;
        this.l = z7;
        this.m = d2;
        this.n = z8;
        this.o = dcdcVar;
        this.p = str;
    }

    @Override // defpackage.crap
    public final cral a() {
        return this.a;
    }

    @Override // defpackage.crap
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.crap
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.crap
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.crap
    public final float e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crap) {
            crap crapVar = (crap) obj;
            if (this.a.equals(crapVar.a()) && this.b == crapVar.b() && this.c == crapVar.c() && this.d == crapVar.d() && Float.floatToIntBits(this.e) == Float.floatToIntBits(crapVar.e()) && this.f == crapVar.f() && Float.floatToIntBits(this.g) == Float.floatToIntBits(crapVar.g()) && this.h == crapVar.h() && Float.floatToIntBits(this.i) == Float.floatToIntBits(crapVar.i()) && this.j == crapVar.j() && Double.doubleToLongBits(this.k) == Double.doubleToLongBits(crapVar.k()) && this.l == crapVar.l() && Double.doubleToLongBits(this.m) == Double.doubleToLongBits(crapVar.m()) && this.n == crapVar.n() && dchl.m(this.o, crapVar.o()) && this.p.equals(crapVar.p())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.crap
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.crap
    public final float g() {
        return this.g;
    }

    @Override // defpackage.crap
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.e)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.i)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.k) >>> 32) ^ Double.doubleToLongBits(this.k)))) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.m) >>> 32) ^ Double.doubleToLongBits(this.m)))) * 1000003;
        if (true == this.n) {
            i = 1231;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode();
    }

    @Override // defpackage.crap
    public final float i() {
        return this.i;
    }

    @Override // defpackage.crap
    public final boolean j() {
        return this.j;
    }

    @Override // defpackage.crap
    public final double k() {
        return this.k;
    }

    @Override // defpackage.crap
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.crap
    public final double m() {
        return this.m;
    }

    @Override // defpackage.crap
    public final boolean n() {
        return this.n;
    }

    @Override // defpackage.crap
    public final dcdc<Integer> o() {
        return this.o;
    }

    @Override // defpackage.crap
    public final String p() {
        return this.p;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        float f = this.e;
        boolean z4 = this.f;
        float f2 = this.g;
        boolean z5 = this.h;
        float f3 = this.i;
        boolean z6 = this.j;
        double d = this.k;
        boolean z7 = this.l;
        double d2 = this.m;
        boolean z8 = this.n;
        String valueOf2 = String.valueOf(this.o);
        String str = this.p;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 425 + String.valueOf(valueOf2).length() + String.valueOf(str).length());
        sb.append("SnappedLocation{latLng=");
        sb.append(valueOf);
        sb.append(", isGpsAccurate=");
        sb.append(z);
        sb.append(", onRoad=");
        sb.append(z2);
        sb.append(", hasAccuracy=");
        sb.append(z3);
        sb.append(", accuracy=");
        sb.append(f);
        sb.append(", hasBearing=");
        sb.append(z4);
        sb.append(", bearing=");
        sb.append(f2);
        sb.append(", hasSpeed=");
        sb.append(z5);
        sb.append(", speed=");
        sb.append(f3);
        sb.append(", hasModalDistanceAlongRouteMeters=");
        sb.append(z6);
        sb.append(", modalDistanceAlongRouteMeters=");
        sb.append(d);
        sb.append(", hasOnRouteConfidence=");
        sb.append(z7);
        sb.append(", onRouteConfidence=");
        sb.append(d2);
        sb.append(", inStartupConfusion=");
        sb.append(z8);
        sb.append(", connectedNonBranchingSegmentIds=");
        sb.append(valueOf2);
        sb.append(", provider=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
