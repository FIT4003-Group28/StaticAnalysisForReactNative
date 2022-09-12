package defpackage;
/* compiled from: PG */
/* renamed from: xkt  reason: default package */
/* loaded from: classes7.dex */
final class xkt extends xme {
    public final dbsi<akrn, akrn> a;
    public final int b;

    public xkt(@dzsi dbsi<akrn, akrn> dbsiVar, int i) {
        this.a = dbsiVar;
        this.b = i;
    }

    @Override // defpackage.xme
    @dzsi
    public final dbsi<akrn, akrn> a() {
        return this.a;
    }

    @Override // defpackage.xme
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xme) {
            xme xmeVar = (xme) obj;
            dbsi<akrn, akrn> dbsiVar = this.a;
            if (dbsiVar != null ? dbsiVar.equals(xmeVar.a()) : xmeVar.a() == null) {
                if (this.b == xmeVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        dbsi<akrn, akrn> dbsiVar = this.a;
        return (((dbsiVar == null ? 0 : dbsiVar.hashCode()) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? "UNSNAPPED_BECAUSE_BACKWARDS" : "UNSNAPPED_BECAUSE_TOO_FAR" : "UNSNAPPED_BECAUSE_NO_POLYLINE" : "SNAPPED";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66 + str.length());
        sb.append("VehicleSnappingResult{currentAndNextPositions=");
        sb.append(valueOf);
        sb.append(", snappingMetadata=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
