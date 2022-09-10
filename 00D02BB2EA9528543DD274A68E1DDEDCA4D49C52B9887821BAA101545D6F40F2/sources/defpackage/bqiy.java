package defpackage;
/* compiled from: PG */
/* renamed from: bqiy  reason: default package */
/* loaded from: classes4.dex */
final class bqiy extends bqkx {
    private final akqi a;
    private final int b;
    private final String c;
    private final dqgr d;
    private final dbsg<eapy> e;
    private final dbsg<dqwy> f;
    private final dcdc<dreq> g;
    private final dcdc<drfo> h;

    public bqiy(akqi akqiVar, int i, String str, dqgr dqgrVar, dbsg<eapy> dbsgVar, dbsg<dqwy> dbsgVar2, dcdc<dreq> dcdcVar, dcdc<drfo> dcdcVar2) {
        this.a = akqiVar;
        this.b = i;
        this.c = str;
        this.d = dqgrVar;
        this.e = dbsgVar;
        this.f = dbsgVar2;
        this.g = dcdcVar;
        this.h = dcdcVar2;
    }

    @Override // defpackage.bqkx
    public final akqi a() {
        return this.a;
    }

    @Override // defpackage.bqkx
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bqkx
    public final String c() {
        return this.c;
    }

    @Override // defpackage.bqkx
    public final dqgr d() {
        return this.d;
    }

    @Override // defpackage.bqkx
    public final dbsg<eapy> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqkx) {
            bqkx bqkxVar = (bqkx) obj;
            if (this.a.equals(bqkxVar.a()) && this.b == bqkxVar.b() && this.c.equals(bqkxVar.c()) && this.d.equals(bqkxVar.d()) && this.e.equals(bqkxVar.e()) && this.f.equals(bqkxVar.f()) && dchl.m(this.g, bqkxVar.g()) && dchl.m(this.h, bqkxVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bqkx
    public final dbsg<dqwy> f() {
        return this.f;
    }

    @Override // defpackage.bqkx
    public final dcdc<dreq> g() {
        return this.g;
    }

    @Override // defpackage.bqkx
    public final dcdc<drfo> h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String str = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 132 + length2 + length3 + length4 + length5 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("Review{featureId=");
        sb.append(valueOf);
        sb.append(", starRating=");
        sb.append(i);
        sb.append(", reviewText=");
        sb.append(str);
        sb.append(", reviewStatus=");
        sb.append(valueOf2);
        sb.append(", visitDate=");
        sb.append(valueOf3);
        sb.append(", hotelReviewInfo=");
        sb.append(valueOf4);
        sb.append(", aspects=");
        sb.append(valueOf5);
        sb.append(", structuredQuestions=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
