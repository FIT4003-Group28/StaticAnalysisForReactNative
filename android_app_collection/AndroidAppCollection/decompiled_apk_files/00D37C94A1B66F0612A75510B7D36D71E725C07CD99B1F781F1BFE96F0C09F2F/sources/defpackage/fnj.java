package defpackage;
/* compiled from: PG */
/* renamed from: fnj  reason: default package */
/* loaded from: classes3.dex */
public final class fnj {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;

    public fnj() {
    }

    public fnj(String str, String str2, int i, long j, long j2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fnj) {
            fnj fnjVar = (fnj) obj;
            String str = this.a;
            if (str != null ? str.equals(fnjVar.a) : fnjVar.a == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(fnjVar.b) : fnjVar.b == null) {
                    if (this.c == fnjVar.c && this.d == fnjVar.d && this.e == fnjVar.e && this.f == fnjVar.f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = this.c;
        long j = this.d;
        long j2 = this.e;
        return ((((((((hashCode ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        long j = this.d;
        long j2 = this.e;
        boolean z = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 167 + String.valueOf(str2).length());
        sb.append("RestoreContextInfo{videoId=");
        sb.append(str);
        sb.append(", playlistId=");
        sb.append(str2);
        sb.append(", playlistIndex=");
        sb.append(i);
        sb.append(", videoStartTime=");
        sb.append(j);
        sb.append(", lastCrashTimestamp=");
        sb.append(j2);
        sb.append(", lastTimeShown=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
