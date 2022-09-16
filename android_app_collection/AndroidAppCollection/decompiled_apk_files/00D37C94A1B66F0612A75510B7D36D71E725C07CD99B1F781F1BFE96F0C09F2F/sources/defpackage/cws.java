package defpackage;
/* compiled from: PG */
/* renamed from: cws  reason: default package */
/* loaded from: classes3.dex */
public final class cws {
    public final long a;
    public final long b;
    final long c;

    public cws(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cws cwsVar = (cws) obj;
        return this.a == cwsVar.a && this.c == cwsVar.c && this.b == cwsVar.b;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        StringBuilder sb = new StringBuilder(121);
        sb.append("Entry{firstChunk=");
        sb.append(j);
        sb.append(", samplesPerChunk=");
        sb.append(j2);
        sb.append(", sampleDescriptionIndex=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }
}
