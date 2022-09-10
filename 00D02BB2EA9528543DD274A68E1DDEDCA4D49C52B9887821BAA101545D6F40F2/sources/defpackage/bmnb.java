package defpackage;
/* compiled from: PG */
/* renamed from: bmnb  reason: default package */
/* loaded from: classes3.dex */
public final class bmnb extends bmoc {
    public final dbsg<dehn<bmnu>> a;
    public final dbsg<bmob> b;

    public bmnb(dbsg<dehn<bmnu>> dbsgVar, dbsg<bmob> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.bmoc
    public final dbsg<dehn<bmnu>> a() {
        return this.a;
    }

    @Override // defpackage.bmoc
    public final dbsg<bmob> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmoc) {
            bmoc bmocVar = (bmoc) obj;
            if (this.a.equals(bmocVar.a()) && this.b.equals(bmocVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69 + String.valueOf(valueOf2).length());
        sb.append("SurveyLocationStatus{locationHistoryStatusFuture=");
        sb.append(valueOf);
        sb.append(", synchronousError=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
