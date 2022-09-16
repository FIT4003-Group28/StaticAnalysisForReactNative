package defpackage;
/* compiled from: PG */
/* renamed from: cvdn  reason: default package */
/* loaded from: classes5.dex */
public final class cvdn extends cvdq {
    private final cuib a;

    public cvdn(cuib cuibVar) {
        this.a = cuibVar;
    }

    @Override // defpackage.cved
    public final cvec b() {
        return cvec.SUGGESTION_LIST;
    }

    @Override // defpackage.cvdq, defpackage.cved
    public final cuib d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cved) {
            cved cvedVar = (cved) obj;
            if (cvec.SUGGESTION_LIST == cvedVar.b() && this.a.equals(cvedVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("MessageListCellViewModel{suggestionList=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
