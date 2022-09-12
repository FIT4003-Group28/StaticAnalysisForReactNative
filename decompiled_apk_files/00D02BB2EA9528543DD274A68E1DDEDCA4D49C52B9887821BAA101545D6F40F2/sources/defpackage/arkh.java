package defpackage;
/* compiled from: PG */
/* renamed from: arkh  reason: default package */
/* loaded from: classes2.dex */
final class arkh extends arkf {
    private final amub a;
    private final qcx b;

    public arkh(@dzsi amub amubVar, @dzsi qcx qcxVar) {
        this.a = amubVar;
        this.b = qcxVar;
    }

    @Override // defpackage.arkf
    @dzsi
    public final amub a() {
        return this.a;
    }

    @Override // defpackage.arkf
    @dzsi
    public final qcx b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof arkf) {
            arkf arkfVar = (arkf) obj;
            amub amubVar = this.a;
            if (amubVar != null ? amubVar.equals(arkfVar.a()) : arkfVar.a() == null) {
                qcx qcxVar = this.b;
                if (qcxVar != null ? qcxVar.equals(arkfVar.b()) : arkfVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        amub amubVar = this.a;
        int i = 0;
        int hashCode = ((amubVar == null ? 0 : amubVar.hashCode()) ^ 1000003) * 1000003;
        qcx qcxVar = this.b;
        if (qcxVar != null) {
            i = qcxVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65 + String.valueOf(valueOf2).length());
        sb.append("ArWalkingLauncherParams{routeDescription=");
        sb.append(valueOf);
        sb.append(", startDirectionParams=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
