package defpackage;
/* compiled from: PG */
/* renamed from: crab  reason: default package */
/* loaded from: classes5.dex */
final class crab extends cran {
    private final crlw a;
    private final cqzy b;
    private final cqzx c;

    public crab(@dzsi crlw crlwVar, @dzsi cqzy cqzyVar, @dzsi cqzx cqzxVar) {
        this.a = crlwVar;
        this.b = cqzyVar;
        this.c = cqzxVar;
    }

    @Override // defpackage.cran
    @dzsi
    public final crlw a() {
        return this.a;
    }

    @Override // defpackage.cran
    @dzsi
    public final cqzy b() {
        return this.b;
    }

    @Override // defpackage.cran
    @dzsi
    public final cqzx c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cran) {
            cran cranVar = (cran) obj;
            crlw crlwVar = this.a;
            if (crlwVar != null ? crlwVar.equals(cranVar.a()) : cranVar.a() == null) {
                cqzy cqzyVar = this.b;
                if (cqzyVar != null ? cqzyVar.equals(cranVar.b()) : cranVar.b() == null) {
                    cqzx cqzxVar = this.c;
                    if (cqzxVar != null ? cqzxVar.equals(cranVar.c()) : cranVar.c() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        crlw crlwVar = this.a;
        int i = 0;
        int hashCode = ((crlwVar == null ? 0 : crlwVar.hashCode()) ^ 1000003) * 1000003;
        cqzy cqzyVar = this.b;
        int hashCode2 = (hashCode ^ (cqzyVar == null ? 0 : cqzyVar.hashCode())) * 1000003;
        cqzx cqzxVar = this.c;
        if (cqzxVar != null) {
            i = cqzxVar.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 91 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("OnLocationChangedResponse{guidanceProblemEvent=");
        sb.append(valueOf);
        sb.append(", guidanceEvent=");
        sb.append(valueOf2);
        sb.append(", approachingGuidanceEvent=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
