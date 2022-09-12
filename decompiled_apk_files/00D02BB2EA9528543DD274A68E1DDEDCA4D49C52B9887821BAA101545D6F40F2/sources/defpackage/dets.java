package defpackage;
/* compiled from: PG */
/* renamed from: dets  reason: default package */
/* loaded from: classes6.dex */
final class dets extends dety {
    private final String a;
    private final long b;
    private final int c;

    public dets(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.dety
    public final String a() {
        return this.a;
    }

    @Override // defpackage.dety
    public final long b() {
        return this.b;
    }

    @Override // defpackage.dety
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dety) {
            dety detyVar = (dety) obj;
            String str = this.a;
            if (str != null ? str.equals(detyVar.a()) : detyVar.a() == null) {
                if (this.b == detyVar.b() && ((i = this.c) != 0 ? i == detyVar.c() : detyVar.c() == 0)) {
                    return true;
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
