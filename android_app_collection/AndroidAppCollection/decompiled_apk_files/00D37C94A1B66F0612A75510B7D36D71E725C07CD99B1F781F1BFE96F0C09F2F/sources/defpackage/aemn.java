package defpackage;
/* compiled from: PG */
/* renamed from: aemn  reason: default package */
/* loaded from: classes.dex */
public final class aemn {
    private final String a;
    private final int b;
    private final String c;

    public aemn(String str, int i, String str2) {
        if (str != null) {
            this.a = str;
            this.b = i;
            if (str2 != null) {
                this.c = str2;
                return;
            }
            throw new NullPointerException("Null xtags");
        }
        throw new NullPointerException("Null videoId");
    }

    public static aemn a(String str, int i, String str2) {
        return new aemn(str, i, str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aemn) {
            aemn aemnVar = (aemn) obj;
            if (this.a.equals(aemnVar.a) && this.b == aemnVar.b && this.c.equals(aemnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 45 + str2.length());
        sb.append("FormatKey{videoId=");
        sb.append(str);
        sb.append(", itag=");
        sb.append(i);
        sb.append(", xtags=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public aemn() {
    }
}
