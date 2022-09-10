package defpackage;
/* compiled from: PG */
/* renamed from: qum  reason: default package */
/* loaded from: classes7.dex */
public final class qum extends quy {
    public final domy a;
    private final qjn b;

    public qum(qjn qjnVar, domy domyVar) {
        if (qjnVar != null) {
            this.b = qjnVar;
            if (domyVar != null) {
                this.a = domyVar;
                return;
            }
            throw new NullPointerException("Null travelMode");
        }
        throw new NullPointerException("Null homeWorkResult");
    }

    @Override // defpackage.quy
    public final qjn a() {
        return this.b;
    }

    @Override // defpackage.quy
    public final domy b() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("CommuteHubState{homeWorkResult=");
        sb.append(valueOf);
        sb.append(", travelMode=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
