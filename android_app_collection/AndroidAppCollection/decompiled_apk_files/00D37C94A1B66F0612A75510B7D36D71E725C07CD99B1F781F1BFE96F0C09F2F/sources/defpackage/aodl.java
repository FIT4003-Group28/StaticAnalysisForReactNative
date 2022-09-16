package defpackage;
/* compiled from: PG */
/* renamed from: aodl  reason: default package */
/* loaded from: classes.dex */
public final class aodl {
    public final String a;
    public final String b;

    public aodl() {
    }

    public aodl(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aodl) {
            aodl aodlVar = (aodl) obj;
            if (this.a.equals(aodlVar.a) && this.b.equals(aodlVar.b)) {
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
        StringBuilder sb = new StringBuilder(str.length() + 38 + str2.length());
        sb.append("LibraryVersion{libraryName=");
        sb.append(str);
        sb.append(", version=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
