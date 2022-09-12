package defpackage;
/* compiled from: PG */
/* renamed from: rkc  reason: default package */
/* loaded from: classes7.dex */
public final class rkc extends rkf {
    public final rkh a;
    public final int b;

    public rkc(@dzsi rkh rkhVar, int i) {
        this.a = rkhVar;
        this.b = i;
    }

    @Override // defpackage.rkf
    @dzsi
    public final rkh a() {
        return this.a;
    }

    @Override // defpackage.rkf
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rkf) {
            rkf rkfVar = (rkf) obj;
            rkh rkhVar = this.a;
            if (rkhVar != null ? rkhVar.equals(rkfVar.a()) : rkfVar.a() == null) {
                if (this.b == rkfVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        rkh rkhVar = this.a;
        return (((rkhVar == null ? 0 : rkhVar.hashCode()) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? "COUNTERFACTUAL" : "NO_VISIBLE_ELEMENT" : "DISABLED" : "VISIBLE";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + str.length());
        sb.append("DisplayEligibility{nudgeBarType=");
        sb.append(valueOf);
        sb.append(", visibility=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
