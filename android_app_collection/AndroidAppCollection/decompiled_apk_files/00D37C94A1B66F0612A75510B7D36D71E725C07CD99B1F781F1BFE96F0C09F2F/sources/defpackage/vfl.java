package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: vfl  reason: default package */
/* loaded from: classes4.dex */
public final class vfl {
    public final String a;
    private final List b;

    public vfl(String str, List list) {
        if (str != null) {
            this.a = str;
            this.b = list;
            return;
        }
        throw new NullPointerException("Null query");
    }

    public final String[] a() {
        return (String[]) this.b.toArray(new String[0]);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vfl) {
            vfl vflVar = (vfl) obj;
            if (this.a.equals(vflVar.a) && this.b.equals(vflVar.b)) {
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
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 27 + String.valueOf(valueOf).length());
        sb.append("SafeSql{query=");
        sb.append(str);
        sb.append(", queryArgs=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public vfl() {
    }
}
