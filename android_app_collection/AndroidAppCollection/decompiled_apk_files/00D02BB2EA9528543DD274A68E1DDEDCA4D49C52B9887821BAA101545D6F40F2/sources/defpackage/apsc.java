package defpackage;
/* compiled from: PG */
/* renamed from: apsc  reason: default package */
/* loaded from: classes2.dex */
public final class apsc extends apsg {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public apsc(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.apsg
    public final String a() {
        return this.a;
    }

    @Override // defpackage.apsg
    public final String b() {
        return this.b;
    }

    @Override // defpackage.apsg
    public final String c() {
        return this.c;
    }

    @Override // defpackage.apsg
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apsg) {
            apsg apsgVar = (apsg) obj;
            if (this.a.equals(apsgVar.a()) && this.b.equals(apsgVar.b()) && this.c.equals(apsgVar.c()) && this.d.equals(apsgVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 90 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("BusinessListingData{listingId=");
        sb.append(str);
        sb.append(", businessName=");
        sb.append(str2);
        sb.append(", businessAddress=");
        sb.append(str3);
        sb.append(", businessProfileImageUrl=");
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }
}
