package defpackage;
/* compiled from: PG */
/* renamed from: aobe  reason: default package */
/* loaded from: classes.dex */
public final class aobe {
    public final String a;
    public final long b;
    public final int c;

    public aobe() {
    }

    public aobe(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public static aobd a() {
        aobd aobdVar = new aobd();
        aobdVar.b(0L);
        return aobdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aobe) {
            aobe aobeVar = (aobe) obj;
            String str = this.a;
            if (str != null ? str.equals(aobeVar.a) : aobeVar.a == null) {
                if (this.b == aobeVar.b) {
                    int i = this.c;
                    int i2 = aobeVar.c;
                    if (i != 0 ? i == i2 : i2 == 0) {
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
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i3 = this.c;
        if (i3 != 0) {
            i = i3;
        }
        return i2 ^ i;
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        int i = this.c;
        String str2 = i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 81 + str2.length());
        sb.append("TokenResult{token=");
        sb.append(str);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(j);
        sb.append(", responseCode=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
