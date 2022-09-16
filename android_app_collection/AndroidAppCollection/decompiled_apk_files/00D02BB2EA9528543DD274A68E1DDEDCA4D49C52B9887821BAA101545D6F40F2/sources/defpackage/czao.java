package defpackage;
/* compiled from: PG */
/* renamed from: czao  reason: default package */
/* loaded from: classes5.dex */
final class czao extends czav {
    private final dcdc<czau> a;
    private final cyes b;

    public czao(dcdc<czau> dcdcVar, cyes cyesVar) {
        this.a = dcdcVar;
        this.b = cyesVar;
    }

    @Override // defpackage.czav
    public final dcdc<czau> a() {
        return this.a;
    }

    @Override // defpackage.czav
    public final cyes b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czav) {
            czav czavVar = (czav) obj;
            if (dchl.m(this.a, czavVar.a()) && this.b.equals(czavVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44 + String.valueOf(valueOf2).length());
        sb.append("GetPeopleResponse{personResponses=");
        sb.append(valueOf);
        sb.append(", status=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
