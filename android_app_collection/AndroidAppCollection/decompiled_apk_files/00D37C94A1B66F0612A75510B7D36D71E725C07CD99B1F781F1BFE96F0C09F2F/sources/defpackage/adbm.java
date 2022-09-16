package defpackage;
/* compiled from: PG */
/* renamed from: adbm  reason: default package */
/* loaded from: classes.dex */
final class adbm {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public adbm() {
    }

    public adbm(String str, String str2, String str3) {
        this.d = 3;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static adbm a(String str, String str2, String str3) {
        aqxo.y(true);
        return new adbm(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof adbm) {
            adbm adbmVar = (adbm) obj;
            if (this.d == adbmVar.d && ((str = this.a) != null ? str.equals(adbmVar.a) : adbmVar.a == null) && ((str2 = this.b) != null ? str2.equals(adbmVar.b) : adbmVar.b == null)) {
                String str3 = this.c;
                String str4 = adbmVar.c;
                if (str3 != null ? str3.equals(str4) : str4 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.d ^ 1000003) * 1000003;
        String str = this.a;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 ^ i2;
    }

    public final String toString() {
        String num = Integer.toString(this.d - 1);
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int length = String.valueOf(num).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 73 + length2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("MdxDeviceInfo{connectionType=");
        sb.append(num);
        sb.append(", manufacturer=");
        sb.append(str);
        sb.append(", modelName=");
        sb.append(str2);
        sb.append(", deviceVersion=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
