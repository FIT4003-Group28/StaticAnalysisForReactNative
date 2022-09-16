package defpackage;
/* compiled from: PG */
/* renamed from: bqct  reason: default package */
/* loaded from: classes4.dex */
final class bqct extends bqcy {
    private final dcdc<bqcv> a;
    private final dcdc<bqcw> b;
    private final int c;

    public bqct(int i, dcdc<bqcv> dcdcVar, dcdc<bqcw> dcdcVar2) {
        this.c = i;
        this.a = dcdcVar;
        this.b = dcdcVar2;
    }

    @Override // defpackage.bqcy
    public final dcdc<bqcv> a() {
        return this.a;
    }

    @Override // defpackage.bqcy
    public final dcdc<bqcw> b() {
        return this.b;
    }

    @Override // defpackage.bqcy
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqcy)) {
            return false;
        }
        bqcy bqcyVar = (bqcy) obj;
        int i = this.c;
        int c = bqcyVar.c();
        if (i == 0) {
            throw null;
        }
        return i == c && dchl.m(this.a, bqcyVar.a()) && dchl.m(this.b, bqcyVar.b());
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return ((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
        }
        throw null;
    }

    public final String toString() {
        String a = bqcz.a(this.c);
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int length = a.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("RoadGraphError{errorType=");
        sb.append(a);
        sb.append(", intersections=");
        sb.append(valueOf);
        sb.append(", segments=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
