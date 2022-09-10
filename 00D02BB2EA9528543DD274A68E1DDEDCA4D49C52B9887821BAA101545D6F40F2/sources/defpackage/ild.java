package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ild  reason: default package */
/* loaded from: classes6.dex */
public final class ild extends ilm {
    private final dnwv a;
    private final dnxf b;

    public ild(dnwv dnwvVar, dnxf dnxfVar) {
        if (dnwvVar != null) {
            this.a = dnwvVar;
            if (dnxfVar != null) {
                this.b = dnxfVar;
                return;
            }
            throw new NullPointerException("Null placeActionInternalLink");
        }
        throw new NullPointerException("Null actionType");
    }

    @Override // defpackage.ilm
    public final dnwv a() {
        return this.a;
    }

    @Override // defpackage.ilm
    public final dnxf b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ilm) {
            ilm ilmVar = (ilm) obj;
            if (this.a.equals(ilmVar.a()) && this.b.equals(ilmVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dnxf dnxfVar = this.b;
        int i = dnxfVar.bC;
        if (i == 0) {
            i = dsst.a.b(dnxfVar).c(dnxfVar);
            dnxfVar.bC = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76 + String.valueOf(valueOf2).length());
        sb.append("PlaceActionInternalLinkWithActionType{actionType=");
        sb.append(valueOf);
        sb.append(", placeActionInternalLink=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
