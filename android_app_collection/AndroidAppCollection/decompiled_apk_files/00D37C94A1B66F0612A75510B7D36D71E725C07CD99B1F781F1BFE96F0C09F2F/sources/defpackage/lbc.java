package defpackage;
/* compiled from: PG */
/* renamed from: lbc  reason: default package */
/* loaded from: classes3.dex */
public final class lbc {
    public final boolean a;
    public final String b;
    public final abcg c;
    public final apzg d;
    public final ascj e;
    public final asbv f;
    public final String g;

    public lbc() {
    }

    public lbc(boolean z, String str, abcg abcgVar, apzg apzgVar, ascj ascjVar, asbv asbvVar, String str2) {
        this.a = z;
        this.b = str;
        this.c = abcgVar;
        this.d = apzgVar;
        this.e = ascjVar;
        this.f = asbvVar;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        apzg apzgVar;
        ascj ascjVar;
        asbv asbvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lbc) {
            lbc lbcVar = (lbc) obj;
            if (this.a == lbcVar.a && this.b.equals(lbcVar.b) && this.c.equals(lbcVar.c) && ((apzgVar = this.d) != null ? apzgVar.equals(lbcVar.d) : lbcVar.d == null) && ((ascjVar = this.e) != null ? ascjVar.equals(lbcVar.e) : lbcVar.e == null) && ((asbvVar = this.f) != null ? asbvVar.equals(lbcVar.f) : lbcVar.f == null)) {
                String str = this.g;
                String str2 = lbcVar.g;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        apzg apzgVar = this.d;
        int i = 0;
        int hashCode2 = (hashCode ^ (apzgVar == null ? 0 : apzgVar.hashCode())) * 1000003;
        ascj ascjVar = this.e;
        int hashCode3 = (hashCode2 ^ (ascjVar == null ? 0 : ascjVar.hashCode())) * 1000003;
        asbv asbvVar = this.f;
        int hashCode4 = (hashCode3 ^ (asbvVar == null ? 0 : asbvVar.hashCode())) * 1000003;
        String str = this.g;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String str2 = this.g;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 141 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(str2).length());
        sb.append("SearchServiceRequestBuilder{isPrefetch=");
        sb.append(z);
        sb.append(", query=");
        sb.append(str);
        sb.append(", searchService=");
        sb.append(valueOf);
        sb.append(", navigationEndpoint=");
        sb.append(valueOf2);
        sb.append(", searchboxStats=");
        sb.append(valueOf3);
        sb.append(", searchFormData=");
        sb.append(valueOf4);
        sb.append(", currentVideoId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
