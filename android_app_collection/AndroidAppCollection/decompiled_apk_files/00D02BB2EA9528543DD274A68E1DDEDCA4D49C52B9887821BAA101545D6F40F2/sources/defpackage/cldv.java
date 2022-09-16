package defpackage;
/* compiled from: PG */
/* renamed from: cldv  reason: default package */
/* loaded from: classes5.dex */
public final class cldv extends clei {
    private final cleh a;
    private final cleg b;

    public cldv(cleh clehVar, cleg clegVar) {
        this.a = clehVar;
        this.b = clegVar;
    }

    @Override // defpackage.clei
    public final cleh a() {
        return this.a;
    }

    @Override // defpackage.clei
    public final cleg b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clei) {
            clei cleiVar = (clei) obj;
            cleh clehVar = this.a;
            if (clehVar != null ? clehVar.equals(cleiVar.a()) : cleiVar.a() == null) {
                cleg clegVar = this.b;
                if (clegVar != null ? clegVar.equals(cleiVar.b()) : cleiVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        cleh clehVar = this.a;
        int i = 0;
        int hashCode = ((clehVar == null ? 0 : clehVar.hashCode()) ^ 1000003) * 1000003;
        cleg clegVar = this.b;
        if (clegVar != null) {
            i = clegVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(valueOf2).length());
        sb.append("NetworkConnectionInfo{networkType=");
        sb.append(valueOf);
        sb.append(", mobileSubtype=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
