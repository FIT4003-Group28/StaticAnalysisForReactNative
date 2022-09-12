package defpackage;
/* compiled from: PG */
/* renamed from: qun  reason: default package */
/* loaded from: classes7.dex */
public final class qun extends qvb {
    public final quy a;
    public final dndr b;

    public qun(@dzsi quy quyVar, @dzsi dndr dndrVar) {
        this.a = quyVar;
        this.b = dndrVar;
    }

    @Override // defpackage.qvb
    @dzsi
    public final quy a() {
        return this.a;
    }

    @Override // defpackage.qvb
    @dzsi
    public final dndr b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qvb) {
            qvb qvbVar = (qvb) obj;
            quy quyVar = this.a;
            if (quyVar != null ? quyVar.equals(qvbVar.a()) : qvbVar.a() == null) {
                dndr dndrVar = this.b;
                if (dndrVar != null ? dndrVar.equals(qvbVar.b()) : qvbVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        quy quyVar = this.a;
        int i = 0;
        int hashCode = ((quyVar == null ? 0 : quyVar.hashCode()) ^ 1000003) * 1000003;
        dndr dndrVar = this.b;
        if (dndrVar != null) {
            i = dndrVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("NudgeBarState{commuteHubState=");
        sb.append(valueOf);
        sb.append(", destination=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
