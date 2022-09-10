package defpackage;
/* compiled from: PG */
/* renamed from: qbh  reason: default package */
/* loaded from: classes7.dex */
public final class qbh extends qeh {
    private final amvh a;
    private final qbn b;
    private final amvi c;

    public qbh(amvh amvhVar, @dzsi qbn qbnVar, amvi amviVar) {
        if (amvhVar != null) {
            this.a = amvhVar;
            this.b = qbnVar;
            if (amviVar != null) {
                this.c = amviVar;
                return;
            }
            throw new NullPointerException("Null waypointAction");
        }
        throw new NullPointerException("Null waypoint");
    }

    @Override // defpackage.qeh
    public final amvh a() {
        return this.a;
    }

    @Override // defpackage.qeh
    @dzsi
    public final qbn b() {
        return this.b;
    }

    @Override // defpackage.qeh
    public final amvi c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        qbn qbnVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qeh) {
            qeh qehVar = (qeh) obj;
            if (this.a.equals(qehVar.a()) && ((qbnVar = this.b) != null ? qbnVar.equals(qehVar.b()) : qehVar.b() == null) && this.c.equals(qehVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        qbn qbnVar = this.b;
        return ((hashCode ^ (qbnVar == null ? 0 : qbnVar.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 68 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("WaypointSearchResult{waypoint=");
        sb.append(valueOf);
        sb.append(", directionsFetcher=");
        sb.append(valueOf2);
        sb.append(", waypointAction=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
