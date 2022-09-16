package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qhh  reason: default package */
/* loaded from: classes7.dex */
public final class qhh extends qhs {
    private final dowb a;
    private final int b;

    public qhh(dowb dowbVar, int i) {
        if (dowbVar != null) {
            this.a = dowbVar;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null remainingDistance");
    }

    @Override // defpackage.qhs
    public final dowb a() {
        return this.a;
    }

    @Override // defpackage.qhs
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qhs) {
            qhs qhsVar = (qhs) obj;
            if (this.a.equals(qhsVar.a()) && this.b == qhsVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dowb dowbVar = this.a;
        int i = dowbVar.bC;
        if (i == 0) {
            i = dsst.a.b(dowbVar).c(dowbVar);
            dowbVar.bC = i;
        }
        return this.b ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("BatteryInfo{remainingDistance=");
        sb.append(valueOf);
        sb.append(", percentage=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
