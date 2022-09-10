package defpackage;
/* compiled from: PG */
/* renamed from: wvn  reason: default package */
/* loaded from: classes7.dex */
final class wvn extends wvy {
    private final drhj a;
    private final drhn b;

    public wvn(drhj drhjVar, drhn drhnVar) {
        this.a = drhjVar;
        this.b = drhnVar;
    }

    @Override // defpackage.wvy
    public final drhj a() {
        return this.a;
    }

    @Override // defpackage.wvy
    public final drhn b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wvy) {
            wvy wvyVar = (wvy) obj;
            drhj drhjVar = this.a;
            if (drhjVar != null ? drhjVar.equals(wvyVar.a()) : wvyVar.a() == null) {
                drhn drhnVar = this.b;
                if (drhnVar != null ? drhnVar.equals(wvyVar.b()) : wvyVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69 + String.valueOf(valueOf2).length());
        sb.append("TripAttributesCurrentState{idBeingReported=");
        sb.append(valueOf);
        sb.append(", attributeBeingReported=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        drhj drhjVar = this.a;
        int i2 = 0;
        if (drhjVar == null) {
            i = 0;
        } else {
            i = drhjVar.bC;
            if (i == 0) {
                i = dsst.a.b(drhjVar).c(drhjVar);
                drhjVar.bC = i;
            }
        }
        int i3 = (i ^ 1000003) * 1000003;
        drhn drhnVar = this.b;
        if (drhnVar != null && (i2 = drhnVar.bC) == 0) {
            i2 = dsst.a.b(drhnVar).c(drhnVar);
            drhnVar.bC = i2;
        }
        return i3 ^ i2;
    }
}
