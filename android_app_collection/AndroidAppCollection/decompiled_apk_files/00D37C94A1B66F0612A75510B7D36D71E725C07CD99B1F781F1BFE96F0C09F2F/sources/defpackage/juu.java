package defpackage;
/* compiled from: PG */
/* renamed from: juu  reason: default package */
/* loaded from: classes3.dex */
final class juu {
    public final long a;
    public final long b;

    public juu() {
    }

    public juu(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof juu) {
            juu juuVar = (juu) obj;
            if (this.a == juuVar.a && this.b == juuVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(101);
        sb.append("SmartDownloadsHeaderData{numBytes=");
        sb.append(j);
        sb.append(", latestUpdateTimestampMs=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
