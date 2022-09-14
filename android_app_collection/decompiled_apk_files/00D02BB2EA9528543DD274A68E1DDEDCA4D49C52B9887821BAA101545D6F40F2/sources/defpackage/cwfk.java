package defpackage;
/* compiled from: PG */
/* renamed from: cwfk  reason: default package */
/* loaded from: classes5.dex */
final class cwfk extends cwfm {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final String g;
    private final String h;
    private final int i;

    public cwfk(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = str5;
        this.h = str6;
        this.i = i;
    }

    @Override // defpackage.cwfm
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cwfm
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cwfm
    public final String c() {
        return this.c;
    }

    @Override // defpackage.cwfm
    public final String d() {
        return this.d;
    }

    @Override // defpackage.cwfm
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwfm) {
            cwfm cwfmVar = (cwfm) obj;
            String str5 = this.a;
            if (str5 != null ? str5.equals(cwfmVar.a()) : cwfmVar.a() == null) {
                if (this.b.equals(cwfmVar.b()) && ((str = this.c) != null ? str.equals(cwfmVar.c()) : cwfmVar.c() == null) && ((str2 = this.d) != null ? str2.equals(cwfmVar.d()) : cwfmVar.d() == null) && this.e == cwfmVar.e() && this.f == cwfmVar.f() && ((str3 = this.g) != null ? str3.equals(cwfmVar.g()) : cwfmVar.g() == null) && ((str4 = this.h) != null ? str4.equals(cwfmVar.h()) : cwfmVar.h() == null)) {
                    int i = this.i;
                    int i2 = cwfmVar.i();
                    if (i == 0) {
                        throw null;
                    }
                    if (i == i2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cwfm
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.cwfm
    public final String g() {
        return this.g;
    }

    @Override // defpackage.cwfm
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str2 = this.c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int i2 = 1237;
        int hashCode3 = (((hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i2 = 1231;
        }
        int i3 = (hashCode3 ^ i2) * 1000003;
        String str4 = this.g;
        int hashCode4 = (i3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.h;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((hashCode4 ^ i) * 1000003) ^ cvuf.b(this.i);
    }

    @Override // defpackage.cwfm
    public final int i() {
        return this.i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        String str5 = this.g;
        String str6 = this.h;
        String a = cvuf.a(this.i);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        StringBuilder sb = new StringBuilder(length + 147 + length2 + length3 + length4 + length5 + String.valueOf(str6).length() + String.valueOf(a).length());
        sb.append("DeviceOwner{displayName=");
        sb.append(str);
        sb.append(", accountName=");
        sb.append(str2);
        sb.append(", givenName=");
        sb.append(str3);
        sb.append(", familyName=");
        sb.append(str4);
        sb.append(", isG1User=");
        sb.append(z);
        sb.append(", isDasherUser=");
        sb.append(z2);
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
