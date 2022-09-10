package defpackage;
/* compiled from: PG */
/* renamed from: bmne  reason: default package */
/* loaded from: classes3.dex */
public final class bmne extends bmnu {
    private final dbsg<dehn<bmny>> a;
    private final dbsg<bmnt> b;

    public bmne(dbsg<dehn<bmny>> dbsgVar, dbsg<bmnt> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.bmnu
    public final dbsg<dehn<bmny>> a() {
        return this.a;
    }

    @Override // defpackage.bmnu
    public final dbsg<bmnt> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmnu) {
            bmnu bmnuVar = (bmnu) obj;
            if (this.a.equals(bmnuVar.a()) && this.b.equals(bmnuVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 75 + String.valueOf(valueOf2).length());
        sb.append("LocationHistoryStatus{locationSettingsStatusFuture=");
        sb.append(valueOf);
        sb.append(", locationHistoryError=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
