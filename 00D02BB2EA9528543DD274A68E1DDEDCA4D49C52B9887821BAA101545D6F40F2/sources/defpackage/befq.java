package defpackage;
/* compiled from: PG */
/* renamed from: befq  reason: default package */
/* loaded from: classes3.dex */
final class befq extends befv {
    private final bwrs<ilo> a;
    private final dnqh b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final dvzd h;
    private final boolean i;
    private final boolean j;
    private final dqhw k;
    private final dbsg<dobd> l;
    private final dnyh m;
    private final dgba n = null;
    private final begi o;

    public befq(bwrs<ilo> bwrsVar, @dzsi dnqh dnqhVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @dzsi dvzd dvzdVar, boolean z6, boolean z7, @dzsi dqhw dqhwVar, dbsg<dobd> dbsgVar, @dzsi dnyh dnyhVar, @dzsi dgba dgbaVar, @dzsi begi begiVar) {
        this.a = bwrsVar;
        this.b = dnqhVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = dvzdVar;
        this.i = z6;
        this.j = z7;
        this.k = dqhwVar;
        this.l = dbsgVar;
        this.m = dnyhVar;
        this.o = begiVar;
    }

    @Override // defpackage.befv
    public final bwrs<ilo> a() {
        return this.a;
    }

    @Override // defpackage.befv
    @dzsi
    public final dnqh b() {
        return this.b;
    }

    @Override // defpackage.befv
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.befv
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.befv
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        dnqh dnqhVar;
        dvzd dvzdVar;
        dqhw dqhwVar;
        dnyh dnyhVar;
        begi begiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof befv) {
            befv befvVar = (befv) obj;
            if (this.a.equals(befvVar.a()) && ((dnqhVar = this.b) != null ? dnqhVar.equals(befvVar.b()) : befvVar.b() == null) && this.c == befvVar.c() && this.d == befvVar.d() && this.e == befvVar.e() && this.f == befvVar.f() && this.g == befvVar.g() && ((dvzdVar = this.h) != null ? dvzdVar.equals(befvVar.h()) : befvVar.h() == null) && this.i == befvVar.i() && this.j == befvVar.j() && ((dqhwVar = this.k) != null ? dqhwVar.equals(befvVar.k()) : befvVar.k() == null) && this.l.equals(befvVar.l()) && ((dnyhVar = this.m) != null ? dnyhVar.equals(befvVar.m()) : befvVar.m() == null) && befvVar.n() == null && ((begiVar = this.o) != null ? begiVar.equals(befvVar.o()) : befvVar.o() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.befv
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.befv
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.befv
    @dzsi
    public final dvzd h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dnqh dnqhVar = this.b;
        int i5 = 0;
        if (dnqhVar == null) {
            i = 0;
        } else {
            i = dnqhVar.bC;
            if (i == 0) {
                i = dsst.a.b(dnqhVar).c(dnqhVar);
                dnqhVar.bC = i;
            }
        }
        int i6 = (hashCode ^ i) * 1000003;
        int i7 = 1237;
        int i8 = (((((((((i6 ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        dvzd dvzdVar = this.h;
        if (dvzdVar == null) {
            i2 = 0;
        } else {
            i2 = dvzdVar.bC;
            if (i2 == 0) {
                i2 = dsst.a.b(dvzdVar).c(dvzdVar);
                dvzdVar.bC = i2;
            }
        }
        int i9 = (((i8 ^ i2) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003;
        if (true == this.j) {
            i7 = 1231;
        }
        int i10 = (i9 ^ i7) * 1000003;
        dqhw dqhwVar = this.k;
        if (dqhwVar == null) {
            i3 = 0;
        } else {
            i3 = dqhwVar.bC;
            if (i3 == 0) {
                i3 = dsst.a.b(dqhwVar).c(dqhwVar);
                dqhwVar.bC = i3;
            }
        }
        int hashCode2 = (((i10 ^ i3) * 1000003) ^ this.l.hashCode()) * 1000003;
        dnyh dnyhVar = this.m;
        if (dnyhVar == null) {
            i4 = 0;
        } else {
            i4 = dnyhVar.bC;
            if (i4 == 0) {
                i4 = dsst.a.b(dnyhVar).c(dnyhVar);
                dnyhVar.bC = i4;
            }
        }
        int i11 = (hashCode2 ^ i4) * (-721379959);
        begi begiVar = this.o;
        if (begiVar != null) {
            i5 = begiVar.hashCode();
        }
        return i11 ^ i5;
    }

    @Override // defpackage.befv
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.befv
    public final boolean j() {
        return this.j;
    }

    @Override // defpackage.befv
    @dzsi
    public final dqhw k() {
        return this.k;
    }

    @Override // defpackage.befv
    public final dbsg<dobd> l() {
        return this.l;
    }

    @Override // defpackage.befv
    @dzsi
    public final dnyh m() {
        return this.m;
    }

    @Override // defpackage.befv
    @dzsi
    public final dgba n() {
        return null;
    }

    @Override // defpackage.befv
    @dzsi
    public final begi o() {
        return this.o;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        boolean z4 = this.f;
        boolean z5 = this.g;
        String valueOf3 = String.valueOf(this.h);
        boolean z6 = this.i;
        boolean z7 = this.j;
        String valueOf4 = String.valueOf(this.k);
        String valueOf5 = String.valueOf(this.l);
        String valueOf6 = String.valueOf(this.m);
        String valueOf7 = String.valueOf(this.o);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 361 + length2 + length3 + length4 + length5 + length6 + "null".length() + String.valueOf(valueOf7).length());
        sb.append("Options{placemarkRef=");
        sb.append(valueOf);
        sb.append(", loggingParams=");
        sb.append(valueOf2);
        sb.append(", forceFetch=");
        sb.append(z);
        sb.append(", bypassCache=");
        sb.append(z2);
        sb.append(", useOfflineTimeout=");
        sb.append(z3);
        sb.append(", enableFprintFallback=");
        sb.append(z4);
        sb.append(", showToastOnFailure=");
        sb.append(z5);
        sb.append(", transitStationParams=");
        sb.append(valueOf3);
        sb.append(", includeUgcEditState=");
        sb.append(z6);
        sb.append(", includeUgcContributionFeatures=");
        sb.append(z7);
        sb.append(", staticMapImageSpecification=");
        sb.append(valueOf4);
        sb.append(", reportAProblemInfoParams=");
        sb.append(valueOf5);
        sb.append(", evInfoOptions=");
        sb.append(valueOf6);
        sb.append(", electricVehicleOptions=");
        sb.append("null");
        sb.append(", backstackEntryType=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
