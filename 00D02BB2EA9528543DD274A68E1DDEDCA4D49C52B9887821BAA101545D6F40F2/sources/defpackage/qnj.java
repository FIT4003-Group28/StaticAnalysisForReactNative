package defpackage;
/* compiled from: PG */
/* renamed from: qnj  reason: default package */
/* loaded from: classes7.dex */
final class qnj extends qpf {
    private final qnf a;
    private final qop b;
    private final int c;

    public qnj(int i, qnf qnfVar, qop qopVar) {
        if (i != 0) {
            this.c = i;
            this.a = qnfVar;
            this.b = qopVar;
            return;
        }
        throw new NullPointerException("Null tabType");
    }

    @Override // defpackage.qpf
    public final qnf a() {
        return this.a;
    }

    @Override // defpackage.qpf
    public final qop b() {
        return this.b;
    }

    @Override // defpackage.qpf
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qpf) {
            qpf qpfVar = (qpf) obj;
            if (this.c == qpfVar.c() && this.a.equals(qpfVar.a()) && this.b.equals(qpfVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "MORE_ROUTES" : "FROM_HERE" : "PREFERRED" : "SELECTED" : "UNKNOWN";
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 57 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("TabHolder{tabType=");
        sb.append(str);
        sb.append(", tabViewModel=");
        sb.append(valueOf);
        sb.append(", contentPageViewModel=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
