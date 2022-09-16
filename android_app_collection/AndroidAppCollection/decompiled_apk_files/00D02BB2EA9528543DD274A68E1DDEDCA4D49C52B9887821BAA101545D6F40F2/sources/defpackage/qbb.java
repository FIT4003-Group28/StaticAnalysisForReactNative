package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: qbb  reason: default package */
/* loaded from: classes7.dex */
final class qbb extends qdq {
    private final akqi a;
    private final List<akqi> b;
    private final List<String> c;
    private final Boolean d;
    private final List<dooj> e;
    private final dnqh f;
    private final List<doos> g;
    private final dhkd h;
    private final Integer i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;

    public qbb(akqi akqiVar, List<akqi> list, List<String> list2, int i, int i2, Boolean bool, List<dooj> list3, @dzsi dnqh dnqhVar, List<doos> list4, @dzsi dhkd dhkdVar, @dzsi Integer num, int i3, int i4, int i5, int i6) {
        this.a = akqiVar;
        this.b = list;
        this.c = list2;
        this.j = i;
        this.k = i2;
        this.d = bool;
        this.e = list3;
        this.f = dnqhVar;
        this.g = list4;
        this.h = dhkdVar;
        this.i = num;
        this.l = i3;
        this.m = i4;
        this.n = i5;
        this.o = i6;
    }

    @Override // defpackage.qdq
    public final akqi a() {
        return this.a;
    }

    @Override // defpackage.qdq
    public final List<akqi> b() {
        return this.b;
    }

    @Override // defpackage.qdq
    public final List<String> c() {
        return this.c;
    }

    @Override // defpackage.qdq
    public final Boolean d() {
        return this.d;
    }

    @Override // defpackage.qdq
    public final List<dooj> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        dnqh dnqhVar;
        dhkd dhkdVar;
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qdq) {
            qdq qdqVar = (qdq) obj;
            if (this.a.equals(qdqVar.a()) && this.b.equals(qdqVar.b()) && this.c.equals(qdqVar.c())) {
                int i = this.j;
                int j = qdqVar.j();
                if (i == 0) {
                    throw null;
                }
                if (i == j) {
                    int i2 = this.k;
                    int k = qdqVar.k();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i2 == k && this.d.equals(qdqVar.d()) && this.e.equals(qdqVar.e()) && ((dnqhVar = this.f) != null ? dnqhVar.equals(qdqVar.f()) : qdqVar.f() == null) && this.g.equals(qdqVar.g()) && ((dhkdVar = this.h) != null ? dhkdVar.equals(qdqVar.h()) : qdqVar.h() == null) && ((num = this.i) != null ? num.equals(qdqVar.i()) : qdqVar.i() == null)) {
                        int i3 = this.l;
                        int l = qdqVar.l();
                        if (i3 == 0) {
                            throw null;
                        }
                        if (i3 == l) {
                            int i4 = this.m;
                            int m = qdqVar.m();
                            if (i4 == 0) {
                                throw null;
                            }
                            if (i4 == m) {
                                int i5 = this.n;
                                int n = qdqVar.n();
                                if (i5 == 0) {
                                    throw null;
                                }
                                if (i5 == n) {
                                    int i6 = this.o;
                                    int o = qdqVar.o();
                                    if (i6 == 0) {
                                        throw null;
                                    }
                                    if (i6 == o) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.qdq
    @dzsi
    public final dnqh f() {
        return this.f;
    }

    @Override // defpackage.qdq
    public final List<doos> g() {
        return this.g;
    }

    @Override // defpackage.qdq
    @dzsi
    public final dhkd h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        int i3 = this.j;
        if (i3 != 0) {
            int a = (((((((hashCode ^ i3) * 1000003) ^ dopr.a(this.k)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
            dnqh dnqhVar = this.f;
            int i4 = 0;
            if (dnqhVar == null) {
                i = 0;
            } else {
                i = dnqhVar.bC;
                if (i == 0) {
                    i = dsst.a.b(dnqhVar).c(dnqhVar);
                    dnqhVar.bC = i;
                }
            }
            int hashCode2 = (((a ^ i) * 1000003) ^ this.g.hashCode()) * 1000003;
            dhkd dhkdVar = this.h;
            if (dhkdVar == null) {
                i2 = 0;
            } else {
                i2 = dhkdVar.bC;
                if (i2 == 0) {
                    i2 = dsst.a.b(dhkdVar).c(dhkdVar);
                    dhkdVar.bC = i2;
                }
            }
            int i5 = (hashCode2 ^ i2) * 1000003;
            Integer num = this.i;
            if (num != null) {
                i4 = num.hashCode();
            }
            int i6 = (i5 ^ i4) * 1000003;
            int i7 = this.l;
            if (i7 == 0) {
                throw null;
            }
            int a2 = (((((i6 ^ i7) * 1000003) ^ dopz.a(this.m)) * 1000003) ^ dopz.a(this.n)) * 1000003;
            int i8 = this.o;
            if (i8 == 0) {
                throw null;
            }
            return a2 ^ i8;
        }
        throw null;
    }

    @Override // defpackage.qdq
    @dzsi
    public final Integer i() {
        return this.i;
    }

    @Override // defpackage.qdq
    public final int j() {
        return this.j;
    }

    @Override // defpackage.qdq
    public final int k() {
        return this.k;
    }

    @Override // defpackage.qdq
    public final int l() {
        return this.l;
    }

    @Override // defpackage.qdq
    public final int m() {
        return this.m;
    }

    @Override // defpackage.qdq
    public final int n() {
        return this.n;
    }

    @Override // defpackage.qdq
    public final int o() {
        return this.o;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.j;
        String valueOf4 = String.valueOf(i != 0 ? Integer.toString(i) : "null");
        int i2 = this.k;
        String valueOf5 = String.valueOf(i2 != 0 ? dopr.c(i2) : "null");
        String valueOf6 = String.valueOf(this.d);
        String valueOf7 = String.valueOf(this.e);
        String valueOf8 = String.valueOf(this.f);
        String valueOf9 = String.valueOf(this.g);
        String valueOf10 = String.valueOf(this.h);
        String valueOf11 = String.valueOf(this.i);
        int i3 = this.l;
        String valueOf12 = String.valueOf(i3 != 0 ? Integer.toString(i3 - 1) : "null");
        int i4 = this.m;
        String valueOf13 = String.valueOf(i4 != 0 ? dopz.b(i4) : "null");
        int i5 = this.n;
        String valueOf14 = String.valueOf(i5 != 0 ? dopz.b(i5) : "null");
        int i6 = this.o;
        String valueOf15 = String.valueOf(i6 != 0 ? Integer.toString(i6 - 1) : "null");
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        int length10 = String.valueOf(valueOf10).length();
        int length11 = String.valueOf(valueOf11).length();
        int length12 = String.valueOf(valueOf12).length();
        StringBuilder sb = new StringBuilder(length + 339 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + String.valueOf(valueOf13).length() + String.valueOf(valueOf14).length() + String.valueOf(valueOf15).length());
        sb.append("Request{stationFeatureId=");
        sb.append(valueOf);
        sb.append(", lineFeatureIds=");
        sb.append(valueOf2);
        sb.append(", queryTokens=");
        sb.append(valueOf3);
        sb.append(", scheduleDetails=");
        sb.append(valueOf4);
        sb.append(", departureTimeStrategy=");
        sb.append(valueOf5);
        sb.append(", includeDepartureBoardMetadata=");
        sb.append(valueOf6);
        sb.append(", allowedDisplayTypes=");
        sb.append(valueOf7);
        sb.append(", loggingParams=");
        sb.append(valueOf8);
        sb.append(", schematicMapSupportedFormats=");
        sb.append(valueOf9);
        sb.append(", schematicMapTargetViewport=");
        sb.append(valueOf10);
        sb.append(", numDepartures=");
        sb.append(valueOf11);
        sb.append(", outgoingTransfers=");
        sb.append(valueOf12);
        sb.append(", leadingPolylinePolicy=");
        sb.append(valueOf13);
        sb.append(", trailingPolylinePolicy=");
        sb.append(valueOf14);
        sb.append(", returnedPolylineFormat=");
        sb.append(valueOf15);
        sb.append("}");
        return sb.toString();
    }
}
