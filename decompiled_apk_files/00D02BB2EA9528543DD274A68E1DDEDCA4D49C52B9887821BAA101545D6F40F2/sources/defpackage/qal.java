package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qal  reason: default package */
/* loaded from: classes7.dex */
public final class qal extends qcn {
    private final dcdc<dpce> a;
    private final dspd b;
    private final int c;

    public qal(dcdc<dpce> dcdcVar, @dzsi dspd dspdVar, int i) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            this.b = dspdVar;
            if (i != 0) {
                this.c = i;
                return;
            }
            throw new NullPointerException("Null routeTokenRouteType");
        }
        throw new NullPointerException("Null routeSummary");
    }

    @Override // defpackage.qcn
    public final dcdc<dpce> a() {
        return this.a;
    }

    @Override // defpackage.qcn
    @dzsi
    public final dspd b() {
        return this.b;
    }

    @Override // defpackage.qcn
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        dspd dspdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qcn) {
            qcn qcnVar = (qcn) obj;
            if (dchl.m(this.a, qcnVar.a()) && ((dspdVar = this.b) != null ? dspdVar.equals(qcnVar.b()) : qcnVar.b() == null) && this.c == qcnVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dspd dspdVar = this.b;
        return ((hashCode ^ (dspdVar == null ? 0 : dspdVar.hashCode())) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        switch (this.c) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "PREFERRED";
                break;
            case 3:
                str = "ALTERNATE_USER_SELECTED";
                break;
            case 4:
                str = "ALTERNATE_GOOGLE_SELECTED";
                break;
            case 5:
                str = "OTHER_USER_SELECTED";
                break;
            case 6:
                str = "OTHER_GOOGLE_SELECTED";
                break;
            default:
                str = "LAZY_GOOGLE_CHOOSE";
                break;
        }
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(valueOf2).length() + str.length());
        sb.append("RouteMetadata{routeSummary=");
        sb.append(valueOf);
        sb.append(", routeToken=");
        sb.append(valueOf2);
        sb.append(", routeTokenRouteType=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
