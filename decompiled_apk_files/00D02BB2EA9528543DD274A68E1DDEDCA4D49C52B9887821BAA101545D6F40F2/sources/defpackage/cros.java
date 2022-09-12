package defpackage;
/* compiled from: PG */
/* renamed from: cros  reason: default package */
/* loaded from: classes5.dex */
public final class cros extends crot {
    private final dwaw a;
    private final dwbc b;

    public cros(dwaw dwawVar, dwbc dwbcVar) {
        this.a = dwawVar;
        this.b = dwbcVar;
    }

    @Override // defpackage.crot
    public final dwaw a() {
        return this.a;
    }

    @Override // defpackage.crot
    public final dwbc b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crot) {
            crot crotVar = (crot) obj;
            if (this.a.equals(crotVar.a()) && this.b.equals(crotVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dwaw dwawVar = this.a;
        int i = dwawVar.bC;
        if (i == 0) {
            i = dsst.a.b(dwawVar).c(dwawVar);
            dwawVar.bC = i;
        }
        int i2 = (i ^ 1000003) * 1000003;
        dwbc dwbcVar = this.b;
        int i3 = dwbcVar.bC;
        if (i3 == 0) {
            i3 = dsst.a.b(dwbcVar).c(dwbcVar);
            dwbcVar.bC = i3;
        }
        return i2 ^ i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71 + String.valueOf(valueOf2).length());
        sb.append("NavigationOfflineDirectionsResponseEvent{requestProto=");
        sb.append(valueOf);
        sb.append(", responseProto=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
