package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: auia  reason: default package */
/* loaded from: classes.dex */
public final class auia extends auik {
    private final ddos a;
    private final dkpi b;

    public auia(ddos ddosVar, dkpi dkpiVar) {
        if (ddosVar != null) {
            this.a = ddosVar;
            if (dkpiVar != null) {
                this.b = dkpiVar;
                return;
            }
            throw new NullPointerException("Null backoffParameters");
        }
        throw new NullPointerException("Null backoffType");
    }

    @Override // defpackage.auik
    public final ddos a() {
        return this.a;
    }

    @Override // defpackage.auik
    public final dkpi b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof auik) {
            auik auikVar = (auik) obj;
            if (this.a.equals(auikVar.a()) && this.b.equals(auikVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dkpi dkpiVar = this.b;
        int i = dkpiVar.bC;
        if (i == 0) {
            i = dsst.a.b(dkpiVar).c(dkpiVar);
            dkpiVar.bC = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("BackoffInfo{backoffType=");
        sb.append(valueOf);
        sb.append(", backoffParameters=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
