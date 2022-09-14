package defpackage;
/* compiled from: PG */
/* renamed from: bqgu  reason: default package */
/* loaded from: classes4.dex */
final class bqgu extends bqhj {
    private final akqq b;
    private final dbsg<Long> c;
    private final dbsg<Long> d;
    private final dbsg<bqhr> e;

    public bqgu(akqq akqqVar, dbsg<Long> dbsgVar, dbsg<Long> dbsgVar2, dbsg<bqhr> dbsgVar3) {
        this.b = akqqVar;
        this.c = dbsgVar;
        this.d = dbsgVar2;
        this.e = dbsgVar3;
    }

    @Override // defpackage.bqhj
    public final akqq a() {
        return this.b;
    }

    @Override // defpackage.bqhj
    public final dbsg<Long> b() {
        return this.c;
    }

    @Override // defpackage.bqhj
    public final dbsg<Long> c() {
        return this.d;
    }

    @Override // defpackage.bqhj
    public final dbsg<bqhr> d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqhj) {
            bqhj bqhjVar = (bqhj) obj;
            if (this.b.equals(bqhjVar.a()) && this.c.equals(bqhjVar.b()) && this.d.equals(bqhjVar.c()) && this.e.equals(bqhjVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 90 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SnappablePoint{point=");
        sb.append(valueOf);
        sb.append(", snappedExistingRoadFprint=");
        sb.append(valueOf2);
        sb.append(", intersectionFprint=");
        sb.append(valueOf3);
        sb.append(", snappedNewRoadId=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
