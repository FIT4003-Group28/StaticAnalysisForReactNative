package defpackage;
/* compiled from: PG */
/* renamed from: ctyh  reason: default package */
/* loaded from: classes5.dex */
final class ctyh extends ctyj {
    private final dbsg<Integer> a;
    private final dbsg<Integer> b;

    public ctyh(dbsg<Integer> dbsgVar, dbsg<Integer> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.ctyj
    public final dbsg<Integer> a() {
        return this.a;
    }

    @Override // defpackage.ctyj
    public final dbsg<Integer> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctyj) {
            ctyj ctyjVar = (ctyj) obj;
            if (this.a.equals(ctyjVar.a()) && this.b.equals(ctyjVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70 + String.valueOf(valueOf2).length());
        sb.append("LighterMessageTypeDetail{intendedRenderingType=");
        sb.append(valueOf);
        sb.append(", actualRenderingType=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
