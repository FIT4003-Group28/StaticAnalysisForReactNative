package defpackage;
/* compiled from: PG */
/* renamed from: cjrs  reason: default package */
/* loaded from: classes4.dex */
final class cjrs extends cjsu {
    private final dcdc<cjrz> a;
    private final ddhn b;
    private final String c;

    public cjrs(dcdc<cjrz> dcdcVar, ddhn ddhnVar, @dzsi String str) {
        this.a = dcdcVar;
        this.b = ddhnVar;
        this.c = str;
    }

    @Override // defpackage.cjsu
    public final dcdc<cjrz> a() {
        return this.a;
    }

    @Override // defpackage.cjsu
    public final ddhn b() {
        return this.b;
    }

    @Override // defpackage.cjsu
    @dzsi
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjsu) {
            cjsu cjsuVar = (cjsu) obj;
            if (dchl.m(this.a, cjsuVar.a()) && this.b.equals(cjsuVar.b()) && ((str = this.c) != null ? str.equals(cjsuVar.c()) : cjsuVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 62 + String.valueOf(valueOf2).length() + String.valueOf(str).length());
        sb.append("LoggedLocalData{dataElements=");
        sb.append(valueOf);
        sb.append(", requestType=");
        sb.append(valueOf2);
        sb.append(", logicalParentId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
