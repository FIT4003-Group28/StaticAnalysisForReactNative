package defpackage;
/* compiled from: PG */
/* renamed from: aobb  reason: default package */
/* loaded from: classes.dex */
public final class aobb {
    public final String a;
    public final String b;
    public final aobe c;
    public final int d;
    private final String e;

    public aobb() {
    }

    public aobb(String str, String str2, String str3, aobe aobeVar, int i) {
        this.e = str;
        this.a = str2;
        this.b = str3;
        this.c = aobeVar;
        this.d = i;
    }

    public static aoba a() {
        return new aoba();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aobb) {
            aobb aobbVar = (aobb) obj;
            String str = this.e;
            if (str != null ? str.equals(aobbVar.e) : aobbVar.e == null) {
                String str2 = this.a;
                if (str2 != null ? str2.equals(aobbVar.a) : aobbVar.a == null) {
                    String str3 = this.b;
                    if (str3 != null ? str3.equals(aobbVar.b) : aobbVar.b == null) {
                        aobe aobeVar = this.c;
                        if (aobeVar != null ? aobeVar.equals(aobbVar.c) : aobbVar.c == null) {
                            int i = this.d;
                            int i2 = aobbVar.d;
                            if (i != 0 ? i == i2 : i2 == 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.e;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.a;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.b;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        aobe aobeVar = this.c;
        int hashCode4 = (hashCode3 ^ (aobeVar == null ? 0 : aobeVar.hashCode())) * 1000003;
        int i2 = this.d;
        if (i2 != 0) {
            i = i2;
        }
        return hashCode4 ^ i;
    }

    public final String toString() {
        String str = this.e;
        String str2 = this.a;
        String str3 = this.b;
        String valueOf = String.valueOf(this.c);
        int i = this.d;
        String str4 = i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK";
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 74 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(valueOf).length() + str4.length());
        sb.append("InstallationResponse{uri=");
        sb.append(str);
        sb.append(", fid=");
        sb.append(str2);
        sb.append(", refreshToken=");
        sb.append(str3);
        sb.append(", authToken=");
        sb.append(valueOf);
        sb.append(", responseCode=");
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }
}
