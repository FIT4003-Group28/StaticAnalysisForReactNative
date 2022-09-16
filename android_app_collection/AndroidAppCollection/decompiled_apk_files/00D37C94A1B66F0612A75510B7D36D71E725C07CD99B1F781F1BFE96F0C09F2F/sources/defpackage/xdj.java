package defpackage;
/* compiled from: PG */
/* renamed from: xdj  reason: default package */
/* loaded from: classes4.dex */
public final class xdj {
    public final apcf a;
    public final int b;
    public final amuk c;

    public xdj(apcf apcfVar, int i, amuk amukVar) {
        this.a = apcfVar;
        this.b = i;
        if (amukVar != null) {
            this.c = amukVar;
            return;
        }
        throw new NullPointerException("Null dispatchedPings");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xdj) {
            xdj xdjVar = (xdj) obj;
            if (this.a.equals(xdjVar.a) && this.b == xdjVar.b && amxp.v(this.c, xdjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 78 + String.valueOf(valueOf2).length());
        sb.append("PingDispatchLoggingData{triggerType=");
        sb.append(valueOf);
        sb.append(", pingCount=");
        sb.append(i);
        sb.append(", dispatchedPings=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public xdj() {
    }
}
