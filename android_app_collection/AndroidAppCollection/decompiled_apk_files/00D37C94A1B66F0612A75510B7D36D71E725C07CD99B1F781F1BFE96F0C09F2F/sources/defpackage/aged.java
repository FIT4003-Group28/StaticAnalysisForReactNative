package defpackage;
/* compiled from: PG */
/* renamed from: aged  reason: default package */
/* loaded from: classes.dex */
public final class aged {
    public final String a;
    public final int b;
    public final String c;

    public aged(String str, int i, String str2) {
        if (str != null) {
            this.a = str;
            this.b = i;
            if (str2 != null) {
                this.c = str2;
                return;
            }
            throw new NullPointerException("Null clientId");
        }
        throw new NullPointerException("Null tag");
    }

    public static aged a(String str, int i) {
        return new aged(str, i, "");
    }

    public static aged b(String str, int i, String str2) {
        return new aged(str, i, str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aged) {
            aged agedVar = (aged) obj;
            if (this.a.equals(agedVar.a) && this.b == agedVar.b && this.c.equals(agedVar.c)) {
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
        StringBuilder sb = new StringBuilder(str.length() + 48 + str2.length());
        sb.append("NotificationTag{tag=");
        sb.append(str);
        sb.append(", id=");
        sb.append(i);
        sb.append(", clientId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public aged() {
    }
}
