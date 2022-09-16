package defpackage;
/* compiled from: PG */
/* renamed from: aenu  reason: default package */
/* loaded from: classes.dex */
public final class aenu {
    public final String a;
    public final String b;

    public aenu(String str) {
        this.a = "oroid";
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null value");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aenu) {
            aenu aenuVar = (aenu) obj;
            if (this.a.equals(aenuVar.a) && this.b.equals(aenuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 33 + str2.length());
        sb.append("GenericKeyValuePair{key=");
        sb.append(str);
        sb.append(", value=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public aenu() {
    }
}
