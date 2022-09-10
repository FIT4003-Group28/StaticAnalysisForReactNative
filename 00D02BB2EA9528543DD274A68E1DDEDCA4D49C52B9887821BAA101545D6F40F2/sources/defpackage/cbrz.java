package defpackage;
/* compiled from: PG */
/* renamed from: cbrz  reason: default package */
/* loaded from: classes4.dex */
public final class cbrz extends cbrx {
    public final cbsj a;
    public final cbsh b;

    public cbrz(cbsh cbshVar, cbsj cbsjVar) {
        this.b = cbshVar;
        this.a = cbsjVar;
    }

    @Override // defpackage.cbrx
    public final cbsj a() {
        return this.a;
    }

    @Override // defpackage.cbrx
    public final cbsh b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbrx) {
            cbrx cbrxVar = (cbrx) obj;
            if (this.b.equals(cbrxVar.b()) && this.a.equals(cbrxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29 + String.valueOf(valueOf2).length());
        sb.append("Actions{placeTopic=");
        sb.append(valueOf);
        sb.append(", review=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
