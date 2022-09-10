package defpackage;
/* compiled from: PG */
/* renamed from: qag  reason: default package */
/* loaded from: classes7.dex */
final class qag extends qcg {
    private final String a;
    private final dvvo b;
    private final byee c;

    public qag(String str, dvvo dvvoVar, byee byeeVar) {
        this.a = str;
        this.b = dvvoVar;
        this.c = byeeVar;
    }

    @Override // defpackage.qcg
    public final String a() {
        return this.a;
    }

    @Override // defpackage.qcg
    public final dvvo b() {
        return this.b;
    }

    @Override // defpackage.qcg
    public final byee c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qcg) {
            qcg qcgVar = (qcg) obj;
            if (this.a.equals(qcgVar.a()) && this.b.equals(qcgVar.b()) && this.c.equals(qcgVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dvvo dvvoVar = this.b;
        int i = dvvoVar.bC;
        if (i == 0) {
            i = dsst.a.b(dvvoVar).c(dvvoVar);
            dvvoVar.bC = i;
        }
        return ((hashCode ^ i) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("StartBusynessParams{title=");
        sb.append(str);
        sb.append(", busyness=");
        sb.append(valueOf);
        sb.append(", openHours=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
