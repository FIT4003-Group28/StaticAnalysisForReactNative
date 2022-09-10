package defpackage;
/* compiled from: PG */
/* renamed from: cyzd  reason: default package */
/* loaded from: classes5.dex */
final class cyzd extends cyzo {
    private final cyes a;
    private final dcdc<cyzl> b;

    public cyzd(cyes cyesVar, dcdc<cyzl> dcdcVar) {
        this.a = cyesVar;
        this.b = dcdcVar;
    }

    @Override // defpackage.cyzo
    public final cyes a() {
        return this.a;
    }

    @Override // defpackage.cyzo
    public final dcdc<cyzl> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyzo) {
            cyzo cyzoVar = (cyzo) obj;
            if (this.a.equals(cyzoVar.a()) && dchl.m(this.b, cyzoVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37 + String.valueOf(valueOf2).length());
        sb.append("DeviceContactsResult{status=");
        sb.append(valueOf);
        sb.append(", items=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
