package defpackage;
/* compiled from: PG */
/* renamed from: quk  reason: default package */
/* loaded from: classes7.dex */
public final class quk extends quw {
    public final dndr a;
    public final domy b;

    public quk(dndr dndrVar, domy domyVar) {
        if (dndrVar != null) {
            this.a = dndrVar;
            if (domyVar != null) {
                this.b = domyVar;
                return;
            }
            throw new NullPointerException("Null travelMode");
        }
        throw new NullPointerException("Null destinationType");
    }

    @Override // defpackage.quw
    public final dndr a() {
        return this.a;
    }

    @Override // defpackage.quw
    public final domy b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof quw) {
            quw quwVar = (quw) obj;
            if (this.a.equals(quwVar.a()) && this.b.equals(quwVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(valueOf2).length());
        sb.append("CommuteHubManualDirective{destinationType=");
        sb.append(valueOf);
        sb.append(", travelMode=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
