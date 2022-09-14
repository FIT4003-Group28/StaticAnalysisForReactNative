package defpackage;
/* compiled from: PG */
/* renamed from: bqdi  reason: default package */
/* loaded from: classes4.dex */
final class bqdi extends bqdn {
    private final akrk a;
    private final dbsg<Long> b;
    private final dbsg<bqhr> c;
    private final dcdc<bqdm> d;

    public bqdi(akrk akrkVar, dbsg<Long> dbsgVar, dbsg<bqhr> dbsgVar2, dcdc<bqdm> dcdcVar) {
        if (akrkVar != null) {
            this.a = akrkVar;
            this.b = dbsgVar;
            this.c = dbsgVar2;
            if (dcdcVar != null) {
                this.d = dcdcVar;
                return;
            }
            throw new NullPointerException("Null intersections");
        }
        throw new NullPointerException("Null polyline");
    }

    @Override // defpackage.bqdn
    public final akrk a() {
        return this.a;
    }

    @Override // defpackage.bqdn
    public final dbsg<Long> b() {
        return this.b;
    }

    @Override // defpackage.bqdn
    public final dbsg<bqhr> c() {
        return this.c;
    }

    @Override // defpackage.bqdn
    public final dcdc<bqdm> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqdn) {
            bqdn bqdnVar = (bqdn) obj;
            if (this.a.equals(bqdnVar.a()) && this.b.equals(bqdnVar.b()) && this.c.equals(bqdnVar.c()) && dchl.m(this.d, bqdnVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SnappablePolyline{polyline=");
        sb.append(valueOf);
        sb.append(", segmentFprint=");
        sb.append(valueOf2);
        sb.append(", snappedNewRoadId=");
        sb.append(valueOf3);
        sb.append(", intersections=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
