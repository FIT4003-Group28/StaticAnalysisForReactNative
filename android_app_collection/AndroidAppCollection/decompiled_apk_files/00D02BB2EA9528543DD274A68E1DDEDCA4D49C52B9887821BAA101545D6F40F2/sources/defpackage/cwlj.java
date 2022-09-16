package defpackage;
/* compiled from: PG */
/* renamed from: cwlj  reason: default package */
/* loaded from: classes5.dex */
final class cwlj extends cwls {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private final String h;
    private final int i;
    private final int j;

    public cwlj(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, int i, String str6, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
        this.j = i;
        this.h = str6;
        this.i = i2;
    }

    @Override // defpackage.cwls
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cwls
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cwls
    public final String c() {
        return this.c;
    }

    @Override // defpackage.cwls
    public final String d() {
        return this.d;
    }

    @Override // defpackage.cwls
    public final String e() {
        return this.e;
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
        if (obj instanceof cwls) {
            cwls cwlsVar = (cwls) obj;
            if (this.a.equals(cwlsVar.a()) && ((str = this.b) != null ? str.equals(cwlsVar.b()) : cwlsVar.b() == null) && ((str2 = this.c) != null ? str2.equals(cwlsVar.c()) : cwlsVar.c() == null) && ((str3 = this.d) != null ? str3.equals(cwlsVar.d()) : cwlsVar.d() == null) && ((str4 = this.e) != null ? str4.equals(cwlsVar.e()) : cwlsVar.e() == null) && this.f == cwlsVar.f() && this.g == cwlsVar.g()) {
                int i = this.j;
                int j = cwlsVar.j();
                if (i == 0) {
                    throw null;
                }
                if (i == j && ((str5 = this.h) != null ? str5.equals(cwlsVar.h()) : cwlsVar.h() == null)) {
                    int i2 = this.i;
                    int i3 = cwlsVar.i();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i2 == i3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cwls
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.cwls
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.cwls
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int i2 = 1237;
        int hashCode5 = (((hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.g) {
            i2 = 1231;
        }
        int i3 = (hashCode5 ^ i2) * 1000003;
        int i4 = this.j;
        if (i4 != 0) {
            int i5 = (i3 ^ i4) * 1000003;
            String str5 = this.h;
            if (str5 != null) {
                i = str5.hashCode();
            }
            int i6 = (i5 ^ i) * 1000003;
            int i7 = this.i;
            if (i7 == 0) {
                throw null;
            }
            return i6 ^ i7;
        }
        throw null;
    }

    @Override // defpackage.cwls
    public final int i() {
        return this.i;
    }

    @Override // defpackage.cwls
    public final int j() {
        return this.j;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        boolean z = this.f;
        boolean z2 = this.g;
        String a = cwlr.a(this.j);
        String str6 = this.h;
        int i = this.i;
        String str7 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "TWENTY_ONE_OR_OLDER" : "EIGHTEEN_TO_TWENTY" : "LESS_THAN_EIGHTEEN" : "UNKNOWN";
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 158 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(a).length() + String.valueOf(str6).length() + str7.length());
        sb.append("GoogleOwner{accountName=");
        sb.append(str);
        sb.append(", displayName=");
        sb.append(str2);
        sb.append(", givenName=");
        sb.append(str3);
        sb.append(", familyName=");
        sb.append(str4);
        sb.append(", obfuscatedGaiaId=");
        sb.append(str5);
        sb.append(", isG1User=");
        sb.append(z);
        sb.append(", isDasherUser=");
        sb.append(z2);
        sb.append(", isUnicornUser=");
        sb.append(a);
        sb.append(", avatarUrl=");
        sb.append(str6);
        sb.append(", ageRange=");
        sb.append(str7);
        sb.append("}");
        return sb.toString();
    }
}
