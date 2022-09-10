package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: boya  reason: default package */
/* loaded from: classes3.dex */
public final class boya extends bozq {
    public final long a;
    public final long b;
    public final dcdc<Long> c;
    private final akrk d;

    public boya(long j, long j2, dcdc<Long> dcdcVar, akrk akrkVar) {
        this.a = j;
        this.b = j2;
        if (dcdcVar != null) {
            this.c = dcdcVar;
            this.d = akrkVar;
            return;
        }
        throw new NullPointerException("Null segmentFprints");
    }

    @Override // defpackage.bozq
    public final long a() {
        return this.a;
    }

    @Override // defpackage.bozq
    public final long b() {
        return this.b;
    }

    @Override // defpackage.bozq
    public final dcdc<Long> c() {
        return this.c;
    }

    @Override // defpackage.bozq
    public final akrk d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bozq) {
            bozq bozqVar = (bozq) obj;
            if (this.a == bozqVar.a() && this.b == bozqVar.b() && dchl.m(this.c, bozqVar.c()) && this.d.equals(bozqVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.d.hashCode() ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 129 + String.valueOf(valueOf2).length());
        sb.append("RoadStretch{startIntersectionFprint=");
        sb.append(j);
        sb.append(", endIntersectionFprint=");
        sb.append(j2);
        sb.append(", segmentFprints=");
        sb.append(valueOf);
        sb.append(", polyline=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
