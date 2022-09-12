package defpackage;
/* compiled from: PG */
/* renamed from: cldo  reason: default package */
/* loaded from: classes5.dex */
public final class cldo extends cldz {
    private final cldy a;
    private final cldd b;

    public cldo(cldy cldyVar, cldd clddVar) {
        this.a = cldyVar;
        this.b = clddVar;
    }

    @Override // defpackage.cldz
    public final cldy a() {
        return this.a;
    }

    @Override // defpackage.cldz
    public final cldd b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cldz) {
            cldz cldzVar = (cldz) obj;
            cldy cldyVar = this.a;
            if (cldyVar != null ? cldyVar.equals(cldzVar.a()) : cldzVar.a() == null) {
                cldd clddVar = this.b;
                if (clddVar != null ? clddVar.equals(cldzVar.b()) : cldzVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        cldy cldyVar = this.a;
        int i = 0;
        int hashCode = ((cldyVar == null ? 0 : cldyVar.hashCode()) ^ 1000003) * 1000003;
        cldd clddVar = this.b;
        if (clddVar != null) {
            i = clddVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(valueOf2).length());
        sb.append("ClientInfo{clientType=");
        sb.append(valueOf);
        sb.append(", androidClientInfo=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
