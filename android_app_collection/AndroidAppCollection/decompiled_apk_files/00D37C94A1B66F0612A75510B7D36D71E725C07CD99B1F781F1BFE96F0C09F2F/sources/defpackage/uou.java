package defpackage;
/* compiled from: PG */
/* renamed from: uou  reason: default package */
/* loaded from: classes4.dex */
public final class uou {
    public final String a;
    public final String b;
    public final boolean c;
    private final String d;
    private final String e;

    public uou(String str, String str2, String str3, String str4, boolean z) {
        if (str != null) {
            this.d = str;
            if (str2 != null) {
                this.a = str2;
                this.b = str3;
                this.e = str4;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null accountName");
        }
        throw new NullPointerException("Null accountIdentifier");
    }

    public static uou a(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        str = ((ulx) obj).c;
        str2 = ((ulx) obj).c;
        str3 = ((ulx) obj).b;
        str4 = ((ulx) obj).g;
        return new uou(str, str2, str3, str4, ((ulx) obj).a);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uou) {
            uou uouVar = (uou) obj;
            if (this.d.equals(uouVar.d) && this.a.equals(uouVar.a) && ((str = this.b) != null ? str.equals(uouVar.b) : uouVar.b == null) && ((str2 = this.e) != null ? str2.equals(uouVar.e) : uouVar.e == null) && this.c == uouVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = 1231;
        int i3 = (((hashCode2 ^ i) * 1000003) ^ 1231) * 1000003;
        if (true != this.c) {
            i2 = 1237;
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.a;
        String str3 = this.b;
        String str4 = this.e;
        boolean z = this.c;
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 137 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("OneGoogleAvatarImageLoaderKey{accountIdentifier=");
        sb.append(str);
        sb.append(", accountName=");
        sb.append(str2);
        sb.append(", displayName=");
        sb.append(str3);
        sb.append(", avatarUrl=");
        sb.append(str4);
        sb.append(", isGaiaAccount=true, isMetadataAvailable=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public uou() {
    }
}
