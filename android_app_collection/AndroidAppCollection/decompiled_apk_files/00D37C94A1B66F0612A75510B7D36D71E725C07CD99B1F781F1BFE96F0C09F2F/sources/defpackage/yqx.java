package defpackage;
/* compiled from: PG */
/* renamed from: yqx  reason: default package */
/* loaded from: classes4.dex */
public final class yqx {
    public final yqj a;
    public final afxz b;

    public yqx(yqj yqjVar, afxz afxzVar) {
        if (yqjVar != null) {
            this.a = yqjVar;
            this.b = afxzVar;
            return;
        }
        throw new NullPointerException("Null httpClientConfig");
    }

    public static yqx a(yqj yqjVar, afxz afxzVar) {
        return new yqx(yqjVar, afxzVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yqx) {
            yqx yqxVar = (yqx) obj;
            if (this.a.equals(yqxVar.a)) {
                afxz afxzVar = this.b;
                afxz afxzVar2 = yqxVar.b;
                if (afxzVar != null ? afxzVar.equals(afxzVar2) : afxzVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        afxz afxzVar = this.b;
        return (hashCode ^ (afxzVar == null ? 0 : afxzVar.hashCode())) * (-721379959);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 87 + length2 + "null".length() + "null".length());
        sb.append("VolleyNetworkConfig{httpClientConfig=");
        sb.append(valueOf);
        sb.append(", networkLogger=");
        sb.append(valueOf2);
        sb.append(", interceptor=");
        sb.append("null");
        sb.append(", responseModifier=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }

    public yqx() {
    }
}
