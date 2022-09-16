package defpackage;
/* compiled from: PG */
/* renamed from: sbu  reason: default package */
/* loaded from: classes7.dex */
final class sbu extends sdv {
    private final sdu a;
    private final dcdc<dbsg<dopk>> b;
    private final int c;

    public sbu(sdu sduVar, int i, dcdc<dbsg<dopk>> dcdcVar) {
        if (sduVar != null) {
            this.a = sduVar;
            this.c = i;
            if (dcdcVar != null) {
                this.b = dcdcVar;
                return;
            }
            throw new NullPointerException("Null transitStations");
        }
        throw new NullPointerException("Null routeType");
    }

    @Override // defpackage.sdv
    public final sdu a() {
        return this.a;
    }

    @Override // defpackage.sdv
    public final dcdc<dbsg<dopk>> b() {
        return this.b;
    }

    @Override // defpackage.sdv
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sdv) {
            sdv sdvVar = (sdv) obj;
            if (this.a.equals(sdvVar.a()) && this.c == sdvVar.c() && dchl.m(this.b, sdvVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String a = qjo.a(this.c);
        String valueOf2 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 72 + a.length() + String.valueOf(valueOf2).length());
        sb.append("MultimodalRouteSetupState{routeType=");
        sb.append(valueOf);
        sb.append(", routeDirection=");
        sb.append(a);
        sb.append(", transitStations=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
