package defpackage;
/* compiled from: PG */
/* renamed from: bneb  reason: default package */
/* loaded from: classes3.dex */
public final class bneb extends bnec {
    private final dbsg<eapr> a;
    private final dbsg<eapr> b;

    public bneb(dbsg<eapr> dbsgVar, dbsg<eapr> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.bnec
    public final dbsg<eapr> a() {
        return this.a;
    }

    @Override // defpackage.bnec
    public final dbsg<eapr> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bnec) {
            bnec bnecVar = (bnec) obj;
            if (this.a.equals(bnecVar.a()) && this.b.equals(bnecVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length());
        sb.append("Visit{merchantTabVisit=");
        sb.append(valueOf);
        sb.append(", userTabVisit=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
