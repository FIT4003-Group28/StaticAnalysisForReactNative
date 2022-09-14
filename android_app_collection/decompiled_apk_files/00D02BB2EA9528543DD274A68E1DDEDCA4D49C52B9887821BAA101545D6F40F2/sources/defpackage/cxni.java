package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cxni  reason: default package */
/* loaded from: classes5.dex */
public final class cxni extends cxnj {
    public final String a;
    private final List<String> b;

    public cxni(String str, List<String> list) {
        if (str != null) {
            this.a = str;
            this.b = list;
            return;
        }
        throw new NullPointerException("Null query");
    }

    @Override // defpackage.cxnj
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cxnj
    public final List<String> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxnj) {
            cxnj cxnjVar = (cxnj) obj;
            if (this.a.equals(cxnjVar.a()) && this.b.equals(cxnjVar.b())) {
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
}
