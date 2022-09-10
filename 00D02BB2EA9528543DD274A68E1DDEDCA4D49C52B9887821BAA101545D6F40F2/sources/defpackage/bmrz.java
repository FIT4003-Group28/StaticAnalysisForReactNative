package defpackage;
/* compiled from: PG */
/* renamed from: bmrz  reason: default package */
/* loaded from: classes3.dex */
final class bmrz extends bmsj {
    private final dbsg<bmsi> a;
    private final dbsg<bmsm> b;

    public bmrz(dbsg<bmsi> dbsgVar, dbsg<bmsm> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.bmsj
    public final dbsg<bmsi> a() {
        return this.a;
    }

    @Override // defpackage.bmsj
    public final dbsg<bmsm> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmsj) {
            bmsj bmsjVar = (bmsj) obj;
            if (this.a.equals(bmsjVar.a()) && this.b.equals(bmsjVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length());
        sb.append("AccountStatus{accountError=");
        sb.append(valueOf);
        sb.append(", editStatus=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
