package defpackage;
/* compiled from: PG */
/* renamed from: acdj  reason: default package */
/* loaded from: classes2.dex */
final class acdj extends acdl {
    public final aced a;
    private final cjql b;

    public acdj(aced acedVar, cjql cjqlVar) {
        if (acedVar != null) {
            this.a = acedVar;
            if (cjqlVar != null) {
                this.b = cjqlVar;
                return;
            }
            throw new NullPointerException("Null loggedImpression");
        }
        throw new NullPointerException("Null cluster");
    }

    @Override // defpackage.acdl
    public final aced a() {
        return this.a;
    }

    @Override // defpackage.acdl
    public final cjql b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acdl) {
            acdl acdlVar = (acdl) obj;
            if (this.a.equals(acdlVar.a()) && this.b.equals(acdlVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("ImpressedCluster{cluster=");
        sb.append(valueOf);
        sb.append(", loggedImpression=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
