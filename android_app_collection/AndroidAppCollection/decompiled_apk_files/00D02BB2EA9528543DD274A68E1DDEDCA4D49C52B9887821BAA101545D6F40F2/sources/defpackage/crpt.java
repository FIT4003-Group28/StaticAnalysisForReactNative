package defpackage;
/* compiled from: PG */
/* renamed from: crpt  reason: default package */
/* loaded from: classes5.dex */
public final class crpt extends crqa {
    public final crqg a;
    public final amuh b;
    public final dpfh c;

    public crpt(crqg crqgVar, amuh amuhVar, @dzsi dpfh dpfhVar) {
        this.a = crqgVar;
        this.b = amuhVar;
        this.c = dpfhVar;
    }

    @Override // defpackage.crqa
    public final crqg a() {
        return this.a;
    }

    @Override // defpackage.crqa
    public final amuh b() {
        return this.b;
    }

    @Override // defpackage.crqa
    @dzsi
    public final dpfh c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        dpfh dpfhVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof crqa) {
            crqa crqaVar = (crqa) obj;
            if (this.a.equals(crqaVar.a()) && this.b.equals(crqaVar.b()) && ((dpfhVar = this.c) != null ? dpfhVar.equals(crqaVar.c()) : crqaVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        dpfh dpfhVar = this.c;
        if (dpfhVar == null) {
            i = 0;
        } else {
            int i2 = dpfhVar.bC;
            if (i2 == 0) {
                i2 = dsst.a.b(dpfhVar).c(dpfhVar);
                dpfhVar.bC = i2;
            }
            i = i2;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 77 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DestinationState{implicitDestinationState=");
        sb.append(valueOf);
        sb.append(", routeList=");
        sb.append(valueOf2);
        sb.append(", trafficReportPrompt=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
