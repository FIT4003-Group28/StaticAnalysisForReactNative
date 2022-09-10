package defpackage;
/* compiled from: PG */
/* renamed from: udi  reason: default package */
/* loaded from: classes7.dex */
final class udi extends udj {
    private final dbsg<Integer> a;
    private final dbsg<amvh> b;
    private final int c;

    public udi(dbsg<Integer> dbsgVar, dbsg<amvh> dbsgVar2, int i) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = i;
    }

    @Override // defpackage.udj
    public final dbsg<Integer> a() {
        return this.a;
    }

    @Override // defpackage.udj
    public final dbsg<amvh> b() {
        return this.b;
    }

    @Override // defpackage.udj
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof udj) {
            udj udjVar = (udj) obj;
            if (this.a.equals(udjVar.a()) && this.b.equals(udjVar.b()) && this.c == udjVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        String str = i != 1 ? i != 2 ? "SUCCESS_WITH_MULTIPLE_RESULTS" : "SUCCESS_WITH_SINGLE_RESULT" : "FAILED_OR_NO_RESULT";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 86 + String.valueOf(valueOf2).length() + str.length());
        sb.append("DirectionsSearchResult{searchTargetWaypointIndex=");
        sb.append(valueOf);
        sb.append(", waypoint=");
        sb.append(valueOf2);
        sb.append(", directionsSearchStatus=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
