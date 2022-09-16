package defpackage;
/* compiled from: PG */
/* renamed from: aftv  reason: default package */
/* loaded from: classes.dex */
public final class aftv {
    public final afuq a;
    public final aqll b;

    public aftv() {
    }

    public aftv(afuq afuqVar, aqll aqllVar) {
        this.a = afuqVar;
        this.b = aqllVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aftv) {
            aftv aftvVar = (aftv) obj;
            if (this.a.equals(aftvVar.a)) {
                aqll aqllVar = this.b;
                aqll aqllVar2 = aftvVar.b;
                if (aqllVar != null ? aqllVar.equals(aqllVar2) : aqllVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        aqll aqllVar = this.b;
        return hashCode ^ (aqllVar == null ? 0 : aqllVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(valueOf2).length());
        sb.append("BatchContext{visitorContext=");
        sb.append(valueOf);
        sb.append(", tier=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
