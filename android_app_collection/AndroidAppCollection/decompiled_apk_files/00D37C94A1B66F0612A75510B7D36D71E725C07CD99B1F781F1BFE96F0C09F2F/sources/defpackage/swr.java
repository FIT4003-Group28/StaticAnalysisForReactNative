package defpackage;
/* compiled from: PG */
/* renamed from: swr  reason: default package */
/* loaded from: classes4.dex */
public final class swr {
    public final tbq a;
    public final aodt b;

    public swr() {
    }

    public swr(aodt aodtVar, tbq tbqVar) {
        this.b = aodtVar;
        this.a = tbqVar;
    }

    public static swr a(aodt aodtVar, tbq tbqVar) {
        return new swr(aodtVar, tbqVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof swr) {
            swr swrVar = (swr) obj;
            if (this.b.equals(swrVar.b)) {
                tbq tbqVar = this.a;
                tbq tbqVar2 = swrVar.a;
                if (tbqVar != null ? tbqVar.equals(tbqVar2) : tbqVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        tbq tbqVar = this.a;
        return hashCode ^ (tbqVar == null ? 0 : tbqVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40 + String.valueOf(valueOf2).length());
        sb.append("ResolvedElement{element=");
        sb.append(valueOf);
        sb.append(", debuggerInfo=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
