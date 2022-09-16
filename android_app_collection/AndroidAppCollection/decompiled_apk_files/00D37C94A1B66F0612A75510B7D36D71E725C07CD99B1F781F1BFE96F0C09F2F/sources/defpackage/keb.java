package defpackage;
/* compiled from: PG */
/* renamed from: keb  reason: default package */
/* loaded from: classes3.dex */
public final class keb {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public keb() {
    }

    public keb(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public static keb a(long j, long j2, long j3, long j4) {
        return new keb(j, j2, j3, j4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof keb) {
            keb kebVar = (keb) obj;
            if (this.a == kebVar.a && this.b == kebVar.b && this.c == kebVar.c && this.d == kebVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        return ((int) ((j4 >>> 32) ^ j4)) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        StringBuilder sb = new StringBuilder(174);
        sb.append("VideoTimes{currentTimeMillis=");
        sb.append(j);
        sb.append(", earliestSeekTimeMillis=");
        sb.append(j2);
        sb.append(", totalTimeMillis=");
        sb.append(j3);
        sb.append(", bufferedTimeMillis=");
        sb.append(j4);
        sb.append("}");
        return sb.toString();
    }
}
