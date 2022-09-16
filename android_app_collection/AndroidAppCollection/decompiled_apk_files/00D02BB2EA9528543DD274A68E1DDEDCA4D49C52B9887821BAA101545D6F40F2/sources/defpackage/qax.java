package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: qax  reason: default package */
/* loaded from: classes7.dex */
final class qax extends qdg {
    private final String a;
    private final String b;
    private final qdi c;
    private final akqq d;
    private final List<String> e;
    private final Long f;
    private final dopk g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final String l;
    private final dnqh m;
    private final int n;

    public qax(@dzsi String str, @dzsi String str2, @dzsi qdi qdiVar, @dzsi akqq akqqVar, List<String> list, int i, @dzsi Long l, @dzsi dopk dopkVar, boolean z, boolean z2, boolean z3, boolean z4, @dzsi String str3, @dzsi dnqh dnqhVar) {
        this.a = str;
        this.b = str2;
        this.c = qdiVar;
        this.d = akqqVar;
        this.e = list;
        this.n = i;
        this.f = l;
        this.g = dopkVar;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = str3;
        this.m = dnqhVar;
    }

    @Override // defpackage.qdg
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.qdg
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // defpackage.qdg
    @dzsi
    public final qdi c() {
        return this.c;
    }

    @Override // defpackage.qdg
    @dzsi
    public final akqq d() {
        return this.d;
    }

    @Override // defpackage.qdg
    public final List<String> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Long l;
        dopk dopkVar;
        String str;
        dnqh dnqhVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qdg) {
            qdg qdgVar = (qdg) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(qdgVar.a()) : qdgVar.a() == null) {
                String str3 = this.b;
                if (str3 != null ? str3.equals(qdgVar.b()) : qdgVar.b() == null) {
                    qdi qdiVar = this.c;
                    if (qdiVar != null ? qdiVar.equals(qdgVar.c()) : qdgVar.c() == null) {
                        akqq akqqVar = this.d;
                        if (akqqVar != null ? akqqVar.equals(qdgVar.d()) : qdgVar.d() == null) {
                            if (this.e.equals(qdgVar.e())) {
                                int i = this.n;
                                int n = qdgVar.n();
                                if (i == 0) {
                                    throw null;
                                }
                                if (i == n && ((l = this.f) != null ? l.equals(qdgVar.f()) : qdgVar.f() == null) && ((dopkVar = this.g) != null ? dopkVar.equals(qdgVar.g()) : qdgVar.g() == null) && this.h == qdgVar.h() && this.i == qdgVar.i() && this.j == qdgVar.j() && this.k == qdgVar.k() && ((str = this.l) != null ? str.equals(qdgVar.l()) : qdgVar.l() == null) && ((dnqhVar = this.m) != null ? dnqhVar.equals(qdgVar.m()) : qdgVar.m() == null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.qdg
    @dzsi
    public final Long f() {
        return this.f;
    }

    @Override // defpackage.qdg
    @dzsi
    public final dopk g() {
        return this.g;
    }

    @Override // defpackage.qdg
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        String str = this.a;
        int i2 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        qdi qdiVar = this.c;
        int hashCode3 = (hashCode2 ^ (qdiVar == null ? 0 : qdiVar.hashCode())) * 1000003;
        akqq akqqVar = this.d;
        int hashCode4 = (((((hashCode3 ^ (akqqVar == null ? 0 : akqqVar.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ dopr.a(this.n)) * 1000003;
        Long l = this.f;
        int hashCode5 = (hashCode4 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        dopk dopkVar = this.g;
        if (dopkVar == null) {
            i = 0;
        } else {
            i = dopkVar.bC;
            if (i == 0) {
                i = dsst.a.b(dopkVar).c(dopkVar);
                dopkVar.bC = i;
            }
        }
        int i3 = (hashCode5 ^ i) * 1000003;
        int i4 = 1237;
        int i5 = (((((i3 ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003;
        if (true == this.k) {
            i4 = 1231;
        }
        int i6 = (i5 ^ i4) * 1000003;
        String str3 = this.l;
        int hashCode6 = (i6 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        dnqh dnqhVar = this.m;
        if (dnqhVar != null && (i2 = dnqhVar.bC) == 0) {
            i2 = dsst.a.b(dnqhVar).c(dnqhVar);
            dnqhVar.bC = i2;
        }
        return hashCode6 ^ i2;
    }

    @Override // defpackage.qdg
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.qdg
    public final boolean j() {
        return this.j;
    }

    @Override // defpackage.qdg
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.qdg
    @dzsi
    public final String l() {
        return this.l;
    }

    @Override // defpackage.qdg
    @dzsi
    public final dnqh m() {
        return this.m;
    }

    @Override // defpackage.qdg
    public final int n() {
        return this.n;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int i = this.n;
        String valueOf4 = String.valueOf(i != 0 ? dopr.c(i) : "null");
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        boolean z = this.h;
        boolean z2 = this.i;
        boolean z3 = this.j;
        boolean z4 = this.k;
        String str3 = this.l;
        String valueOf7 = String.valueOf(this.m);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 326 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf6).length() + String.valueOf(str3).length() + String.valueOf(valueOf7).length());
        sb.append("StartTransitStationParams{titleWhileLoading=");
        sb.append(str);
        sb.append(", stationFeatureId=");
        sb.append(str2);
        sb.append(", filteredLine=");
        sb.append(valueOf);
        sb.append(", stationLocation=");
        sb.append(valueOf2);
        sb.append(", filteredDeparturesTokens=");
        sb.append(valueOf3);
        sb.append(", departureTimeStrategy=");
        sb.append(valueOf4);
        sb.append(", selectedLineGroupKey=");
        sb.append(valueOf5);
        sb.append(", transitStation=");
        sb.append(valueOf6);
        sb.append(", showMoreInfoButton=");
        sb.append(z);
        sb.append(", isFromShortcut=");
        sb.append(z2);
        sb.append(", isFromParent=");
        sb.append(z3);
        sb.append(", replaceTopOfStack=");
        sb.append(z4);
        sb.append(", connectionStationFeatureId=");
        sb.append(str3);
        sb.append(", loggingParams=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
