package defpackage;
/* compiled from: PG */
/* renamed from: bpum  reason: default package */
/* loaded from: classes4.dex */
final class bpum extends bpuz {
    private final akqi a;
    private final dbsg<akqq> b;
    private final dbsg<akqs> c;
    private final int d;

    public bpum(akqi akqiVar, dbsg<akqq> dbsgVar, dbsg<akqs> dbsgVar2, int i) {
        this.a = akqiVar;
        this.b = dbsgVar;
        this.c = dbsgVar2;
        this.d = i;
    }

    @Override // defpackage.bpuz
    public final akqi a() {
        return this.a;
    }

    @Override // defpackage.bpuz
    public final dbsg<akqq> b() {
        return this.b;
    }

    @Override // defpackage.bpuz
    public final dbsg<akqs> c() {
        return this.c;
    }

    @Override // defpackage.bpuz
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bpuz) {
            bpuz bpuzVar = (bpuz) obj;
            if (this.a.equals(bpuzVar.a()) && this.b.equals(bpuzVar.b()) && this.c.equals(bpuzVar.c())) {
                int i = this.d;
                int d = bpuzVar.d();
                if (i == 0) {
                    throw null;
                }
                if (i == d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        int i = this.d;
        if (i != 0) {
            return hashCode ^ i;
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.d;
        String str = i != 1 ? i != 2 ? "null" : "SEGMENT" : "ROUTE";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + str.length());
        sb.append("HighlightableFeature{featureId=");
        sb.append(valueOf);
        sb.append(", latLng=");
        sb.append(valueOf2);
        sb.append(", latLngBounds=");
        sb.append(valueOf3);
        sb.append(", featureType=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
