package defpackage;
/* compiled from: PG */
/* renamed from: czfa  reason: default package */
/* loaded from: classes5.dex */
final class czfa extends czew {
    private final cygn a;
    private final czdx b;

    public czfa(cygn cygnVar, @dzsi czdx czdxVar) {
        this.a = cygnVar;
        this.b = czdxVar;
    }

    @Override // defpackage.czew
    public final cygn a() {
        return this.a;
    }

    @Override // defpackage.czew
    @dzsi
    public final czdx b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        czdx czdxVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof czew) {
            czew czewVar = (czew) obj;
            if (this.a.equals(czewVar.a()) && ((czdxVar = this.b) != null ? czdxVar.equals(czewVar.b()) : czewVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        czdx czdxVar = this.b;
        return hashCode ^ (czdxVar == null ? 0 : czdxVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length());
        sb.append("TopNWebResponse{refreshDataResponse=");
        sb.append(valueOf);
        sb.append(", response=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
