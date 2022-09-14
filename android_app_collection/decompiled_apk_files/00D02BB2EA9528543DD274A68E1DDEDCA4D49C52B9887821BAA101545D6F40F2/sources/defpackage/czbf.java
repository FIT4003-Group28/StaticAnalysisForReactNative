package defpackage;
/* compiled from: PG */
/* renamed from: czbf  reason: default package */
/* loaded from: classes5.dex */
final class czbf extends czbn {
    private final dcdc<czbm> a;
    private final dcdn<String, cywi> b;
    private final cyes c;

    public czbf(dcdc<czbm> dcdcVar, dcdn<String, cywi> dcdnVar, cyes cyesVar) {
        this.a = dcdcVar;
        this.b = dcdnVar;
        this.c = cyesVar;
    }

    @Override // defpackage.czbn
    public final dcdc<czbm> a() {
        return this.a;
    }

    @Override // defpackage.czbn
    public final dcdn<String, cywi> b() {
        return this.b;
    }

    @Override // defpackage.czbn
    public final cyes c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czbn) {
            czbn czbnVar = (czbn) obj;
            if (dchl.m(this.a, czbnVar.a()) && this.b.equals(czbnVar.b()) && this.c.equals(czbnVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ListPeopleByKnownIdResponse{matches=");
        sb.append(valueOf);
        sb.append(", people=");
        sb.append(valueOf2);
        sb.append(", status=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
