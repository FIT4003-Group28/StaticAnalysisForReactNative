package defpackage;
/* compiled from: PG */
/* renamed from: tps  reason: default package */
/* loaded from: classes4.dex */
public final class tps {
    public final tpw a;
    private final ampq b;

    public tps() {
    }

    public tps(tpw tpwVar, ampq ampqVar) {
        this.a = tpwVar;
        this.b = ampqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tps) {
            tps tpsVar = (tps) obj;
            if (this.a.equals(tpsVar.a) && this.b.equals(tpsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
        sb.append("AddFileGroupRequest{dataFileGroup=");
        sb.append(valueOf);
        sb.append(", accountOptional=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
