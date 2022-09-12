package defpackage;
/* compiled from: PG */
/* renamed from: cflu  reason: default package */
/* loaded from: classes4.dex */
public final class cflu extends cflx {
    public final long a;
    public final long b;
    public final long c;
    private final akrk d;
    private final alxh e;
    private final dcep<cflw> f;

    public cflu(long j, akrk akrkVar, alxh alxhVar, dcep<cflw> dcepVar, long j2, long j3) {
        this.a = j;
        this.d = akrkVar;
        this.e = alxhVar;
        if (dcepVar != null) {
            this.f = dcepVar;
            this.b = j2;
            this.c = j3;
            return;
        }
        throw new NullPointerException("Null routes");
    }

    @Override // defpackage.cflx
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cflx
    public final akrk b() {
        return this.d;
    }

    @Override // defpackage.cflx
    public final alxh c() {
        return this.e;
    }

    @Override // defpackage.cflx
    public final dcep<cflw> d() {
        return this.f;
    }

    @Override // defpackage.cflx
    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cflx) {
            cflx cflxVar = (cflx) obj;
            if (this.a == cflxVar.a() && this.d.equals(cflxVar.b()) && this.e.equals(cflxVar.c()) && this.f.equals(cflxVar.d()) && this.b == cflxVar.e() && this.c == cflxVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cflx
    public final long f() {
        return this.c;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = this.d.hashCode();
        int hashCode2 = this.e.hashCode();
        int hashCode3 = this.f.hashCode();
        long j2 = this.b;
        long j3 = this.c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        long j2 = this.b;
        long j3 = this.c;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 166 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("SegmentPair{fprint=");
        sb.append(j);
        sb.append(", polyline=");
        sb.append(valueOf);
        sb.append(", polylineIndex=");
        sb.append(valueOf2);
        sb.append(", routes=");
        sb.append(valueOf3);
        sb.append(", startIntersectionFprint=");
        sb.append(j2);
        sb.append(", endIntersectionFprint=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }
}
