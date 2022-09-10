package defpackage;
/* compiled from: PG */
/* renamed from: bpaj  reason: default package */
/* loaded from: classes3.dex */
final class bpaj extends bpbq {
    private final dbsg<dodb> a;
    private final ilo b;

    public bpaj(dbsg<dodb> dbsgVar, ilo iloVar) {
        if (dbsgVar != null) {
            this.a = dbsgVar;
            if (iloVar != null) {
                this.b = iloVar;
                return;
            }
            throw new NullPointerException("Null selectedSegment");
        }
        throw new NullPointerException("Null parentRoute");
    }

    @Override // defpackage.bpbq
    public final dbsg<dodb> a() {
        return this.a;
    }

    @Override // defpackage.bpbq
    public final ilo b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bpbq) {
            bpbq bpbqVar = (bpbq) obj;
            if (this.a.equals(bpbqVar.a()) && this.b.equals(bpbqVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(valueOf2).length());
        sb.append("SwitchParentRouteResult{parentRoute=");
        sb.append(valueOf);
        sb.append(", selectedSegment=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
