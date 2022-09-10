package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tlr  reason: default package */
/* loaded from: classes7.dex */
public final class tlr extends tly {
    public final tlx a;
    public final dbsg<dqvj> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final dcdn<String, Integer> g;
    public final Integer h;

    public tlr(tlx tlxVar, dbsg<dqvj> dbsgVar, boolean z, boolean z2, boolean z3, boolean z4, dcdn<String, Integer> dcdnVar, Integer num) {
        this.a = tlxVar;
        this.b = dbsgVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = dcdnVar;
        this.h = num;
    }

    @Override // defpackage.tly
    public final tlx a() {
        return this.a;
    }

    @Override // defpackage.tly
    public final dbsg<dqvj> b() {
        return this.b;
    }

    @Override // defpackage.tly
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.tly
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.tly
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tly) {
            tly tlyVar = (tly) obj;
            if (this.a.equals(tlyVar.a()) && this.b.equals(tlyVar.b()) && this.c == tlyVar.c() && this.d == tlyVar.d() && this.e == tlyVar.e() && this.f == tlyVar.f() && this.g.equals(tlyVar.g()) && this.h.equals(tlyVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tly
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.tly
    public final dcdn<String, Integer> g() {
        return this.g;
    }

    @Override // defpackage.tly
    public final Integer h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i = 1231;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    @Override // defpackage.tly
    public final tlw i() {
        return new tlq(this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        boolean z4 = this.f;
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 236 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("DirectionsGroupMetadata{rationale=");
        sb.append(valueOf);
        sb.append(", travelMode=");
        sb.append(valueOf2);
        sb.append(", isHighlightedGroup=");
        sb.append(z);
        sb.append(", containsFastestTrip=");
        sb.append(z2);
        sb.append(", containsExplicitlyPreferredMode=");
        sb.append(z3);
        sb.append(", containsImplicitlyPreferredMode=");
        sb.append(z4);
        sb.append(", preferredServiceProviderTripIndices=");
        sb.append(valueOf3);
        sb.append(", fastestTripIndex=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
