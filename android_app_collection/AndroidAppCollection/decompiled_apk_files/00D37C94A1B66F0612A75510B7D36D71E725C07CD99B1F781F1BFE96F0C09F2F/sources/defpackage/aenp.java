package defpackage;
/* compiled from: PG */
/* renamed from: aenp  reason: default package */
/* loaded from: classes.dex */
public final class aenp {
    public final String a;
    public final int b;
    public final long c;
    public final String d;
    public final ampq e;
    private final long f;
    private final ampq g;

    public aenp(String str, int i, long j, long j2, String str2, ampq ampqVar, ampq ampqVar2) {
        if (str != null) {
            this.a = str;
            this.b = i;
            this.c = j;
            this.f = j2;
            if (str2 != null) {
                this.d = str2;
                this.g = ampqVar;
                this.e = ampqVar2;
                return;
            }
            throw new NullPointerException("Null xtags");
        }
        throw new NullPointerException("Null videoId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aenp) {
            aenp aenpVar = (aenp) obj;
            if (this.a.equals(aenpVar.a) && this.b == aenpVar.b && this.c == aenpVar.c && this.f == aenpVar.f && this.d.equals(aenpVar.d) && this.g.equals(aenpVar.g) && this.e.equals(aenpVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.b;
        long j = this.c;
        long j2 = this.f;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        long j = this.c;
        long j2 = this.f;
        String str2 = this.d;
        String valueOf = String.valueOf(this.g);
        String valueOf2 = String.valueOf(this.e);
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 169 + length2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("OnesieStreamMetadata{videoId=");
        sb.append(str);
        sb.append(", itag=");
        sb.append(i);
        sb.append(", lastModifiedTime=");
        sb.append(j);
        sb.append(", seqNum=");
        sb.append(j2);
        sb.append(", xtags=");
        sb.append(str2);
        sb.append(", expectedMediaSizeBytes=");
        sb.append(valueOf);
        sb.append(", expectedTimeRange=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public aenp() {
    }
}
