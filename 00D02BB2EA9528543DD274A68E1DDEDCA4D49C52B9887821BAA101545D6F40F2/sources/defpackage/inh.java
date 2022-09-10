package defpackage;
/* compiled from: PG */
/* renamed from: inh  reason: default package */
/* loaded from: classes6.dex */
public final class inh extends inx {
    public final dcdc<Integer> a;
    public final dcdc<Integer> b;

    public inh(dcdc<Integer> dcdcVar, dcdc<Integer> dcdcVar2) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            if (dcdcVar2 != null) {
                this.b = dcdcVar2;
                return;
            }
            throw new NullPointerException("Null calloutIndices");
        }
        throw new NullPointerException("Null highlightedIndices");
    }

    @Override // defpackage.inx
    public final dcdc<Integer> a() {
        return this.a;
    }

    @Override // defpackage.inx
    public final dcdc<Integer> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof inx) {
            inx inxVar = (inx) obj;
            if (dchl.m(this.a, inxVar.a()) && dchl.m(this.b, inxVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60 + String.valueOf(valueOf2).length());
        sb.append("MapMarkersPresentation{highlightedIndices=");
        sb.append(valueOf);
        sb.append(", calloutIndices=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
