package defpackage;
/* compiled from: PG */
/* renamed from: uqc  reason: default package */
/* loaded from: classes4.dex */
public final class uqc {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final int j;
    private final String k;
    private final int l;

    public uqc() {
    }

    public uqc(String str, boolean z, String str2, String str3, String str4, String str5, boolean z2, boolean z3, int i, String str6, String str7, int i2) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z2;
        this.h = z3;
        this.j = i;
        this.i = str6;
        this.k = str7;
        this.l = i2;
    }

    public static uqa a() {
        uqa uqaVar = new uqa();
        uqaVar.d(false);
        uqaVar.c(false);
        uqaVar.e(true);
        uqaVar.h = 1;
        uqaVar.g = 1;
        return uqaVar;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqc) {
            uqc uqcVar = (uqc) obj;
            if (this.a.equals(uqcVar.a) && this.b == uqcVar.b && ((str = this.c) != null ? str.equals(uqcVar.c) : uqcVar.c == null) && ((str2 = this.d) != null ? str2.equals(uqcVar.d) : uqcVar.d == null) && ((str3 = this.e) != null ? str3.equals(uqcVar.e) : uqcVar.e == null) && ((str4 = this.f) != null ? str4.equals(uqcVar.f) : uqcVar.f == null) && this.g == uqcVar.g && this.h == uqcVar.h) {
                int i = this.j;
                int i2 = uqcVar.j;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && ((str5 = this.i) != null ? str5.equals(uqcVar.i) : uqcVar.i == null) && ((str6 = this.k) != null ? str6.equals(uqcVar.k) : uqcVar.k == null)) {
                    int i3 = this.l;
                    int i4 = uqcVar.l;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        String str = this.c;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        int hashCode5 = (((hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        if (true == this.h) {
            i = 1231;
        }
        int i3 = (hashCode5 ^ i) * 1000003;
        int i4 = this.j;
        if (i4 != 0) {
            int i5 = (i3 ^ i4) * 1000003;
            String str5 = this.i;
            int hashCode6 = (i5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
            String str6 = this.k;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            int i6 = (hashCode6 ^ i2) * 1000003;
            int i7 = this.l;
            if (i7 == 0) {
                throw null;
            }
            return i6 ^ i7;
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        String a = uqb.a(this.j);
        String str6 = this.i;
        String str7 = this.k;
        int i = this.l;
        String str8 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "TWENTY_ONE_OR_OLDER" : "EIGHTEEN_TO_TWENTY" : "LESS_THAN_EIGHTEEN" : "UNKNOWN";
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 204 + length2 + length3 + String.valueOf(str4).length() + String.valueOf(str5).length() + a.length() + String.valueOf(str6).length() + String.valueOf(str7).length() + str8.length());
        sb.append("GoogleOwner{accountName=");
        sb.append(str);
        sb.append(", isMetadataAvailable=");
        sb.append(z);
        sb.append(", displayName=");
        sb.append(str2);
        sb.append(", givenName=");
        sb.append(str3);
        sb.append(", familyName=");
        sb.append(str4);
        sb.append(", obfuscatedGaiaId=");
        sb.append(str5);
        sb.append(", isG1User=");
        sb.append(z2);
        sb.append(", isDasherUser=");
        sb.append(z3);
        sb.append(", isUnicornUser=");
        sb.append(a);
        sb.append(", avatarUrl=");
        sb.append(str6);
        sb.append(", defaultAvatarUrl=");
        sb.append(str7);
        sb.append(", ageRange=");
        sb.append(str8);
        sb.append("}");
        return sb.toString();
    }
}
