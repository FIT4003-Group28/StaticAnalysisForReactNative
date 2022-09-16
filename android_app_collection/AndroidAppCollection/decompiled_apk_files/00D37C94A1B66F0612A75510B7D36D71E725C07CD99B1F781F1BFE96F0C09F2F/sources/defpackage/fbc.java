package defpackage;
/* compiled from: PG */
/* renamed from: fbc  reason: default package */
/* loaded from: classes3.dex */
public final class fbc {
    public final String a;
    public final int b;
    public final String c;

    public fbc(String str, int i, String str2) {
        if (str != null) {
            this.a = str;
            this.b = i;
            this.c = str2;
            return;
        }
        throw new NullPointerException("Null entityKey");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fbc) {
            fbc fbcVar = (fbc) obj;
            if (this.a.equals(fbcVar.a) && this.b == fbcVar.b && this.c.equals(fbcVar.c)) {
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
        StringBuilder sb = new StringBuilder(str.length() + 59 + str2.length());
        sb.append("EntityData{entityKey=");
        sb.append(str);
        sb.append(", fieldNumber=");
        sb.append(i);
        sb.append(", contentId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public fbc() {
    }
}
