package defpackage;
/* compiled from: PG */
/* renamed from: ulx  reason: default package */
/* loaded from: classes4.dex */
public final class ulx {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final int h;
    private final boolean i;
    private final String j;

    public ulx() {
    }

    public ulx(boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3, String str5, String str6, int i) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z2;
        this.i = z3;
        this.j = str5;
        this.g = str6;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ulx) {
            ulx ulxVar = (ulx) obj;
            if (this.a == ulxVar.a && ((str = this.b) != null ? str.equals(ulxVar.b) : ulxVar.b == null) && this.c.equals(ulxVar.c) && ((str2 = this.d) != null ? str2.equals(ulxVar.d) : ulxVar.d == null) && ((str3 = this.e) != null ? str3.equals(ulxVar.e) : ulxVar.e == null) && this.f == ulxVar.f && this.i == ulxVar.i && ((str4 = this.j) != null ? str4.equals(ulxVar.j) : ulxVar.j == null) && ((str5 = this.g) != null ? str5.equals(ulxVar.g) : ulxVar.g == null)) {
                int i = this.h;
                int i2 = ulxVar.h;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        String str = this.b;
        int i3 = 0;
        int hashCode = (((i2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode3 = (((hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.i) {
            i = 1231;
        }
        int i4 = (hashCode3 ^ i) * 1000003;
        String str4 = this.j;
        int hashCode4 = (i4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.g;
        if (str5 != null) {
            i3 = str5.hashCode();
        }
        int i5 = this.h;
        ujr.b(i5);
        return ((hashCode4 ^ i3) * 1000003) ^ i5;
    }

    public final String toString() {
        boolean z = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        boolean z2 = this.f;
        boolean z3 = this.i;
        String str5 = this.j;
        String str6 = this.g;
        String a = ujr.a(this.h);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        StringBuilder sb = new StringBuilder(length + 174 + length2 + length3 + length4 + length5 + String.valueOf(str6).length() + a.length());
        sb.append("DeviceOwner{isMetadataAvailable=");
        sb.append(z);
        sb.append(", displayName=");
        sb.append(str);
        sb.append(", accountName=");
        sb.append(str2);
        sb.append(", givenName=");
        sb.append(str3);
        sb.append(", familyName=");
        sb.append(str4);
        sb.append(", isG1User=");
        sb.append(z2);
        sb.append(", isDasherUser=");
        sb.append(z3);
        sb.append(", obfuscatedGaiaId=");
        sb.append(str5);
        sb.append(", avatarUrl=");
        sb.append(str6);
        sb.append(", isUnicornUser=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
