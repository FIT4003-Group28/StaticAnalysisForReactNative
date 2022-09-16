package defpackage;
/* compiled from: PG */
/* renamed from: hqz  reason: default package */
/* loaded from: classes3.dex */
final class hqz {
    public final String a;
    public final String b;
    public final String c;

    public hqz(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = str3;
                return;
            }
            throw new NullPointerException("Null codePoint");
        }
        throw new NullPointerException("Null string");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hqz) {
            hqz hqzVar = (hqz) obj;
            if (this.a.equals(hqzVar.a) && this.b.equals(hqzVar.b)) {
                String str = this.c;
                String str2 = hqzVar.c;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 54 + str2.length() + String.valueOf(str3).length());
        sb.append("EmojiDescriptor{string=");
        sb.append(str);
        sb.append(", codePoint=");
        sb.append(str2);
        sb.append(", parentCodePoint=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }

    public hqz() {
    }
}
