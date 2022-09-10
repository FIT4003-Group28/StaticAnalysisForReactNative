package defpackage;
/* compiled from: PG */
/* renamed from: assx  reason: default package */
/* loaded from: classes2.dex */
final class assx extends aste {
    private final String a;
    private final String b;
    private final dpvf c;
    private final String d;
    private final String e;
    private final String f;
    private final bvrt<dhjx> g;
    private final ddhp h;
    private final boolean i;
    private final dbsg<amte> j;
    private final dbsg<Integer> k;
    private final boolean l;
    private final boolean m;
    private final bvrt<drph> n;
    private final dbsg<Long> o;
    private final bvrt<dwir> p;
    private final int q;

    public assx(@dzsi String str, @dzsi String str2, @dzsi dpvf dpvfVar, String str3, String str4, @dzsi String str5, @dzsi bvrt<dhjx> bvrtVar, ddhp ddhpVar, boolean z, int i, dbsg<amte> dbsgVar, dbsg<Integer> dbsgVar2, boolean z2, boolean z3, @dzsi bvrt<drph> bvrtVar2, dbsg<Long> dbsgVar3, @dzsi bvrt<dwir> bvrtVar3) {
        this.a = str;
        this.b = str2;
        this.c = dpvfVar;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = bvrtVar;
        this.h = ddhpVar;
        this.i = z;
        this.q = i;
        this.j = dbsgVar;
        this.k = dbsgVar2;
        this.l = z2;
        this.m = z3;
        this.n = bvrtVar2;
        this.o = dbsgVar3;
        this.p = bvrtVar3;
    }

    @Override // defpackage.aste
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.aste
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // defpackage.aste
    @dzsi
    public final dpvf c() {
        return this.c;
    }

    @Override // defpackage.aste
    public final String d() {
        return this.d;
    }

    @Override // defpackage.aste
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        bvrt<dhjx> bvrtVar;
        bvrt<drph> bvrtVar2;
        bvrt<dwir> bvrtVar3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aste) {
            aste asteVar = (aste) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(asteVar.a()) : asteVar.a() == null) {
                String str3 = this.b;
                if (str3 != null ? str3.equals(asteVar.b()) : asteVar.b() == null) {
                    dpvf dpvfVar = this.c;
                    if (dpvfVar != null ? dpvfVar.equals(asteVar.c()) : asteVar.c() == null) {
                        if (this.d.equals(asteVar.d()) && this.e.equals(asteVar.e()) && ((str = this.f) != null ? str.equals(asteVar.f()) : asteVar.f() == null) && ((bvrtVar = this.g) != null ? bvrtVar.equals(asteVar.g()) : asteVar.g() == null) && this.h.equals(asteVar.h()) && this.i == asteVar.i()) {
                            int i = this.q;
                            int q = asteVar.q();
                            if (i == 0) {
                                throw null;
                            }
                            if (i == q && this.j.equals(asteVar.j()) && this.k.equals(asteVar.k()) && this.l == asteVar.l() && this.m == asteVar.m() && ((bvrtVar2 = this.n) != null ? bvrtVar2.equals(asteVar.n()) : asteVar.n() == null) && this.o.equals(asteVar.o()) && ((bvrtVar3 = this.p) != null ? bvrtVar3.equals(asteVar.p()) : asteVar.p() == null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.aste
    @dzsi
    public final String f() {
        return this.f;
    }

    @Override // defpackage.aste
    @dzsi
    public final bvrt<dhjx> g() {
        return this.g;
    }

    @Override // defpackage.aste
    public final ddhp h() {
        return this.h;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        dpvf dpvfVar = this.c;
        int hashCode3 = (((((hashCode2 ^ (dpvfVar == null ? 0 : dpvfVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str3 = this.f;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        bvrt<dhjx> bvrtVar = this.g;
        int i2 = 1237;
        int hashCode5 = (((((hashCode4 ^ (bvrtVar == null ? 0 : bvrtVar.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003;
        int i3 = this.q;
        if (i3 != 0) {
            int i4 = (((((((hashCode5 ^ i3) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003;
            if (true == this.m) {
                i2 = 1231;
            }
            int i5 = (i4 ^ i2) * 1000003;
            bvrt<drph> bvrtVar2 = this.n;
            int hashCode6 = (((i5 ^ (bvrtVar2 == null ? 0 : bvrtVar2.hashCode())) * 1000003) ^ this.o.hashCode()) * 1000003;
            bvrt<dwir> bvrtVar3 = this.p;
            if (bvrtVar3 != null) {
                i = bvrtVar3.hashCode();
            }
            return hashCode6 ^ i;
        }
        throw null;
    }

    @Override // defpackage.aste
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.aste
    public final dbsg<amte> j() {
        return this.j;
    }

    @Override // defpackage.aste
    public final dbsg<Integer> k() {
        return this.k;
    }

    @Override // defpackage.aste
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.aste
    public final boolean m() {
        return this.m;
    }

    @Override // defpackage.aste
    @dzsi
    public final bvrt<drph> n() {
        return this.n;
    }

    @Override // defpackage.aste
    public final dbsg<Long> o() {
        return this.o;
    }

    @Override // defpackage.aste
    @dzsi
    public final bvrt<dwir> p() {
        return this.p;
    }

    @Override // defpackage.aste
    public final int q() {
        return this.q;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.h);
        boolean z = this.i;
        int i = this.q;
        String str6 = i != 1 ? i != 2 ? i != 3 ? "null" : "NAVIGATE_TO" : "SAR" : "NONE";
        String valueOf4 = String.valueOf(this.j);
        String valueOf5 = String.valueOf(this.k);
        boolean z2 = this.l;
        boolean z3 = this.m;
        String valueOf6 = String.valueOf(this.n);
        String valueOf7 = String.valueOf(this.o);
        String valueOf8 = String.valueOf(this.p);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(str3).length();
        int length5 = String.valueOf(str4).length();
        int length6 = String.valueOf(str5).length();
        int length7 = String.valueOf(valueOf2).length();
        int length8 = String.valueOf(valueOf3).length();
        int length9 = str6.length();
        StringBuilder sb = new StringBuilder(length + 372 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("NavigationSearchQuery{logicalParentId=");
        sb.append(str);
        sb.append(", query=");
        sb.append(str2);
        sb.append(", presetQueryType=");
        sb.append(valueOf);
        sb.append(", displayText=");
        sb.append(str3);
        sb.append(", titleOverride=");
        sb.append(str4);
        sb.append(", featureId=");
        sb.append(str5);
        sb.append(", cameraWrapper=");
        sb.append(valueOf2);
        sb.append(", parentVeType=");
        sb.append(valueOf3);
        sb.append(", shouldPlayTts=");
        sb.append(z);
        sb.append(", voiceActionType=");
        sb.append(str6);
        sb.append(", routeOverride=");
        sb.append(valueOf4);
        sb.append(", preferredDistanceKm=");
        sb.append(valueOf5);
        sb.append(", autoNavigateIfOnlyOneResult=");
        sb.append(z2);
        sb.append(", forceApplyEvConnectorRefinement=");
        sb.append(z3);
        sb.append(", localUniversalContextWrapper=");
        sb.append(valueOf6);
        sb.append(", assistantSessionId=");
        sb.append(valueOf7);
        sb.append(", searchRequestTemplateWrapper=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}
